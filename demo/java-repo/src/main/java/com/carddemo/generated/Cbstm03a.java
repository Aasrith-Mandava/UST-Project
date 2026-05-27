// Generated from CBSTM03A.CBL - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_CBSTM03A.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * CBSTM03A (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: CBSTM03A.CBL
 */
public class Cbstm03a {

    /** TRNX-RECORD (uuid:b5fb07bc-e74f-53f9-a9e5-a259ceca795e, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnxRecord;

    /** TRNX-KEY (uuid:72d6c670-93c5-31a6-a51c-80f67a86ebd3, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnxKey;

    /** TRNX-CARD-NUM (uuid:52d5c313-e4d1-4f87-8a89-445f8a4e532c, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnxCardNum;

    /** TRNX-ID (uuid:97026557-751e-eaf2-5023-a87816a647e1, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnxId;

    /** TRNX-REST (uuid:739b5ed7-8af2-ea19-db2e-a3ca208136e7, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnxRest;

    /** TRNX-TYPE-CD (uuid:8a99fa01-d21f-7bf1-224a-5aa8cef16e9b, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnxTypeCd;

    /** TRNX-CAT-CD (uuid:9ed2c1fb-7835-7d5b-72d2-a14ec854709d, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnxCatCd;

    /** TRNX-SOURCE (uuid:83f3caba-2d38-c47c-3490-e9b4db282f64, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnxSource;

    /** TRNX-DESC (uuid:81fc32d2-8a9b-a6ad-a4d9-15053c70d9ee, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnxDesc;

    /** TRNX-AMT (uuid:3e13a0cb-97ae-ebce-717e-68d35c8f21ec, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnxAmt;

    /** TRNX-MERCHANT-ID (uuid:67bb15ce-0b5b-2e81-d48e-0e0172791b8c, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnxMerchantId;

    /** TRNX-MERCHANT-NAME (uuid:18d88597-64b0-461b-de2a-06853aed711d, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnxMerchantName;

    /** TRNX-MERCHANT-CITY (uuid:8352386c-1eba-1472-b43c-2b133077d7d2, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnxMerchantCity;

    /** TRNX-MERCHANT-ZIP (uuid:40950081-9277-dd88-17a8-ce37bc773819, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnxMerchantZip;

    /** TRNX-ORIG-TS (uuid:0e7879c4-c7fa-5dab-b62b-df98aec0abfd, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnxOrigTs;

    /** TRNX-PROC-TS (uuid:d5b82d8e-e761-797f-6fc4-2a8258aaf2db, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnxProcTs;

    /** CARD-XREF-RECORD (uuid:6f6584c1-76a4-a9e2-f17d-85b774e65b62, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardXrefRecord;

    /** XREF-CARD-NUM (uuid:a82d5445-86b2-4c6b-8c0d-70c6e30b31d7, level 5, PIC X(16).). */
    public String xrefCardNum;

    /** XREF-CUST-ID (uuid:ed7e59e2-d707-d43c-f845-aff3b0564662, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ xrefCustId;

    /** XREF-ACCT-ID (uuid:ee2efbf9-7768-b0a7-3cd1-4c9f8584b686, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ xrefAcctId;

    /** CUSTOMER-RECORD (uuid:1ae6a9d3-dc28-efcf-658e-43da0c579b1c, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ customerRecord;

    /** CUST-ID (uuid:12c99487-ce5f-c190-0d34-4852b17979ad, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ custId;

    /** CUST-FIRST-NAME (uuid:9aa8afb2-a49e-9190-f320-a339a0be9fba, level 5, PIC X(25).). */
    public String custFirstName;

    /** CUST-MIDDLE-NAME (uuid:ce8b74ec-f18c-a541-2bf8-9356e79ceea8, level 5, PIC X(25).). */
    public String custMiddleName;

    /** CUST-LAST-NAME (uuid:5456c1d9-ad34-bc14-2bfe-7c34b6e20eb1, level 5, PIC X(25).). */
    public String custLastName;

    /** CUST-ADDR-LINE-1 (uuid:6bfa0e33-7277-037b-6aa7-3714aeec03df, level 5, PIC X(50).). */
    public String custAddrLine1;

    /** CUST-ADDR-LINE-2 (uuid:1da0b9d8-dd9d-57bd-3f43-1d4f6557bf97, level 5, PIC X(50).). */
    public String custAddrLine2;

    /** CUST-ADDR-LINE-3 (uuid:debf1d65-ab3b-404f-0fca-bb025a1826cd, level 5, PIC X(50).). */
    public String custAddrLine3;

    /** CUST-ADDR-STATE-CD (uuid:62a8ecc7-bbba-be02-6a53-432111a5cdb4, level 5, PIC X(02).). */
    public String custAddrStateCd;

    /** CUST-ADDR-COUNTRY-CD (uuid:7ea802d9-cdea-ae71-276f-0fd6118a41b3, level 5, PIC X(03).). */
    public String custAddrCountryCd;

