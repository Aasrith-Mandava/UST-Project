// Generated from CBTRN01C.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_CBTRN01C.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * CBTRN01C (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: CBTRN01C.cbl
 */
public class Cbtrn01c {

    /** DALYTRAN-RECORD (uuid:e4cab9d8-1db5-f71c-0842-5ef2fe7f6749, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dalytranRecord;

    /** DALYTRAN-ID (uuid:ce60bdb9-4274-59fd-0427-13b30d86f0cb, level 5, PIC X(16).). */
    public String dalytranId;

    /** DALYTRAN-TYPE-CD (uuid:e7dabb44-395b-6e81-7e6f-3a3ccbaef3a0, level 5, PIC X(02).). */
    public String dalytranTypeCd;

    /** DALYTRAN-CAT-CD (uuid:166ecf6b-4c90-c2d1-315e-7e923dd94734, level 5, PIC 9(04).). */
    public int /* PIC 9(04). */ dalytranCatCd;

    /** DALYTRAN-SOURCE (uuid:fd78a5ce-4c53-33fa-35a3-6d62ecaef653, level 5, PIC X(10).). */
    public String dalytranSource;

    /** DALYTRAN-DESC (uuid:a763841e-012b-38c4-a418-87e8f531051d, level 5, PIC X(100).). */
    public String dalytranDesc;

    /** DALYTRAN-AMT (uuid:18774629-d4c1-ce92-547e-dc00cdaef100, level 5, PIC S9(09)V99.). */
    public BigDecimal /* precision=11, scale=2, signed */ dalytranAmt;

    /** DALYTRAN-MERCHANT-ID (uuid:6b840b1a-c590-14aa-8fe6-dfcd390bd44e, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ dalytranMerchantId;

    /** DALYTRAN-MERCHANT-NAME (uuid:e65f7f87-d4da-40bc-481b-b2ff150f3441, level 5, PIC X(50).). */
    public String dalytranMerchantName;

    /** DALYTRAN-MERCHANT-CITY (uuid:d1bd208a-aadc-6941-80a7-380d93665b33, level 5, PIC X(50).). */
    public String dalytranMerchantCity;

    /** DALYTRAN-MERCHANT-ZIP (uuid:49da1a16-da64-9b05-90b6-75c2af33fbd1, level 5, PIC X(10).). */
    public String dalytranMerchantZip;

    /** DALYTRAN-CARD-NUM (uuid:995c7dd1-570a-2925-88a5-b250650c1105, level 5, PIC X(16).). */
    public String dalytranCardNum;

    /** DALYTRAN-ORIG-TS (uuid:dc13fcfc-e5f1-2d9e-75ca-6cda9f258143, level 5, PIC X(26).). */
    public String dalytranOrigTs;

    /** DALYTRAN-PROC-TS (uuid:4a1dc1a0-50de-4a7f-647e-c368e4f1f8aa, level 5, PIC X(26).). */
    public String dalytranProcTs;

    /** DALYTRAN-STATUS (uuid:d6a7fd3e-e7ce-4d65-56ca-da784b2efea5, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dalytranStatus;

    /** DALYTRAN-STAT1 (uuid:f3b4d96e-489a-2bdb-8162-8a5e1a49555f, level 5, PIC X.). */
    public String dalytranStat1;

    /** DALYTRAN-STAT2 (uuid:b3ae2bad-5595-9a25-6ea2-7db6ebf0a436, level 5, PIC X.). */
    public String dalytranStat2;

    /** CUSTOMER-RECORD (uuid:2a1c2527-5c81-4cb7-46c4-dfb632ce3389, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ customerRecord;

    /** CUST-ID (uuid:99f8df72-0c9b-f843-e226-b27475848d16, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ custId;

    /** CUST-FIRST-NAME (uuid:5403799e-b95a-a5ef-d172-7e50e57562c7, level 5, PIC X(25).). */
    public String custFirstName;

    /** CUST-MIDDLE-NAME (uuid:650d07ea-f7a1-9784-0d87-85740470554e, level 5, PIC X(25).). */
    public String custMiddleName;

