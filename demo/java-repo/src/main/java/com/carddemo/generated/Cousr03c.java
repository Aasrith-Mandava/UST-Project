// Generated from COUSR03C.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COUSR03C.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * COUSR03C (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: COUSR03C.cbl
 */
public class Cousr03c {

    /** WS-VARIABLES (uuid:ee3ac66d-820c-e717-f53f-091b72e71565, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsVariables;

    /** WS-PGMNAME (uuid:96491447-3872-f682-e4fc-07b7fd850c8a, level 5, PIC X(08)). */
    public String wsPgmname;

    /** WS-TRANID (uuid:95fa6e33-9aaa-f0f2-eb8b-d90bb9dee8d0, level 5, PIC X(04)). */
    public String wsTranid;

    /** WS-MESSAGE (uuid:ea9486a3-cd87-30c3-9d4d-33a9ae688afc, level 5, PIC X(80)). */
    public String wsMessage;

    /** WS-USRSEC-FILE (uuid:f9fa8980-9ba4-08ae-9432-ddbf7e05bbe4, level 5, PIC X(08)). */
    public String wsUsrsecFile;

    /** WS-ERR-FLG (uuid:5b64139d-f761-52d5-9ab4-b35f604dea9a, level 5, PIC X(01)). */
    public String wsErrFlg;

    /** WS-RESP-CD (uuid:21192d9e-4f13-6c78-2fb1-f1dc51e3974b, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsRespCd;

    /** WS-REAS-CD (uuid:bc24cf9a-087d-e14b-d6c6-d7b11e774f45, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsReasCd;

    /** WS-USR-MODIFIED (uuid:5588e641-0273-1135-92e5-78565fb94a14, level 5, PIC X(01)). */
    public String wsUsrModified;

    /** CARDDEMO-COMMAREA (uuid:8e1971ff-55b9-48ba-6688-7dd5e044258a, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:206e32ca-77b8-54bc-a9c1-eab4cc6cf7ef, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:eac803b0-4c65-3813-ec4a-badb70d36b4a, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:07b8db28-ef9e-79f9-d057-ce411bc9216c, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:e1aa5e46-7e0e-84de-68fe-d9e67f11a0df, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:fabe3cde-64a0-2a03-a85e-39d4f24a7ba2, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:5840ecc9-e5ff-93bd-3200-8e450358adbb, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:0e79c94f-f435-f07a-e1a8-5a6e72ae9711, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:2a09689a-a40a-e38f-9940-cf6c4668a339, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:5fba1472-cee8-ee7a-ac0e-4dbe45b3bbc3, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:eff4ad16-8981-ee1b-bc03-8fc512f9e7cd, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:3e258a16-4f61-0ce8-3034-7f7f9e1511e5, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:36999f09-bd6f-36a6-e4ad-0a1ffd57e311, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:d28f7679-2012-00db-c966-7eb56dc184cb, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:f4d56c2f-9094-fed8-8ed3-1e48348d752d, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:e515c5d4-9a3f-ac0d-6793-9e42aff1e57a, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:4c49b784-30bf-d700-96f5-11bcc7f6415c, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:0289ce8e-8d62-23a4-b8c8-c263d281765f, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:d4675ce6-cecd-0c8a-d00a-8ede4ad57636, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:ad2bfe04-2863-c332-fc85-c2ace2ed7822, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:425f4bcc-f685-4212-453e-ee901053e3f7, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:f10a8d93-2539-970f-17c6-206398fa0201, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** CDEMO-CU03-INFO (uuid:ace730b7-2d93-333d-14aa-5667dcb491fa, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCu03Info;

    /** CDEMO-CU03-USRID-FIRST (uuid:ea6d34f3-3e47-cb63-3cb2-c12b859d81ab, level 10, PIC X(08).). */
    public String cdemoCu03UsridFirst;

    /** CDEMO-CU03-USRID-LAST (uuid:81d47d1a-3b06-2643-215d-3d5020931493, level 10, PIC X(08).). */
    public String cdemoCu03UsridLast;