    /** CUST-ADDR-ZIP (uuid:bef388fa-2e81-5102-12c4-6dd19fdfa3f4, level 5, PIC X(10).). */
    public String custAddrZip;

    /** CUST-PHONE-NUM-1 (uuid:ccbb1dee-0322-7901-5bb3-efb73907361d, level 5, PIC X(15).). */
    public String custPhoneNum1;

    /** CUST-PHONE-NUM-2 (uuid:7167b794-b678-efe0-de19-bb6e555ab4d3, level 5, PIC X(15).). */
    public String custPhoneNum2;

    /** CUST-SSN (uuid:46b14c46-1840-c123-4cfb-4eed30ce6463, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ custSsn;

    /** CUST-GOVT-ISSUED-ID (uuid:647fe389-f19a-ce82-4f53-92365e855f9a, level 5, PIC X(20).). */
    public String custGovtIssuedId;

    /** CUST-DOB-YYYYMMDD (uuid:52b15b71-e5e1-0482-5c80-59f92ae8024d, level 5, PIC X(10).). */
    public String custDobYyyymmdd;

    /** CUST-EFT-ACCOUNT-ID (uuid:e659b2e0-544a-f0a7-0ed1-2e5f3d09a531, level 5, PIC X(10).). */
    public String custEftAccountId;

    /** CUST-PRI-CARD-HOLDER-IND (uuid:25385571-adf6-4419-85a7-a14bc7db8164, level 5, PIC X(01).). */
    public String custPriCardHolderInd;

    /** CUST-FICO-CREDIT-SCORE (uuid:1c0dc98b-431c-cf85-1cad-9a17c41a9fb1, level 5, PIC 9(03).). */
    public int /* PIC 9(03). */ custFicoCreditScore;

    /** ACCOUNT-RECORD (uuid:34304fb6-d99e-9af8-6812-efa3025ae49f, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ accountRecord;

    /** ACCT-ID (uuid:b286f0ac-99f3-7733-14fe-78a2de89dc62, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ acctId;

    /** ACCT-ACTIVE-STATUS (uuid:8f2f9cb4-7804-1004-7362-653c4f44e99c, level 5, PIC X(01).). */
    public String acctActiveStatus;

    /** ACCT-CURR-BAL (uuid:cc50ac0d-10d6-ffce-108f-f1ebf26ecbd1, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrBal;

    /** ACCT-CREDIT-LIMIT (uuid:910e6853-0811-d90f-4807-1707679e2209, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCreditLimit;

    /** ACCT-CASH-CREDIT-LIMIT (uuid:09ea91c8-4667-7442-1913-e01ba3c6c71d, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCashCreditLimit;

    /** ACCT-OPEN-DATE (uuid:0c47e72e-a2c4-ffca-bfec-548483b75f85, level 5, PIC X(10).). */
    public String acctOpenDate;

    /** ACCT-EXPIRAION-DATE (uuid:c2abeaf0-0435-5bab-7b9e-e7faedb9f369, level 5, PIC X(10).). */
    public String acctExpiraionDate;

    /** ACCT-REISSUE-DATE (uuid:4d15e968-1b15-f531-04bc-6971349a0202, level 5, PIC X(10).). */
    public String acctReissueDate;

    /** ACCT-CURR-CYC-CREDIT (uuid:b8e9da52-50e6-f1ed-a042-be3990912516, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrCycCredit;

    /** ACCT-CURR-CYC-DEBIT (uuid:f1dab622-913d-7b08-40fd-43a858971cfe, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrCycDebit;

    /** ACCT-ADDR-ZIP (uuid:146cc36a-a2dd-4c94-6061-6ba3fa3e269d, level 5, PIC X(10).). */
    public String acctAddrZip;

    /** ACCT-GROUP-ID (uuid:628dfb95-886c-c516-670b-2553dbeb4b6f, level 5, PIC X(10).). */
    public String acctGroupId;

    /** COMP-VARIABLES (uuid:eaf9f2e4-304c-7522-fec7-c21e07b55b5f, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ compVariables;

    /** CR-CNT (uuid:85c07b75-a977-4b89-7a85-ed08470dc835, level 5, PIC S9(4)). */
    public int /* PIC S9(4) signed */ crCnt;

    /** TR-CNT (uuid:d95a835b-1c3f-21a1-9c71-620188875b80, level 5, PIC S9(4)). */
    public int /* PIC S9(4) signed */ trCnt;

    /** CR-JMP (uuid:7192354a-0f2a-ba22-cc03-05d21d4c60e0, level 5, PIC S9(4)). */
    public int /* PIC S9(4) signed */ crJmp;

    /** TR-JMP (uuid:2dfbe2d0-731d-b941-a962-9e081874ef4c, level 5, PIC S9(4)). */
    public int /* PIC S9(4) signed */ trJmp;

