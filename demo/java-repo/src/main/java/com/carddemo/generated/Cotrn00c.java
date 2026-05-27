// Generated from COTRN00C.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COTRN00C.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * COTRN00C (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: COTRN00C.cbl
 */
public class Cotrn00c {

    /** WS-VARIABLES (uuid:da381b5f-f695-304e-0810-bd5f6046769f, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsVariables;

    /** WS-PGMNAME (uuid:4fee9027-a2ab-1142-3075-ae9dc3d86d3a, level 5, PIC X(08)). */
    public String wsPgmname;

    /** WS-TRANID (uuid:7d90c78d-2096-f98c-7e05-57e35c2621d3, level 5, PIC X(04)). */
    public String wsTranid;

    /** WS-MESSAGE (uuid:bd5eeade-ae5e-0598-9f12-9dfe93b7deec, level 5, PIC X(80)). */
    public String wsMessage;

    /** WS-TRANSACT-FILE (uuid:48337cda-7b07-abc6-f943-cb9df78167fb, level 5, PIC X(08)). */
    public String wsTransactFile;

    /** WS-ERR-FLG (uuid:d3d38354-7d3c-862d-3334-447184f8ebb8, level 5, PIC X(01)). */
    public String wsErrFlg;

    /** WS-TRANSACT-EOF (uuid:423f0a77-61d6-136b-c5fb-cc765785dcfb, level 5, PIC X(01)). */
    public String wsTransactEof;

    /** WS-SEND-ERASE-FLG (uuid:37fc6271-8472-c518-23f2-b7c609efdd95, level 5, PIC X(01)). */
    public String wsSendEraseFlg;

    /** WS-RESP-CD (uuid:840cd015-68d6-d1da-6d06-1d5ee5f6366e, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsRespCd;

    /** WS-REAS-CD (uuid:7ed8ee00-b245-9882-73f6-5f99a3e994f0, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsReasCd;

    /** WS-REC-COUNT (uuid:df10678e-96d1-1375-a80e-6ddce68df7fa, level 5, PIC S9(04) COMP). */
    public int /* PIC S9(04) signed */ wsRecCount;

    /** WS-IDX (uuid:f88e2b4f-7788-1499-1c71-c3324957cb89, level 5, PIC S9(04) COMP). */
    public int /* PIC S9(04) signed */ wsIdx;

    /** WS-PAGE-NUM (uuid:22111698-f9f6-f490-525d-30397389da9c, level 5, PIC S9(04) COMP). */
    public int /* PIC S9(04) signed */ wsPageNum;

    /** WS-TRAN-AMT (uuid:76062fbc-686f-42d9-b64b-b2c82fda2eed, level 5, PIC +99999999.99.). */
    public long /* PIC +99999999.99. */ wsTranAmt;

    /** WS-TRAN-DATE (uuid:60a7cf63-628a-5624-f08d-f6e874fb8474, level 5, PIC X(08)). */
    public String wsTranDate;

    /** CARDDEMO-COMMAREA (uuid:121c749b-72e1-35a9-1c42-fb9cc6a5ded8, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:c95c7e11-c0f8-fd89-3a10-2467b346cb58, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:d460a19a-ae25-2789-af79-1b181976cd4b, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:62887e35-f7c8-18fe-aa98-e86db318c68e, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:770eb631-c5b2-f4ed-bcfe-e3eff0056fa3, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:e66459ed-cf82-08f3-cc33-baa8827af327, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:4a2c6530-03ed-aff0-a6f4-ff285d3d5c97, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:00d9192f-a054-bea8-6f6e-280e7f87c39e, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:773b3d04-4397-a441-d4f2-e8580de8becf, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:3e4af7f7-cf53-8c78-32db-19a31fa88084, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:2f8dc1fa-0717-3ea2-45ae-a2051b6368cc, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:23dece8e-19d9-4d8e-325a-5766a9eb7a40, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:4fd0a97e-a186-5576-f38b-0576bf71888b, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:fc1f11b2-8b76-9af5-7365-8bf7557512e1, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:651374e4-6792-e097-867f-a4fcb8022d9b, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:7fc232ac-c232-162e-8c0a-c0fa2cb82cde, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:2b5a0eb9-0c40-48b1-a297-d9759dc3b01a, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:e166dc14-098b-94fb-6c29-cecc6bf22989, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:2342b3c2-99c4-1c61-30cd-f928d22e817a, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:2dcea433-e6f3-7dce-e05a-21cac9d49aab, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:8a0e5d09-b9e3-49e4-a125-56c9b4a615a6, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:70820c91-66be-bd40-c56b-5f5608cde3d9, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** CDEMO-CT00-INFO (uuid:768e8734-17f7-8af5-062c-dbfc97c0bc0d, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCt00Info;

    /** CDEMO-CT00-TRNID-FIRST (uuid:4303509b-219d-9fd9-f2fe-140aff350712, level 10, PIC X(16).). */
    public String cdemoCt00TrnidFirst;

    /** CDEMO-CT00-TRNID-LAST (uuid:56c76c78-95b7-1c2d-d53d-6c643645fd2d, level 10, PIC X(16).). */
    public String cdemoCt00TrnidLast;

    /** CDEMO-CT00-PAGE-NUM (uuid:a823d6c1-6cda-142f-b4a5-7cfb1161cbbe, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ cdemoCt00PageNum;

    /** CDEMO-CT00-NEXT-PAGE-FLG (uuid:ee206f96-9807-ff8f-43ba-7588bad8948a, level 10, PIC X(01)). */
    public String cdemoCt00NextPageFlg;

    /** CDEMO-CT00-TRN-SEL-FLG (uuid:9d0c4cb0-f18c-328b-b14f-929a1580134d, level 10, PIC X(01).). */
    public String cdemoCt00TrnSelFlg;

    /** CDEMO-CT00-TRN-SELECTED (uuid:3e840336-7e69-6454-73b4-952183cbbd36, level 10, PIC X(16).). */
    public String cdemoCt00TrnSelected;

