// Generated from COTRN02C.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COTRN02C.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * This CICS program `COTRN02C` facilitates the processing and addition of new transactions
 * to a file. It handles user input received from a CICS screen, validates the provided
 * transaction data, and then persists the new transaction record. The program also supports
 * reading previous transactions during a browse operation and managing CICS screen flow.
 *
 * <p><strong>Responsibilities:</strong>
 * <ul>
 *   <li>Manage CICS screen interactions for transaction entry and display.
 *   <li>Validate user input for transaction key and data fields.
 *   <li>Add new transaction records to the `WS-TRANSACT-FILE`.
 *   <li>Perform VSAM file operations including sequential browsing (`STARTBR`, `READPREV`, `ENDBR`) and writing records.
 *   <li>Copy data from the last transaction for potential re-use or display.
 *   <li>Handle program control flow, including transferring to other CICS programs.
 *   <li>Initialize program fields and clear screen contents.
 * </ul>
 *
 * <p><strong>External dependencies:</strong>
 * <ul>
 *   <li>called programs: CSUTLDTC, CDEMO-TO-PROGRAM
 *   <li>files: WS-CXACAIX-FILE, WS-CCXREF-FILE, WS-TRANSACT-FILE
 *   <li>copybooks: COCOM01Y, COTRN02, COTTL01Y, CSDAT01Y, CSMSG01Y, CVTRA05Y, CVACT01Y, CVACT03Y, DFHAID, DFHBMSCA
 * </ul>
 *
 * <p><strong>Migration risks:</strong>
 * <ul>
 *   <li>CICS Screen Handling: The translation of BMS screen mapping and CICS commands (SEND, RECEIVE) to a modern UI framework or API requires careful design.
 *   <li>VSAM File I/O with Browse: Complex VSAM operations like `STARTBR`, `READPREV`, and `ENDBR` for reverse sequential browsing will need robust mapping to modern database cursor or pagination mechanisms.
 *   <li>External COBOL CALLs: The static calls to external COBOL programs (`CSUTLDTC`, `CDEMO-TO-PROGRAM`) require analysis to either re-implement the called functionality in Java or define clear service interfaces for integration.
 *   <li>Data Validation Logic: The extensive data validation logic within `VALIDATE-INPUT-DATA-FIELDS` must be accurately translated and potentially refactored into a more modular and testable validation service in Java.
 *   <li>CICS XCTL Command: The `XCTL` command in `RETURN-TO-PREV-SCREEN` indicates direct program transfer, requiring careful design for how application flow is managed in the Java equivalent.
 * </ul>
 *
 * <p>Source file: COTRN02C.cbl
 */
public class Cotrn02c {

    /** WS-VARIABLES (uuid:774bc53a-2101-649e-c6a7-741de9118cc0, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsVariables;

    /** WS-PGMNAME (uuid:c3e07d82-b224-bc78-c3f1-ea9e07a80f1a, level 5, PIC X(08)). */
    public String wsPgmname;

    /** WS-TRANID (uuid:85f0ccf9-ab69-685c-2e62-962f2ba31f3a, level 5, PIC X(04)). */
    public String wsTranid;

    /** WS-MESSAGE (uuid:10746ed2-f825-cdec-8796-3d89034da278, level 5, PIC X(80)). */
    public String wsMessage;

    /** WS-TRANSACT-FILE (uuid:265349a0-06e1-ee0b-681a-a9d20afb4e77, level 5, PIC X(08)). */
    public String wsTransactFile;

    /** WS-ACCTDAT-FILE (uuid:e08900a4-db72-d7c4-00b0-237660ca4015, level 5, PIC X(08)). */
    public String wsAcctdatFile;

    /** WS-CCXREF-FILE (uuid:69d606a6-0fc7-f16e-354c-f9a0e60df834, level 5, PIC X(08)). */
    public String wsCcxrefFile;

    /** WS-CXACAIX-FILE (uuid:91a68acd-7340-8eea-2796-3a1138a3e1ed, level 5, PIC X(08)). */
    public String wsCxacaixFile;

    /** WS-ERR-FLG (uuid:29db2adb-951e-6e9d-23f1-23cf70e2a7dc, level 5, PIC X(01)). */
    public String wsErrFlg;

    /** WS-RESP-CD (uuid:e5677c54-8de5-b2a6-f91e-9274301c294b, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsRespCd;

    /** WS-REAS-CD (uuid:e281a492-fee8-13d5-6cfa-443b7debf111, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsReasCd;

    /** WS-USR-MODIFIED (uuid:68f05175-92dd-d239-1298-5e2565b030e0, level 5, PIC X(01)). */
    public String wsUsrModified;

    /** WS-TRAN-AMT (uuid:2ea770f7-a3c7-cc89-792a-f955bbd7dda4, level 5, PIC +99999999.99.). */
    public long /* PIC +99999999.99. */ wsTranAmt;

    /** WS-TRAN-DATE (uuid:7ed71185-2d20-7577-fedd-83ed121c089c, level 5, PIC X(08)). */
    public String wsTranDate;

    /** WS-ACCT-ID-N (uuid:8c5e22f9-8a40-4903-8910-0b82fe372f05, level 5, PIC 9(11)). */
    public long /* PIC 9(11) */ wsAcctIdN;

    /** WS-CARD-NUM-N (uuid:f52383bb-02f2-b1d1-5f41-15be0202b709, level 5, PIC 9(16)). */
    public long /* PIC 9(16) */ wsCardNumN;

    /** WS-TRAN-ID-N (uuid:de5c84a2-3fc1-e22e-4f5c-ad240630db07, level 5, PIC 9(16)). */
    public long /* PIC 9(16) */ wsTranIdN;

    /** WS-TRAN-AMT-N (uuid:97f493ee-8a25-fab0-ee60-1ebe20d47fb0, level 5, PIC S9(9)V99). */
    public BigDecimal /* precision=11, scale=2, signed */ wsTranAmtN;

    /** WS-TRAN-AMT-E (uuid:d8b00726-cb6d-1ec2-7695-4b4f91fe2108, level 5, PIC +99999999.99). */
    public long /* PIC +99999999.99 */ wsTranAmtE;

    /** WS-DATE-FORMAT (uuid:0b08f8b0-a93f-3c1f-7864-0ae371a4d423, level 5, PIC X(10)). */
    public String wsDateFormat;

    /** CSUTLDTC-PARM (uuid:698bde0d-3078-a917-8fe2-57b915edc17b, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ csutldtcParm;

    /** CSUTLDTC-DATE (uuid:e2ec0d89-2362-34e3-24dd-44296524e6c3, level 5, PIC X(10).). */
    public String csutldtcDate;

    /** CSUTLDTC-DATE-FORMAT (uuid:1cc92672-67eb-4625-ac66-9903587f72b6, level 5, PIC X(10).). */
    public String csutldtcDateFormat;

    /** CSUTLDTC-RESULT (uuid:718d5470-0ebc-171c-a51b-f166fa54824a, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ csutldtcResult;

    /** CSUTLDTC-RESULT-SEV-CD (uuid:1ac6eb8a-6a84-b099-ec55-7bbcefc9303f, level 10, PIC X(04).). */
    public String csutldtcResultSevCd;

    /** CSUTLDTC-RESULT-MSG-NUM (uuid:b8458220-2665-d51c-a9ee-d6a61b474b78, level 10, PIC X(04).). */
    public String csutldtcResultMsgNum;

    /** CSUTLDTC-RESULT-MSG (uuid:7cfa296e-5fd9-47cd-a721-f4aedea11508, level 10, PIC X(61).). */
    public String csutldtcResultMsg;

