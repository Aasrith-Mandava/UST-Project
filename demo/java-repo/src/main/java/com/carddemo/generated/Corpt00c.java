// Generated from CORPT00C.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_CORPT00C.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * CORPT00C (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: CORPT00C.cbl
 */
public class Corpt00c {

    /** WS-VARIABLES (uuid:36850d87-8d24-a05c-e8ed-c059c46c654c, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsVariables;

    /** WS-PGMNAME (uuid:25e5ba15-0a0b-c1ba-d7a7-c4812cb0d216, level 5, PIC X(08)). */
    public String wsPgmname;

    /** WS-TRANID (uuid:2b0d49ce-7bcc-72d7-8a8e-782e10a46be9, level 5, PIC X(04)). */
    public String wsTranid;

    /** WS-MESSAGE (uuid:4f0bc333-3044-fdb0-b72b-59990b46d483, level 5, PIC X(80)). */
    public String wsMessage;

    /** WS-TRANSACT-FILE (uuid:5e380890-02f5-5ebe-1cd1-a035ec1617ec, level 5, PIC X(08)). */
    public String wsTransactFile;

    /** WS-ERR-FLG (uuid:6327d74a-4ca3-f76a-4938-b9038f6a8486, level 5, PIC X(01)). */
    public String wsErrFlg;

    /** WS-TRANSACT-EOF (uuid:b268e61f-ac5a-f368-4cfe-dc3a9f260aff, level 5, PIC X(01)). */
    public String wsTransactEof;

    /** WS-SEND-ERASE-FLG (uuid:0c77e092-e87e-a100-44eb-7b7af4a87386, level 5, PIC X(01)). */
    public String wsSendEraseFlg;

    /** WS-END-LOOP (uuid:4fd90997-5480-d7a1-be2b-581ae892cab8, level 5, PIC X(01)). */
    public String wsEndLoop;

    /** WS-RESP-CD (uuid:6b603714-28c6-078d-d14a-46f87c8656d8, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsRespCd;

    /** WS-REAS-CD (uuid:7198ae3c-5498-8073-54c0-e97b727519ff, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsReasCd;

    /** WS-REC-COUNT (uuid:7c0caaae-0fd8-b02a-43d4-1f31d134835c, level 5, PIC S9(04) COMP). */
    public int /* PIC S9(04) signed */ wsRecCount;

    /** WS-IDX (uuid:6fe240cb-9acb-f74f-8e48-5dd5458c911f, level 5, PIC S9(04) COMP). */
    public int /* PIC S9(04) signed */ wsIdx;

    /** WS-REPORT-NAME (uuid:64e27bfb-0bb2-d901-352f-9e62534f27f5, level 5, PIC X(10)). */
    public String wsReportName;

    /** WS-START-DATE (uuid:18918c70-73f9-756e-a192-2e63f7359a28, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsStartDate;

    /** WS-START-DATE-YYYY (uuid:96c7ed3f-7a80-70df-eaf5-11c4cb6c97a3, level 10, PIC X(04)). */
    public String wsStartDateYyyy;

    /** WS-START-DATE-MM (uuid:f0a66930-2f41-cb25-b901-b1430a1a03c7, level 10, PIC X(02)). */
    public String wsStartDateMm;

    /** WS-START-DATE-DD (uuid:700f4282-0b15-08bc-681f-d52f0475fe72, level 10, PIC X(02)). */
    public String wsStartDateDd;

    /** WS-END-DATE (uuid:7fd33630-7bfe-ff8e-fe91-3f581dcd1a5a, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEndDate;

    /** WS-END-DATE-YYYY (uuid:32017736-4a70-3e72-1b97-c64e668d9415, level 10, PIC X(04)). */
    public String wsEndDateYyyy;

    /** WS-END-DATE-MM (uuid:c3e0bea0-0fb4-ee1d-2955-95086023e857, level 10, PIC X(02)). */
    public String wsEndDateMm;

    /** WS-END-DATE-DD (uuid:a43474c9-d98b-2d97-43a4-1e30923149a4, level 10, PIC X(02)). */
    public String wsEndDateDd;

    /** WS-DATE-FORMAT (uuid:f1e8e128-d0f2-34fd-7dab-78e55b3b88f0, level 5, PIC X(10)). */
    public String wsDateFormat;

    /** WS-NUM-99 (uuid:334dc8fe-f122-a4d5-5f03-c0b8ef4e5491, level 5, PIC 99). */
    public int /* PIC 99 */ wsNum99;

    /** WS-NUM-9999 (uuid:d2507999-0d80-4de7-2782-868a31c79330, level 5, PIC 9999). */
    public int /* PIC 9999 */ wsNum9999;

    /** WS-TRAN-AMT (uuid:02ab3390-9343-2136-197c-c7a75ffea126, level 5, PIC +99999999.99.). */
    public long /* PIC +99999999.99. */ wsTranAmt;

    /** WS-TRAN-DATE (uuid:6032a720-54de-34df-ab7b-3823bf79a6af, level 5, PIC X(08)). */
    public String wsTranDate;

    /** JCL-RECORD (uuid:7a40ba96-289a-09fe-9221-1198a8aaf70f, level 5, PIC X(80)). */
    public String jclRecord;

    /** JOB-DATA (uuid:b9a14703-3887-f3af-583f-d3aa3896cb7b, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ jobData;

    /** JOB-DATA-1 (uuid:2b5af804-cb1c-00f3-54a0-7b5563cf58c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ jobData1;

    /** FILLER-1 (uuid:b15385f1-d9fc-3c44-bfe5-f67e2f294538, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ filler1;

    /** PARM-START-DATE-1 (uuid:1d350004-e450-5dd1-fa6e-24babb444f2c, level 10, PIC X(10)). */
    public String parmStartDate1;