    /** COTRN0AI (uuid:af7494f0-1128-09bb-bda9-23e318717972, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cotrn0ai;

    /** TRNNAMEL (uuid:6fbe37ef-7b19-2a07-02d3-40d2f117d945, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamel;

    /** TRNNAMEF (uuid:a6428d0f-9167-12e1-cdc6-9d377fccee6c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamef;

    /** TRNNAMEA (uuid:9f94d114-5ff1-47ae-7fea-e5da2fddc273, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamea;

    /** TRNNAMEI (uuid:881957e3-dc2d-1d17-6cbe-9f3dd1ebe4ca, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamei;

    /** TITLE01L (uuid:a34696ff-9d04-481b-dc5e-717ba2352cc7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01l;

    /** TITLE01F (uuid:04f7f5a8-4743-82b8-5b57-6b7b3aec031b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01f;

    /** TITLE01A (uuid:13f626d0-2383-ad12-7312-750c031324aa, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01a;

    /** TITLE01I (uuid:64d5a4f8-e28c-325d-4eb7-6630abe53712, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01i;

    /** CURDATEL (uuid:f5e77c2b-877e-7466-d75f-3cb19e6d8f40, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatel;

    /** CURDATEF (uuid:aab27a89-0902-56aa-82c8-510e9d281cba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatef;

    /** CURDATEA (uuid:eeb65328-fbb9-3735-16d3-0be94bd736bc, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatea;

    /** CURDATEI (uuid:08c2fef6-5b74-c120-e833-64fbc1e63e1c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatei;

    /** PGMNAMEL (uuid:dddd6beb-34a9-9b47-359b-0986b9dd7749, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamel;

    /** PGMNAMEF (uuid:c311973d-5790-5f80-fe21-d1ec5adafc9d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamef;

    /** PGMNAMEA (uuid:b065cbc1-6163-24b5-fe28-0eaede2e34d6, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamea;

    /** PGMNAMEI (uuid:9e01cae2-14ac-b66b-9482-482b798420ce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamei;

    /** TITLE02L (uuid:a236a1b6-ea36-91f5-9366-0372062c3894, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02l;

    /** TITLE02F (uuid:b81e0442-738c-f37a-5efc-39e3c349202f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02f;

    /** TITLE02A (uuid:097cbd39-373d-4c00-101e-e634b462b5a8, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02a;

    /** TITLE02I (uuid:d7c165b7-af8c-3c1d-6b19-5232b0c19f5c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02i;

    /** CURTIMEL (uuid:88b16d44-7763-2a57-a071-cf122b0a375b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimel;

    /** CURTIMEF (uuid:90d725f4-ffb5-4466-d598-d15f253aadfc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimef;

    /** CURTIMEA (uuid:f6c564f6-f0cb-88e5-003b-c9b57262350c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimea;

    /** CURTIMEI (uuid:6f36e604-5645-c20b-c823-473577f8332e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimei;

    /** PAGENUML (uuid:fcde2f56-a3fc-6c3c-231c-b0f301fbe580, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenuml;

    /** PAGENUMF (uuid:7c7494c5-c26a-4acd-67fc-8e30c9e35357, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenumf;

    /** PAGENUMA (uuid:eb19e54f-5bd6-82b3-56fe-0f7608abb545, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenuma;

    /** PAGENUMI (uuid:8fd58d1b-aaf3-6b8a-63e5-18e43c4b91de, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenumi;

    /** TRNIDINL (uuid:643e89b6-17fd-ddec-a55a-ed01876a9cf9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidinl;

    /** TRNIDINF (uuid:9a56deaf-fb98-991e-1fd6-e3d095686dd0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidinf;

    /** TRNIDINA (uuid:0f18d3e8-4fdb-6e43-be23-dc5bfa7ff000, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidina;

    /** TRNIDINI (uuid:0f841658-763b-6cfd-bc74-02079c68f74d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidini;

    /** SEL0001L (uuid:ed16c903-b5e2-57fc-6887-21d3fb608a51, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001l;

    /** SEL0001F (uuid:4a9b6072-0730-3d6b-5ade-1e1fcd11ae5e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001f;

    /** SEL0001A (uuid:32a727bf-b732-866b-d5ab-9eb723f2ddac, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001a;

    /** SEL0001I (uuid:32423195-f873-b3b0-2951-32dede0aec48, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001i;

    /** TRNID01L (uuid:0ef384da-a5ae-de66-33d8-79020bb4d8b7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid01l;

    /** TRNID01F (uuid:badb83a1-ba2d-e01a-bb59-6cf94d625d94, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid01f;

    /** TRNID01A (uuid:46755bbd-1a5f-bd28-6efa-f0f09cbc84d5, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid01a;

    /** TRNID01I (uuid:c84cd94f-d60b-5e1d-01d7-43fd97b5ee0b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid01i;

    /** TDATE01L (uuid:fa99160e-9bc8-0009-54c8-b4906a5f1f2a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate01l;

    /** TDATE01F (uuid:0c8e2ea1-a6aa-7d62-6056-c71d540864b9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate01f;

    /** TDATE01A (uuid:3404c495-1705-280f-b36b-1677b80ecde7, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate01a;

    /** TDATE01I (uuid:305fe107-183f-1911-5aa4-c9a4543db4c6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate01i;

    /** TDESC01L (uuid:4b6fd273-0d8b-cef7-865f-6698959aa2a7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc01l;

    /** TDESC01F (uuid:541a5ba5-e1c2-ac94-332c-120214ccd382, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc01f;

    /** TDESC01A (uuid:b9f9d5ed-1c82-c1a6-b382-41303767883a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc01a;

    /** TDESC01I (uuid:3ba7960d-da37-5e30-2530-1123027e8347, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc01i;

    /** TAMT001L (uuid:9e11b1eb-4a2d-5ea8-f403-73381293ca77, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt001l;

    /** TAMT001F (uuid:569b947c-d767-9c50-b172-c527acbcc148, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt001f;

    /** TAMT001A (uuid:1809cb7b-bf01-e9f3-a460-3992fe19bf2d, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt001a;

    /** TAMT001I (uuid:6efe0d28-07fa-1072-a836-87dd757998aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt001i;

    /** SEL0002L (uuid:29cef757-0e00-45c3-85fc-426bd2c92556, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002l;

    /** SEL0002F (uuid:811001c3-52bb-41cd-64ef-9bb226377a0f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002f;

    /** SEL0002A (uuid:568bfb02-ec95-b3b3-7aa2-15171f58c3d6, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002a;

    /** SEL0002I (uuid:307d46e3-7cc0-ead2-54d0-d736b45d6f29, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002i;

    /** TRNID02L (uuid:4fe8f923-fd19-20b2-798f-1e5a813f67be, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid02l;

    /** TRNID02F (uuid:ae98dc3b-5b4c-3346-1c5e-19cde72e8b4f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid02f;

    /** TRNID02A (uuid:16ac0a10-ad00-e762-ce96-6b25400bcbb3, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid02a;

    /** TRNID02I (uuid:ffe0e365-1491-e2f5-64cd-dfa294f44d72, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid02i;

    /** TDATE02L (uuid:066b05b8-9738-211b-8b1f-d8003c0647f6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate02l;

    /** TDATE02F (uuid:89a9abff-7da2-bfe0-6005-d33e6d221398, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate02f;

    /** TDATE02A (uuid:485f83f2-187d-52cd-daad-82170acedf5a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate02a;

    /** TDATE02I (uuid:24ed4b58-07f0-832e-9cf8-2d621f7675e9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate02i;

    /** TDESC02L (uuid:574c12d3-a5a4-8c3e-ca0f-3d4cf914b511, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc02l;

    /** TDESC02F (uuid:0ecac986-570d-a852-8d4c-121cce65efa4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc02f;

    /** TDESC02A (uuid:42e5fc64-c4b6-5156-71de-55ea2d129996, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc02a;

    /** TDESC02I (uuid:a4e66144-a596-5871-d641-d569897da3e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc02i;

    /** TAMT002L (uuid:476b0d55-90b1-ffa0-df84-2f08b9c8aafc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt002l;

    /** TAMT002F (uuid:499a200e-d308-66a6-063c-baa393e25d34, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt002f;

    /** TAMT002A (uuid:740417ae-8330-fff5-663b-7c741385f7fb, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt002a;

    /** TAMT002I (uuid:567c1264-9250-3684-86a7-415669528984, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt002i;

    /** SEL0003L (uuid:62ec8856-4205-c023-17a6-69c75111a162, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003l;

    /** SEL0003F (uuid:8baf6b1e-848b-7b98-53ae-20281e811b39, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003f;

    /** SEL0003A (uuid:8f8812c4-e4e4-e671-f16f-2fbb099ab557, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003a;

    /** SEL0003I (uuid:01a2259e-5133-2ff0-1354-3bdd3d5f3981, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003i;

    /** TRNID03L (uuid:7fe1f4d3-a00b-1484-02be-97258b0ec0bf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid03l;

    /** TRNID03F (uuid:9be86798-c32f-7e0f-f99f-205f13eccaa8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid03f;

    /** TRNID03A (uuid:50c0820f-e888-51f1-7e0d-29ebd7da81e3, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid03a;

    /** TRNID03I (uuid:7628a3cf-11d4-2d3e-4eee-3e8aab489b27, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid03i;

    /** TDATE03L (uuid:ae6e72e3-a656-bd87-c59f-093ead8f1e70, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate03l;

    /** TDATE03F (uuid:726d6986-0eb7-9869-2399-ab8a3b6e78b0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate03f;

    /** TDATE03A (uuid:60c6ef93-f2eb-8de9-7715-30fbe9e74e0d, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate03a;

    /** TDATE03I (uuid:a74049d7-aae3-8757-af9a-ac1a599739e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate03i;

    /** TDESC03L (uuid:b59a1529-59e4-d83d-99da-ace26be1a406, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc03l;

    /** TDESC03F (uuid:943fd0e0-5cc0-662f-18dc-20d3a2cad421, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc03f;

    /** TDESC03A (uuid:443b0e59-c948-ace7-1f4f-e4d20d91edfd, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc03a;

    /** TDESC03I (uuid:f61d6dd2-78bd-3e75-613a-62f5c532640b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc03i;

    /** TAMT003L (uuid:6363fd91-902a-51d2-7145-a55c8a8ddc60, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt003l;

    /** TAMT003F (uuid:c6692bb8-8a79-f437-1f6d-9dd0bcde1702, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt003f;

    /** TAMT003A (uuid:68c8e3b1-7d0a-bcc5-db26-b5391af6c6ad, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt003a;

    /** TAMT003I (uuid:05814acf-cd71-aaf1-ba9a-dd054daed4a3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt003i;

    /** SEL0004L (uuid:9e1111fe-e181-31bf-676b-2aaaa5fff523, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004l;

    /** SEL0004F (uuid:dce7dbc3-673b-2760-5345-3939b0fe234d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004f;

    /** SEL0004A (uuid:4d8749b6-ba71-0b2b-e0fc-4c5e87e3b29e, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004a;

    /** SEL0004I (uuid:c0033dea-a082-901e-0e8b-2928f4595367, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004i;

    /** TRNID04L (uuid:d68ff424-b550-bcad-0a5e-198d9b3f64a4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid04l;

    /** TRNID04F (uuid:f3615de0-215a-0183-9838-749f8bec2927, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid04f;

    /** TRNID04A (uuid:74eb33b3-8596-b355-a905-76ba94b217b3, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid04a;

    /** TRNID04I (uuid:2c420165-accb-721a-e87f-6033f17225ce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid04i;

    /** TDATE04L (uuid:60e4d4b6-7270-99c7-33e3-4f861f109c16, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate04l;

    /** TDATE04F (uuid:b527634e-db57-7c51-8095-88dd1a27df00, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate04f;

    /** TDATE04A (uuid:37d43960-95ed-2f16-e981-0baea2912abd, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate04a;

    /** TDATE04I (uuid:77411070-b092-cc39-d859-d4dbb5b4428a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate04i;

    /** TDESC04L (uuid:e554164c-d35e-0e09-6057-561b2ae6c42d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc04l;

    /** TDESC04F (uuid:ab48e91b-3ddb-e0f2-8814-57c89aaa0603, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc04f;

    /** TDESC04A (uuid:85668e2c-ee95-94d8-36ca-0d9f9ef3dc82, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc04a;

    /** TDESC04I (uuid:3bd7ce61-1975-1bde-4275-48a67977ec2f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc04i;

    /** TAMT004L (uuid:06dea9a7-e2d4-8caa-81d6-6db0c22c3a27, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt004l;

    /** TAMT004F (uuid:2dc2bb28-3da2-a944-bbed-d837d79fb2c0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt004f;

    /** TAMT004A (uuid:bf21d81c-64ad-5931-1a0e-4b94f937d162, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt004a;

    /** TAMT004I (uuid:f3a249f1-00a5-7625-0ba8-beb97f2a1ac6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt004i;

    /** SEL0005L (uuid:d72934a3-15a1-e516-f4be-e01798257c07, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005l;

    /** SEL0005F (uuid:97d60c82-04cf-00c5-ffc0-419d6f592434, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005f;

    /** SEL0005A (uuid:b85016c9-3360-1ba9-07f5-f719ffcd95f1, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005a;

    /** SEL0005I (uuid:9723aa6f-88a3-6d92-841a-b948e01c4a8c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005i;

    /** TRNID05L (uuid:6be3cb7a-961a-7238-66c2-9df930ffeb22, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid05l;

    /** TRNID05F (uuid:fa7e42d4-b166-a037-7c48-64cb711cb94f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid05f;

    /** TRNID05A (uuid:02ed80a2-7017-7800-e435-277b0d728766, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid05a;

    /** TRNID05I (uuid:1850dc3a-f11b-ee04-f744-e76e36f3dd25, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid05i;

    /** TDATE05L (uuid:a8738feb-c650-73e6-6fc2-42cfef9c9264, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate05l;

    /** TDATE05F (uuid:84baa7c2-aaf5-885e-de4b-d5727140322b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate05f;

    /** TDATE05A (uuid:b49812d5-d128-bff0-8a23-3bb1b6fe0cc0, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate05a;

    /** TDATE05I (uuid:b92f84ab-2edc-45e0-8e9e-13feabf550b1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate05i;

    /** TDESC05L (uuid:d97cfdff-1986-e103-ff51-86c8bbd4d09c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc05l;

    /** TDESC05F (uuid:e2ac7ca0-436c-002f-98de-cb23cce231d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc05f;

    /** TDESC05A (uuid:f1f35a99-98bc-f710-2235-9fab67b65519, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc05a;

    /** TDESC05I (uuid:0a03c876-ee8b-60b6-328e-21302da10c5c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc05i;

    /** TAMT005L (uuid:b25c19ef-2d6e-d251-54d2-3199c0e5970a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt005l;

    /** TAMT005F (uuid:5ae6453f-cac5-24ab-8b5d-a714000af9e1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt005f;

    /** TAMT005A (uuid:b2a0bd85-8f79-7319-fadd-24424504c57c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt005a;

    /** TAMT005I (uuid:7438ffb0-c72d-1d8e-ed5e-50712bca074c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt005i;

    /** SEL0006L (uuid:663a08b4-ac57-4b6b-5b7c-7a20bf25e703, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006l;

    /** SEL0006F (uuid:e3b94c19-7c8e-a348-863c-5fe538216c24, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006f;

    /** SEL0006A (uuid:3ddcb8ce-05ad-a572-ab89-6c8f9234d660, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006a;

    /** SEL0006I (uuid:14a7fccb-d750-c4fd-994f-e9ed60cc290a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006i;

    /** TRNID06L (uuid:6a683ae6-e1d8-be81-9510-6b800f4f7575, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid06l;

    /** TRNID06F (uuid:35fb7f0b-637b-9e09-95a3-0cfe279ff4e1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid06f;

    /** TRNID06A (uuid:64002c06-6f47-30fc-92c4-380bd8a0ff80, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid06a;

    /** TRNID06I (uuid:62108d41-ef04-51e7-f2b8-fb7810428e79, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid06i;

    /** TDATE06L (uuid:ec48f1d8-8282-cbff-6613-929c8c0958c1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate06l;

    /** TDATE06F (uuid:9196be19-67c4-64c1-b44b-a9715edef156, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate06f;

    /** TDATE06A (uuid:b60fdfed-1238-26dd-2b9a-9b4bc70ca944, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate06a;

    /** TDATE06I (uuid:e0328c1d-da89-30d8-ef8e-c65f7560633e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate06i;

    /** TDESC06L (uuid:48c6fa81-6f5a-718b-6894-c4f9e711e798, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc06l;

    /** TDESC06F (uuid:0468452d-42b6-2117-f713-ef1a4238423a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc06f;

    /** TDESC06A (uuid:ab89f26d-5568-8267-27d1-5b775e00efec, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc06a;

    /** TDESC06I (uuid:b2304e4c-b42c-178c-535a-4ae56b6b4b1b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc06i;

    /** TAMT006L (uuid:352ce195-be64-d248-f1d5-d8cdf4cfd5ee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt006l;

    /** TAMT006F (uuid:7b56264b-edfc-cfa0-74f6-ca51e6e819e0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt006f;

    /** TAMT006A (uuid:7a154c86-b7e1-976d-5fe0-18f8d4b552a3, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt006a;

    /** TAMT006I (uuid:26220b0a-eb52-8c14-3b84-30224842aed1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt006i;

    /** SEL0007L (uuid:71d43b56-00cf-5887-d32f-bfb847b6fbac, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007l;

    /** SEL0007F (uuid:a0f38669-fc41-0e1e-5e60-87abf0169432, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007f;

    /** SEL0007A (uuid:9569a69e-c052-a865-7aa0-ffeeef7be87e, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007a;

    /** SEL0007I (uuid:351cbd21-8edc-44e9-11be-49a688629b56, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007i;

    /** TRNID07L (uuid:77ce6416-b264-cc84-b7e8-8ed45571274e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid07l;

    /** TRNID07F (uuid:9d65eea9-93ce-5de0-ea45-3e50badbda69, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid07f;

    /** TRNID07A (uuid:045f42d9-27ee-a798-177e-db61a1e7988a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid07a;

    /** TRNID07I (uuid:cf10159e-ce26-0262-a7f2-a2c5cc797d65, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid07i;

    /** TDATE07L (uuid:2c9fcc5f-ab1a-9438-48e8-926832045b4b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate07l;

    /** TDATE07F (uuid:432b2c47-6ed4-97b7-b3e4-d79c0dfc62ef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate07f;

    /** TDATE07A (uuid:bbf9e45a-1ed9-8c05-b5d1-de81713820bf, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate07a;

    /** TDATE07I (uuid:3d2ae101-131a-7f9b-7790-930cac5f9398, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate07i;

    /** TDESC07L (uuid:cbad3512-2a34-b455-1d3a-60b8b6217a5a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc07l;

    /** TDESC07F (uuid:9e83a567-4380-fbae-e475-3d8829b49241, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc07f;

    /** TDESC07A (uuid:5f76a8d3-138d-99ce-0f5d-76c98145806a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc07a;

    /** TDESC07I (uuid:784ef3dd-4946-341d-90c1-b7d45b6030f4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc07i;

    /** TAMT007L (uuid:f384685e-7723-e698-78bb-5b353d1e0366, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt007l;

    /** TAMT007F (uuid:c4ba5723-f4f8-f4cf-1600-f48f2a317b71, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt007f;

    /** TAMT007A (uuid:88569cc0-1d18-6bda-e355-664928d625a5, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt007a;

    /** TAMT007I (uuid:d25b2ad3-df36-5717-110c-94ccaacf09a3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt007i;

    /** SEL0008L (uuid:7f23087d-09a5-c183-154d-f06c0bb618e4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008l;

    /** SEL0008F (uuid:9b6abf9c-9893-0765-de99-906c1bb7fd79, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008f;

    /** SEL0008A (uuid:7085a28c-fd91-bd6e-a1a5-77769b6fe8e2, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008a;

    /** SEL0008I (uuid:67cfd62d-ada3-bcf7-7258-0201a037f396, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008i;

    /** TRNID08L (uuid:43960963-b9a0-5751-db0a-9f9aaa07b57f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid08l;

    /** TRNID08F (uuid:01b8e6c2-8362-087b-37b7-f85ccd0283d2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid08f;

    /** TRNID08A (uuid:3fab8b01-c2d9-e1a3-90c1-1a4a19546704, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid08a;

    /** TRNID08I (uuid:a48b2c2d-6ea4-5383-2b8c-2b486b6f9e95, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid08i;

    /** TDATE08L (uuid:6dbed479-026b-e38f-4a93-49fd1b74f712, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate08l;

    /** TDATE08F (uuid:43004799-07e5-1c30-f88a-58da97eef32c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate08f;

    /** TDATE08A (uuid:774ffaaf-2f5f-3ac1-ded5-4571493a78fe, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate08a;

    /** TDATE08I (uuid:3b2b6e09-4245-2a32-6450-64c0a85c5a60, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate08i;

    /** TDESC08L (uuid:bd28fb44-70ee-853e-b1c5-691620d58dec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc08l;

    /** TDESC08F (uuid:ac4da948-a2c3-d89a-c390-cb9daec1d4f1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc08f;

    /** TDESC08A (uuid:2995963d-d79d-8e64-9b70-a09cdab9d54d, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc08a;

    /** TDESC08I (uuid:ec324bb2-8dde-daff-ae54-e98804b0d6a8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc08i;

    /** TAMT008L (uuid:05459187-a2d9-79a0-cad1-a35155ac44e2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt008l;

    /** TAMT008F (uuid:08ac98c9-a704-093f-8862-e08cb10b5dc0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt008f;

    /** TAMT008A (uuid:67fc8b79-f820-da65-ac65-d6c91d3962f5, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt008a;

    /** TAMT008I (uuid:610c91a3-7c68-a406-7736-a95ac66d2c31, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt008i;

    /** SEL0009L (uuid:0bb84401-7a3b-4428-efd7-aa44317002fe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009l;

    /** SEL0009F (uuid:54afdf3a-5c39-1a31-5cfb-6721e1155fa7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009f;

    /** SEL0009A (uuid:94335a70-5cd1-9830-83c7-ab60e2448edc, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009a;

    /** SEL0009I (uuid:98f386d9-596a-df63-bb09-574393bc51d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009i;

    /** TRNID09L (uuid:78b35374-80a3-13ef-2411-3e9f85a3a12d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid09l;

    /** TRNID09F (uuid:af45f7cb-3ad1-e699-26d8-adc54342859a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid09f;

    /** TRNID09A (uuid:b23596b4-8d76-a88e-eb90-2d7628dbd55e, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid09a;

    /** TRNID09I (uuid:74768815-f1dc-c75a-99cb-a72c5485f24c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid09i;

    /** TDATE09L (uuid:e7cd9320-0923-9fe3-c559-6d91f66ac8e1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate09l;

    /** TDATE09F (uuid:a8514efe-9811-4641-3068-7424f727cef6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate09f;

    /** TDATE09A (uuid:2d929b78-8aac-e1a5-b340-ec4e7caf039b, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate09a;

    /** TDATE09I (uuid:f5e5f232-e4d2-8035-f2d0-02b028087d8f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate09i;

    /** TDESC09L (uuid:ef48303c-98a4-7fcb-f7a5-072071f0e1de, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc09l;

    /** TDESC09F (uuid:44daf8a4-288c-9f27-87ec-1434b6b180d1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc09f;

    /** TDESC09A (uuid:71843e13-52c7-4016-79bf-bceab68807d8, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc09a;

    /** TDESC09I (uuid:3f4d5420-e316-1c87-fe19-32cb28b0f935, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc09i;

    /** TAMT009L (uuid:8072f7ea-f732-924e-3ad5-e7b25ee2b0fa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt009l;

    /** TAMT009F (uuid:cac42b07-1090-3a2b-0369-130e73d2da1f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt009f;

    /** TAMT009A (uuid:be63770b-d851-1b5f-03b0-476b12601503, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt009a;

    /** TAMT009I (uuid:c5cdfd94-eeee-dd2c-e1b8-19f54a484578, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt009i;

    /** SEL0010L (uuid:4d2ef102-7c1d-b648-2ea8-c881530e32e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010l;

    /** SEL0010F (uuid:52f423c7-9b31-2776-f2bd-1ebd2ca8e49f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010f;

    /** SEL0010A (uuid:4f559957-c7da-f4df-2674-a3c239609902, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010a;

    /** SEL0010I (uuid:40f90f04-ded8-e97d-6b98-24de9322ae51, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010i;

    /** TRNID10L (uuid:b54fe8f6-1633-92bd-51bf-0fb8b341203e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid10l;

    /** TRNID10F (uuid:f169d180-3065-afd2-1250-5dda734adda2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid10f;

    /** TRNID10A (uuid:d262c5d1-0c17-6c6b-3306-03ac46085e9e, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid10a;

    /** TRNID10I (uuid:c9ae73f5-608b-f4be-0a81-08b5adf38399, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid10i;

    /** TDATE10L (uuid:95db41a9-f7bf-3308-b8c2-3c9da6dcce27, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate10l;

    /** TDATE10F (uuid:5af514f6-1f29-1073-7489-b8c66b2f6c58, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate10f;

    /** TDATE10A (uuid:30cab8c9-ebf2-f86c-1193-407f8b6c1dce, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate10a;

    /** TDATE10I (uuid:879f8346-1866-b290-d3b4-2f9a7fbcb31e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate10i;

    /** TDESC10L (uuid:98999393-10f8-8963-f741-6dcd8939a34e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc10l;

    /** TDESC10F (uuid:cdb07eb3-b387-6534-93c3-d1b391b4895c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc10f;

    /** TDESC10A (uuid:d6167afd-8196-510d-388d-71cf712588ca, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc10a;

    /** TDESC10I (uuid:e916c9eb-c056-f406-20bc-5d94227d81e1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc10i;

    /** TAMT010L (uuid:f474fc52-1701-18c9-1464-27811045d57c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt010l;

    /** TAMT010F (uuid:7a507474-840f-d882-5e7c-90f1768b74c0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt010f;

    /** TAMT010A (uuid:c6e26aaa-0ee4-d2a7-9816-9264dcf9d169, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt010a;

    /** TAMT010I (uuid:219cf499-5e29-80c4-e751-143ba3a8f8a6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt010i;

    /** ERRMSGL (uuid:3023b89e-5553-fa0c-4b26-66d4955d7992, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgl;

    /** ERRMSGF (uuid:6aed66ed-7694-9b1f-910c-5e10214f76a5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgf;

    /** ERRMSGA (uuid:6665d89f-1266-5cea-17ce-101e4fda4ebe, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsga;

    /** ERRMSGI (uuid:bc868453-edcd-23dd-280c-a56584d66e9b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgi;

    /** COTRN0AO (uuid:8009e177-317d-063d-1b9b-831b3e72618f, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cotrn0ao;

    /** TRNNAMEC (uuid:91d0b15c-8458-55df-40ed-68ee2d13fc1c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamec;

    /** TRNNAMEP (uuid:e04003a6-7f0b-f23d-8aae-b98900f870c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamep;

    /** TRNNAMEH (uuid:bad5bf8e-4970-f0f2-af2a-9d9945e97e56, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameh;

    /** TRNNAMEV (uuid:f14926da-ea52-ea24-baa3-d049690a05ed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamev;

    /** TRNNAMEO (uuid:8c5af65f-08dd-31cb-a1fb-771048c298a0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameo;

    /** TITLE01C (uuid:5505d587-56d3-cf3b-8efb-a8ecd80e050b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01c;

    /** TITLE01P (uuid:4a1ab62b-baa6-58d6-0613-968ad477dab7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01p;

    /** TITLE01H (uuid:321fe5e3-4baf-c3c5-d212-858bc1dd73ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01h;

    /** TITLE01V (uuid:2277615f-7abb-9c9b-99d6-0b44b0ba71bf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01v;

    /** TITLE01O (uuid:ce261e32-bfb1-2533-ae9d-f4263d52cc91, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01o;

    /** CURDATEC (uuid:ce8f7d86-36d0-8d24-c7d7-b0ae797a83c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatec;

    /** CURDATEP (uuid:66dd3564-0ca8-9aa9-9741-dbe162cca000, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatep;

    /** CURDATEH (uuid:672a673b-3e20-9d76-0189-6b210b697d1f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateh;

    /** CURDATEV (uuid:ccc7f799-3596-40a0-5719-d43b483a9030, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatev;

    /** CURDATEO (uuid:a651be0c-7bb1-9199-396d-349bdf6389f6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateo;

    /** PGMNAMEC (uuid:be78ebb8-afa9-c120-48e0-648480728c95, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamec;

    /** PGMNAMEP (uuid:733fccfe-55f6-1c67-9361-02da40211a53, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamep;

    /** PGMNAMEH (uuid:01b84b64-0652-c064-bc96-e9d8f34263f3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameh;

    /** PGMNAMEV (uuid:d092beb0-999f-ae0c-81e3-9fbd6875c153, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamev;

    /** PGMNAMEO (uuid:f7193225-e753-1479-df37-e82d40e8835a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameo;

    /** TITLE02C (uuid:06ebe2e0-40ca-a288-57e6-df06af0f8e2d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02c;

    /** TITLE02P (uuid:bf97f2a4-6cab-9e71-8c07-0f474852119b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02p;

    /** TITLE02H (uuid:bd90563a-dedb-ff8b-7fd3-f6cd4c331a11, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02h;

    /** TITLE02V (uuid:0c053200-e8b8-0f4f-8ac2-2fe834ed0f70, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02v;

    /** TITLE02O (uuid:b335fed3-0bfb-9623-9c73-bee95606a50b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02o;

    /** CURTIMEC (uuid:7a707106-6d9d-1d5c-4039-5f98428d45aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimec;

    /** CURTIMEP (uuid:77e0e8cf-2812-bb53-4cd7-90dfd463f2ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimep;

    /** CURTIMEH (uuid:4b467f33-af94-79e0-55fa-44ee2352c5ac, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeh;

    /** CURTIMEV (uuid:7687f5f6-e7d9-90e7-2fe4-f7833da11c00, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimev;

    /** CURTIMEO (uuid:1bff567b-0206-f7f1-6f80-c4ea7547a2f8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeo;

    /** PAGENUMC (uuid:3a077cea-3687-706c-ee9e-8e504d045dba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenumc;

    /** PAGENUMP (uuid:73b7b74c-e427-8827-ea39-f83d1a3515ee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenump;

    /** PAGENUMH (uuid:033f59f0-6f50-3f19-003f-18d3b7ca9275, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenumh;

    /** PAGENUMV (uuid:9538bb5f-4b95-2db1-bbaa-04754291609e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenumv;

    /** PAGENUMO (uuid:d9ab0f4e-8648-58f9-ddb4-21f3e7d4c0a9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenumo;

    /** TRNIDINC (uuid:ceb19e61-de73-c343-d090-935709d2bfc3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidinc;

    /** TRNIDINP (uuid:54837637-4387-9c71-301d-c13335c1b197, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidinp;

    /** TRNIDINH (uuid:5c10cb0e-683d-c7b5-5120-b74109750d28, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidinh;

    /** TRNIDINV (uuid:3184c104-5fff-ef00-7549-57936a9ccca9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidinv;

    /** TRNIDINO (uuid:99e9501f-91b4-8f6c-dcd1-7d161a2c0d7b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidino;

    /** SEL0001C (uuid:5f924242-1234-320b-255c-204f587d2c4f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001c;

    /** SEL0001P (uuid:947bbfbd-e25e-b3b2-5bfa-10437c1b44ab, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001p;

    /** SEL0001H (uuid:3d9c4074-86a4-c432-907d-671246ca8989, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001h;

    /** SEL0001V (uuid:0ccc8c58-15cf-ac72-75fb-12104b67af75, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001v;

    /** SEL0001O (uuid:f2926a41-be40-eb17-9386-b3e39ac8834b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001o;

    /** TRNID01C (uuid:8c4bdd69-8b6a-a262-bf08-b72318307af2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid01c;

    /** TRNID01P (uuid:c6b3630c-4110-4d3a-134b-774f0f827dbf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid01p;

    /** TRNID01H (uuid:32736d7a-d196-caaf-18ca-a7bc1f078673, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid01h;

    /** TRNID01V (uuid:26dd75a5-e77b-8ca9-13fd-c6176e58f9b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid01v;

    /** TRNID01O (uuid:2e61afc1-661e-f286-d487-94af426a7baa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid01o;

    /** TDATE01C (uuid:fc4e6f7d-3550-3f8f-c475-e9c545b42dd5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate01c;

    /** TDATE01P (uuid:6d9a7096-8367-6e83-467e-a0de6cf348aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate01p;

    /** TDATE01H (uuid:22a796a6-d8bb-5dd5-d5f3-5edd6e68b34b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate01h;

    /** TDATE01V (uuid:8b1d007a-e5aa-afc4-8e91-1fc6759c78b8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate01v;

    /** TDATE01O (uuid:4db2138c-256f-097b-0d19-e1e52be6e5a9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate01o;

    /** TDESC01C (uuid:efbabbe6-9f43-e0b3-2825-ea2d7a429071, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc01c;

    /** TDESC01P (uuid:ad4df840-c1c4-4e4e-6324-65a7c338d9e4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc01p;

    /** TDESC01H (uuid:a4816694-75a4-d8dd-e191-8f4b8f94a43b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc01h;

    /** TDESC01V (uuid:2fac7fcd-9d0a-8700-d545-c4131a98be44, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc01v;

    /** TDESC01O (uuid:f8560118-2873-0352-f22f-63ddff00d36b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc01o;

    /** TAMT001C (uuid:c63065b7-641b-ed02-2bc1-92ca3cf8e582, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt001c;

    /** TAMT001P (uuid:483e0bf9-1053-6188-cd90-4386c084d0c6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt001p;

    /** TAMT001H (uuid:82fa77c9-c894-3879-28f0-5e7020ff4f66, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt001h;

    /** TAMT001V (uuid:153bf5e0-4527-6580-931b-b96325ce702e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt001v;

    /** TAMT001O (uuid:d03b91d6-47a2-c8a0-c454-b4e3946a1452, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt001o;

    /** SEL0002C (uuid:6c447a60-4eec-c6bd-0a40-ad7c62a3a2c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002c;

    /** SEL0002P (uuid:4652865c-edb4-7322-211e-917bab87de34, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002p;

    /** SEL0002H (uuid:3648c62d-f3e6-c847-2eeb-632ee1a9c467, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002h;

    /** SEL0002V (uuid:84323c9f-12dc-34b2-9881-683ffe024ef7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002v;

    /** SEL0002O (uuid:5fcf3921-13ac-bc4b-c6bf-740590322656, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002o;

    /** TRNID02C (uuid:a82bd9c0-c294-9805-1f34-065973265917, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid02c;

    /** TRNID02P (uuid:f53d13d3-9c25-4557-ec03-fa8e562443c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid02p;

    /** TRNID02H (uuid:086fec89-08be-9aba-e892-c8802906135e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid02h;

    /** TRNID02V (uuid:8e342bc3-17dd-4d73-b2b6-bf076492fddd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid02v;

    /** TRNID02O (uuid:d575f666-68d8-e2ab-9a25-b531ce209570, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid02o;

    /** TDATE02C (uuid:360bdaa2-f80b-e3e1-0fd4-6c625df66cd5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate02c;

    /** TDATE02P (uuid:d2ccfc26-f145-5843-930a-f4bb38bec448, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate02p;

    /** TDATE02H (uuid:eee24b48-2895-e0f7-7a90-a531b2665ce1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate02h;

    /** TDATE02V (uuid:48a73b4c-122b-1794-910c-13b8721103d5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate02v;

    /** TDATE02O (uuid:9b4fec98-d0fa-430e-03df-978c9f5d621f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate02o;

    /** TDESC02C (uuid:c9e1657c-e105-9cbb-6378-35ffa1604f22, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc02c;

    /** TDESC02P (uuid:1905285d-b57d-d91f-371b-9904ab7968b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc02p;

    /** TDESC02H (uuid:f91c273e-e723-f792-8ed1-195beda88995, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc02h;

    /** TDESC02V (uuid:5bd25e42-22c5-d4a1-e443-e0bc9eb9cf74, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc02v;

    /** TDESC02O (uuid:690758b0-7b90-3684-34e8-37ca8a47ba40, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc02o;

    /** TAMT002C (uuid:a99391a0-cb4f-99ec-bc6a-b015a2761e21, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt002c;

    /** TAMT002P (uuid:b9ff4d84-7f79-053b-00c6-f9e82f459f2e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt002p;

    /** TAMT002H (uuid:20b1df3a-b3fa-2d37-ea9f-13b7ecd7bcd6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt002h;

    /** TAMT002V (uuid:e44368f8-b14d-bf76-2770-f21a3139864c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt002v;

    /** TAMT002O (uuid:6ed30b38-d48b-05dc-6ccc-7eb4e2d48bb8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt002o;

    /** SEL0003C (uuid:831ca2d7-5a69-1085-fd66-873da3e16a23, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003c;

    /** SEL0003P (uuid:cfbbdd4a-2648-b428-f9b4-cfa7e34fdf8b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003p;

    /** SEL0003H (uuid:1c9887a4-3539-1c4d-26d8-d3a38a9b719c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003h;

    /** SEL0003V (uuid:296f17a6-a69f-080c-8e61-bd89639028c1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003v;

    /** SEL0003O (uuid:341fd058-5256-ad06-d803-553c4ce2df04, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003o;

    /** TRNID03C (uuid:14d561b6-bba1-0748-af0b-ef2df9080c07, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid03c;

    /** TRNID03P (uuid:cd93fe42-f6a4-a112-4408-dc421f868ad5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid03p;

    /** TRNID03H (uuid:5dd0e0d6-e913-1cbc-b51d-8a78c17896ef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid03h;

    /** TRNID03V (uuid:ebaec72b-797b-2359-2480-fba98fe664ce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid03v;

    /** TRNID03O (uuid:dc92e262-29ee-797e-0405-06c6d10eca74, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid03o;

    /** TDATE03C (uuid:6d8f25bd-a2d8-98a3-92d3-9afec47ec481, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate03c;

    /** TDATE03P (uuid:ce9e1b07-ad6b-f239-8fd6-903d8a96ea32, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate03p;

    /** TDATE03H (uuid:e1a7bcf3-0ac1-8b12-4fca-41d946ea0238, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate03h;

    /** TDATE03V (uuid:1acf8c8c-aaf3-f36b-b5b2-fd64fe00c789, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate03v;

    /** TDATE03O (uuid:1cb4fb5f-05a4-9354-7594-5322c42f58d0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate03o;

    /** TDESC03C (uuid:11c2d988-3e26-c8c5-63a1-404509e9713c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc03c;

    /** TDESC03P (uuid:f1a702b9-105f-abea-49fe-6e3d50bb8605, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc03p;

    /** TDESC03H (uuid:4c825ac3-cfac-00cc-e5e1-dd40a44bb014, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc03h;

    /** TDESC03V (uuid:e393fa0a-c432-f534-7011-4435780eefe1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc03v;

    /** TDESC03O (uuid:b5346a61-c1e1-03d5-9e1b-8194e9d35c65, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc03o;

    /** TAMT003C (uuid:1adc8075-23ba-d316-931d-d45d4158b490, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt003c;

    /** TAMT003P (uuid:b4ca7632-ca2d-ff0c-8cde-606d20736bb1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt003p;

    /** TAMT003H (uuid:4ea94ea4-498a-ba90-bb40-16cd40592c5b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt003h;

    /** TAMT003V (uuid:9e46a4f7-8830-b310-651b-1615121a98ef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt003v;

    /** TAMT003O (uuid:9826bf7d-b0f5-b5f5-98c6-bdfd06cca42b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt003o;

    /** SEL0004C (uuid:4e757fe5-2c4a-7915-7804-e787b701e69c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004c;

    /** SEL0004P (uuid:3357cf83-1b39-7f01-db74-c38f3b925b3a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004p;

    /** SEL0004H (uuid:d26e52ae-379e-aa08-69e1-b736f065b77f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004h;

    /** SEL0004V (uuid:8761b627-2298-3015-685f-1bc0ebfe1e78, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004v;

    /** SEL0004O (uuid:da0e7dee-5b97-286b-54de-77837b3992bd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004o;

    /** TRNID04C (uuid:c42813c2-16c0-726d-f924-ccc468376ff6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid04c;

    /** TRNID04P (uuid:8e8e9e99-c0c0-706e-f078-7325e9958429, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid04p;

    /** TRNID04H (uuid:35301977-65f2-037e-ea74-2534b44214e1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid04h;

    /** TRNID04V (uuid:4802d5ff-1ca4-ac5c-bde6-f289d794edae, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid04v;

    /** TRNID04O (uuid:3806bb8e-6955-f168-11f5-34df668edd60, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid04o;

    /** TDATE04C (uuid:72fb35e0-5bae-ae7f-f132-2eb5c74a0dc5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate04c;

    /** TDATE04P (uuid:1de83619-b915-1ccb-0063-300dddef30a6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate04p;

    /** TDATE04H (uuid:26655e13-a3b8-f59f-8e15-05e6f02eff83, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate04h;

    /** TDATE04V (uuid:591cddcf-4903-d7f3-8678-5d24a1b76e5b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate04v;

    /** TDATE04O (uuid:03b0c076-6d2b-7452-553f-b118842e71c4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate04o;

    /** TDESC04C (uuid:5b4940d3-c776-013f-78a5-1c7751530b82, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc04c;

    /** TDESC04P (uuid:ab7f9810-9764-8b1d-4c1b-29c0dbadbadf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc04p;

    /** TDESC04H (uuid:6a3a1676-7788-7d18-b16b-4f49c20d17f1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc04h;

    /** TDESC04V (uuid:c6e9835f-15b3-6503-404c-84f48a1056ca, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc04v;

    /** TDESC04O (uuid:fb13f9be-42bc-0340-da47-9befcc2e36a3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc04o;

    /** TAMT004C (uuid:11045412-3523-3149-a875-17bc6893a307, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt004c;

    /** TAMT004P (uuid:f61f88a1-5121-091c-19a1-bd5199eebc35, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt004p;

    /** TAMT004H (uuid:4939620b-897b-654f-eeb9-ee612b4279e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt004h;

    /** TAMT004V (uuid:3e78d7e2-53da-f9ba-9690-474887395130, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt004v;

    /** TAMT004O (uuid:f7f00582-eea8-8bcf-b6ff-ebb7e325a6f9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt004o;

    /** SEL0005C (uuid:dfe7e2bf-aa76-0042-373d-45e40ceae168, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005c;

    /** SEL0005P (uuid:f18e1322-b130-836d-d536-d58c25ccb148, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005p;

    /** SEL0005H (uuid:2b23440e-9e35-a186-7700-d1775751efa1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005h;

    /** SEL0005V (uuid:70973bc6-008d-afdc-9cd0-8140a17929c6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005v;

    /** SEL0005O (uuid:4558934d-d644-ff16-50e3-19e2c88fd6dd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005o;

    /** TRNID05C (uuid:f50f781b-b732-7e76-bdc5-86be03cdb849, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid05c;

    /** TRNID05P (uuid:23cf88b3-cb89-edea-5813-12a4a7ea72c9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid05p;

    /** TRNID05H (uuid:180251a4-9c5b-f3be-70c0-0f37b5790255, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid05h;

    /** TRNID05V (uuid:918a2e21-a8c1-128f-20a1-a79a02301887, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid05v;

    /** TRNID05O (uuid:bd491157-f960-3cdf-ee43-6cb502fe1ba2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid05o;

    /** TDATE05C (uuid:de8b7eab-fe21-ee6c-5979-f3dadefe028e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate05c;

    /** TDATE05P (uuid:c286d523-fae2-0afd-e825-3cd91bc88b9c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate05p;

    /** TDATE05H (uuid:28093ca8-337e-418a-f61f-7ead8021352d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate05h;

    /** TDATE05V (uuid:16c416a8-bcac-e928-2002-b37f00beba15, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate05v;

    /** TDATE05O (uuid:612d4c43-d729-284b-9797-fd1e53a1a658, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate05o;

    /** TDESC05C (uuid:046cd537-92fc-f0c4-908c-a238a98d3c94, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc05c;

    /** TDESC05P (uuid:3e38957c-0917-1588-b0d1-ffde3ccbc41a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc05p;

    /** TDESC05H (uuid:052159fa-13fd-cc00-5652-e98982f73f92, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc05h;

    /** TDESC05V (uuid:d66db8f5-0405-d65e-7176-fae41635575e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc05v;

    /** TDESC05O (uuid:cbc49be5-6c64-a23a-5582-75f243e53edc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc05o;

    /** TAMT005C (uuid:c80123ee-ca82-5a08-311e-b4508543a4c0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt005c;

    /** TAMT005P (uuid:e4fe21e6-52c9-89e0-32b5-8e6d6c794f03, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt005p;

    /** TAMT005H (uuid:5a93b314-3a3b-c5e5-8568-f31a113f4231, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt005h;

    /** TAMT005V (uuid:cf4e67b0-81cf-09f6-6b4f-0ab0ec038ea6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt005v;

    /** TAMT005O (uuid:7fcdb253-1763-79f0-118e-4b1bebff9d60, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt005o;

    /** SEL0006C (uuid:6e654c71-2b4e-4f1e-79fe-5cc5a4610ec9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006c;

    /** SEL0006P (uuid:2473d0eb-29de-828d-e0b6-77d74cdf50ce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006p;

    /** SEL0006H (uuid:c03e9c01-45ef-eeb7-e8c1-ed413b201e2a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006h;

    /** SEL0006V (uuid:a85d734b-52f6-1683-2ef8-2abb82fa8f98, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006v;

    /** SEL0006O (uuid:d09019a5-bc59-f555-290f-0bbaa8e03658, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006o;

    /** TRNID06C (uuid:aeb61230-2f29-34bb-a2e7-1863b5fa693f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid06c;

    /** TRNID06P (uuid:199af750-e569-0233-0ea7-a2a3a6994462, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid06p;

    /** TRNID06H (uuid:938cbadf-b5f2-95fc-029c-479a463bc363, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid06h;

    /** TRNID06V (uuid:df78a1c4-44aa-8ccb-2164-c685c5702c93, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid06v;

    /** TRNID06O (uuid:e257b4bd-caaa-0dff-6424-de74482e6105, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid06o;

    /** TDATE06C (uuid:40b14ad6-a096-5baf-337d-af35e2dd18a2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate06c;

    /** TDATE06P (uuid:f4acf083-76ae-ee1b-af08-ca862d2294e0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate06p;

    /** TDATE06H (uuid:caad9f55-6379-564d-7cf0-637ff2c393a5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate06h;

    /** TDATE06V (uuid:15254ee1-8dfe-b937-483d-37d73bf81215, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate06v;

    /** TDATE06O (uuid:85911d95-b450-2711-e8fa-3a3307d0bff8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate06o;

    /** TDESC06C (uuid:61aafaeb-e109-7519-fc48-e35a5a89e10b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc06c;

    /** TDESC06P (uuid:ecb214aa-04fa-d9fb-ac3e-ae3af8e89a38, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc06p;

    /** TDESC06H (uuid:cbdfa1d5-4067-2c72-3d5f-7e2f5687ddf4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc06h;

    /** TDESC06V (uuid:d1f511d8-838a-10d1-08ae-f29f105c781d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc06v;

    /** TDESC06O (uuid:02c3af03-d0c2-f2b6-bbe1-6dde9314a545, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc06o;

    /** TAMT006C (uuid:a86d4dd6-e651-6a3d-511a-3b83dd7c117c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt006c;

    /** TAMT006P (uuid:c410fe97-d7dd-6669-3ea3-99fd6e010713, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt006p;

    /** TAMT006H (uuid:494c0612-a625-57b8-c6bc-88bb16d6a31c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt006h;

    /** TAMT006V (uuid:4719002a-f450-7e43-4b5c-704d63d314ef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt006v;

    /** TAMT006O (uuid:3bbfbdd9-a70d-b6e3-53b5-21d0254b08bd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt006o;

    /** SEL0007C (uuid:c2020521-4088-f61a-8333-fe5df7b04679, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007c;

    /** SEL0007P (uuid:eb81b29e-3b1e-5c3f-aa20-245803607e84, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007p;

    /** SEL0007H (uuid:8b783cff-fba3-ddb2-ea4c-3323920475ae, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007h;

    /** SEL0007V (uuid:278bfdcf-3955-36af-4a10-27e151ceb827, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007v;

    /** SEL0007O (uuid:5c6b62ed-4da5-3eae-dadc-6994521b2772, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007o;

    /** TRNID07C (uuid:f90308c4-8ad3-4e2b-c326-b4fa280f07b9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid07c;

    /** TRNID07P (uuid:a05d186b-6ed2-e969-e4c2-e1082f40a192, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid07p;

    /** TRNID07H (uuid:2fa25e14-71a0-1ad4-f44b-e6c291693478, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid07h;

    /** TRNID07V (uuid:15a01d8b-3a91-ac0c-2b3d-2e99f9eab65f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid07v;

    /** TRNID07O (uuid:af2dc6cb-8c9f-b06e-e09e-698c98dd3464, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid07o;

    /** TDATE07C (uuid:fb2f146c-8887-5599-5ec6-dccd02342674, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate07c;

    /** TDATE07P (uuid:570b62b6-9f2d-d45d-87fc-ad8222179f10, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate07p;

    /** TDATE07H (uuid:38e42a33-425a-5a10-e1b3-b20ebf680960, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate07h;

    /** TDATE07V (uuid:7a3fd382-3d9a-3972-c672-bd425fe3d388, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate07v;

    /** TDATE07O (uuid:327e13d2-d59d-1913-6c8b-963b13ec8813, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate07o;

    /** TDESC07C (uuid:5a5cd4ae-4537-9909-d2bf-d3771e27dffd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc07c;

    /** TDESC07P (uuid:db5f8249-9f11-6f87-3de0-d644468f9512, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc07p;

    /** TDESC07H (uuid:2b1b8496-771a-d847-18ac-88d573a6f972, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc07h;

    /** TDESC07V (uuid:2beee6ef-736e-9a62-dfa0-caaf4a222769, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc07v;

    /** TDESC07O (uuid:a113396b-35dd-8c95-c160-acedddd5be00, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc07o;

    /** TAMT007C (uuid:947f5c21-4201-2cef-cd60-8e74373fa698, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt007c;

    /** TAMT007P (uuid:e0d5365b-6932-4902-0afc-d49f33ca9103, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt007p;

    /** TAMT007H (uuid:9f3c9186-341d-4a44-100f-7750c7516a6f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt007h;

    /** TAMT007V (uuid:ff512100-15c1-a451-d0ec-3e4c9273f9e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt007v;

    /** TAMT007O (uuid:c51d50c0-f5f1-c86c-e4e2-2d2abf3151f8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt007o;

    /** SEL0008C (uuid:a3dab1c9-6c51-4fbb-dec7-476bbf94dc5e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008c;

    /** SEL0008P (uuid:c9d89b43-4cc9-7504-73a6-484252473f11, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008p;

    /** SEL0008H (uuid:b447f7a4-9728-f6f1-975e-2187ea054b6a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008h;

    /** SEL0008V (uuid:7c854a5b-c50c-9355-c678-e4a75ec19b8d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008v;

    /** SEL0008O (uuid:1f1f884b-3345-0456-76b0-2a5ee83c0f3e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008o;

    /** TRNID08C (uuid:437652ec-afba-7383-4428-517a820e0753, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid08c;

    /** TRNID08P (uuid:9822311e-f01d-e8c0-24b0-c6a6c779336d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid08p;

    /** TRNID08H (uuid:320fc318-e865-5354-8bd1-1f18cfcfe71f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid08h;

    /** TRNID08V (uuid:ae0e1695-c769-04b0-5588-f8d50da9a481, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid08v;

    /** TRNID08O (uuid:97c98a48-6439-c43a-6f71-4fbfedf05925, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid08o;

    /** TDATE08C (uuid:0666b343-c968-2850-e086-8cd861956a6c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate08c;

    /** TDATE08P (uuid:fc3820a3-50c1-e825-ec4a-56ea72e58ae7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate08p;

    /** TDATE08H (uuid:69f3a914-2c78-6850-bf46-e7724de7ac97, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate08h;

    /** TDATE08V (uuid:c70cd34e-7f4f-e7ae-24f7-78c44a63e461, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate08v;

    /** TDATE08O (uuid:bb8f4b8a-3bfe-8ef2-5e14-6aff6d872be4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate08o;

    /** TDESC08C (uuid:29ea2139-a299-0714-1c5b-265af1852bcb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc08c;

    /** TDESC08P (uuid:b644c9e7-dea0-6439-4f8c-2333ca60414d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc08p;

    /** TDESC08H (uuid:c64514ad-7c1a-7ae6-b058-0733aa946541, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc08h;

    /** TDESC08V (uuid:fa9ca7a0-9d76-9edd-1e8a-497364c653d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc08v;

    /** TDESC08O (uuid:51bc0aee-7163-8035-048e-8e1c1fd3180b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc08o;

    /** TAMT008C (uuid:a2b1ff28-2489-7232-9b48-38c3ba9ba369, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt008c;

    /** TAMT008P (uuid:8c16d313-0c07-f617-ca17-9f043d61ed2f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt008p;

    /** TAMT008H (uuid:b077b694-e6ee-c428-9855-eae8ec8d4c09, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt008h;

    /** TAMT008V (uuid:7fdc88aa-5de6-794a-fe02-b4e0dc8cc7cc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt008v;

    /** TAMT008O (uuid:993bb924-3897-eae4-dbd7-bde32286ba6b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt008o;

    /** SEL0009C (uuid:ee7ea530-536e-5e62-979f-e36e532085a2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009c;

    /** SEL0009P (uuid:e6327fcf-7b43-c0ca-7ffd-ee2052f40f20, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009p;

    /** SEL0009H (uuid:7f5c2f59-2680-5f47-2d6f-1d1e739e6b18, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009h;

    /** SEL0009V (uuid:438e1cb8-1376-7291-d3ee-a7287cdf1ea0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009v;

    /** SEL0009O (uuid:fb980456-7e36-6fe8-a9f3-10208d02d77a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009o;

    /** TRNID09C (uuid:74416432-6391-aa49-e302-142e8c8962b6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid09c;

    /** TRNID09P (uuid:bcbaf27d-4b70-5718-a9c3-e05f60561276, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid09p;

    /** TRNID09H (uuid:a704505d-87ce-463c-657b-ae7fc6048af3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid09h;

    /** TRNID09V (uuid:057c186f-4c9d-7496-3896-3477eb2532b8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid09v;

    /** TRNID09O (uuid:50b21266-0498-bb6e-47cf-5a1e8e437ebf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid09o;

    /** TDATE09C (uuid:e9219ed4-ab00-8d36-417c-223277c5fb37, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate09c;

    /** TDATE09P (uuid:4455fbb1-43b7-6fcc-feda-58760eb0d0ac, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate09p;

    /** TDATE09H (uuid:5beda81a-fcac-7fb6-bed9-ceb9727507eb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate09h;

    /** TDATE09V (uuid:7201d799-794a-860c-59d2-e497c512d04c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate09v;

    /** TDATE09O (uuid:39da12d6-14f5-21ad-fd2d-802ae1dcbf0f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate09o;

    /** TDESC09C (uuid:cb91ba24-1d07-7f62-f12b-0161947aea05, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc09c;

    /** TDESC09P (uuid:6434e68c-ca8d-026f-ed4f-85ec422061cb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc09p;

    /** TDESC09H (uuid:23bc13d4-b538-ddc4-adac-a8c635766783, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc09h;

    /** TDESC09V (uuid:62eb7b06-e52c-bd5e-8643-677982da5e4e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc09v;

    /** TDESC09O (uuid:bbab37da-2cf4-f6ef-103b-9c9174b45c15, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc09o;

    /** TAMT009C (uuid:27f0364c-5839-abce-d5ad-9767e2d8b5d2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt009c;

    /** TAMT009P (uuid:d7adc2ef-358d-c642-ee7e-6f7389a92349, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt009p;

    /** TAMT009H (uuid:110b161d-9071-4d99-d609-5fd2c8be34ec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt009h;

    /** TAMT009V (uuid:2661e10e-617a-a936-3b8d-0a49136a589d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt009v;

    /** TAMT009O (uuid:3736ced4-964b-81e3-a0cc-642a28de2a73, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt009o;

    /** SEL0010C (uuid:ec0dbd8c-f938-bbfd-930a-122eafc1a50d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010c;

    /** SEL0010P (uuid:ef553b38-8ee0-24e8-9f99-f31ff5941dd4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010p;

    /** SEL0010H (uuid:018002cb-dd8e-afc8-3ac3-5c6636561d45, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010h;

    /** SEL0010V (uuid:b48761b0-5810-7635-6c42-e3cc3f5368c1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010v;

    /** SEL0010O (uuid:6eb3d572-db16-99f4-ad29-4a6f3dcd1564, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010o;

    /** TRNID10C (uuid:16e7f9a8-f9e9-caea-bdd2-22836b668cd0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid10c;

    /** TRNID10P (uuid:24a7ebb8-ade7-c95a-6a12-e728d90876ab, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid10p;

    /** TRNID10H (uuid:55334e31-5e3e-baf9-0d9e-18cd2b02cd45, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid10h;

    /** TRNID10V (uuid:5c5dc695-b47c-44a7-a000-5542ab77cefa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid10v;

    /** TRNID10O (uuid:4feeb978-c09b-22fa-c3fd-0361610599e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnid10o;

    /** TDATE10C (uuid:0c00e043-8d76-ffdf-9999-275bbd4c875c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate10c;

    /** TDATE10P (uuid:f06b7123-5baf-3f56-6d21-96e6636947d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate10p;

    /** TDATE10H (uuid:1e839982-6087-1fbf-01b3-dfe7b3fdfd81, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate10h;

    /** TDATE10V (uuid:1b8d9823-cc05-e879-3578-1bd2f72b7c5c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate10v;

    /** TDATE10O (uuid:323ee6c2-a629-d4b4-9a13-d6593e4160d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdate10o;

    /** TDESC10C (uuid:7356d60c-5f30-adbb-7f87-5a3657d01d82, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc10c;

    /** TDESC10P (uuid:68a35136-b204-256a-59c2-1fb3a846d19b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc10p;

    /** TDESC10H (uuid:808e6ffd-feb1-2400-679f-acab6920425e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc10h;

    /** TDESC10V (uuid:2094e871-9401-53d3-fb47-b056162c0a4b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc10v;

    /** TDESC10O (uuid:55f234d6-c1fb-1cfb-eed5-14880b4c164b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesc10o;

    /** TAMT010C (uuid:cb2061e1-4967-9558-1976-f0f1c81e3757, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt010c;

    /** TAMT010P (uuid:377e2b83-c662-a4ca-ecab-ce1cf6f02550, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt010p;

    /** TAMT010H (uuid:08bdd775-1f7f-6deb-3703-d2657901e526, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt010h;

    /** TAMT010V (uuid:3d328a07-709a-1f85-4c8b-66384d198b49, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt010v;

    /** TAMT010O (uuid:f1d08499-8257-3cf1-fb14-ad43e82397c5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tamt010o;

    /** ERRMSGC (uuid:74fd2f4e-8815-f439-8cf8-f735db47392e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgc;

    /** ERRMSGP (uuid:d01a2a24-60bc-72e7-8649-74c20b57a5ad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgp;

    /** ERRMSGH (uuid:de79a717-3f7e-cf96-3b78-295235b8de59, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgh;

    /** ERRMSGV (uuid:e354c025-0116-74f1-13c4-a0759543d6f5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgv;

    /** ERRMSGO (uuid:f076f37d-b31b-b36c-f0f5-a222925ee22a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgo;

    /** CCDA-SCREEN-TITLE (uuid:8a118d85-ea86-8141-f39d-43ae3b050558, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:a82fd1c3-7964-e00f-5e1c-f383d8069262, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:b0352f2f-18f3-157a-9138-0bea168f63f2, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:e88d186f-5668-a96d-95a8-acf19b538b4a, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** WS-DATE-TIME (uuid:21bef549-1305-41b3-0bbf-5a05959ad6e7, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:cae050ca-a6ef-dd4a-7521-3ef47ce2262a, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:2551ce52-12fc-0e25-eb4b-3c5a5bb3b2c0, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:87bb70fa-635b-67d9-5cd2-de755543776e, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:03db28e3-62a0-501f-699c-dc8ecfa63fa3, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:aa772c1d-6633-0b11-3ccb-65c889954a9d, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:1178f135-887c-dbf4-7a1f-c2ed827bd7eb, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:a7f35a91-d52d-59b3-2c04-5febdb61cf90, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:2dd22d2a-f44b-eb89-b251-8806e6f41144, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:00a8de03-b6b1-c1a9-2155-d1abbc6cde1f, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:dd0154ef-1823-830c-9477-a7282d43cb9e, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:cd70a3b5-b866-7799-8c49-5e8ae506b63c, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:96d9c7e0-4f16-2426-0945-bf1bb41edda2, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:e340539f-0a8b-3696-f2d8-b40cfb968b69, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:fac649cf-8fdb-b06e-27f0-b34d05992fb5, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:9befec26-04f2-0e24-827a-18e79679ad1a, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:74cc54b1-2fbb-3119-ee82-da49cf4e8aa2, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:06b58681-fd33-f613-178e-b363f79b8834, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:05883c46-27c6-8bff-cbeb-eb481b396fbd, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:ef775489-8e54-6664-f0d6-c134a94f75ed, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:1846dbfd-d7cd-6523-5908-3cd62645041c, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:39a865d7-08b6-8185-6fcc-678f84bc70dc, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:2d30809f-b9ad-b66e-216a-a98d11966d54, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:db69cf32-2837-6c9b-f16c-460da73104fe, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:ba912d56-3d59-a0c9-f025-6e865d45a8fd, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:cc06de06-9e6b-a3a2-aaec-6f70b49b97a3, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:382d6551-2dbd-6584-00d6-25308d084295, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:e41b80c6-b8f2-cd43-8264-f5bff8386eac, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:a269e467-830b-d9a7-79d9-7347f776c8cd, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:b0587db0-d616-cdd2-c4fa-bff7d44a9d32, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:8674c59c-6235-1ce2-b773-6ef06e0a5b61, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:87a414f9-13de-0fe2-3c70-9da68939b48f, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** TRAN-RECORD (uuid:3d9fea8c-5d44-7ad2-9fcc-eae5cd7d7061, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tranRecord;

    /** TRAN-ID (uuid:f141fc6b-8b23-60e2-8ffc-1f3d07846185, level 5, PIC X(16).). */
    public String tranId;

