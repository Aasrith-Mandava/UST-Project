// Generated from COSGN00C.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COSGN00C.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * COSGN00C (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: COSGN00C.cbl
 */
public class Cosgn00c {

    /** WS-VARIABLES (uuid:47189d7e-a3de-f2d8-b5c1-b84829173e58, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsVariables;

    /** WS-PGMNAME (uuid:10dfb488-a643-5669-b3d6-ccdd582bbc1a, level 5, PIC X(08)). */
    public String wsPgmname;

    /** WS-TRANID (uuid:32383112-d548-521f-b371-052bcd3e73a9, level 5, PIC X(04)). */
    public String wsTranid;

    /** WS-MESSAGE (uuid:ebedc009-7dbe-7621-0bf6-8504b6e755af, level 5, PIC X(80)). */
    public String wsMessage;

    /** WS-USRSEC-FILE (uuid:d0411c40-4d06-db81-d85d-29edcba611b8, level 5, PIC X(08)). */
    public String wsUsrsecFile;

    /** WS-ERR-FLG (uuid:b269143f-a25f-8122-fb3b-a5df3c98225a, level 5, PIC X(01)). */
    public String wsErrFlg;

    /** WS-RESP-CD (uuid:447a6296-d8be-0856-a66a-1f4192823b35, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsRespCd;

    /** WS-REAS-CD (uuid:82cd319b-c403-13e2-7a13-44cd995365ee, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsReasCd;

    /** WS-USER-ID (uuid:544d676c-8799-c3c9-721e-03b989ef247c, level 5, PIC X(08).). */
    public String wsUserId;

    /** WS-USER-PWD (uuid:d2944d83-90f7-30c9-5d56-c04716acc6eb, level 5, PIC X(08).). */
    public String wsUserPwd;