    /** CARDDEMO-COMMAREA (uuid:fc997e77-1c24-d06d-0912-fd6b702c7680, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:01125621-fb8d-1371-0b71-191be31c0ef2, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:09c72cbe-8213-89ac-de75-6e8392dc54cb, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:a74e03d1-a872-bc12-b68d-e6fd98ab53f4, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:a7caa737-51fc-db00-75e2-298a2c66b626, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:7aeb21c2-0a30-24b7-8a37-fdeb2a057ed1, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:46b98362-daaa-4c47-b20c-9cc749ef5feb, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:60e3fda1-cccc-af97-adb2-c4a447b5efba, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:8f67219d-a722-6dc3-bb25-6f419245a1b9, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:6266d312-6a66-dd54-e6f0-c179935ce8dc, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:b88679fe-58de-3a80-43de-a4440427d80d, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:492cdce8-a89a-03e6-55e7-5094ee87fbc5, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:ff6d4d8b-1bda-6419-5a38-b157e093e772, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:ddf37238-9e94-2038-d9bc-c24aa1155eae, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:8f119e42-004d-ad02-5df3-fc4edcd2fb80, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:b0d82848-88ed-a706-8fd4-29bbef88d84e, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:e23d4216-08f7-0092-7718-6654a36e46b2, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:35d261c9-a0f3-7915-634b-8886dd303a2e, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:cbb9b60e-51f6-b4d1-e455-139e948dbad2, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:654806c5-a2bf-d2e6-c7f8-11bf9d45f62e, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:e8ae6e73-633e-67b9-a148-e3fd3f818060, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:ad9e1bdd-5e3b-a506-26ca-b145756d9fb8, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** CDEMO-CT02-INFO (uuid:981e88e7-0a0f-1e6c-2361-a2d674b0664b, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCt02Info;

    /** CDEMO-CT02-TRNID-FIRST (uuid:5360e9b3-7c91-3cf8-e205-7d83f0fc2ecd, level 10, PIC X(16).). */
    public String cdemoCt02TrnidFirst;

    /** CDEMO-CT02-TRNID-LAST (uuid:7f917b4f-c4a1-ca74-0f07-7f78a22bf190, level 10, PIC X(16).). */
    public String cdemoCt02TrnidLast;

    /** CDEMO-CT02-PAGE-NUM (uuid:3369284f-2acd-a454-b797-1787391e306e, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ cdemoCt02PageNum;

    /** CDEMO-CT02-NEXT-PAGE-FLG (uuid:65ea7c57-6601-3905-5d38-53786bd92493, level 10, PIC X(01)). */
    public String cdemoCt02NextPageFlg;

    /** CDEMO-CT02-TRN-SEL-FLG (uuid:abb9559d-f05d-f830-9658-77308ce50cfe, level 10, PIC X(01).). */
    public String cdemoCt02TrnSelFlg;

    /** CDEMO-CT02-TRN-SELECTED (uuid:79860fb0-4d05-cc88-8385-7947c016f016, level 10, PIC X(16).). */
    public String cdemoCt02TrnSelected;

