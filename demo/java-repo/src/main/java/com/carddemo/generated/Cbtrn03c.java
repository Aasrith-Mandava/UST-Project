// Generated from CBTRN03C.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_CBTRN03C.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * CBTRN03C (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: CBTRN03C.cbl
 */
public class Cbtrn03c {

    /** TRAN-RECORD (uuid:dfd5d6cf-5f03-197a-f5f8-03b13e2f3e3a, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tranRecord;

    /** TRAN-ID (uuid:85e598b8-8ee6-1dfe-6f59-6892665d26a0, level 5, PIC X(16).). */
    public String tranId;

    /** TRAN-TYPE-CD (uuid:0d0c3d99-ba6c-c1ff-7f48-be08a4e51c6f, level 5, PIC X(02).). */
    public String tranTypeCd;

    /** TRAN-CAT-CD (uuid:623b5d82-3203-26f2-3a9d-99e7fd8e11d3, level 5, PIC 9(04).). */
    public int /* PIC 9(04). */ tranCatCd;

    /** TRAN-SOURCE (uuid:c2a4ed73-e46a-1dce-5e44-a041c146016f, level 5, PIC X(10).). */
    public String tranSource;

    /** TRAN-DESC (uuid:6b62ce18-d4e5-901c-37df-27c465b4c606, level 5, PIC X(100).). */
    public String tranDesc;

    /** TRAN-AMT (uuid:89149d60-f7d2-6ab3-8400-aa962e37bbc9, level 5, PIC S9(09)V99.). */
    public BigDecimal /* precision=11, scale=2, signed */ tranAmt;

    /** TRAN-MERCHANT-ID (uuid:fa9c0ee7-b037-4899-cef3-c5b8fd7ceb25, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ tranMerchantId;

    /** TRAN-MERCHANT-NAME (uuid:2a94ef25-5700-7dcb-d938-e323d624b441, level 5, PIC X(50).). */
    public String tranMerchantName;

    /** TRAN-MERCHANT-CITY (uuid:f83e65a0-f3dd-0411-d88a-c0baaebad3a2, level 5, PIC X(50).). */
    public String tranMerchantCity;

    /** TRAN-MERCHANT-ZIP (uuid:25ce0490-5942-7bc4-31f9-1b3ca50024a9, level 5, PIC X(10).). */
    public String tranMerchantZip;

    /** TRAN-CARD-NUM (uuid:5c70fe87-b999-1bc8-be96-7b5e5ff86549, level 5, PIC X(16).). */
    public String tranCardNum;

    /** TRAN-ORIG-TS (uuid:d3d6aa71-f1c2-5529-9938-11e7502fc846, level 5, PIC X(26).). */
    public String tranOrigTs;

    /** TRAN-PROC-TS (uuid:2d384829-a0cc-1d2e-889d-05ebb212cc00, level 5, PIC X(26).). */
    public String tranProcTs;

    /** TRANFILE-STATUS (uuid:e93e0c3e-0a6c-1359-c01c-0653f1cc9ab2, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tranfileStatus;

    /** TRANFILE-STAT1 (uuid:424da540-d611-2c78-d524-eb1bae0689a4, level 5, PIC X.). */
    public String tranfileStat1;

    /** TRANFILE-STAT2 (uuid:408624e4-bbd3-4224-e2c2-3c4581732090, level 5, PIC X.). */
    public String tranfileStat2;

    /** CARD-XREF-RECORD (uuid:55c1bb06-6571-8a9a-d3bc-4662a4a9fca2, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardXrefRecord;

    /** XREF-CARD-NUM (uuid:57d91ff4-e7e8-fe4f-baee-71bc87dfcb0c, level 5, PIC X(16).). */
    public String xrefCardNum;

    /** XREF-CUST-ID (uuid:b481c291-f5d0-33ac-a174-13b3606db14d, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ xrefCustId;

    /** XREF-ACCT-ID (uuid:85c5b466-eed9-696a-57f1-340248c9b2c1, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ xrefAcctId;

    /** CARDXREF-STATUS (uuid:bf5b1cd4-52e5-59e4-e0e5-621a93fc5939, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardxrefStatus;

    /** CARDXREF-STAT1 (uuid:2e576e4a-3170-318f-10c2-85d996cad435, level 5, PIC X.). */
    public String cardxrefStat1;

