// Generated from COADM01C.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COADM01C.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * COADM01C (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: COADM01C.cbl
 */
public class Coadm01c {

    /** WS-VARIABLES (uuid:0c872477-f48c-522a-d46b-f2c16cf90ec4, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsVariables;

    /** WS-PGMNAME (uuid:1f11b78d-b301-99bb-a0e1-69251ecdac15, level 5, PIC X(08)). */
    public String wsPgmname;

    /** WS-TRANID (uuid:35bf4969-9ac7-8b52-d2d5-33b78defa3b0, level 5, PIC X(04)). */
    public String wsTranid;

    /** WS-MESSAGE (uuid:62526f54-72ef-d4fb-cc6a-a8e05c97f8aa, level 5, PIC X(80)). */
    public String wsMessage;

    /** WS-USRSEC-FILE (uuid:754efada-0bf1-51ac-6257-e67884007e7f, level 5, PIC X(08)). */
    public String wsUsrsecFile;

    /** WS-ERR-FLG (uuid:25bd3054-f5ba-45c4-175e-e46431c1572e, level 5, PIC X(01)). */
    public String wsErrFlg;

    /** WS-RESP-CD (uuid:2c3da5fc-2b57-3263-5666-276618fe2bb8, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsRespCd;

    /** WS-REAS-CD (uuid:46ea693a-aa10-4628-207c-49ac1f06bd4a, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsReasCd;

    /** WS-OPTION-X (uuid:670c3537-e375-795a-8f77-14c0e369dc33, level 5, PIC X(02)). */
    public String wsOptionX;

    /** WS-OPTION (uuid:ab025f87-0194-afb1-3519-78c2ded9262c, level 5, PIC 9(02)). */
    public int /* PIC 9(02) */ wsOption;

    /** WS-IDX (uuid:ce84df33-097b-b2c4-642a-bde786baf451, level 5, PIC S9(04) COMP). */
    public int /* PIC S9(04) signed */ wsIdx;

    /** WS-ADMIN-OPT-TXT (uuid:bacfe46e-e28b-28f4-781b-77f475bce1fb, level 5, PIC X(40)). */
    public String wsAdminOptTxt;

    /** CARDDEMO-COMMAREA (uuid:8219551b-a2a3-6dff-f134-041274b9451d, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:2ac43032-00a9-8b9f-b983-3863798f9f15, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:a34d591f-98d7-0711-81da-e952aa323763, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:684f4fb1-d75f-0904-3880-b9a5c0343927, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:13e8c714-2a82-80bd-8543-fc268e8ea74c, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:a81ab346-37bc-bb4f-324f-2e389b73b552, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:91b6d698-75ca-f225-7a09-a73dbb8f4a54, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:0c5fe2cc-41de-6021-0689-4d4b219617f8, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:0ab7c302-b9ec-e18f-7a73-3d420700e240, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:9b208eb5-3fa2-c7ae-263e-4a5f2f9f78b3, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:c339024e-c59d-da40-6fc5-8930fd11ec27, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:356a1954-2d91-574a-1473-1c87a9a3a80d, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:c5718eaa-6e67-a358-8874-166e04316f73, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:9f2feb37-179a-78cc-92c8-d60cda5674c4, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:aa3a6cb6-e7ea-11ac-925f-5e5b60f6e8ed, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:dd5177e9-7a1b-70e3-a159-beb28f5664fc, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:c77fd1d7-01d9-57ed-1223-6bc282159f5c, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:44f15571-9acf-cb06-f171-ea2f016e6dc5, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:6b462ff9-f5f5-e31e-a03d-3d65ca3fa977, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:dc81c748-e5f0-c941-f99b-073d152d7dfd, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:3e6cce01-ce48-e01c-eb93-3654c6f03647, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:1a59279d-19d2-6123-18d5-dd78fa1adcf0, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** CARDDEMO-ADMIN-MENU-OPTIONS (uuid:1f390ef0-43c6-104c-0ad7-118421404180, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoAdminMenuOptions;

    /** CDEMO-ADMIN-OPT-COUNT (uuid:ca41e33d-c358-e8c5-c882-db7e3cb422c5, level 5, PIC 9(02)). */
    public int /* PIC 9(02) */ cdemoAdminOptCount;

    /** CDEMO-ADMIN-OPTIONS-DATA (uuid:0eeccc41-fa56-4742-cfb5-ad8161da3395, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAdminOptionsData;

    /** CDEMO-ADMIN-OPTIONS (uuid:bae6c80b-23dd-0dee-3608-685b42560e62, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAdminOptions;

    /** CDEMO-ADMIN-OPT (uuid:4a7a6117-babe-acf4-fe89-3d3d7ea718f1, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAdminOpt;

    /** CDEMO-ADMIN-OPT-NUM (uuid:006fc5e9-4156-38d0-62f5-6470c4f91991, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ cdemoAdminOptNum;

    /** CDEMO-ADMIN-OPT-NAME (uuid:611492e0-f69f-66aa-fcc9-d960b6557eb8, level 15, PIC X(35).). */
    public String cdemoAdminOptName;