    /** TRAN-TYPE-CD (uuid:ba628fcd-990e-3a4c-0f33-e785cb700166, level 5, PIC X(02).). */
    public String tranTypeCd;

    /** TRAN-CAT-CD (uuid:5ec7a338-8463-03e9-c6d7-d53b0b1dac1c, level 5, PIC 9(04).). */
    public int /* PIC 9(04). */ tranCatCd;

    /** TRAN-SOURCE (uuid:aa1a6e1e-f834-789a-506b-b61c1547ba06, level 5, PIC X(10).). */
    public String tranSource;

    /** TRAN-DESC (uuid:4013c48f-2703-b682-d241-b04da02e6f16, level 5, PIC X(100).). */
    public String tranDesc;

    /** TRAN-AMT (uuid:e9a46b38-1c55-1f72-76c8-b4a17c7989d1, level 5, PIC S9(09)V99.). */
    public BigDecimal /* precision=11, scale=2, signed */ tranAmt;

    /** TRAN-MERCHANT-ID (uuid:85ca4f4e-5642-8c1d-bd57-c1bc89af67cd, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ tranMerchantId;

    /** TRAN-MERCHANT-NAME (uuid:44818f0e-f351-91dd-f566-626962fc4bd5, level 5, PIC X(50).). */
    public String tranMerchantName;

