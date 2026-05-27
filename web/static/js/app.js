// CardDemo Pipeline UI - shared utilities

const API = ''; // same origin

async function jget(path) {
  const r = await fetch(API + path);
  if (!r.ok) throw new Error(`${path} -> ${r.status}`);
  return r.json();
}

function el(tag, props = {}, children = []) {
  const e = document.createElement(tag);
  for (const [k, v] of Object.entries(props)) {
    if (k === 'class') e.className = v;
    else if (k === 'html') e.innerHTML = v;
    else if (k.startsWith('on') && typeof v === 'function') e.addEventListener(k.slice(2).toLowerCase(), v);
    else e.setAttribute(k, v);
  }
  for (const c of [].concat(children)) {
    if (c == null) continue;
    e.appendChild(typeof c === 'string' ? document.createTextNode(c) : c);
  }
  return e;
}

function pill(text, kind = '') { return el('span', { class: 'pill ' + kind }, text); }

function uuidEl(uuid) {
  if (!uuid) return el('span', { class: 'dim' }, '—');
  const short = uuid.slice(0, 8);
  const e = el('span', { class: 'uuid', title: uuid }, short + '…');
  e.addEventListener('click', () => lookupUuid(uuid));
  return e;
}

async function lookupUuid(uuid) {
  try {
    const node = await jget('/node/' + uuid);
    showToast(`
      <div><strong>${escapeHtml(node.kind)}</strong> ${node.name ? '· ' + escapeHtml(node.name) : ''}</div>
      <div class="mono dim">${escapeHtml(node.file || '')}${node.start_line ? ':' + node.start_line : ''}</div>
      <div class="uuid">${uuid}</div>
    `);
  } catch (e) {
    showToast(`<div class="dim">UUID not found: <span class="uuid">${uuid}</span></div>`);
  }
}

let toastTimer = null;
function showToast(html) {
  let t = document.querySelector('.toast');
  if (!t) {
    t = el('div', { class: 'toast' });
    document.body.appendChild(t);
  }
  t.innerHTML = html;
  clearTimeout(toastTimer);
  toastTimer = setTimeout(() => t.remove(), 6000);
}

function escapeHtml(s) {
  return (s || '').toString()
    .replaceAll('&', '&amp;')
    .replaceAll('<', '&lt;')
    .replaceAll('>', '&gt;')
    .replaceAll('"', '&quot;');
}

// Tabs
function initTabs(root = document) {
  root.querySelectorAll('.tabs').forEach(group => {
    const tabs = group.querySelectorAll('.tab');
    tabs.forEach(t => t.addEventListener('click', () => {
      const target = t.dataset.tab;
      tabs.forEach(x => x.classList.toggle('active', x === t));
      document.querySelectorAll('.tab-content').forEach(c => {
        c.classList.toggle('active', c.dataset.tab === target);
      });
    }));
  });
}

document.addEventListener('DOMContentLoaded', () => initTabs());

// Render UUIDs in markdown LLM output as clickable
function linkifyUuids(text) {
  return text.replace(/\buuid:([0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})/gi,
    (m, uuid) => `<a class="uuid" onclick="lookupUuid('${uuid}'); return false;" href="#" title="${uuid}">uuid:${uuid.slice(0,8)}…</a>`);
}

window.cd = { jget, el, pill, uuidEl, lookupUuid, showToast, escapeHtml, linkifyUuids };