    /** CARDDEMO-COMMAREA (uuid:a9d064d4-d81c-db55-f8ff-c43699ef2d14, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:8d03231e-19cc-76b3-dad9-e4e94d430dfc, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:e55e7837-cc9d-7b0f-2aa2-7a96b9846c0b, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:568c0a16-7e9d-2301-b1dd-8672216e2b2b, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:aa43a427-9437-f9cb-f54b-7dc1664a3bfa, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:3d64be9c-111d-d18d-1f37-8176ffd0a18c, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:5304d7cd-96fc-687e-42ab-bab462c9eca6, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:4e124cd6-cf79-3c82-e741-871ff7653554, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:e9464ee2-6d0e-4829-f70e-c47775a088ae, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:8e020bf4-9a7e-f3af-c2c8-e7fb49231c42, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:e27a8b6c-ac39-f326-b2c5-d6e52f87cf3c, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:ddef179d-9c1d-3907-4db7-54876adcf098, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:d5f03e28-e516-1bf1-be84-668f97f7a83f, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:b1d440c3-5d9d-d762-afee-a3cd3339f63d, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:1e1a0683-4f8d-b3a1-8595-5d3d3f61273a, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:70087edc-e210-8942-1fe8-bd7f3ae18753, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:d8e56228-7545-caa1-06ac-a5e1d01bb9b4, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:cb88ada2-15fe-c74a-65bb-d9fcafc10c0a, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:2cb5c452-21ee-b78a-e27a-c3d839e4f01f, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:b2ca4acb-0b10-b84e-309f-ccbab313b0d3, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:5ce1e0d4-c168-710c-1f65-1d199cd02b9c, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:6feb7846-bde0-e570-5352-ed158e919f4b, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** COSGN0AI (uuid:e91c2348-9dac-9aab-249b-a32dcd136729, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cosgn0ai;

    /** TRNNAMEL (uuid:d8386936-b1e6-7172-1f58-3d98d8a26fcc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamel;

    /** TRNNAMEF (uuid:e94813ef-de00-91ec-2a3c-7a504aa79a0a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamef;

    /** TRNNAMEA (uuid:07a61da3-779a-2299-2cf8-5dbf00e3dc8f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamea;

    /** TRNNAMEI (uuid:214292fc-ead9-e04c-47de-c9deeb31039c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamei;

    /** TITLE01L (uuid:27803192-0b38-e77e-087f-b4f037b3f0df, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01l;

    /** TITLE01F (uuid:752b878f-2fc6-b89d-f4c3-3857a920c4d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01f;

    /** TITLE01A (uuid:e141cdea-5736-749b-5a03-a4058258e8b0, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01a;

    /** TITLE01I (uuid:ec27a802-bd8f-864a-4961-8b945ac1c7bf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01i;

    /** CURDATEL (uuid:36cf9082-1c38-0d69-62ac-5ede201fe944, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatel;

    /** CURDATEF (uuid:95361e65-8d79-174a-3ebe-db77366ca84d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatef;

    /** CURDATEA (uuid:e98d2acd-7a2e-13d9-0f07-c428e7929d9a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatea;

    /** CURDATEI (uuid:95011d41-4218-fdba-c37d-d3655377a178, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatei;

    /** PGMNAMEL (uuid:bb15637c-6044-76b7-026e-0b3bccb4f7ce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamel;

    /** PGMNAMEF (uuid:2487fabc-6c2b-0284-b2a1-c1fd22ae5b22, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamef;

    /** PGMNAMEA (uuid:5d331664-b70e-8bb2-65f1-29fdc0f8c9cc, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamea;

    /** PGMNAMEI (uuid:7567f080-39df-deb3-52ec-ba733eff7417, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamei;

    /** TITLE02L (uuid:a02486e0-17ac-8766-1eac-c7175b3ae8db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02l;

    /** TITLE02F (uuid:9fc8dc61-a605-27fd-e5ae-ca37f919ab07, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02f;

    /** TITLE02A (uuid:1c8aa872-65d6-808d-d6a2-ea19b6a97e98, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02a;

    /** TITLE02I (uuid:50ce618d-2ebc-3698-f3c2-c14dea95d8dc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02i;

    /** CURTIMEL (uuid:54c2b659-789a-6ef1-8a3b-77895e5c2831, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimel;

    /** CURTIMEF (uuid:10f51482-4d90-4fc7-e27a-81bd6a2f446d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimef;

    /** CURTIMEA (uuid:43639115-2893-3ff9-43de-2a27ed3bb72f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimea;

    /** CURTIMEI (uuid:43565fb7-2c06-34ff-b4b6-23ec2554d9c8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimei;

    /** APPLIDL (uuid:1ebeaa9a-03c6-d6c5-2967-88d0bae6fdf0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ applidl;

    /** APPLIDF (uuid:b88ef998-c6a0-fcc9-34eb-f2d4bea03818, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ applidf;

    /** APPLIDA (uuid:3bf08eee-bbc3-39d6-08e4-8c7cda90befd, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ applida;

    /** APPLIDI (uuid:bbf52437-d7c3-5f01-2525-84f873c20107, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ applidi;

    /** SYSIDL (uuid:deb0580d-46aa-1d4e-b840-f8dc8bdfe239, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sysidl;

    /** SYSIDF (uuid:cefe33dd-331f-fa38-8f4e-68d44cc06042, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sysidf;

    /** SYSIDA (uuid:db1bbfe9-98d2-e708-0c20-e156158281fe, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sysida;

    /** SYSIDI (uuid:84e42c67-18f0-a1de-c638-da28b4c6a948, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sysidi;

    /** USERIDL (uuid:02f458ad-4a7c-d9f6-f851-d1d4476c509e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ useridl;

    /** USERIDF (uuid:dc671eb3-aa0a-6f8d-76b7-1a3cf3061451, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ useridf;

    /** USERIDA (uuid:d6839fb0-4001-5ee5-5731-857cb63da768, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ userida;

    /** USERIDI (uuid:a64a533e-eb34-dc52-e96d-232fe33669d2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ useridi;

    /** PASSWDL (uuid:f75ad440-0810-76a9-a275-4f235fe52087, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdl;

    /** PASSWDF (uuid:6e07cdfc-74e9-8db7-d849-8246e5307af7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdf;

    /** PASSWDA (uuid:c925bbad-3863-98cc-2bfd-eb50b365d200, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwda;

    /** PASSWDI (uuid:de117b6d-db37-dd98-4c8b-4a4740833d96, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdi;

    /** ERRMSGL (uuid:1ff8c913-4981-07f5-54e0-ac50e8e8d259, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgl;

    /** ERRMSGF (uuid:02ed90b7-02cc-130a-49c7-db6d7c7531b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgf;

    /** ERRMSGA (uuid:25f2e7b8-1098-98fa-25fc-b580062217a2, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsga;

    /** ERRMSGI (uuid:1d40af9f-9b7b-61cc-9676-8d343d80bb53, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgi;

    /** COSGN0AO (uuid:c08fa9d9-7d30-2145-263c-28486ceffc43, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cosgn0ao;

    /** TRNNAMEC (uuid:ebff1ea5-45ee-1ada-c560-04ae675e534a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamec;

    /** TRNNAMEP (uuid:d77004d0-ad99-5e9d-641a-0d0f3f277dfa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamep;

    /** TRNNAMEH (uuid:dbe96e9a-0704-1871-03ae-cc8f37dce4f7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameh;

    /** TRNNAMEV (uuid:1a80032b-d4fa-81ea-5ef3-fd4d37234719, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamev;

    /** TRNNAMEO (uuid:42806940-1fd7-4f2a-3264-6874656a964a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameo;

    /** TITLE01C (uuid:984600a9-1a2f-5564-fe65-065a147e4252, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01c;

    /** TITLE01P (uuid:3c58ad56-94c2-b102-539b-61a56dee2c34, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01p;

    /** TITLE01H (uuid:debf5307-59a0-157b-c59b-73ed5ba9fe7c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01h;

    /** TITLE01V (uuid:6d6b39fe-80e3-ba2e-3865-e37a49d37aa4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01v;

    /** TITLE01O (uuid:b6ca4c68-afac-1f28-cda0-9eff637e061c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01o;

    /** CURDATEC (uuid:285ec9b7-a640-4973-3a53-cd7dd66ef1ea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatec;

    /** CURDATEP (uuid:77db5cd1-468d-5dcf-e075-152878ba5978, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatep;

    /** CURDATEH (uuid:e5d4167c-7c67-0425-5375-78467e89130b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateh;

    /** CURDATEV (uuid:7d4f4b8c-0545-5668-8a7d-05b1317c947b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatev;

    /** CURDATEO (uuid:c8ec50fd-3049-838a-d4ec-84f709fb1342, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateo;

    /** PGMNAMEC (uuid:ab803eeb-5720-486b-3f23-95571f7bc179, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamec;

    /** PGMNAMEP (uuid:25854c08-afa8-7660-5eaf-6fa9f6653e9b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamep;

    /** PGMNAMEH (uuid:b3e6cb84-d57b-fc21-aeb3-3d0c3fdcf42b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameh;

    /** PGMNAMEV (uuid:c8c67970-1030-8169-d40d-6bf152c6ccb6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamev;

    /** PGMNAMEO (uuid:4dce6605-4aee-8042-4e0a-c36d7ff94e34, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameo;

    /** TITLE02C (uuid:ebee3c36-f3a5-99d5-b114-d8dcf6e7b683, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02c;

    /** TITLE02P (uuid:92f73397-c2ae-13d1-d80b-33b1e230d055, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02p;

    /** TITLE02H (uuid:882e1145-2aff-4624-47dd-86c1e5d1a0f0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02h;

    /** TITLE02V (uuid:162bb2a4-3fc3-c6bb-a029-f7695578779d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02v;

    /** TITLE02O (uuid:85b34241-f11f-cf8d-ac8f-b9b44b14da79, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02o;

    /** CURTIMEC (uuid:57ac8171-0850-d72c-85c0-3af9e9ac7da7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimec;

    /** CURTIMEP (uuid:464e7ecc-8449-a902-1613-26c0661c813f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimep;

    /** CURTIMEH (uuid:1fa3fb0f-506d-2699-5aab-c800d4c94857, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeh;

    /** CURTIMEV (uuid:1a6ec33e-ead0-95ee-726e-77bf9aa48896, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimev;

    /** CURTIMEO (uuid:20adb5b4-5110-be28-535a-b5d4fe6def45, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeo;

    /** APPLIDC (uuid:ffe74bbd-8cb2-5ccb-97bb-4ab003572939, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ applidc;

    /** APPLIDP (uuid:05b96050-758e-4fba-3ff0-fd6d70e8c37d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ applidp;

    /** APPLIDH (uuid:4ae8f838-25a6-2b2f-0c18-61f30a7dfb4f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ applidh;

    /** APPLIDV (uuid:966c0b18-b750-c23f-2102-828c89285e38, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ applidv;

    /** APPLIDO (uuid:74d22eea-677f-07a3-75d2-195e997df8cc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ applido;

    /** SYSIDC (uuid:a5cdc6f9-a810-fcda-cdff-0ece1e3ba1ec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sysidc;

    /** SYSIDP (uuid:625a44fe-ca13-3480-be2c-17b6fcd70d4e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sysidp;

    /** SYSIDH (uuid:901e21d6-e44d-1eaa-5118-398be50808cc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sysidh;

    /** SYSIDV (uuid:44324859-9cbb-49e0-bd78-0ffcb8699a5f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sysidv;

    /** SYSIDO (uuid:13122244-eb88-736a-ab31-c51e5f0af7df, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ sysido;

    /** USERIDC (uuid:c8514b02-300e-1934-bc1c-139f66f7efa1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ useridc;

    /** USERIDP (uuid:eed5e399-054e-1fc1-f8ce-c9cb9c67ebc6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ useridp;

    /** USERIDH (uuid:fd312cf7-1e26-eae5-fac3-2e28248e1689, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ useridh;

    /** USERIDV (uuid:433c6c10-2139-7a4e-f1b5-a0d345e9bd3d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ useridv;

    /** USERIDO (uuid:97689425-1461-b39e-a9f9-4ff7da9a8c9d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ userido;

    /** PASSWDC (uuid:07539bc0-819b-6bb1-44e4-c94c5b82c37c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdc;

    /** PASSWDP (uuid:d48f5e9e-26f1-b3eb-3919-524226bafbc3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdp;

    /** PASSWDH (uuid:59561d7f-6d24-994e-f122-7f50103d53f2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdh;

    /** PASSWDV (uuid:c501a524-88e5-0a88-a77c-e1f2d2f343f5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdv;

    /** PASSWDO (uuid:1eaed60d-48b2-b6a3-6d33-6d4a3b23ea6c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ passwdo;

    /** ERRMSGC (uuid:a16c89a3-b3dd-7f42-41d6-a28dfea30245, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgc;

    /** ERRMSGP (uuid:b989e130-8b14-fa39-11d2-e21942d96b46, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgp;

    /** ERRMSGH (uuid:5cabc030-efb6-48c3-3e2d-ccaa0af39119, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgh;

    /** ERRMSGV (uuid:67ed172e-e00f-1a0d-eecd-ba5a987dbabe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgv;

    /** ERRMSGO (uuid:a4e831a2-9a69-8c3a-800e-75c44318d001, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgo;

    /** CCDA-SCREEN-TITLE (uuid:cb197991-ce5d-3520-9f7f-18d36fc831a2, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:547dae12-b240-532b-6454-f8f505f96866, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:4ada25a7-149f-b0a3-8bcd-a4d6da42f546, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:ab5b72d8-b4a8-26b0-bd2d-2f7fa6bc8b5e, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** WS-DATE-TIME (uuid:afd2ea21-13d0-ea72-4e63-f80256047b6d, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:77c78354-02a4-f63f-4ef5-8039f573a840, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:1416e14b-ef00-dca5-5c84-b7d64521804d, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:580e15a8-d6b8-bc19-0738-b549fea331e7, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:a5f3d9ff-7223-9fdb-893c-6b28eb6fe938, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:4c4cb4e8-3a25-d2d5-3409-ce3b0c7a87fe, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:b55090c1-82d7-d5f3-d114-9019a5f4d60c, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:28bfa273-594e-911d-c50c-246974ef3c3c, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:d2f46d20-8ce2-f082-555e-41eb2fcc6cee, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:776650b2-76a3-d623-c308-94424f72f2ed, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:d6b6107e-c04e-5b52-2414-92271436b721, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:df63d615-e3c6-f6d8-1e04-dd59a796fb56, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:048d17a7-b0fa-e628-5ba8-0ad153452df9, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:8329a347-403a-faba-cb80-f3e07c98f0e0, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:b2515fc8-24c7-b38b-5b0e-2e528475d2e7, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:274cca25-d21e-6597-f3d7-f728daf8047d, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:351e3f4f-14d9-73b1-60c2-7eecafc20f7f, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:2c7ae0a7-7a8c-2e5a-43d3-4257290d6ac4, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:713efc83-4d4e-8af2-9d35-baa4bf6e9346, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:bded71bb-0cdc-14cf-0cfe-c0e2c4f7a1c8, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:f0fd82ff-cddf-fc99-58ac-233c4f917638, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:e11ba256-52cc-d76a-abca-d1c56eb1c2fe, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:b4cd4d6e-3e38-a1ff-b17a-b5d6f48ca525, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:471db113-bf26-f455-5acc-2f087751d47d, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:bd077136-ddf7-55e0-807f-4ec73c0b202f, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:7d839f7c-20f4-56e9-4249-7349ff6931c8, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:64d52cca-b442-d09b-0659-fb2766146929, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:9384a8e8-17fb-b9dd-d0b8-5b5349797ed0, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:95f3d9b7-34ce-fd77-1da6-3b264c8ae5f6, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:b6e3190c-2764-09ca-3350-0ae7e39619a7, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:b86bf266-1a94-7ff6-b712-dd47faa35467, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:8f527c85-24fd-ad7c-1ade-5067aa2713a0, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** SEC-USER-DATA (uuid:e2ceff68-c706-a8ad-ffc4-7a999399d9c2, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ secUserData;

    /** SEC-USR-ID (uuid:78b8f26b-a1da-e91f-9f46-500966d69d6e, level 5, PIC X(08).). */
    public String secUsrId;

