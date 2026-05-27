// Generated from COTRN01C.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COTRN01C.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * COTRN01C (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: COTRN01C.cbl
 */
public class Cotrn01c {

    /** WS-VARIABLES (uuid:5e292039-c511-b666-1e6e-d4a3e07d1c93, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsVariables;

    /** WS-PGMNAME (uuid:c6e97ce5-cb53-c231-fb25-914feed00f4d, level 5, PIC X(08)). */
    public String wsPgmname;

    /** WS-TRANID (uuid:51387c4c-104d-0adb-875c-e0dcba0c71c2, level 5, PIC X(04)). */
    public String wsTranid;

    /** WS-MESSAGE (uuid:6be2a229-e6bf-2a36-af77-e4849cb39bb6, level 5, PIC X(80)). */
    public String wsMessage;

    /** WS-TRANSACT-FILE (uuid:77986dc8-d9e7-4990-4117-dc1c6a8dc9a5, level 5, PIC X(08)). */
    public String wsTransactFile;

    /** WS-ERR-FLG (uuid:eb94d979-7ac2-fea6-63ff-344dbbba9117, level 5, PIC X(01)). */
    public String wsErrFlg;

    /** WS-RESP-CD (uuid:5e184beb-04a6-d850-faf1-b9ea56372573, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsRespCd;

    /** WS-REAS-CD (uuid:5ca4312e-286f-6a27-7e0b-bbcc6c3717d0, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsReasCd;

    /** WS-USR-MODIFIED (uuid:0f80391d-751b-d185-01db-906b0e79cebd, level 5, PIC X(01)). */
    public String wsUsrModified;

    /** WS-TRAN-AMT (uuid:9d06955a-d95f-bb4b-c248-8d9f4c0c018d, level 5, PIC +99999999.99.). */
    public long /* PIC +99999999.99. */ wsTranAmt;

    /** WS-TRAN-DATE (uuid:be545877-fc3e-1e96-1abb-48c36ffab445, level 5, PIC X(08)). */
    public String wsTranDate;

    /** CARDDEMO-COMMAREA (uuid:51239ef6-e124-148c-d1e9-c514863aade8, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:474ddccb-500f-e51a-3a97-c6fbdae0dfbf, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:78a6b7a8-b79d-9120-599e-e859134527c4, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:4f45b3e2-3291-3ea4-6ed9-ee88914b1fbc, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:0710c986-6eb0-28da-4c0a-18565a36c9ec, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:a46e222e-1935-d533-728b-c1a29a3acf71, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:b7548da3-314c-7131-1da0-99cd19ef8779, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:8f30b158-7e94-564b-40bc-677d61be0ba6, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:8a7475b5-0e0f-977e-15cb-bf867534c42a, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:93baff00-9dc6-c578-3ac8-817d381c78c8, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:a42b226b-5ce4-fb6e-ef78-c898a95a1b69, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:14adc878-cc06-84d5-09e5-0086ee51feed, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:3ed5731f-d55e-7286-f230-7fb19e098db0, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:0009d11c-9aad-262e-edbb-1231cb404c09, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:c51af7c3-6642-6024-8fb5-4c3c53645d9d, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:023bcfa5-6792-e48b-739b-f200a13d1102, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:54e4f628-a1b8-5a0e-90fe-03c6c4626932, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:189cd0b4-3431-bc23-d692-37bcb97d4a4c, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:14bbb8bd-79fa-dc17-947e-b0cf824fe60a, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:94c1e02b-674c-4e8e-702a-03bf67ecd50f, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:c8750dd5-d622-4b32-193a-e0b9da74e286, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:ed0158db-0993-a0c6-0c61-66b64cd047e9, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** CDEMO-CT01-INFO (uuid:29484eab-9784-c344-4af2-30c79f1c79ee, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCt01Info;

    /** CDEMO-CT01-TRNID-FIRST (uuid:597cd81f-bb4b-d825-b1fb-a96406538f61, level 10, PIC X(16).). */
    public String cdemoCt01TrnidFirst;

    /** CDEMO-CT01-TRNID-LAST (uuid:0a96ab42-6f67-6d00-bfc0-69eb3654a4ab, level 10, PIC X(16).). */
    public String cdemoCt01TrnidLast;

    /** CDEMO-CT01-PAGE-NUM (uuid:ad4605b6-88c9-702d-1d42-06bbe8820411, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ cdemoCt01PageNum;

    /** CDEMO-CT01-NEXT-PAGE-FLG (uuid:04e06de6-f1f6-80dc-b80d-b54d519471b2, level 10, PIC X(01)). */
    public String cdemoCt01NextPageFlg;

    /** CDEMO-CT01-TRN-SEL-FLG (uuid:5b031a0a-7c88-c2e0-b1df-d8f5e12af47e, level 10, PIC X(01).). */
    public String cdemoCt01TrnSelFlg;

    /** CDEMO-CT01-TRN-SELECTED (uuid:226edc95-e4ba-0e3b-6b89-c6f994c01e05, level 10, PIC X(16).). */
    public String cdemoCt01TrnSelected;

