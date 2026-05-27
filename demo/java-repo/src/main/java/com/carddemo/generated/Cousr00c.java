// Generated from COUSR00C.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COUSR00C.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * COUSR00C (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: COUSR00C.cbl
 */
public class Cousr00c {

    /** WS-VARIABLES (uuid:05b60b25-7ece-395b-57db-3177b4d2cf08, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsVariables;

    /** WS-PGMNAME (uuid:c9072ed3-7023-0803-9bda-a1933429973a, level 5, PIC X(08)). */
    public String wsPgmname;

    /** WS-TRANID (uuid:519f4c0a-904e-d198-3813-965dc1c7c699, level 5, PIC X(04)). */
    public String wsTranid;

    /** WS-MESSAGE (uuid:4601b0cd-5e70-ee55-b870-6a9ea749f17f, level 5, PIC X(80)). */
    public String wsMessage;

    /** WS-USRSEC-FILE (uuid:49517c38-dedb-2d95-96d2-3f3c8657c064, level 5, PIC X(08)). */
    public String wsUsrsecFile;

    /** WS-ERR-FLG (uuid:7d56a70f-dfc2-f197-ab97-9d81819b5611, level 5, PIC X(01)). */
    public String wsErrFlg;

    /** WS-USER-SEC-EOF (uuid:0de5c945-705e-330c-d2b1-6295f69b4501, level 5, PIC X(01)). */
    public String wsUserSecEof;

    /** WS-SEND-ERASE-FLG (uuid:09a5964f-d58a-a7a7-f14a-2888771e262c, level 5, PIC X(01)). */
    public String wsSendEraseFlg;

    /** WS-RESP-CD (uuid:d4dab031-095a-363a-bebf-07d297a34968, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsRespCd;

    /** WS-REAS-CD (uuid:8ff70146-30e1-e1fa-6908-755b19862f84, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsReasCd;

    /** WS-REC-COUNT (uuid:e84a7ea1-818f-e58e-c369-b3eab6b5e79a, level 5, PIC S9(04) COMP). */
    public int /* PIC S9(04) signed */ wsRecCount;

    /** WS-IDX (uuid:558164fe-6120-0d7b-a2cd-41f3622cd153, level 5, PIC S9(04) COMP). */
    public int /* PIC S9(04) signed */ wsIdx;

    /** WS-PAGE-NUM (uuid:dad94c58-8f45-fc61-57ca-4e86f3b15db7, level 5, PIC S9(04) COMP). */
    public int /* PIC S9(04) signed */ wsPageNum;

    /** WS-USER-DATA (uuid:ef0f4f63-f681-ac82-1410-82d36162f2bc, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsUserData;

    /** USER-REC (uuid:8e99363f-b07b-b308-c293-a5524c3849d8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ userRec;

    /** USER-SEL (uuid:bd93dc62-ae31-6f3e-6e6c-07a2be1dbc54, level 5, PIC X(01).). */
    public String userSel;

    /** USER-ID (uuid:dcab1701-06b1-8868-d032-eda230e23b04, level 5, PIC X(08).). */
    public String userId;

    /** USER-NAME (uuid:9b3c1a2c-3f12-1b50-47a5-bf46e29e9512, level 5, PIC X(25).). */
    public String userName;

    /** USER-TYPE (uuid:3ee11d0b-b966-d6ab-d5ef-72eb8f8b50a2, level 5, PIC X(08).). */
    public String userType;

    /** CARDDEMO-COMMAREA (uuid:d45cf473-03e1-2804-1ddb-6f0a03e73611, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:b2b4454a-eb14-2209-feb4-746520a83b3d, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:59da7a1c-1b31-0f2c-7b38-505b24654a42, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:2bad4c89-3cdd-2fbe-c3dc-80934e7e7107, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:ed599afc-d724-6c3e-1831-91b28a65f5ce, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:9626e67b-72ab-ed8e-a8af-27909edad85a, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:944b1403-76aa-3956-6bfd-dbc12b88a8ac, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:1700e034-848e-6bd8-1230-df2b8b0dd688, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:7d774178-6d56-e692-58e1-a920ec6c0aea, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:bba96393-af48-e67c-3246-865792d39e36, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:8840bf61-1a6c-a4f3-93f8-3f7a8debe297, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:dd9720ec-727b-c266-6c0c-0fa2a57fe53a, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:81b63bd6-0074-704f-5594-5ec9f6f4f4d3, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:8f5ae243-049c-898d-f4cf-d9368eb06346, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:cec386fb-4b76-14ca-eb34-4e04cb99e7b3, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:e2c3d622-0ec0-1927-cb05-04b20a76b0c0, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:8835544c-d71d-ba10-2893-9907f64ea929, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:20523213-a544-fc34-fa5d-d86702083751, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:21d5883f-f05e-097d-1705-574b2acb5230, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:e65a29b4-d9c0-312b-3c71-b429a279832d, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:52348efe-8a37-148c-1c84-a28581712e3e, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:51979803-eefb-7b56-4159-f5ccc7c9521e, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** CDEMO-CU00-INFO (uuid:741ba4d3-a610-7e1b-87be-f40025cb2798, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCu00Info;

    /** CDEMO-CU00-USRID-FIRST (uuid:f2500125-df42-428c-d3e9-36af57febb49, level 10, PIC X(08).). */
    public String cdemoCu00UsridFirst;

    /** CDEMO-CU00-USRID-LAST (uuid:55d5cfa1-9683-c82e-a9f8-fbb96a15a4f5, level 10, PIC X(08).). */
    public String cdemoCu00UsridLast;

    /** CDEMO-CU00-PAGE-NUM (uuid:5f2aa946-ab2a-743f-80ef-c195fdeca5da, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ cdemoCu00PageNum;

    /** CDEMO-CU00-NEXT-PAGE-FLG (uuid:7432a5c4-7b20-69e3-d604-1479eaeaab29, level 10, PIC X(01)). */
    public String cdemoCu00NextPageFlg;

    /** CDEMO-CU00-USR-SEL-FLG (uuid:29c650e9-53ef-645b-c3e3-713991601716, level 10, PIC X(01).). */
    public String cdemoCu00UsrSelFlg;

    /** CDEMO-CU00-USR-SELECTED (uuid:fb634def-ce14-2203-3ee2-84d526b13953, level 10, PIC X(08).). */
    public String cdemoCu00UsrSelected;