    /** CUST-LAST-NAME (uuid:7eee7a9d-d5fd-0f7d-93f9-9daf44fe45c9, level 5, PIC X(25).). */
    public String custLastName;

    /** CUST-ADDR-LINE-1 (uuid:ef844b73-4995-4380-4e27-1756e43873c1, level 5, PIC X(50).). */
    public String custAddrLine1;

    /** CUST-ADDR-LINE-2 (uuid:8ee70f03-3cca-35fd-307a-a8aae7aa4221, level 5, PIC X(50).). */
    public String custAddrLine2;

    /** CUST-ADDR-LINE-3 (uuid:e6bde6ca-e502-15fb-9674-6771092b655a, level 5, PIC X(50).). */
    public String custAddrLine3;

    /** CUST-ADDR-STATE-CD (uuid:c8972b66-eeac-21ed-c376-609652bd9172, level 5, PIC X(02).). */
    public String custAddrStateCd;

    /** CUST-ADDR-COUNTRY-CD (uuid:488262ed-776f-9f3c-7bda-91a42660414d, level 5, PIC X(03).). */
    public String custAddrCountryCd;

    /** CUST-ADDR-ZIP (uuid:a15817df-239a-1fd0-4d58-c5e57ce3e4b7, level 5, PIC X(10).). */
    public String custAddrZip;

    /** CUST-PHONE-NUM-1 (uuid:9a895180-7d4e-3e9b-63ff-276778829c8a, level 5, PIC X(15).). */
    public String custPhoneNum1;

    /** CUST-PHONE-NUM-2 (uuid:766e3e92-e9df-db41-3634-643941f5c03c, level 5, PIC X(15).). */
    public String custPhoneNum2;

    /** CUST-SSN (uuid:26666b09-d704-b17a-21f9-8deb1fe3e364, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ custSsn;

    /** CUST-GOVT-ISSUED-ID (uuid:355bcd6e-bebc-d685-ae28-1564c047a8e7, level 5, PIC X(20).). */
    public String custGovtIssuedId;

    /** CUST-DOB-YYYY-MM-DD (uuid:11b9c5f0-16e9-b935-4650-f8445ff96fd8, level 5, PIC X(10).). */
    public String custDobYyyyMmDd;

    /** CUST-EFT-ACCOUNT-ID (uuid:9db969da-0bf9-3f5a-dedd-6e015103aea7, level 5, PIC X(10).). */
    public String custEftAccountId;

    /** CUST-PRI-CARD-HOLDER-IND (uuid:b6b6bcfa-5342-304c-e589-582a5a8df889, level 5, PIC X(01).). */
    public String custPriCardHolderInd;

    /** CUST-FICO-CREDIT-SCORE (uuid:72a1fdd4-8701-121a-0234-27a8df92eb14, level 5, PIC 9(03).). */
    public int /* PIC 9(03). */ custFicoCreditScore;

    /** CUSTFILE-STATUS (uuid:bc25aea8-e50e-57e0-39fb-8e053d5a74d8, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ custfileStatus;

    /** CUSTFILE-STAT1 (uuid:8153b673-fd49-e602-1de8-d861b1452ebd, level 5, PIC X.). */
    public String custfileStat1;

    /** CUSTFILE-STAT2 (uuid:3f77de73-1129-0f15-d16b-5efd2379f063, level 5, PIC X.). */
    public String custfileStat2;

    /** CARD-XREF-RECORD (uuid:f52abecc-f06a-cce7-94d6-3c6b6b039520, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardXrefRecord;

    /** XREF-CARD-NUM (uuid:6fa6c915-6377-894a-e153-470a19199962, level 5, PIC X(16).). */
    public String xrefCardNum;

    /** XREF-CUST-ID (uuid:1adf0edf-b9ea-c30a-8dbf-d1ea665f1393, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ xrefCustId;

    /** XREF-ACCT-ID (uuid:a496704e-bec3-397d-b29f-1b0aa206e8c2, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ xrefAcctId;

    /** XREFFILE-STATUS (uuid:336100a1-2412-7927-aefc-9c48a812330a, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ xreffileStatus;

    /** XREFFILE-STAT1 (uuid:5de8dff0-e8d4-b26a-dd5c-edfb3ba6e620, level 5, PIC X.). */
    public String xreffileStat1;