    /** FILLER-2 (uuid:ad72a0d5-425e-7b10-e568-bc320094bc0f, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ filler2;

    /** PARM-END-DATE-1 (uuid:17b9581c-ccb7-f5bb-7569-e82d0743ee3a, level 10, PIC X(10)). */
    public String parmEndDate1;

    /** FILLER-3 (uuid:46489f9e-717b-6bd2-3188-69efa5f2f271, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ filler3;

    /** PARM-START-DATE-2 (uuid:3ab30595-e17a-4ed0-ef19-5775e696a5b9, level 10, PIC X(10)). */
    public String parmStartDate2;

    /** PARM-END-DATE-2 (uuid:87cb53ea-48a7-145c-7ed2-98c8d0c1f620, level 10, PIC X(10)). */
    public String parmEndDate2;

    /** JOB-DATA-2 (uuid:4d4e36df-9076-9a88-5f43-f672480a8604, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ jobData2;

    /** JOB-LINES (uuid:ac9ef7f6-dc81-2ccd-3477-a24854963b6c, level 5, PIC X(80).). */
    public String jobLines;

    /** CSUTLDTC-PARM (uuid:48c0ac47-0426-ca2e-51dc-1c0d31990fe1, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ csutldtcParm;

    /** CSUTLDTC-DATE (uuid:7cb0779a-2a51-8f8e-30b0-9604b6f476a5, level 5, PIC X(10).). */
    public String csutldtcDate;

    /** CSUTLDTC-DATE-FORMAT (uuid:08749d70-7991-2204-31e7-2775b69502d7, level 5, PIC X(10).). */
    public String csutldtcDateFormat;

    /** CSUTLDTC-RESULT (uuid:8bdf5cac-8dc7-4712-8612-fa493ff16280, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ csutldtcResult;

    /** CSUTLDTC-RESULT-SEV-CD (uuid:a0ce6303-366c-bbd9-a01e-5bfe0d1a9fe4, level 10, PIC X(04).). */
    public String csutldtcResultSevCd;

    /** CSUTLDTC-RESULT-MSG-NUM (uuid:bda3aa89-8c66-9402-c8fb-3d85088f7a34, level 10, PIC X(04).). */
    public String csutldtcResultMsgNum;

    /** CSUTLDTC-RESULT-MSG (uuid:62866851-09e3-da65-b7a0-6b324bf913c1, level 10, PIC X(61).). */
    public String csutldtcResultMsg;

