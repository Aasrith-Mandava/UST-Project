// Generated from COUSR01C.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COUSR01C.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * COUSR01C (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: COUSR01C.cbl
 */
public class Cousr01c {

    /** WS-VARIABLES (uuid:fb5ec66c-cba3-2656-2d8f-9619065124fa, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsVariables;

    /** WS-PGMNAME (uuid:27f9c235-1707-d049-139e-bf805773fc8a, level 5, PIC X(08)). */
    public String wsPgmname;

    /** WS-TRANID (uuid:12eae192-7244-0822-54c3-20c7355c409e, level 5, PIC X(04)). */
    public String wsTranid;

    /** WS-MESSAGE (uuid:b9095643-33bc-e53d-1769-6d4b19bab54d, level 5, PIC X(80)). */
    public String wsMessage;

    /** WS-USRSEC-FILE (uuid:8cef0f64-ccda-d8cd-f8a5-ca10872b0028, level 5, PIC X(08)). */
    public String wsUsrsecFile;

    /** WS-ERR-FLG (uuid:5aeb54d7-c0b1-2a69-e22b-73afc8ef38a8, level 5, PIC X(01)). */
    public String wsErrFlg;

    /** WS-RESP-CD (uuid:4a6eafc0-4dd6-6566-2179-d0b93aba16dc, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsRespCd;

    /** WS-REAS-CD (uuid:197d8328-6a82-28ef-1644-c15ad58e7dc5, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsReasCd;

    /** CARDDEMO-COMMAREA (uuid:3cd7f44e-13d8-2fc3-979b-06de81fb4670, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:80f60086-812c-ec57-ca9c-d05ebf30891c, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:a62c4d10-cd09-1017-8d5d-ccad903c1f57, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:e683beb6-1826-27cb-c485-52a98eb515b1, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:7e072068-58af-462e-dd3d-8acad098f7c1, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:a72ac1dd-91ef-bf8b-556c-7cf192088cd8, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:1553115a-c667-cbd0-662e-7f513f7d954b, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:0f0778a9-6491-078c-3710-3aeec5595bbf, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:519a633a-b455-41b8-65b6-6c5edc66bfb3, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:018823c8-1303-0a4e-ca62-ade8874f4923, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:df8d7125-e38a-8502-4718-d26df54f0a99, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:f86d1e6d-2093-7a14-ee98-298664b6496a, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:8760d673-e5b8-33b2-2b35-2d7557d9e382, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:3868538a-6a41-f606-d5bb-4f67c8161b36, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:b930aa17-29d5-34f6-882f-75c3b376db1d, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:43f9dbce-d1fb-0fd6-ec16-b0526e802525, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:2e3f2f63-8fbc-96bb-17ef-eec73f062964, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:5cc22697-26fd-04c7-b4fd-a3ad392adc35, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:554a5af4-ad41-13c6-5055-77706ae83f34, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:f636a38f-d0fc-4c2f-ef11-ab113b4e87b9, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:8484da54-f1e5-e15b-da07-a7ccef35b603, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:dcc3127c-51a9-e006-451a-c39d36967e07, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** COUSR1AI (uuid:cedf5aaa-b645-f019-64d2-24e34ec94a99, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cousr1ai;

    /** TRNNAMEL (uuid:b0df2469-076c-331f-7255-a2903bbbe5ae, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamel;

    /** TRNNAMEF (uuid:5e85a3da-795f-7297-7df6-1d1519b54010, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamef;

    /** TRNNAMEA (uuid:087c5db8-466b-24bc-9326-c1dd91784cf8, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamea;

    /** TRNNAMEI (uuid:37a3f1a7-d970-4fce-31ce-8786708a935f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamei;

    /** TITLE01L (uuid:7b27858d-99fd-f6d1-aeb5-4870506b7fa7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01l;

    /** TITLE01F (uuid:f960bf22-ae82-b90c-e9fe-3b9577c40094, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01f;

    /** TITLE01A (uuid:9f2e487b-6c27-c1f4-abe7-efd016c8f262, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01a;

    /** TITLE01I (uuid:735f182d-7bf9-b298-5d16-14935b046045, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01i;

    /** CURDATEL (uuid:68dc7091-6eb0-a302-6b17-e63e688b5b7c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatel;

    /** CURDATEF (uuid:a1c38d87-223e-a082-c974-279bf9de8060, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatef;

    /** CURDATEA (uuid:63a67276-e3b8-bccf-857a-79a84daee769, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatea;

    /** CURDATEI (uuid:50317712-2ade-e8ed-d2a9-482d7fe2dde9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatei;

    /** PGMNAMEL (uuid:a3539fe2-de3d-3b32-04e4-e451a06ab680, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamel;

    /** PGMNAMEF (uuid:9d865cd3-2b50-dc1b-a81d-324ed006de5d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamef;

    /** PGMNAMEA (uuid:44b16b8a-70a6-8dbd-b724-425b919b3a84, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamea;

    /** PGMNAMEI (uuid:a8b6ba39-15f4-c2fa-6fae-abbb6f58850e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamei;

    /** TITLE02L (uuid:711c42e4-b0eb-f312-94d2-c77835afe17d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02l;

    /** TITLE02F (uuid:0b6221e5-d844-b050-b54c-4c1de13146d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02f;

    /** TITLE02A (uuid:5f0a38f2-1b40-94f5-e770-7083a1c7872d, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02a;

    /** TITLE02I (uuid:f83a29e9-9921-5f04-30bb-89a1b45d2a0b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02i;

    /** CURTIMEL (uuid:c2953c94-6680-8893-b2a2-fadce0b01ef0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimel;

    /** CURTIMEF (uuid:6428386a-d89b-22c5-b616-d145b3fe2ec5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimef;

    /** CURTIMEA (uuid:4cc19cef-82ee-511f-d455-bfea45050b61, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimea;

    /** CURTIMEI (uuid:cb808b47-2e55-8364-cc92-7a9a6ece7357, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimei;

    /** FNAMEL (uuid:e751a71c-7001-9beb-72a0-309e8fb6589e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamel;

    /** FNAMEF (uuid:76393b45-c075-599b-5eff-61590301e0e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamef;

    /** FNAMEA (uuid:99c135ed-27df-8402-6351-925fe81aff1f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamea;

    /** FNAMEI (uuid:c41dda8a-700d-67d2-8eda-0b4e950379fc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamei;

    /** LNAMEL (uuid:e50275de-4e9c-89fd-214b-4ad2d00c4794, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamel;

    /** LNAMEF (uuid:74505444-579a-02c1-807e-c79894492e03, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamef;

    /** LNAMEA (uuid:3571a6bf-9220-093e-3dd6-5f29122b3d9c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamea;

    /** LNAMEI (uuid:1334b3ea-2e44-bc99-a7fd-6d8f48a625cd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamei;

    /** USERIDL (uuid:d6c04006-aef6-513d-62a8-9fb61bc1f5d6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ useridl;

    /** USERIDF (uuid:dc8b4162-d344-4066-2d8b-89522fbc64d6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ useridf;

    /** USERIDA (uuid:2ab8af2a-a97a-7866-d7e2-3f1c13136213, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ userida;

    /** USERIDI (uuid:b3c574af-bd5d-957b-9bef-cf854a1e802a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ useridi;

    /** PASSWDL (uuid:0efb19d3-573e-17b7-f854-b137f3b1feec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdl;

    /** PASSWDF (uuid:47f34e7a-29b8-d9fc-924e-91b8f2b42711, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdf;

    /** PASSWDA (uuid:76a6a8f4-e62f-271a-5cef-5def9bfc8e81, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwda;

    /** PASSWDI (uuid:ee7d1b9c-a803-34e8-cae6-d072fa01fc58, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdi;

    /** USRTYPEL (uuid:1c8c71bf-6519-0f00-0d11-943eddfe3006, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypel;

    /** USRTYPEF (uuid:11ab8e42-0a28-3e2e-d0be-d5c193b50e68, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypef;

    /** USRTYPEA (uuid:37382761-391e-bf75-7f93-a6dc44cdbe78, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypea;

    /** USRTYPEI (uuid:a536a850-5426-db7b-f9ed-8ec8e2464b53, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypei;

    /** ERRMSGL (uuid:786e695b-175e-da93-32d0-4966cfc4986e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgl;

    /** ERRMSGF (uuid:6f328cbd-7f02-8d0c-b464-ec14592c2b70, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgf;

    /** ERRMSGA (uuid:d17c234c-15cf-e193-ed4f-5d090e5a10ab, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsga;

    /** ERRMSGI (uuid:e6131f19-8377-5b4a-943f-0891c95cfc58, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgi;

    /** COUSR1AO (uuid:1c106097-b77e-fe33-74c3-a936e4600589, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cousr1ao;

    /** TRNNAMEC (uuid:3389e40d-1768-ba4d-5dc6-18c65dbab221, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamec;

    /** TRNNAMEP (uuid:47625805-c5d1-ef3a-5a94-20b5ce700207, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamep;

    /** TRNNAMEH (uuid:8e016fb0-6c0b-b26c-6bb9-be8b86d2e813, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameh;

    /** TRNNAMEV (uuid:0650ef72-55a2-db0d-0cca-683219901af0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamev;

    /** TRNNAMEO (uuid:4177cc59-4b88-4498-44b2-580922f4c75e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameo;

    /** TITLE01C (uuid:85d5c339-c5a4-0072-7d27-4c646fa39a5f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01c;

    /** TITLE01P (uuid:3fd38925-71e4-ff1b-29de-73e9970246c0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01p;

    /** TITLE01H (uuid:1e5eda0c-28b8-68c9-b14c-ca61f5df996f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01h;

    /** TITLE01V (uuid:476bc170-45d2-4cde-c051-6ba268c88dc6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01v;

    /** TITLE01O (uuid:f81b91a3-5d49-78a4-b4e4-77b0d10dbc77, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01o;

    /** CURDATEC (uuid:a2a73393-803f-bcf4-c351-0e4951a16993, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatec;

    /** CURDATEP (uuid:643a2672-4a03-b5fe-6ca3-83992751c0a0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatep;

    /** CURDATEH (uuid:799b62d8-0758-fa50-4c9e-877730d2ecb0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateh;

    /** CURDATEV (uuid:04875218-dc5f-7ac1-733a-24cb2aa54558, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatev;

    /** CURDATEO (uuid:b604b584-4b81-1247-9445-0703de8e44aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateo;

    /** PGMNAMEC (uuid:8c816767-70fc-4d1a-2783-514ee3c3d450, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamec;

    /** PGMNAMEP (uuid:e7f94d1b-223d-6a7c-dd6e-f90772bd1c88, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamep;

    /** PGMNAMEH (uuid:6435da30-7885-f9d3-07dd-869e8d7a55a8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameh;

    /** PGMNAMEV (uuid:7b5d8ee9-4ca4-eb18-1cd8-0a431b23e553, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamev;

    /** PGMNAMEO (uuid:9c969fd7-972b-968b-0a1d-8b7f5983b828, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameo;

    /** TITLE02C (uuid:a3f7ba90-daee-c3d9-3c89-0738bb6b1742, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02c;

    /** TITLE02P (uuid:fe11a638-b70a-6b4a-d0d3-aea9422d08c0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02p;

    /** TITLE02H (uuid:17e61e7d-9731-4750-a4d7-684a0d39647f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02h;

    /** TITLE02V (uuid:301bc3f7-0555-fd12-5677-0213516a9941, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02v;

    /** TITLE02O (uuid:fc38a14f-9afa-28c0-99ed-cf89f49d17f8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02o;

    /** CURTIMEC (uuid:0ca11ebb-9a2d-3ab0-8a09-a77ffde52024, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimec;

    /** CURTIMEP (uuid:7f585eff-5e32-31bb-4d34-cda8508ae8af, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimep;

    /** CURTIMEH (uuid:6859c43f-0b6c-1b86-4dc9-5c4a759e086d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeh;

    /** CURTIMEV (uuid:ef278b95-2188-faf3-18db-d75c930f4fba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimev;

    /** CURTIMEO (uuid:9f64aa00-f052-010f-8113-7f299bdd65e7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeo;

    /** FNAMEC (uuid:c67f6a23-32e5-bb6d-2b93-108f0bc3d866, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamec;

    /** FNAMEP (uuid:1410b2ff-44f4-2be7-c43d-066645542222, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamep;

    /** FNAMEH (uuid:5981bf5a-4b72-d58a-3ea2-9aed171ae02e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnameh;

    /** FNAMEV (uuid:dd4febd0-ce92-c9e5-c8b7-5968f488502b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamev;

    /** FNAMEO (uuid:8873a295-1456-96c2-a68e-00363c20b9a2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnameo;

    /** LNAMEC (uuid:87027baa-e44c-2fe8-c0e8-5f4ea0dbb629, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamec;

    /** LNAMEP (uuid:cf7bde70-ac39-3994-65d5-c450dffce5bd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamep;

    /** LNAMEH (uuid:fe21f74e-e522-dff0-0824-720a0f757d7b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnameh;

    /** LNAMEV (uuid:d0840214-0bba-f4e2-1f92-3360463ee4d0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamev;

    /** LNAMEO (uuid:927e5214-bbab-83ed-bac0-b0460be6db3b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnameo;

    /** USERIDC (uuid:5d89b122-9b7f-1710-335b-59b1d1845b5b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ useridc;

    /** USERIDP (uuid:49b52631-05f2-7ed4-63fc-cc34745b895a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ useridp;

    /** USERIDH (uuid:905bfc35-b80f-ebad-fea6-9902fad558ff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ useridh;

    /** USERIDV (uuid:9da11eb1-fedd-37d4-79b4-ffacaa8848ea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ useridv;

    /** USERIDO (uuid:ffefa469-8214-d4eb-ea3a-135e315dd1f2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ userido;

    /** PASSWDC (uuid:9e43ed38-630e-1b06-a76c-d9e5ef84e115, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdc;

    /** PASSWDP (uuid:879aa826-70c4-3d06-01bc-fb6a1290806b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdp;

    /** PASSWDH (uuid:315af118-66c8-94e2-ff78-2ba5e11e4144, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdh;

    /** PASSWDV (uuid:c2f06e7a-741d-382d-f616-6671cd500a64, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdv;

    /** PASSWDO (uuid:c7b80ecc-42ee-9be1-941b-447430886962, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdo;

    /** USRTYPEC (uuid:ea044ec7-098b-7c66-171d-3fe1171ce8c5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypec;

    /** USRTYPEP (uuid:64ef877c-cb02-8a80-aa0d-fb0a6a82462c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypep;

    /** USRTYPEH (uuid:dbda2f5f-ed97-b43e-840f-f53fe4103ffd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypeh;

    /** USRTYPEV (uuid:47c53f0d-61df-546b-445a-8eeb87b98eee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypev;

    /** USRTYPEO (uuid:a84f6244-5a48-e65d-f54b-84952c408e7c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypeo;

    /** ERRMSGC (uuid:f70c831f-2c36-632d-37ef-2f69bde03efa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgc;

    /** ERRMSGP (uuid:92df84df-b965-7c77-91c5-0286366773f5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgp;

    /** ERRMSGH (uuid:7ca8e86d-bc45-a815-8b3a-703822fd670b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgh;

    /** ERRMSGV (uuid:cebcbc63-2779-8366-c0cf-6861f0cb08d1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgv;

    /** ERRMSGO (uuid:9e1fee75-9bff-0abb-9ef5-13e89f243aab, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgo;

    /** CCDA-SCREEN-TITLE (uuid:05a9a1db-1bd1-e4d7-fa19-efc480c42c02, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:37714739-fe1b-f901-75e2-085674eb5e68, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:fd4231b6-6158-44c0-15fb-455ceb6d6382, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:26e9d2e6-2827-3d62-d3d0-c35da2616326, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** WS-DATE-TIME (uuid:3022e1d5-9d12-4bcb-dd56-ac304f445c5c, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:319ad6bf-c4d8-940d-7e82-859caf85555f, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:302566e0-1617-5db7-0446-bde9d3b0b3f6, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:b28ccaf6-6251-601e-dc9a-c80f9663461d, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:96a93a10-cd9d-9a12-96c5-49abda49d52e, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:ee62507d-c194-af2d-fac4-06cc86c5f947, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:b4d5ccc1-e084-8d87-173b-bcdd2ec65947, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:b76e96a3-7547-02b8-228c-e0a383e1b6a2, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:65177ab0-4c76-7f7a-2e70-1b06f05fcb6d, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:d0722c8e-bb98-efa7-3152-69178f5f56ac, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:f635443f-bf5f-76fb-cc01-5cda7bf3059c, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:8fbce861-c491-e490-ff25-b594e256d573, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:bafc6a25-d9c3-9316-8d41-e0d54cacc29c, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:eeb402b3-86bc-66e9-2f16-8971f939043c, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:d745659c-93f1-c73d-61c0-704406028858, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:3cb9056c-4cbc-fef0-a7ae-7a0984426e92, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:3c53013d-3472-99c0-0187-d2a865bb4289, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:bfa05fda-0be2-a96e-b559-3984150f6e7c, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:28e114bc-0680-afb7-f80c-c22d0cbd03cf, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:a8ebb1ca-c301-2cd4-fab5-f23e0f6f861f, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:6bc4d66d-2e18-8c69-a638-98f7094e0179, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:6af9a5f5-1413-e2b6-9db8-2701cc2b51f8, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:6c2bc40a-62e0-170d-1caa-9a415f984859, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:0640bd8f-80ee-161e-ea38-7d223d0cf5ac, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:6eb1cb21-aee2-4df2-4ccf-0ecc8fd2d4e7, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:a4bc718b-4bfa-2df2-02ab-b7ad679f375d, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:d72d0ef2-05c8-2d85-470b-e3bb7bc6cdd4, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:6d18efc2-3e2e-85c5-1425-a295658cb227, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:90ddbc5f-a1d5-aef7-4956-9a47386c5c97, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:6d97b366-4450-efaf-e5e7-8098854ed71e, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:6a937830-d074-7595-1049-5b1a1fdbc844, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:81311343-606e-435f-d3fa-8039e0044b82, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** SEC-USER-DATA (uuid:28f1a3b1-cf48-71b9-0eb5-b788d05ab919, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ secUserData;

    /** SEC-USR-ID (uuid:bbfcc557-db83-522f-44ce-2593c890db51, level 5, PIC X(08).). */
    public String secUsrId;

