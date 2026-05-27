package com.carddemo.ast;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Base AST node. All artifacts in the pipeline trace back to one of these.
 *
 * Rule 2: every node carries a stable UUID derived from (file, kind, line, col).
 * Rule 3: cross-references between artifacts use UUIDs, never names.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Node {
    public UUID uuid;
    public String kind;
    public String file;
    public int startLine;
    public int endLine;
    public int startCol;
    public int endCol;
    public UUID parentUuid;
    public List<UUID> childrenUuids = new ArrayList<>();
    public Map<String, Object> payload = new LinkedHashMap<>();

    public Node() {}

    public Node(UUID uuid, String kind, String file, int startLine, int endLine, int startCol, int endCol) {
        this.uuid = uuid;
        this.kind = kind;
        this.file = file;
        this.startLine = startLine;
        this.endLine = endLine;
        this.startCol = startCol;
        this.endCol = endCol;
    }

    public Node put(String key, Object value) {
        payload.put(key, value);
        return this;
    }

    public Node addChild(UUID childUuid) {
        childrenUuids.add(childUuid);
        return this;
    }
}