    /** TRAN-MERCHANT-CITY (uuid:c13ed721-672a-8e99-78d2-8cb45fee4732, level 5, PIC X(50).). */
    public String tranMerchantCity;

    /** TRAN-MERCHANT-ZIP (uuid:6664f067-1e6b-3cb7-cea0-e6fd613df596, level 5, PIC X(10).). */
    public String tranMerchantZip;

    /** TRAN-CARD-NUM (uuid:e628ab2e-7892-9694-cb63-70e5b522b7ca, level 5, PIC X(16).). */
    public String tranCardNum;

    /** TRAN-ORIG-TS (uuid:cffa6024-e52f-9ecf-5305-e3b5eec6c402, level 5, PIC X(26).). */
    public String tranOrigTs;

    /** TRAN-PROC-TS (uuid:6a903597-8fee-4790-7bc2-7906b17b6b7f, level 5, PIC X(26).). */
    public String tranProcTs;

    /** DFHAID (uuid:313e08ee-3238-12a3-4833-3ecbe5507b94, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:01bc1d16-59f4-fdcc-f06b-5b204bb3992b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:72f52c82-9e36-cb6c-b9f3-cb920ffb0d50, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:81d91a97-5ff1-0ffc-5719-2169302f68c9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:cfe324aa-f20d-8b17-fe21-0f5cdfd27d88, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:1fd0fe48-2500-d928-247f-e3c6fec303d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:65e64dae-f02a-8f58-7872-48b8322f9bb2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:da6c09fd-d8d3-b6f5-8cc2-af1ebe3b862c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:7eaa3595-1c70-ef6a-7360-230fb93f7343, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:abd3271e-92d7-daeb-88c1-1296ea67fd11, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:2ca005f0-da35-540f-67e2-75e134b306fe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:318b9c6e-10ae-a082-f41c-18cb971f998b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:14ea892a-74b6-acbe-59d6-9510982e7d1e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:f901c3eb-2091-f355-75f4-5ed738d5d2df, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:e3fcb83f-402c-7f5b-51a3-f858e281c6bd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:d6d63bce-383e-31b4-6c72-eaac4b313f22, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:c68125b4-8f50-bcaf-2139-8fc7a8ff7e98, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:125bf1d9-14a3-bfbd-5cb5-b6fd6d211d74, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:be0e407d-72ee-6dd7-dc0b-2f7d55e66003, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:fbe92145-b8e8-45a3-098c-bbf574971f34, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:4ff86cf2-cf13-5214-82e4-c1546d3c9272, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:d4ecf54d-55e1-77e4-793b-ab2d3297fa2c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:5e43ece6-aa2f-4a33-f1f6-7975de9edbf9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:32cfd1c4-a56d-effe-e0b1-66fe268949d5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:c72b6182-0a5c-f375-8d8f-2ff88803f5d9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:75251015-2e9a-26f7-c0f8-c11687e23ab2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:c20d8109-40f2-ab84-4c3e-1ab0a274ba94, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:a5c6aef8-6a2b-d35b-9013-134082b17e1f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:ce34541d-c9ad-49a2-abfc-5d082756c575, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:f2d18c15-dd71-fb45-f7fb-a192281e4982, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:0d3216c8-5fa7-bb4c-c620-06d7db0372ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:530ee7c9-542d-5cbf-ebde-cbde22e634ae, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:4e0c9ffd-a36e-cc83-ed54-afc274c648f9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:c84764d3-2e4d-f263-acec-e240da4c44d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:de3b8c28-5e45-2823-66dd-80c7c8a430ec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:8a4548f3-89a3-2001-17a8-e655d6952931, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:3258f604-3b8c-9d31-5865-e4ac9cae6d8e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** DFHBMSCA (uuid:975ccab2-781b-a165-522a-b2f664fdeb56, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:b09b5728-031c-7af1-6fcd-83ee2b4a2c31, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:f1cd72df-dedf-00ef-a1e2-d556359d0c84, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:8031d1fb-326f-5d80-4c78-022520743a63, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:9a560371-5131-2f00-7007-1d8140c79568, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:c82ae739-85de-1f43-075c-e52fa50e2fea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:5cf985e7-5130-028e-7fb1-69f0cb809350, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:f854be07-c72d-d90b-b6ea-17cfaedaf3b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:8252a897-53f0-4405-7b92-e100a4d2d5d6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:57699ab7-0d4b-2b34-e9c6-5b972de0a514, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:053903ee-c0c9-6f71-ea24-51c5d0b87abd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:5b41538e-e64b-14a7-1445-517d87c0490b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:ab245cc0-4b03-bbad-ad30-8a1f70e74dc3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:9c2eaa87-f12d-0e6d-c597-ffde1d19b2dd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:9888236e-8ec9-710a-00e2-485a288edc14, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:ee1b61f0-81d9-3ff6-fa94-b850b3c6bba9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:b3550936-10d0-b431-ded8-999f973a4048, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:59708c65-9014-ee4a-6fd5-3e2158338d5c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:51bb6252-7768-5fee-7c68-a986eab41a48, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:90a47e5c-ff71-c2ab-6a6e-0f4d9cdb9eac, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:a1bf5dab-f4c4-c80b-2a2f-733fad6a46f9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:5bd7ec0a-f11d-00f3-8c6c-306d74e04eac, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:08d0aa52-d51a-f89c-4608-e91a512129a6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:c2617555-5cdc-7fb0-5b78-8e0ac955a5fb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:92924e49-d7da-5edd-d4fa-fbf43cb969bb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:e4ce8b90-da8d-d9b9-6876-8c6b875668c9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:b6ca0289-4d48-5b03-dacb-b7f475aefc38, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:b8656183-6d05-cd2b-79f2-d7ac75ec8785, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:dc7e1d66-8eeb-54af-de78-aa52f3b9e86e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:3d2c6ecd-4e93-7d59-3ada-90548ee950f4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;


    // --- auto-generated stubs for undeclared references ---
    public Object eibcalen;  // auto-stub for undeclared reference

    /** MAIN-PARA  (uuid:082c2d98-7e00-9a6a-ae32-84256fb9cfa7, source lines 1077-1123). */
    public void mainPara() {
        // SET ERR-FLG-OFF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET TRANSACT-NOT-EOF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET NEXT-PAGE-NO TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET SEND-ERASE-YES TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsMessage = "";
        this.errmsgo = "";
        this.trnidinl = -1;
        if (java.util.Objects.equals(this.eibcalen, 0)) {
            // TODO: translate body for: EIBCALEN = 0
        }
    }

