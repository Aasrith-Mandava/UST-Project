// Generated from COUSR02C.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COUSR02C.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * COUSR02C (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: COUSR02C.cbl
 */
public class Cousr02c {

    /** WS-VARIABLES (uuid:ba94e29e-e14c-71b4-00d7-6b4eec7a45b2, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsVariables;

    /** WS-PGMNAME (uuid:24db5569-77ad-73ee-a371-e727336de7f4, level 5, PIC X(08)). */
    public String wsPgmname;

    /** WS-TRANID (uuid:2f125528-00d6-078e-32af-ec780e6ec890, level 5, PIC X(04)). */
    public String wsTranid;

    /** WS-MESSAGE (uuid:b048b667-1398-4481-96ec-c9246eeb48f0, level 5, PIC X(80)). */
    public String wsMessage;

    /** WS-USRSEC-FILE (uuid:27f55229-ca27-8b2d-7546-c8bd8b1dc255, level 5, PIC X(08)). */
    public String wsUsrsecFile;

    /** WS-ERR-FLG (uuid:3b789c7b-13a7-3f49-e8c8-5af256035af4, level 5, PIC X(01)). */
    public String wsErrFlg;

    /** WS-RESP-CD (uuid:77562b15-5875-9469-dee6-e00bfc5470c5, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsRespCd;

    /** WS-REAS-CD (uuid:5d8151ef-a764-17c2-101c-d2fd8625ac9d, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsReasCd;

    /** WS-USR-MODIFIED (uuid:a48528fb-13fa-6c60-f359-d432e89c07ce, level 5, PIC X(01)). */
    public String wsUsrModified;

    /** CARDDEMO-COMMAREA (uuid:1c1f520a-8735-9a2f-74db-8289b52654d4, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:7c3daaf5-709b-5bd3-a693-2e2249d1937c, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:570b0b49-b0a9-5823-59e3-04e7d3064d9f, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:4cf3eeba-fbc4-87f9-d79d-15dc6f5f3a7d, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:6931435d-09f3-9f7a-0944-df32f67490ef, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:ce5cafb3-7607-9302-bbb0-678e741fa49a, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:899ac66e-3867-45a2-ba65-622945472bbd, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:4098b57e-07ab-b73c-7651-719d6e9ab1db, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:59dd463a-52fa-33be-42a4-155c2a98e31a, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:30843cad-5816-8f96-9ef6-cb36c4003632, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:00817d34-b623-2a58-1e51-285242952119, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:eace9f63-20e1-5466-fd89-1206f977bc89, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:e0e8e69e-30d0-910d-3027-d5dae2fc58c3, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:1648c69b-eb44-e9eb-90b6-e2764f1d1e21, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:3d35c989-b0c6-db68-d644-77ac7a326bb9, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:71d5d84e-cfdf-e2a0-361d-9e4675915c31, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:d30c8c33-67a0-63c8-ee22-e69d7d05e530, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:013eb519-d9d1-f387-e96e-5652f1fe3ece, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:2fa0edd0-70b4-f791-374d-ed252c538a01, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:bf86b63f-dc8e-9b37-8ce6-ceb9b5a78c5c, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:24827d2d-91a8-0e06-9446-7d423a87f5a4, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:7f1da3eb-36df-dbda-2fba-dbe569891ae3, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** CDEMO-CU02-INFO (uuid:fa259cf7-3ff0-a3bd-eaee-79f5652fee0f, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCu02Info;

    /** CDEMO-CU02-USRID-FIRST (uuid:ffb7c98b-f671-be26-18fc-8b2f1a6f90d9, level 10, PIC X(08).). */
    public String cdemoCu02UsridFirst;

    /** CDEMO-CU02-USRID-LAST (uuid:a1fe7aff-4e28-9e02-e934-d704bb1e8aa7, level 10, PIC X(08).). */
    public String cdemoCu02UsridLast;

    /** CDEMO-CU02-PAGE-NUM (uuid:86001ef5-dcf1-aae0-cb00-b64668d43253, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ cdemoCu02PageNum;

    /** CDEMO-CU02-NEXT-PAGE-FLG (uuid:4505133d-0737-e72e-ab38-8f888bf3b594, level 10, PIC X(01)). */
    public String cdemoCu02NextPageFlg;