    /** COTRN2AI (uuid:e40a23fb-a9fb-de78-4872-777a4ec5b345, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cotrn2ai;

    /** TRNNAMEL (uuid:a2e5f18c-0a6b-342b-9f9a-6a66c2a8f0e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamel;

    /** TRNNAMEF (uuid:bd869b3a-fbe3-af40-1ecb-af5166566827, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamef;

    /** TRNNAMEA (uuid:63b79a6f-2267-cec3-a940-4b7a198dc0ef, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamea;

    /** TRNNAMEI (uuid:6f2b9f94-1f8d-ed76-2f62-03cccb9043c4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamei;

    /** TITLE01L (uuid:89dcc8e1-b92c-9d4d-fc23-af670189e4d4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01l;

    /** TITLE01F (uuid:2a81bb7f-7c6d-6fc5-1ca4-afdcd6122725, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01f;

    /** TITLE01A (uuid:c2c644b5-d636-f928-617b-6fcf7e626b46, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01a;

    /** TITLE01I (uuid:3a426983-a6ce-1b37-90e2-7432a0223f22, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01i;

    /** CURDATEL (uuid:a883021e-c7c9-7b6f-4d20-077b787eddb1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatel;

    /** CURDATEF (uuid:2d9714fc-4f0d-df18-144f-bc05e66792ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatef;

    /** CURDATEA (uuid:74300422-c944-3844-29a2-96ca3594a91b, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatea;

    /** CURDATEI (uuid:fc6d3d14-4e8d-1cdc-ee30-2bd2a0261a67, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatei;

    /** PGMNAMEL (uuid:27692f5a-db73-bcfd-e180-9557de96ebf7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamel;

    /** PGMNAMEF (uuid:70dab352-8585-7f3e-d742-7fc13bed11e9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamef;

    /** PGMNAMEA (uuid:f7623983-f918-f7d6-6f2d-3971d48b4586, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamea;

    /** PGMNAMEI (uuid:ce0fe508-120b-2af1-f17a-c8beab38bf4d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamei;

    /** TITLE02L (uuid:c4c08a6e-1320-3ef7-1a5d-126750b94046, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02l;

    /** TITLE02F (uuid:d2f0f712-e380-5d9f-1d22-cf1d52886846, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02f;

    /** TITLE02A (uuid:85be7419-0b0c-a907-b828-9399c20f816b, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02a;

    /** TITLE02I (uuid:00723038-0e5c-2fe1-acec-b62ffd63d3e8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02i;

    /** CURTIMEL (uuid:cca87f7c-caa6-19d6-9855-71963d76659d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimel;

    /** CURTIMEF (uuid:76173292-45dd-dac6-4f2d-dec8b3c7ba3d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimef;

    /** CURTIMEA (uuid:4bf580f3-f5eb-9540-db9e-6a397aea2184, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimea;

    /** CURTIMEI (uuid:cc9a79f3-72a9-078a-7c2c-e1d2c22540c4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimei;

    /** ACTIDINL (uuid:b1f00af4-1b33-af0f-7e7b-0f2eab763e63, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidinl;

    /** ACTIDINF (uuid:d001bd8c-c179-f05b-619f-1fb3588adc29, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidinf;

    /** ACTIDINA (uuid:a89e0587-d807-4364-e217-1d28e0e11775, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidina;

    /** ACTIDINI (uuid:34e88114-9a2f-9ee5-aeb3-e99df8d2ea21, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidini;

    /** CARDNINL (uuid:03f7be42-9c0a-6553-d0ef-e6e39f37d39f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardninl;

    /** CARDNINF (uuid:e1858dfd-6677-4464-969f-cb32d3a75995, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardninf;

    /** CARDNINA (uuid:841c5a03-a60f-a609-a4d9-7092f463243f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardnina;

    /** CARDNINI (uuid:8b8bb26c-8c3b-92af-32ac-e178f706a2b1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardnini;

    /** TTYPCDL (uuid:ebbbec85-b9f8-e954-de22-e844021717fa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcdl;

    /** TTYPCDF (uuid:30380e69-99c4-7bae-6663-0da1c8cd8c8d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcdf;

    /** TTYPCDA (uuid:f744999d-beb8-2499-0f53-5b5d0cca76af, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcda;

    /** TTYPCDI (uuid:2ffe00a6-b0d1-a9ec-b221-2a7ff26677e0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcdi;

    /** TCATCDL (uuid:11944869-473a-0b83-2cf1-7bb3033328ff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcdl;

    /** TCATCDF (uuid:abc498a3-fc0e-5783-b3d8-4431ab68cc07, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcdf;

    /** TCATCDA (uuid:9a1b04c3-d8b2-185b-aa61-a8c5ca84f9fe, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcda;

    /** TCATCDI (uuid:1a4ea8ba-32da-16ec-12ca-807239de91c6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcdi;

    /** TRNSRCL (uuid:93aa3fc5-b182-32e9-401b-f4ee863dd2fb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrcl;

    /** TRNSRCF (uuid:e2f9d3b8-2d4a-c3e6-5bfd-4fa9b5e302fd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrcf;

    /** TRNSRCA (uuid:1c88739f-1b0c-234f-4ff0-e61f96c8b5f3, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrca;

    /** TRNSRCI (uuid:26bd6650-f490-4431-6025-c67a58c06082, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrci;

    /** TDESCL (uuid:caccb773-5b54-ded5-75f8-d2d4b7ba2ba3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdescl;

    /** TDESCF (uuid:e71f0210-350d-0925-467c-53aad3b65a2c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdescf;

    /** TDESCA (uuid:86a53607-312d-5b1a-ac50-b701ba52f06a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesca;

    /** TDESCI (uuid:0f1d29e9-e19b-ed28-2755-b77f21338159, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesci;

    /** TRNAMTL (uuid:9f2a77b1-0e28-683a-8b08-3ca1db7f2aa4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamtl;

    /** TRNAMTF (uuid:1a9c5a2a-0fce-d209-cd03-92e7b5e23884, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamtf;

    /** TRNAMTA (uuid:b516655e-69ec-b881-264c-95f050c16578, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamta;

    /** TRNAMTI (uuid:609a5d4d-ee48-180a-072d-3e7744b68139, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamti;

    /** TORIGDTL (uuid:8491b688-aafb-6d20-f1b3-6de1713b700e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdtl;

    /** TORIGDTF (uuid:d64a30c9-dea4-f54c-c5b7-6e7035eea6c4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdtf;

    /** TORIGDTA (uuid:a0a365af-11c0-38fb-c90d-3ecbe41aead1, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdta;

    /** TORIGDTI (uuid:f041eb8e-2972-0d0e-dd7b-7f68d02fd776, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdti;

    /** TPROCDTL (uuid:281b992c-2c93-c963-61f3-1b3db0fef18b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdtl;

    /** TPROCDTF (uuid:d8c41e91-1a51-427e-2f2b-60e269bcf2bd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdtf;

    /** TPROCDTA (uuid:b01c1a27-b456-be35-628a-313c47334e21, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdta;

    /** TPROCDTI (uuid:de2409ff-c013-9944-0fe1-1acd56936065, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdti;

    /** MIDL (uuid:58e97624-8ffc-7418-60df-493c76334b15, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ midl;

    /** MIDF (uuid:ad792945-cd4a-10a2-e370-dcc3af2c18cf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ midf;

    /** MIDA (uuid:e21abcf9-55b9-08bd-bacf-3cd087bec8de, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mida;

    /** MIDI (uuid:ef894cdc-f825-ba90-cb5b-b5a2e3c279bf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ midi;

    /** MNAMEL (uuid:c29c2442-d915-f7a2-883c-5719eb2ac047, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnamel;

    /** MNAMEF (uuid:37a5dc77-d6c5-08b8-757f-5e80e0b585b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnamef;

    /** MNAMEA (uuid:c74eef03-544a-8297-367d-469a1211a9d4, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnamea;

    /** MNAMEI (uuid:4ef9041d-055d-090b-608d-df65792b3f2f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnamei;

    /** MCITYL (uuid:97271276-ce38-b4f8-6a5c-cf2e1449808b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcityl;

    /** MCITYF (uuid:8b8430a4-ff28-e9cd-71ba-2037a9305894, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcityf;

    /** MCITYA (uuid:f7a7a59f-96da-37c5-d510-39cacb9659c0, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcitya;

    /** MCITYI (uuid:161e5313-6e74-3495-69e8-a3f420b745b9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcityi;

    /** MZIPL (uuid:c4a810ac-0e6a-7923-0a06-9b3cebd828ef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mzipl;

    /** MZIPF (uuid:45738cad-0fb5-e00b-2ca0-1c72a8a8dbd5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mzipf;

    /** MZIPA (uuid:34c84603-c365-4d80-63d6-34c16a69fb3f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mzipa;

    /** MZIPI (uuid:7b476afb-ec87-b47c-abcc-f9cffc0f09b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mzipi;

    /** CONFIRML (uuid:790fb913-835d-c6f5-035d-79cd65bbbe4c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirml;

    /** CONFIRMF (uuid:20be26ef-ce01-d447-5669-b1b04bbf0f60, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmf;

    /** CONFIRMA (uuid:ef89bef1-0163-1121-6998-9efeced76b30, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirma;

    /** CONFIRMI (uuid:8b100fa8-3852-7584-0fd1-520a6e8c5643, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmi;

    /** ERRMSGL (uuid:1dd37a3d-dfaa-f06b-3f70-da87dd4ae2fc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgl;

    /** ERRMSGF (uuid:4560e417-091c-847b-5477-e041c72d53b5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgf;

    /** ERRMSGA (uuid:18f427e9-4698-467e-cf33-577e18065b46, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsga;

    /** ERRMSGI (uuid:83ed91e9-b496-f63f-dc8c-7259128ccf78, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgi;

    /** COTRN2AO (uuid:fbb1d713-10f2-78c7-2b1c-a7c179b9570b, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cotrn2ao;

    /** TRNNAMEC (uuid:b9dbe3ae-68fe-d82c-1819-d8a4a89044d9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamec;

    /** TRNNAMEP (uuid:2cdfa218-234a-2c26-e89c-18933f4964aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamep;

    /** TRNNAMEH (uuid:9a77f978-aad7-8938-4de3-65eb57056b7d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameh;

    /** TRNNAMEV (uuid:3c317102-21c1-64e9-05a5-86f273118d2d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamev;

    /** TRNNAMEO (uuid:84b48ab1-cb39-7892-c10b-61034ad3d188, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameo;

    /** TITLE01C (uuid:fb5b1171-9f64-b672-9f4e-4d2620877568, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01c;

    /** TITLE01P (uuid:715ca46a-f00f-65bb-1438-d4e05fc5ff7e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01p;

    /** TITLE01H (uuid:64900def-ee43-67f8-b4d3-8abe439e460d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01h;

    /** TITLE01V (uuid:ae8649f9-ea39-f7ca-7e5f-2cc21b26c555, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01v;

    /** TITLE01O (uuid:1b2daec6-b61f-d6cc-dc28-8bd782bfd8f5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01o;

    /** CURDATEC (uuid:70288df2-edd3-6582-c51d-e196a0373b5a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatec;

    /** CURDATEP (uuid:572422e8-58dc-65e2-63e9-e143b05a20b1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatep;

    /** CURDATEH (uuid:271e6011-f4c8-bfa3-eb06-08c26bc70231, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateh;

    /** CURDATEV (uuid:cc825f68-9a5d-7729-2cf5-03191c7cf2e4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatev;

    /** CURDATEO (uuid:b1fdd2ce-0d0d-93d6-b67a-1d7ba166edf2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateo;

    /** PGMNAMEC (uuid:3c419da6-6687-d550-afaa-67f0be65962c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamec;

    /** PGMNAMEP (uuid:936dbfd6-ca8d-27e3-deda-30e7f2c09c6f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamep;

    /** PGMNAMEH (uuid:5b34b789-26e6-f87d-8c2b-3bead8f899f1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameh;

    /** PGMNAMEV (uuid:57d898e6-9dfb-bf19-ba5e-3927b4d61dcc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamev;

    /** PGMNAMEO (uuid:0c8f96ef-6cbc-3cbc-6745-f575cfc2dbd1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameo;

    /** TITLE02C (uuid:5140eef1-2eaa-cd3c-b370-9770b787f93a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02c;

    /** TITLE02P (uuid:c535bcde-e561-9d8c-045b-0480880fe240, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02p;

    /** TITLE02H (uuid:8fd09943-40da-5768-0311-e79102fd9aa6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02h;

    /** TITLE02V (uuid:6dfd4c03-54d0-21a6-a6ca-6ce318e32ce2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02v;

    /** TITLE02O (uuid:7b48ca88-ee83-843b-91c5-8a48b3cb1761, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02o;

    /** CURTIMEC (uuid:17a1ff60-8fc4-720e-61a6-f8a910ca73ec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimec;

    /** CURTIMEP (uuid:20d92401-b7c3-6cd7-6982-35002ac37ccd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimep;

    /** CURTIMEH (uuid:ac5e944f-7373-4596-3528-bbc50c961720, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeh;

    /** CURTIMEV (uuid:97ad9252-da37-48c9-aae6-dadc187d32fe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimev;

    /** CURTIMEO (uuid:cb782779-f0f1-10c4-fdd9-fe2928bacd31, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeo;

    /** ACTIDINC (uuid:35cc5b26-4af1-73dd-4033-2a26c42a8c9b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidinc;

    /** ACTIDINP (uuid:c744e82b-6078-ed4a-3b03-3aa6c0d57882, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidinp;

    /** ACTIDINH (uuid:f0c55702-e497-9728-7044-5e4eb5859233, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidinh;

    /** ACTIDINV (uuid:53aa2e57-0d19-6ac3-135e-3f1a84ccf244, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidinv;

    /** ACTIDINO (uuid:c9cb4abe-bb22-0374-6f17-28a28ad36a67, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidino;

    /** CARDNINC (uuid:914cac57-68fa-3684-570c-92dfea204fe0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardninc;

    /** CARDNINP (uuid:f5636738-f4f7-fdd2-93c3-f1ce4ab0162c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardninp;

    /** CARDNINH (uuid:8f46c522-9651-0660-e0e5-b010f6bf51d4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardninh;

    /** CARDNINV (uuid:675c1d44-1277-fe21-063f-5b22d36d85f7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardninv;

    /** CARDNINO (uuid:cc1cfd62-eb51-e9df-8c4d-a199e13ae48d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardnino;

    /** TTYPCDC (uuid:5ad45e2b-d5dc-5175-3bc6-a7d8e337e134, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcdc;

    /** TTYPCDP (uuid:2893e6b2-95ee-c3b3-7dbe-e060a7bd5c4f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcdp;

    /** TTYPCDH (uuid:dc32627b-f5b8-30b0-4355-15639488ccb9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcdh;

    /** TTYPCDV (uuid:d7447ac4-c260-9676-1bf2-37ed2f8a8865, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcdv;

    /** TTYPCDO (uuid:03804533-919f-85d6-c00c-c7cfd3c26c2b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcdo;

    /** TCATCDC (uuid:7448e744-8417-5be5-42d2-734b64bad5f4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcdc;

    /** TCATCDP (uuid:4cfb4644-732c-b16b-3afc-141c1e6f2f62, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcdp;

    /** TCATCDH (uuid:79725730-bdae-ae68-634f-41aa690c6873, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcdh;

    /** TCATCDV (uuid:094f663f-540f-fbb8-5eb1-95e9dc7106e2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcdv;

    /** TCATCDO (uuid:45aea93b-3596-f4e2-3fff-3ca6668963aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcdo;

    /** TRNSRCC (uuid:42716974-4232-a0c2-605e-815304465bec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrcc;

    /** TRNSRCP (uuid:2a25e892-6d9a-4c3a-f686-96ceb7a0dbe1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrcp;

    /** TRNSRCH (uuid:3c91c9d4-bd6e-5961-34aa-36072fc9fb58, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrch;

    /** TRNSRCV (uuid:32f13310-2786-9efb-b398-66cc3e72371e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrcv;

    /** TRNSRCO (uuid:1158eea5-46d5-f29c-6a28-347a78bf862a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrco;

    /** TDESCC (uuid:4cdb59a2-5cb7-fc8d-6661-6069de34e4e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdescc;

    /** TDESCP (uuid:d27caf2b-31d9-fd1d-7341-19fe52dab30f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdescp;

    /** TDESCH (uuid:6ff0c11d-6689-7c18-02f5-41005e768c4d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesch;

    /** TDESCV (uuid:025790a1-15e8-eb9b-dcd8-f3eb3f651441, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdescv;

    /** TDESCO (uuid:e9de5e5e-20f0-462d-de1e-0227e79bb7b2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesco;

    /** TRNAMTC (uuid:fc54d905-2375-16f8-9e39-11d85fe74bbb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamtc;

    /** TRNAMTP (uuid:e2c072aa-1326-63dd-18d6-4ad5cd33266f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamtp;

    /** TRNAMTH (uuid:21795961-74f2-035c-2dfc-b469a7dbcd73, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamth;

    /** TRNAMTV (uuid:1bf6a983-48a9-193e-878a-722b5089cc0d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamtv;

    /** TRNAMTO (uuid:71ca3982-5e4f-1f7d-d874-aa8f01ff9e32, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamto;

    /** TORIGDTC (uuid:0f3d96ea-b069-e8ed-b79b-b79e6c3f7eb6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdtc;

    /** TORIGDTP (uuid:5df4bcd3-6f41-f9d0-94f8-6dbe9a88fd59, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdtp;

    /** TORIGDTH (uuid:446a018b-4c6b-23bc-0433-1759d039dc25, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdth;

    /** TORIGDTV (uuid:39d2f4db-b65b-402e-decb-dfaf1d8b5a34, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdtv;

    /** TORIGDTO (uuid:2922ff1f-4d68-ff70-7b19-91fea9ab80f8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdto;

    /** TPROCDTC (uuid:63ad906c-6578-a1f5-939e-178dbef8810b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdtc;

    /** TPROCDTP (uuid:2f2f568d-b78f-3f6e-2158-a06b35d65f3a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdtp;

    /** TPROCDTH (uuid:fcfde002-792e-2458-6929-4018e10e7582, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdth;

    /** TPROCDTV (uuid:39dd966b-2391-03d6-77dd-94be118c712a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdtv;

    /** TPROCDTO (uuid:1757fa9c-298e-c4ba-04c2-8d05fcad2e06, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdto;

    /** MIDC (uuid:0aead9e5-f342-f4c2-49ca-db599afab68d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ midc;

    /** MIDP (uuid:b4036dcd-0191-e839-6db0-91fa74e042b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ midp;

    /** MIDH (uuid:5416a8dd-2356-dfdd-b861-fc02157b18b9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ midh;

    /** MIDV (uuid:d29e2357-42c2-46fa-2009-0822bcbad0bc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ midv;

    /** MIDO (uuid:c9798dc0-1fc6-e6ad-e2b4-c4a25811a8d8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mido;

    /** MNAMEC (uuid:f8042558-e83e-92f3-00bb-ff8b86a36134, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnamec;

    /** MNAMEP (uuid:47ce9605-56e5-7350-e18c-ab7f576ed11b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnamep;

    /** MNAMEH (uuid:c2df464f-8ec7-6a62-c400-025274c82b88, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnameh;

    /** MNAMEV (uuid:1702d8e1-c72d-f74f-3f41-dcf58f1b394d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnamev;

    /** MNAMEO (uuid:d9de35ed-b470-7082-ad40-683dbdf05d5b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnameo;

    /** MCITYC (uuid:06e69db4-f1e0-660c-9ec7-d219c44ce5a0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcityc;

    /** MCITYP (uuid:6bef4ed1-6282-bb53-4cba-4db3836a5585, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcityp;

    /** MCITYH (uuid:ba64146d-4c8a-4580-b0f1-2b5003a2ed75, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcityh;

    /** MCITYV (uuid:c1c37b27-1b27-9984-243d-f772812336f3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcityv;

    /** MCITYO (uuid:3d047fad-68e2-e97d-056f-aed80f9424da, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcityo;

    /** MZIPC (uuid:55560e63-da47-e6cf-e249-10f0e0c0ca89, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mzipc;

    /** MZIPP (uuid:bdf35039-dd38-067e-45f8-163c5b39d9d6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mzipp;

    /** MZIPH (uuid:24efead8-acb8-72e3-e217-6b96892d7581, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mziph;

    /** MZIPV (uuid:fc1f33aa-b038-9277-3278-d6da38d9b431, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mzipv;

    /** MZIPO (uuid:36c172dd-dbd7-fded-7a0d-cb1204a037f2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mzipo;

    /** CONFIRMC (uuid:c851cd1d-3cf7-53dd-11a3-22f3fb1b0951, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmc;

    /** CONFIRMP (uuid:11f382a0-3fa3-755f-fabf-f192636bb379, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmp;

    /** CONFIRMH (uuid:0034fd0c-da8a-74ed-399d-23c78c180c61, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmh;

    /** CONFIRMV (uuid:56b78af8-f199-3c4a-914d-48a8c49931fc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmv;

    /** CONFIRMO (uuid:a99b5194-001e-693d-8a99-245b22a5b2fe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmo;

    /** ERRMSGC (uuid:b4287fef-1eae-c7cb-790d-9c7ac7eb7753, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgc;

    /** ERRMSGP (uuid:b4179e8c-f09c-754c-5160-ba10652bb8bb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgp;

    /** ERRMSGH (uuid:02fbd590-4a4d-ba68-7f40-4a47c77df881, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgh;

    /** ERRMSGV (uuid:f5acc00f-8de1-bcbc-afa4-6964061256d4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgv;

    /** ERRMSGO (uuid:6ffea9a1-0ad9-11d0-f4e6-4d18dfb47deb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgo;

    /** CCDA-SCREEN-TITLE (uuid:37d3a42b-410f-4a54-50b5-983fdefdb1fb, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:c26ab7c5-c385-8e2f-bfeb-fea268d69a2b, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:04538647-fdb4-876e-eb29-6a680705ea48, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:ad3f9e4f-521f-8856-2428-602feda4a898, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** WS-DATE-TIME (uuid:613abe5b-a72c-bdad-3828-6dbcff6eef5b, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:aff5cdd5-48b0-8c77-0ca9-ba96b3998818, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:7068c969-1269-3e6c-53d6-b143142b4833, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:09cf4890-cc74-50a4-1afe-9ace592f7205, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:71008055-52af-f0cc-57b5-3d2bd02c0743, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:888ff6e1-9257-c32c-950c-ae957c415b45, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:ff3ea02b-7b3c-5de0-edf9-1e9dfe6e3625, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:767c613d-944c-a253-8440-67fa11501a80, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:e8028e94-85d9-ee7f-6245-3642597db9c9, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:79acacc6-557c-7470-3bd6-09bbdeb6d5d8, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:8efeeec2-e529-36ca-88a1-58c6efef7984, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:0ccda480-df3a-9f93-f7c7-32673d9d075b, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:1c142194-8fae-fe5d-b921-e804d83c4af2, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:6454a47c-a69e-90b9-7d50-cafb9f379f07, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:699d3d74-82c4-ef4d-6053-04830693c5fa, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:d72c8073-2a02-4aef-9266-788aab7127a8, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:de5c58ae-7278-d877-b5a8-efdd8442484d, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:3af4f9c2-f512-2f35-e16b-9b5c63fcc8ed, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:d8e6f4b8-c114-b1bc-7e89-425b6a1d6567, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:bb17a9af-b9ea-369f-8e4d-dcd7072ca312, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:84f20552-b240-1391-2b4e-6775f9a9c487, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:5ada2b6a-0fd9-be8a-b637-a5918797ae9f, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:b1e6d723-5860-e99c-420e-135d02026722, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:861e9376-cea8-0bb2-a779-cfb315f9b3cd, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:8d06645d-750b-1bd0-f565-14535a4dc9d4, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:77d7bbf6-e0a7-d4d2-0582-7198de8efe3f, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:8993c6cb-d1b1-e848-7a85-c0734d047cb2, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:ef2295ef-3d90-bd60-3720-5a5001f1f638, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:9bf58e4a-c441-c898-195b-6ce521bce7a0, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:9ba7aadc-15ae-52d9-3d21-8ffd0d7fe85a, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:b5bcef51-946c-d032-46a9-31ff10278374, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:dca1fc3e-cd45-7c4f-7564-b8c72f6de069, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** TRAN-RECORD (uuid:9e8d6a4f-e240-2aad-1b83-fedc35a9b404, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tranRecord;

    /** TRAN-ID (uuid:6d4347ea-090c-53dc-a4da-7f1243b80bdc, level 5, PIC X(16).). */
    public String tranId;