    /** CARDXREF-STAT2 (uuid:27b29c55-c500-e45d-6477-8713a77645ce, level 5, PIC X.). */
    public String cardxrefStat2;

    /** TRAN-TYPE-RECORD (uuid:cca4aa49-c841-35cc-5a1e-4a141e9ba4e0, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tranTypeRecord;

    /** TRAN-TYPE (uuid:9f375780-fb29-20e3-4c63-1fe5374efbb8, level 5, PIC X(02).). */
    public String tranType;

    /** TRAN-TYPE-DESC (uuid:7ef2b13f-57d0-3fae-52c5-c934367e54ad, level 5, PIC X(50).). */
    public String tranTypeDesc;

    /** TRANTYPE-STATUS (uuid:e27074bf-023a-3deb-2b6e-f3be23a8259a, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trantypeStatus;

    /** TRANTYPE-STAT1 (uuid:a291c7d7-f387-ef76-f4ed-21a8720122e3, level 5, PIC X.). */
    public String trantypeStat1;

    /** TRANTYPE-STAT2 (uuid:89b8b5d6-318c-d1ac-254c-1d1c1982e685, level 5, PIC X.). */
    public String trantypeStat2;

    /** TRAN-CAT-RECORD (uuid:6af6821c-fa33-ef69-0a34-f22407826553, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tranCatRecord;

    /** TRAN-CAT-KEY (uuid:fbd00962-4287-7a3b-15dc-92b85d4bbdec, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tranCatKey;

    /** TRAN-TYPE-CD (uuid:0b3cda7f-b013-0dbc-981a-d081ac0ddddb, level 10, PIC X(02).). */
    public String tranTypeCd;

    /** TRAN-CAT-CD (uuid:882d3307-5d3d-69d4-7ef8-adf7740b977d, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ tranCatCd;

    /** TRAN-CAT-TYPE-DESC (uuid:3ccda7c1-d611-ae4d-34a2-ff307ba04a19, level 5, PIC X(50).). */
    public String tranCatTypeDesc;

    /** TRANCATG-STATUS (uuid:9b90fb78-39f6-c5d6-d396-f43f3253b768, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trancatgStatus;

    /** TRANCATG-STAT1 (uuid:ced208b8-c62f-21ed-67f5-7e4321d9fc8a, level 5, PIC X.). */
    public String trancatgStat1;

    /** TRANCATG-STAT2 (uuid:9220b6cb-5469-d8f9-7c48-03247903a736, level 5, PIC X.). */
    public String trancatgStat2;

    /** REPORT-NAME-HEADER (uuid:a33d3901-0aea-e291-0f51-ab686f748a65, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ reportNameHeader;

    /** REPT-SHORT-NAME (uuid:614df5a3-ce40-0d88-d31c-9eaa2746d1db, level 5, PIC X(38)). */
    public String reptShortName;

    /** REPT-LONG-NAME (uuid:6d27fffc-0879-80d0-90d0-608f163d61e9, level 5, PIC X(41)). */
    public String reptLongName;

    /** REPT-DATE-HEADER (uuid:02faf9fb-4c6a-5c69-81d3-8276198aec74, level 5, PIC X(12)). */
    public String reptDateHeader;

    /** REPT-START-DATE (uuid:fa4da64b-8643-0faa-2010-0b81b5054177, level 5, PIC X(10)). */
    public String reptStartDate;

    /** REPT-END-DATE (uuid:2c1868c5-0d5c-a2d3-4e0c-4632b2915142, level 5, PIC X(10)). */
    public String reptEndDate;

    /** TRANSACTION-DETAIL-REPORT (uuid:eddc9573-6ca8-d9e1-32bc-27c2d038f142, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ transactionDetailReport;

    /** TRAN-REPORT-TRANS-ID (uuid:98325910-fea9-0b26-9c52-f757e11c6fe9, level 5, PIC X(16).). */
    public String tranReportTransId;