    /** COUSR0AI (uuid:2611e83a-f6ba-c4d2-584b-8e22a754181c, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cousr0ai;

    /** TRNNAMEL (uuid:4db1e81d-06e0-bac1-31e4-447878e8b46f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamel;

    /** TRNNAMEF (uuid:38f86f38-2a96-042f-c184-42c22d741581, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamef;

    /** TRNNAMEA (uuid:7507c511-4a0c-e119-c0d7-b492b195631a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamea;

    /** TRNNAMEI (uuid:22622e4e-875f-a91e-8198-fd2581dd184f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamei;

    /** TITLE01L (uuid:49ab9ef9-973b-4b3b-d60c-31776cf87052, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01l;

    /** TITLE01F (uuid:b525d614-c6f4-4e66-9f6d-fc8596fe6ee5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01f;

    /** TITLE01A (uuid:416059aa-53b9-8c42-318d-eb72a7db076c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01a;

    /** TITLE01I (uuid:65459e54-e937-73a9-9f89-46dea3a4964f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01i;

    /** CURDATEL (uuid:187cb8bd-afcd-c9c0-a7b2-061f8fbe7b8c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatel;

    /** CURDATEF (uuid:7468a20e-5105-e5c9-cb47-f14b64bc2207, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatef;

    /** CURDATEA (uuid:c1449617-a8ff-679c-d7f3-d51ed54af210, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatea;

    /** CURDATEI (uuid:100a4947-37c5-b469-2159-85c52270a5c5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatei;

    /** PGMNAMEL (uuid:2d908118-f2f3-2049-a784-251b6019ba5b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamel;

    /** PGMNAMEF (uuid:21b4b3bf-4cc0-0063-ba48-19fb4012be04, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamef;

    /** PGMNAMEA (uuid:b668a19c-548e-eb32-c28d-b1a9de59c327, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamea;

    /** PGMNAMEI (uuid:fadeade0-4d9b-580c-9911-ce730ec6a744, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamei;

    /** TITLE02L (uuid:f939ed81-2f84-1053-0d8a-bd3ab7d983e0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02l;

    /** TITLE02F (uuid:74e81066-a717-3176-9777-8da189d0c4dd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02f;

    /** TITLE02A (uuid:6bfa0850-0017-ec57-9a39-d271eac21694, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02a;

    /** TITLE02I (uuid:d67f2c17-f4b7-0628-83f1-0a5f3e218329, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02i;

    /** CURTIMEL (uuid:8d8e4b95-e888-6fd6-ecc6-5e63ba150af2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimel;

    /** CURTIMEF (uuid:f4d64b14-b809-73ff-3624-ebeb42f139cb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimef;

    /** CURTIMEA (uuid:27f4bb46-c8df-e5d7-a20c-b4f159a79254, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimea;

    /** CURTIMEI (uuid:3513bdf4-f686-0e71-9364-5a47faf8e8bc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimei;

    /** PAGENUML (uuid:3ab9bf9f-e152-c697-10de-c47f6d326a0f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenuml;

    /** PAGENUMF (uuid:9f9dcf9c-2862-92dc-e401-06f3f3918556, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenumf;

    /** PAGENUMA (uuid:bb0a50ac-30d3-e745-f6fd-13e797b2e66e, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenuma;

    /** PAGENUMI (uuid:a585711f-fba4-9341-f412-e6f111e4ba03, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenumi;

    /** USRIDINL (uuid:4877e876-cbf1-15cd-4de8-b04b69e3c9f2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinl;

    /** USRIDINF (uuid:bf07e66c-9caf-2d4d-ca0d-98742bac973f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinf;

    /** USRIDINA (uuid:48395381-854a-16df-e225-db82e4d89117, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridina;

    /** USRIDINI (uuid:9f4c01ee-a17b-00a2-e3e1-bdd90d7cfbb8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridini;

    /** SEL0001L (uuid:50ad0f15-c79f-4fed-da23-6335f4ccf444, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001l;

    /** SEL0001F (uuid:dbd7e946-c9c2-f24e-dca5-fc96c3f0ba35, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001f;

    /** SEL0001A (uuid:95254966-4a57-e5c5-0add-e47cc1e0e224, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001a;

    /** SEL0001I (uuid:7e6b0000-b25b-5c71-716b-65a1fcee2ead, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001i;

    /** USRID01L (uuid:b001b3dc-5cb3-2ea8-7851-daf319a9c0f2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid01l;

    /** USRID01F (uuid:5885502f-79ff-f4c0-d35b-bff4cfd9ab13, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid01f;

    /** USRID01A (uuid:4f4a2ba4-1cca-1b63-8733-57a88fefce71, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid01a;

    /** USRID01I (uuid:3849458f-08b0-44d7-6541-6185bf86c743, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid01i;

    /** FNAME01L (uuid:efb2bb7e-c023-e53a-f57f-b3bd8c0d9768, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname01l;

    /** FNAME01F (uuid:9cd7f121-6119-14a1-20a1-acb998dbfe17, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname01f;

    /** FNAME01A (uuid:844c56f1-a840-b678-174d-368939b4858e, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname01a;

    /** FNAME01I (uuid:a8b60b9b-054f-4e78-9473-a59295306fdb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname01i;

    /** LNAME01L (uuid:a1a77735-977f-c08f-2d16-b0013158c9a6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname01l;

    /** LNAME01F (uuid:e91971a6-1a7c-3ea5-ecbf-285f0cd08d73, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname01f;

    /** LNAME01A (uuid:a43d9d5b-9cbc-560a-8b78-618593f58f3d, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname01a;

    /** LNAME01I (uuid:dd7db8a2-b972-11d1-7116-a78dee5bf2d4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname01i;

    /** UTYPE01L (uuid:fc22b344-e611-cda0-5e9f-79f3eb936644, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype01l;

    /** UTYPE01F (uuid:baea2935-456d-cd82-62b7-4ca3affe0cfe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype01f;

    /** UTYPE01A (uuid:830a8a45-c3bd-ee13-e27c-dc4802b940b7, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype01a;

    /** UTYPE01I (uuid:7ae03ea2-472a-6f57-c1f3-b73f1a30fd28, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype01i;

    /** SEL0002L (uuid:3a175732-d64b-d412-2fb9-bd8cb687f3aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002l;

    /** SEL0002F (uuid:9e79b0df-726a-1d3c-d97d-6780a5ebd5c1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002f;

    /** SEL0002A (uuid:8bfa81ae-ae58-c610-5a78-9abf7c4a8afa, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002a;

    /** SEL0002I (uuid:3b3ea0bc-a59d-d465-2922-b88b810fa09b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002i;

    /** USRID02L (uuid:9351c1e5-d961-21bc-1ffd-658c730e677b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid02l;

    /** USRID02F (uuid:8ac046ab-b797-e3a6-700b-a80d784609fb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid02f;

    /** USRID02A (uuid:83dcc230-8c3e-b19e-3593-318c4069ad37, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid02a;

    /** USRID02I (uuid:d43722e2-3e9e-9076-846d-112590fba2f1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid02i;

    /** FNAME02L (uuid:83ec7096-ed6c-368a-f911-84e6b04ba05d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname02l;

    /** FNAME02F (uuid:82c44a4f-57fe-a699-5e7c-d9c0d4a5a0b6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname02f;

    /** FNAME02A (uuid:ba68407e-8984-47b2-e02c-6322853277a2, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname02a;

    /** FNAME02I (uuid:59da5bca-7d05-d34f-81f0-53e15c516084, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname02i;

    /** LNAME02L (uuid:78f5b851-c457-514a-099a-805e554f700a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname02l;

    /** LNAME02F (uuid:2d901bbf-5ebe-3b6a-a393-455f5752b94f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname02f;

    /** LNAME02A (uuid:8177162d-7e3a-61d6-26b8-8f6432d0f941, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname02a;

    /** LNAME02I (uuid:cc895e33-c296-59dc-c225-c619888cbb43, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname02i;

    /** UTYPE02L (uuid:57aaa364-a30e-134e-c6b1-13c1b4ebb23b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype02l;

    /** UTYPE02F (uuid:bf377886-ea40-f2ac-3590-3bd247765290, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype02f;

    /** UTYPE02A (uuid:38d4d470-8a97-8a8b-7140-d68022801e24, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype02a;

    /** UTYPE02I (uuid:b1f711c5-882c-6aa8-a844-c864c53f7059, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype02i;

    /** SEL0003L (uuid:3bbb3e03-9148-bf36-a45a-0e5c218139e8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003l;

    /** SEL0003F (uuid:de124ae8-622f-079d-65e8-15c8b8bb6685, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003f;

    /** SEL0003A (uuid:56babd93-4416-cc47-cded-18fd3a2417c1, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003a;

    /** SEL0003I (uuid:9a3ced8e-a025-621c-4de7-2ef20e49a357, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003i;

    /** USRID03L (uuid:e8f598c1-3b42-e239-5029-3f184fe1b7ed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid03l;

    /** USRID03F (uuid:1de65b7d-d8ab-1e59-28fe-85620ab58b06, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid03f;

    /** USRID03A (uuid:0a460870-f56b-073d-34fb-33c58f228299, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid03a;

    /** USRID03I (uuid:8b113377-0341-4d5f-d720-57db9aa0d4ce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid03i;

    /** FNAME03L (uuid:69b8664f-d1ef-61a7-4f10-d6e968df5507, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname03l;

    /** FNAME03F (uuid:e8f66706-9572-72fb-a586-9fcec8fd1cba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname03f;

    /** FNAME03A (uuid:ac6254ea-6b3a-71ea-1f4c-4bcce2d9546d, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname03a;

    /** FNAME03I (uuid:47f3ee17-d961-b815-acf6-d6ab65acb730, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname03i;

    /** LNAME03L (uuid:43fe7685-81c3-9a3e-bbb5-4b5f320d5dff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname03l;

    /** LNAME03F (uuid:25b1050b-b004-65d5-41e5-ecb7458c26c2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname03f;

    /** LNAME03A (uuid:71d5bd07-6f20-22d4-9420-197eb75ad865, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname03a;

    /** LNAME03I (uuid:63e3575b-e897-238d-d048-ae42e175a055, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname03i;

    /** UTYPE03L (uuid:1127a0ce-642a-77f6-5ff8-03c03f98e698, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype03l;

    /** UTYPE03F (uuid:194c74a2-e585-7442-cefc-6e071a3924a5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype03f;

    /** UTYPE03A (uuid:30035205-40ac-cd94-c75a-3b3fd6ec55a1, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype03a;

    /** UTYPE03I (uuid:328a7948-16ae-cff6-5343-5f95d3f42520, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype03i;

    /** SEL0004L (uuid:322ce171-016d-a7be-1a3f-fa6855042ba6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004l;

    /** SEL0004F (uuid:07a70e8a-3784-87b9-f5c8-69f10ead9fd4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004f;

    /** SEL0004A (uuid:d9538e68-94df-a74c-9983-95b99468f1e2, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004a;

    /** SEL0004I (uuid:991ab684-104c-a877-4059-f1bee2badfdd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004i;

    /** USRID04L (uuid:195cf191-ed25-ad2b-6fbc-d676a7d615be, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid04l;

    /** USRID04F (uuid:4501f73e-e056-6f17-294a-1158e210fff0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid04f;

    /** USRID04A (uuid:92b7c061-2777-ffef-7802-1f2bf0867121, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid04a;

    /** USRID04I (uuid:2803e22f-9b52-66f3-d332-aeb249148e2d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid04i;

    /** FNAME04L (uuid:e0688d4b-bf51-4620-c168-a2baf1235f6e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname04l;

    /** FNAME04F (uuid:a7b5cc86-d253-e8d4-755e-da6d491c8772, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname04f;

    /** FNAME04A (uuid:6f3e4362-9bf3-1c14-bc60-5986b80d0cdf, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname04a;

    /** FNAME04I (uuid:66f29818-20e3-feab-1134-b8fad708bc56, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname04i;

    /** LNAME04L (uuid:7cd2ad32-7f84-8aee-82e0-0bcf1e360fc7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname04l;

    /** LNAME04F (uuid:2e7c4ead-b310-287b-039b-78eead437f48, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname04f;

    /** LNAME04A (uuid:487c9cbf-ade3-f665-a263-aa380da99e39, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname04a;

    /** LNAME04I (uuid:e06a9971-7471-5e96-2379-ce321b0fe733, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname04i;

    /** UTYPE04L (uuid:f3e59333-51e4-7cd0-ad1f-5365c74088b9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype04l;

    /** UTYPE04F (uuid:2c817ca9-3a2e-1bfc-b7be-241299de67a8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype04f;

    /** UTYPE04A (uuid:f39cd358-8cf5-8729-c266-4589f9879b2d, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype04a;

    /** UTYPE04I (uuid:2a48c1a7-3fae-42e9-2ccd-6166cdc693ef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype04i;

    /** SEL0005L (uuid:91386859-5cb7-dd77-ec44-7b66285f6812, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005l;

    /** SEL0005F (uuid:df294fcd-2ea8-6384-934c-386435cfc358, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005f;

    /** SEL0005A (uuid:fa7f8aaf-bc41-49c1-478c-6fbcbb685604, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005a;

    /** SEL0005I (uuid:42627424-5a44-eac3-e583-f4e54569da9f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005i;

    /** USRID05L (uuid:b6a298c0-2e6e-fcc1-ae61-f25e082c1ba8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid05l;

    /** USRID05F (uuid:bd0ae321-d99b-d510-208f-0f0477614229, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid05f;

    /** USRID05A (uuid:e965caba-3270-6c18-7b06-da53811df92a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid05a;

    /** USRID05I (uuid:15e1d0a4-c21a-161c-a821-d0377ea94e25, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid05i;

    /** FNAME05L (uuid:efffc2e6-2113-5812-c0fa-ee52d9f486f7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname05l;

    /** FNAME05F (uuid:47069f64-6109-5c12-2b61-5e33d75bdd51, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname05f;

    /** FNAME05A (uuid:579b893a-855a-9055-e0fa-1ba7c05bd05e, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname05a;

    /** FNAME05I (uuid:55d5574f-24c3-fea6-0ca9-395550691f99, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname05i;

    /** LNAME05L (uuid:476b562b-d118-75ed-724d-a0d64183255c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname05l;

    /** LNAME05F (uuid:aad385c5-d017-094a-d81b-b2c9f5957681, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname05f;

    /** LNAME05A (uuid:c41910fe-a9cc-f9f5-63c3-d9e83014c7b4, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname05a;

    /** LNAME05I (uuid:9c24b664-940a-1c26-ba03-bafc844d110e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname05i;

    /** UTYPE05L (uuid:676d6c97-d440-2cdd-8af0-81b8024929e0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype05l;

    /** UTYPE05F (uuid:9e4c7d9b-a72a-29ef-a8d0-46a5b8ed4860, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype05f;

    /** UTYPE05A (uuid:d2628913-e6d0-71b1-725c-08be92076b0d, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype05a;

    /** UTYPE05I (uuid:522db739-99b2-5db1-8f15-3a94f7a9e541, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype05i;

    /** SEL0006L (uuid:4cd676a5-6e1d-6b1e-b5af-28eebb0027b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006l;

    /** SEL0006F (uuid:a806bf84-17ce-d17e-fe03-37ab386259a9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006f;

    /** SEL0006A (uuid:fffcc84d-1aaf-9296-fcc6-15612d86332b, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006a;

    /** SEL0006I (uuid:2d44e4f5-bc91-9bf9-0b05-47802274b5d3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006i;

    /** USRID06L (uuid:80246983-f96d-e306-6dd4-c56ed2e10593, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid06l;

    /** USRID06F (uuid:94ecfe05-60a0-18c4-20ec-26a412b6df9e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid06f;

    /** USRID06A (uuid:9d2213df-9cfe-fe8c-caf6-8ae446a44e2a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid06a;

    /** USRID06I (uuid:0d4b930f-85dd-1117-03b9-e81cd58b44fd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid06i;

    /** FNAME06L (uuid:30183cf4-8059-b1c0-07b7-1b45f6751d51, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname06l;

    /** FNAME06F (uuid:35881324-d92b-6a3b-4395-a7d7e38d73f8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname06f;

    /** FNAME06A (uuid:f23e8f2b-13ff-3001-7991-bec199550ffd, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname06a;

    /** FNAME06I (uuid:9e9277ee-abde-d842-7d29-5ec84d437b61, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname06i;

    /** LNAME06L (uuid:e5ac4107-f185-5fa1-da02-2df3f32f4918, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname06l;

    /** LNAME06F (uuid:47ef88e8-572b-19a5-423e-7fc5dbb3eb1a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname06f;

    /** LNAME06A (uuid:d99ffc01-19b4-4cfe-6ffc-2ee8b80885d8, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname06a;

    /** LNAME06I (uuid:be1abcc5-b5f0-a637-be8e-ed58cb3c22cc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname06i;

    /** UTYPE06L (uuid:86980305-0df6-aeea-e7b3-be188fa47b68, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype06l;

    /** UTYPE06F (uuid:1ed83aee-4fba-2a69-378a-ec77b3530545, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype06f;

    /** UTYPE06A (uuid:d8a60840-4673-038a-3905-129ea281d85c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype06a;

    /** UTYPE06I (uuid:49fd73c2-2727-7de6-61cc-c4c8caf5df34, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype06i;

    /** SEL0007L (uuid:d9024faa-1ec8-072a-1cf5-f4701656ced8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007l;

    /** SEL0007F (uuid:62dc48ab-ab90-6b28-f551-3d2207807e62, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007f;

    /** SEL0007A (uuid:b99b9f0c-f9e3-3dbb-05ea-f9a5844ce67f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007a;

    /** SEL0007I (uuid:78bd4081-cab7-26be-bf9b-cfb71980a7e7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007i;

    /** USRID07L (uuid:731d95db-b201-4447-18ff-e6d5b2fcb56c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid07l;

    /** USRID07F (uuid:07e003dd-6848-4166-cb16-d11fb7176be6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid07f;

    /** USRID07A (uuid:e9461c99-f3e2-7b32-9556-ed5c4e5d52dc, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid07a;

    /** USRID07I (uuid:c44b4a40-ec81-755f-fe2f-5e503c670104, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid07i;

    /** FNAME07L (uuid:174a7814-0a53-ea50-87b6-8607b9d8ba13, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname07l;

    /** FNAME07F (uuid:17cb7829-aec8-49c2-fb6d-6bca26373f71, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname07f;

    /** FNAME07A (uuid:dbca6722-28a1-54fe-5c36-bb600dd65766, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname07a;

    /** FNAME07I (uuid:e5c41e47-22e4-47e0-54c3-b8f42210e3e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname07i;

    /** LNAME07L (uuid:d54808c6-dc95-10a4-e098-61fa60053e3b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname07l;

    /** LNAME07F (uuid:9600fe18-28c2-4432-8d63-b47bb945d0bb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname07f;

    /** LNAME07A (uuid:ea99b64e-cab5-5fa0-9ba8-030ac8a49ef8, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname07a;

    /** LNAME07I (uuid:67cff367-cd31-1337-2956-3911750c8cbd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname07i;

    /** UTYPE07L (uuid:7322304e-e82b-f57b-2848-1190a8548aad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype07l;

    /** UTYPE07F (uuid:5a826a04-00b8-e1b4-45a5-321242e27d33, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype07f;

    /** UTYPE07A (uuid:d388015b-67d9-2d2b-c9d0-f598e884df08, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype07a;

    /** UTYPE07I (uuid:3be9bc05-10d7-d66b-5811-6c400bebf19f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype07i;

    /** SEL0008L (uuid:d15a24e7-44ca-a134-e89a-df658342ea13, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008l;

    /** SEL0008F (uuid:3a622cc8-d436-37ca-6a7f-0bb459bdd443, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008f;

    /** SEL0008A (uuid:bca368b1-69ff-e278-348a-615d0364c963, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008a;

    /** SEL0008I (uuid:b938781d-fdf7-53e7-aa9f-5df9b95b18bb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008i;

    /** USRID08L (uuid:6b8f2f88-4c11-8e03-f378-9bbea314f680, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid08l;

    /** USRID08F (uuid:13aecde8-71ab-aa04-0940-060436d9afbc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid08f;

    /** USRID08A (uuid:08ea72bf-0fbd-6d4b-d067-e790b0db15c6, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid08a;

    /** USRID08I (uuid:3abc8e20-aa45-ff22-2d32-03c4c996d713, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid08i;

    /** FNAME08L (uuid:db93f991-9ef0-bbda-3ee5-2abcd1104a0f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname08l;

    /** FNAME08F (uuid:640aa3b6-23d1-ced8-43b4-e2211872cf49, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname08f;

    /** FNAME08A (uuid:b96cfa64-995a-124c-6413-bd8ca7f77839, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname08a;

    /** FNAME08I (uuid:45185662-cd07-fd74-39a7-9a2e20dff088, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname08i;

    /** LNAME08L (uuid:d2d9410a-b9c8-4d7c-1e7f-067ff7f00227, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname08l;

    /** LNAME08F (uuid:d9ce3cb4-bcdf-802d-b495-661343165cbe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname08f;

    /** LNAME08A (uuid:4f46f58e-e13b-619f-99d3-63539b2764a2, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname08a;

    /** LNAME08I (uuid:7d572724-5182-8c53-2584-094438fafc55, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname08i;

    /** UTYPE08L (uuid:3bec4c9f-b2d2-a0a9-76f9-d29fa0e6cffb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype08l;

    /** UTYPE08F (uuid:01a9c682-e66d-de1e-1045-646d506a4098, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype08f;

    /** UTYPE08A (uuid:ab1252cd-ff51-a70a-4354-1df38e635171, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype08a;

    /** UTYPE08I (uuid:4856cc4e-821f-b13a-926c-8f41201a6541, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype08i;

    /** SEL0009L (uuid:e0ee207e-b2e0-c029-98d1-af7d1e6a8060, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009l;

    /** SEL0009F (uuid:542ba8c8-f026-b0af-b14c-be0747e13246, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009f;

    /** SEL0009A (uuid:45df5e08-ed8e-a99d-35ce-3b112b1106b8, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009a;

    /** SEL0009I (uuid:f681c091-b7db-7a55-a54a-dc5e935d6c3c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009i;

    /** USRID09L (uuid:bb61455d-aad5-0503-c7e3-a7a0caab5e9f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid09l;

    /** USRID09F (uuid:cba6af58-02e5-a8e8-27ff-dd659794077d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid09f;

    /** USRID09A (uuid:86374fc1-8cb0-16b4-4597-1874de647e47, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid09a;

    /** USRID09I (uuid:6ad35b2f-2014-f177-007b-2a4a4126e3c5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid09i;

    /** FNAME09L (uuid:2e89fdac-4ef8-a504-eaf4-95aee2cdac22, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname09l;

    /** FNAME09F (uuid:94e5ef59-cef1-5a8c-726a-18837c097bda, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname09f;

    /** FNAME09A (uuid:7b476761-d0ab-0b73-86b4-24f5fed6b281, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname09a;

    /** FNAME09I (uuid:312932c5-4edf-c82a-b661-c855485954d6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname09i;

    /** LNAME09L (uuid:e9e9e53d-08dd-0fe0-9ce1-8460f5b010d9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname09l;

    /** LNAME09F (uuid:e20dbd1f-96f5-3a2b-7dd8-16a14304ccc5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname09f;

    /** LNAME09A (uuid:4c1fef4b-2acb-5315-2e6a-2991cd6d27bd, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname09a;

    /** LNAME09I (uuid:5b00221a-98cd-9b9d-4677-735827e69a26, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname09i;

    /** UTYPE09L (uuid:3e75827f-94e3-cfe5-e044-96f34565aa0a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype09l;

    /** UTYPE09F (uuid:5a10b58d-3bdd-0f2f-f7b2-b125e12a6cd9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype09f;

    /** UTYPE09A (uuid:19ad8914-9dfe-9fa6-7061-a857ab24fa3f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype09a;

    /** UTYPE09I (uuid:e9475c63-c7f9-c2fe-4256-d8a41955392c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype09i;

    /** SEL0010L (uuid:59060e84-cd83-c0f1-562a-6358d6cc794a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010l;

    /** SEL0010F (uuid:7b685cbe-f865-9e4b-579b-af76c3ddc723, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010f;

    /** SEL0010A (uuid:343e57b4-ef1b-62b8-a277-81be083da055, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010a;

    /** SEL0010I (uuid:ba7b3e71-4b70-20c0-8c5d-795fa153d4db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010i;

    /** USRID10L (uuid:76a68bae-7bdc-c053-a36e-939a0896cb7a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid10l;

    /** USRID10F (uuid:7db26b53-88c9-dbca-1abc-5e442c37e974, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid10f;

    /** USRID10A (uuid:5d4687d7-d0a8-3664-2067-d12772bfcda2, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid10a;

    /** USRID10I (uuid:239efbc6-716c-7a09-4ecf-fab62aac0115, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid10i;

    /** FNAME10L (uuid:2fca0890-00ef-85ff-0a35-b816baca7dfb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname10l;

    /** FNAME10F (uuid:69e98c2c-5aed-8ba5-3bb5-83ca1b0d0e30, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname10f;

    /** FNAME10A (uuid:560df8f2-43d5-d9b1-3a97-2f44cad7fc31, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname10a;

    /** FNAME10I (uuid:e4502a37-5221-0300-298f-dade226b44df, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname10i;

    /** LNAME10L (uuid:3e7cbb46-5853-e01a-3e37-3ad7aa306ab5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname10l;

    /** LNAME10F (uuid:11566b4a-e1d8-69be-8e26-21849ee2aa94, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname10f;

    /** LNAME10A (uuid:5959c0e8-77fe-5fba-6f3d-cb71641534dc, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname10a;

    /** LNAME10I (uuid:92498e58-eed6-228d-a4f3-2de0f5ffdc9e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname10i;

    /** UTYPE10L (uuid:1e008600-c04a-ccac-0513-b5902c8cc69a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype10l;

    /** UTYPE10F (uuid:e8e19a1c-33ce-38d2-04d8-963bed293580, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype10f;

    /** UTYPE10A (uuid:82edee46-b13f-f3e3-77a7-6b0c96df4008, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype10a;

    /** UTYPE10I (uuid:f1b6a1e3-d4f3-8363-6371-622b52d9aa34, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype10i;

    /** ERRMSGL (uuid:5ff58f20-df2d-c196-97a1-d7e63f69e5e6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgl;

    /** ERRMSGF (uuid:55362b30-0945-ef37-fad6-f482a1d7bb26, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgf;

    /** ERRMSGA (uuid:90f8f0c9-8dc6-a487-e013-47aa576e6e04, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsga;

    /** ERRMSGI (uuid:ff375bf8-dbe7-cc8f-56f0-d7bb192bffc4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgi;

    /** COUSR0AO (uuid:b233b653-5760-c5c5-9b54-f0c60c26b4c3, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cousr0ao;

    /** TRNNAMEC (uuid:3f89e906-0394-ecc0-dcf2-ec4e707df13f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamec;

    /** TRNNAMEP (uuid:018b9cd3-8bfa-20f9-a756-46036a2ccf25, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamep;

    /** TRNNAMEH (uuid:e94e90f3-f4f6-71b0-533c-5c58cf230ade, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameh;

    /** TRNNAMEV (uuid:95dc6bc2-5504-6023-73a8-5372442a2708, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamev;

    /** TRNNAMEO (uuid:5498d5fa-6ce6-02fa-6158-82979424f90f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameo;

    /** TITLE01C (uuid:b1de0220-2b75-27e6-0a01-40cc2ca3445b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01c;

    /** TITLE01P (uuid:bf4ba7d9-82fb-c70e-d959-1722f2524f39, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01p;

    /** TITLE01H (uuid:f1b7d3c6-7d11-7cd1-40f8-ac9d4417dc52, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01h;

    /** TITLE01V (uuid:c0730e8c-53da-36e9-9863-3ccb1714b1bd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01v;

    /** TITLE01O (uuid:f877e8e9-770e-ef69-3044-7d89feb59679, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01o;

    /** CURDATEC (uuid:94320be9-8f67-ea93-b161-28b696a27f96, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatec;

    /** CURDATEP (uuid:b40924e7-f2e6-7841-ab7e-429da4e8185a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatep;

    /** CURDATEH (uuid:3862ab31-0c0c-829b-2c0c-fcc095a6850d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateh;

    /** CURDATEV (uuid:d74cc2a0-bde2-82fc-9c3d-ac55d0e4e545, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatev;

    /** CURDATEO (uuid:d49587d0-472b-5e52-b434-bace78c87da9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateo;

    /** PGMNAMEC (uuid:e17b0037-6f14-876b-d74c-addcde936dbf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamec;

    /** PGMNAMEP (uuid:a161d997-13c4-f059-b124-eb6e249b9fbd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamep;

    /** PGMNAMEH (uuid:62f7b754-4d21-fd1f-9a8d-7badc773814c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameh;

    /** PGMNAMEV (uuid:72cd8324-d850-6cd1-026a-a4d08d927613, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamev;

    /** PGMNAMEO (uuid:6180c5c6-fe47-2e8f-a32e-75c85b155f2d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameo;

    /** TITLE02C (uuid:592981b8-a696-96be-5fc4-a538cc097f8c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02c;

    /** TITLE02P (uuid:24aa022e-020e-6c48-62c9-22cb0b163af2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02p;

    /** TITLE02H (uuid:74df4b7e-c1c6-b106-9d25-2eac6e9dac0a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02h;

    /** TITLE02V (uuid:c7f68cf7-3265-712f-f7bc-04f92ca49cc3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02v;

    /** TITLE02O (uuid:4707c053-a8dc-7ec2-4700-c96de7df5e1c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02o;

    /** CURTIMEC (uuid:79e318d9-d537-e3b9-e684-294cfe81cd95, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimec;

    /** CURTIMEP (uuid:7aab32ea-6456-b135-f033-dfe971d3a1fe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimep;

    /** CURTIMEH (uuid:816dd5ca-7c28-84d7-4dbe-ff4727e4330a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeh;

    /** CURTIMEV (uuid:75e76209-16ed-fb62-0618-bc2eea5e3e29, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimev;

    /** CURTIMEO (uuid:170d6efc-4b79-8c01-b84c-e65f08808ec1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeo;

    /** PAGENUMC (uuid:68bc52da-256b-a8a8-0d0e-32303dfa9a44, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenumc;

    /** PAGENUMP (uuid:7e4abe45-665a-c2f3-1aae-267523dc570f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenump;

    /** PAGENUMH (uuid:c9d555e6-49f3-7f08-3086-19fb3f278390, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenumh;

    /** PAGENUMV (uuid:27506fd4-4009-ef70-9dab-67e983393b67, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenumv;

    /** PAGENUMO (uuid:bab85d85-ec76-6fc9-38f9-9467f962a2e8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenumo;

    /** USRIDINC (uuid:c6b744f5-67f4-3d9f-14af-2adb376d780d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinc;

    /** USRIDINP (uuid:164f04b1-ea83-667b-7745-b936893c1f45, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinp;

    /** USRIDINH (uuid:6a7f5662-c1ff-1aca-081b-8eb86932b09d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinh;

    /** USRIDINV (uuid:2efe7c46-6920-1497-29bf-7d9fe500dace, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridinv;

    /** USRIDINO (uuid:ecff8e27-d8e5-caeb-69ab-4eadec4880ab, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usridino;

    /** SEL0001C (uuid:baa79477-8e46-401a-84de-e92332da8f12, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001c;

    /** SEL0001P (uuid:e22128fa-ef71-746c-e205-cb446cc96a1b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001p;

    /** SEL0001H (uuid:0c6d94e0-fe89-4bf0-9da7-e584e153f5f8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001h;

    /** SEL0001V (uuid:2bacc964-7872-d54a-4170-3eeb0cfb5803, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001v;

    /** SEL0001O (uuid:e26a5b1b-2a0a-5e19-c1f7-a96d032e9535, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0001o;

    /** USRID01C (uuid:467268f1-5a1a-e579-4f7b-102a1df29614, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid01c;

    /** USRID01P (uuid:b9610a6d-a13a-2f5b-e148-6888709ec883, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid01p;

    /** USRID01H (uuid:d4e914b9-5b70-93ec-1189-094a665e2140, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid01h;

    /** USRID01V (uuid:cdfae696-3f86-951d-99b9-27200c430b10, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid01v;

    /** USRID01O (uuid:8aa4fd9e-eb62-c5bc-a397-1fac82beed47, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid01o;

    /** FNAME01C (uuid:33490d06-6922-bdd0-3f22-7328a6f13a44, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname01c;

    /** FNAME01P (uuid:7f14baaa-9ae5-a8b6-597b-625abc4f96d8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname01p;

    /** FNAME01H (uuid:bea54ac4-410b-b3fd-fe01-419d770fd613, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname01h;

    /** FNAME01V (uuid:a3212fce-b313-0d7f-43a2-2e8fcb2b2cbc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname01v;

    /** FNAME01O (uuid:419dcae4-2e34-a898-fce0-ee122c4254ee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname01o;

    /** LNAME01C (uuid:1ee2d0b4-0fc3-1258-2506-977af7e68bd1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname01c;

    /** LNAME01P (uuid:1149b021-face-6e43-731c-dbc807a19545, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname01p;

    /** LNAME01H (uuid:d351ef7d-df30-495f-5d2f-bcad88f45075, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname01h;

    /** LNAME01V (uuid:5ad03a73-c72a-d497-85e8-666af6995b49, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname01v;

    /** LNAME01O (uuid:b4b3840f-4eda-726e-6e5b-123d7eff9607, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname01o;

    /** UTYPE01C (uuid:e57060cf-e79e-5602-ed04-8fc460372221, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype01c;

    /** UTYPE01P (uuid:1148d383-700e-585f-1502-2b2a49455e33, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype01p;

    /** UTYPE01H (uuid:4d2ff57a-43a6-96f3-1334-bc643e909ab3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype01h;

    /** UTYPE01V (uuid:1728e98d-9140-9102-bf6f-8cf512f823c8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype01v;

    /** UTYPE01O (uuid:ba269a7f-aa45-5ac6-5745-ddfb18d0e2d5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype01o;

    /** SEL0002C (uuid:4cdcd7de-4918-32e1-a5e1-a1706a998d61, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002c;

    /** SEL0002P (uuid:f5e5785a-f6ab-54f9-3108-d46a6bed51f4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002p;

    /** SEL0002H (uuid:f275c587-5318-6e3e-1923-5294fe06429d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002h;

    /** SEL0002V (uuid:0e0129e2-1722-e7cd-a8dd-0ebe3ddd1fc1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002v;

    /** SEL0002O (uuid:c475e82c-6ec6-6948-74f0-3a40e4f32b6e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0002o;

    /** USRID02C (uuid:4705bae3-0327-bff5-0c39-fa8d088d5d83, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid02c;

    /** USRID02P (uuid:98111797-feb0-2562-99fd-51b254707c39, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid02p;

    /** USRID02H (uuid:db5ef5c6-f48e-7902-0350-81a41e07a504, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid02h;

    /** USRID02V (uuid:f0b32a92-161f-cd4c-36c8-86f8a6e37438, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid02v;

    /** USRID02O (uuid:b6c665bd-2989-ab05-92b5-d4a83a2bccff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid02o;

    /** FNAME02C (uuid:f5423a97-1965-702c-9331-0301788ee374, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname02c;

    /** FNAME02P (uuid:abdfd4fb-09a5-e07a-16c1-43c7731ac465, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname02p;

    /** FNAME02H (uuid:51f53ad4-1d96-1a13-d86a-41306b4baf97, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname02h;

    /** FNAME02V (uuid:71d8e2a6-9491-462b-f0c2-1c58690d6716, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname02v;

    /** FNAME02O (uuid:b80d724a-7c99-c160-7599-fca8c4be26ec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname02o;

    /** LNAME02C (uuid:32ed55c0-92b2-2480-92ed-fd262d550b50, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname02c;

    /** LNAME02P (uuid:6255dd80-0403-23b8-fadd-b8b50ea55db9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname02p;

    /** LNAME02H (uuid:d18a2344-4320-2ee8-b644-9f94b1694f34, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname02h;

    /** LNAME02V (uuid:0c0fd1fd-e9e4-4416-b963-e81fba66caf0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname02v;

    /** LNAME02O (uuid:233c3939-182c-7a31-f872-ac98829c8799, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname02o;

    /** UTYPE02C (uuid:52412515-f4fb-bb48-ea41-f6258adfb955, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype02c;

    /** UTYPE02P (uuid:97e8c085-1a0a-b324-fc66-fdd75c8705fe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype02p;

    /** UTYPE02H (uuid:0b27f662-7c9d-c237-ce3a-33167f33576d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype02h;

    /** UTYPE02V (uuid:5dc1ee2b-3641-d436-8fb1-fe2cce893ab1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype02v;

    /** UTYPE02O (uuid:30f4a58b-2f4b-e2d6-52b6-d25b6e390157, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype02o;

    /** SEL0003C (uuid:ab186180-76e0-92af-7d31-9921a66aee8c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003c;

    /** SEL0003P (uuid:7fe14575-42e6-d29b-31aa-dbe63ef759ca, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003p;

    /** SEL0003H (uuid:1645ae1e-3542-1c49-6e04-417af8c18bac, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003h;

    /** SEL0003V (uuid:ebcc4f6b-74d7-ac73-2513-c180a68498cc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003v;

    /** SEL0003O (uuid:6c14933a-5b1c-5466-104a-903db859df1b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0003o;

    /** USRID03C (uuid:07d1277d-c1b7-24db-9ebe-00b4c8a7ec6f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid03c;

    /** USRID03P (uuid:cc17801b-e07f-e8fe-ad2b-7ed276dd1e68, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid03p;

    /** USRID03H (uuid:483eb04d-2f74-8504-8243-62beffe1c7d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid03h;

    /** USRID03V (uuid:5c3d28fa-7a1a-47df-28e6-4eac52e90002, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid03v;

    /** USRID03O (uuid:fd13f7cf-f00f-c179-9e1f-bd4f278841db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid03o;

    /** FNAME03C (uuid:17283450-6122-9c34-c2d8-629e1f36d593, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname03c;

    /** FNAME03P (uuid:0e034333-7877-ce3c-35aa-52cdf7c79b27, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname03p;

    /** FNAME03H (uuid:4b9735c8-4f6e-8688-064f-814cbe88aa43, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname03h;

    /** FNAME03V (uuid:34ffe22c-c8aa-fb58-64f7-3fe0db1ae9d6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname03v;

    /** FNAME03O (uuid:898e6f4c-4e5a-e778-6fa7-4d96bd1709b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname03o;

    /** LNAME03C (uuid:240e69d6-f684-d2fe-2254-5db5f41fa232, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname03c;

    /** LNAME03P (uuid:b3684ba4-a9ca-4e02-41e2-ee83ea0e2784, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname03p;

    /** LNAME03H (uuid:a33bee46-2c18-71a8-9941-0d9267bb0956, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname03h;

    /** LNAME03V (uuid:b0d0b9f4-c490-6950-1364-8c924664e49e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname03v;

    /** LNAME03O (uuid:e5e46397-27c2-16d8-6792-4b2a26701625, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname03o;

    /** UTYPE03C (uuid:5593bf65-8da8-2618-4839-f89ba8bbcd22, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype03c;

    /** UTYPE03P (uuid:36d51b27-94f1-0698-d444-ac796943bbe5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype03p;

    /** UTYPE03H (uuid:9cf17a6a-4fbf-a30e-e5cd-95d39e5571dc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype03h;

    /** UTYPE03V (uuid:4fa9aa99-1698-a3b3-bf27-36d40c472ee2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype03v;

    /** UTYPE03O (uuid:d4a94b40-7014-e194-e0c0-c3857c21d2e6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype03o;

    /** SEL0004C (uuid:5e2dbb05-c5be-a467-0550-f8a4f984fcff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004c;

    /** SEL0004P (uuid:87c100c1-29c6-5ad2-3deb-fb6d0a14cb75, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004p;

    /** SEL0004H (uuid:5fe78352-3ee7-ebfb-6c18-156d61895ad1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004h;

    /** SEL0004V (uuid:f447820c-29aa-f9fd-df1e-9d8601c59fb2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004v;

    /** SEL0004O (uuid:f605727d-072d-35c4-783f-395d1df74b72, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0004o;

    /** USRID04C (uuid:e48d8dca-922e-6f63-0483-3cf0d852f489, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid04c;

    /** USRID04P (uuid:9313a69d-bf0b-a73f-9e10-69fadec279df, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid04p;

    /** USRID04H (uuid:5704b202-92d6-7757-1ba4-9d1c1c38e353, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid04h;

    /** USRID04V (uuid:955c4b6a-0adb-1ff7-793e-d3ea9c028342, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid04v;

    /** USRID04O (uuid:47945b0d-a119-1517-f082-354e457cc748, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid04o;

    /** FNAME04C (uuid:743a4d48-9429-82bf-506b-1bcbcf7e3751, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname04c;

    /** FNAME04P (uuid:49b32960-c8a9-b512-c3da-e32f33dab1b8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname04p;

    /** FNAME04H (uuid:928f8fbe-38ce-2bd9-0299-c2dd3dc9030b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname04h;

    /** FNAME04V (uuid:828af2ab-fcc9-8223-be90-7ca902aa0300, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname04v;

    /** FNAME04O (uuid:13e4075e-4726-e450-bcba-1cb7f0cd1ab9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname04o;

    /** LNAME04C (uuid:97516e00-a373-06b1-bee3-cf87d9e705e9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname04c;

    /** LNAME04P (uuid:f97462cb-af25-dadd-d9f7-3e1678a63249, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname04p;

    /** LNAME04H (uuid:7ce5541c-b0ff-433d-cf23-61a53cda1cc6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname04h;

    /** LNAME04V (uuid:f1f2240e-9a31-420e-9e7e-f37a6fc8e491, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname04v;

    /** LNAME04O (uuid:a6d13df8-1b15-b731-d618-22f8bdad7817, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname04o;

    /** UTYPE04C (uuid:ba5b998b-5a65-a168-7f1a-2d8f9d4ec6a8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype04c;

    /** UTYPE04P (uuid:b78f3e5c-c46f-9f1f-88a3-007b0b705211, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype04p;

    /** UTYPE04H (uuid:cea600e0-3057-ef95-c4eb-2997993011cc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype04h;

    /** UTYPE04V (uuid:dd952262-8ffb-379b-ce42-d4b52d488e74, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype04v;

    /** UTYPE04O (uuid:1b451df7-3689-0254-e727-2e69a98fb931, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype04o;

    /** SEL0005C (uuid:ad957b78-5790-8591-c870-fdbaf1247dad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005c;

    /** SEL0005P (uuid:44daaceb-e821-017d-2ab1-cbe98f565e53, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005p;

    /** SEL0005H (uuid:b489a3b4-56f2-e9a0-d6e8-0cb034cd3201, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005h;

    /** SEL0005V (uuid:6379115b-a4dc-a26b-764c-ef7bc1a473d1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005v;

    /** SEL0005O (uuid:cfd3b440-3991-a397-c57f-36cfaba5d574, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0005o;

    /** USRID05C (uuid:98419339-492b-c1b6-0f62-2776abb90466, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid05c;

    /** USRID05P (uuid:1bf33b24-e4ad-bb49-6c2b-8529d2f4982a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid05p;

    /** USRID05H (uuid:1639f941-dfbd-d50d-a18b-bfcb1454eaf4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid05h;

    /** USRID05V (uuid:7d35b924-de73-c1fc-7a4c-f9b20576c0d8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid05v;

    /** USRID05O (uuid:7106caad-a19d-0b4e-208a-248e2f5cef3c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid05o;

    /** FNAME05C (uuid:ffda1547-5390-6b66-c00e-62f5519df144, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname05c;

    /** FNAME05P (uuid:75cff71b-7e92-1b26-e999-96f5c9be0723, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname05p;

    /** FNAME05H (uuid:1d7c1811-56d2-7b0b-e142-79a837442d65, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname05h;

    /** FNAME05V (uuid:fa9c922c-53aa-c080-3867-902e2f5acee1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname05v;

    /** FNAME05O (uuid:710ec879-7607-0c9d-2298-24baca2cde04, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname05o;

    /** LNAME05C (uuid:447ad454-93ff-c3b5-2ea4-5cf69e0e50d2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname05c;

    /** LNAME05P (uuid:2d5d20a8-8337-3b81-0c2a-aaa2fc49e297, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname05p;

    /** LNAME05H (uuid:e70848d0-80b9-9e00-e126-745c55aa2d24, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname05h;

    /** LNAME05V (uuid:5ecd22ee-d991-2221-4c82-100392f36a70, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname05v;

    /** LNAME05O (uuid:127906cd-0967-e6ca-f8d9-27c0a2d7fcc7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname05o;

    /** UTYPE05C (uuid:4cbe471f-fe30-e4bc-2c31-bd7f559e771b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype05c;

    /** UTYPE05P (uuid:80641739-94db-bc36-fae7-c384de4cddb6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype05p;

    /** UTYPE05H (uuid:4daf1b43-ed28-bbd1-18c2-a9a36ecb7805, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype05h;

    /** UTYPE05V (uuid:3e3b8394-23cf-8d45-ec87-fe7e3532cabd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype05v;

    /** UTYPE05O (uuid:f6ea9001-b86f-8301-2a92-7767ec816466, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype05o;

    /** SEL0006C (uuid:160ec441-53e7-5292-2fb4-6f6b0e34f688, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006c;

    /** SEL0006P (uuid:85c6d226-f074-592c-b08b-0192c0ce4d4c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006p;

    /** SEL0006H (uuid:38a82f2e-5a3f-b5cd-1071-14c294f9f77c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006h;

    /** SEL0006V (uuid:ac7bf172-b99f-8793-fcc5-e361e7e9996f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006v;

    /** SEL0006O (uuid:2e4b5a78-0f65-abb8-6f10-b4eda3e2ebfc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0006o;

    /** USRID06C (uuid:95b132ee-068a-64c7-70e6-f7677d3ee0f4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid06c;

    /** USRID06P (uuid:2035106b-ef7d-4951-0614-091e84a8d09a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid06p;

    /** USRID06H (uuid:683fe7ad-6e51-53c7-0108-41a01e873815, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid06h;

    /** USRID06V (uuid:9e59cdb5-2a7b-11d7-d770-3c964ff11341, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid06v;

    /** USRID06O (uuid:d667034e-1837-2a3a-ecad-0119f946fad2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid06o;

    /** FNAME06C (uuid:d916ea7a-8748-664f-59b6-8cb9740c9d85, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname06c;

    /** FNAME06P (uuid:1958f4c2-2a57-f3a7-de3d-a956ed1b9d71, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname06p;

    /** FNAME06H (uuid:aa617333-4248-3f4b-82c2-54a9093449f6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname06h;

    /** FNAME06V (uuid:a6054393-ae08-d706-750a-8e2ae7e85130, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname06v;

    /** FNAME06O (uuid:2ed84a91-ab0c-8a0a-4b13-6136c71a978e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname06o;

    /** LNAME06C (uuid:cb9f35c1-0cf6-f0ca-61a1-c03b706eefa2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname06c;

    /** LNAME06P (uuid:d3f05622-f408-8829-7aa8-b0230d7ff256, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname06p;

    /** LNAME06H (uuid:46366b46-1af1-95b0-248d-8a4587b8c9b1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname06h;

    /** LNAME06V (uuid:15917899-cc32-5884-cff9-f3895cde2141, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname06v;

    /** LNAME06O (uuid:ed10325d-b645-9c4f-1174-47cc13132d74, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname06o;

    /** UTYPE06C (uuid:5bc40361-2f9d-42f7-cba3-07a0c883023a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype06c;

    /** UTYPE06P (uuid:628ec3a8-8b28-cad4-d57e-97ea900f9c7f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype06p;

    /** UTYPE06H (uuid:659ed793-dea1-8117-5beb-51bf4d907cea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype06h;

    /** UTYPE06V (uuid:cb186120-2a49-65d2-2e3e-ed8d2a5e8181, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype06v;

    /** UTYPE06O (uuid:f739766b-fa64-9893-9afe-9f4f6aad007c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype06o;

    /** SEL0007C (uuid:62065291-311c-a9eb-8d18-950cd95420f0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007c;

    /** SEL0007P (uuid:74dbe2c4-3a50-cbc8-f06c-f8d5f6cb8c54, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007p;

    /** SEL0007H (uuid:020a5342-2cc3-76cd-4ef2-b216df7a64ee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007h;

    /** SEL0007V (uuid:002ee84b-3b9e-1273-8f04-2ac2c106404d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007v;

    /** SEL0007O (uuid:da7f0bb6-e72a-7881-8e75-c20b9164496e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0007o;

    /** USRID07C (uuid:99cea83b-317d-27b5-b45e-a78d55e32edc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid07c;

    /** USRID07P (uuid:60413013-b689-5d48-26eb-52aa5796aef6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid07p;

    /** USRID07H (uuid:90900fb6-07c5-f1b4-1ad9-c3d048fcd1d5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid07h;

    /** USRID07V (uuid:bf2d659b-3455-acb0-3b14-84616a9b5e71, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid07v;

    /** USRID07O (uuid:05d30bed-3191-7e2b-37a1-081c9b771b7c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid07o;

    /** FNAME07C (uuid:0109cacc-ef92-01bc-e359-600da43ecd2d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname07c;

    /** FNAME07P (uuid:f9e8b1ff-e5af-5182-a05d-ae7ede56d601, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname07p;

    /** FNAME07H (uuid:0aa1b22c-60d5-d198-66c9-5a35c6aa111b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname07h;

    /** FNAME07V (uuid:cdc5dfae-1112-0f14-3821-e83924ab0146, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname07v;

    /** FNAME07O (uuid:30c576ec-6035-902b-6ffc-4996aaceaa35, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname07o;

    /** LNAME07C (uuid:503f2062-0ed0-5cfd-a99f-15ed2642208d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname07c;

    /** LNAME07P (uuid:2b35df37-9a58-2ae9-f5df-54b78ec2ad1c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname07p;

    /** LNAME07H (uuid:b2b9b0a1-c058-8fdd-00ca-04ba2fc086b8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname07h;

    /** LNAME07V (uuid:6f75c843-f571-51d5-ef58-4b275ea9f71a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname07v;

    /** LNAME07O (uuid:add5c806-ccaf-8389-c19e-cca65b949ff1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname07o;

    /** UTYPE07C (uuid:9074db51-7adc-0036-c062-9ba8d847ea1e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype07c;

    /** UTYPE07P (uuid:25a6c869-cfca-1fe2-9902-d66eec66fcf1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype07p;

    /** UTYPE07H (uuid:f2ff18c4-3eee-677a-5700-746e6496ecb2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype07h;

    /** UTYPE07V (uuid:19055ac5-119f-9516-1643-6c6b5d9d670d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype07v;

    /** UTYPE07O (uuid:3db779e6-a258-395c-0ccd-38ece9a9ac8d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype07o;

    /** SEL0008C (uuid:b1a60aed-909b-d515-7a8f-b380eb38aa8a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008c;

    /** SEL0008P (uuid:9a333826-619b-0368-a8d1-3f2fef22bbb4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008p;

    /** SEL0008H (uuid:354deb0d-9d17-6d33-e36b-d645b1ae2e7f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008h;

    /** SEL0008V (uuid:eda28614-e0dc-83b1-5d90-b0b441cb284a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008v;

    /** SEL0008O (uuid:aa7e70d6-0c70-bfdb-f291-407bf6ed55fe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0008o;

    /** USRID08C (uuid:6589d1e0-0565-d8ca-1d3b-84296e816a00, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid08c;

    /** USRID08P (uuid:4bd300b2-9aee-4b80-8a37-464033340e5d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid08p;

    /** USRID08H (uuid:470f1adc-37cb-668b-be18-545c40b98645, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid08h;

    /** USRID08V (uuid:28e2c587-9ed4-9b08-08e8-b03ee75704ae, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid08v;

    /** USRID08O (uuid:90e87504-baad-ea35-e4e0-e0d25a9e643b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid08o;

    /** FNAME08C (uuid:62929624-b75b-b388-7277-f903547c7aba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname08c;

    /** FNAME08P (uuid:8bcd3b4d-be06-f9e1-4e6f-142463f4c8c1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname08p;

    /** FNAME08H (uuid:9256b80d-dc65-882a-c12f-03c0bd842ebe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname08h;

    /** FNAME08V (uuid:97a0d973-b547-53fe-18ee-9fd16fc96457, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname08v;

    /** FNAME08O (uuid:646ec4b8-8db6-911f-38e0-49bd264987ea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname08o;

    /** LNAME08C (uuid:e1c99935-9dce-8203-e2fd-658164c773fb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname08c;

    /** LNAME08P (uuid:2d18fa0d-2d33-a8d4-3a7e-161ec0c7a35c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname08p;

    /** LNAME08H (uuid:9da94d7f-6a02-272c-37b7-0d244a16fd8b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname08h;

    /** LNAME08V (uuid:bb936ab1-6ea2-daaf-6cd3-06c7417c982b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname08v;

    /** LNAME08O (uuid:588c0ed6-c136-b267-d8bf-e434cf7866f0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname08o;

    /** UTYPE08C (uuid:f26fe219-e7d3-e2bf-45f5-cb8ac251f062, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype08c;

    /** UTYPE08P (uuid:a76f2417-97b7-c23f-1646-bb4ae805a6ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype08p;

    /** UTYPE08H (uuid:6077f373-2f01-820e-0f10-d15c2afdd44b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype08h;

    /** UTYPE08V (uuid:2978f6c2-c975-d4d1-360a-6866f06aa94e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype08v;

    /** UTYPE08O (uuid:0204dcea-854d-15d7-9f09-8d10cd704465, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype08o;

    /** SEL0009C (uuid:6c0c701f-902c-3684-206d-aff27d7b310a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009c;

    /** SEL0009P (uuid:99122daa-27ae-32c5-c214-698a5627a26c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009p;

    /** SEL0009H (uuid:0cf63d31-be9e-75f9-c779-a980101377b6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009h;

    /** SEL0009V (uuid:59604161-fe43-026f-c95a-92be8049664a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009v;

    /** SEL0009O (uuid:6253818c-6209-f0a4-6800-ba30bf00fee6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0009o;

    /** USRID09C (uuid:87829691-ec15-020b-2627-54f37b5cf5d1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid09c;

    /** USRID09P (uuid:efbd39db-f997-551c-9bae-877020c551c9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid09p;

    /** USRID09H (uuid:9e8c6e97-13a3-6c54-17ca-011c699398c0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid09h;

    /** USRID09V (uuid:7fff8eee-51f5-42e3-f86f-cc23d9383b71, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid09v;

    /** USRID09O (uuid:aa119f8d-db30-dc50-a4f0-52ea0ca213dc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid09o;

    /** FNAME09C (uuid:afe1f4be-a6fe-24fe-1e6f-f95e967cb78e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname09c;

    /** FNAME09P (uuid:ff9bda8b-2285-8415-c627-316d477f611a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname09p;

    /** FNAME09H (uuid:734cbd33-913a-baaf-0b91-ab451f87ebcb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname09h;

    /** FNAME09V (uuid:665757c3-0ae5-2fd5-b55e-b623393b0990, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname09v;

    /** FNAME09O (uuid:a6706e41-f192-ebdc-3bc6-6fea85d8b27d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname09o;

    /** LNAME09C (uuid:1ecb5433-ee87-0141-efab-e7d2be3e1fef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname09c;

    /** LNAME09P (uuid:b5b89b5e-f2f5-24cd-a0fc-5aee1a6f3ee1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname09p;

    /** LNAME09H (uuid:5a758c2c-de26-8a69-b048-3ca97bd8597a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname09h;

    /** LNAME09V (uuid:4b0ceb60-a64b-923c-60d7-9b11726d6513, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname09v;

    /** LNAME09O (uuid:c33d1192-3c02-5418-dc65-e950e9e61b09, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname09o;

    /** UTYPE09C (uuid:d83a11c0-0c11-3fa7-0637-8fdd6f2b5075, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype09c;

    /** UTYPE09P (uuid:f15c63fd-ab19-41c8-f282-559db0b71f45, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype09p;

    /** UTYPE09H (uuid:82ce3622-d35d-4434-947c-fd552087b430, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype09h;

    /** UTYPE09V (uuid:23b1f9e5-25f8-5a2a-71a7-6d16b4556318, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype09v;

    /** UTYPE09O (uuid:333e46f3-c5d7-12b0-23a9-b2e9dff6a7f7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype09o;

    /** SEL0010C (uuid:2838e4f1-1ce8-7693-4dd9-c30a83d698d9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010c;

    /** SEL0010P (uuid:578b5854-19df-8b26-4fd5-fbd5ee4e332a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010p;

    /** SEL0010H (uuid:c00a75a4-3bbd-c123-500e-7574abde3a6d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010h;

    /** SEL0010V (uuid:219d93be-9217-6330-284a-3fb708e4d6c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010v;

    /** SEL0010O (uuid:bb763771-093e-75ee-1a4e-99bc49d04478, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sel0010o;

    /** USRID10C (uuid:6731c27a-0914-fa1c-5e06-34ce9d07e4df, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid10c;

    /** USRID10P (uuid:76ef7cf5-87f0-81ae-9f96-c9a8841156ad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid10p;

    /** USRID10H (uuid:9168563b-1147-1fb5-9b60-791c2f8876b0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid10h;

    /** USRID10V (uuid:7e1c3efc-a462-1655-1865-c6c2e9b1637b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid10v;

    /** USRID10O (uuid:1d7f25e4-962c-e13d-3690-9e971cb63b11, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usrid10o;

    /** FNAME10C (uuid:c7f014ca-714f-d4f6-2019-4c67c23d9194, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname10c;

    /** FNAME10P (uuid:52e5df84-63da-b83f-3096-0c83969ffd9a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname10p;

    /** FNAME10H (uuid:de42b20c-2746-7849-2a36-71ede2cde9f2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname10h;

    /** FNAME10V (uuid:e23bcfa9-f049-ebb7-0491-9e85000ed7e9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname10v;

    /** FNAME10O (uuid:63aeaf63-bde4-d47b-bcb2-7f853125b845, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fname10o;

    /** LNAME10C (uuid:2c55bf05-2cb3-a3e9-d336-78a9c3bb2b9a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname10c;

    /** LNAME10P (uuid:914768a4-8c05-ce80-9338-f6fa46163a8b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname10p;

    /** LNAME10H (uuid:142cfa0e-486e-ac30-d1b1-e0b4370ade0f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname10h;

    /** LNAME10V (uuid:9865f1f8-8183-af98-8943-8bfe17f8364f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname10v;

    /** LNAME10O (uuid:25b58a41-d076-4c34-bc58-f2d5967fd467, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ lname10o;

    /** UTYPE10C (uuid:4cafa958-05c5-1780-fc3c-418f271d04ed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype10c;

    /** UTYPE10P (uuid:632d9766-4216-911d-eb76-004a583cea89, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype10p;

    /** UTYPE10H (uuid:72b62d72-a970-9e4c-e724-bf860006cae2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype10h;

    /** UTYPE10V (uuid:00af6e61-b4d5-edce-33b1-8324acd5ef68, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype10v;

    /** UTYPE10O (uuid:92a17101-d1c0-21da-4b8d-08b7794f8bfa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ utype10o;

    /** ERRMSGC (uuid:80a0f61d-d468-a966-7542-7fb920eee59d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgc;

    /** ERRMSGP (uuid:e64b9177-77e6-e8c4-da79-c090d1393752, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgp;

    /** ERRMSGH (uuid:5f5e791c-cfdb-f7d1-ff00-ed13c2d4b3aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgh;

    /** ERRMSGV (uuid:03763aa1-4090-61ff-d79d-9b2a712bf6d8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgv;

    /** ERRMSGO (uuid:e305d0fa-279e-a82d-bc3a-2ef29878e2cb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgo;

    /** CCDA-SCREEN-TITLE (uuid:f894c46d-5d06-79ba-7175-3f56ddaacd79, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:4be91731-3f40-34e5-68b2-3cba821ac2e5, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:a3490b5d-324f-91d5-704e-0f4e2886c11d, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:6ec3a61b-6dfa-d81d-1c63-62986b0ed2bd, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** WS-DATE-TIME (uuid:a751b681-52ca-b549-8d60-8a0454233f96, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:694d304b-8048-f911-21ee-b9cef14b8800, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:1fa276ef-bac0-71c2-03c3-aefc0c038e77, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:cbd6b56e-efda-d93a-60ff-e2af0473ece1, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:a9e349b0-2476-3484-f98a-ddfaa7d882c0, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:e93e75f0-a95c-a0ce-f234-7f6259cef55f, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:501b1561-6216-7d50-fecf-d80e2da52a07, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:cc3dd6b2-94cb-a35b-755d-355289c099ee, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:fb79b6b2-ca0a-615e-00bb-9df8712db23e, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:3293fc42-7adb-f397-d314-aaa5675800d7, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:8375c0fd-6f96-63c0-04fa-27127bb2c78e, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:d4ebf5d1-288b-dcd5-f95d-87e1e44508c9, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:a2cf7edc-3c32-2b83-937b-4bdb60993241, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:48c5cd87-7f74-85ac-2dc0-9dea60a7c6b5, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:8e7d3746-04ec-c7fe-7a16-96c70769d4ca, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:021cadf1-f637-2190-5e1c-2085349af22d, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:c19c6880-3c41-fae5-6095-61ff00bd6f46, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:37d8f8dd-eb5f-e193-a31b-e1b7e40e299f, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:304633e1-05ce-26cb-5c59-d7a6f14a2b49, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:5943a94e-f4cc-6af2-3b57-4e074b363afd, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:5a9a7fdc-dcc3-1f7b-26bb-581b330a40df, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:7f51e963-52e2-d988-4c00-c8259e67c4b9, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:6e27ff17-1037-12ad-7169-d709080cebc8, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:2d765277-1f73-c172-4fb2-dbcb4cf2686b, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:17ca89ac-3664-0e1a-8377-fc247b2ef6b5, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:904a6c8a-b00c-e953-da37-34fc30ac58c8, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:22947d84-7e73-c12e-7880-faad7a7e58e2, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:fc9e38f7-1438-288a-07f5-f04312dfc56d, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:b0641db9-c6fe-03c6-0686-1639e0b00b4b, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:1d94f409-9456-f56e-b587-1db7d8db42f6, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:74ead96a-2905-6937-068c-22217e7c59ef, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:22b75617-bbb9-ec5f-3db0-665e513fe259, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** SEC-USER-DATA (uuid:31eccc4e-9d77-6be8-842b-02750129f8c5, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ secUserData;

    /** SEC-USR-ID (uuid:6bb71ce1-d926-d66c-9658-539f6ed7eee4, level 5, PIC X(08).). */
    public String secUsrId;