    /** PROCESS-ENTER-KEY  (uuid:b66fc9f0-8802-11a4-8c30-1545a39bd668, source lines 1128-1211). */
    public void processEnterKey() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        if (!java.util.Objects.equals(this.(cdemoCt00TrnSelFlg, "")) {
            // TODO: translate body for: (CDEMO-CT00-TRN-SEL-FLG NOT = SPACES AND LOW-VALUES) AND (CDEMO-CT00-TRN-SELECTED NOT = SPACES AND LOW-VALUES)
        }
        if ((true /* TODO translate: TRNIDINI OF COTRN0AI = SPACES */) || (true /* TODO translate: LOW-VALUES */)) {
            // TODO: translate body for: TRNIDINI OF COTRN0AI = SPACES OR LOW-VALUES
        }
        this.trnidinl = -1;
        this.cdemoCt00PageNum = 0;
        this.processPageForward();  // PERFORM
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
    }

    /** PROCESS-PF7-KEY  (uuid:c7309194-aa2e-311f-8573-39b8bc7ef270, source lines 1216-1234). */
    public void processPf7Key() {
        if (java.util.Objects.equals(this.cdemoCt00TrnidFirst, "")) {
            // TODO: translate body for: CDEMO-CT00-TRNID-FIRST = SPACES OR LOW-VALUES
        }
        // SET NEXT-PAGE-YES TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.trnidinl = -1;
        if (true /* TODO translate: CDEMO-CT00-PAGE-NUM > 1 */) {
            // TODO: translate body for: CDEMO-CT00-PAGE-NUM > 1
        }
    }