    /** TRAN-REPORT-ACCOUNT-ID (uuid:e3712909-6c3d-76ac-ca4f-12b2a9392e13, level 5, PIC X(11).). */
    public String tranReportAccountId;

    /** TRAN-REPORT-TYPE-CD (uuid:37449d7f-9d25-487a-6a8c-36499c891ba3, level 5, PIC X(02).). */
    public String tranReportTypeCd;

    /** TRAN-REPORT-TYPE-DESC (uuid:d1144f7e-fbee-3ed5-3604-39ce56dc4b34, level 5, PIC X(15).). */
    public String tranReportTypeDesc;

    /** TRAN-REPORT-CAT-CD (uuid:f6d11b00-2ff4-c19b-c52e-535ee16e335b, level 5, PIC 9(04).). */
    public int /* PIC 9(04). */ tranReportCatCd;

    /** TRAN-REPORT-CAT-DESC (uuid:fd0692f0-75ca-1109-1553-522c89e8a64c, level 5, PIC X(29).). */
    public int /* PIC X(29). */ tranReportCatDesc;

    /** TRAN-REPORT-SOURCE (uuid:ffe0d115-8235-c09a-8510-e504633f315d, level 5, PIC X(10).). */
    public String tranReportSource;

    /** TRAN-REPORT-AMT (uuid:ad7d8a7d-47e7-34fd-c1b2-5e0090a6f450, level 5, PIC -ZZZ,ZZZ,ZZZ.ZZ.). */
    public String tranReportAmt;

    /** TRANSACTION-HEADER-1 (uuid:50712451-a61e-380f-f24c-e6334b6839ea, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ transactionHeader1;

    /** TRANSACTION-HEADER-2 (uuid:f2024682-5daf-5c0c-89e9-09433d7cd3ed, level 1, PIC X(133)). */
    public String transactionHeader2;

    /** REPORT-PAGE-TOTALS (uuid:e9cf5245-5b31-5adf-ebf5-564893ea06e4, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ reportPageTotals;

    /** REPT-PAGE-TOTAL (uuid:8964d73c-425e-820d-c9d0-a33e763f0d6e, level 5, PIC +ZZZ,ZZZ,ZZZ.ZZ.). */
    public String reptPageTotal;

    /** REPORT-ACCOUNT-TOTALS (uuid:068f5c2b-c730-c12c-e54d-f677c0f8b8d8, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ reportAccountTotals;

    /** REPT-ACCOUNT-TOTAL (uuid:dde8a4c4-eec5-79ca-83b7-80bedf3fa66f, level 5, PIC +ZZZ,ZZZ,ZZZ.ZZ.). */
    public String reptAccountTotal;

    /** REPORT-GRAND-TOTALS (uuid:4f4e9f90-f4dd-2bf7-420b-51977f103911, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ reportGrandTotals;

    /** REPT-GRAND-TOTAL (uuid:2881510b-eac9-5607-699f-bcbce66415ab, level 5, PIC +ZZZ,ZZZ,ZZZ.ZZ.). */
    public String reptGrandTotal;

    /** TRANREPT-STATUS (uuid:ef3b44c5-d580-550a-6f48-58c54c54fc8f, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tranreptStatus;

    /** REPTFILE-STAT1 (uuid:23bcd88c-d18e-95b7-ca50-3449b5753f37, level 5, PIC X.). */
    public String reptfileStat1;

    /** REPTFILE-STAT2 (uuid:0f8cd3ba-3368-de17-ede0-37b92590de7e, level 5, PIC X.). */
    public String reptfileStat2;

    /** DATEPARM-STATUS (uuid:42139005-e79b-883c-99a2-b77985c3bc2b, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dateparmStatus;

    /** DATEPARM-STAT1 (uuid:35ef1b76-6148-76dd-e2a4-706b2ac90e2e, level 5, PIC X.). */
    public String dateparmStat1;