    /** XREFFILE-STAT2 (uuid:ece4232d-90b2-2f2f-e7d4-81f653048edd, level 5, PIC X.). */
    public String xreffileStat2;

    /** CARD-RECORD (uuid:0d59a5e9-e9dc-23b3-12a3-ec113a633506, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardRecord;

    /** CARD-NUM (uuid:5c50be04-4db5-897f-f658-e617f851c2a8, level 5, PIC X(16).). */
    public String cardNum;

    /** CARD-ACCT-ID (uuid:d3d27625-c2f0-442f-8a51-6cc5f69474b2, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ cardAcctId;

    /** CARD-CVV-CD (uuid:cdcabbb5-f51f-eb30-24ec-e89c9d9aefb3, level 5, PIC 9(03).). */
    public int /* PIC 9(03). */ cardCvvCd;

    /** CARD-EMBOSSED-NAME (uuid:738da72f-91bf-1013-22f4-3c6adc31eebf, level 5, PIC X(50).). */
    public String cardEmbossedName;

    /** CARD-EXPIRAION-DATE (uuid:cd90fbf2-be24-531a-5099-4c61ef2417a5, level 5, PIC X(10).). */
    public String cardExpiraionDate;

    /** CARD-ACTIVE-STATUS (uuid:b410ba80-d909-a6ff-5488-c4fd5194ecc4, level 5, PIC X(01).). */
    public String cardActiveStatus;

    /** CARDFILE-STATUS (uuid:0d42af6c-8b52-863f-70e9-d79c1553aadb, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardfileStatus;

    /** CARDFILE-STAT1 (uuid:34f2c29f-d720-187c-7d40-e1dd2df0e79c, level 5, PIC X.). */
    public String cardfileStat1;

    /** CARDFILE-STAT2 (uuid:326ce9b2-b654-ea05-18d5-608463c50a90, level 5, PIC X.). */
    public String cardfileStat2;

    /** ACCOUNT-RECORD (uuid:16a0903c-f1dd-79f9-a779-b554e10b12c8, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ accountRecord;

    /** ACCT-ID (uuid:43d80b0e-9b4e-913a-49bf-884bc7e97153, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ acctId;

    /** ACCT-ACTIVE-STATUS (uuid:a064c7b5-5972-e5f6-7c9e-7fc5d57988c9, level 5, PIC X(01).). */
    public String acctActiveStatus;

    /** ACCT-CURR-BAL (uuid:f9d22a2b-f659-89ed-867c-633ff748e894, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrBal;

    /** ACCT-CREDIT-LIMIT (uuid:85254ef3-657e-81eb-897a-d3ac23c00b3d, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCreditLimit;

    /** ACCT-CASH-CREDIT-LIMIT (uuid:c2644a29-5d4f-3f7f-0314-fb60a9de92cb, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCashCreditLimit;

    /** ACCT-OPEN-DATE (uuid:12b38ec5-1225-61b5-1454-f391107b357c, level 5, PIC X(10).). */
    public String acctOpenDate;

    /** ACCT-EXPIRAION-DATE (uuid:ca65a668-9d15-c463-b347-e688ff802ee4, level 5, PIC X(10).). */
    public String acctExpiraionDate;

    /** ACCT-REISSUE-DATE (uuid:519753de-12c4-335f-ff69-5c6c6a442cf1, level 5, PIC X(10).). */
    public String acctReissueDate;

    /** ACCT-CURR-CYC-CREDIT (uuid:23090d41-d41e-27f0-4be7-18ef65bc17e5, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrCycCredit;

    /** ACCT-CURR-CYC-DEBIT (uuid:3acff5e0-481c-976b-1e3c-d5275d90d05b, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrCycDebit;

    /** ACCT-ADDR-ZIP (uuid:2e95553e-b6d4-4095-3ef0-2fd8d7d3ac60, level 5, PIC X(10).). */
    public String acctAddrZip;

    /** ACCT-GROUP-ID (uuid:8e130867-7577-86bc-c45b-e38a72b510b8, level 5, PIC X(10).). */
    public String acctGroupId;