    /** SEC-USR-FNAME (uuid:d9f526f5-551c-e90f-f14f-9cdc6647625a, level 5, PIC X(20).). */
    public String secUsrFname;

    /** SEC-USR-LNAME (uuid:423fde8b-3b19-fac2-dad5-1c04da86c92d, level 5, PIC X(20).). */
    public String secUsrLname;

    /** SEC-USR-PWD (uuid:ddc7e90c-74a1-9cfb-a78b-5d56d50157ee, level 5, PIC X(08).). */
    public String secUsrPwd;

    /** SEC-USR-TYPE (uuid:9a0a3916-e2d9-0623-6e38-a59babcca57a, level 5, PIC X(01).). */
    public String secUsrType;

    /** SEC-USR-FILLER (uuid:d3a313f8-91b8-0e5b-50e4-85fd92310e54, level 5, PIC X(23).). */
    public String secUsrFiller;

    /** DFHAID (uuid:e675480a-b6d2-e43d-6a5c-e9326004ecae, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:6705f544-c364-fe67-2408-b18a0d2757ea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:dcb0bb98-77a1-8c1e-f279-5816f4af2630, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:90e232aa-3ac8-0398-151c-0065d6784da4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:4b4d36f1-a098-99ca-8be0-f1aeb4e66382, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:efd7d8d8-fdbb-cb1d-e794-a15cba0934b2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:d02e832d-36af-63ab-2175-46f69c112576, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:4c43f1b7-788f-e4cf-1a8c-a9f64208e180, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:23eac90f-398e-b941-3a68-dac126897120, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:e204fa9e-8ffb-ca67-d967-8a3ed6240d10, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:251a01da-e7f2-9612-b278-f2b9b6a33abb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:332b8d93-3dc3-cda0-bd08-387527e6d4e4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:5e70d19f-850b-2700-7265-8b17a3416c2d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:96e51d60-f6ec-5a5c-7953-bdfc693bbfd7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:48e6dd74-ca8b-9520-6cdb-549818c68ee8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:ac0e6fce-262b-1b01-8d5e-8d7f0889479a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:0ad49247-7564-7b33-df1d-f15ea571fbd5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:7f5fa57b-feef-a7de-95e0-72f1085f8ba1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:29856df4-27c8-dc23-6aa2-f0402e60163b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:b9c9e724-19ce-f426-0cc1-ca12a56f395f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:f3e8e280-b2bf-af73-0109-ecd5d2079924, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:163ecab0-9536-74a6-4385-45da7bc33c03, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:7cf74de7-1aee-5173-d2d1-cc3364b63b26, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:7c41ed27-c963-9cfd-5b27-86a663ae74af, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:1f9040ac-5cd5-e2ab-5d5b-df6d4bd1265f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:340511ec-0dc9-6ba9-f60e-e86bf434cb10, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:15bd2f68-b39c-7d78-fb91-d409b64adcb5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:f9066765-1c44-95de-ac0c-efe1a4e2d397, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:04047a88-9ff2-b133-8be5-bf46d957ee0f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:1dd9262e-36a5-8a17-c15a-659b0245d241, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:815da774-0f60-3cd2-4be5-924a50b4233e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:b6c09285-d41b-bd83-eb3a-4f6b52ea78a0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:edc7b955-13c6-e8f7-036c-5b1f20801d95, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:cc9e1ee3-c1dc-461c-9650-66702f4d09cd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:b4aa16b7-5243-d5b2-575d-d5c4a1047466, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:8a535044-f931-f23a-5ecb-639fd242d33c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:dfce0734-a673-ad2b-6a66-af8b1391c3b6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** DFHBMSCA (uuid:0b43105b-5fd2-db92-2907-b51f290c775b, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:ff684ad5-5460-a485-b232-03dec754a97b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:46fccc8d-2266-4a1f-042f-2de00a3f7b21, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:46fb2d4a-c573-0671-403a-9d0b3d080cd6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:384b42b6-af4d-01e2-3af3-e9dab144f889, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:3a03ceb9-22f1-91fc-8cb4-04208999c64b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:d1a1de73-4200-fdc8-bc93-81efb4be09d0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:d9372d5c-628d-abb0-2e84-eb9b12f9e50d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:ae9a6f5d-5111-12a1-c274-e7a4b521350b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:336ab8ec-208d-32cb-96c3-f2dfa6266ff0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:77d907f1-c44d-4876-518e-37a5017b5981, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:6411fb9e-54ee-8e87-aa74-a6c286e3fa08, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:6cc05470-0964-93e7-6c31-f9e05e055e90, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:2a3cf8ba-f672-24a5-78cb-7907874da91b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:9273eae9-9c02-b9eb-d4fe-4a1886ca0c8e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:9548b44e-30ea-5782-e3b3-b996a9397f80, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:8abff3ac-9444-e239-f6c6-2e219634d8ad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:964057cb-e935-1eb1-1276-28e043c86443, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:65b2179a-805b-7fc4-89f1-d491275db6ca, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:5ff4ad55-4e93-b1dc-cd8d-2e8057752a2a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:892686af-35fc-b170-a3c4-257f1e7c2e03, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:866363ca-3345-f14b-2604-4dcf47324dd9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:eeb7c13c-27c4-b078-659c-29e5e886fadf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:e5adf4bc-1eca-7346-6679-915bd99b6051, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:adf67172-f3a1-6b72-c95d-e67d2bdd9335, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:3076a838-05d0-47d1-2c66-161ea6658fb1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:39157d16-0c0b-cb14-61c2-e6b76d07ffa3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:58d400df-4783-ef99-2441-56794722e2d8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:8bd383ae-3710-f3f6-9016-2c32d2eb19db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:5eee914b-fdf8-b87e-2737-9e308bac81d2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;


    // --- auto-generated stubs for undeclared references ---
    public Object eibcalen;  // auto-stub for undeclared reference

    /** MAIN-PARA  (uuid:cd0a0570-1880-3322-ef18-922023fe0463, source lines 494-533). */
    public void mainPara() {
        // SET ERR-FLG-OFF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsMessage = "";
        this.errmsgo = "";
        if (java.util.Objects.equals(this.eibcalen, 0)) {
            // TODO: translate body for: EIBCALEN = 0
        }
    }