    /** DATEPARM-STAT2 (uuid:638543d3-7b48-6756-5cc8-aace1222dd71, level 5, PIC X.). */
    public String dateparmStat2;

    /** WS-DATEPARM-RECORD (uuid:37dd0eef-ae3f-45aa-0552-4cc24e656fe2, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateparmRecord;

    /** WS-START-DATE (uuid:bf1b2f14-912a-4d9f-5daf-0a0d488995d0, level 5, PIC X(10).). */
    public String wsStartDate;

    /** WS-END-DATE (uuid:9a00064f-c374-2fbc-e875-80940d3b98ab, level 5, PIC X(10).). */
    public String wsEndDate;

    /** WS-REPORT-VARS (uuid:8a0bbbf2-b023-ae0d-9fd8-9333bc7692eb, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsReportVars;

    /** WS-FIRST-TIME (uuid:61b7bfcb-975b-b07c-afb2-1e83be85b30c, level 5, PIC X). */
    public String wsFirstTime;

    /** WS-LINE-COUNTER (uuid:40c08e1e-b5cd-1b6f-96d0-3f0d924129db, level 5, PIC 9(09) COMP-3). */
    public BigDecimal /* PIC 9(09) COMP-3 */ wsLineCounter;

    /** WS-PAGE-SIZE (uuid:4cfc2fcc-847b-4da0-59a7-18ce1ee0e339, level 5, PIC 9(03) COMP-3). */
    public BigDecimal /* PIC 9(03) COMP-3 */ wsPageSize;

    /** WS-BLANK-LINE (uuid:7b657e8e-482f-fb39-0582-caf6d87f975d, level 5, PIC X(133)). */
    public String wsBlankLine;

    /** WS-PAGE-TOTAL (uuid:1465fe6d-fddb-02bb-2e77-c9c412be623c, level 5, PIC S9(09)V99). */
    public BigDecimal /* precision=11, scale=2, signed */ wsPageTotal;

    /** WS-ACCOUNT-TOTAL (uuid:b71e9a0c-bb5d-bb7d-a5e5-1ba4397de65c, level 5, PIC S9(09)V99). */
    public BigDecimal /* precision=11, scale=2, signed */ wsAccountTotal;

    /** WS-GRAND-TOTAL (uuid:d1a52ae1-a296-5622-4ca9-0d5537c55975, level 5, PIC S9(09)V99). */
    public BigDecimal /* precision=11, scale=2, signed */ wsGrandTotal;

    /** WS-CURR-CARD-NUM (uuid:a1350f17-4ba3-61ed-bebe-0c999aad9f62, level 5, PIC X(16)). */
    public String wsCurrCardNum;

    /** IO-STATUS (uuid:eb93e4e7-aebb-497f-bff9-ad77e1069b0c, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ioStatus;

    /** IO-STAT1 (uuid:22d38106-5bb2-7ec4-4616-93b87801d064, level 5, PIC X.). */
    public String ioStat1;

    /** IO-STAT2 (uuid:8449e8e6-5aad-833f-231f-3579a7fd1b91, level 5, PIC X.). */
    public String ioStat2;

    /** TWO-BYTES-BINARY (uuid:0a2d8ffd-86a5-9548-5efb-87b73b765ac8, level 1, PIC 9(4) BINARY). */
    public int /* PIC 9(4) */ twoBytesBinary;

    /** TWO-BYTES-ALPHA (uuid:4ecf8d52-2be7-39d3-31d6-ca3a8333194f, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ twoBytesAlpha;

    /** TWO-BYTES-LEFT (uuid:42891956-a73f-c565-8050-0057dafc076c, level 5, PIC X.). */
    public String twoBytesLeft;

    /** TWO-BYTES-RIGHT (uuid:0f74065c-92b1-26a3-ac66-6dffcafa7583, level 5, PIC X.). */
    public String twoBytesRight;

    /** IO-STATUS-04 (uuid:b09a702c-63ad-5cf0-3724-d122a72c37b1, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ioStatus04;

    /** IO-STATUS-0401 (uuid:74d9356b-3509-77b8-ceef-ae3d25a263ec, level 5, PIC 9). */
    public int /* PIC 9 */ ioStatus0401;