    /** ACCTFILE-STATUS (uuid:658db071-40b0-acec-d5e8-fa49249d1e60, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctfileStatus;

    /** ACCTFILE-STAT1 (uuid:2264d729-b480-a350-5769-4229d287306e, level 5, PIC X.). */
    public String acctfileStat1;

    /** ACCTFILE-STAT2 (uuid:7fb44c0b-1562-e9f7-48d8-0cac93cbe569, level 5, PIC X.). */
    public String acctfileStat2;

    /** TRAN-RECORD (uuid:26dff145-c156-65d3-9b26-2de8c18b5e95, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tranRecord;

    /** TRAN-ID (uuid:e4112d2b-1eb2-3db9-b01c-2bf1294d3dd1, level 5, PIC X(16).). */
    public String tranId;

    /** TRAN-TYPE-CD (uuid:2388f90d-d78d-da4b-079b-8cc268fe6294, level 5, PIC X(02).). */
    public String tranTypeCd;

    /** TRAN-CAT-CD (uuid:c5a6e3d5-98e0-bdba-7c91-d009834d9d52, level 5, PIC 9(04).). */
    public int /* PIC 9(04). */ tranCatCd;

    /** TRAN-SOURCE (uuid:e1cfb716-e231-e924-ebf6-1c4b4f29a0ec, level 5, PIC X(10).). */
    public String tranSource;

    /** TRAN-DESC (uuid:28b23d69-e9e7-01ab-7d61-5f7a86f363c8, level 5, PIC X(100).). */
    public String tranDesc;

    /** TRAN-AMT (uuid:8c0987b3-c602-a4b1-ef5f-fb74e8788320, level 5, PIC S9(09)V99.). */
    public BigDecimal /* precision=11, scale=2, signed */ tranAmt;

    /** TRAN-MERCHANT-ID (uuid:1ea81e5e-d7d3-9222-5cbb-94b0e4548e49, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ tranMerchantId;

    /** TRAN-MERCHANT-NAME (uuid:9c48892b-145f-7836-08eb-075eb1b0dd98, level 5, PIC X(50).). */
    public String tranMerchantName;

    /** TRAN-MERCHANT-CITY (uuid:152086ea-117d-235f-e23e-1641663531f7, level 5, PIC X(50).). */
    public String tranMerchantCity;

    /** TRAN-MERCHANT-ZIP (uuid:cc2285e8-a0f6-e87e-74a4-40939fe50ce9, level 5, PIC X(10).). */
    public String tranMerchantZip;

    /** TRAN-CARD-NUM (uuid:0273c1c0-0ae0-b75c-e3f6-8129131361b5, level 5, PIC X(16).). */
    public String tranCardNum;

    /** TRAN-ORIG-TS (uuid:5d883333-6f87-7484-b567-8a88e2345a5a, level 5, PIC X(26).). */
    public String tranOrigTs;

    /** TRAN-PROC-TS (uuid:d805e1f1-30ab-8c80-42fa-89fe25825eff, level 5, PIC X(26).). */
    public String tranProcTs;

    /** TRANFILE-STATUS (uuid:3636db7c-c693-70e4-5a42-1c8e4e3677b8, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tranfileStatus;

    /** TRANFILE-STAT1 (uuid:9e6df86d-0113-ea0f-c92f-2db3e35824ff, level 5, PIC X.). */
    public String tranfileStat1;

    /** TRANFILE-STAT2 (uuid:f2607f58-a0b7-e601-8231-0d93dd1f333d, level 5, PIC X.). */
    public String tranfileStat2;

    /** IO-STATUS (uuid:ca49d304-df00-b58a-0103-c7eebbca5fa0, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ioStatus;

    /** IO-STAT1 (uuid:ff6162a5-7eed-0b61-415e-979e460c9f58, level 5, PIC X.). */
    public String ioStat1;

    /** IO-STAT2 (uuid:b502f594-0526-1d35-93c9-cccc41327511, level 5, PIC X.). */
    public String ioStat2;

    /** TWO-BYTES-BINARY (uuid:41056e38-93e4-4220-7d5b-5471d5ed3a02, level 1, PIC 9(4) BINARY). */
    public int /* PIC 9(4) */ twoBytesBinary;