    /** CDEMO-ADMIN-OPT-PGMNAME (uuid:26466732-8723-0c86-a88a-28f2f4b0e084, level 15, PIC X(08).). */
    public String cdemoAdminOptPgmname;

    /** COADM1AI (uuid:67a0c5ac-d233-c401-f7cb-9edaae2177d8, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ coadm1ai;

    /** TRNNAMEL (uuid:238920f9-e146-2ce0-9043-f8e09225c1f1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamel;

    /** TRNNAMEF (uuid:cac4f69e-46f6-1c95-5aaa-4f543d67568c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamef;

    /** TRNNAMEA (uuid:64305b33-eaae-41c8-0e83-d85a18981fd1, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamea;

    /** TRNNAMEI (uuid:809e3012-9b14-93bc-3c93-c1a2627e7929, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamei;

    /** TITLE01L (uuid:040620f4-1fad-2e86-84b1-b360ccb64e08, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01l;

    /** TITLE01F (uuid:fc5d45a0-6a24-ad9c-b3c7-7559542b3a95, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01f;

    /** TITLE01A (uuid:0a9d846e-7f31-16ef-f234-6c2fccaec58b, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01a;

    /** TITLE01I (uuid:40ff3b3b-8880-ae18-7ca5-8d2aa1c380d2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01i;

    /** CURDATEL (uuid:89336537-f6f8-a42e-a8d8-a1eceffb9e06, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatel;

    /** CURDATEF (uuid:7c38691a-87bb-f392-5f7b-c668151362c5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatef;

    /** CURDATEA (uuid:9a14de28-9dbc-2464-39bd-051bca584130, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatea;

    /** CURDATEI (uuid:bf9dd442-79fe-87fa-7f16-dc939fdf41c2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatei;

    /** PGMNAMEL (uuid:237e5d31-4484-c2ea-762c-63acb5fa76ff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamel;

    /** PGMNAMEF (uuid:bb3c4e22-9b7d-8f4a-ec8e-7d302d8af780, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamef;

    /** PGMNAMEA (uuid:a3ea99ed-ea54-d5ef-88eb-51469c4d82e7, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamea;

    /** PGMNAMEI (uuid:c5337f3b-fe8c-ebd8-d81e-cb41301dcf9e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamei;

    /** TITLE02L (uuid:ea0fc970-d778-dc29-a5c3-e47c8a4b8ddf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02l;

    /** TITLE02F (uuid:08bf0309-f7ee-bd54-b018-7171147fdb6e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02f;

    /** TITLE02A (uuid:4a9a9912-e059-f264-ef62-5cd6e22acee2, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02a;

    /** TITLE02I (uuid:43c42518-6a2f-cbca-f28a-ddc1d77c87e5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02i;

    /** CURTIMEL (uuid:b877aa8c-f21c-64aa-c89a-72a3e6a3099f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimel;

    /** CURTIMEF (uuid:1c0441a1-6f5f-f3aa-47b6-b6921dce0911, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimef;

    /** CURTIMEA (uuid:93dc0a76-d673-44dc-6276-dbdfb6b3419b, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimea;

    /** CURTIMEI (uuid:ea0e6c95-d1bb-c99d-2f83-319b3666e17e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimei;

    /** OPTN001L (uuid:c9646b66-d902-d470-44a6-32a0e4b09a3a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001l;

    /** OPTN001F (uuid:45b33d4e-8b8e-17ed-c5ca-3aa2b6e15fff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001f;

    /** OPTN001A (uuid:073ccf71-548b-1fa9-36ea-a49722f5d6dd, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001a;

    /** OPTN001I (uuid:164f2d03-f3ca-d017-ed51-0fac819f038c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001i;

    /** OPTN002L (uuid:eb7d598f-4f1d-1579-1fbb-b5290fec2b65, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002l;

    /** OPTN002F (uuid:3f67c01c-f90c-db76-7df4-4c5b1ded8c68, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002f;

    /** OPTN002A (uuid:859874d7-b42e-0da9-220c-81762c3c6c34, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002a;

    /** OPTN002I (uuid:85da93d4-f2e3-045c-8b1e-87503c5f41ed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002i;

    /** OPTN003L (uuid:e16e3a16-7d52-e7a3-efd0-88b9ca210181, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003l;

    /** OPTN003F (uuid:27f39ec0-f55d-d0c2-6b3d-283cd7624ffc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003f;

    /** OPTN003A (uuid:eb1d8cae-4c6f-57e0-658c-fd05fdb2b55d, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003a;

    /** OPTN003I (uuid:d1d662fe-4d00-4831-819d-4f2f258f6e38, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003i;

    /** OPTN004L (uuid:b84c1ad6-d8a9-a22a-5b2a-febefea231b8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004l;

    /** OPTN004F (uuid:f99c8bb5-00f9-8b60-618a-9ba0192aa68b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004f;

    /** OPTN004A (uuid:9540d694-935e-6591-5afd-ce165a004f18, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004a;

    /** OPTN004I (uuid:79881238-9763-40d0-04ab-b0fb0a29c27d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004i;

    /** OPTN005L (uuid:ef6e9fa3-0dcc-7454-d543-3712bac14ad1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005l;

    /** OPTN005F (uuid:f859e0d4-632f-66e2-93e6-d4e83691b155, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005f;

    /** OPTN005A (uuid:a3e109b4-0fd4-9944-1735-c542b66cb27d, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005a;

    /** OPTN005I (uuid:5b14ae00-b026-8695-9906-413febe26cf6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005i;

    /** OPTN006L (uuid:1e0f0ffe-9c17-8b09-7d7b-239d5caf8b8d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006l;

    /** OPTN006F (uuid:5b9d10ec-68fe-71c0-2efb-ee4c8506f923, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006f;

    /** OPTN006A (uuid:87dca973-7c1b-f0cd-8fad-3de26986d99f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006a;

    /** OPTN006I (uuid:1d9610f0-1ae9-bbb9-f71e-1ecaa8898405, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006i;

    /** OPTN007L (uuid:b539d44a-6e61-37e1-84f1-2d0f4524220f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007l;

    /** OPTN007F (uuid:c1794753-5d07-a639-240c-6afddd91c405, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007f;

    /** OPTN007A (uuid:83e546b3-92a7-d4c4-8501-e0be6c1a267f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007a;

    /** OPTN007I (uuid:6e50b0e5-121e-9f76-7359-f04914d02b10, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007i;

    /** OPTN008L (uuid:5bb39c77-0d35-5eab-f82c-698d799101f5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008l;

    /** OPTN008F (uuid:3d5e7341-9105-b370-96f8-7900a43ba8ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008f;

    /** OPTN008A (uuid:7dd2a4da-63e8-bf35-0c7f-a3f54b4bf12c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008a;

    /** OPTN008I (uuid:d93dfb89-a9c9-5477-32ba-1827ba92b145, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008i;

    /** OPTN009L (uuid:b0ddd006-ad9a-965d-9575-041f91ceaf1c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009l;

    /** OPTN009F (uuid:8a601872-b086-dba9-93ae-adcc67ae8b7f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009f;

    /** OPTN009A (uuid:dbc9f512-9c00-2d3c-7bc1-3b92b59c9d2b, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009a;

    /** OPTN009I (uuid:716f6a99-88e6-6036-b086-30e83727d46f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009i;

    /** OPTN010L (uuid:9f48dbd7-28e2-b7c8-2e7b-9d897f2b2150, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010l;

    /** OPTN010F (uuid:01d15908-f04f-d1ca-0c1a-fba58c67046d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010f;

    /** OPTN010A (uuid:57665e22-28ac-92dd-f755-5183c92140dd, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010a;

    /** OPTN010I (uuid:7ba99398-5b48-4b9d-1948-4934a5f79de6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010i;

    /** OPTN011L (uuid:196a0f3d-9aa3-3ae7-94de-238e54930d6e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011l;

    /** OPTN011F (uuid:72027ea4-c184-25ef-967f-e12a9ffcb1e7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011f;

    /** OPTN011A (uuid:3b635d44-ed63-4d5a-234d-24d5d40a788d, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011a;

    /** OPTN011I (uuid:d0ba06d4-9245-cc3b-8b54-4553d955ae24, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011i;

    /** OPTN012L (uuid:b564baba-e78e-6467-b174-bb52822461cd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012l;

    /** OPTN012F (uuid:0b8a65f3-75a9-c924-809e-4b687e54983b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012f;

    /** OPTN012A (uuid:31e94379-7824-2519-5e9f-1f5df84c0539, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012a;

    /** OPTN012I (uuid:b6424002-0208-655a-8314-70a4fa5a23e2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012i;

    /** OPTIONL (uuid:b1a1b955-4e10-b7c5-f2f6-848d56904efc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optionl;

    /** OPTIONF (uuid:40df636b-edf3-f66f-8701-4a535c606ec0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optionf;

    /** OPTIONA (uuid:1a42e6f8-957b-b4cd-8ca8-1cec83fb8520, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optiona;

    /** OPTIONI (uuid:c15f28d4-3260-2e77-de56-970d71ed351c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optioni;

    /** ERRMSGL (uuid:b7962501-d4fc-f1fc-7515-4f9956168c46, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgl;

    /** ERRMSGF (uuid:a6942eed-f2d8-c7a1-23c2-671e9b6ddb9b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgf;

    /** ERRMSGA (uuid:9a0039d8-a641-c5b2-53b7-d24d09f49902, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsga;

    /** ERRMSGI (uuid:57608c80-1194-6f7a-8c80-ec6a1ac8c9ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgi;

    /** COADM1AO (uuid:c8593207-d31c-52fb-3151-acb232057349, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ coadm1ao;

    /** TRNNAMEC (uuid:753270a8-ed4b-8411-596a-aa0e27a321a7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamec;

    /** TRNNAMEP (uuid:8c7e4245-77c3-3e2b-2176-d9f6c974ea9d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamep;

    /** TRNNAMEH (uuid:84d9d432-a964-fd09-1771-5034519baf96, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameh;

    /** TRNNAMEV (uuid:a262b0c9-9d84-839b-54c7-4c42c20d5b0c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamev;

    /** TRNNAMEO (uuid:d21d927c-3341-252b-ed83-30e5b525bab6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameo;

    /** TITLE01C (uuid:860c175d-1d32-b4c7-a079-c99ec5f6ff2e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01c;

    /** TITLE01P (uuid:fcdd2c21-e078-b427-b8de-96af5377b77c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01p;

    /** TITLE01H (uuid:a7d9fb3a-ed74-0c88-4631-d83628f2801e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01h;

    /** TITLE01V (uuid:8f427207-838b-a915-b88c-799b05f67308, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01v;

    /** TITLE01O (uuid:c2b587ad-01f0-f106-090e-86651c63427d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01o;

    /** CURDATEC (uuid:049492bf-9d48-f704-dc0e-f21d364b5b24, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatec;

    /** CURDATEP (uuid:61d436c4-64c6-bb76-e30b-b331b5c94b2c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatep;

    /** CURDATEH (uuid:f2ec43df-103f-6b01-3852-bd81a6589158, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateh;

    /** CURDATEV (uuid:f3638c48-0176-94a5-da10-d220710ad2ec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatev;

    /** CURDATEO (uuid:40f52806-3f1a-d4fe-3c2a-5c8b09068035, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateo;

    /** PGMNAMEC (uuid:b3d0d405-0097-09a0-482e-30001afa772d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamec;

    /** PGMNAMEP (uuid:165bde7d-c84d-9df9-680f-5b39453b81ee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamep;

    /** PGMNAMEH (uuid:67434e29-a3b4-fb3e-8042-51945802670f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameh;

    /** PGMNAMEV (uuid:fa098699-9f21-cb75-abb0-750a7d527b55, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamev;

    /** PGMNAMEO (uuid:e2dd3273-9f06-ff1a-4491-81c22cfb00d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameo;

    /** TITLE02C (uuid:a3845215-af3d-d700-deb5-af2ba5fa8eb3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02c;

    /** TITLE02P (uuid:605df0a7-cd61-8617-9301-e59f7ddfefe3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02p;

    /** TITLE02H (uuid:58c4a87c-c515-f6a5-8d0f-830de56f9032, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02h;

    /** TITLE02V (uuid:7342afb4-d6c0-efd2-4d91-ce95a8a45b04, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02v;

    /** TITLE02O (uuid:9d35fe99-96da-4abb-99ff-0775b7776a42, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02o;

    /** CURTIMEC (uuid:e75e8d8c-f74b-6e8a-0e4c-e94f28b80a54, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimec;

    /** CURTIMEP (uuid:2bae9861-4120-2d52-94bd-f4042a405ec0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimep;

    /** CURTIMEH (uuid:4d63e2c6-f476-fe1a-a410-c7c20c266c3e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeh;

    /** CURTIMEV (uuid:10f360df-2553-b049-c5cc-f4d612b1889e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimev;

    /** CURTIMEO (uuid:05bb7f1f-6ad2-0af2-f6ff-b6241aa8bfa6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeo;

    /** OPTN001C (uuid:5a643765-cbe5-da72-0a50-069588a8c056, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001c;

    /** OPTN001P (uuid:afc49179-9d3f-b6d7-ba05-0d56029045c9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001p;

    /** OPTN001H (uuid:dd54acfa-14f1-1764-2270-ef5baf70389a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001h;

    /** OPTN001V (uuid:23feaff8-ce66-ae0b-6fcf-4aa269f140d5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001v;

    /** OPTN001O (uuid:286d5a1e-89dc-5b48-d1a3-f7ee1e735c16, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001o;

    /** OPTN002C (uuid:be267b40-64e4-bd42-f525-0b6c8b8585ff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002c;

    /** OPTN002P (uuid:1fc5d822-64f6-b526-a3e0-98a6bbbca411, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002p;

    /** OPTN002H (uuid:21e9b835-f5f3-d03a-4af4-377bd4615971, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002h;

    /** OPTN002V (uuid:18ae6b96-97d4-442d-f906-21694c7eee89, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002v;

    /** OPTN002O (uuid:a38df417-021f-b09a-9da6-11ff7ad2b2fa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002o;

    /** OPTN003C (uuid:b9a58afd-0671-145d-d35b-208699c70d80, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003c;

    /** OPTN003P (uuid:f7f23048-6611-b7de-f2b2-4b1b25aa0bd5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003p;

    /** OPTN003H (uuid:1f9e5466-8ed6-1891-f8b6-b307314ebc22, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003h;

    /** OPTN003V (uuid:26cef1c1-28cd-ffcf-d1f0-c1f72d89b5ee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003v;

    /** OPTN003O (uuid:b76fc2d0-7745-8818-316c-6a3ec21be6ff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003o;

    /** OPTN004C (uuid:93a8b5ed-097b-62b9-11b9-9dd7340860eb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004c;

    /** OPTN004P (uuid:c6089fd2-8dcf-ab69-4fa6-06daa49c9799, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004p;

    /** OPTN004H (uuid:3e46bc97-a78b-56e6-e464-d8cd475a6d84, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004h;

    /** OPTN004V (uuid:b4c99566-882d-3815-9f62-d435d71fe3fc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004v;

    /** OPTN004O (uuid:48432f76-9f92-baab-25cd-87fb86607b44, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004o;

    /** OPTN005C (uuid:63bdc510-e634-170d-c95e-fc75a5d8770c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005c;

    /** OPTN005P (uuid:064c5e02-8477-75a3-7496-fcb927c4d051, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005p;

    /** OPTN005H (uuid:11bf4e70-3e1c-cf44-bada-6c2c578db894, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005h;

    /** OPTN005V (uuid:0d8b8696-aa61-b352-35d3-f2a7c7a3ccc7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005v;

    /** OPTN005O (uuid:16f04ba5-3e8e-99ab-1e31-4e9e98d42672, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005o;

    /** OPTN006C (uuid:186d382c-11db-1711-5b5b-db9b85957e9a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006c;

    /** OPTN006P (uuid:1b3cecb3-0146-8f14-bf0e-c31aa040a623, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006p;

    /** OPTN006H (uuid:c0c9182e-0374-9c6e-6078-497296fd2d7c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006h;

    /** OPTN006V (uuid:48db6257-0fdd-e714-8d60-22cf97683b0e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006v;

    /** OPTN006O (uuid:5df077ad-0982-c3c3-ad79-7149f8e6ba42, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006o;

    /** OPTN007C (uuid:ec35045f-fab3-5ce1-461d-717a8828ffe4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007c;

    /** OPTN007P (uuid:85a15ebf-ba2b-dbc2-df83-59bc3702d5aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007p;

    /** OPTN007H (uuid:400a12c2-2eb5-3a4c-4762-00bb948aba52, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007h;

    /** OPTN007V (uuid:347bfb76-d28a-935c-b7cd-86e31fd790a9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007v;

    /** OPTN007O (uuid:dcc93b09-c043-5ef5-31c2-72e2d7963ebc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007o;

    /** OPTN008C (uuid:85bd6364-3ce9-f90c-8805-ff90d2b9cb44, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008c;

    /** OPTN008P (uuid:b2763c14-df4f-1055-02af-734f8027dc14, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008p;

    /** OPTN008H (uuid:7927b82e-475b-a246-37d3-603120e1c3ed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008h;

    /** OPTN008V (uuid:1b722982-c2ff-2133-0647-183d5dd9b150, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008v;

    /** OPTN008O (uuid:28ca3ef7-a201-7654-a9cd-5d0aa255814b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008o;

    /** OPTN009C (uuid:02abd1f0-433b-6e3a-a4b2-acf1c2fc83bd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009c;

    /** OPTN009P (uuid:b0be11d8-8994-a3ed-b45a-d895a5f891a5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009p;

    /** OPTN009H (uuid:e1a07061-a132-6901-5883-e58357513131, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009h;

    /** OPTN009V (uuid:10e692d7-4fef-a53c-a227-fbf42438d297, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009v;

    /** OPTN009O (uuid:8d50576a-6427-fd34-a80e-5bdd78f8ca41, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009o;

    /** OPTN010C (uuid:7a8d0c27-4c94-9edc-2dc4-633da9007ac2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010c;

    /** OPTN010P (uuid:d11437fe-9857-8fb7-152a-94f4f04cc2ef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010p;

    /** OPTN010H (uuid:3b9f6214-6866-338a-a247-6cbd4ce49aa2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010h;

    /** OPTN010V (uuid:a0100128-e6c5-eceb-e3e5-3f6fb0c18074, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010v;

    /** OPTN010O (uuid:e636215b-5d6e-4f59-9bc1-50d445a32d0f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010o;

    /** OPTN011C (uuid:0cea663a-01d8-054e-9394-244daa22032f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011c;

    /** OPTN011P (uuid:291bc01c-9915-2b2c-af83-3255f91e9020, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011p;

    /** OPTN011H (uuid:4bc7b0b3-bf51-6464-1e5d-75df63932471, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011h;

    /** OPTN011V (uuid:df408a25-937f-6e8d-cbcf-b408d8b15216, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011v;

    /** OPTN011O (uuid:7436f54a-9591-a2c4-0b69-de1e009ae4c9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011o;

    /** OPTN012C (uuid:fd6ed979-8140-a18f-9f79-1a8a72e3d66e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012c;

    /** OPTN012P (uuid:955f4e79-c459-0142-390c-0352dd650ec7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012p;

    /** OPTN012H (uuid:a84830c6-e342-3d65-f9f2-03d44f2ad325, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012h;

    /** OPTN012V (uuid:1be2e999-9ea6-921a-5885-06add1c819bd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012v;

    /** OPTN012O (uuid:f3dcec3f-93e9-0cb6-3c68-85c7200eb3d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012o;

    /** OPTIONC (uuid:dcd13066-cee9-cbdb-0413-9d76b01865b0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optionc;

    /** OPTIONP (uuid:63261023-bebb-35b1-d21f-16431fd736c8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optionp;

    /** OPTIONH (uuid:bec59738-5cfe-cd27-e369-30374bd2379a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optionh;

    /** OPTIONV (uuid:bbd4d079-e6b9-01cd-a030-ea94642881d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optionv;

    /** OPTIONO (uuid:47e28f76-0439-b20f-06d2-70dcd35ac6a7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optiono;

    /** ERRMSGC (uuid:98064151-864f-a437-4838-f0ed7cc5a2b2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgc;

    /** ERRMSGP (uuid:da2d6505-bcf7-7189-8496-a6e70c673d24, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgp;

    /** ERRMSGH (uuid:f91fb536-9759-b276-0be1-5c2e2253711b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgh;

    /** ERRMSGV (uuid:91c60542-7d1d-5490-d126-848b744e0570, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgv;

    /** ERRMSGO (uuid:96c55096-16ce-fcf9-e582-e9ead060bcb3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgo;

    /** CCDA-SCREEN-TITLE (uuid:0a7e0aba-894d-69e8-574b-25256ecd7faf, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:54575e58-c7c7-d366-ba46-8402b75aeaaf, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:b95fa406-de90-df27-ee11-d2bb77f42a3a, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:50857dd7-a600-2c8d-0983-083ca4de0560, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** WS-DATE-TIME (uuid:2ce83c7f-65de-26b0-e5ad-d949cd9c4ac7, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:30ab8bdf-2352-49ba-7842-5f5b23a69c43, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:09cdf2bd-77ab-8319-78be-ae9d849e03b5, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:3bea0aa5-9801-b19d-9414-30f04cb49721, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:c5d63197-409d-39ff-eab2-65337c949c3c, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:3037d784-4b94-e18c-ca3e-a48978494cb2, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:826cfb53-17ac-d881-cc70-477be7edbcce, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:9d526f0b-13f2-b337-4b84-eb5bbbae329d, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:49ced53a-64ba-184c-21f8-088a04cff2cc, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:8fe8cb92-1949-f12f-71b4-8275d67ed5fa, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:f65ce2e3-c467-1352-9ecf-6896b3238ba7, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:7c02ad23-0236-c051-313d-9ac24a4bc04f, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:ad92c598-3a8b-d0da-3f8f-3f7df4b52518, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:b2592125-6664-0a0f-4c81-5b42717d4a71, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:d117a31a-ecc4-8b33-c221-8347decd7e6a, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:9ed99f63-9530-2f47-8d91-4f46dd2b7726, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:27537623-0918-c04b-f242-b20d8e972144, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:4f2aed59-7ebe-1395-9cf2-049d50a5eb80, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:28f39f13-f45a-bf25-c414-23bb77534b15, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:264a3086-7165-7f81-31c5-0546ae59c4b8, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:80bfed6f-50bb-3b28-2a47-6e9291cfda69, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:cf3dc43e-8c94-5d5f-ea36-7fb5a5209d1f, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:e1d5f1f7-d39f-89f7-2fec-0a9b904bd7fe, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:b5463ac9-2021-8f72-c2d0-2d17a8edb29d, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:5b4423a5-28ee-b5ca-0580-1b76e3998860, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:18ea1296-1a80-e8f9-ec67-dd4746f0b3d6, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:04451cc8-5ba2-e0e0-2b4e-3e38b5d2c106, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:5096fce5-8d8e-6196-de8e-33662e4334f6, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:a92bce59-f699-90dc-b1aa-578f34e37cd4, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:fddb4cff-13a4-1815-6b2a-7420b94fdde2, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:dbf7affd-56e4-d1b6-9d54-9a0f7eeb05a8, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:8fcfd735-218d-6488-269d-fa26950cb4ae, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** SEC-USER-DATA (uuid:8508a666-4f17-dd65-12fa-a4f685ad26d6, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ secUserData;

    /** SEC-USR-ID (uuid:2d7dd74e-0b09-7718-7b82-0e12e9b3b27d, level 5, PIC X(08).). */
    public String secUsrId;

