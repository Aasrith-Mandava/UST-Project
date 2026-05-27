// Generated from CSUTLDTC.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_CSUTLDTC.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * CSUTLDTC (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: CSUTLDTC.cbl
 */
public class Csutldtc {

    /** WS-DATE-TO-TEST (uuid:cbc3fc8e-664e-1964-28ec-28c285e29b74, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateToTest;

    /** Vstring-length (uuid:f3905b1c-64c6-0a44-385b-dbadcb69f705, level 2, PIC S9(4) BINARY). */
    public int /* PIC S9(4) signed */ vstringLength;

    /** Vstring-text (uuid:bfd47c8f-c23e-d5ed-402a-7e6d5a78a184, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ vstringText;

    /** Vstring-char (uuid:42af63c6-60de-7325-236e-c4603ec0726b, level 3, PIC X). */
    public String vstringChar;

    /** WS-DATE-FORMAT (uuid:3469c9b6-34c4-fd33-6f68-d22f4302c233, level 1, PIC X(08)). */
    public String wsDateFormat;

    /** Vstring-length (uuid:26cc9e23-98f9-cc05-c53d-822e9da08a62, level 2, PIC S9(4) BINARY). */
    public int /* PIC S9(4) signed */ vstringLength;

    /** Vstring-text (uuid:be56d9ad-87ab-b14d-16a7-aa46054f2387, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ vstringText;

    /** Vstring-char (uuid:f0ee5dab-00ba-da93-b9e8-81c64e0c215c, level 3, PIC X). */
    public String vstringChar;

    /** OUTPUT-LILLIAN (uuid:b9c1bbb8-06e7-f33d-b093-2ce098b288fc, level 1, PIC S9(9) BINARY). */
    public int /* PIC S9(9) signed */ outputLillian;

    /** WS-MESSAGE (uuid:097a85b9-9741-eb01-9c8e-04949d484170, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsMessage;

    /** WS-SEVERITY (uuid:4ce3f3a6-a267-f67a-b6a6-902d69287ee9, level 2, PIC X(04).). */
    public String wsSeverity;

    /** WS-SEVERITY-N (uuid:ec8d9bcb-3f8b-e015-9edf-0d69b3dd78a4, level 2, PIC 9(4).). */
    public int /* PIC 9(4). */ wsSeverityN;

    /** WS-MSG-NO (uuid:077ff31d-fbf6-b52c-b5a1-5537e36bffda, level 2, PIC X(04).). */
    public String wsMsgNo;

    /** WS-MSG-NO-N (uuid:0a84128a-8d7f-ee15-9f95-54431b142e56, level 2, PIC 9(4).). */
    public int /* PIC 9(4). */ wsMsgNoN;

    /** WS-RESULT (uuid:a61667f9-75e0-28e6-0c68-0a7c02cec300, level 2, PIC X(15).). */
    public String wsResult;

    /** WS-DATE (uuid:1d1a8bd2-ed66-7f94-7f42-5b0cd881ee2b, level 2, PIC X(10)). */
    public String wsDate;

    /** WS-DATE-FMT (uuid:1261c288-16e7-603d-78f9-f2a602bf984f, level 2, PIC X(10).). */
    public String wsDateFmt;

    /** FEEDBACK-CODE (uuid:18b5871f-7315-05da-d4b9-3878f7e5bd5b, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ feedbackCode;

    /** FEEDBACK-TOKEN-VALUE (uuid:11102736-acd2-7ed3-76e0-89f6cf0bf7f9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ feedbackTokenValue;

    /** CASE-1-CONDITION-ID (uuid:65e150c3-2ba7-0a8f-0808-064ee99b2ea7, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ case1ConditionId;

    /** SEVERITY (uuid:c39294b7-d2d7-2323-e6dd-758bd22cd02a, level 4, PIC S9(4) BINARY). */
    public int /* PIC S9(4) signed */ severity;

    /** MSG-NO (uuid:7aababf1-7cd2-b704-811c-ee693d18b4bb, level 4, PIC S9(4) BINARY). */
    public int /* PIC S9(4) signed */ msgNo;

    /** CASE-2-CONDITION-ID (uuid:280ffc3a-00ea-3fa7-c1c1-405abac91346, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ case2ConditionId;

    /** CLASS-CODE (uuid:8201fc4c-579b-3f40-856c-760e15cb5ca3, level 4, PIC S9(4) BINARY). */
    public int /* PIC S9(4) signed */ classCode;

    /** CAUSE-CODE (uuid:4cf5d861-9fd8-559c-8ed5-c8a6fb90d604, level 4, PIC S9(4) BINARY). */
    public int /* PIC S9(4) signed */ causeCode;

    /** CASE-SEV-CTL (uuid:d6465e1b-8fb9-5a3f-c0af-75e5a8c8b094, level 3, PIC X.). */
    public String caseSevCtl;

    /** FACILITY-ID (uuid:34fa6d79-9ab9-9ed6-e059-bceb1d02cae1, level 3, PIC XXX.). */
    public String facilityId;

    /** I-S-INFO (uuid:23cf0b84-7880-0354-5c78-5bb528241e43, level 2, PIC S9(9) BINARY). */
    public int /* PIC S9(9) signed */ iSInfo;

    /** A000-MAIN  (uuid:ad19fe60-1563-2ba8-b70a-ce36808222c3, source lines 103-151). */
    public void a000Main() {
        // MOVE LENGTH OF LS-DATE TO VSTRING-LENGTH OF WS-DATE-TO-TEST  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LS-DATE TO VSTRING-TEXT OF WS-DATE-TO-TEST, WS-DATE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LENGTH OF LS-DATE-FORMAT TO VSTRING-LENGTH OF WS-DATE-FORMAT  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LS-DATE-FORMAT TO VSTRING-TEXT OF WS-DATE-FORMAT, WS-DATE-FMT  -- identifier MOVE; needs PIC-aware type coercion
        this.outputLillian = 0;
        // CALL CEEDAYS() — see external program CEEDAYS
        // MOVE WS-DATE-TO-TEST TO WS-DATE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE SEVERITY OF FEEDBACK-CODE TO WS-SEVERITY-N  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE MSG-NO OF FEEDBACK-CODE TO WS-MSG-NO-N  -- identifier MOVE; needs PIC-aware type coercion
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
    }

    /** A000-MAIN-EXIT  (uuid:e4f522e7-d7f4-216c-6ec9-ba103295c4f7, source lines 152-154). */
    public void a000MainExit() {
        // COBOL [EXIT]: EXIT
    }

    public static void main(String[] args) {
        new Csutldtc().mainPara();
    }

    // --- stubs for unresolved mainframe primitives (placeholders) ---
    static final class Cics {
        static void link(String program) { /* TODO: dispatch */ }
        static void xctl(String program) { /* TODO: transfer */ }
    }
    static final class Vsam {
        static void read(String file) { /* TODO */ }
        static void write(String file) { /* TODO */ }
        static void rewrite(String file) { /* TODO */ }
        static void delete(String file) { /* TODO */ }
        static void startbr(String file) { /* TODO */ }
        static void readnext(String file) { /* TODO */ }
        static void readprev(String file) { /* TODO */ }
        static void endbr(String file) { /* TODO */ }
    }
}