    /** CDEMO-CU03-PAGE-NUM (uuid:b1d9212b-668b-8f31-9b76-e7ad8ad97095, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ cdemoCu03PageNum;

    /** CDEMO-CU03-NEXT-PAGE-FLG (uuid:88ddd30a-aa9d-f345-896f-d03dd7fc6c88, level 10, PIC X(01)). */
    public String cdemoCu03NextPageFlg;

    /** CDEMO-CU03-USR-SEL-FLG (uuid:5817b25a-42b9-c59b-09a7-985a97d14a45, level 10, PIC X(01).). */
    public String cdemoCu03UsrSelFlg;

    /** CDEMO-CU03-USR-SELECTED (uuid:ac3a822c-9063-b845-b6a2-059cebe495e7, level 10, PIC X(08).). */
    public String cdemoCu03UsrSelected;

    /** COUSR3AI (uuid:54d1fd59-c2d2-457f-a41d-76f3a6ddba4a, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cousr3ai;

    /** TRNNAMEL (uuid:14766a48-d299-cff6-f057-7f84b23a3a96, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamel;

    /** TRNNAMEF (uuid:7cf7cdb3-8513-6abf-62d8-dc3d0db00429, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamef;

    /** TRNNAMEA (uuid:cd0af1de-4726-ab67-d98b-10fdaebc4747, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamea;

    /** TRNNAMEI (uuid:100b51b6-6474-dcfc-d8b8-a9b2d6d96ea2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamei;

    /** TITLE01L (uuid:7789566d-cff8-3311-c1e5-c395ad01b63a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01l;

    /** TITLE01F (uuid:b954e88f-0250-1c31-6be4-e253f084ebc3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01f;

    /** TITLE01A (uuid:d291f22f-4d7e-8aab-11ec-15aa41990e8a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01a;

    /** TITLE01I (uuid:5d51136a-6c02-3c9c-d4d8-462728a29ca0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01i;

    /** CURDATEL (uuid:1720ab34-5e1f-855d-6b1e-9ac6e17063bb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatel;

    /** CURDATEF (uuid:5bb85b68-288d-329a-8fae-b159c58b1fcb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatef;

    /** CURDATEA (uuid:c77191db-225c-3db0-b073-a2dba5112575, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatea;

    /** CURDATEI (uuid:ef03ca88-78a0-d5dd-bed8-3fb25168166d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatei;

    /** PGMNAMEL (uuid:4d3b3f21-56c7-2f05-1cad-4158ffbca451, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamel;

    /** PGMNAMEF (uuid:e25f87d0-9fc0-52b7-486b-362c1beddcf0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamef;

    /** PGMNAMEA (uuid:baf9f482-e480-9994-9d2d-81465486d32b, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamea;

    /** PGMNAMEI (uuid:d9d6f3b7-acf0-77e6-855e-5870c1c467cd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamei;

    /** TITLE02L (uuid:e6ec8078-fd83-ec60-c16b-df18b460efe6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02l;

    /** TITLE02F (uuid:c8d528c7-5797-e81a-43fb-325dcd0120f0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02f;

    /** TITLE02A (uuid:fef307d1-9b22-9b08-3ce0-b00df4c7e3da, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02a;

    /** TITLE02I (uuid:74b62c0a-8944-38f9-d818-6993a025c41f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02i;

    /** CURTIMEL (uuid:c5b74c23-b3f1-13e3-2452-4ae76a2a470f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimel;

    /** CURTIMEF (uuid:fad862eb-5a65-9cc4-5b42-c6f73fb0af47, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimef;

    /** CURTIMEA (uuid:0d51a20f-950c-93ea-fa76-58498b98f91a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimea;

    /** CURTIMEI (uuid:110afdc6-3618-f9b3-fb6d-155118d326f0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimei;

    /** USRIDINL (uuid:e50bc363-bdde-e596-64e8-0e7790bea958, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinl;

    /** USRIDINF (uuid:70c57359-0993-e515-367f-8956e1ca2d0d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinf;

    /** USRIDINA (uuid:93eeb238-2ce4-73c3-c452-cd4248cf9f20, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridina;

    /** USRIDINI (uuid:82c71ae8-685f-3ad0-fee9-2ff4a249f3e1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridini;

    /** FNAMEL (uuid:e694b63d-64c5-5be8-8d4d-fdaa551bc735, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamel;

    /** FNAMEF (uuid:c5c5abc0-7708-88cd-c70d-747b087aab72, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamef;

    /** FNAMEA (uuid:3212159e-f115-ddbe-dd78-3c250e1282cf, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamea;

    /** FNAMEI (uuid:e4e0849c-ea4b-cc94-da92-3404a16036f7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamei;

    /** LNAMEL (uuid:01574ae4-8c01-c23e-c6c1-06cd11e6d048, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamel;

    /** LNAMEF (uuid:4f5ea205-1bd1-7008-a24b-49716e12837e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamef;

    /** LNAMEA (uuid:8ccccd67-3d3e-ab83-d6c0-5c1155a9c4c7, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamea;

    /** LNAMEI (uuid:b535f9c1-4729-e08b-19fb-ced9da5d17a2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamei;

    /** USRTYPEL (uuid:79729534-910a-140e-a761-15dd6b4d230f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypel;

    /** USRTYPEF (uuid:e945ce97-7bf4-7164-423c-7629dd836016, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypef;

    /** USRTYPEA (uuid:77ad871f-ac60-43c0-2bdf-c61551114da5, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypea;

    /** USRTYPEI (uuid:dee94931-f335-7999-3a11-1718f6fb2616, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypei;

    /** ERRMSGL (uuid:b9109964-ed82-8537-dbc5-4a18dcb3cde8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgl;

    /** ERRMSGF (uuid:3fbbc648-7d9c-4f49-75e7-f6d4f268eeb7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgf;

    /** ERRMSGA (uuid:1483bd11-1120-d6f2-14ae-cb1ad8400db4, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsga;

    /** ERRMSGI (uuid:03b971f5-aa0d-89f0-d016-086d719ccecf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgi;

    /** COUSR3AO (uuid:586db9c8-e096-b771-54c5-25720ff67567, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cousr3ao;

    /** TRNNAMEC (uuid:1df43480-0946-80d9-6530-517e68fade55, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamec;

    /** TRNNAMEP (uuid:57886651-f4bf-38a6-7dfb-bf5b3ff6a675, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamep;

    /** TRNNAMEH (uuid:3ba613e3-792b-30e3-8459-65e570596ce5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameh;

    /** TRNNAMEV (uuid:d2f9fa38-1919-1fb2-9544-25c8b3e59954, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamev;

    /** TRNNAMEO (uuid:cad7e317-5a9f-0b07-d818-6067f963eae5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameo;

    /** TITLE01C (uuid:e7a26e97-a0be-4a95-78d8-acbd21c69d48, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01c;

    /** TITLE01P (uuid:96d87883-d040-0615-71a4-94a08805139e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01p;

    /** TITLE01H (uuid:6bf4a358-4b4f-6a68-8d32-f1aafc7ad0d1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01h;

    /** TITLE01V (uuid:0ee49ae0-993b-1a53-8252-ae8e38983a65, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01v;

    /** TITLE01O (uuid:880bf726-27a7-7d2f-d7b7-23a7142a4d4e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01o;

    /** CURDATEC (uuid:accbea7b-0541-39ff-a166-707b3233c7b9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatec;

    /** CURDATEP (uuid:91b26b05-4f1f-ffa1-5cf7-4ed256d48609, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatep;

    /** CURDATEH (uuid:a2e88592-00c4-ea93-04ae-4b7dacc26ff4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateh;

    /** CURDATEV (uuid:209f2756-7690-4729-8ee3-01ef9b703a3b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatev;

    /** CURDATEO (uuid:3fc7da0a-98f0-2fbc-7055-7f0253b89241, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateo;

    /** PGMNAMEC (uuid:a1af5b9e-b374-d268-6293-cd74ba41d37a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamec;

    /** PGMNAMEP (uuid:06c146c7-cf82-641c-6166-7611fa0b73eb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamep;

    /** PGMNAMEH (uuid:ff36e666-a5ad-87a3-be22-05fe30d2b759, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameh;

    /** PGMNAMEV (uuid:dde21d48-1eaf-6ce8-37c7-cd2c8d8a9054, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamev;

    /** PGMNAMEO (uuid:103cb425-2fb6-d219-dcd1-7291aa2e9f26, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameo;

    /** TITLE02C (uuid:9f10b2b9-2d60-4968-5301-305f1835d89c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02c;

    /** TITLE02P (uuid:be5102b6-ea68-cda6-e231-b2348bc7dad3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02p;

    /** TITLE02H (uuid:43fffb05-2b4d-0b53-1d68-5274b927d71f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02h;

    /** TITLE02V (uuid:65d771b1-109f-29c2-43c4-128d744d4f85, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02v;

    /** TITLE02O (uuid:973fa29d-7cf8-6096-462d-737dbcdfe61e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02o;

    /** CURTIMEC (uuid:6b1e0048-140d-5132-b77b-45246f0dbc05, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimec;

    /** CURTIMEP (uuid:eacfa4e4-391e-1d9b-5f20-e4b8c212bc57, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimep;

    /** CURTIMEH (uuid:83abf1c2-5c9a-25c3-2214-715224a6ead8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeh;

    /** CURTIMEV (uuid:74ddd1eb-44f8-ee69-7564-3f4e6765716c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimev;

    /** CURTIMEO (uuid:44e79911-2ace-331a-ab80-97f76a65f4e6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeo;

    /** USRIDINC (uuid:ff1cf8af-784a-1258-1a38-07ce32d4779b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinc;

    /** USRIDINP (uuid:28a2d92e-fc63-e714-26ea-5ffffa0db317, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinp;

    /** USRIDINH (uuid:eac14e30-368a-65b6-7cda-75d6ff9ab1cd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinh;

    /** USRIDINV (uuid:e09d5a57-e920-1f4f-55dd-ea545a38ec08, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinv;

    /** USRIDINO (uuid:1ec643ee-d7ac-2b6d-a018-ec2a196f6b51, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridino;

    /** FNAMEC (uuid:7303d61d-99a6-b456-8106-bd1382ca290e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamec;

    /** FNAMEP (uuid:3fe43941-d1d6-4b50-f064-8b12087ce0cb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamep;

    /** FNAMEH (uuid:aaa54248-fe19-bb20-d779-260b52560b4f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnameh;

    /** FNAMEV (uuid:f2894dac-fed9-bc34-35bb-c99e51e31848, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamev;

    /** FNAMEO (uuid:3c739873-1d16-c8f6-4803-c875b186c849, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnameo;

    /** LNAMEC (uuid:070fbaad-ee97-c219-7fff-0574ec758bbc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamec;

    /** LNAMEP (uuid:06cd12d3-de3c-3e99-9b31-509b624c6b27, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamep;

    /** LNAMEH (uuid:1aa3b7cb-f545-1735-59f1-ecad656b972c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnameh;

    /** LNAMEV (uuid:268aa394-46b6-79ed-d550-46c4516cba7a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamev;

    /** LNAMEO (uuid:560847fa-0712-62f8-c5fd-6d1bba391520, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnameo;

    /** USRTYPEC (uuid:6e541629-3a54-a812-3870-cb9cbdfbb35e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypec;

    /** USRTYPEP (uuid:2e3659ff-8e6d-3022-0325-afa5c74d4267, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypep;

    /** USRTYPEH (uuid:a68f8686-8b86-422b-a80a-d82e4e6666b6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypeh;

    /** USRTYPEV (uuid:f06fb211-150a-4604-9d86-a0217e4f5fe2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypev;

    /** USRTYPEO (uuid:496959e1-9d1f-cbf2-9b81-19a716700f3c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypeo;

    /** ERRMSGC (uuid:049ac62d-f52c-5a29-dfa2-4a90609f8eee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgc;

    /** ERRMSGP (uuid:998a4339-df2e-59fb-f39f-e87ca9b6e87f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgp;

    /** ERRMSGH (uuid:ff991e6b-1005-922b-e083-78c013d0f6ae, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgh;

    /** ERRMSGV (uuid:d7783218-5eb5-b60f-82be-cadd8c8c811d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgv;

    /** ERRMSGO (uuid:e1a0842f-79bc-ee73-5247-d36ffba128b1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgo;

    /** CCDA-SCREEN-TITLE (uuid:25586162-1c2c-d26c-6be2-a8c604788ff8, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:a69084e4-770c-9166-e3bb-1a8318c9401c, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:77c54e89-4211-d389-bd01-494a1da65311, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:fb8a51f1-1922-eb54-5f9f-c7f048c6492d, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** WS-DATE-TIME (uuid:11e49c6b-fbfe-8394-22d6-85f757516aa4, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:bce33683-2639-5734-cc4e-eec769291bbc, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:b8d9bb04-64f7-076c-4e98-9ab1eeabd545, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:ce3be013-cb23-2780-e3a2-b9fa2f1083f6, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:ccc937e1-790e-72a9-55b2-f46a575227a9, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:fe131c7c-ae02-1eea-11b1-d3e57151589a, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:d7bb08f5-30e5-6ab9-537e-30cdc2dbd8a5, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:14a63740-e1a5-f0be-769b-5d5a4d3fa2b4, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:918471b3-8704-6c65-4839-e963a1f8220f, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:b3ad2ae5-c1a4-c0b0-0739-e63c9eb15243, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:7933d3ad-e8a6-e6c4-0fd5-18ec42f3c456, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:cf05e182-a1d6-fab8-9fc5-a6b158b9b182, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:dc91a92a-dcb1-4f3b-9ff2-a8bb07efbf09, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:236a5dcf-6901-45b4-7e76-ef97152519a8, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:69d7c993-af3c-8760-564c-9d6acb364ca1, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:44da18a7-02ca-c363-8ad9-73e29e4706ab, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:0770d2e5-1310-b197-9445-33b5a7990713, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:1f28979b-6be6-bf37-c3e1-9edb4615569e, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:fbc957b7-dbb2-b9f7-9a44-ecf64fc058f6, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:a2a111a5-3729-1d80-8e7d-970417ba90ed, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:03d2bd2f-bee7-806d-c080-765a81695b54, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:2e3b7327-ccd4-eecf-1055-33a3d2c0a3c9, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:3f957861-0ca6-068c-c68f-10927fe975b8, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:c4c2dea9-2940-fa01-7857-9135d7d66b49, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:9c83fd40-c915-78bd-3810-b05d011bc7f5, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:d1d3fe32-cbca-b77e-dd31-705828f27b9a, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:a91df79f-76ce-40ac-f24a-f4731e3ec1c3, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:28f099ee-2e5c-8424-77d6-e7afce1b6699, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:d7c35b4c-0281-c885-8eab-5eae89ddd008, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:d100f069-6353-3a9b-2866-65cb9fe158e7, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:d24166f0-78c6-b50a-23b2-eeb33360f703, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:f95336a3-dc38-bfbd-9b3b-304c71b6cf4e, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** SEC-USER-DATA (uuid:73b43333-0e91-011d-a93b-da0ccabdae6d, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ secUserData;

    /** SEC-USR-ID (uuid:a08f826f-a7ce-f703-7fb4-acf1c5f18092, level 5, PIC X(08).). */
    public String secUsrId;