    /** CARDDEMO-COMMAREA (uuid:57b3a472-d9ee-496b-5648-da268f3c791a, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:241cad9c-0409-f96a-48fe-f2162e9c5228, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:44d7bc7d-6e80-8947-d03b-90b3545b4668, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:bcd112c5-0369-31ea-5690-f664eceac3eb, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:c66aaa98-6eda-485e-16c6-ca07f2558da2, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:685457aa-83b9-fb3c-eb25-e6a01c4de093, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:fa33207c-68f5-8946-c2f1-f1bd9ca0268b, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:d582872b-c94f-7a44-2c09-20e80fa4ac69, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:e9e2b1a3-9e3c-6996-81c5-eced29afcc07, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:2ae7077b-792c-8ae7-129f-1c6cd6719732, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:5da75885-1641-a92d-3609-2c143786788f, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:61817454-b63b-3eb7-4a3e-7cf221faebfb, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:12b1b72a-b46a-5322-1e5f-71e9332b42ae, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:7bff8b87-9fbe-47a1-378f-1951b186ea7a, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:6bf84ed0-1b92-883d-0f22-05692908ff27, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:4c892262-1891-bfc9-9ce6-29d765822583, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:04f47ee2-d5a5-59bc-045f-87953cffff0c, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:7069702f-4829-76e0-0040-af3e856f1d5a, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:baee3875-372c-d441-8e6f-d96a9b639cfa, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:7bffae42-a6df-cb98-6096-6f123fe11feb, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:9a027ee7-179a-2011-5de3-30e4526ab020, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:dd5b47c7-d277-2b19-6a7c-0be6260ef43d, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** CORPT0AI (uuid:d9c4bf4f-4d89-ec02-3457-4f5be4d7a0a6, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ corpt0ai;

    /** TRNNAMEL (uuid:079226cb-e6c8-607f-318d-3fd16a1fc231, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamel;

    /** TRNNAMEF (uuid:af106f60-ba2c-1ccc-393b-3e971517e241, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamef;

    /** TRNNAMEA (uuid:96aa482b-9b35-e9f0-8e31-f9b3060e2e02, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamea;

    /** TRNNAMEI (uuid:9c4b15dd-b32f-8d2c-9d65-dad32aee1d38, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamei;

    /** TITLE01L (uuid:775be7bb-8779-0200-67df-edcc5dde2708, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01l;

    /** TITLE01F (uuid:336ab2fd-3d3c-3e1e-e8cd-82a86f60fbe6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01f;

    /** TITLE01A (uuid:c47f7d66-346b-673c-8c02-7620c1b93b40, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01a;

    /** TITLE01I (uuid:51db5ab4-cda1-b60a-b1b9-a33fd8b1fb5e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01i;

    /** CURDATEL (uuid:a90858ca-766f-8136-9c42-a57bfbd32ca6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatel;

    /** CURDATEF (uuid:b0f8ea7a-f580-4d2f-0c49-1dfa84a220db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatef;

    /** CURDATEA (uuid:4bbf3f55-18da-de35-920f-a8e402093b1f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatea;

    /** CURDATEI (uuid:c2093496-74a7-d9e6-c459-61e8aa3e1b92, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatei;

    /** PGMNAMEL (uuid:c46fb2cf-905a-22f1-c4ed-584a6ad39ba4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamel;

    /** PGMNAMEF (uuid:27fdc256-c5ed-81d0-73c9-c77b45449e34, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamef;

    /** PGMNAMEA (uuid:7feb1f4a-e45c-060b-a567-785569d9ca09, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamea;

    /** PGMNAMEI (uuid:fdd38852-57b9-83f3-0428-c84e8e210fbd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamei;

    /** TITLE02L (uuid:261566bb-059d-7f3a-b832-b5ae003cab34, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02l;

    /** TITLE02F (uuid:48dc8420-39b2-a2f9-9055-bfc10ed4c3db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02f;

    /** TITLE02A (uuid:7158a82d-89a3-6fb0-0597-0fd04da481a6, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02a;

    /** TITLE02I (uuid:4e9131b7-af0c-03f5-80bf-efe1fa24424e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02i;

    /** CURTIMEL (uuid:55c48b62-140a-9953-5a94-1d156b452afa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimel;

    /** CURTIMEF (uuid:1286a623-a3c1-e1b3-3143-157800c40650, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimef;

    /** CURTIMEA (uuid:ea8121fd-149f-65d4-0937-4668f1a3cd58, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimea;

    /** CURTIMEI (uuid:e07968d5-4fee-743b-6b86-3cb7107ab7c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimei;

    /** MONTHLYL (uuid:094d9166-75af-68c5-929e-00c3ecadb3ad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ monthlyl;

    /** MONTHLYF (uuid:3a0aa148-3d5c-21ab-8e9c-1542290c693f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ monthlyf;

    /** MONTHLYA (uuid:43fc40a2-56b7-029e-25bf-9e8739e4d9cd, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ monthlya;

    /** MONTHLYI (uuid:4215a80a-5208-5a47-f7a5-e3b08552f0a1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ monthlyi;

    /** YEARLYL (uuid:10ec3ad5-e1ef-fe39-49a4-f1bb3c60300c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ yearlyl;

    /** YEARLYF (uuid:a4443baf-cfdd-edb2-bcf5-8efe59f7a1a9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ yearlyf;

    /** YEARLYA (uuid:6c1a37a1-d26b-b7c4-1829-27f65873eb1a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ yearlya;

    /** YEARLYI (uuid:48d339f3-8d32-49e8-d322-beae9d8e4206, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ yearlyi;

    /** CUSTOML (uuid:11f0f892-c595-351c-29f2-da2b5583fa94, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ customl;

    /** CUSTOMF (uuid:222d14fd-3774-0cba-a06e-1cec1bed3cc9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ customf;

    /** CUSTOMA (uuid:1d85c587-fd18-463b-cbe4-bc5bd0d3d234, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ customa;

    /** CUSTOMI (uuid:1e9a42d8-4fe0-c4fb-a12c-42b90fdb8900, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ customi;

    /** SDTMML (uuid:b1726472-e39c-9791-fff9-5b73d8ee7969, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtmml;

    /** SDTMMF (uuid:1fea4cef-872b-488a-f1f0-5eb9d7d2ac23, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtmmf;

    /** SDTMMA (uuid:1f7f9b07-f912-ac24-f2e4-43668399b0ff, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtmma;

    /** SDTMMI (uuid:260fb195-94e3-40fb-8aa4-8179532a2fd7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtmmi;

    /** SDTDDL (uuid:818c0a42-d615-80eb-3d4c-95bcfb7eaa37, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtddl;

    /** SDTDDF (uuid:1e5f920a-fe2f-e0ff-8335-7d3e2a60fb32, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtddf;

    /** SDTDDA (uuid:3b9f0a3f-a1ec-20b4-01fb-0e8fd3840de0, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtdda;

    /** SDTDDI (uuid:9207e583-f609-2e76-db96-cf9cef3bb15d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtddi;

    /** SDTYYYYL (uuid:803b5541-ea99-a9a9-65e6-e9f4432d08e2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtyyyyl;

    /** SDTYYYYF (uuid:c0ab1a07-8ab3-e201-a4e2-559c6240c973, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtyyyyf;

    /** SDTYYYYA (uuid:af2bfe70-b918-7afa-42e2-9920a5d7f366, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtyyyya;

    /** SDTYYYYI (uuid:08675796-3e3a-91e2-e242-041ed46eeeb8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtyyyyi;

    /** EDTMML (uuid:9c574d2c-6266-2846-b114-42b609158510, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtmml;

    /** EDTMMF (uuid:6f69a36c-7671-e843-0326-38a68b6ea5e7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtmmf;

    /** EDTMMA (uuid:56f1aeff-3d26-1576-2bb6-edbe77c385f2, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtmma;

    /** EDTMMI (uuid:bfd4946a-3011-4a44-76dd-70990470dc5e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtmmi;

    /** EDTDDL (uuid:ff1cc715-7884-ba96-6767-9125bd3c7f84, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtddl;

    /** EDTDDF (uuid:087cdd56-4e57-3568-3cf3-986132cd485e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtddf;

    /** EDTDDA (uuid:8b8f92d3-2ae1-9747-302c-8912da3372b5, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtdda;

    /** EDTDDI (uuid:38f02b18-eec6-19ac-9c62-279346333286, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtddi;

    /** EDTYYYYL (uuid:2a9c733f-9ad9-9497-ec17-aa1cdfb147ef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtyyyyl;

    /** EDTYYYYF (uuid:633a1201-e4be-e618-de0e-460a75622845, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtyyyyf;

    /** EDTYYYYA (uuid:fe288c2a-3866-d855-9ac7-8aadb22264d3, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtyyyya;

    /** EDTYYYYI (uuid:0fa1e191-9100-f764-1861-b58f88cd68dc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtyyyyi;

    /** CONFIRML (uuid:caa870cf-2f6f-661f-99b6-46f52a11ad32, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirml;

    /** CONFIRMF (uuid:c615ac11-bb21-5f64-8ca0-c12958b7f51d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmf;

    /** CONFIRMA (uuid:37d90e2f-941a-c3f2-360a-9004a7b5c475, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirma;

    /** CONFIRMI (uuid:cef1120f-6ce8-33e4-31a2-bf3a56e983bc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmi;

    /** ERRMSGL (uuid:143dd61a-9c68-cc0a-c1f3-d282c887be08, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgl;

    /** ERRMSGF (uuid:b0fd3436-4ec9-e4e1-f74d-48f83ba139c4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgf;

    /** ERRMSGA (uuid:f7d1fa2a-9a80-255a-dacc-67c2bf9b6d22, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsga;

    /** ERRMSGI (uuid:c7a720a3-4da8-543f-a70c-f3148be2831f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgi;

    /** CORPT0AO (uuid:e4cddd94-fd51-ebbb-788d-69126e394294, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ corpt0ao;

    /** TRNNAMEC (uuid:24cb3588-c9f3-f174-a06c-be299106bcd4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamec;

    /** TRNNAMEP (uuid:cb17c1d4-fc1d-8a72-1e9d-731a86353bca, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamep;

    /** TRNNAMEH (uuid:a4b333d4-2d45-a1f7-42a8-4798f58d66fd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameh;

    /** TRNNAMEV (uuid:34bd25eb-f281-b8fd-c8af-713e905b47fc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamev;

    /** TRNNAMEO (uuid:7ab0ef43-3082-0ff6-a96e-dec66b73f2e2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameo;

    /** TITLE01C (uuid:951fb4ef-530f-df7d-1c52-c90178d902bf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01c;

    /** TITLE01P (uuid:e981a070-64fb-eab5-9dd8-0f964be37385, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01p;

    /** TITLE01H (uuid:a8e41102-cb83-dee7-bb9a-dcfaeb3a5f8d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01h;

    /** TITLE01V (uuid:d9736421-606e-2922-9564-0f9521e4bdf8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01v;

    /** TITLE01O (uuid:8a3125d9-4380-7446-1518-34be693f3568, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01o;

    /** CURDATEC (uuid:6e171c98-88e5-ade4-fe81-b7049b656fb2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatec;

    /** CURDATEP (uuid:be9ab7b5-06c8-76e6-ce17-1a786af5d2f3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatep;

    /** CURDATEH (uuid:4c34790c-eee3-6019-ebbe-e52aa70586a2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateh;

    /** CURDATEV (uuid:86974775-24ee-1545-b8ba-d8eae23a85bf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatev;

    /** CURDATEO (uuid:e275d392-05ee-455e-78be-28c65cc251c1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateo;

    /** PGMNAMEC (uuid:0893245d-c269-6ab0-1d9a-c348c1baba45, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamec;

    /** PGMNAMEP (uuid:fb4f916a-60da-195e-25a9-364d56a95241, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamep;

    /** PGMNAMEH (uuid:9990996b-ab03-0b24-eecf-93525c6df0ee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameh;

    /** PGMNAMEV (uuid:29299e62-d5a8-b5d3-ff06-a3078908f22b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamev;

    /** PGMNAMEO (uuid:637c0248-8640-ec37-8663-5ee752d3b39d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameo;

    /** TITLE02C (uuid:b70a7aeb-ff2a-561e-ab2f-579835771b65, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02c;

    /** TITLE02P (uuid:a6609c1e-1e4a-7762-a2df-98e9a9719eed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02p;

    /** TITLE02H (uuid:a5e01d9c-a1aa-8644-6cca-a39075ca648f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02h;

    /** TITLE02V (uuid:f1cd7183-45c4-0ca9-d851-92def8754bd8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02v;

    /** TITLE02O (uuid:c95845cb-befb-ae19-1512-366d37d4ba7a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02o;

    /** CURTIMEC (uuid:65ab00f9-9a7a-ece2-eb5e-d3739eda3bc2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimec;

    /** CURTIMEP (uuid:c6cc47ad-1bad-061c-f1a4-c785b0e7f85e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimep;

    /** CURTIMEH (uuid:e2aff2d7-e7b7-49b6-6ebf-89b07d7f5f91, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeh;

    /** CURTIMEV (uuid:40b87dbd-89c2-6cd9-c5bc-38709abcb2f6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimev;

    /** CURTIMEO (uuid:ba8ea6f0-bfa5-41ba-1c07-e99c8061eacb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeo;

    /** MONTHLYC (uuid:5f36859c-704c-1192-596a-19a687f3aaef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ monthlyc;

    /** MONTHLYP (uuid:607a58c0-bc13-29ce-94b6-037149a5fb7a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ monthlyp;

    /** MONTHLYH (uuid:01a8c3d2-f8e8-97e9-902c-dc7caa2f24b9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ monthlyh;

    /** MONTHLYV (uuid:553850e4-c4c1-c966-0ff4-79f91fc90a8e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ monthlyv;

    /** MONTHLYO (uuid:0bfd4f76-6016-8bf7-cae5-a2a7de7ea137, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ monthlyo;

    /** YEARLYC (uuid:44a59231-693f-1127-ff47-bda5c4ace737, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ yearlyc;

    /** YEARLYP (uuid:25e1b301-3661-a892-e547-10dcdd66c832, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ yearlyp;

    /** YEARLYH (uuid:46e2c283-dda3-8af5-3ccb-18772fe14b42, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ yearlyh;

    /** YEARLYV (uuid:236f15cb-c848-6f51-2950-124b0ba037c9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ yearlyv;

    /** YEARLYO (uuid:28163124-2551-7e5d-7b7e-2fa557e6401a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ yearlyo;

    /** CUSTOMC (uuid:147f0bb0-3835-aa46-043f-c42691892454, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ customc;

    /** CUSTOMP (uuid:376b72ad-f966-eaf8-3048-a7ce21b78072, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ customp;

    /** CUSTOMH (uuid:82ccf387-ad4f-e0a8-ccfe-9919099f5f58, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ customh;

    /** CUSTOMV (uuid:7cbeb61c-7ec5-cf10-d6a9-f2aa6f99c9c2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ customv;

    /** CUSTOMO (uuid:ba38fbdc-0cec-c005-3dd6-ca03d1ba40ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ customo;

    /** SDTMMC (uuid:856c09f1-ff06-dbda-ea6d-422ce31aec9f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtmmc;

    /** SDTMMP (uuid:66865ccd-4b68-a2c6-237f-e69e1aedcd07, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtmmp;

    /** SDTMMH (uuid:3d37fa91-3cd8-29d9-f403-91404bc0ac69, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtmmh;

    /** SDTMMV (uuid:fdea22f7-3bf3-7f00-ffb7-3af9db61a16f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtmmv;

    /** SDTMMO (uuid:f771073a-5dbc-4b67-7ef9-10dc0c7d7952, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtmmo;

    /** SDTDDC (uuid:7149f887-dbc1-89d3-7303-d9d600addb33, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtddc;

    /** SDTDDP (uuid:9027f0fd-cc11-d146-582b-8effdd8a3d2a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtddp;

    /** SDTDDH (uuid:5642ad1f-72d1-6ad9-5879-250e3733b64d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtddh;

    /** SDTDDV (uuid:0f6cac6d-f3e6-1366-2879-630664211159, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtddv;

    /** SDTDDO (uuid:cfa58ad9-259a-ee1f-19f3-fb9a47bbaa8b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtddo;

    /** SDTYYYYC (uuid:6825ec43-a31c-9f11-7d24-7ddc4817ffc9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtyyyyc;

    /** SDTYYYYP (uuid:0bc03501-a175-e44c-373d-aa0a998ed0e7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtyyyyp;

    /** SDTYYYYH (uuid:0bb88c7d-268e-5386-cfbe-61b6dd068aad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtyyyyh;

    /** SDTYYYYV (uuid:0f962959-c5fa-32d1-9d0d-d097d9f6b3de, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtyyyyv;

    /** SDTYYYYO (uuid:4ff09f02-7f60-0de4-f47a-0656425191db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sdtyyyyo;

    /** EDTMMC (uuid:1e49b476-e11c-b95e-8a3b-b02ea81d2719, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtmmc;

    /** EDTMMP (uuid:a5185a43-82b1-017d-ec50-7464ecc2b066, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtmmp;

    /** EDTMMH (uuid:ad624aa4-cc14-1e2a-5f1e-ff18199d3499, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtmmh;

    /** EDTMMV (uuid:d757cfa6-c980-4224-0fb2-d2f47ae385cd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtmmv;

    /** EDTMMO (uuid:1ba2cb9a-7c83-3552-5378-0cc46f30afc5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtmmo;

    /** EDTDDC (uuid:1d8b252f-4157-9a6f-351a-9b1dd286d4ec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtddc;

    /** EDTDDP (uuid:83014215-32e4-c171-acf4-c188d503821c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtddp;

    /** EDTDDH (uuid:7963ad53-ce7e-64be-c5ae-5d7ae610a324, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtddh;

    /** EDTDDV (uuid:18c08af8-f3b8-58e7-3b3e-72d56e00e7f7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtddv;

    /** EDTDDO (uuid:c3bc0c30-0585-6b7d-8d44-cf155f7e56bf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtddo;

    /** EDTYYYYC (uuid:3963a09b-dedb-5a6c-1ed0-f635fe42d3ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtyyyyc;

    /** EDTYYYYP (uuid:158e32e5-199a-2c43-25a3-ad169ded315e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtyyyyp;

    /** EDTYYYYH (uuid:a9d96772-0c01-ac61-577c-8465319322c7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtyyyyh;

    /** EDTYYYYV (uuid:67f1235c-3db9-a369-6ba0-8da7c39c5ec6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtyyyyv;

    /** EDTYYYYO (uuid:1be89155-9a9d-df4a-93db-98ed21519630, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ edtyyyyo;

    /** CONFIRMC (uuid:223491b8-dbf0-dcf4-85fe-80ccefded0a1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmc;

    /** CONFIRMP (uuid:490fddbb-1cc9-5a52-294a-328c15ecf7e8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmp;

    /** CONFIRMH (uuid:cc0ca8de-9663-9095-828b-741e1a84f407, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmh;

    /** CONFIRMV (uuid:4a17454a-33df-e347-b6b3-7d03d872b99f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmv;

    /** CONFIRMO (uuid:cafc1340-211c-b0ff-9cfb-f9a78e91b080, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmo;

    /** ERRMSGC (uuid:60b18d5c-0429-78f2-da33-630eb2ba5847, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgc;

    /** ERRMSGP (uuid:0a5c512b-a243-65a8-43e0-a97d03e7bdee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgp;

    /** ERRMSGH (uuid:3e4ebd7a-0888-9289-54e7-5b3c751b6c2e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgh;

    /** ERRMSGV (uuid:d7540027-ae49-fb0f-6f6c-9e64b5ae6794, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgv;

    /** ERRMSGO (uuid:ef067ede-b1ac-f650-fb10-6710e4933e36, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgo;

    /** CCDA-SCREEN-TITLE (uuid:b46049cf-1a0a-c829-e352-687634000a69, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:5b5d6ef3-de06-ecc9-5a7c-a31b7c31a77a, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:dfa51285-8588-74a5-e191-ff2a5f997525, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:4d60b4f1-438d-6624-9217-f7bc19acb1b3, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** WS-DATE-TIME (uuid:ca94f92d-f74b-c7d9-71e5-70ead9544600, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:bfd5b74e-ffb0-15ee-4c8a-ead11e552d36, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:fae19533-1beb-dd5a-9232-e7f98621221c, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:6a4c49c2-7098-91a9-f245-2ef5584f6e6e, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:c6c165e3-a9c7-7e15-47ae-08f01a6913c8, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:c5d5dd9a-665d-60db-d4f6-6e359eca26bc, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:af85b2df-61f6-0476-0aa8-6a67f698b1e5, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:727e9c52-73e4-feaa-2844-21606e36077f, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:1f30dc56-66a7-bc1a-5659-8326736f88f6, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:4957159b-6361-2301-5e6a-51609ce7415a, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:ed9bb1cb-8911-a4ca-55e0-3851e262af09, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:34d261bf-5e4b-e975-94e9-a4a8203921f9, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:0e868130-1f47-bc6d-df40-fb277a7ca622, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:91b12575-cb7f-b9d1-4f2e-befc4c5df36d, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:91a75b08-e0a2-7ded-da84-78f1956b570a, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:0d201589-6bb5-45cd-1c06-666fd79c641c, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:88d0cbd8-d5c6-d9f5-dd2e-a2b7814b1f4c, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:1802270d-5c7d-1e62-6c77-aa3093eb1100, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:23604f40-9030-297b-1a9b-88a0c297f517, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:b08253ef-6445-9b71-cd67-1e1f071ca3ad, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:e9ea3a8b-31b3-4958-01e7-765eb3051d20, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:e2818a8a-63f6-3be1-a4fd-a49f5214c7ea, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:459744b2-bdb2-e596-d095-847add070a73, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:9105fb59-8271-c81a-2dad-5ab11d928fcd, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:9d05e9d2-8ce7-9a2e-4fba-b42e2db57338, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:acebd66a-be28-7c43-ab5a-14cd5c087e6d, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:596eebf7-da4d-a0d3-3896-71b3eb7440a7, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:cd06b225-c3d2-ded7-ee45-dee272b8bcdf, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:5bac6bfc-c5f3-707f-4b8a-6b4be7bd8119, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:bac3f8c2-aa4b-4d1b-2ee3-ce0d4947df30, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:d8c221c6-055b-1be8-0f46-d56aa89694cd, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:2e94d487-7c14-6a1c-0473-ecfb8cd39b4f, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** TRAN-RECORD (uuid:c5ea6113-5469-52a5-fdaa-7935315166d0, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tranRecord;

    /** TRAN-ID (uuid:98cfe6bf-3bff-0f41-9ed9-cf5abf98b6bd, level 5, PIC X(16).). */
    public String tranId;