    /** PROCESS-PF8-KEY  (uuid:473a5899-a963-ed3a-9e88-6165341c3973, source lines 1239-1256). */
    public void processPf8Key() {
        if (java.util.Objects.equals(this.cdemoCt00TrnidLast, "")) {
            // TODO: translate body for: CDEMO-CT00-TRNID-LAST = SPACES OR LOW-VALUES
        }
        this.trnidinl = -1;
        if (true /* TODO translate: NEXT-PAGE-YES */) {
            // TODO: translate body for: NEXT-PAGE-YES
        }
    }

    /** PROCESS-PAGE-FORWARD  (uuid:d7fd6b25-1dde-60e4-c832-35ce4d396392, source lines 1261-1310). */
    public void processPageForward() {
        this.startbrTransactFile();  // PERFORM
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
    }

    /** PROCESS-PAGE-BACKWARD  (uuid:6193adf7-dbbc-a893-b262-ef3eb7e2839e, source lines 1315-1358). */
    public void processPageBackward() {
        this.startbrTransactFile();  // PERFORM
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
    }

    /** POPULATE-TRAN-DATA  (uuid:06185033-36e2-0781-667c-505e3bdd9b3c, source lines 1363-1427). */
    public void populateTranData() {
        // MOVE TRAN-AMT TO WS-TRAN-AMT  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TRAN-ORIG-TS TO WS-TIMESTAMP  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-TIMESTAMP-DT-YYYY(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-TIMESTAMP-DT-MM TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-TIMESTAMP-DT-DD TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO WS-TRAN-DATE  -- identifier MOVE; needs PIC-aware type coercion
        // EVALUATE WS-IDX
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-IDX */) { /* WHEN branches follow */ }
    }

    /** INITIALIZE-TRAN-DATA  (uuid:aef39e3c-aac1-80be-668d-62d97d47ef22, source lines 1432-1487). */
    public void initializeTranData() {
        // EVALUATE WS-IDX
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-IDX */) { /* WHEN branches follow */ }
    }

    /** RETURN-TO-PREV-SCREEN  (uuid:1470d791-c405-a709-c470-54a69e84885c, source lines 1492-1503). */
    public void returnToPrevScreen() {
        if (java.util.Objects.equals(this.cdemoToProgram, "\u0000")) {
            // TODO: translate body for: CDEMO-TO-PROGRAM = LOW-VALUES OR SPACES
        }
        // MOVE WS-TRANID TO CDEMO-FROM-TRANID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO CDEMO-FROM-PROGRAM  -- identifier MOVE; needs PIC-aware type coercion
        this.cdemoPgmContext = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
    }

    /** SEND-TRNLST-SCREEN  (uuid:6f590510-807b-eed6-7e39-d7f5236a76dc, source lines 1509-1531). */
    public void sendTrnlstScreen() {
        this.populateHeaderInfo();  // PERFORM
        // MOVE WS-MESSAGE TO ERRMSGO OF COTRN0AO  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: SEND-ERASE-YES *>EXECCICS */) {
            // TODO: translate body for: SEND-ERASE-YES *>EXECCICS
        }
    }

    /** RECEIVE-TRNLST-SCREEN  (uuid:3ec5c41d-3cf5-e2ab-df14-e0d80c910143, source lines 1536-1544). */
    public void receiveTrnlstScreen() {
        // TODO: implement receiveTrnlstScreen.  See uuid:3ec5c41d-3cf5-e2ab-df14-e0d80c910143
    }

    /** POPULATE-HEADER-INFO  (uuid:d9fa3eaf-ae59-a382-0ca1-c3e06f27aecf, source lines 1549-1568). */
    public void populateHeaderInfo() {
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF COTRN0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF COTRN0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-TRANID TO TRNNAMEO OF COTRN0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO PGMNAMEO OF COTRN0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF COTRN0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF COTRN0AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** STARTBR-TRANSACT-FILE  (uuid:6dd83584-a99d-a84d-da56-c057f01b8bad, source lines 1573-1601). */
    public void startbrTransactFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** READNEXT-TRANSACT-FILE  (uuid:0339d2f9-21c4-4e5a-e3c8-91088b571db2, source lines 1606-1635). */
    public void readnextTransactFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** READPREV-TRANSACT-FILE  (uuid:ae369b8e-759b-7a5b-8db5-592c08badd89, source lines 1640-1669). */
    public void readprevTransactFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** ENDBR-TRANSACT-FILE  (uuid:895b620a-3582-78f2-16b9-938daa93a470, source lines 1674-1678). */
    public void endbrTransactFile() {
        Vsam.endbr("WS-TRANSACT-FILE");  // line 1676
    }

    public static void main(String[] args) {
        new Cotrn00c().mainPara();
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
