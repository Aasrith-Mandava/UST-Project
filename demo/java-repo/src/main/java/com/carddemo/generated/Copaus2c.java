// Generated from COPAUS2C.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COPAUS2C.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * COPAUS2C (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: COPAUS2C.cbl
 */
public class Copaus2c {

    /** WS-VARIABLES (uuid:633456c1-7984-2904-33bb-9e16128a9a35, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsVariables;

    /** WS-PGMNAME (uuid:9678fc17-aa59-8e51-d9bb-36b16c495259, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsPgmname;

    /** WS-LENGTH (uuid:9cae726d-c15a-ff69-c2a4-6a808f42c46f, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsLength;

    /** WS-AUTH-TIME (uuid:cb0ba60e-b9e6-fb70-e20f-0006f538772f, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsAuthTime;

    /** WS-AUTH-TIME-AN (uuid:2f1da4dd-3058-5abb-5e36-dd97251018f9, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsAuthTimeAn;

    /** WS-AUTH-TS (uuid:b9a44824-edd3-5138-f9ef-fd8e8a1e2d8f, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsAuthTs;

    /** WS-AUTH-YY (uuid:16bda278-c4e0-fc44-c917-58cac73e2173, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsAuthYy;

    /** WS-AUTH-MM (uuid:4fe6f2e9-0bcb-ea9a-b725-809cb1d41743, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsAuthMm;

    /** WS-AUTH-DD (uuid:fa548e00-5af4-7c12-8939-6bafe2e55785, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsAuthDd;

    /** WS-AUTH-HH (uuid:10a6ef74-b10a-c6bd-721c-d99ec24c1a2b, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsAuthHh;

    /** WS-AUTH-MI (uuid:cf226dc1-7ed8-2dce-81cc-9343aadee6dd, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsAuthMi;

    /** WS-AUTH-SS (uuid:7ab6b8aa-b0bc-77cb-18e4-787067b61dd0, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsAuthSs;

    /** WS-AUTH-SSS (uuid:2e34a6b3-4cbd-eda5-63ed-f14839e51086, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsAuthSss;

    /** WS-ERR-FLG (uuid:20e77e11-8469-a93c-d142-0428614182f9, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsErrFlg;

    /** WS-SQLCODE (uuid:2f67be45-00a0-9618-0c44-f50bc747b47e, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsSqlcode;

    /** WS-SQLSTATE (uuid:52d6fd32-84e3-50c6-7f6d-5b14e984c0b2, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsSqlstate;

    /** WS-ABS-TIME (uuid:49435592-4b33-2d06-696f-2fb72d019593, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsAbsTime;

    /** WS-CUR-DATE (uuid:611602a5-e426-f16b-720c-de02b19203f4, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurDate;


    // --- auto-generated stubs for undeclared references ---
    public Object sqlcode;  // auto-stub for undeclared reference

    /** MAIN-PARA  (uuid:d7177728-0355-172a-f8f6-4f8b09065dae, source lines 95-226). */
    public void mainPara() {
        // MOVE WS-CUR-DATE TO PA-FRAUD-RPT-DATE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-AUTH-ORIG-DATE(1:2) TO WS-AUTH-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-AUTH-ORIG-DATE(3:2) TO WS-AUTH-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-AUTH-ORIG-DATE(5:2) TO WS-AUTH-DD  -- identifier MOVE; needs PIC-aware type coercion
        // COMPUTE (needs PIC-aware expression translation): COMPUTE WS-AUTH-TIME = 999999999 - PA-AUTH-TIME-9C;
        // MOVE WS-AUTH-TIME-AN(1:2) TO WS-AUTH-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-AUTH-TIME-AN(3:2) TO WS-AUTH-MI  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-AUTH-TIME-AN(5:2) TO WS-AUTH-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-AUTH-TIME-AN(7:3) TO WS-AUTH-SSS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-CARD-NUM TO CARD-NUM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-AUTH-TS TO AUTH-TS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-AUTH-TYPE TO AUTH-TYPE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-CARD-EXPIRY-DATE TO CARD-EXPIRY-DATE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-MESSAGE-TYPE TO MESSAGE-TYPE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-MESSAGE-SOURCE TO MESSAGE-SOURCE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-AUTH-ID-CODE TO AUTH-ID-CODE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-AUTH-RESP-CODE TO AUTH-RESP-CODE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-AUTH-RESP-REASON TO AUTH-RESP-REASON  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-PROCESSING-CODE TO PROCESSING-CODE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-TRANSACTION-AMT TO TRANSACTION-AMT  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-APPROVED-AMT TO APPROVED-AMT  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-MERCHANT-CATAGORY-CODE TO MERCHANT-CATAGORY-CODE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-ACQR-COUNTRY-CODE TO ACQR-COUNTRY-CODE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-POS-ENTRY-MODE TO POS-ENTRY-MODE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-MERCHANT-ID TO MERCHANT-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LENGTH OF PA-MERCHANT-NAME TO MERCHANT-NAME-LEN  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-MERCHANT-NAME TO MERCHANT-NAME-TEXT  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-MERCHANT-CITY TO MERCHANT-CITY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-MERCHANT-STATE TO MERCHANT-STATE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-MERCHANT-ZIP TO MERCHANT-ZIP  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-TRANSACTION-ID TO TRANSACTION-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE PA-MATCH-STATUS TO MATCH-STATUS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-FRD-ACTION TO AUTH-FRAUD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-ACCT-ID TO ACCT-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CUST-ID TO CUST-ID  -- identifier MOVE; needs PIC-aware type coercion
        if (java.util.Objects.equals(this.sqlcode, 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */)) {
            // TODO: translate body for: SQLCODE = ZERO
        }
    }

    /** FRAUD-UPDATE  (uuid:57231da2-f10d-cf10-0de5-671fa6872722, source lines 227-250). */
    public void fraudUpdate() {
        if (java.util.Objects.equals(this.sqlcode, 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */)) {
            // TODO: translate body for: SQLCODE = ZERO
        }
    }

    public static void main(String[] args) {
        new Copaus2c().mainPara();
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