    /** SEC-USR-FNAME (uuid:40db8589-6995-2090-85ed-4f7e34768db6, level 5, PIC X(20).). */
    public String secUsrFname;

    /** SEC-USR-LNAME (uuid:e6c70848-4acf-ffcc-0cbe-49f5f65b0db4, level 5, PIC X(20).). */
    public String secUsrLname;

    /** SEC-USR-PWD (uuid:01f4a84e-5383-a1ea-2593-6cc26fe84e9a, level 5, PIC X(08).). */
    public String secUsrPwd;

    /** SEC-USR-TYPE (uuid:61cfa56c-cb07-013d-6c2e-2dc6593566b6, level 5, PIC X(01).). */
    public String secUsrType;

    /** SEC-USR-FILLER (uuid:f73dd7b8-3c5e-902a-dcf0-a45058275d9a, level 5, PIC X(23).). */
    public String secUsrFiller;

    /** DFHAID (uuid:0454fd73-144d-7f00-e853-3b51028cf1a8, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:240fa398-b1da-a6f4-7277-dcf7539595be, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:58bbcd2c-6852-b50b-502f-9c658a0b41ee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:1d159bcd-8457-2b91-fd4d-73024f712e52, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:47f9b800-801d-353d-c366-27a16e1264cc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:20c06604-0c9e-4741-3dce-749c0c554fb6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:ae2f7449-7202-3d18-b57c-2e06b5a1754e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:5490b15c-a6e9-c0a3-db24-35e8ff0cc76f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:35a2bbad-a36d-b414-93f0-873c14fd4788, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:abb1f068-714a-4e15-967b-cb4198cde0a6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:8d734059-40d4-62de-20b8-4ed85e47518c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:8f146b10-1cc4-ab7c-d82d-d3dd51fada37, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:bcc516d8-a6eb-8036-a1e2-d9b3e5990f57, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:fabe9a8e-839e-c145-b422-e768e9694fb6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:77256b19-1786-2463-df76-e88ab416a4b0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:9e683596-bb2d-fd07-5e94-5b2ea5dd291a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:126127f3-13a7-6abf-6b99-a9fde3cade6d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:47e4dcdd-765b-4cca-3f7b-e3186bc766a1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:b37559c4-eb00-69c6-8498-82f243279309, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:255eec02-9fc2-2543-965b-f9be12a325b7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:0cfba906-3ac5-7d9a-66d8-2afcde8b4601, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:5d746a88-e2ab-d8e8-a111-6dc54c3186db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:d8facc99-f0df-b6a3-7b73-4709f2fbb871, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:4cec2f4f-2671-f7b3-434c-a67504268578, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:bd0031d7-2cd4-9045-e462-85ecbc4b53dd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:c276bd53-0df1-faf5-9195-ffb54e8d345a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:5d39b8df-08a6-2135-ceb1-936176934678, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:251c5b48-f29f-5729-7a73-b213cc3a36b5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:f7075eca-eb0a-5d0d-dee8-077563c66aca, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:479fd421-7376-3ae3-03ab-9ddd9e241952, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:c648e5b4-731e-bf6a-0006-7b6e2c8797c5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:3195b09c-b167-f0c9-4d0c-7ce3533e0007, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:53390ca4-80d3-c9fb-0ce4-850cf95e7052, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:7ad39871-74f3-0b41-c493-15b3c6bd513c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:dcfbddb1-5d0a-2293-997f-165b4120bcc4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:50ceaaf7-212f-fcca-7160-16d5184914b2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:bf3939cb-4fac-e3c2-b983-4355f5b79ecf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** DFHBMSCA (uuid:7e8523ce-e658-4f63-dd7e-a613d9647826, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:54087516-289f-ea59-0806-4c1f0f844db7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:7105564c-2c2c-d55e-d29f-21206c10ebea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:0f2b6a7d-7e59-296c-4238-7f9d34e73ede, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:7f69e72b-4f40-6045-a847-c5f3983b6614, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:d47d9b65-8e5d-e991-db73-1a5f8de0713f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:bd5cf8a8-66ff-8ffe-5a02-bc9f5ffac825, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:17e75413-e375-018b-bdc3-ddf959425ada, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:fc9b2cf0-0afd-37cc-dab5-6b6ead660162, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:1cfa53ad-7802-7dcb-0232-edc3ef9f2907, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:ed534e28-15af-a67d-16b3-ed3276bee68a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:453f292c-f436-fa42-c011-37e042d77ace, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:676e83d5-54ce-393d-4861-ed4000670795, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:7dc3172a-973b-e36e-6f4b-5151739be716, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:b920442c-bd8c-11ab-65b2-c9fdb3e00526, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:6f85faa1-8a3e-29e7-317c-0330149b8ae4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:3fd66038-551f-a226-d51c-48938096c05b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:9b1da24c-d3b9-9784-f3ba-4caaf64bb89d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:aabf95b0-0a5e-9c3a-a3e4-080f78d2f18a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:dbf1a4b2-06b2-f44e-f385-31f50e898119, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:b687a47c-8b2d-0dce-d3d4-fbc39df67d80, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:5b53af12-8c8a-effc-bf0e-71d0396c5341, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:2c200b05-d18f-9c2e-7ac8-921af01dc4c4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:91708d39-63b4-0fee-39c3-d67a137e9058, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:d352bd81-c491-5cc7-23df-31464fc1f0e1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:50f905e3-3b0e-d14c-1fd2-c2b2e6dc5b12, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:03bf537f-6176-6f73-51da-bf1a5050cae9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:02b69c84-ec47-bf61-ce63-348858bedcec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:c9379592-1678-c1dd-8d8d-e1a6fa5acc0a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:4b7b8f85-c07a-e80e-5413-54e214d938b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;


    // --- auto-generated stubs for undeclared references ---
    public Object eibcalen;  // auto-stub for undeclared reference

    /** MAIN-PARA  (uuid:f59d328c-5fb0-01c7-dd3c-91dfdfd62c72, source lines 484-513). */
    public void mainPara() {
        // SET ERR-FLG-OFF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsMessage = "";
        this.errmsgo = "";
        if (java.util.Objects.equals(this.eibcalen, 0)) {
            // TODO: translate body for: EIBCALEN = 0
        }
    }