    /** TRAN-TYPE-CD (uuid:b8f86f43-2bcc-8c8d-8cbf-00a3353d5067, level 5, PIC X(02).). */
    public String tranTypeCd;

    /** TRAN-CAT-CD (uuid:b172eeae-86f2-aec5-5cae-6cc0b511ced7, level 5, PIC 9(04).). */
    public int /* PIC 9(04). */ tranCatCd;

    /** TRAN-SOURCE (uuid:7fbc09c0-fe24-fc7a-964b-2d36cc6a996a, level 5, PIC X(10).). */
    public String tranSource;

    /** TRAN-DESC (uuid:8dba2fc5-b398-72b4-633d-bc568d90b516, level 5, PIC X(100).). */
    public String tranDesc;

    /** TRAN-AMT (uuid:2756bf4e-ef7e-8992-2d59-ea2b84c9b9bf, level 5, PIC S9(09)V99.). */
    public BigDecimal /* precision=11, scale=2, signed */ tranAmt;

    /** TRAN-MERCHANT-ID (uuid:0db98560-b6f5-6432-b9bd-a2d3828c984d, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ tranMerchantId;

    /** TRAN-MERCHANT-NAME (uuid:31a78e7c-04b3-cb33-d065-1db4a5d45123, level 5, PIC X(50).). */
    public String tranMerchantName;