    /** COMP3-VARIABLES (uuid:08405662-b730-b959-17bf-d57505f874c1, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ comp3Variables;

    /** WS-TOTAL-AMT (uuid:27cd5777-55d6-b336-9481-9d5a3217ee75, level 5, PIC S9(9)V99). */
    public BigDecimal /* precision=11, scale=2, signed */ wsTotalAmt;

    /** MISC-VARIABLES (uuid:2867d947-4e8f-8ea8-d6ba-837c094816fc, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ miscVariables;

    /** WS-FL-DD (uuid:5c74cf25-b41e-ebb0-696c-a369cc3d6b1f, level 5, PIC X(8)). */
    public String wsFlDd;

    /** WS-TRN-AMT (uuid:1e7343ae-965d-1ba6-0096-e8d6655f7fec, level 5, PIC S9(9)V99). */
    public BigDecimal /* precision=11, scale=2, signed */ wsTrnAmt;

    /** WS-SAVE-CARD (uuid:b3d0669f-03a1-1153-3b08-b9093af85427, level 5, PIC X(16).). */
    public String wsSaveCard;

    /** END-OF-FILE (uuid:3c88800f-c468-824e-95fa-a49a374fbd44, level 5, PIC X(01)). */
    public String endOfFile;

    /** WS-M03B-AREA (uuid:6dc3fea8-a55f-04c7-75a9-39b3d768e8a6, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsM03bArea;

    /** WS-M03B-DD (uuid:4b47db30-9d14-30ed-2c82-f60547134b41, level 5, PIC X(08).). */
    public String wsM03bDd;

    /** WS-M03B-OPER (uuid:263fcaa5-bfdb-b449-4cc6-83427c7e6edf, level 5, PIC X(01).). */
    public String wsM03bOper;

    /** WS-M03B-RC (uuid:61ff5d04-1b16-2f7b-7b49-56af1e318b0d, level 5, PIC X(02).). */
    public String wsM03bRc;

    /** WS-M03B-KEY (uuid:ebcad924-fe81-913c-7b88-73d9091878fb, level 5, PIC X(25).). */
    public String wsM03bKey;

    /** WS-M03B-KEY-LN (uuid:0a1206e3-caa6-47be-ce75-2049441dc3ba, level 5, PIC S9(4).). */
    public int /* PIC S9(4). signed */ wsM03bKeyLn;

    /** WS-M03B-FLDT (uuid:c5f48551-c30d-0a62-4384-a7c09212afad, level 5, PIC X(1000).). */
    public String wsM03bFldt;

    /** STATEMENT-LINES (uuid:02a284e9-76e9-6f05-7ab6-93886ea2e784, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ statementLines;

    /** ST-LINE0 (uuid:eb4e6374-deb0-c5ca-5e15-fa3823417d6b, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ stLine0;

    /** ST-LINE1 (uuid:bdb2cd36-87df-de6b-f20e-874d7fd69e65, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ stLine1;

    /** ST-NAME (uuid:2e3708ba-4558-6d34-6f2c-bc55128295e5, level 10, PIC X(75).). */
    public String stName;

    /** ST-LINE2 (uuid:c7376df4-9c38-8cb0-49ba-b40a1ade58f9, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ stLine2;

    /** ST-ADD1 (uuid:ed576470-3ec2-f5b4-5465-77154a58514a, level 10, PIC X(50).). */
    public String stAdd1;

    /** ST-LINE3 (uuid:6948a6aa-fab5-a87e-afb6-072e0b07311d, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ stLine3;

    /** ST-ADD2 (uuid:70c8be5e-8b29-7e1d-47f5-0c474cdd4e6a, level 10, PIC X(50).). */
    public String stAdd2;

    /** ST-LINE4 (uuid:1a904f84-521e-daa9-e3fd-ed53588f35ce, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ stLine4;

    /** ST-ADD3 (uuid:585a4dde-d1ec-2413-8c25-9fa5e4f97c7d, level 10, PIC X(80).). */
    public String stAdd3;

    /** ST-LINE5 (uuid:02be091f-c868-a3c2-3038-0f8bcc3f9675, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ stLine5;

    /** ST-LINE6 (uuid:be502a56-9420-6b49-1887-34a29e7ce407, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ stLine6;

    /** ST-LINE7 (uuid:bb8bb4bc-e1d2-3454-07bf-14648281114a, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ stLine7;

    /** ST-ACCT-ID (uuid:29d03603-c205-4638-91d0-a1772a237360, level 10, PIC X(20).). */
    public String stAcctId;

    /** ST-LINE8 (uuid:0e719db0-3854-db98-bbfb-380e4f9514d3, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ stLine8;

    /** ST-CURR-BAL (uuid:11b75ae0-82ba-e13f-0a44-214db5f23412, level 10, PIC 9(9).99-.). */
    public long /* PIC 9(9).99-. */ stCurrBal;

    /** ST-LINE9 (uuid:1fc393bc-7944-24b7-5524-3ee068e65ae4, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ stLine9;

    /** ST-FICO-SCORE (uuid:824cb56d-7df8-ffcc-926c-f702e274ebbe, level 10, PIC X(20).). */
    public String stFicoScore;