    /** PROCESS-ENTER-KEY  (uuid:4e6b1829-e506-29c2-16cd-a00ebbd5f301, source lines 519-551). */
    public void processEnterKey() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        // MOVE FUNCTION TO WS-USER-ID, CDEMO-USER-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE FUNCTION TO WS-USER-PWD  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
    }

    /** SEND-SIGNON-SCREEN  (uuid:aa8d6a0e-c35e-78d6-5b24-c93731b12226, source lines 556-568). */
    public void sendSignonScreen() {
        this.populateHeaderInfo();  // PERFORM
        // MOVE WS-MESSAGE TO ERRMSGO OF COSGN0AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** SEND-PLAIN-TEXT  (uuid:61017cc1-4622-591c-8128-c4df48f7629c, source lines 573-583). */
    public void sendPlainText() {
        // TODO: implement sendPlainText.  See uuid:61017cc1-4622-591c-8128-c4df48f7629c
    }

    /** POPULATE-HEADER-INFO  (uuid:ed4effea-a287-70ba-e685-48f64ac02b0b, source lines 588-615). */
    public void populateHeaderInfo() {
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF COSGN0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF COSGN0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-TRANID TO TRNNAMEO OF COSGN0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO PGMNAMEO OF COSGN0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF COSGN0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF COSGN0AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** READ-USER-SEC-FILE  (uuid:5aa85984-ef58-517a-3318-4358be3dbf36, source lines 620-668). */
    public void readUserSecFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    public static void main(String[] args) {
        new Cosgn00c().mainPara();
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