    /** SEC-USR-FNAME (uuid:a1353a2f-ba37-fa50-2430-26efcfc06e32, level 5, PIC X(20).). */
    public String secUsrFname;

    /** SEC-USR-LNAME (uuid:9dae32c0-e2ee-532b-76ed-bb9846959a75, level 5, PIC X(20).). */
    public String secUsrLname;

    /** SEC-USR-PWD (uuid:dcdc4ead-ae96-76ac-9cd6-61deb3827d08, level 5, PIC X(08).). */
    public String secUsrPwd;

    /** SEC-USR-TYPE (uuid:337082b2-6457-147d-a49a-51745a0780a5, level 5, PIC X(01).). */
    public String secUsrType;

    /** SEC-USR-FILLER (uuid:cc1cf97b-a98a-a1f6-e440-70c269645bf5, level 5, PIC X(23).). */
    public String secUsrFiller;

    /** DFHAID (uuid:29a19b25-2de0-0cc4-7d5a-17186ef61fe4, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:7b10147d-5b4c-abf3-08de-aa88e2304511, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:3026f0a4-97ad-ab8c-9b52-7636fa707f6d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:722d93fb-24e1-78ff-6ce8-fdb451079ab3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:8c4c157b-89c5-10dd-abac-4d46af73863e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:04d90194-adcc-5521-a7d3-f33510db685b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:8926e961-8741-9182-3cee-23dc8dd8479a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:6a077eba-5778-9ae1-ce0d-ad2d778a0f47, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:d35c1ab0-91ef-f429-5e2a-105f96c1bfcf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:e651ef74-0822-8f0b-efbd-e8a188ef842a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:4a151413-1713-2cad-3b3a-66bab04591fa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:cdd6903b-3cf3-26d0-e108-5bffc5fda2b5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:6b19b3ce-c1f8-b7d8-5c47-819d389f849e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:7036a635-e4df-3c08-6bcd-dad0fe973884, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:2a2206ff-d3da-a7b5-3516-596fd4f0469d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:9d168903-c475-8ea6-9b63-b98e3e0e82bc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:6537acc9-a823-3178-bc74-ef8f6299a227, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:c03e4137-d1ef-a8f1-1e5d-84496f4d7233, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:45668e9c-0f56-e368-c98b-a4fe6c29e683, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:2dc54f8c-8908-a7d4-8d5a-b587268b77d6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:7abc071b-6a9b-a2ce-a9a9-337b6b0649d6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:b1db8b96-cc14-429d-eaa2-8e66905cbb80, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:d0acf79f-d077-e4d9-a2f3-cce4d823328c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:d32d0080-18d4-d259-2366-610c1b71c3b8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:75ab3a7b-d128-3449-ec39-96c95dc77714, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:a763782f-ad04-eaef-90bc-5ef7c13f787f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:a0eae165-1752-15d7-a2fa-e3c0a6bf8961, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:6000ec07-4c94-c016-48ac-50303cf217cc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:9a152f29-b5f5-e380-c629-ac17c1548344, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:bd55e725-7abf-af16-c65d-2674f5341ea1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:a887a45f-ad07-c0d2-e5e4-21435c296797, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:6d1a7ee1-2715-55a8-738c-1f027a751e1b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:59cead44-0840-a104-eb60-02abfc1c1f2f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:5e8496fd-31cb-75f3-fd90-741c5947ad79, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:7ff3f86c-24ed-1786-5db9-45a0e50ec362, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:87424513-00e3-6d77-5259-7ecf81b01c74, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:e1b9f0be-3e6b-215c-0375-3ee7d7e9f2dc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** DFHBMSCA (uuid:c90296ee-52ec-ca32-3483-b88f5684e68d, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:a6895edc-f9d4-8327-865f-e471822b8277, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:19d78bb4-5d81-029a-4f33-4deab4b4e53e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:2951562d-46fe-a67b-b961-cafa57e5db9d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:5d067fd6-cef4-642d-2357-68a733e54781, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:f8a1f69c-32ad-0b70-3f3b-4d663992c5a5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:a5d59c92-a3bd-d631-33f1-8ec87397af18, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:30433d8d-cf1b-ec20-f7c7-eb94690ebf87, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:c89a8fa5-d7cf-4e12-3198-6b5a9b1735a1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:e5da10ae-3902-c55e-7a28-11f3708ed8a6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:ef889210-52f7-b775-116e-286c14453e8a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:f064173d-0c5f-9fd4-96c7-4d648afa3c15, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:e2a85caf-582e-6aa8-5cb6-87990f1a361b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:b96df379-00a8-b10e-1e54-6e0a0a7315c0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:f072046e-0f42-3f31-5091-67f955ac9956, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:f072a85f-22d1-8f1d-d15f-ea395846096b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:f9358499-961d-b5b1-5d58-f30445db3b4d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:d85d6d92-f1ca-8880-d931-9e93347899cd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:7c20b176-b3c7-c052-5935-af2b54d28348, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:93d54bc9-dd3e-02be-e64a-de65642a4402, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:53a90486-4d5b-11b3-638a-8a44e9b3f838, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:c14974bc-cba6-93ef-268b-09ce9055e33a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:71d3dd63-f9fd-681a-5885-7eadef81c5b6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:af78ce0f-3cda-00ad-5231-891d0005d7cc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:f860f2e8-df41-116d-f653-60ca3d4fe420, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:8f5ec434-77bd-2ada-a242-f3d3de54017e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:fa7b5ee5-814a-5b49-98ca-316edce7db9a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:9f29f000-dad2-5781-d9d3-92cbe366ec2d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:c0062e41-413b-756b-d9ae-f58d0aa5be7a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:87d5b2bf-11c1-3c75-10df-2064724bef2a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;


    // --- auto-generated stubs for undeclared references ---
    public Object eibcalen;  // auto-stub for undeclared reference

    /** MAIN-PARA  (uuid:d17d6ce4-d071-1450-2f25-24ae4bc5655c, source lines 1085-1131). */
    public void mainPara() {
        // SET ERR-FLG-OFF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET USER-SEC-NOT-EOF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET NEXT-PAGE-NO TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET SEND-ERASE-YES TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsMessage = "";
        this.errmsgo = "";
        this.usridinl = -1;
        if (java.util.Objects.equals(this.eibcalen, 0)) {
            // TODO: translate body for: EIBCALEN = 0
        }
    }