    /** SEC-USR-FNAME (uuid:0571ac4b-d098-a6ca-4ef5-b8bf627a2213, level 5, PIC X(20).). */
    public String secUsrFname;

    /** SEC-USR-LNAME (uuid:07120577-7f7a-501a-95e9-96c73ba7791a, level 5, PIC X(20).). */
    public String secUsrLname;

    /** SEC-USR-PWD (uuid:5b4cfa3d-4cd1-e791-0075-944580a8e44a, level 5, PIC X(08).). */
    public String secUsrPwd;

    /** SEC-USR-TYPE (uuid:06171c04-b4df-4ee7-a2ec-9c6e9a42297f, level 5, PIC X(01).). */
    public String secUsrType;

    /** SEC-USR-FILLER (uuid:f2572d28-138d-cb92-90d5-256dfc215081, level 5, PIC X(23).). */
    public String secUsrFiller;

    /** DFHAID (uuid:e5cdadce-6744-2eb3-86b5-7ef836deb9e0, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:081c44b5-4c36-9668-4aec-e8e0ede89da6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:a49c7382-89d8-852d-68a3-a8c6dd922f2f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:0329abf9-5c82-3b77-b483-0054e04b4308, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:97a67945-85ff-124c-b7ab-fc2d23a849b6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:ed8244b5-a73c-dfd5-ced3-312a28a63ebe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:d1fd26d7-102c-8aaa-5e7f-92a4326338c4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:403f49c0-8490-5403-642d-2fa61860e181, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:a846eb8f-b4a3-6282-d366-f169902f00a5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:c61580ab-063f-5c13-2d56-e7d6f4c4d25b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:5767bbaf-35a6-306b-68ca-4fb12bf907be, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:97c5cd40-a797-69bd-2063-87d0e4846639, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:35217d20-a259-0274-6a9d-baeb3cf79a0f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:8079d77a-49ee-9c3c-06b2-124290f09a0c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:8a8b9dfd-d416-a0ad-63b1-9f0935eedc5a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:ad998762-7d6b-c860-2463-3a7f4b4e97fd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:69cd7c73-8278-69be-c395-969e3f2cb425, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:47ac9913-5388-53b2-42e8-5631466a2ffd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:62dc9187-cb5c-f9fd-3689-43dae32fd722, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:bebf413d-0007-99c4-342b-8cce684d51b3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:189d4e6d-24ff-423a-3ae5-4ffc856af303, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:218836f4-e7ea-ae86-1815-f4c01f51f4ce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:b22018a5-ab7c-0574-2f13-a4ac3931ffe9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:5d4928fc-8266-68c4-b853-a06147ce51f8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:93a4c6a4-9143-98d7-d021-9f3fdefdf7ad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:1dddd18a-e19f-7e77-58a9-d52d67e5d029, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:941ca082-168b-1661-c853-703713a4b123, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:89ecc77d-0649-f1dd-2d22-a574201c422c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:57ecac04-a484-d7d0-d67b-51017b12f844, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:207a7922-eb4d-d104-b5b1-0d33ac9ca5d4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:ee6c15a9-f1f0-2355-492e-387003ce8972, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:8967f627-6207-a15f-8ea4-c7ad1ec1d026, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:215c1a97-71f4-e28a-6ead-6ab70982b09b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:3d31218c-a590-f444-97c3-5c1578d218bc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:757f09d8-bb01-754c-3640-4319f31925ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:9cdca86b-5b53-3c55-25a7-a78cca5dbf16, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:b18f8084-87d5-cb06-6e60-89c8b0d1f2e4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** DFHBMSCA (uuid:048d3929-4546-5fdf-b3ed-6261f433ed90, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:2b752ad5-169e-82b2-8189-7836b7dce599, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:09f04e3a-22ff-5baf-7dba-1204492efbab, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:28e2b82c-6601-2fe9-4129-ee3189aaa69b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:34f00f12-2547-6fc6-45fa-1a8106bfc6ac, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:b28a58d8-5e5c-fa86-86d2-d88ecd65a60a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:46a94156-e8b6-1449-e5e1-3de67e41f810, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:7eedeaa0-3971-785e-2c10-3ac8968ad2f0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:78675cc5-b716-fc20-1d5c-a16033271b47, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:c15a4850-972e-d251-20e6-eeae361f4c2c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:065a6509-d059-58a6-200a-580e2735c979, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:0e6dedc1-d6e4-e5c3-9e77-0a459766b552, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:84e4e03b-e998-2c0e-f0ce-d1dbaa423092, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:5a7ecd7d-c6dd-fc33-fd4c-bd75a784e9da, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:e1dc7769-5d42-825a-9216-46805cf48f93, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:00b1e84a-e582-f2ac-e2a2-ea89bfcceeab, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:83757dde-a1d7-619d-9f3d-c222facc522e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:be50c0f1-7eef-99c5-bf42-e3f7728f476d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:258dad91-0343-3c31-ef4e-24d3a6a7dfb0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:fa00c489-79dd-cb50-a94c-b648e38995bf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:e46d0036-a739-8f34-67fa-680f231d433c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:b6f90486-d194-ccd3-697b-f4a64ce7f1a1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:7cabf9ea-4e29-e3eb-af8a-eb5a0d1e0a83, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:1545ce85-7096-0a53-6848-ecc221ab524a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:5ce6b027-ae46-5023-1ecf-199ad2ac35dd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:e3d030c4-3b1d-3c5d-71d4-7b9223e7b28f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:3456921f-297e-070d-9cd1-f12c3f07d1aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:d99bb5f2-8f27-0234-4271-2e02aee3a1fb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:90cd6eb0-2db4-3980-92bc-4e521c955592, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:aaed0ee0-468a-3bb9-cd76-255b91ca56b1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;


    // --- auto-generated stubs for undeclared references ---
    public Object eibcalen;  // auto-stub for undeclared reference
    public Object varying;  // auto-stub for undeclared reference

    /** MAIN-PARA  (uuid:be3b57af-c40d-b2f8-1f88-8a7cf266a409, source lines 656-695). */
    public void mainPara() {
        // SET ERR-FLG-OFF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsMessage = "";
        this.errmsgo = "";
        if (java.util.Objects.equals(this.eibcalen, 0)) {
            // TODO: translate body for: EIBCALEN = 0
        }
    }