    /** TRAN-TYPE-CD (uuid:6f0d4864-2650-b30a-5c10-7a07d290ba8e, level 5, PIC X(02).). */
    public String tranTypeCd;

    /** TRAN-CAT-CD (uuid:18f9308a-b09e-d2e2-eb55-3dc7f9b94101, level 5, PIC 9(04).). */
    public int /* PIC 9(04). */ tranCatCd;

    /** TRAN-SOURCE (uuid:f71db475-a1f0-2d68-d8c7-3a6842231cdf, level 5, PIC X(10).). */
    public String tranSource;

    /** TRAN-DESC (uuid:68739db0-3fba-650a-6900-3cf81d78fec1, level 5, PIC X(100).). */
    public String tranDesc;

    /** TRAN-AMT (uuid:d4b2ca0d-3e43-9f8b-b46f-dcfd42e7f8c5, level 5, PIC S9(09)V99.). */
    public BigDecimal /* precision=11, scale=2, signed */ tranAmt;

    /** TRAN-MERCHANT-ID (uuid:1cb8e16c-2a81-0bd7-ab46-c9593ea30189, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ tranMerchantId;

    /** TRAN-MERCHANT-NAME (uuid:3df3f4f1-4b9d-9c9c-c83c-1b9b54c4c76a, level 5, PIC X(50).). */
    public String tranMerchantName;