    /** PROCESS-ENTER-KEY  (uuid:1f65b69d-297b-cb92-099b-c56c8aa54324, source lines 1136-1219). */
    public void processEnterKey() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        if (!java.util.Objects.equals(this.(cdemoCu00UsrSelFlg, "")) {
            // TODO: translate body for: (CDEMO-CU00-USR-SEL-FLG NOT = SPACES AND LOW-VALUES) AND (CDEMO-CU00-USR-SELECTED NOT = SPACES AND LOW-VALUES)
        }
        if ((true /* TODO translate: USRIDINI OF COUSR0AI = SPACES */) || (true /* TODO translate: LOW-VALUES */)) {
            // TODO: translate body for: USRIDINI OF COUSR0AI = SPACES OR LOW-VALUES
        }
        this.usridinl = -1;
        this.cdemoCu00PageNum = 0;
        this.processPageForward();  // PERFORM
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
    }

    /** PROCESS-PF7-KEY  (uuid:37969fe8-3f03-53f0-e2b5-dbe9645466ae, source lines 1224-1242). */
    public void processPf7Key() {
        if (java.util.Objects.equals(this.cdemoCu00UsridFirst, "")) {
            // TODO: translate body for: CDEMO-CU00-USRID-FIRST = SPACES OR LOW-VALUES
        }
        // SET NEXT-PAGE-YES TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.usridinl = -1;
        if (true /* TODO translate: CDEMO-CU00-PAGE-NUM > 1 */) {
            // TODO: translate body for: CDEMO-CU00-PAGE-NUM > 1
        }
    }