    /** TWO-BYTES-ALPHA (uuid:19957341-9ff2-c341-a082-4f5800fc1148, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ twoBytesAlpha;

    /** TWO-BYTES-LEFT (uuid:059b48ab-0bd9-70ef-9dee-6c4772e5b501, level 5, PIC X.). */
    public String twoBytesLeft;

    /** TWO-BYTES-RIGHT (uuid:426fa6e1-84b8-1f07-e1ea-50daea68f818, level 5, PIC X.). */
    public String twoBytesRight;

    /** IO-STATUS-04 (uuid:b209422c-db58-8f4b-5aa2-dd2c737d55ec, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ioStatus04;

    /** IO-STATUS-0401 (uuid:f4be12c6-79fe-525e-4c90-64762c3c8e4f, level 5, PIC 9). */
    public int /* PIC 9 */ ioStatus0401;

    /** IO-STATUS-0403 (uuid:b6ca1df0-fc05-401c-9749-3812309a8877, level 5, PIC 999). */
    public int /* PIC 999 */ ioStatus0403;

    /** APPL-RESULT (uuid:3c52ef8d-df05-fdfe-049a-006c9db7e0f6, level 1, PIC S9(9) COMP). */
    public int /* PIC S9(9) signed */ applResult;

    /** END-OF-DAILY-TRANS-FILE (uuid:1fbcec88-4123-8176-1016-85e1a359e890, level 1, PIC X(01)). */
    public String endOfDailyTransFile;

    /** ABCODE (uuid:af282209-0d21-7c6e-69fb-f756267dccf8, level 1, PIC S9(9) BINARY). */
    public int /* PIC S9(9) signed */ abcode;

    /** TIMING (uuid:d7a7bb26-4909-8f7c-aab8-2a666056dd4d, level 1, PIC S9(9) BINARY). */
    public int /* PIC S9(9) signed */ timing;

    /** WS-MISC-VARIABLES (uuid:11368cf5-50dc-9dae-a731-1ded2e755313, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsMiscVariables;

    /** WS-XREF-READ-STATUS (uuid:184ce786-ddc6-5d8f-d8d3-0363e90cfb57, level 5, PIC 9(04).). */
    public int /* PIC 9(04). */ wsXrefReadStatus;

    /** WS-ACCT-READ-STATUS (uuid:b0b33dd2-0481-22be-21c0-c91b9126990a, level 5, PIC 9(04).). */
    public int /* PIC 9(04). */ wsAcctReadStatus;


    // --- auto-generated stubs for undeclared references ---
    public Object until;  // auto-stub for undeclared reference

    /** MAIN-PARA  (uuid:840ab639-249c-836c-dee3-c3eeb6bd0805, source lines 268-310). */
    public void mainPara() {
        System.out.println("START OF EXECUTION OF PROGRAM CBTRN01C");  // DISPLAY 'START OF EXECUTION OF PROGRAM CBTRN01C'
        // COBOL [PERFORM]: PERFORM 0000-DALYTRAN-OPEN
        // COBOL [PERFORM]: PERFORM 0100-CUSTFILE-OPEN
        // COBOL [PERFORM]: PERFORM 0200-XREFFILE-OPEN
        // COBOL [PERFORM]: PERFORM 0300-CARDFILE-OPEN
        // COBOL [PERFORM]: PERFORM 0400-ACCTFILE-OPEN
        // COBOL [PERFORM]: PERFORM 0500-TRANFILE-OPEN
        this.until();  // PERFORM
        // COBOL [PERFORM]: PERFORM 9000-DALYTRAN-CLOSE
        // COBOL [PERFORM]: PERFORM 9100-CUSTFILE-CLOSE
        // COBOL [PERFORM]: PERFORM 9200-XREFFILE-CLOSE
        // COBOL [PERFORM]: PERFORM 9300-CARDFILE-CLOSE
        // COBOL [PERFORM]: PERFORM 9400-ACCTFILE-CLOSE
        // COBOL [PERFORM]: PERFORM 9500-TRANFILE-CLOSE
        System.out.println("END OF EXECUTION OF PROGRAM CBTRN01C");  // DISPLAY 'END OF EXECUTION OF PROGRAM CBTRN01C'
        // COBOL [GO_BACK]: GOBACK
    }