    /** ST-LINE10 (uuid:9ab60993-a045-e7d9-0576-ed6303b45c92, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ stLine10;

    /** ST-LINE11 (uuid:89d72c1a-ac55-9303-e58c-cec4164bd7f4, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ stLine11;

    /** ST-LINE12 (uuid:902c3243-8fd3-de68-cac3-e4566853e56f, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ stLine12;

    /** ST-LINE13 (uuid:8d587eb9-d829-46c3-8fe0-4a44b0abb900, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ stLine13;

    /** ST-LINE14 (uuid:fde6ffb5-0dd6-bd0d-6c81-41598ae50c4b, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ stLine14;

    /** ST-TRANID (uuid:8d4c7854-8608-7d7b-fa52-8e2d652a5f73, level 10, PIC X(16).). */
    public String stTranid;

    /** ST-TRANDT (uuid:c2a05393-badb-29a8-6e45-c37c7f9f23ae, level 10, PIC X(49).). */
    public int /* PIC X(49). */ stTrandt;

    /** ST-TRANAMT (uuid:944b3c5d-aaa4-7d12-c7b7-0668d74ceb96, level 10, PIC Z(9).99-.). */
    public int /* PIC Z(9).99-. */ stTranamt;

    /** ST-LINE14A (uuid:a67d4311-d478-c7c5-32c0-d73039046110, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ stLine14a;

    /** ST-TOTAL-TRAMT (uuid:92998766-94e7-408c-0f00-2256e0f2dfe1, level 10, PIC Z(9).99-.). */
    public int /* PIC Z(9).99-. */ stTotalTramt;

    /** ST-LINE15 (uuid:843325bd-47ca-2321-7a23-ac560145c4d5, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ stLine15;

    /** HTML-LINES (uuid:23f5db52-3247-c2d1-8caa-4c01e47e947b, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ htmlLines;

    /** HTML-FIXED-LN (uuid:0cf4e800-7d0a-53d0-a52d-966c6d29b158, level 5, PIC X(100).). */
    public String htmlFixedLn;

    /** HTML-L11 (uuid:4a34b424-67a5-7026-a9ff-92cf006acc12, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ htmlL11;

    /** L11-ACCT (uuid:9a34e750-af9d-d992-a68c-6cef765e8431, level 10, PIC X(20).). */
    public String l11Acct;

    /** HTML-L23 (uuid:63729adc-c20f-cac5-2431-72a90f741408, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ htmlL23;

    /** L23-NAME (uuid:cde1b5ff-6cb9-5f53-2b79-8b9051e59bfc, level 10, PIC X(50).). */
    public String l23Name;

    /** HTML-ADDR-LN (uuid:e1ab763e-28a9-b775-9866-96ac224859e2, level 5, PIC X(100).). */
    public String htmlAddrLn;

    /** HTML-BSIC-LN (uuid:62ce9c80-8bd6-5310-8d29-fbff61e0c995, level 5, PIC X(100).). */
    public String htmlBsicLn;

    /** HTML-TRAN-LN (uuid:b9fe1c00-7c17-5c42-e888-e2226c376206, level 5, PIC X(100).). */
    public String htmlTranLn;

    /** WS-TRNX-TABLE (uuid:272e9b76-78c0-3012-3746-f2fde9039334, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTrnxTable;

    /** WS-CARD-TBL (uuid:d38b1932-9ca3-e528-ec80-d21ca0c9d7f6, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCardTbl;

    /** WS-CARD-NUM (uuid:98f231c1-874a-028e-0ba1-680e861a7779, level 10, PIC X(16).). */
    public String wsCardNum;

    /** WS-TRAN-TBL (uuid:f5aca5c8-a323-fde5-fc9a-7a6087fa3025, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTranTbl;

    /** WS-TRAN-NUM (uuid:97e74f01-ce0a-d7fc-8c53-3e9aee3313a5, level 15, PIC X(16).). */
    public String wsTranNum;

    /** WS-TRAN-REST (uuid:2c9ab2cc-3e49-fab5-387b-63b1e40c79a9, level 15, PIC X(318).). */
    public String wsTranRest;

    /** WS-TRN-TBL-CNTR (uuid:89f3dc37-8fba-00dc-8e85-7aab23c95758, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTrnTblCntr;

    /** WS-TRN-TBL-CTR (uuid:9c199ce5-5868-46c0-5d16-9ef912c4c3a9, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTrnTblCtr;

    /** WS-TRCT (uuid:dfd052cb-d5ee-7d7c-36a2-c5050dd37778, level 10, PIC S9(4) COMP). */
    public int /* PIC S9(4) signed */ wsTrct;

    /** PSAPTR (uuid:43766419-56a1-912c-5f2f-045e75d50db3, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ psaptr;

    /** BUMP-TIOT (uuid:14c0c85c-e880-5466-cb84-5d157ad8b908, level 1, PIC S9(08) BINARY). */
    public int /* PIC S9(08) signed */ bumpTiot;