    /** PROCESS-ENTER-KEY  (uuid:d7e8530a-6fd0-6520-67b8-13ce75af69c5, source lines 700-739). */
    public void processEnterKey() {
        this.varying();  // PERFORM
        // MOVE OPTIONI OF COADM1AI(1:WS-IDX) TO WS-OPTION-X  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [INSPECT]: INSPECT WS-OPTION-X REPLACING ALL ' ' BY '0'
        // MOVE WS-OPTION-X TO WS-OPTION  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-OPTION TO OPTIONO OF COADM1AO  -- identifier MOVE; needs PIC-aware type coercion
        if ((!this.wsOption.toString().matches("-?\\d+(\\.\\d+)?")) || (true /* TODO translate: WS-OPTION > CDEMO-ADMIN-OPT-COUNT */) || (java.util.Objects.equals(this.wsOption, 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */))) {
            // TODO: translate body for: WS-OPTION IS NOT NUMERIC OR WS-OPTION > CDEMO-ADMIN-OPT-COUNT OR WS-OPTION = ZEROS
        }
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
    }

    /** RETURN-TO-SIGNON-SCREEN  (uuid:d50c2dd9-5259-00ce-c0ef-c0ab375946f1, source lines 744-751). */
    public void returnToSignonScreen() {
        if (java.util.Objects.equals(this.cdemoToProgram, "\u0000")) {
            // TODO: translate body for: CDEMO-TO-PROGRAM = LOW-VALUES OR SPACES
        }
    }