    /** PROCESS-PF8-KEY  (uuid:07fd815b-59df-d62e-c924-7fde3e86c751, source lines 1247-1264). */
    public void processPf8Key() {
        if (java.util.Objects.equals(this.cdemoCu00UsridLast, "")) {
            // TODO: translate body for: CDEMO-CU00-USRID-LAST = SPACES OR LOW-VALUES
        }
        this.usridinl = -1;
        if (true /* TODO translate: NEXT-PAGE-YES */) {
            // TODO: translate body for: NEXT-PAGE-YES
        }
    }

    /** PROCESS-PAGE-FORWARD  (uuid:29678f2d-13b0-2c85-f3d9-a381661c4ba1, source lines 1269-1318). */
    public void processPageForward() {
        this.startbrUserSecFile();  // PERFORM
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
    }

    /** PROCESS-PAGE-BACKWARD  (uuid:05a18845-d582-950d-124c-0b781b48e589, source lines 1323-1366). */
    public void processPageBackward() {
        this.startbrUserSecFile();  // PERFORM
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
    }

    /** POPULATE-USER-DATA  (uuid:f2338e86-0ba1-ff35-ef77-4374897a6f35, source lines 1371-1428). */
    public void populateUserData() {
        // EVALUATE WS-IDX
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-IDX */) { /* WHEN branches follow */ }
    }

    /** INITIALIZE-USER-DATA  (uuid:34cd3a11-5702-51be-150f-0efd89674f5e, source lines 1433-1488). */
    public void initializeUserData() {
        // EVALUATE WS-IDX
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-IDX */) { /* WHEN branches follow */ }
    }

    /** RETURN-TO-PREV-SCREEN  (uuid:4fb8af69-94fe-9398-838e-e4f36b8f2401, source lines 1493-1504). */
    public void returnToPrevScreen() {
        if (java.util.Objects.equals(this.cdemoToProgram, "\u0000")) {
            // TODO: translate body for: CDEMO-TO-PROGRAM = LOW-VALUES OR SPACES
        }
        // MOVE WS-TRANID TO CDEMO-FROM-TRANID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO CDEMO-FROM-PROGRAM  -- identifier MOVE; needs PIC-aware type coercion
        this.cdemoPgmContext = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
    }

    /** SEND-USRLST-SCREEN  (uuid:d63f1654-20b1-7449-d018-9646ce2a933f, source lines 1509-1531). */
    public void sendUsrlstScreen() {
        this.populateHeaderInfo();  // PERFORM
        // MOVE WS-MESSAGE TO ERRMSGO OF COUSR0AO  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: SEND-ERASE-YES *>EXECCICS */) {
            // TODO: translate body for: SEND-ERASE-YES *>EXECCICS
        }
    }

    /** RECEIVE-USRLST-SCREEN  (uuid:af5b95c5-a3b5-be46-fe61-5b31ff7ded85, source lines 1536-1544). */
    public void receiveUsrlstScreen() {
        // TODO: implement receiveUsrlstScreen.  See uuid:af5b95c5-a3b5-be46-fe61-5b31ff7ded85
    }

    /** POPULATE-HEADER-INFO  (uuid:42fb1f58-2900-f57f-6090-318061c7a151, source lines 1549-1568). */
    public void populateHeaderInfo() {
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF COUSR0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF COUSR0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-TRANID TO TRNNAMEO OF COUSR0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO PGMNAMEO OF COUSR0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF COUSR0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF COUSR0AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** STARTBR-USER-SEC-FILE  (uuid:c23cd57b-e212-441b-ccff-73f0f54fd301, source lines 1573-1601). */
    public void startbrUserSecFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** READNEXT-USER-SEC-FILE  (uuid:3333ee1f-c551-1543-3b7a-d3f8688ad321, source lines 1606-1635). */
    public void readnextUserSecFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** READPREV-USER-SEC-FILE  (uuid:31cb784a-0a93-d1fa-c0d9-ab91f8b73f50, source lines 1640-1669). */
    public void readprevUserSecFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** ENDBR-USER-SEC-FILE  (uuid:fb9d0d5d-824d-939d-1a92-754232ff731d, source lines 1674-1678). */
    public void endbrUserSecFile() {
        Vsam.endbr("WS-USRSEC-FILE");  // line 1676
    }

    public static void main(String[] args) {
        new Cousr00c().mainPara();
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