    /** PROCESS-ENTER-KEY  (uuid:ed07f858-5965-5755-2928-4bd0f7dae9ed, source lines 538-583). */
    public void processEnterKey() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
    }

    /** RETURN-TO-PREV-SCREEN  (uuid:1a611602-654a-223c-c390-1f83ed596e81, source lines 588-601). */
    public void returnToPrevScreen() {
        if (java.util.Objects.equals(this.cdemoToProgram, "\u0000")) {
            // TODO: translate body for: CDEMO-TO-PROGRAM = LOW-VALUES OR SPACES
        }
        // MOVE WS-TRANID TO CDEMO-FROM-TRANID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO CDEMO-FROM-PROGRAM  -- identifier MOVE; needs PIC-aware type coercion
        this.cdemoPgmContext = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
    }

    /** SEND-USRADD-SCREEN  (uuid:005e5b8d-057a-ffe5-2537-e2134ccf49f4, source lines 607-619). */
    public void sendUsraddScreen() {
        this.populateHeaderInfo();  // PERFORM
        // MOVE WS-MESSAGE TO ERRMSGO OF COUSR1AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** RECEIVE-USRADD-SCREEN  (uuid:a3091177-8b01-5db9-a7f6-378435a77d65, source lines 624-632). */
    public void receiveUsraddScreen() {
        // TODO: implement receiveUsraddScreen.  See uuid:a3091177-8b01-5db9-a7f6-378435a77d65
    }

    /** POPULATE-HEADER-INFO  (uuid:e5a4c0d8-346b-e1e1-6d74-27f646db61cd, source lines 637-656). */
    public void populateHeaderInfo() {
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF COUSR1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF COUSR1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-TRANID TO TRNNAMEO OF COUSR1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO PGMNAMEO OF COUSR1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF COUSR1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF COUSR1AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** WRITE-USER-SEC-FILE  (uuid:d64e1949-ee0a-0d80-fa75-abd00b871185, source lines 661-697). */
    public void writeUserSecFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** CLEAR-CURRENT-SCREEN  (uuid:f67ca0cf-2427-be81-49a6-09d1f445aba3, source lines 702-705). */
    public void clearCurrentScreen() {
        this.initializeAllFields();  // PERFORM
        this.sendUsraddScreen();  // PERFORM
    }

    /** INITIALIZE-ALL-FIELDS  (uuid:d9c4631e-5007-516b-2276-9a67f18d3685, source lines 710-718). */
    public void initializeAllFields() {
        this.fnamel = -1;
        this.useridi = "";
        this.fnamei = "";
        this.lnamei = "";
        this.passwdi = "";
        this.usrtypei = "";
        this.wsMessage = "";
    }

    public static void main(String[] args) {
        new Cousr01c().mainPara();
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