    /** TRAN-MERCHANT-CITY (uuid:9a0173a6-d7a6-f6ae-baba-7b238bff1cbd, level 5, PIC X(50).). */
    public String tranMerchantCity;

    /** TRAN-MERCHANT-ZIP (uuid:71e8eb3d-45bc-304b-2c1c-079f70f50ea4, level 5, PIC X(10).). */
    public String tranMerchantZip;

    /** TRAN-CARD-NUM (uuid:579e77f8-00f9-fa2c-133a-03fcc2810523, level 5, PIC X(16).). */
    public String tranCardNum;

    /** TRAN-ORIG-TS (uuid:c3206bb7-c2b0-6ae5-f283-9a6f65152654, level 5, PIC X(26).). */
    public String tranOrigTs;

    /** TRAN-PROC-TS (uuid:735edd79-a1cd-7b7a-849f-75833a05e9a6, level 5, PIC X(26).). */
    public String tranProcTs;

    /** ACCOUNT-RECORD (uuid:a4036b5a-d930-5451-f530-83186595bc8f, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ accountRecord;

    /** ACCT-ID (uuid:a146ff75-03b6-dc0e-ebe3-4d684eb5ec8a, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ acctId;

    /** ACCT-ACTIVE-STATUS (uuid:8cf541b6-7c0b-5019-7093-7e431c8014fd, level 5, PIC X(01).). */
    public String acctActiveStatus;