    /** CDEMO-CU02-USR-SEL-FLG (uuid:2045c917-556a-4660-ba4b-3b486208dca6, level 10, PIC X(01).). */
    public String cdemoCu02UsrSelFlg;

    /** CDEMO-CU02-USR-SELECTED (uuid:286180fa-762e-0ecc-d04d-d9f2fdc5ebc4, level 10, PIC X(08).). */
    public String cdemoCu02UsrSelected;

    /** COUSR2AI (uuid:01dcdd0c-f761-7da3-ba6f-bf269dc8f232, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cousr2ai;

    /** TRNNAMEL (uuid:6968c4f4-39ea-fc12-6b9d-88acc3d5ec57, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamel;

    /** TRNNAMEF (uuid:0a9a8e72-c692-e0f7-58da-074780d7186f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamef;

    /** TRNNAMEA (uuid:f20c6f21-0e5b-bf31-beeb-2e2de6e6c422, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamea;

    /** TRNNAMEI (uuid:699358b0-1ca6-6053-984f-8819cfc1ae19, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamei;

    /** TITLE01L (uuid:8c97721c-656f-3c66-7b32-d996a57ec001, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01l;

    /** TITLE01F (uuid:817d4eb7-f83d-8f04-a7cf-975f56e82d4f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01f;

    /** TITLE01A (uuid:da0f8f6b-6e7e-7c0b-1b5c-b1a258bdd549, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01a;

    /** TITLE01I (uuid:b68c7532-e4d6-110b-9add-386e78e3be7f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01i;

    /** CURDATEL (uuid:a9003391-4b36-efec-db64-56d62d5819dd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatel;

    /** CURDATEF (uuid:d3a79208-4eb1-c3dc-fe6a-44a6c91e7554, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatef;

    /** CURDATEA (uuid:a6ada0e9-026c-683b-7e53-c40885ee303c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatea;

    /** CURDATEI (uuid:f040ca2b-5afb-b687-1834-5820f43e1a67, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatei;

    /** PGMNAMEL (uuid:631cdfb2-dc7a-8cee-2fca-8d2bfa3bc6d5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamel;

    /** PGMNAMEF (uuid:1276bb99-b246-9d09-f0df-3670657f85c8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamef;

    /** PGMNAMEA (uuid:4b2ef1d5-8142-accd-3208-9d9bcd493118, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamea;

    /** PGMNAMEI (uuid:0bd41699-5e56-01ff-b2dd-0aeb97396b7d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamei;

    /** TITLE02L (uuid:c5da927a-8006-f9ad-79f6-842b8fbb4355, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02l;

    /** TITLE02F (uuid:d7d9c9b3-e153-a89e-54a2-9411fa8840a6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02f;

    /** TITLE02A (uuid:bf3ee177-7cd5-94d7-3516-c392a9d71e65, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02a;

    /** TITLE02I (uuid:b53a3663-d603-30ed-918e-2d1ebb0ece9d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02i;

    /** CURTIMEL (uuid:94eb2cf0-4fa6-88dd-95ad-6772fc9df978, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimel;

    /** CURTIMEF (uuid:9b6aacef-fb53-eab6-61ea-92a503099811, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimef;

    /** CURTIMEA (uuid:48f92521-7bb2-a7f5-8a39-99cf65085cb5, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimea;

    /** CURTIMEI (uuid:445042a2-dd31-162d-f33a-bf838bcfcdc5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimei;

    /** USRIDINL (uuid:4bf4b2ca-df56-d6dc-d5b3-b4d54080e72f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinl;

    /** USRIDINF (uuid:2d1fa1ce-bcbf-46fc-01cb-a18e9df5f30b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinf;

    /** USRIDINA (uuid:ef0eeeb5-22be-a9f4-4e84-374ecf37df19, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridina;

    /** USRIDINI (uuid:0ef17ed7-d7f4-8e0e-b744-6897eef33ddd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridini;

    /** FNAMEL (uuid:d394416d-8035-5d47-276b-3f81d185b134, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamel;

    /** FNAMEF (uuid:aaa243f6-a53b-5ab9-1ef3-b46f1138356b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamef;

    /** FNAMEA (uuid:c1a7ef03-f160-e7ef-f1a9-1fa146e20b12, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamea;

    /** FNAMEI (uuid:06ae9f82-7d30-6e90-086a-603334fbb7d4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamei;

    /** LNAMEL (uuid:25c24e87-e7cb-39ab-247a-9d2bd9bfb09a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamel;

    /** LNAMEF (uuid:90b49e99-d1b4-6d4c-7215-e810553ac4b0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamef;

    /** LNAMEA (uuid:09800536-91a4-6462-7d6d-1530e47ecc87, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamea;

    /** LNAMEI (uuid:26e747ea-6fa5-4e58-eb71-362602e939c2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamei;

    /** PASSWDL (uuid:5cbb249e-a44d-53e4-4d04-b49d7896654e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdl;

    /** PASSWDF (uuid:6c1f066d-67b4-4505-d020-f2fcad45c433, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdf;

    /** PASSWDA (uuid:91013abd-5a15-c5ed-476a-7fda25d3be98, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwda;

    /** PASSWDI (uuid:fbda4104-51da-625b-abb8-a5ee7eaae5e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdi;

    /** USRTYPEL (uuid:460cabb9-0d92-2095-dd3f-adea004b3444, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypel;

    /** USRTYPEF (uuid:4bbd137b-fd4d-e2ed-2254-0f0616006e11, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypef;

    /** USRTYPEA (uuid:ecc41632-1d49-f380-f2dd-71628b48f87c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypea;

    /** USRTYPEI (uuid:709569c7-8190-6dc9-0e95-3775da973ff0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypei;

    /** ERRMSGL (uuid:d8c0ed05-dd24-09a3-00fb-ae0f1c3082d5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgl;

    /** ERRMSGF (uuid:b6a11af9-b809-c8cf-43c3-9700ce428476, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgf;

    /** ERRMSGA (uuid:84d01b93-f6f8-b7d2-f429-1d002e9a35c8, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsga;

    /** ERRMSGI (uuid:3493f52f-488c-73f1-3861-4b9f1004dce6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgi;

    /** COUSR2AO (uuid:44d88883-1879-0450-208b-1fee41f58f76, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cousr2ao;

    /** TRNNAMEC (uuid:b59cc8d0-b781-9743-83bc-ae77a2affa62, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamec;

    /** TRNNAMEP (uuid:61d604a1-9bee-3497-6ddb-8fe3c05e7a73, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamep;

    /** TRNNAMEH (uuid:64f04f24-3fc6-b90c-6003-8b9c9d782ec5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameh;

    /** TRNNAMEV (uuid:a659c9be-f259-7a0e-9cec-acb56bc1a0d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamev;

    /** TRNNAMEO (uuid:adaf555e-7c96-ac95-ea4a-e99c8941488a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameo;

    /** TITLE01C (uuid:18c8a73c-08f0-0823-bd5f-cf829b96bf72, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01c;

    /** TITLE01P (uuid:2d563957-07d7-471c-9582-82bdbacc0971, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01p;

    /** TITLE01H (uuid:fb75d5e0-cffc-1da5-1796-36750c99ca58, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01h;

    /** TITLE01V (uuid:631f9f67-d1b9-3bcd-8e76-430305665184, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01v;

    /** TITLE01O (uuid:f3812831-eaf4-f314-d387-c7fca1eb00af, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01o;

    /** CURDATEC (uuid:e9875375-c645-d615-45db-e13bc13f9afc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatec;

    /** CURDATEP (uuid:71122f87-5c2e-58c8-f9c7-28243bc6c401, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatep;

    /** CURDATEH (uuid:2b478aef-ca11-3c11-59fd-5f90d25ae68e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateh;

    /** CURDATEV (uuid:f130054d-3bc8-8b5d-b3ae-a6492fbbf86d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatev;

    /** CURDATEO (uuid:555ddddf-f4dc-d6e9-d7e1-b14e096cda3e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateo;

    /** PGMNAMEC (uuid:6a660a9e-4cbe-bd36-a0af-4784443180ec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamec;

    /** PGMNAMEP (uuid:cf23e0c7-23a3-1bce-e7d6-deb8cd91af5b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamep;

    /** PGMNAMEH (uuid:e70b055f-70de-167f-670d-5968b6be0658, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameh;

    /** PGMNAMEV (uuid:a243d316-fd82-c8d9-3609-488a9c59cd89, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamev;

    /** PGMNAMEO (uuid:1ba353d1-df7c-ccb9-174e-e5643bb5cc0b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameo;

    /** TITLE02C (uuid:ef883f32-a151-818d-c4f3-676684aa7e59, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02c;

    /** TITLE02P (uuid:96a9b5b8-c53b-41d0-420c-cbaaf9672292, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02p;

    /** TITLE02H (uuid:5a42f53c-d500-f4d8-97f6-a539cc0170ce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02h;

    /** TITLE02V (uuid:e545a140-c655-276a-c626-6d38edb11582, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02v;

    /** TITLE02O (uuid:cd46a892-a4f2-c3af-3134-3dd9f43f3d21, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02o;

    /** CURTIMEC (uuid:1faa7cea-7522-0a93-7a9d-299e50664795, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimec;

    /** CURTIMEP (uuid:8ba9918e-b9ab-8c72-4830-e5a4bdf6df14, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimep;

    /** CURTIMEH (uuid:6613c183-f5fb-7171-2907-7b892937f168, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeh;

    /** CURTIMEV (uuid:ed3c6664-2783-466b-b935-3788a5b882af, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimev;

    /** CURTIMEO (uuid:52fc6a8c-c7b8-1054-34b5-2ee45bfb2f99, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeo;

    /** USRIDINC (uuid:13f011e7-e097-b96b-f40a-c748743b1434, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinc;

    /** USRIDINP (uuid:02de76b0-3867-2298-8d1c-61f3e678deff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinp;

    /** USRIDINH (uuid:7bba8bd7-3c83-d6be-8cd9-e6e392bb25b9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinh;

    /** USRIDINV (uuid:3aacefc2-0e41-d96b-4dc4-3a6e141b22ee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinv;

    /** USRIDINO (uuid:95f6966c-92c5-6d2a-2328-32c0515befe4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridino;

    /** FNAMEC (uuid:1744e14a-5204-46ea-412d-955fe95e5a5c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamec;

    /** FNAMEP (uuid:5c2be81c-8e18-0e5a-e441-4a571d323d42, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamep;

    /** FNAMEH (uuid:8e5be0fe-1713-8005-5247-90c781ca1a60, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnameh;

    /** FNAMEV (uuid:6a836cd8-74d3-7cae-060d-9602cdc3dbc3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnamev;

    /** FNAMEO (uuid:fec244c3-81e5-e229-a4fa-e1d88eb529fa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fnameo;

    /** LNAMEC (uuid:918218fa-19e4-02e3-11b6-23077e9bf5b3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamec;

    /** LNAMEP (uuid:dea40e2f-5312-2df6-ccfd-8a3e5d02a0e9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamep;

    /** LNAMEH (uuid:9d5b3042-9894-d499-b383-34272981245d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnameh;

    /** LNAMEV (uuid:3e850206-ce42-6e6b-e72e-862103ce3beb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnamev;

    /** LNAMEO (uuid:36968ef3-0245-0b88-59f6-fb45fe994fe6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lnameo;

    /** PASSWDC (uuid:df85165b-5c9d-a297-2c33-350e34842b88, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdc;

    /** PASSWDP (uuid:1e4ba903-3fd1-8c09-7e13-e6ba6df5e81e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdp;

    /** PASSWDH (uuid:41be3368-0ce1-52d7-0350-1cfb1a923342, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdh;

    /** PASSWDV (uuid:371fb31f-5548-5719-404f-3e352dc584e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdv;

    /** PASSWDO (uuid:ca7921c8-a342-dfc9-b634-413e0874c5c2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdo;

    /** USRTYPEC (uuid:5c33ff66-7f33-e64e-86d7-ff3df828e7ee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypec;

    /** USRTYPEP (uuid:4b8df118-a626-b5c4-4a95-45cbe51b0975, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypep;

    /** USRTYPEH (uuid:f34d11aa-92d1-150f-6ce0-e98f82a5cac1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypeh;

    /** USRTYPEV (uuid:9293fa47-4df8-bfd8-cdb7-2927164021c6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypev;

    /** USRTYPEO (uuid:0fa71adc-1efa-5a0e-8689-161eb8bb6bbb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrtypeo;

    /** ERRMSGC (uuid:774af2af-04e6-3c0b-9a73-80991b22bd0a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgc;

    /** ERRMSGP (uuid:b8271291-757d-26c0-ea78-a8f8ef6d35cf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgp;

    /** ERRMSGH (uuid:4d2196e5-0c14-add8-4076-05397726ee53, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgh;

    /** ERRMSGV (uuid:0bee12f8-6d27-ef23-197b-584454d0edf4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgv;

    /** ERRMSGO (uuid:dc8f999e-7b24-3b3d-2f04-1f19cf4df34f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgo;

    /** CCDA-SCREEN-TITLE (uuid:c6d55880-ebd2-7e0a-dd22-53f558c05c94, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:b1b1d923-49e1-fcb6-ccb1-846ba1486e69, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:9c4544a3-c391-f770-0390-7d006b4a4929, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:3a171089-23d5-4d07-6396-a6ca48d58055, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** WS-DATE-TIME (uuid:ccce580c-d5c1-4c6d-9f0a-1e5e3da666a9, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:d3f77f13-2fa8-83d8-791f-8446120e10a4, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:a713d687-8c20-ba0d-8c94-d2565f75be25, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:ddaa1a93-15dc-a762-14fa-ff83200f0580, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:5d7e6be8-391c-5125-a80d-a3673e22be04, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:bee7d593-6c3d-24c9-a6f5-b70772e91651, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:f4fbb3cd-f5e2-98d0-30cc-5c36ee444451, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:b86dbd23-4efb-8c09-4f32-4fb10883053a, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:1a80ad72-91f6-0b7b-7d5b-6dcb09a89b1d, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:1ffdd7c7-d3b7-ee40-71e8-000cf7c8791e, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:0c3fc40f-cde5-b0c6-50e1-7ce6388d3f0b, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:914856a8-4a52-35c3-cc98-08c8f1af61b3, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:f05725d7-b249-0614-7cb7-f6053003870c, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:5a13064c-1eb4-ff30-8528-f50621f397ad, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:ef2e8310-5ab5-25d2-b3f4-2dbbb0ba328f, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:0c9d08f7-0e10-54c1-fac8-c298f4b90de1, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:c4069940-5be1-6941-215e-1a1c75caecda, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:288123b0-f525-c103-021f-f4e447628652, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:f78ab356-473f-f550-267d-00899dafc169, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:45f9f633-49f2-387f-3b34-416b926e3356, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:23909e1f-7a74-6dcf-e850-b3aab408e9f8, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:55c403b2-2443-0a8c-724c-1a5f620aa8a3, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:0d16e037-66c8-470c-d074-c12d53fad2f1, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:724629ef-9791-e347-b855-3f9a5ed20085, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:9a63d5ca-46fd-4b4f-f73d-a3417e0f4ac1, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:9f5c6f2e-178a-035d-70f9-a1ec98ce3c94, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:3526b5e9-fa43-17d7-26b5-1a1fbd87b35b, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:b06dc14f-5693-ecb1-5d18-9c7e2007c7ea, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:ed84317a-e7ff-5e6a-a970-7f1f8cd7b91c, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:80eae5fb-96f7-5183-51e1-afdfad465143, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:9d946023-c964-0085-6c7e-689dd28cdb1d, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:b117b49f-7c3b-c92b-2084-53e8589dd722, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** SEC-USER-DATA (uuid:95a8545f-e0ac-0083-25fd-953980c41d1c, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ secUserData;

    /** SEC-USR-ID (uuid:a12c919a-2da9-729e-0960-35b6637f3fa5, level 5, PIC X(08).). */
    public String secUsrId;