    /** IO-STATUS-0403 (uuid:2b76f08e-9146-693f-dd23-a882bc6ce9b1, level 5, PIC 999). */
    public int /* PIC 999 */ ioStatus0403;

    /** APPL-RESULT (uuid:c61c26df-f317-54e2-880e-ae7da0d09b61, level 1, PIC S9(9) COMP). */
    public int /* PIC S9(9) signed */ applResult;

    /** END-OF-FILE (uuid:92816872-e0fb-8451-85b0-1c9a71342ed7, level 1, PIC X(01)). */
    public String endOfFile;

    /** ABCODE (uuid:e7c2c6bd-0247-627e-efe5-ae10a8c668ef, level 1, PIC S9(9) BINARY). */
    public int /* PIC S9(9) signed */ abcode;

    /** TIMING (uuid:b612749b-9c99-ad4f-2fac-69e922018518, level 1, PIC S9(9) BINARY). */
    public int /* PIC S9(9) signed */ timing;

    /** 0550-DATEPARM-READ  (uuid:3f73f7f5-4c40-3409-eec5-78112ed6905e, source lines 347-370). */
    public void p0550DateparmRead() {
        // COBOL [READ]: READ DATE-PARMS-FILE INTO WS-DATEPARM-RECORD
        // EVALUATE DATEPARM-STATUS
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: DATEPARM-STATUS */) { /* WHEN branches follow */ }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
    }

    /** 1000-TRANFILE-GET-NEXT  (uuid:340604b3-c425-bf82-6013-bc871a59a24c, source lines 375-399). */
    public void p1000TranfileGetNext() {
        // COBOL [READ]: READ TRANSACT-FILE INTO TRAN-RECORD
        // EVALUATE TRANFILE-STATUS
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: TRANFILE-STATUS */) { /* WHEN branches follow */ }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 1100-WRITE-TRANSACTION-REPORT  (uuid:3ee6851c-c93b-946c-d04f-6a01aa9970a4, source lines 401-417). */
    public void p1100WriteTransactionReport() {
        if (java.util.Objects.equals(this.wsFirstTime, "Y")) {
            // TODO: translate body for: WS-FIRST-TIME = 'Y'
        }
        if (true /* TODO translate: FUNCTION MOD(WS-LINE-COUNTER, WS-PAGE-SIZE) = 0 */) {
            // TODO: translate body for: FUNCTION MOD(WS-LINE-COUNTER, WS-PAGE-SIZE) = 0
        }
        // ADD (needs PIC-aware translation): ADD TRAN-AMT TO WS-PAGE-TOTAL WS-ACCOUNT-TOTAL;
        // COBOL [PERFORM]: PERFORM 1120-WRITE-DETAIL
        // COBOL [EXIT]: EXIT
    }

    /** 1110-WRITE-PAGE-TOTALS  (uuid:ee777110-23a1-da35-8e9b-a7f32b48b3d8, source lines 420-431). */
    public void p1110WritePageTotals() {
        // MOVE WS-PAGE-TOTAL TO REPT-PAGE-TOTAL  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE REPORT-PAGE-TOTALS TO FD-REPTFILE-REC  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1111-WRITE-REPORT-REC
        // ADD (needs PIC-aware translation): ADD WS-PAGE-TOTAL TO WS-GRAND-TOTAL;
        this.wsPageTotal = 0;
        // ADD (needs PIC-aware translation): ADD 1 TO WS-LINE-COUNTER;
        // MOVE TRANSACTION-HEADER-2 TO FD-REPTFILE-REC  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1111-WRITE-REPORT-REC
        // ADD (needs PIC-aware translation): ADD 1 TO WS-LINE-COUNTER;
        // COBOL [EXIT]: EXIT
    }

    /** 1120-WRITE-ACCOUNT-TOTALS  (uuid:4b307b37-1926-aa35-bfe4-d97a49eb3e0a, source lines 433-443). */
    public void p1120WriteAccountTotals() {
        // MOVE WS-ACCOUNT-TOTAL TO REPT-ACCOUNT-TOTAL  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE REPORT-ACCOUNT-TOTALS TO FD-REPTFILE-REC  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1111-WRITE-REPORT-REC
        this.wsAccountTotal = 0;
        // ADD (needs PIC-aware translation): ADD 1 TO WS-LINE-COUNTER;
        // MOVE TRANSACTION-HEADER-2 TO FD-REPTFILE-REC  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1111-WRITE-REPORT-REC
        // ADD (needs PIC-aware translation): ADD 1 TO WS-LINE-COUNTER;
        // COBOL [EXIT]: EXIT
    }

    /** 1110-WRITE-GRAND-TOTALS  (uuid:dea6c45b-132a-b357-3e26-5e71c8e1ae59, source lines 445-449). */
    public void p1110WriteGrandTotals() {
        // MOVE WS-GRAND-TOTAL TO REPT-GRAND-TOTAL  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE REPORT-GRAND-TOTALS TO FD-REPTFILE-REC  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1111-WRITE-REPORT-REC
        // COBOL [EXIT]: EXIT
    }

    /** 1120-WRITE-HEADERS  (uuid:8b1c6870-4be9-102c-c0a6-c149f972dcb1, source lines 451-468). */
    public void p1120WriteHeaders() {
        // MOVE REPORT-NAME-HEADER TO FD-REPTFILE-REC  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1111-WRITE-REPORT-REC
        // ADD (needs PIC-aware translation): ADD 1 TO WS-LINE-COUNTER;
        // MOVE WS-BLANK-LINE TO FD-REPTFILE-REC  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1111-WRITE-REPORT-REC
        // ADD (needs PIC-aware translation): ADD 1 TO WS-LINE-COUNTER;
        // MOVE TRANSACTION-HEADER-1 TO FD-REPTFILE-REC  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1111-WRITE-REPORT-REC
        // ADD (needs PIC-aware translation): ADD 1 TO WS-LINE-COUNTER;
        // MOVE TRANSACTION-HEADER-2 TO FD-REPTFILE-REC  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1111-WRITE-REPORT-REC
        // ADD (needs PIC-aware translation): ADD 1 TO WS-LINE-COUNTER;
        // COBOL [EXIT]: EXIT
    }

    /** 1111-WRITE-REPORT-REC  (uuid:fc9181ac-8499-7e27-cdb3-51f13372f0b8, source lines 470-486). */
    public void p1111WriteReportRec() {
        // COBOL [WRITE]: WRITE FD-REPTFILE-REC
        if (java.util.Objects.equals(this.tranreptStatus, "00")) {
            // TODO: translate body for: TRANREPT-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 1120-WRITE-DETAIL  (uuid:27fb8d6e-cffe-e4fe-c2e9-06ec6cd8db2d, source lines 488-501). */
    public void p1120WriteDetail() {
        // INITIALIZE transactionDetailReport: reset to PIC defaults
        this.transactionDetailReport = null;  // TODO: set to type-appropriate zero/spaces
        // MOVE TRAN-ID TO TRAN-REPORT-TRANS-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE XREF-ACCT-ID TO TRAN-REPORT-ACCOUNT-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TRAN-TYPE-CD OF TRAN-RECORD TO TRAN-REPORT-TYPE-CD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TRAN-TYPE-DESC TO TRAN-REPORT-TYPE-DESC  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TRAN-CAT-CD OF TRAN-RECORD TO TRAN-REPORT-CAT-CD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TRAN-CAT-TYPE-DESC TO TRAN-REPORT-CAT-DESC  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TRAN-SOURCE TO TRAN-REPORT-SOURCE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TRAN-AMT TO TRAN-REPORT-AMT  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TRANSACTION-DETAIL-REPORT TO FD-REPTFILE-REC  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1111-WRITE-REPORT-REC
        // ADD (needs PIC-aware translation): ADD 1 TO WS-LINE-COUNTER;
        // COBOL [EXIT]: EXIT
    }

    /** 0000-TRANFILE-OPEN  (uuid:c61abdc1-5f7e-7448-4552-b75e9b6c872a, source lines 503-519). */
    public void p0000TranfileOpen() {
        this.applResult = 8;
        // COBOL [OPEN]: OPEN INPUT TRANSACT-FILE
        if (java.util.Objects.equals(this.tranfileStatus, "00")) {
            // TODO: translate body for: TRANFILE-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 0100-REPTFILE-OPEN  (uuid:eb03dfde-86af-0fe7-66bb-295703c918b9, source lines 521-537). */
    public void p0100ReptfileOpen() {
        this.applResult = 8;
        // COBOL [OPEN]: OPEN OUTPUT REPORT-FILE
        if (java.util.Objects.equals(this.tranreptStatus, "00")) {
            // TODO: translate body for: TRANREPT-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 0200-CARDXREF-OPEN  (uuid:c5cf44ee-4376-8f60-5db5-875bb6cc7b54, source lines 539-555). */
    public void p0200CardxrefOpen() {
        this.applResult = 8;
        // COBOL [OPEN]: OPEN INPUT XREF-FILE
        if (java.util.Objects.equals(this.cardxrefStatus, "00")) {
            // TODO: translate body for: CARDXREF-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 0300-TRANTYPE-OPEN  (uuid:6b697fcd-d8bf-6796-1b70-c73b03b9627c, source lines 557-573). */
    public void p0300TrantypeOpen() {
        this.applResult = 8;
        // COBOL [OPEN]: OPEN INPUT TRANTYPE-FILE
        if (java.util.Objects.equals(this.trantypeStatus, "00")) {
            // TODO: translate body for: TRANTYPE-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 0400-TRANCATG-OPEN  (uuid:6d5e9817-27b6-7e69-8528-ccff1d98a0c0, source lines 575-591). */
    public void p0400TrancatgOpen() {
        this.applResult = 8;
        // COBOL [OPEN]: OPEN INPUT TRANCATG-FILE
        if (java.util.Objects.equals(this.trancatgStatus, "00")) {
            // TODO: translate body for: TRANCATG-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 0500-DATEPARM-OPEN  (uuid:5bfa294e-c8cf-0042-4992-052e3bbe024a, source lines 593-609). */
    public void p0500DateparmOpen() {
        this.applResult = 8;
        // COBOL [OPEN]: OPEN INPUT DATE-PARMS-FILE
        if (java.util.Objects.equals(this.dateparmStatus, "00")) {
            // TODO: translate body for: DATEPARM-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 1500-A-LOOKUP-XREF  (uuid:a96565f1-48c1-0e4e-d325-e0f62dafb40c, source lines 611-619). */
    public void p1500ALookupXref() {
        // COBOL [READ]: READ XREF-FILE INTO CARD-XREF-RECORD INVALID KEY DISPLAY 'INVALID CARD NUMBER : ' FD-XREF-CARD-NUM MOVE 23 TO IO-STATUS PERFORM 9910-DISPLAY-IO-STATUS PERFORM 9999-ABEND-PROGRAM END-READ
        // COBOL [EXIT]: EXIT
    }

    /** 1500-B-LOOKUP-TRANTYPE  (uuid:e09550b0-49ce-df01-5144-ed87e69b34d2, source lines 621-629). */
    public void p1500BLookupTrantype() {
        // COBOL [READ]: READ TRANTYPE-FILE INTO TRAN-TYPE-RECORD INVALID KEY DISPLAY 'INVALID TRANSACTION TYPE : ' FD-TRAN-TYPE MOVE 23 TO IO-STATUS PERFORM 9910-DISPLAY-IO-STATUS PERFORM 9999-ABEND-PROGRAM END-READ
        // COBOL [EXIT]: EXIT
    }

    /** 1500-C-LOOKUP-TRANCATG  (uuid:00e8872b-190b-64e3-d36e-4fce62c926f8, source lines 631-639). */
    public void p1500CLookupTrancatg() {
        // COBOL [READ]: READ TRANCATG-FILE INTO TRAN-CAT-RECORD INVALID KEY DISPLAY 'INVALID TRAN CATG KEY : ' FD-TRAN-CAT-KEY MOVE 23 TO IO-STATUS PERFORM 9910-DISPLAY-IO-STATUS PERFORM 9999-ABEND-PROGRAM END-READ
        // COBOL [EXIT]: EXIT
    }

    /** 9000-TRANFILE-CLOSE  (uuid:0a21309a-f965-61f7-1119-f477a196f56f, source lines 641-657). */
    public void p9000TranfileClose() {
        // ADD (needs PIC-aware translation): ADD 8 TO ZERO GIVING APPL-RESULT;
        // COBOL [CLOSE]: CLOSE TRANSACT-FILE
        if (java.util.Objects.equals(this.tranfileStatus, "00")) {
            // TODO: translate body for: TRANFILE-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 9100-REPTFILE-CLOSE  (uuid:252fc52c-9494-d6fd-7073-682f8eb96820, source lines 659-675). */
    public void p9100ReptfileClose() {
        // ADD (needs PIC-aware translation): ADD 8 TO ZERO GIVING APPL-RESULT;
        // COBOL [CLOSE]: CLOSE REPORT-FILE
        if (java.util.Objects.equals(this.tranreptStatus, "00")) {
            // TODO: translate body for: TRANREPT-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 9200-CARDXREF-CLOSE  (uuid:f31f1027-75f1-6eb0-5b86-c25830074591, source lines 678-694). */
    public void p9200CardxrefClose() {
        this.applResult = 8;
        // COBOL [CLOSE]: CLOSE XREF-FILE
        if (java.util.Objects.equals(this.cardxrefStatus, "00")) {
            // TODO: translate body for: CARDXREF-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 9300-TRANTYPE-CLOSE  (uuid:c2d22771-3bd7-ad40-ee0e-6e74d4db614b, source lines 696-712). */
    public void p9300TrantypeClose() {
        this.applResult = 8;
        // COBOL [CLOSE]: CLOSE TRANTYPE-FILE
        if (java.util.Objects.equals(this.trantypeStatus, "00")) {
            // TODO: translate body for: TRANTYPE-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 9400-TRANCATG-CLOSE  (uuid:f07e1573-7cc9-cffd-c4c6-aaf2d11f98ed, source lines 714-730). */
    public void p9400TrancatgClose() {
        this.applResult = 8;
        // COBOL [CLOSE]: CLOSE TRANCATG-FILE
        if (java.util.Objects.equals(this.trancatgStatus, "00")) {
            // TODO: translate body for: TRANCATG-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 9500-DATEPARM-CLOSE  (uuid:ab154863-ec11-e556-edaa-8b777fd5bef8, source lines 732-748). */
    public void p9500DateparmClose() {
        this.applResult = 8;
        // COBOL [CLOSE]: CLOSE DATE-PARMS-FILE
        if (java.util.Objects.equals(this.dateparmStatus, "00")) {
            // TODO: translate body for: DATEPARM-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 9999-ABEND-PROGRAM  (uuid:a932277a-a3ed-3d41-b3e7-282df2bc953c, source lines 753-757). */
    public void p9999AbendProgram() {
        System.out.println("ABENDING PROGRAM");  // DISPLAY 'ABENDING PROGRAM'
        this.timing = 0;
        this.abcode = 999;
        // CALL CEE3ABD() — see external program CEE3ABD
    }

    /** 9910-DISPLAY-IO-STATUS  (uuid:0f25214d-ee1e-d140-bff7-1b821a97a1e4, source lines 760-773). */
    public void p9910DisplayIoStatus() {
        if ((!this.ioStatus.toString().matches("-?\\d+(\\.\\d+)?")) || (java.util.Objects.equals(this.ioStat1, "9"))) {
            // TODO: translate body for: IO-STATUS NOT NUMERIC OR IO-STAT1 = '9'
        }
        // COBOL [EXIT]: EXIT
    }

    public static void main(String[] args) {
        new Cbtrn03c().mainPara();
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