    /** TIOT-INDEX (uuid:4acb0a86-581d-7213-bc80-90568026c118, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tiotIndex;


    // --- auto-generated stubs for undeclared references ---
    public Object fdHtmlfileRec;  // auto-stub for undeclared reference
    public Object until;  // auto-stub for undeclared reference
    public Object varying;  // auto-stub for undeclared reference

    /** 0000-START  (uuid:9daafa61-f1fa-2341-669d-f954d597412b, source lines 380-398). */
    public void p0000Start() {
        // EVALUATE WS-FL-DD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-FL-DD */) { /* WHEN branches follow */ }
    }

    /** 1000-MAINLINE  (uuid:f7468c97-ef2e-f5ad-c3ad-d214a60231d3, source lines 400-423). */
    public void p1000Mainline() {
        this.until();  // PERFORM
        // COBOL [PERFORM]: PERFORM 9100-TRNXFILE-CLOSE
        // COBOL [PERFORM]: PERFORM 9200-XREFFILE-CLOSE
        // COBOL [PERFORM]: PERFORM 9300-CUSTFILE-CLOSE
        // COBOL [PERFORM]: PERFORM 9400-ACCTFILE-CLOSE
        // COBOL [CLOSE]: CLOSE STMT-FILE HTML-FILE
    }

    /** 9999-GOBACK  (uuid:5ffd3c99-a817-06a0-4ea1-99dc33d36b5e, source lines 425-426). */
    public void p9999Goback() {
        // COBOL [GO_BACK]: GOBACK
    }