    /** COTRN1AI (uuid:52cce10c-aee5-de8f-526e-d9914d4c10cf, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cotrn1ai;

    /** TRNNAMEL (uuid:47e21349-c36e-b02f-9994-b959cb432df3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamel;

    /** TRNNAMEF (uuid:7cb87c8d-4f2c-7e67-308d-4fda77eb0cb6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamef;

    /** TRNNAMEA (uuid:d7fdcf0a-9f23-ad38-52df-508bd69b479f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamea;

    /** TRNNAMEI (uuid:fffe997d-35e7-4309-45d1-d13b935bb0ab, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamei;

    /** TITLE01L (uuid:e0bb6b84-f314-1315-6f35-f87dd1baca63, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01l;

    /** TITLE01F (uuid:eb46b222-2318-4e9e-bdf7-d3bbdc266f05, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01f;

    /** TITLE01A (uuid:afd82135-07a8-0da2-1f04-aef90c4edf22, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01a;

    /** TITLE01I (uuid:aac6499f-5cad-458d-8710-4e594526130d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01i;

    /** CURDATEL (uuid:397963e6-2431-c3e6-070c-76d7779aa96f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatel;

    /** CURDATEF (uuid:e7817bd8-2cac-32db-ce40-539ffdf95254, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatef;

    /** CURDATEA (uuid:39d44242-c131-514f-85aa-e9b484b95472, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatea;

    /** CURDATEI (uuid:6bbd865e-5772-ba58-da34-86155748514f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatei;

    /** PGMNAMEL (uuid:88519a9b-e65d-9f30-f8e9-4fe86aa575ac, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamel;

    /** PGMNAMEF (uuid:ded58e3f-3717-630e-9ca5-7d85d3b64f7d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamef;

    /** PGMNAMEA (uuid:a36fa6ce-9ec6-e3d2-8293-ef5889a4a779, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamea;

    /** PGMNAMEI (uuid:76031b84-9599-dc39-ee36-e8038ebd77c6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamei;

    /** TITLE02L (uuid:8542f900-e2db-e34d-d1fd-9679f5ccaf47, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02l;

    /** TITLE02F (uuid:f2dd739d-dea8-b342-c9dc-5a556849c79a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02f;

    /** TITLE02A (uuid:6fc29774-bd03-78a3-34f9-da2d27389ef3, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02a;

    /** TITLE02I (uuid:e437e88d-e407-21d7-526d-a84ca581e7fd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02i;

    /** CURTIMEL (uuid:37bf60f6-8f66-7023-7c5e-e1829632519b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimel;

    /** CURTIMEF (uuid:05041d85-bc9a-e8f5-21ba-53a18115dbb7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimef;

    /** CURTIMEA (uuid:52487657-d3ae-6b8e-9590-18c4f291b690, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimea;

    /** CURTIMEI (uuid:e7ef2198-7db9-3240-62be-1c7e2b7a44ae, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimei;

    /** TRNIDINL (uuid:9070c894-ed04-b8e2-2fb8-fa6d539af7d9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidinl;

    /** TRNIDINF (uuid:d3a52c2d-f646-a4b7-2f22-7a6a3858ca15, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidinf;

    /** TRNIDINA (uuid:7a1e4b21-6b97-43fe-e0a5-8a2f405c802c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidina;

    /** TRNIDINI (uuid:b957c01f-f84e-16ce-851e-c0a212f07173, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidini;

    /** TRNIDL (uuid:2cd2ca7d-8f75-9156-356f-4db04a83807b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidl;

    /** TRNIDF (uuid:af4bbbc0-d5d6-6465-b4eb-a8acc1694ae3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidf;

    /** TRNIDA (uuid:eb2c8728-cb36-3663-10ae-148d940afefd, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnida;

    /** TRNIDI (uuid:033f5002-c978-dcce-4bf4-cdc2cf516ae3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidi;

    /** CARDNUML (uuid:534cb3f4-813b-ec91-63dc-f2e0d457c480, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardnuml;

    /** CARDNUMF (uuid:39b53ea1-851e-aa3b-6261-8b7256fa1138, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardnumf;

    /** CARDNUMA (uuid:473225c5-327c-c2ee-a29d-a9d21ff69476, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardnuma;

    /** CARDNUMI (uuid:44d5f94a-da42-9d45-3970-ba2a52604311, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardnumi;

    /** TTYPCDL (uuid:58609360-f49e-1c17-1cd6-47eacf51dfa3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcdl;

    /** TTYPCDF (uuid:fcd5b05e-5e30-ff3a-edea-b979d6d94687, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcdf;

    /** TTYPCDA (uuid:f66b2586-865b-0e3d-f288-d38c6eb72032, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcda;

    /** TTYPCDI (uuid:8e0f16b5-45d4-37d1-4c1a-e55d4a90e490, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcdi;

    /** TCATCDL (uuid:cbfff04f-20a9-9f45-3848-6f0493376133, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcdl;

    /** TCATCDF (uuid:11ed350c-a475-22ae-271c-fa81ad6cc811, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcdf;

    /** TCATCDA (uuid:722adeee-3977-8be3-3f6a-5667940b8876, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcda;

    /** TCATCDI (uuid:6789d17d-585b-ee34-fd1a-6f4561159daa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcdi;

    /** TRNSRCL (uuid:bdea9270-5549-7e5e-3ded-62f13195f415, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrcl;

    /** TRNSRCF (uuid:7325fe39-a534-39ad-1c3a-8ffa256c4565, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrcf;

    /** TRNSRCA (uuid:790f96b7-89c2-3186-994f-0dff091e6117, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrca;

    /** TRNSRCI (uuid:578aabdd-cc2a-0b26-9c75-fea471d91410, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrci;

    /** TDESCL (uuid:f13500ad-6413-711b-9a8f-1a6812c3be9f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdescl;

    /** TDESCF (uuid:32bb86f8-669f-1fb6-e77d-34887a0dd1d8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdescf;

    /** TDESCA (uuid:66157d4b-3688-35cb-5265-c18cbbfbfdc7, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesca;

    /** TDESCI (uuid:f93ef4c9-0826-5a11-87f4-6ec0154ecd67, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesci;

    /** TRNAMTL (uuid:9554a523-0c94-634b-f352-f66eb05dc4d6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamtl;

    /** TRNAMTF (uuid:992d2aaa-42e9-9369-8a25-fd384bcbaf4f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamtf;

    /** TRNAMTA (uuid:82f1acbd-8f26-17cd-a936-e17fa090a6f3, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamta;

    /** TRNAMTI (uuid:6a0ea742-376d-cb0d-c99c-0a1c019b795c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamti;

    /** TORIGDTL (uuid:d8af4fd5-0c90-3c29-55d3-3262295c3f57, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdtl;

    /** TORIGDTF (uuid:1578ab77-123d-4bee-f5ac-9c77f54c6a86, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdtf;

    /** TORIGDTA (uuid:4784431c-cf22-53c6-ae20-3a1ed78b672f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdta;

    /** TORIGDTI (uuid:2c0312ad-91b2-51d8-8eb3-02437c31b830, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdti;

    /** TPROCDTL (uuid:a1f8dc97-f5e0-3398-361b-16906a539345, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdtl;

    /** TPROCDTF (uuid:844ed2a0-77bd-d58d-ae88-6ab06a1be0c2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdtf;

    /** TPROCDTA (uuid:b6cc6bdb-f6f9-8064-c749-bdb5df9dea89, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdta;

    /** TPROCDTI (uuid:c11cbeb5-3677-8ca4-b643-77b23caabb6d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdti;

    /** MIDL (uuid:8fc7d4c8-b786-3cb4-da88-26e96a1a3681, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ midl;

    /** MIDF (uuid:d5cb6645-5f18-bb03-0f92-a5908a8975d2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ midf;

    /** MIDA (uuid:3a448a7f-ce37-a98c-daca-2c100c2e2fd4, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mida;

    /** MIDI (uuid:de45a9c7-52b3-68d6-6be0-a881e16bdf4d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ midi;

    /** MNAMEL (uuid:1381aaad-7c1d-980d-5530-bab0bd993ea3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnamel;

    /** MNAMEF (uuid:9504351c-cd88-3b81-3a36-0c4f7028377c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnamef;

    /** MNAMEA (uuid:f8748e26-2bfa-bdd3-eb91-d6caea815c0c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnamea;

    /** MNAMEI (uuid:9651814b-7e60-0f5c-31a2-5bac39dee31c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnamei;

    /** MCITYL (uuid:d1486b0a-d1a5-5d58-bc08-cd52d5a98058, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcityl;

    /** MCITYF (uuid:6f50c69a-62ec-5028-9e39-74179812eed6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcityf;

    /** MCITYA (uuid:9cad24b9-ca60-d5b1-66f6-0639fc547773, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcitya;

    /** MCITYI (uuid:90358bc1-937c-0682-89e0-ab22badf3481, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcityi;

    /** MZIPL (uuid:0da95801-d317-93b2-a8a1-8343a229be33, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mzipl;

    /** MZIPF (uuid:1878278c-cc86-f6a6-b667-da32fa62ece0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mzipf;

    /** MZIPA (uuid:b02f1f7c-42e4-ecc9-c513-6bab3b333166, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mzipa;

    /** MZIPI (uuid:4a94ecb7-1bd7-ee94-1288-526908006d09, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mzipi;

    /** ERRMSGL (uuid:4e59cf4f-0fee-c727-76a1-43f1127f9bb2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgl;

    /** ERRMSGF (uuid:ce8d98d8-8a00-fdfe-6fb2-a171f43b6222, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgf;

    /** ERRMSGA (uuid:f828e506-55a9-72d7-decf-dff66362523a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsga;

    /** ERRMSGI (uuid:9b583acf-52cc-a47d-57cd-bb7fc8579546, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgi;

    /** COTRN1AO (uuid:4a979ebd-cfe4-a72f-815f-a02af22853fc, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cotrn1ao;

    /** TRNNAMEC (uuid:87b92f87-54b0-623c-1b41-13b2c629bc64, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamec;

    /** TRNNAMEP (uuid:9c8106a5-f107-8a87-03c3-d2ed85e2df2a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamep;

    /** TRNNAMEH (uuid:49d72a97-7735-2169-3cd3-6da02d4f493c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameh;

    /** TRNNAMEV (uuid:65d80176-af47-bbbd-1ba0-51b8efe76210, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamev;

    /** TRNNAMEO (uuid:e0d0b58c-8619-5987-51aa-bff1e14bc60a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameo;

    /** TITLE01C (uuid:ad125bef-c351-1f01-8568-063ffb83f0ca, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01c;

    /** TITLE01P (uuid:823ec3c3-99b2-dba7-b737-00f0c40064d6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01p;

    /** TITLE01H (uuid:7d797e22-7bdf-4c20-1264-2403b4b1484e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01h;

    /** TITLE01V (uuid:2933b4a6-8f05-0000-38a6-0ee7086c5988, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01v;

    /** TITLE01O (uuid:6df516aa-9359-3e76-ee72-ed34694437ee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01o;

    /** CURDATEC (uuid:e0e29051-057c-1a09-c4d8-07043c633aee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatec;

    /** CURDATEP (uuid:0d211d26-e8b8-e63e-e68a-416745ae6165, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatep;

    /** CURDATEH (uuid:f0e1bb42-2218-115e-1728-5d17eecd9d73, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateh;

    /** CURDATEV (uuid:c6b53592-a0ad-c7c4-0e01-add9042f0fb9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatev;

    /** CURDATEO (uuid:5b4b1de9-343d-f8b6-74f3-6363eb207da2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateo;

    /** PGMNAMEC (uuid:690552e8-c46a-0989-28aa-325a5c03a36d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamec;

    /** PGMNAMEP (uuid:826d36fa-045a-2701-65c8-4bcee5306390, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamep;

    /** PGMNAMEH (uuid:f0c82914-abb6-f076-0742-2ada992c48ee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameh;

    /** PGMNAMEV (uuid:ca6f7fcd-5f39-c2ef-825b-3b52925d8cbf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamev;

    /** PGMNAMEO (uuid:caf39b5b-4500-08d7-2679-58ecfdf9562d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameo;

    /** TITLE02C (uuid:ace0e8e2-ebd7-d989-3b11-20cf16508532, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02c;

    /** TITLE02P (uuid:133e6149-148c-f076-2fa9-f94b36852f5f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02p;

    /** TITLE02H (uuid:64601e46-af08-c0fd-26c1-2d66f659263d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02h;

    /** TITLE02V (uuid:802d8d0c-4409-af39-f267-f985d9a9c129, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02v;

    /** TITLE02O (uuid:cbeeec57-adce-f3a4-65bd-6f3e577828c5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02o;

    /** CURTIMEC (uuid:13650dca-d016-0ac4-2ac2-ba45f273f4da, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimec;

    /** CURTIMEP (uuid:46b07f5e-c2f0-271a-442e-00850fe0c69c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimep;

    /** CURTIMEH (uuid:d55c775b-8453-c158-beda-df5cdc1761fa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeh;

    /** CURTIMEV (uuid:a4615182-51cf-e616-af5a-94de66eb74d8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimev;

    /** CURTIMEO (uuid:3a71987f-3431-7ef3-1af4-3f9fa569f446, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeo;

    /** TRNIDINC (uuid:0df6c18c-d802-3d8b-b426-04b9f914e3cd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidinc;

    /** TRNIDINP (uuid:d498abc3-afef-82f8-d9a7-5c145e091f59, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidinp;

    /** TRNIDINH (uuid:23e17de2-5867-c06e-a55f-060e43bd29f4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidinh;

    /** TRNIDINV (uuid:c87fe5b0-86b5-1e34-9c2c-623c7fa83d49, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidinv;

    /** TRNIDINO (uuid:d81aa657-ceed-443e-cd7f-cce7fae89339, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidino;

    /** TRNIDC (uuid:5dfbd017-9bc6-00dc-2164-d73c877f1f0d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidc;

    /** TRNIDP (uuid:9ac079db-0ab9-cd8e-5e84-578fca2c850f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidp;

    /** TRNIDH (uuid:47316f31-7bea-3698-6232-78441a759510, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidh;

    /** TRNIDV (uuid:374383ca-4dcb-fe95-e322-5556d9408666, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnidv;

    /** TRNIDO (uuid:de56a2d3-d46e-7cf1-f604-d44d8a80f057, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnido;

    /** CARDNUMC (uuid:4a03464b-44b6-d019-3bcb-4c69941b721a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardnumc;

    /** CARDNUMP (uuid:03e6a2ae-bbb4-d93c-7ea0-ff39d36ad924, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardnump;

    /** CARDNUMH (uuid:5088f91f-2b68-7dea-2001-deaee2c44c45, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardnumh;

    /** CARDNUMV (uuid:37d4ffe2-54be-b062-74f0-efe3367b3956, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardnumv;

    /** CARDNUMO (uuid:23cbcf0e-0695-f4c6-6e24-16b198aa9d66, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardnumo;

    /** TTYPCDC (uuid:652f3f17-faac-15fc-5bdd-c039ec005a6c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcdc;

    /** TTYPCDP (uuid:866d6035-c595-c282-f8e0-29f390f29bf2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcdp;

    /** TTYPCDH (uuid:4448d89c-77cc-7699-fbd4-5a743282d2dd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcdh;

    /** TTYPCDV (uuid:6997da41-1649-13be-a9b7-709181565f04, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcdv;

    /** TTYPCDO (uuid:5a73cc0a-c509-5703-b251-bbbcc2b5ffac, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypcdo;

    /** TCATCDC (uuid:f2c3aba4-782a-efe6-5f4a-def1577c7452, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcdc;

    /** TCATCDP (uuid:cd000292-42f9-cb33-8b09-d226a0742a80, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcdp;

    /** TCATCDH (uuid:c8040483-07fc-e713-f180-14f42ea05db5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcdh;

    /** TCATCDV (uuid:938cf15b-de66-1dc8-b1a4-ebaf47b7e04e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcdv;

    /** TCATCDO (uuid:9868a52b-5d29-05fe-4eb8-632bf64d2c35, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tcatcdo;

    /** TRNSRCC (uuid:66f6b0a2-9d4a-9d04-97e0-52ddf58f95ec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrcc;

    /** TRNSRCP (uuid:044cfd85-75f1-a959-7d0b-8fe876b8801d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrcp;

    /** TRNSRCH (uuid:9e9c575b-bb16-295d-5f9c-d6bdb56c9b56, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrch;

    /** TRNSRCV (uuid:232101e6-6062-2b01-467d-e503971123ab, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrcv;

    /** TRNSRCO (uuid:8e189298-eaf0-07ea-7684-1242246ee538, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnsrco;

    /** TDESCC (uuid:ce299b68-8324-9bf2-1d3e-19d853c2579b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdescc;

    /** TDESCP (uuid:de380483-9790-3b25-884d-761f766919b9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdescp;

    /** TDESCH (uuid:6d57b58b-0763-7100-37d7-06002a58109d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesch;

    /** TDESCV (uuid:44d595ef-e5ea-27cb-f1b2-4983d3f29a4d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdescv;

    /** TDESCO (uuid:36bd0b60-fe6a-f0d7-6986-0bfc0f36054f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tdesco;

    /** TRNAMTC (uuid:8eb8226e-c0f0-bbde-ec57-19d4215a07e9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamtc;

    /** TRNAMTP (uuid:ee4e2cf9-7eb8-acf5-e2cb-4673e74deb58, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamtp;

    /** TRNAMTH (uuid:17b9ff26-b102-6cf3-1aee-04049d0d3a57, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamth;

    /** TRNAMTV (uuid:0bdf0a1f-9584-2abd-4957-01d1555bf6c4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamtv;

    /** TRNAMTO (uuid:bdeff6e0-2a4f-b767-2aec-f20dd4740cbf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnamto;

    /** TORIGDTC (uuid:1cda9d8b-0837-0b69-64ab-a9206901c06f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdtc;

    /** TORIGDTP (uuid:3dd1f870-96f8-da9c-b7e3-979618e739b7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdtp;

    /** TORIGDTH (uuid:456da12d-7bd4-a32f-2376-6e02d3053750, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdth;

    /** TORIGDTV (uuid:d21cccff-fbc3-78e6-bd91-0c67751339c4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdtv;

    /** TORIGDTO (uuid:605c53c2-9e79-23fe-0c05-9306688c241c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ torigdto;

    /** TPROCDTC (uuid:1a847685-ca09-9129-d622-038b52afb8b1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdtc;

    /** TPROCDTP (uuid:058f0377-6d76-59b6-1ac3-fad533ebe260, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdtp;

    /** TPROCDTH (uuid:c7ba07a8-3893-46b9-ad68-dfb4c7338db1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdth;

    /** TPROCDTV (uuid:74ef2a2a-553b-2cf4-b1ac-4176d88e7f45, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdtv;

    /** TPROCDTO (uuid:7c368646-59f2-5890-b0df-7820a23d21b8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tprocdto;

    /** MIDC (uuid:ff2710ca-43df-d860-bec6-eaf0a432bf8e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ midc;

    /** MIDP (uuid:5df1f35b-fd5c-261e-a42b-881a7686b133, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ midp;

    /** MIDH (uuid:b2819245-1e4f-6aca-cf7d-a9a1c30988c2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ midh;

    /** MIDV (uuid:3bfa4d9d-fdd7-1976-ea25-e83fef85928f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ midv;

    /** MIDO (uuid:30c4d93f-b77b-90f0-0d01-fc7902bce54f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mido;

    /** MNAMEC (uuid:42813d7d-1172-3c65-09b6-372b1bd38a8b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnamec;

    /** MNAMEP (uuid:af121271-bc4d-e45b-47de-149d587a06bd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnamep;

    /** MNAMEH (uuid:075056ee-5f3c-7950-f06e-07b4f3083674, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnameh;

    /** MNAMEV (uuid:a58243c7-4452-98e1-43a5-330060eed3f6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnamev;

    /** MNAMEO (uuid:7a758d8f-553f-3708-22e5-7469a6d153a7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mnameo;

    /** MCITYC (uuid:fb7822d2-85c3-0425-a1cc-986440dedb94, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcityc;

    /** MCITYP (uuid:94e5f399-361f-fea5-a8f3-def1afcf85b2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcityp;

    /** MCITYH (uuid:d60d5a69-93e5-24eb-7a2c-d6dc5e35c296, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcityh;

    /** MCITYV (uuid:b071c141-3c58-ecff-9d50-dda09d202c5d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcityv;

    /** MCITYO (uuid:9da9328d-e933-fd64-bae0-f8fc8c018f60, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mcityo;

    /** MZIPC (uuid:5802d2d1-44a9-9f58-b541-b4c288ae11a7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mzipc;

    /** MZIPP (uuid:96cc6d93-22b8-b558-9786-8796dc302ec6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mzipp;

    /** MZIPH (uuid:90de4f13-3dbf-ca8b-8508-fb267f124a71, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mziph;

    /** MZIPV (uuid:91ed73a0-ea2d-1e41-4492-72f01ab6e166, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mzipv;

    /** MZIPO (uuid:0f05f44c-9da4-9206-dc70-7e830e9c1962, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ mzipo;

    /** ERRMSGC (uuid:31fa6767-4c16-aa6d-420b-664c6b43ffc2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgc;

    /** ERRMSGP (uuid:8051201d-30c0-9a8f-b466-93c35b588387, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgp;

    /** ERRMSGH (uuid:bc2c5a2f-99e0-642d-0159-2bff65c10940, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgh;

    /** ERRMSGV (uuid:d7facf2e-0439-4860-836e-bf0be5ebdc3b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgv;

    /** ERRMSGO (uuid:9c22c5f5-ba48-5d77-5d05-ccb5ea72898d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgo;

    /** CCDA-SCREEN-TITLE (uuid:e318f38f-6791-d026-1a79-18878100c033, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:e1b8fba9-53dd-a763-23f1-f65b2f024ff9, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:78bb0bc3-ea64-efe4-7aaf-5ea55295bd95, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:1b175a77-84b0-408a-4593-5fcb364372d8, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** WS-DATE-TIME (uuid:96829703-163d-1f74-f8bf-00bf63be5db9, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:19cca747-51b2-110a-d868-706b372c5719, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:c8fc355e-b999-ada0-3e18-34743444daaf, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:cf0f23ab-b566-3676-2500-cf0ae1abbbff, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:f109504a-08a1-c22a-ae71-63d2389f8b52, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:d4f36b62-60b6-cb99-7ae9-4bfb112aa6fb, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:7f300836-5c83-9722-0f67-be62491d750f, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:e3c02109-21ab-26cc-ce73-821b2db91a37, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:926ef030-e9c7-3539-0a27-401ab231e2e2, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:90a3f4db-9d31-e5f9-3e7a-2b0945c4d1c7, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:2f2cd26d-9b7d-f079-70c4-00dcf061cb54, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:963b030f-ed25-77fc-5aea-c5fa53f0e6b8, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:d9ae76c6-7047-79e3-ac32-338e33c2ace9, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:4faed083-ae71-5908-a6d0-58fe3995f5b5, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:9f71e03e-0c82-3bb6-d928-bb971e4216f1, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:df627540-d082-b39d-2cdc-097a9e860589, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:e176e4da-c3aa-a8f2-e85c-81d2d641c96c, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:92321c3e-a161-8f70-45f8-a2ab50e04ca2, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:773c92d9-2e21-2ce0-7fd2-e5862877b343, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:0bb4ff53-a26e-9299-1112-c2612f1089c3, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:c3c0c87a-5168-d90e-af9a-4eb0cc0bcf12, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:16a5c636-f593-8431-d0ad-d189fbb383ef, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:eb15cba1-1250-e354-5553-40498b6bb46b, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:cf6c94c4-19b5-38eb-23a7-1e630fa91b71, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:e45ea04c-555d-3856-9610-dfc433d2ecf2, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:b6a2c56f-ebdb-7946-85c7-dd6d81237cf1, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:4db8ae09-160f-c1c0-917e-7ea43224c8b4, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:f1d46fa8-6672-0483-2da3-814fb2bf532a, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:4e23ec35-6d22-061c-9754-1debcca315d1, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:d397d4bf-bacf-03dc-dcc5-7bd9cd5ac599, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:f6183c5d-5a5c-6d59-9a40-cb45846f7e35, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:ed6b90cf-6aff-44ae-d7c7-5b8a45f6b3e5, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** TRAN-RECORD (uuid:dad1b63e-eb30-7717-4c9b-a210d8c11452, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tranRecord;

    /** TRAN-ID (uuid:8fcc5c04-8a95-23de-5322-5faf66711e0a, level 5, PIC X(16).). */
    public String tranId;