    /** TRAN-MERCHANT-CITY (uuid:b5c5b926-116b-4883-c8a9-3220aceb07fb, level 5, PIC X(50).). */
    public String tranMerchantCity;

    /** TRAN-MERCHANT-ZIP (uuid:d77d8c4d-371f-483b-1e70-f5b5a71625e7, level 5, PIC X(10).). */
    public String tranMerchantZip;

    /** TRAN-CARD-NUM (uuid:542ffde4-1924-ee86-5ce2-84a2c4133864, level 5, PIC X(16).). */
    public String tranCardNum;

    /** TRAN-ORIG-TS (uuid:99c37b0f-da76-5890-6b4e-7537f457d0bb, level 5, PIC X(26).). */
    public String tranOrigTs;

    /** TRAN-PROC-TS (uuid:c8859761-5991-6956-268d-9ad6ada506fc, level 5, PIC X(26).). */
    public String tranProcTs;

    /** DFHAID (uuid:18d59dda-9c68-2565-b9ba-16c15e14c898, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:d9ce603a-aad2-4b5f-fc79-07d1cae78886, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:01799b31-992e-244d-3b73-8ac8020b650a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:effc3ed1-8574-d68b-8667-879440e094a9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:09903cfd-d643-7272-cba6-61ed444403d8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:0ce56dac-3265-d606-0732-962723af4d15, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:46efaf88-bbdb-88cf-f236-9a41cb8a56e7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:7d91fc96-ea8e-8f44-c59f-79089d6f3ccb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:261112c2-4f3e-4abb-3f10-d065705550e8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:219925b4-212e-1bfb-5059-447b692764ae, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:70f40757-309f-96fe-c4a9-78502b54ea6b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:e935e37c-33fd-1e2d-d790-7ebe6a958d7e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:b7910202-7494-b673-cc50-b020eaf532bc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:dc2d9509-76ab-fbeb-d56f-fe5ea73da63a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:e22e51c6-5ce9-97d9-9450-c9785777acb3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:cb08e9eb-7ffd-9b14-3f62-e9199bc98721, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:47470627-0f52-186c-0043-481f56ec7aa1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:8234ef8a-8563-6e11-3b5b-19ba4958c76b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:ce6427f1-807a-14b2-d465-4b243c8a9e5d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:0f01e202-4cc8-c7b5-eb51-68578398135a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:86ede483-a2fd-06bf-cdd4-0131b95b5d75, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:fff48bf1-7aee-eec4-1b30-a6fce091d488, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:55678cc4-fa63-c10e-aac5-d43150790fa9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:6cf6b133-7f38-3d08-8ba9-a932e8c96519, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:b12cbbbc-44f6-15b6-432b-1b0215b9fc8e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:44148070-41f1-44d1-f429-223738fb6835, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:c89530b4-5802-7f06-06b5-41f29f29285e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:9f8b558f-8a69-f0ff-abde-376968ee692a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:186818bd-8e53-27ef-2bc1-1f7f51af0e8f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:d3e1d969-64a5-21de-9f86-83f5b1d9de38, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:36721768-45e0-2bed-8196-4e9047b1a08c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:f5b5b4ea-ab7b-6265-0359-29b6553f3b20, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:e0fa12d3-1f71-f1f5-2ee1-5e1c55bf73ed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:73fdc7ef-3bce-8905-6b23-f2186f7ce715, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:141e1741-9f4e-faba-0629-511bca27d0c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:94594c20-e2d8-cc11-e38a-9841243caa4a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:30e9f819-49e2-64db-d5d7-9bf45c797026, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** DFHBMSCA (uuid:6a42e242-08b2-1b1b-c9e7-bfb7da796e50, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:51e09aab-e321-fd0d-985d-51b387235c7b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:a96e7c06-f459-6429-3611-229d121fe709, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:dae97250-0e7d-6608-1d38-4495103c08da, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:2be3a246-d679-691b-2e6f-28b772a406d6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:5cc54884-9977-aa61-cb2f-b1927b4ae97c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:a59b0b25-7d04-4dd7-8db9-c79538eccdf9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:058ff9b0-4cae-bd4c-f220-5431b93e67cd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:a8161861-a59e-f8df-fc99-764f00dca1ee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:9ae20e9e-3dd7-94b9-c91e-506709685345, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:461de4cb-42c1-157a-d1ac-5d3a44c7f23f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:b237b8c4-3d8f-18ec-7379-39ae522a9e02, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:c6306c67-0c0d-c204-6a1d-c32930185964, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:71661f53-0bcb-2ed4-418f-f37a8c5f2146, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:cdcb8aa7-22af-5a22-47cb-4afa64092fe0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:01230d72-78c7-d456-b495-35f73aa895bf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:14be0d20-f928-d1c3-1fd1-28ff5fc194a5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:56baa6a7-ccfc-edc6-1a3e-a8304f120527, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:66baa7ab-0744-7f8f-fe4c-531d68066467, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:a4750ecc-de09-4502-227d-299cb6459755, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:c7c6b715-aea1-3727-ec4c-904bdfed70be, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:fbd1e216-f420-c0b7-c1ef-c9d2a2af7829, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:7da1d527-fdfc-1209-8207-d39576d10d36, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:7bf9e056-b1f4-db34-d724-9eb8061be262, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:9fdbca1c-5358-5c8b-d128-45f64fd281c4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:a52433c5-9cff-a29d-91a5-62d40e76d249, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:bd6f017e-59e5-c32a-1b0e-e3fc9edf4da6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:760798d0-af66-5e98-5621-4b519c1bf8ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:77933eaa-a7e5-6479-ca7d-6f3bafd7cf02, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:82ad18fb-b394-9a8c-a630-2e56878b2ebe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;


    // --- auto-generated stubs for undeclared references ---
    public Object eibcalen;  // auto-stub for undeclared reference
    public Object of;  // auto-stub for undeclared reference

    /** MAIN-PARA  (uuid:0f545fc6-e999-01b9-2332-6de20d648a81, source lines 641-680). */
    public void mainPara() {
        // SET ERR-FLG-OFF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET TRANSACT-NOT-EOF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET SEND-ERASE-YES TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsMessage = "";
        this.errmsgo = "";
        if (java.util.Objects.equals(this.eibcalen, 0)) {
            // TODO: translate body for: EIBCALEN = 0
        }
    }