    /** 1000-DALYTRAN-GET-NEXT  (uuid:357c6e8e-8fe9-feb3-edaf-5ca049be31ce, source lines 315-338). */
    public void p1000DalytranGetNext() {
        // COBOL [READ]: READ DALYTRAN-FILE INTO DALYTRAN-RECORD
        if (java.util.Objects.equals(this.dalytranStatus, "00")) {
            // TODO: translate body for: DALYTRAN-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 2000-LOOKUP-XREF  (uuid:4142037e-89d9-b91f-2bb2-cb495718756d, source lines 340-352). */
    public void p2000LookupXref() {
        // MOVE XREF-CARD-NUM TO FD-XREF-CARD-NUM  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [READ]: READ XREF-FILE RECORD INTO CARD-XREF-RECORD KEY IS FD-XREF-CARD-NUM INVALID KEY DISPLAY 'INVALID CARD NUMBER FOR XREF' MOVE 4 TO WS-XREF-READ-STATUS NOT INVALID KEY DISPLAY 'SUCCESSFUL READ OF XREF' DISPLAY 'CARD NUMBER: ' XREF-CARD-NUM DISPLAY 'ACCOUNT ID : ' XREF-ACCT-ID DISPLAY 'CUSTOMER ID: ' XREF-CUST-ID END-READ
    }

    /** 3000-READ-ACCOUNT  (uuid:3bd8e5a0-e5d0-e2d8-c95a-bf72142124d2, source lines 354-363). */
    public void p3000ReadAccount() {
        // MOVE ACCT-ID TO FD-ACCT-ID  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [READ]: READ ACCOUNT-FILE RECORD INTO ACCOUNT-RECORD KEY IS FD-ACCT-ID INVALID KEY DISPLAY 'INVALID ACCOUNT NUMBER FOUND' MOVE 4 TO WS-ACCT-READ-STATUS NOT INVALID KEY DISPLAY 'SUCCESSFUL READ OF ACCOUNT FILE' END-READ
    }

    /** 0000-DALYTRAN-OPEN  (uuid:d01ee873-ffa2-f121-27c0-1dc4e6cfb768, source lines 365-381). */
    public void p0000DalytranOpen() {
        this.applResult = 8;
        // COBOL [OPEN]: OPEN INPUT DALYTRAN-FILE
        if (java.util.Objects.equals(this.dalytranStatus, "00")) {
            // TODO: translate body for: DALYTRAN-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 0100-CUSTFILE-OPEN  (uuid:323b72f0-7617-25a0-c473-c7e1310dcd6a, source lines 384-400). */
    public void p0100CustfileOpen() {
        this.applResult = 8;
        // COBOL [OPEN]: OPEN INPUT CUSTOMER-FILE
        if (java.util.Objects.equals(this.custfileStatus, "00")) {
            // TODO: translate body for: CUSTFILE-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 0200-XREFFILE-OPEN  (uuid:c1438183-8f74-0254-9001-4763f2dce5a5, source lines 402-418). */
    public void p0200XreffileOpen() {
        this.applResult = 8;
        // COBOL [OPEN]: OPEN INPUT XREF-FILE
        if (java.util.Objects.equals(this.xreffileStatus, "00")) {
            // TODO: translate body for: XREFFILE-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 0300-CARDFILE-OPEN  (uuid:9d3966b9-e796-62d3-d989-c38f068083d1, source lines 420-436). */
    public void p0300CardfileOpen() {
        this.applResult = 8;
        // COBOL [OPEN]: OPEN INPUT CARD-FILE
        if (java.util.Objects.equals(this.cardfileStatus, "00")) {
            // TODO: translate body for: CARDFILE-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 0400-ACCTFILE-OPEN  (uuid:5cef9163-5b0c-a537-3036-100a9441b788, source lines 438-454). */
    public void p0400AcctfileOpen() {
        this.applResult = 8;
        // COBOL [OPEN]: OPEN INPUT ACCOUNT-FILE
        if (java.util.Objects.equals(this.acctfileStatus, "00")) {
            // TODO: translate body for: ACCTFILE-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 0500-TRANFILE-OPEN  (uuid:13560d56-5054-877b-da7e-cc139a801917, source lines 456-472). */
    public void p0500TranfileOpen() {
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

    /** 9000-DALYTRAN-CLOSE  (uuid:252c922f-0ef8-5980-cb38-bb00fb650d9d, source lines 474-490). */
    public void p9000DalytranClose() {
        // ADD (needs PIC-aware translation): ADD 8 TO ZERO GIVING APPL-RESULT;
        // COBOL [CLOSE]: CLOSE DALYTRAN-FILE
        if (java.util.Objects.equals(this.dalytranStatus, "00")) {
            // TODO: translate body for: DALYTRAN-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 9100-CUSTFILE-CLOSE  (uuid:e49a1509-4245-7991-4c2c-4bcff4dfb591, source lines 492-508). */
    public void p9100CustfileClose() {
        // ADD (needs PIC-aware translation): ADD 8 TO ZERO GIVING APPL-RESULT;
        // COBOL [CLOSE]: CLOSE CUSTOMER-FILE
        if (java.util.Objects.equals(this.custfileStatus, "00")) {
            // TODO: translate body for: CUSTFILE-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 9200-XREFFILE-CLOSE  (uuid:f1489087-6a2e-ff7a-ac50-738d2aca842f, source lines 510-526). */
    public void p9200XreffileClose() {
        // ADD (needs PIC-aware translation): ADD 8 TO ZERO GIVING APPL-RESULT;
        // COBOL [CLOSE]: CLOSE XREF-FILE
        if (java.util.Objects.equals(this.xreffileStatus, "00")) {
            // TODO: translate body for: XREFFILE-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 9300-CARDFILE-CLOSE  (uuid:92666367-e854-438c-67e7-3797247a8c97, source lines 528-544). */
    public void p9300CardfileClose() {
        // ADD (needs PIC-aware translation): ADD 8 TO ZERO GIVING APPL-RESULT;
        // COBOL [CLOSE]: CLOSE CARD-FILE
        if (java.util.Objects.equals(this.cardfileStatus, "00")) {
            // TODO: translate body for: CARDFILE-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 9400-ACCTFILE-CLOSE  (uuid:bd169ab3-a4ce-68ec-8321-c9fb2b2ef580, source lines 546-562). */
    public void p9400AcctfileClose() {
        // ADD (needs PIC-aware translation): ADD 8 TO ZERO GIVING APPL-RESULT;
        // COBOL [CLOSE]: CLOSE ACCOUNT-FILE
        if (java.util.Objects.equals(this.acctfileStatus, "00")) {
            // TODO: translate body for: ACCTFILE-STATUS = '00'
        }
        if (true /* TODO translate: APPL-AOK */) {
            // TODO: translate body for: APPL-AOK
        }
        // COBOL [EXIT]: EXIT
    }

    /** 9500-TRANFILE-CLOSE  (uuid:7f32ed22-360d-302a-9df7-578fd342f8a1, source lines 564-580). */
    public void p9500TranfileClose() {
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

    /** Z-ABEND-PROGRAM  (uuid:f2d96910-6a61-eecb-69cd-9e84889178f9, source lines 582-586). */
    public void zAbendProgram() {
        System.out.println("ABENDING PROGRAM");  // DISPLAY 'ABENDING PROGRAM'
        this.timing = 0;
        this.abcode = 999;
        // CALL CEE3ABD() — see external program CEE3ABD
    }

    /** Z-DISPLAY-IO-STATUS  (uuid:816ec91d-e512-6e2d-f31a-b0ed025d66dd, source lines 589-602). */
    public void zDisplayIoStatus() {
        if ((!this.ioStatus.toString().matches("-?\\d+(\\.\\d+)?")) || (java.util.Objects.equals(this.ioStat1, "9"))) {
            // TODO: translate body for: IO-STATUS NOT NUMERIC OR IO-STAT1 = '9'
        }
        // COBOL [EXIT]: EXIT
    }

    public static void main(String[] args) {
        new Cbtrn01c().mainPara();
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