    /** SEND-MENU-SCREEN  (uuid:8e8cec17-6f88-c185-0452-6154c963ffbf, source lines 756-768). */
    public void sendMenuScreen() {
        this.populateHeaderInfo();  // PERFORM
        this.buildMenuOptions();  // PERFORM
        // MOVE WS-MESSAGE TO ERRMSGO OF COADM1AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** RECEIVE-MENU-SCREEN  (uuid:99338c13-c090-b5ba-76f2-014993754723, source lines 773-781). */
    public void receiveMenuScreen() {
        // TODO: implement receiveMenuScreen.  See uuid:99338c13-c090-b5ba-76f2-014993754723
    }

    /** POPULATE-HEADER-INFO  (uuid:2eb1ad6f-6bcf-caca-38b1-7688e23732d4, source lines 786-805). */
    public void populateHeaderInfo() {
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF COADM1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF COADM1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-TRANID TO TRNNAMEO OF COADM1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO PGMNAMEO OF COADM1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF COADM1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF COADM1AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** BUILD-MENU-OPTIONS  (uuid:2b5441b1-e4c3-9e65-5156-23bf9615304f, source lines 810-847). */
    public void buildMenuOptions() {
        this.varying();  // PERFORM
    }

    /** PGMIDERR-ERR-PARA  (uuid:8ce9e541-6fef-1e2a-2071-c5b0e616398c, source lines 851-865). */
    public void pgmiderrErrPara() {
        this.wsMessage = "";
        // MOVE DFHGREEN TO ERRMSGC OF COADM1AO  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [STRING]: STRING 'This option ' DELIMITED BY SIZE *> CDEMO-ADMIN-OPT-NAME(WS-OPTION) *> DELIMITED BY SIZE 'is not installed ...' DELIMITED BY SIZE INTO WS-MESSAGE
        this.sendMenuScreen();  // PERFORM
    }

    public static void main(String[] args) {
        new Coadm01c().mainPara();
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