    /** SEC-USR-FNAME (uuid:f62cf143-a954-85ff-d4c9-15a72d8cab2c, level 5, PIC X(20).). */
    public String secUsrFname;

    /** SEC-USR-LNAME (uuid:bcdfa952-99c8-ad6a-df5e-17d4d6ecaf19, level 5, PIC X(20).). */
    public String secUsrLname;

    /** SEC-USR-PWD (uuid:c1ce4397-b726-fb05-8b96-7854fa03eaed, level 5, PIC X(08).). */
    public String secUsrPwd;

    /** SEC-USR-TYPE (uuid:348d75c3-7d39-5500-4172-a65e040f8ca4, level 5, PIC X(01).). */
    public String secUsrType;

    /** SEC-USR-FILLER (uuid:e2d6e708-f902-6097-215f-b0e5e93f2d5a, level 5, PIC X(23).). */
    public String secUsrFiller;

    /** DFHAID (uuid:8d1ecb5b-7105-2338-71bc-a5deae5e8b42, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:bd206f3c-b51d-bca8-8223-b34048654820, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:f334a704-02ba-0e9e-831c-2c88a546b52f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:7386d647-20e7-9a06-7b87-7fb2f5216c3f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:1b2fdcb7-78e4-10a3-1e83-ed6a408fb728, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:48cf87de-2c89-8d0f-f6de-273e69cf02b2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:39c77d3a-8daf-04c7-ed25-51ebb97c5e5c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:8b503851-ebf0-b70e-6365-ab924fc7953a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:a54f8aa7-09f5-f07d-ad3a-f50d49906851, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:b3876817-3552-9631-c868-5958bbdec416, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:6f1eee85-99e9-5fe2-256a-34a71a1c5ac6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:04454b23-9d11-c8ad-750d-8999dbf0aed8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:48c28305-1217-78e9-eb61-a0eae7567a84, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:c4f424d2-7567-29d0-8fc6-25b3b1a63afa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:3bcd4e9f-48a5-b2ce-76dc-8542ab8b4e97, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:354f19ed-ca5a-39e5-bdbf-580479271c44, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:8137d1d3-3d38-a01d-5a10-f70fb9e2a01c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:7aa102c2-4dd5-5169-cbca-a9330eb9408b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:628d3111-d29d-2d4b-2d7c-4004fc703c1a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:b4aa596e-3552-39c5-d367-6fa957e26288, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:02e53ed5-dc60-768c-0768-f4b0ab08ff9b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:7718c6f6-959a-400d-ead6-e4cfc4aa77c0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:9d2798e7-8515-a1e1-f953-74554a4b7f26, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:aa6918b7-b6d8-2377-2ff6-3fe249be2e22, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:a7ded209-9fa3-f661-e5aa-476026c34a17, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:014275b3-594e-d94a-036e-6fc12b1e10ef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:91def69c-1f74-35e5-7c49-77407e265117, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:405a1231-7963-3ed3-ca93-533376cd7a7c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:e4508206-4eed-a2e7-65d2-3a2c98a43225, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:dfa3e649-65ae-60aa-5fa6-cb0c6d6322af, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:2bc67981-dae8-171f-20d2-1b9deaf0230d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:a72da52e-bf77-1a26-072e-c25d56cf4fe7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:5b2a0587-a47e-b21c-1d66-d3b16f2cacb0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:79cde284-bad5-066e-cf97-d0d9e686b656, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:59edd443-41ee-3f89-2b86-30d5b838c6e1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:27332105-d91c-78ec-e5d8-bf41502451f2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:c49dbd3f-f05a-2d8f-aa69-ec5e4fa326b5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** DFHBMSCA (uuid:4b7b814f-e07c-176b-c32c-45c1ad9c8942, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:8b1e700c-7f1d-569d-10eb-ae3b10758bc1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:931a3932-505e-6466-caef-0227c4c46b2b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:a97864bf-19d0-7945-ff59-b9556a3cd776, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:73965c06-bfb0-f4d9-8658-8def7ebf79c1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:6e92ab36-e413-26ca-2d6e-cde410afdc55, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:0ac9c75d-4146-bc57-c2c1-6f17f65aeb07, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:80db372b-8c3d-d752-81e2-b77e6a80ce35, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:fcde1469-c55f-f27b-c715-ee925427226a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:cc6c311a-9598-310b-b7c2-5369386271ca, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:7a4eb1a1-7715-b735-d585-1f24989fd741, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:38cd0b9d-efe2-027a-6ede-83a221ae116e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:6f73fdb8-f994-1831-2140-786d70175630, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:a68c35c0-f1dd-1744-a5ec-c389a8408742, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:9053a322-5488-ae55-fd27-1dff7be801ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:1464b4c4-74d7-b5dc-3127-ea5addd0deed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:ec20af00-7161-92b2-e855-39628ed0e7b8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:183f8237-8e97-61b7-0473-fc5330d8acb9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:e7334271-a32a-9726-0c3d-5ab03dd90b02, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:44069221-7672-8181-e0fb-132c6a34dd9a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:03e1882a-2b97-0875-c4e7-9db1c7c376db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:f6e43a06-02d5-7aed-1b3b-29287d065a6d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:405eddf7-ef9a-ff8a-a4ac-fb012aa92504, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:1b6db6d1-7d68-78d2-5671-369a7ca37128, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:14575425-cc09-c134-d86d-f4b7ce97ef00, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:90dee1aa-a060-1f9f-66f6-78bd3b164c7c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:f775013b-0262-5f5c-e594-8eaf4775221e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:23650a73-4f4f-4e20-4e2a-bfde1585dac2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:f1ea6857-67c7-2d6f-2a80-5f4bec650042, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:9c4712af-4872-43b1-6238-7e71c6f8a893, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;


    // --- auto-generated stubs for undeclared references ---
    public Object eibcalen;  // auto-stub for undeclared reference

    /** MAIN-PARA  (uuid:a5101961-9a51-de95-7b63-cfa0b9efc5c1, source lines 493-548). */
    public void mainPara() {
        // SET ERR-FLG-OFF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET USR-MODIFIED-NO TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsMessage = "";
        this.errmsgo = "";
        if (java.util.Objects.equals(this.eibcalen, 0)) {
            // TODO: translate body for: EIBCALEN = 0
        }
    }