    /** SEC-USR-FNAME (uuid:02bf5ed2-7713-4735-542a-b7c9da1c4799, level 5, PIC X(20).). */
    public String secUsrFname;

    /** SEC-USR-LNAME (uuid:57d86e02-546f-f14a-63b2-e9f0e73ed982, level 5, PIC X(20).). */
    public String secUsrLname;

    /** SEC-USR-PWD (uuid:e34170de-7239-e9e9-cb80-37a5955bf1d1, level 5, PIC X(08).). */
    public String secUsrPwd;

    /** SEC-USR-TYPE (uuid:bd7fa38f-bc9f-6ca1-e5a5-6326b5bd9c3c, level 5, PIC X(01).). */
    public String secUsrType;

    /** SEC-USR-FILLER (uuid:25894817-5eda-c78d-52f3-6d02557d15c3, level 5, PIC X(23).). */
    public String secUsrFiller;

    /** DFHAID (uuid:eaef3456-4139-4677-49c6-45202edc9abe, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:b6a2f910-c107-4449-62b8-a165fea5dc28, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:668fe797-0608-4767-7ec9-50a2aa012147, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:939350bf-99d0-18e3-4ddf-6fc28f64a9d8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:5bf7e7c4-84ff-a17b-9b74-d4c85b7972da, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:2effdbf6-6abd-e978-c320-d9aa6958f0a0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:b275b849-efb3-0583-4981-e763b3ba8849, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:de309e24-e583-7996-3cc5-f4ab9b7c9310, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:a5b673d4-3b9f-b389-4fc6-7f8c734afcbc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:1b73b798-cd24-9d93-2437-126a4b38a680, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:6b488e12-34b2-c085-46f2-fc58bb8fbcef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:d11804b1-3b40-57fe-e0d7-fe7b40e38683, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:8c441e68-91d2-3623-9a39-6aee37b9f379, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:550268b8-ca62-b4fd-3367-7febaea0f84c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:5f72261e-92b8-3269-9f9a-4f1cce73049b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:1422b263-2c5a-1717-6a5e-a1c2e57c6b1f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:77fda9b3-ea24-c20e-607e-fd46d24588e9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:1310ce9d-1b40-8cda-1de5-acde50b5f3a7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:80ffbc7b-da7d-ea04-56a2-649ea3964ece, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:104d93e4-5463-671a-dc9d-7f2e3d7b76bc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:c7d5a588-39ed-e0d6-1641-2bbb3fbc9d65, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:8e2380b5-792a-556b-6b60-137ec40b7d70, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:ca19812e-0402-1cde-fdc6-8b5faa4de15d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:a10350da-eaf8-18b7-4523-9fb71b7c020b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:ac5f6367-a1a7-2e77-1fd4-f804e08beeb4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:da9e50b9-f026-3b14-31b2-abe0cc9fcbce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:20c1fafa-ab81-28c8-2da4-ca21b147ec1d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:50f698fb-5c59-8361-a67d-19ce7e36d8b9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:4dd3c006-3d9f-0738-06c8-4619e7cf06fb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:f570b1c9-4dc4-0220-3637-71acef2219f4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:4cde3bc2-6251-dd72-2a57-f2dabbf89b70, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:e645a935-1731-8e29-a59d-9dc09507d490, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:8bec4858-78a5-4dae-3a34-8eedf9bb4b82, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:9523f301-4497-37ac-6421-a837a772a8a5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:8cc01c04-e9ef-3f92-2715-2ea3a425150c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:d62fc5b9-2a59-e882-96b1-5d1106422ea4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:b3de8010-dd57-c6ef-de21-ab83d8c4103d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** DFHBMSCA (uuid:bc6e9ca3-2f0a-5b9d-5a1d-b166c56b27fb, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:7f64b356-a2fc-dd59-d230-b3ee157ce7b5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:a6dcff11-76f2-5c74-f7f2-6cd487f0c3c1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:419488e6-944e-d7f7-591c-18dbe6099204, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:d55348a6-48da-8922-082e-c4d08cd389dd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:1aed45db-fe18-c7ac-d8a8-87376918a344, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:c37f830f-d6b9-cfb7-db45-d0dca0750bb9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:28e606a8-16a0-4adc-ef9e-5602927000f9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:689a2644-8387-4d84-e4f8-119f290cc24f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:a11328e0-9c77-7d7c-01c3-2d1fe7385cad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:7d7f055d-e783-02e4-8b42-a66464eaffc1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:f1e5dfa4-c4eb-0c76-8f27-0063fb1dae99, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:cd1f149f-1346-da04-17ff-17d4264497f1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:9f2b9676-404c-928b-63b3-7d44fc3acec0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:42bc01f3-f370-660e-3305-bae730ebec15, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:5bf67a7f-c965-6aec-890f-d9a5cd86b55b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:375371a6-5a16-5437-3d98-5141051eb7da, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:12f3b3cc-f881-da4f-dcba-d21faa13292b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:ef078640-01cb-1583-7240-baf123555971, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:d75bc834-a704-adee-0e93-2c72b27fa38e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:429ce34a-6986-ee1d-42e2-069097cbaa26, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:758e4236-2f92-ebba-1340-7fc13479bd07, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:3e2950f1-8699-d681-013f-dda08dc24d0b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:70cfa9be-b8a0-699d-a388-43d26316a798, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:5c18bf04-9f7d-338d-4101-04f31a4b1646, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:7f989588-7fc7-2d16-5c03-192c2e385af3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:f892f626-9015-aaa3-5c9f-2d1125650428, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:f54fcd2b-25d9-188b-c298-5e0e6b880a05, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:b124065f-814e-7277-de59-869a8872b089, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:6d48e4fa-68ca-56c0-1c7d-5d11fd24027c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;


    // --- auto-generated stubs for undeclared references ---
    public Object eibcalen;  // auto-stub for undeclared reference

    /** MAIN-PARA  (uuid:ebc69f50-2c67-aa98-259f-0cd8b9f735f8, source lines 505-561). */
    public void mainPara() {
        // SET ERR-FLG-OFF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET USR-MODIFIED-NO TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsMessage = "";
        this.errmsgo = "";
        if (java.util.Objects.equals(this.eibcalen, 0)) {
            // TODO: translate body for: EIBCALEN = 0
        }
    }