    /** PROCESS-ENTER-KEY  (uuid:95c0b913-f539-259c-c882-0d9fdf88f43e, source lines 686-934). */
    public void processEnterKey() {
        System.out.println("PROCESS ENTER KEY");  // DISPLAY 'PROCESS ENTER KEY'
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
    }

    /** SUBMIT-JOB-TO-INTRDR  (uuid:14f2951e-8b78-69bf-e72e-3ca2266b8b41, source lines 940-988). */
    public void submitJobToIntrdr() {
        if ((true /* TODO translate: CONFIRMI OF CORPT0AI = SPACES */) || (true /* TODO translate: LOW-VALUES */)) {
            // TODO: translate body for: CONFIRMI OF CORPT0AI = SPACES OR LOW-VALUES
        }
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
    }

    /** WIRTE-JOBSUB-TDQ  (uuid:18687b8d-f854-16c8-74c2-2a6d8c0e2c29, source lines 993-1013). */
    public void wirteJobsubTdq() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** RETURN-TO-PREV-SCREEN  (uuid:9efc0786-fa1a-a23d-83ed-ad6dfe293808, source lines 1018-1029). */
    public void returnToPrevScreen() {
        if (java.util.Objects.equals(this.cdemoToProgram, "\u0000")) {
            // TODO: translate body for: CDEMO-TO-PROGRAM = LOW-VALUES OR SPACES
        }
        // MOVE WS-TRANID TO CDEMO-FROM-TRANID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO CDEMO-FROM-PROGRAM  -- identifier MOVE; needs PIC-aware type coercion
        this.cdemoPgmContext = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
    }