    /** TRAN-TYPE-CD (uuid:c316bf30-78df-2542-b161-c95dd1957d59, level 5, PIC X(02).). */
    public String tranTypeCd;

    /** TRAN-CAT-CD (uuid:c49751d1-855b-cb45-2031-964a37fef650, level 5, PIC 9(04).). */
    public int /* PIC 9(04). */ tranCatCd;

    /** TRAN-SOURCE (uuid:d16a5e12-9687-152d-236d-047b245edc44, level 5, PIC X(10).). */
    public String tranSource;

    /** TRAN-DESC (uuid:43908593-688f-1f58-7514-40f58c64f11c, level 5, PIC X(100).). */
    public String tranDesc;

    /** TRAN-AMT (uuid:e80cb823-0fd7-36ef-0c08-400f7707ba4b, level 5, PIC S9(09)V99.). */
    public BigDecimal /* precision=11, scale=2, signed */ tranAmt;

    /** TRAN-MERCHANT-ID (uuid:735f92ae-a7ba-6cd2-966f-7c76c3301e6c, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ tranMerchantId;

    /** TRAN-MERCHANT-NAME (uuid:6b471709-df74-88b9-9c97-088cdcb05eee, level 5, PIC X(50).). */
    public String tranMerchantName;

    /** TRAN-MERCHANT-CITY (uuid:0d851ea1-8689-9c90-146a-5c36237066a6, level 5, PIC X(50).). */
    public String tranMerchantCity;