    /** ACCT-CURR-BAL (uuid:2d08239e-26e8-98a3-1fee-6db98f75ead1, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrBal;

    /** ACCT-CREDIT-LIMIT (uuid:fc677b33-ba3f-886b-3fb3-1f24ab3c1bea, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCreditLimit;

    /** ACCT-CASH-CREDIT-LIMIT (uuid:efb30393-469f-4ca9-0140-95e3077e502e, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCashCreditLimit;

    /** ACCT-OPEN-DATE (uuid:f780363f-d8a0-6612-38e7-1a585defe39b, level 5, PIC X(10).). */
    public String acctOpenDate;

    /** ACCT-EXPIRAION-DATE (uuid:ec8ac14c-d4b5-c503-9f2b-a3b1787cdc58, level 5, PIC X(10).). */
    public String acctExpiraionDate;

    /** ACCT-REISSUE-DATE (uuid:afe22be4-abfe-9d60-1e8a-3bea8d28d8d7, level 5, PIC X(10).). */
    public String acctReissueDate;

    /** ACCT-CURR-CYC-CREDIT (uuid:3f9bf6ec-07a9-9e31-c1de-9e02501f1230, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrCycCredit;

    /** ACCT-CURR-CYC-DEBIT (uuid:486cd7d5-65f0-9992-f9c7-11224318d963, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrCycDebit;

    /** ACCT-ADDR-ZIP (uuid:d2df7913-01d0-30dc-892c-8e63aba962d8, level 5, PIC X(10).). */
    public String acctAddrZip;

    /** ACCT-GROUP-ID (uuid:2fb3bc19-756e-4766-df44-15b676956717, level 5, PIC X(10).). */
    public String acctGroupId;

    /** CARD-XREF-RECORD (uuid:01c1366e-b142-e3de-790c-3586dc688b1a, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardXrefRecord;

    /** XREF-CARD-NUM (uuid:0d73a2fe-3ec7-8741-f88b-507ce74bfd12, level 5, PIC X(16).). */
    public String xrefCardNum;

    /** XREF-CUST-ID (uuid:3b5140cf-7a6f-d30b-6e36-0e437a5c46a9, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ xrefCustId;

    /** XREF-ACCT-ID (uuid:74f954fe-afcf-525d-c8b9-f5c45f714bae, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ xrefAcctId;

    /** DFHAID (uuid:e4ec5c84-9517-d079-5ec8-c293f7b77023, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:aca6ffe3-54a4-e96d-ef67-55dfe36026ce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:df20753e-aaa0-3c5c-6cb3-7903d8c0069d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:eb31a2bb-93ca-a285-78ec-d373f4b3f6ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:434f8bf5-6dc2-d2cd-1068-4afec6115106, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:8c18b868-f70d-cfe1-2520-bf5507f9fe85, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:81e8b169-2c6f-4944-0783-2156ad86cf2e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:3eca5fd4-18fc-ae67-295b-f895d5d82efe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:0ebb3100-a564-2c90-0b83-ea24aa011fe6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:b20b72e9-c8ad-b4c1-4dfe-54a01c749eb7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:348c2ea7-5004-0011-2a94-10ce06649939, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:c7d7af9e-ec85-2455-e982-6abbb18cc7a7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:7d45f84b-ec28-efc0-4964-72fee0a38c52, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:94d0d02d-d313-14f0-4b02-8aa64276cb99, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:c5e7909e-b8b4-dd36-a0ea-4e834d8ade58, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:d3e2595c-540b-8d64-fe07-26914c89be94, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:cdbcc3ef-5bb8-5b7b-9d2d-c01c2008806d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:a653400b-2287-306c-bd60-9283e0d0ae0d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:fe359d0d-8651-73ca-a645-7026b92c1439, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:d02fe0da-ef3c-6583-223b-fa0e1f586a75, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:66cc3a9f-c219-3f25-af4a-01d26a125b44, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:ac9b1bbc-de09-e250-80a5-fb309599db5b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:4e48d46c-df6a-f3eb-e412-1ff7cb4bdc2b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:77dad8cf-f0ed-a021-ee7c-b7785030fdb4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:d0c66240-788f-b44d-660b-396553ddb811, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:f87172b5-6526-1d84-cf1f-3f3e0ea17eaa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:a973b7a5-35d2-dae6-569f-5abde9a1d087, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:7b42f133-84c2-ace7-975c-324319f95da9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:71af0444-3036-7653-2eb0-c6e099be8757, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:cef5f942-aea1-057f-23d5-1cff01a01715, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:b265feff-ee2a-f3ee-9fa7-fe4cdbbd07e1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:8fd4fbbf-0b56-f617-e8ba-3d7b5f4fedf4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:467115ea-baa8-1746-f90c-50c1ea07371e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:e50dfc6e-f1fd-1f26-b374-9758ae7756c1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:550ea51a-0efd-77ca-9f22-99b7f1a46ec1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:e7f7b071-1aad-f28a-4d94-55ab1561f13c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:dd8712a7-3bff-32d7-040b-3b3aad33fd58, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** DFHBMSCA (uuid:26f602b9-f00e-7490-2dfd-be9b54cc69b0, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:3628e80f-2843-d8c4-77ea-dd258503f3a5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:9f82bbf9-6ba7-5c32-f71a-767e7aeace2d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:134aac80-45e2-ef07-49d4-fa4dc8c53d66, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:48c6c0a2-9c7c-9120-a36e-a07c0ac79d4b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:9446268e-8fc1-988a-0c18-e80341fddeac, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:f2e3ed0e-043e-a54b-89e8-fef3dcba4a82, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:7e2d478c-0bc4-7607-6230-30d90a94f484, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:499ea6fb-42f4-fde8-5fa9-8f1fe5992ccd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:718dcbd2-7e93-0d08-91d5-1e20bb636d63, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:a68910aa-b0fe-e879-ff26-ba2be351cd91, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:27bc99ea-be98-d9c7-1514-e25717dc462d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:f64a79b3-a553-e354-a0b4-87b65d471b5e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:83a7d251-6ffd-b427-49e5-eac35027e878, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:5b632947-ac19-2b4e-6df4-55773e30e745, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:b7b8c7ee-851f-1595-9efd-7b5aff8445a8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:1580033f-013f-d993-7593-3c1d10812b45, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:1214c04b-789e-a637-2c9d-ac6e234c9c86, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:99c02eb7-8262-c438-9821-13b054e5d812, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:d77984d4-d234-ff48-fb76-c112ec109d7a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:e30f1548-c669-378c-4dd9-ad39e4546d93, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:3faacc64-ad50-dfdd-cea3-7da46b28c99a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:fc456986-b5c3-3ff6-7c84-17c914df50f0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:d2b9c586-6b6d-72c9-750c-2b2932f45a49, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:b3685d04-8934-105d-36bc-74798fe96dfa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:f7114019-74eb-7f40-aa0d-789fe544472d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:3627b807-9d09-7f9d-2082-21dba9b21423, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:d2bbc160-cd1f-d4cf-ddd7-e646788caa16, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:8d34c0c7-c479-cb04-9e3c-71aa9b8ea42f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:a7e0145c-1c77-774b-3df3-48ec475a7833, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;


    // --- auto-generated stubs for undeclared references ---
    public Object eibcalen;  // auto-stub for undeclared reference

    /**
     * This is the primary control paragraph for the program, orchestrating the overall flow of
     * transaction processing.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * This could be the main entry point or a top-level controller method in the Java class.
     *
     * <p>Source: MAIN-PARA (uuid:068d4e59-7c59-a6be-fc81-694000f3bd99, lines 664-716).
     */
    public void mainPara() {
        // SET ERR-FLG-OFF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET USR-MODIFIED-NO TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsMessage = "";
        this.errmsgo = "";
        if (java.util.Objects.equals(this.eibcalen, 0)) {
            // TODO: translate body for: EIBCALEN = 0
        }
    }