    /** SEND-TRNRPT-SCREEN  (uuid:426764d1-431b-4804-6f6b-3221c2ae9506, source lines 1034-1058). */
    public void sendTrnrptScreen() {
        this.populateHeaderInfo();  // PERFORM
        // MOVE WS-MESSAGE TO ERRMSGO OF CORPT0AO  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: SEND-ERASE-YES *>EXECCICS */) {
            // TODO: translate body for: SEND-ERASE-YES *>EXECCICS
        }
        // COBOL [GO_TO]: GO TO RETURN-TO-CICS
    }

    /** RETURN-TO-CICS  (uuid:36082e4a-8050-69b9-314d-5001d73de738, source lines 1063-1069). */
    public void returnToCics() {
        // TODO: implement returnToCics.  See uuid:36082e4a-8050-69b9-314d-5001d73de738
    }

    /** RECEIVE-TRNRPT-SCREEN  (uuid:a5d338b8-d621-171e-072d-4948ec17100f, source lines 1074-1082). */
    public void receiveTrnrptScreen() {
        // TODO: implement receiveTrnrptScreen.  See uuid:a5d338b8-d621-171e-072d-4948ec17100f
    }

    /** POPULATE-HEADER-INFO  (uuid:a4fa8b97-640d-e239-7fe7-4a575b961efb, source lines 1087-1106). */
    public void populateHeaderInfo() {
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF CORPT0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF CORPT0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-TRANID TO TRNNAMEO OF CORPT0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO PGMNAMEO OF CORPT0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF CORPT0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF CORPT0AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** INITIALIZE-ALL-FIELDS  (uuid:921acb22-f985-7043-2194-17b8f57b4076, source lines 1111-1124). */
    public void initializeAllFields() {
        this.monthlyl = -1;
        // INITIALIZE monthlyi of corpt0ai yearlyi of corpt0ai customi of corpt0ai sdtmmi of corpt0ai sdtddi of corpt0ai sdtyyyyi of corpt0ai edtmmi of corpt0ai edtddi of corpt0ai edtyyyyi of corpt0ai confirmi of corpt0ai wsMessage: reset to PIC defaults
        this.monthlyi = null;  // TODO: set to type-appropriate zero/spaces
        this.of = null;  // TODO: set to type-appropriate zero/spaces
        this.corpt0ai = null;  // TODO: set to type-appropriate zero/spaces
        this.yearlyi = null;  // TODO: set to type-appropriate zero/spaces
        this.of = null;  // TODO: set to type-appropriate zero/spaces
        this.corpt0ai = null;  // TODO: set to type-appropriate zero/spaces
        this.customi = null;  // TODO: set to type-appropriate zero/spaces
        this.of = null;  // TODO: set to type-appropriate zero/spaces
        this.corpt0ai = null;  // TODO: set to type-appropriate zero/spaces
        this.sdtmmi = null;  // TODO: set to type-appropriate zero/spaces
        this.of = null;  // TODO: set to type-appropriate zero/spaces
        this.corpt0ai = null;  // TODO: set to type-appropriate zero/spaces
        this.sdtddi = null;  // TODO: set to type-appropriate zero/spaces
        this.of = null;  // TODO: set to type-appropriate zero/spaces
        this.corpt0ai = null;  // TODO: set to type-appropriate zero/spaces
        this.sdtyyyyi = null;  // TODO: set to type-appropriate zero/spaces
        this.of = null;  // TODO: set to type-appropriate zero/spaces
        this.corpt0ai = null;  // TODO: set to type-appropriate zero/spaces
        this.edtmmi = null;  // TODO: set to type-appropriate zero/spaces
        this.of = null;  // TODO: set to type-appropriate zero/spaces
        this.corpt0ai = null;  // TODO: set to type-appropriate zero/spaces
        this.edtddi = null;  // TODO: set to type-appropriate zero/spaces
        this.of = null;  // TODO: set to type-appropriate zero/spaces
        this.corpt0ai = null;  // TODO: set to type-appropriate zero/spaces
        this.edtyyyyi = null;  // TODO: set to type-appropriate zero/spaces
        this.of = null;  // TODO: set to type-appropriate zero/spaces
        this.corpt0ai = null;  // TODO: set to type-appropriate zero/spaces
        this.confirmi = null;  // TODO: set to type-appropriate zero/spaces
        this.of = null;  // TODO: set to type-appropriate zero/spaces
        this.corpt0ai = null;  // TODO: set to type-appropriate zero/spaces
        this.wsMessage = null;  // TODO: set to type-appropriate zero/spaces
    }

    public static void main(String[] args) {
        new Corpt00c().mainPara();
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