    /** PROCESS-ENTER-KEY  (uuid:0156fb4b-4976-c231-c0be-daef4f74da1a, source lines 566-595). */
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

    /** UPDATE-USER-INFO  (uuid:39acb49e-78a6-715c-d64f-ebd40d614030, source lines 600-668). */
    public void updateUserInfo() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
    }

    /** RETURN-TO-PREV-SCREEN  (uuid:b733ac94-8daf-d448-e537-2ff2c5aa8e5d, source lines 673-684). */
    public void returnToPrevScreen() {
        if (java.util.Objects.equals(this.cdemoToProgram, "\u0000")) {
            // TODO: translate body for: CDEMO-TO-PROGRAM = LOW-VALUES OR SPACES
        }
        // MOVE WS-TRANID TO CDEMO-FROM-TRANID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO CDEMO-FROM-PROGRAM  -- identifier MOVE; needs PIC-aware type coercion
        this.cdemoPgmContext = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
    }

    /** SEND-USRUPD-SCREEN  (uuid:eba238b0-4b43-7f47-b929-9eeb3f2767a5, source lines 689-701). */
    public void sendUsrupdScreen() {
        this.populateHeaderInfo();  // PERFORM
        // MOVE WS-MESSAGE TO ERRMSGO OF COUSR2AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** RECEIVE-USRUPD-SCREEN  (uuid:cd1277c9-0616-bc72-09c0-818883fce79a, source lines 706-714). */
    public void receiveUsrupdScreen() {
        // TODO: implement receiveUsrupdScreen.  See uuid:cd1277c9-0616-bc72-09c0-818883fce79a
    }

    /** POPULATE-HEADER-INFO  (uuid:8c22b4e3-0a67-fd86-7c68-6d4a6dc32274, source lines 719-738). */
    public void populateHeaderInfo() {
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF COUSR2AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF COUSR2AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-TRANID TO TRNNAMEO OF COUSR2AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO PGMNAMEO OF COUSR2AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF COUSR2AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF COUSR2AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** READ-USER-SEC-FILE  (uuid:6b8fdf74-e70e-b957-3692-10a1d180796c, source lines 743-776). */
    public void readUserSecFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** UPDATE-USER-SEC-FILE  (uuid:164aed43-01df-5e41-dec2-587bae0f50a5, source lines 781-813). */
    public void updateUserSecFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** CLEAR-CURRENT-SCREEN  (uuid:354dc7da-b4ef-7696-4f45-137e893d5a6a, source lines 818-821). */
    public void clearCurrentScreen() {
        this.initializeAllFields();  // PERFORM
        this.sendUsrupdScreen();  // PERFORM
    }

    /** INITIALIZE-ALL-FIELDS  (uuid:00cd4e12-d651-2bef-c4af-de69294ca9d1, source lines 826-834). */
    public void initializeAllFields() {
        this.usridinl = -1;
        this.usridini = "";
        this.fnamei = "";
        this.lnamei = "";
        this.passwdi = "";
        this.usrtypei = "";
        this.wsMessage = "";
    }

    public static void main(String[] args) {
        new Cousr02c().mainPara();
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