    /**
     * Handles the logic executed when the user presses the Enter key, typically involving input
     * validation and subsequent processing steps.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * Implement as a method that orchestrates input validation and determines the next action
     * based on validation results.
     *
     * <p>Source: PROCESS-ENTER-KEY (uuid:be666683-a70a-f987-1e7e-ed864e4e8cc6, lines 721-745).
     */
    public void processEnterKey() {
        this.validateInputKeyFields();  // PERFORM
        this.validateInputDataFields();  // PERFORM
        // EVALUATE CONFIRMI OF COTRN2AI
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: CONFIRMI OF COTRN2AI */) { /* WHEN branches follow */ }
    }

    /**
     * Validates the key fields provided by the user from the CICS screen, ensuring they meet
     * defined business rules.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * Create a dedicated method to validate key fields, returning a status or error messages.
     *
     * <p>Source: VALIDATE-INPUT-KEY-FIELDS (uuid:a9b9d899-1f53-8ef0-4fd2-e05f1a9d78c6, lines 750-787).
     */
    public void validateInputKeyFields() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
    }

    /**
     * Validates the main transaction data fields entered by the user, checking for correctness,
     * completeness, and adherence to business logic, including calls to external validation
     * programs.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * Implement a method to validate all non-key input data, potentially delegating to external
     * services for specific validations.
     *
     * <p>Source: VALIDATE-INPUT-DATA-FIELDS (uuid:612c6cbc-566b-7c23-63df-8007cdea6c89, lines 792-994).
     */
    public void validateInputDataFields() {
        // --- Pseudocode (from grounded LLM paragraph spec) ---
        // 1. 1. If a global error flag is set, clear all transaction input data fields.
        // 2. 2. Check each mandatory input field (Type CD, Category CD, Source, Description, Amount, Original Date, Processed Date, Merchant ID, Name, City, Zip) for emptiness. If any are empty, set an error, message, adjust cursor, and refresh the screen.
        // 3. 3. Validate that Type CD and Category CD are numeric. If not, set an error, message, adjust cursor, and refresh the screen.
        // 4. 4. Validate the Amount field's format (expected as `[+-]DDDDDDDD.DD`). If invalid, set an error, message, adjust cursor, and refresh the screen.
        // 5. 5. Convert the Amount field from formatted string to numeric, then reformat and move it back to the input field.
        // 6. 6. Validate the Original Date field's format (expected as `YYYY-MM-DD`). If invalid, set an error, message, adjust cursor, and refresh the screen.
        // 7. 7. Call the `CSUTLDTC` utility to perform a deeper validity check on the Original Date. If the date is invalid (excluding a specific message code '2513'), set an error, message, adjust cursor, and refresh the screen.
        // 8. 8. Validate the Processed Date field's format (expected as `YYYY-MM-DD`). If invalid, set an error, message, adjust cursor, and refresh the screen.
        // 9. 9. Call the `CSUTLDTC` utility to perform a deeper validity check on the Processed Date. If the date is invalid (excluding a specific message code '2513'), set an error, message, adjust cursor, and refresh the screen.
        // 10. 10. Validate that the Merchant ID field is numeric. If not, set an error, message, adjust cursor, and refresh the screen.
        //
        // --- Key decisions ---
        //  - The amount field expects a specific format: a leading sign (optional '-' or '+'), eight digits, a decimal point, and two decimal digits (e.g., -12345678.90).
        //  - Date fields must adhere to the 'YYYY-MM-DD' format.
        //  - Date validation calls an external utility 'CSUTLDTC' which returns a severity code and message number; a specific message number '2513' is explicitly ignored, indicating a condition that does not constitute a validation error.
        //  - Validation failures are handled by setting an error flag, updating a message field, positioning the cursor to the erroneous field, and then performing a screen refresh, which implies exiting the current input process to allow user correction.
        // --- Translated COBOL statements ---
        if (true /* TODO translate: ERR-FLG-ON */) {
            // TODO: translate body for: ERR-FLG-ON
        }
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        // COMPUTE (needs PIC-aware expression translation): COMPUTE WS-TRAN-AMT-N = FUNCTION NUMVAL-C(TRNAMTI OF COTRN2AI);
        // MOVE WS-TRAN-AMT-N TO WS-TRAN-AMT-E  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-TRAN-AMT-E TO TRNAMTI OF COTRN2AI  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TORIGDTI OF COTRN2AI TO CSUTLDTC-DATE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-DATE-FORMAT TO CSUTLDTC-DATE-FORMAT  -- identifier MOVE; needs PIC-aware type coercion
        this.csutldtcResult = "";
        // CALL CSUTLDTC() — see external program CSUTLDTC
        if (java.util.Objects.equals(this.csutldtcResultSevCd, "0000")) {
            // TODO: translate body for: CSUTLDTC-RESULT-SEV-CD = '0000'
        }
        // MOVE TPROCDTI OF COTRN2AI TO CSUTLDTC-DATE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-DATE-FORMAT TO CSUTLDTC-DATE-FORMAT  -- identifier MOVE; needs PIC-aware type coercion
        this.csutldtcResult = "";
        // CALL CSUTLDTC() — see external program CSUTLDTC
        if (java.util.Objects.equals(this.csutldtcResultSevCd, "0000")) {
            // TODO: translate body for: CSUTLDTC-RESULT-SEV-CD = '0000'
        }
        if (true /* TODO translate: MIDI OF COTRN2AI IS NOT NUMERIC */) {
            // TODO: translate body for: MIDI OF COTRN2AI IS NOT NUMERIC
        }
    }

    /**
     * Orchestrates the process of adding a new transaction record, including establishing a
     * browse, reading previous transactions, and writing the new record.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * This method should encapsulate the business logic for creating and persisting a new
     * transaction, potentially using a transaction service.
     *
     * <p>Source: ADD-TRANSACTION (uuid:91e7f364-3cea-6918-440c-ecea6439a3ed, lines 999-1023).
     */
    public void addTransaction() {
        this.tranId = "\uFFFF";
        this.startbrTransactFile();  // PERFORM
        this.readprevTransactFile();  // PERFORM
        this.endbrTransactFile();  // PERFORM
        // MOVE TRAN-ID TO WS-TRAN-ID-N  -- identifier MOVE; needs PIC-aware type coercion
        // ADD (needs PIC-aware translation): ADD 1 TO WS-TRAN-ID-N;
        // INITIALIZE tranRecord: reset to PIC defaults
        this.tranRecord = null;  // TODO: set to type-appropriate zero/spaces
        // MOVE WS-TRAN-ID-N TO TRAN-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TTYPCDI OF COTRN2AI TO TRAN-TYPE-CD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TCATCDI OF COTRN2AI TO TRAN-CAT-CD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TRNSRCI OF COTRN2AI TO TRAN-SOURCE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TDESCI OF COTRN2AI TO TRAN-DESC  -- identifier MOVE; needs PIC-aware type coercion
        // COMPUTE (needs PIC-aware expression translation): COMPUTE WS-TRAN-AMT-N = FUNCTION NUMVAL-C(TRNAMTI OF COTRN2AI);
        // MOVE WS-TRAN-AMT-N TO TRAN-AMT  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CARDNINI OF COTRN2AI TO TRAN-CARD-NUM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE MIDI OF COTRN2AI TO TRAN-MERCHANT-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE MNAMEI OF COTRN2AI TO TRAN-MERCHANT-NAME  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE MCITYI OF COTRN2AI TO TRAN-MERCHANT-CITY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE MZIPI OF COTRN2AI TO TRAN-MERCHANT-ZIP  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TORIGDTI OF COTRN2AI TO TRAN-ORIG-TS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TPROCDTI OF COTRN2AI TO TRAN-PROC-TS  -- identifier MOVE; needs PIC-aware type coercion
        this.writeTransactFile();  // PERFORM
    }

    /**
     * Retrieves and copies data from the last existing transaction, possibly for display on the
     * screen or as a template for a new transaction.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * A method to fetch the most recent transaction and populate corresponding data fields for
     * display or pre-fill.
     *
     * <p>Source: COPY-LAST-TRAN-DATA (uuid:6e859392-9038-cac4-1e98-0cb00cb92b13, lines 1028-1052).
     */
    public void copyLastTranData() {
        this.validateInputKeyFields();  // PERFORM
        this.tranId = "\uFFFF";
        this.startbrTransactFile();  // PERFORM
        this.readprevTransactFile();  // PERFORM
        this.endbrTransactFile();  // PERFORM
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
        this.processEnterKey();  // PERFORM
    }

    /**
     * Transfers control back to a previous CICS screen using an XCTL command, effectively
     * exiting the current program.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * This method will handle CICS screen navigation logic, likely involving a return or
     * transfer command to another component.
     *
     * <p>Source: RETURN-TO-PREV-SCREEN (uuid:2d8da8e4-f768-60d7-f38f-6e91aa822761, lines 1057-1068).
     */
    public void returnToPrevScreen() {
        if (java.util.Objects.equals(this.cdemoToProgram, "\u0000")) {
            // TODO: translate body for: CDEMO-TO-PROGRAM = LOW-VALUES OR SPACES
        }
        // MOVE WS-TRANID TO CDEMO-FROM-TRANID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO CDEMO-FROM-PROGRAM  -- identifier MOVE; needs PIC-aware type coercion
        this.cdemoPgmContext = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
    }

    /**
     * Sends the transaction addition screen (TRNADD) to the user's terminal, populating header
     * information before display.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * Implement a method to render the transaction entry screen with initial data populated.
     *
     * <p>Source: SEND-TRNADD-SCREEN (uuid:e2114b3d-1cc3-b330-1879-52fa228241ae, lines 1073-1091).
     */
    public void sendTrnaddScreen() {
        this.populateHeaderInfo();  // PERFORM
        // MOVE WS-MESSAGE TO ERRMSGO OF COTRN2AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /**
     * Receives input from the transaction addition screen (TRNADD) after the user has entered
     * data.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * A method responsible for capturing user input from the CICS screen and mapping it to data
     * structures.
     *
     * <p>Source: RECEIVE-TRNADD-SCREEN (uuid:a32d7977-71af-3480-a6cb-a36795cf41ba, lines 1096-1104).
     */
    public void receiveTrnaddScreen() {
        // TODO: implement receiveTrnaddScreen.  See uuid:a32d7977-71af-3480-a6cb-a36795cf41ba
    }

    /**
     * Populates the header fields of the CICS screen with relevant information, such as current
     * date, time, or user ID.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * A utility method to prepare and set header data for screen display.
     *
     * <p>Source: POPULATE-HEADER-INFO (uuid:09f42dbc-89d1-c461-2be2-686bd85f59e1, lines 1109-1128).
     */
    public void populateHeaderInfo() {
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF COTRN2AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF COTRN2AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-TRANID TO TRNNAMEO OF COTRN2AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO PGMNAMEO OF COTRN2AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF COTRN2AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF COTRN2AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /**
     * Reads a record from the `WS-CXACAIX-FILE`, which is likely a cross-reference or index
     * file.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * Create a method to perform a read operation on the `WS-CXACAIX-FILE` data store.
     *
     * <p>Source: READ-CXACAIX-FILE (uuid:73617466-e802-ed83-6a38-f02afbee2573, lines 1133-1161).
     */
    public void readCxacaixFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /**
     * Reads a record from the `WS-CCXREF-FILE`, another cross-reference file used for validation
     * or data lookup.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * Create a method to perform a read operation on the `WS-CCXREF-FILE` data store.
     *
     * <p>Source: READ-CCXREF-FILE (uuid:593d6827-3164-01c6-83b8-48326ca3bd95, lines 1166-1194).
     */
    public void readCcxrefFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /**
     * Initiates a browse operation on the `WS-TRANSACT-FILE` (VSAM), setting a starting point
     * for sequential reading.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * This method will handle starting a cursor-based read operation on the transaction data
     * store.
     *
     * <p>Source: STARTBR-TRANSACT-FILE (uuid:1d0459d0-1dff-5cd8-4737-20b52161bb81, lines 1199-1225).
     */
    public void startbrTransactFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /**
     * Reads the previous record in the `WS-TRANSACT-FILE` during a backward browse operation.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * Implement a method to retrieve the preceding record from the transaction data store during
     * a browse.
     *
     * <p>Source: READPREV-TRANSACT-FILE (uuid:2016546a-7168-6bb2-41cb-ff8c5938fbfa, lines 1230-1254).
     */
    public void readprevTransactFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /**
     * Terminates the browse operation on the `WS-TRANSACT-FILE`, releasing any associated
     * resources.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * A method to close or finalize the cursor/stream used for browsing transaction records.
     *
     * <p>Source: ENDBR-TRANSACT-FILE (uuid:4c1f0ed7-a6b2-c677-ef80-c57694bcd257, lines 1259-1263).
     */
    public void endbrTransactFile() {
        Vsam.endbr("WS-TRANSACT-FILE");  // line 1261
    }

    /**
     * Writes a new or updated transaction record to the `WS-TRANSACT-FILE`.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * This method should persist a transaction record to the database or storage.
     *
     * <p>Source: WRITE-TRANSACT-FILE (uuid:1cee63b5-7e52-6b17-cb05-15b6cff48658, lines 1268-1306).
     */
    public void writeTransactFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /**
     * Clears the data fields on the current CICS screen and then refreshes the display by
     * sending the screen again.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * A method to reset the display fields of the current screen and refresh the UI.
     *
     * <p>Source: CLEAR-CURRENT-SCREEN (uuid:55feb557-96e2-28fa-e4cc-9f850ca1f999, lines 1311-1314).
     */
    public void clearCurrentScreen() {
        this.initializeAllFields();  // PERFORM
        this.sendTrnaddScreen();  // PERFORM
    }

    /**
     * Initializes all program working storage fields to their default or initial values.
     *
     * <p><strong>Java implementation hint (from LLM spec):</strong>
     * This method will reset instance variables or DTOs to their initial state.
     *
     * <p>Source: INITIALIZE-ALL-FIELDS (uuid:932bbd75-7b5b-bd45-2b4b-3d7b568801de, lines 1319-1336).
     */
    public void initializeAllFields() {
        this.actidinl = -1;
        this.actidini = "";
        this.cardnini = "";
        this.ttypcdi = "";
        this.tcatcdi = "";
        this.trnsrci = "";
        this.trnamti = "";
        this.tdesci = "";
        this.torigdti = "";
        this.tprocdti = "";
        this.midi = "";
        this.mnamei = "";
        this.mcityi = "";
        this.mzipi = "";
        this.confirmi = "";
        this.wsMessage = "";
    }

    public static void main(String[] args) {
        new Cotrn02c().mainPara();
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