    /** TRAN-MERCHANT-ZIP (uuid:70933333-39ce-ce33-5cda-89b96c17d7f0, level 5, PIC X(10).). */
    public String tranMerchantZip;

    /** TRAN-CARD-NUM (uuid:d92540ed-9756-f4e5-e69a-1c5cb7ee8f81, level 5, PIC X(16).). */
    public String tranCardNum;

    /** TRAN-ORIG-TS (uuid:4caed311-1527-788a-5adf-85e0fdadd081, level 5, PIC X(26).). */
    public String tranOrigTs;

    /** TRAN-PROC-TS (uuid:3eb5ecf8-c095-0adf-0bae-70b62da30830, level 5, PIC X(26).). */
    public String tranProcTs;

    /** DFHAID (uuid:7b88ad5f-ee9d-b10b-5333-2a81bd98bee8, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:ee6405bd-d172-c0fa-70c7-78a4af7e2b26, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:a9ed9bfa-65c7-044f-fd8e-404f6b73fee0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:f3da8db4-f2e9-3e40-a33e-6d2059dbdaf1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:e4819f82-aa4d-52a8-0437-6be80c6cf314, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:dff9135d-1d3a-9664-10e3-0fea86b7c3e8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:388900ed-ccb7-b305-1077-fd79ca331f21, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:155ddc03-b76a-f2d4-4f70-bf9d4eda9409, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:e97d2f09-7def-71ba-bd00-f290ef8afee9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:e37c173f-a8f0-ae51-0b3c-bef3ccc32eed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:6c2b4237-18d4-8c1b-a1f8-51e6648a32ff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:7a9e7c75-6bbf-d6a8-b840-537c58144d7e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:b703e518-671e-7d30-9490-ea47414b2319, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:3d2aeda4-1a78-117d-de31-d034e4506d39, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:41e9f6ec-48c4-f5cd-a057-1f1b602876e9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:fc1a62e5-be51-b3fa-b04b-17a2939c6279, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:b2d3b346-ec44-b835-d250-ce5a9b046cee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:2ef1f8c1-209b-e5e7-be09-a149a2587fd8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:b818ef12-102d-7dfe-4a4b-e27d25ab775e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:7239ea50-5c06-af35-ec82-2fa3f9aa7f54, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:4357abae-2b21-7770-4632-15c868914dd8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:eba0cdc2-342f-030f-0b1e-799898994aaf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:487fd898-d864-4237-50c3-33173746e2a1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:9b276393-21c4-3824-0b88-39e4b15342e6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:d84de6af-3db2-a6d1-dcf8-3d1f0d4ffd06, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:2220fb1d-9f41-1c2a-c768-c9de23d717d3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:134b7d9d-d86d-8b90-f039-797d35464a87, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:2d097deb-c66f-9129-4903-72ea9346c82c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:3882fb39-aac6-c3a7-f502-47ea51655f6b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:d5b7a728-e718-8125-c512-78f2d36c7313, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:f133f703-a669-e4fc-e512-0099fb0476c0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:98e45795-71e3-0349-73c1-fa2706f943f8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:c3380147-85c1-afe5-5d0c-3965497d26a6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:8c3c25d5-b204-c462-c99d-8115f1099b0b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:db1ea82e-232d-9173-6857-9a5d3f178018, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:9bdc9952-74ff-4969-7365-821c6ee93532, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:19a38446-31aa-bff7-d7fc-7d7d568917f1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** DFHBMSCA (uuid:06f70173-8f13-a561-94d4-45967a5ee759, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:8377687c-c903-58ed-bba7-287c96a19203, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:8fae49b7-3936-f3d3-bfb6-73d86c3d5dfc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:f22dc61d-ad0f-ac53-f638-6a9531b2b6ad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:acb08957-36c8-44e5-23ea-6ab8c65fe806, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:1b901f7f-53e5-3cc4-12af-483ff05dd36e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:40866d8e-7ebb-03b9-4c25-4a26fa6c812a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:ab1460ac-7e81-aaea-1415-550c3f8d80e2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:1924cbe1-048c-2e63-8afd-ddbd426f3586, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:239848d5-a661-f134-1f7a-0e2c2c86d2b8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:11339bec-bd23-3ef4-32f4-11d5af48e357, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:cc4825e1-3b4e-6cd8-a367-d44f932a8f2f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:cee1b22d-9b1f-16f1-2394-8dc64ef479db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:54f4d51e-c74e-f889-35ad-cad7adf292bb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:98a2b430-559d-3cab-0fdf-03da6415266b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:b808eb1d-4abe-64a3-ee5a-204caf8f6fa2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:d67476fd-cd0b-6b68-24b5-3f9e49ea41ea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:90718918-4269-9220-c487-3281819975b9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:2fe37e4c-ce0c-51bf-1764-50850ba704e7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:b929420a-3845-2b90-35dc-267f425a341f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:9f74d8e2-9477-90fd-059f-c140771cc529, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:7bb4f252-fabf-df42-2d52-46be6d591ef6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:c1cbd7fa-f99e-37dd-edba-e2b430114e5e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:0e0553be-354e-cb5a-74b5-f8c443424dcc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:4aac37b8-1920-c020-ed90-afb9a1855edd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:c676b841-69a5-ca9c-df1b-6d7cf677115a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:fb0825c8-3866-b31f-c6c1-ad2bbc81d85b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:8f3da74e-06ec-71e7-f657-3b73ffa6bdcb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:cbd707e7-49ae-0cc6-53c7-8b0ec0e35fa5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:920c1081-504e-b07b-8183-7544a1b4dc40, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;


    // --- auto-generated stubs for undeclared references ---
    public Object eibcalen;  // auto-stub for undeclared reference

    /** MAIN-PARA  (uuid:aedb153d-7ae3-d44a-5bf7-d5801cd6fcf2, source lines 612-665). */
    public void mainPara() {
        // SET ERR-FLG-OFF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET USR-MODIFIED-NO TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsMessage = "";
        this.errmsgo = "";
        if (java.util.Objects.equals(this.eibcalen, 0)) {
            // TODO: translate body for: EIBCALEN = 0
        }
    }