    /** 1000-XREFFILE-GET-NEXT  (uuid:c5a02fd4-59c2-28e7-49d4-f3676b28a21b, source lines 429-450). */
    public void p1000XreffileGetNext() {
        this.wsM03bDd = "XREFFILE";
        // SET M03B-READ TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsM03bRc = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
        this.wsM03bFldt = "";
        // CALL CBSTM03B() — see external program CBSTM03B
        // EVALUATE WS-M03B-RC
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-M03B-RC */) { /* WHEN branches follow */ }
        // MOVE WS-M03B-FLDT TO CARD-XREF-RECORD  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [EXIT]: EXIT
    }

    /** 2000-CUSTFILE-GET  (uuid:7ca547ec-0406-73e1-233b-2cf300e7733c, source lines 452-474). */
    public void p2000CustfileGet() {
        this.wsM03bDd = "CUSTFILE";
        // SET M03B-READ-K TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // MOVE XREF-CUST-ID TO WS-M03B-KEY  -- identifier MOVE; needs PIC-aware type coercion
        this.wsM03bKeyLn = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
        // COMPUTE (needs PIC-aware expression translation): COMPUTE WS-M03B-KEY-LN = LENGTH OF XREF-CUST-ID;
        this.wsM03bRc = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
        this.wsM03bFldt = "";
        // CALL CBSTM03B() — see external program CBSTM03B
        // EVALUATE WS-M03B-RC
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-M03B-RC */) { /* WHEN branches follow */ }
        // MOVE WS-M03B-FLDT TO CUSTOMER-RECORD  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [EXIT]: EXIT
    }

    /** 3000-ACCTFILE-GET  (uuid:5a653840-afeb-360f-9ef0-5e1685d9c164, source lines 476-498). */
    public void p3000AcctfileGet() {
        this.wsM03bDd = "ACCTFILE";
        // SET M03B-READ-K TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // MOVE XREF-ACCT-ID TO WS-M03B-KEY  -- identifier MOVE; needs PIC-aware type coercion
        this.wsM03bKeyLn = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
        // COMPUTE (needs PIC-aware expression translation): COMPUTE WS-M03B-KEY-LN = LENGTH OF XREF-ACCT-ID;
        this.wsM03bRc = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
        this.wsM03bFldt = "";
        // CALL CBSTM03B() — see external program CBSTM03B
        // EVALUATE WS-M03B-RC
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-M03B-RC */) { /* WHEN branches follow */ }
        // MOVE WS-M03B-FLDT TO ACCOUNT-RECORD  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [EXIT]: EXIT
    }

    /** 4000-TRNXFILE-GET  (uuid:af439f1a-d160-7d39-d50f-c7b2faa4a2be, source lines 500-540). */
    public void p4000TrnxfileGet() {
        this.varying();  // PERFORM
        // MOVE WS-TOTAL-AMT TO WS-TRN-AMT  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-TRN-AMT TO ST-TOTAL-TRAMT  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE12
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE14A
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE15
        // SET HTML-LTRS TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L10 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L75 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTDE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTRE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L78 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L79 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L80 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // COBOL [EXIT]: EXIT
    }

    /** 5000-CREATE-STATEMENT  (uuid:c420cfe5-0e4f-5833-ebea-e94a1c15d9fd, source lines 542-588). */
    public void p5000CreateStatement() {
        // INITIALIZE statementLines: reset to PIC defaults
        this.statementLines = null;  // TODO: set to type-appropriate zero/spaces
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE0
        // COBOL [PERFORM]: PERFORM 5100-WRITE-HTML-HEADER THRU 5100-EXIT
        // COBOL [STRING]: STRING CUST-FIRST-NAME DELIMITED BY ' ' ' ' DELIMITED BY SIZE CUST-MIDDLE-NAME DELIMITED BY ' ' ' ' DELIMITED BY SIZE CUST-LAST-NAME DELIMITED BY ' ' ' ' DELIMITED BY SIZE INTO ST-NAME END-STRING
        // MOVE CUST-ADDR-LINE-1 TO ST-ADD1  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-ADDR-LINE-2 TO ST-ADD2  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [STRING]: STRING CUST-ADDR-LINE-3 DELIMITED BY ' ' ' ' DELIMITED BY SIZE CUST-ADDR-STATE-CD DELIMITED BY ' ' ' ' DELIMITED BY SIZE CUST-ADDR-COUNTRY-CD DELIMITED BY ' ' ' ' DELIMITED BY SIZE CUST-ADDR-ZIP DELIMITED BY ' ' ' ' DELIMITED BY SIZE INTO ST-ADD3 END-STRING
        // MOVE ACCT-ID TO ST-ACCT-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-CURR-BAL TO ST-CURR-BAL  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-FICO-CREDIT-SCORE TO ST-FICO-SCORE  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 5200-WRITE-HTML-NMADBS THRU 5200-EXIT
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE1
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE2
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE3
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE4
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE5
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE6
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE5
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE7
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE8
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE9
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE10
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE11
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE12
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE13
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE12
        // COBOL [EXIT]: EXIT
    }

    /** 5100-WRITE-HTML-HEADER  (uuid:04050b47-1fa1-2aa9-6b3e-9374f91613b1, source lines 590-636). */
    public void p5100WriteHtmlHeader() {
        // SET HTML-L01 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L02 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L03 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L04 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L05 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L06 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L07 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L08 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTRS TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L10 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // MOVE ACCT-ID TO L11-ACCT  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-L11
        // SET HTML-LTDE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTRE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTRS TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L15 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L16 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L17 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L18 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTDE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTRE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTRS TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L22-35 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
    }

    /** 5100-EXIT  (uuid:190a2c8a-7aa9-0730-a9c0-6e18ab26d395, source lines 638-639). */
    public void p5100Exit() {
        // COBOL [EXIT]: EXIT
    }

    /** 5200-WRITE-HTML-NMADBS  (uuid:54e28fa2-2a2e-a0e0-2695-9d86409febba, source lines 642-753). */
    public void p5200WriteHtmlNmadbs() {
        // MOVE ST-NAME TO L23-NAME  -- identifier MOVE; needs PIC-aware type coercion
        this.fdHtmlfileRec = "";
        // COBOL [STRING]: STRING '<p style="font-size:16px">' DELIMITED BY '*' L23-NAME DELIMITED BY ' ' ' ' DELIMITED BY SIZE '</p>' DELIMITED BY '*' INTO FD-HTMLFILE-REC END-STRING
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC
        this.htmlAddrLn = "";
        // COBOL [STRING]: STRING '<p>' DELIMITED BY '*' ST-ADD1 DELIMITED BY ' ' ' ' DELIMITED BY SIZE '</p>' DELIMITED BY '*' INTO HTML-ADDR-LN END-STRING
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-ADDR-LN
        this.htmlAddrLn = "";
        // COBOL [STRING]: STRING '<p>' DELIMITED BY '*' ST-ADD2 DELIMITED BY ' ' ' ' DELIMITED BY SIZE '</p>' DELIMITED BY '*' INTO HTML-ADDR-LN END-STRING
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-ADDR-LN
        this.htmlAddrLn = "";
        // COBOL [STRING]: STRING '<p>' DELIMITED BY '*' ST-ADD3 DELIMITED BY ' ' ' ' DELIMITED BY SIZE '</p>' DELIMITED BY '*' INTO HTML-ADDR-LN END-STRING
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-ADDR-LN
        // SET HTML-LTDE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTRE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTRS TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L30-42 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L31 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTDE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTRE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTRS TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L22-35 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        this.htmlBsicLn = "";
        // COBOL [STRING]: STRING '<p>Account ID : ' DELIMITED BY '*' ST-ACCT-ID DELIMITED BY '*' '</p>' DELIMITED BY '*' INTO HTML-BSIC-LN END-STRING
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-BSIC-LN
        this.htmlBsicLn = "";
        // COBOL [STRING]: STRING '<p>Current Balance : ' DELIMITED BY '*' ST-CURR-BAL DELIMITED BY '*' '</p>' DELIMITED BY '*' INTO HTML-BSIC-LN END-STRING
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-BSIC-LN
        this.htmlBsicLn = "";
        // COBOL [STRING]: STRING '<p>FICO Score : ' DELIMITED BY '*' ST-FICO-SCORE DELIMITED BY '*' '</p>' DELIMITED BY '*' INTO HTML-BSIC-LN END-STRING
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-BSIC-LN
        // SET HTML-LTDE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTRE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTRS TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L30-42 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L43 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTDE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTRE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTRS TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L47 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L48 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTDE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L50 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L51 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTDE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L53 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L54 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTDE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTRE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
    }

    /** 5200-EXIT  (uuid:879ba8d0-e74b-1e15-80f9-ecdb5959add4, source lines 755-756). */
    public void p5200Exit() {
        // COBOL [EXIT]: EXIT
    }

    /** 6000-WRITE-TRANS  (uuid:adbe85b5-9dd7-5ca5-6829-7042fcdf53a8, source lines 759-807). */
    public void p6000WriteTrans() {
        // MOVE TRNX-ID TO ST-TRANID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TRNX-DESC TO ST-TRANDT  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TRNX-AMT TO ST-TRANAMT  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [WRITE]: WRITE FD-STMTFILE-REC FROM ST-LINE14
        // SET HTML-LTRS TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L58 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        this.htmlTranLn = "";
        // COBOL [STRING]: STRING '<p>' DELIMITED BY '*' ST-TRANID DELIMITED BY '*' '</p>' DELIMITED BY '*' INTO HTML-TRAN-LN END-STRING
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-TRAN-LN
        // SET HTML-LTDE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L61 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        this.htmlTranLn = "";
        // COBOL [STRING]: STRING '<p>' DELIMITED BY '*' ST-TRANDT DELIMITED BY '*' '</p>' DELIMITED BY '*' INTO HTML-TRAN-LN END-STRING
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-TRAN-LN
        // SET HTML-LTDE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-L64 TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        this.htmlTranLn = "";
        // COBOL [STRING]: STRING '<p>' DELIMITED BY '*' ST-TRANAMT DELIMITED BY '*' '</p>' DELIMITED BY '*' INTO HTML-TRAN-LN END-STRING
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-TRAN-LN
        // SET HTML-LTDE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // SET HTML-LTRE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [WRITE]: WRITE FD-HTMLFILE-REC FROM HTML-FIXED-LN
        // COBOL [EXIT]: EXIT
    }

    /** 8100-FILE-OPEN  (uuid:765ce9e3-8975-6a15-34db-9aa0c95f0ee8, source lines 810-812). */
    public void p8100FileOpen() {
        // COBOL [GO_TO]: GO TO 8100-TRNXFILE-OPEN
    }

    /** 8100-TRNXFILE-OPEN  (uuid:ca109c49-6153-9fca-8fd1-c79b36ffb87d, source lines 814-846). */
    public void p8100TrnxfileOpen() {
        this.wsM03bDd = "TRNXFILE";
        // SET M03B-OPEN TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsM03bRc = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
        // CALL CBSTM03B() — see external program CBSTM03B
        if (java.util.Objects.equals(this.wsM03bRc, "00")) {
            // TODO: translate body for: WS-M03B-RC = '00' OR '04'
        }
        // SET M03B-READ TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsM03bFldt = "";
        // CALL CBSTM03B() — see external program CBSTM03B
        if (java.util.Objects.equals(this.wsM03bRc, "00")) {
            // TODO: translate body for: WS-M03B-RC = '00' OR '04'
        }
        // MOVE WS-M03B-FLDT TO TRNX-RECORD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TRNX-CARD-NUM TO WS-SAVE-CARD  -- identifier MOVE; needs PIC-aware type coercion
        this.crCnt = 1;
        this.trCnt = 0;
        this.wsFlDd = "READTRNX";
        // COBOL [GO_TO]: GO TO 0000-START
        // COBOL [EXIT]: EXIT
    }

    /** 8200-XREFFILE-OPEN  (uuid:d81aaa2b-da6c-7c59-9b44-f122bfff638b, source lines 849-865). */
    public void p8200XreffileOpen() {
        this.wsM03bDd = "XREFFILE";
        // SET M03B-OPEN TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsM03bRc = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
        // CALL CBSTM03B() — see external program CBSTM03B
        if (java.util.Objects.equals(this.wsM03bRc, "00")) {
            // TODO: translate body for: WS-M03B-RC = '00' OR '04'
        }
        this.wsFlDd = "CUSTFILE";
        // COBOL [GO_TO]: GO TO 0000-START
        // COBOL [EXIT]: EXIT
    }

    /** 8300-CUSTFILE-OPEN  (uuid:f2b4e042-894c-5717-b704-33cc7e0e1d2b, source lines 867-883). */
    public void p8300CustfileOpen() {
        this.wsM03bDd = "CUSTFILE";
        // SET M03B-OPEN TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsM03bRc = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
        // CALL CBSTM03B() — see external program CBSTM03B
        if (java.util.Objects.equals(this.wsM03bRc, "00")) {
            // TODO: translate body for: WS-M03B-RC = '00' OR '04'
        }
        this.wsFlDd = "ACCTFILE";
        // COBOL [GO_TO]: GO TO 0000-START
        // COBOL [EXIT]: EXIT
    }

    /** 8400-ACCTFILE-OPEN  (uuid:fd3f32fc-a88b-1fe1-833f-d149db0eefe9, source lines 885-900). */
    public void p8400AcctfileOpen() {
        this.wsM03bDd = "ACCTFILE";
        // SET M03B-OPEN TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsM03bRc = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
        // CALL CBSTM03B() — see external program CBSTM03B
        if (java.util.Objects.equals(this.wsM03bRc, "00")) {
            // TODO: translate body for: WS-M03B-RC = '00' OR '04'
        }
        // COBOL [GO_TO]: GO TO 1000-MAINLINE
        // COBOL [EXIT]: EXIT
    }

    /** 8500-READTRNX-READ  (uuid:f8233443-7db6-7225-746a-42e586a1083f, source lines 902-931). */
    public void p8500ReadtrnxRead() {
        if (java.util.Objects.equals(this.wsSaveCard, this.trnxCardNum)) {
            // TODO: translate body for: WS-SAVE-CARD = TRNX-CARD-NUM
        }
        // MOVE TRNX-CARD-NUM TO WS-CARD-NUM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TRNX-ID TO WS-TRAN-NUM, TR-CNT)  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TRNX-REST TO WS-TRAN-REST, TR-CNT)  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TRNX-CARD-NUM TO WS-SAVE-CARD  -- identifier MOVE; needs PIC-aware type coercion
        this.wsM03bDd = "TRNXFILE";
        // SET M03B-READ TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsM03bFldt = "";
        // CALL CBSTM03B() — see external program CBSTM03B
        // EVALUATE WS-M03B-RC
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-M03B-RC */) { /* WHEN branches follow */ }
    }

    /** 8599-EXIT  (uuid:29e4971a-eea7-a087-adf7-4ad1cb4f5645, source lines 933-937). */
    public void p8599Exit() {
        // MOVE TR-CNT TO WS-TRCT  -- identifier MOVE; needs PIC-aware type coercion
        this.wsFlDd = "XREFFILE";
        // COBOL [GO_TO]: GO TO 0000-START
        // COBOL [EXIT]: EXIT
    }

    /** 9100-TRNXFILE-CLOSE  (uuid:9fd5fdca-302c-b404-8e79-7b109bf981c3, source lines 940-954). */
    public void p9100TrnxfileClose() {
        this.wsM03bDd = "TRNXFILE";
        // SET M03B-CLOSE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsM03bRc = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
        // CALL CBSTM03B() — see external program CBSTM03B
        if (java.util.Objects.equals(this.wsM03bRc, "00")) {
            // TODO: translate body for: WS-M03B-RC = '00' OR '04'
        }
        // COBOL [EXIT]: EXIT
    }

    /** 9200-XREFFILE-CLOSE  (uuid:2be85350-0343-1ce3-ef99-d4b4430744c8, source lines 957-971). */
    public void p9200XreffileClose() {
        this.wsM03bDd = "XREFFILE";
        // SET M03B-CLOSE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsM03bRc = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
        // CALL CBSTM03B() — see external program CBSTM03B
        if (java.util.Objects.equals(this.wsM03bRc, "00")) {
            // TODO: translate body for: WS-M03B-RC = '00' OR '04'
        }
        // COBOL [EXIT]: EXIT
    }

    /** 9300-CUSTFILE-CLOSE  (uuid:3c1a9642-6d2d-ee42-e477-fff05741ffbe, source lines 973-987). */
    public void p9300CustfileClose() {
        this.wsM03bDd = "CUSTFILE";
        // SET M03B-CLOSE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsM03bRc = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
        // CALL CBSTM03B() — see external program CBSTM03B
        if (java.util.Objects.equals(this.wsM03bRc, "00")) {
            // TODO: translate body for: WS-M03B-RC = '00' OR '04'
        }
        // COBOL [EXIT]: EXIT
    }

    /** 9400-ACCTFILE-CLOSE  (uuid:143882bb-d71f-8800-7060-72ccbef5221d, source lines 989-1003). */
    public void p9400AcctfileClose() {
        this.wsM03bDd = "ACCTFILE";
        // SET M03B-CLOSE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsM03bRc = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
        // CALL CBSTM03B() — see external program CBSTM03B
        if (java.util.Objects.equals(this.wsM03bRc, "00")) {
            // TODO: translate body for: WS-M03B-RC = '00' OR '04'
        }
        // COBOL [EXIT]: EXIT
    }

    /** 9999-ABEND-PROGRAM  (uuid:fed87b28-756b-0581-4b35-b2597c80f291, source lines 1005-1007). */
    public void p9999AbendProgram() {
        System.out.println("ABENDING PROGRAM");  // DISPLAY 'ABENDING PROGRAM'
        // CALL CEE3ABD() — see external program CEE3ABD
    }

    public static void main(String[] args) {
        new Cbstm03a().mainPara();
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