    /** PROCESS-ENTER-KEY  (uuid:8603e9e6-aec3-0055-14a7-9edb06597bb4, source lines 553-580). */
    public void processEnterKey() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
    }

    /** DELETE-USER-INFO  (uuid:fcf7863c-91a0-8a7c-1a81-263236c7e57a, source lines 585-603). */
    public void deleteUserInfo() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
    }

    /** RETURN-TO-PREV-SCREEN  (uuid:3acfca0e-8ae2-7e6c-0dd6-82324477a5e7, source lines 608-619). */
    public void returnToPrevScreen() {
        if (java.util.Objects.equals(this.cdemoToProgram, "\u0000")) {
            // TODO: translate body for: CDEMO-TO-PROGRAM = LOW-VALUES OR SPACES
        }
        // MOVE WS-TRANID TO CDEMO-FROM-TRANID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO CDEMO-FROM-PROGRAM  -- identifier MOVE; needs PIC-aware type coercion
        this.cdemoPgmContext = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
    }

    /** SEND-USRDEL-SCREEN  (uuid:86533e7e-d415-8212-a909-2869159750c7, source lines 624-636). */
    public void sendUsrdelScreen() {
        this.populateHeaderInfo();  // PERFORM
        // MOVE WS-MESSAGE TO ERRMSGO OF COUSR3AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** RECEIVE-USRDEL-SCREEN  (uuid:f4a5d2fe-66d0-16e2-95e7-a0b3ae0d82e0, source lines 641-649). */
    public void receiveUsrdelScreen() {
        // TODO: implement receiveUsrdelScreen.  See uuid:f4a5d2fe-66d0-16e2-95e7-a0b3ae0d82e0
    }

    /** POPULATE-HEADER-INFO  (uuid:13425164-7bcd-594a-b437-a11f480d5c21, source lines 654-673). */
    public void populateHeaderInfo() {
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF COUSR3AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF COUSR3AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-TRANID TO TRNNAMEO OF COUSR3AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO PGMNAMEO OF COUSR3AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF COUSR3AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF COUSR3AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** READ-USER-SEC-FILE  (uuid:a4c6608b-9120-546d-f267-071e3878db37, source lines 678-711). */
    public void readUserSecFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** DELETE-USER-SEC-FILE  (uuid:04f1ddd3-c8a9-b3f1-1816-a3cf41c09d5b, source lines 716-747). */
    public void deleteUserSecFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** CLEAR-CURRENT-SCREEN  (uuid:1c00099e-aff4-2200-4bb6-e8e8efbe3512, source lines 752-755). */
    public void clearCurrentScreen() {
        this.initializeAllFields();  // PERFORM
        this.sendUsrdelScreen();  // PERFORM
    }

    /** INITIALIZE-ALL-FIELDS  (uuid:80581663-1456-40e3-3959-3e39cb3caefc, source lines 760-767). */
    public void initializeAllFields() {
        this.usridinl = -1;
        this.usridini = "";
        this.fnamei = "";
        this.lnamei = "";
        this.usrtypei = "";
        this.wsMessage = "";
    }

    public static void main(String[] args) {
        new Cousr03c().mainPara();
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