    /** PROCESS-ENTER-KEY  (uuid:2479cdfc-23d7-3373-688a-aa00402e5316, source lines 670-718). */
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

    /** RETURN-TO-PREV-SCREEN  (uuid:b397f8f1-1157-559d-c73e-d0026eb8fa81, source lines 723-734). */
    public void returnToPrevScreen() {
        if (java.util.Objects.equals(this.cdemoToProgram, "\u0000")) {
            // TODO: translate body for: CDEMO-TO-PROGRAM = LOW-VALUES OR SPACES
        }
        // MOVE WS-TRANID TO CDEMO-FROM-TRANID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO CDEMO-FROM-PROGRAM  -- identifier MOVE; needs PIC-aware type coercion
        this.cdemoPgmContext = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
    }

    /** SEND-TRNVIEW-SCREEN  (uuid:46f00c3f-2f16-c1db-2250-c55400f4a47e, source lines 739-751). */
    public void sendTrnviewScreen() {
        this.populateHeaderInfo();  // PERFORM
        // MOVE WS-MESSAGE TO ERRMSGO OF COTRN1AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** RECEIVE-TRNVIEW-SCREEN  (uuid:8d883311-7cf9-13ff-7d43-66033a59824c, source lines 756-764). */
    public void receiveTrnviewScreen() {
        // TODO: implement receiveTrnviewScreen.  See uuid:8d883311-7cf9-13ff-7d43-66033a59824c
    }

    /** POPULATE-HEADER-INFO  (uuid:34e3db36-9a1f-b674-3e0d-8a5ac078c5a5, source lines 769-788). */
    public void populateHeaderInfo() {
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF COTRN1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF COTRN1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-TRANID TO TRNNAMEO OF COTRN1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO PGMNAMEO OF COTRN1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF COTRN1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF COTRN1AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** READ-TRANSACT-FILE  (uuid:edd9201e-94b6-0dca-eddd-0c7a826e04ea, source lines 793-822). */
    public void readTransactFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** CLEAR-CURRENT-SCREEN  (uuid:8c12a53f-9d85-a095-00a3-a02eb15dbe6b, source lines 827-830). */
    public void clearCurrentScreen() {
        this.initializeAllFields();  // PERFORM
        this.sendTrnviewScreen();  // PERFORM
    }

    /** INITIALIZE-ALL-FIELDS  (uuid:9a7daba3-f5b7-3c4f-86c2-33f84da8f792, source lines 835-852). */
    public void initializeAllFields() {
        this.trnidinl = -1;
        this.trnidini = "";
        this.trnidi = "";
        this.cardnumi = "";
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
        this.wsMessage = "";
    }

    public static void main(String[] args) {
        new Cotrn01c().mainPara();
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
