// Generated from COCRDUPC.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COCRDUPC.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * COCRDUPC (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: COCRDUPC.cbl
 */
public class Cocrdupc {

    /** WS-MISC-STORAGE (uuid:017008f4-cf93-815a-cac9-c4d285987a6d, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsMiscStorage;

    /** WS-CICS-PROCESSNG-VARS (uuid:1aa22a96-531e-fe73-6b33-50629cdb67ab, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCicsProcessngVars;

    /** WS-RESP-CD (uuid:fc757794-eda2-179d-b3a9-f96290027e5e, level 7, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsRespCd;

    /** WS-REAS-CD (uuid:37bd422b-54b2-9318-b0aa-ab6755e450a9, level 7, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsReasCd;

    /** WS-TRANID (uuid:66c67599-8377-220e-0f6a-b3afd8570801, level 7, PIC X(4)). */
    public String wsTranid;

    /** WS-UCTRANS (uuid:c88d9e9b-1c5f-36a6-c9ed-8c04ac7fa0bd, level 7, PIC X(4)). */
    public String wsUctrans;

    /** WS-INPUT-FLAG (uuid:7af982d0-c41f-8468-b447-95d02abcfe42, level 5, PIC X(1).). */
    public String wsInputFlag;

    /** WS-EDIT-ACCT-FLAG (uuid:63e5a666-d8d5-5fe6-f532-013cb9ae05ab, level 5, PIC X(1).). */
    public String wsEditAcctFlag;

    /** WS-EDIT-CARD-FLAG (uuid:d60b8b93-dade-2fb4-5ce4-583dc9f68d7a, level 5, PIC X(1).). */
    public String wsEditCardFlag;

    /** WS-EDIT-CARDNAME-FLAG (uuid:2f4461f2-b8da-08b7-dabd-e3982d30a4a2, level 5, PIC X(1).). */
    public String wsEditCardnameFlag;

    /** WS-EDIT-CARDSTATUS-FLAG (uuid:ceb9ff18-360a-014f-717d-85ac483c9a83, level 5, PIC X(1).). */
    public String wsEditCardstatusFlag;

    /** WS-EDIT-CARDEXPMON-FLAG (uuid:79e6e2d4-a758-0087-5015-972984764281, level 5, PIC X(1).). */
    public String wsEditCardexpmonFlag;

    /** WS-EDIT-CARDEXPYEAR-FLAG (uuid:2bb47765-ce52-29f5-72e9-2ce849d5cc37, level 5, PIC X(1).). */
    public String wsEditCardexpyearFlag;

    /** WS-RETURN-FLAG (uuid:00f2d072-9bdf-1e76-6cc9-c824a2d6192c, level 5, PIC X(1).). */
    public String wsReturnFlag;

    /** WS-PFK-FLAG (uuid:d9c592bf-f1d1-997d-e727-7720a5f645bf, level 5, PIC X(1).). */
    public String wsPfkFlag;

    /** CARD-NAME-CHECK (uuid:daea6d89-ebba-5f75-9d46-270506cd0b84, level 5, PIC X(50)). */
    public String cardNameCheck;

    /** FLG-YES-NO-CHECK (uuid:cb301c02-769d-6c08-c085-cbe555af2631, level 5, PIC X(1)). */
    public String flgYesNoCheck;

    /** CARD-MONTH-CHECK (uuid:9609092e-74ec-53a4-c62e-0d0f56ca02dc, level 5, PIC X(2).). */
    public String cardMonthCheck;

    /** CARD-MONTH-CHECK-N (uuid:0e3467ed-1887-05b4-247c-bb4921608f80, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardMonthCheckN;

    /** CARD-YEAR-CHECK (uuid:28fdcf89-0faa-8a02-2997-460110f12c46, level 5, PIC X(4).). */
    public String cardYearCheck;

    /** CARD-YEAR-CHECK-N (uuid:53efe87f-153a-a86b-8647-188339b900de, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardYearCheckN;

    /** CICS-OUTPUT-EDIT-VARS (uuid:0370abf5-3d3b-05b9-0a51-379b7db8b936, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cicsOutputEditVars;

    /** CARD-ACCT-ID-X (uuid:2f6bc19a-aa52-a42f-ce69-c38dd376f45e, level 10, PIC X(11).). */
    public String cardAcctIdX;

    /** CARD-ACCT-ID-N (uuid:03d101d0-d042-8b8c-ba94-62b41cb2ecc8, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardAcctIdN;

    /** CARD-CVV-CD-X (uuid:4d8ae19f-9403-62d8-7ae6-dc5efa850b4e, level 10, PIC X(03).). */
    public String cardCvvCdX;

    /** CARD-CVV-CD-N (uuid:c5d9cd8f-1a5d-376c-3282-cb20eb9ae5ff, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardCvvCdN;

    /** CARD-CARD-NUM-X (uuid:23a25503-18f8-1ef7-e7b9-84b9fdc90e86, level 10, PIC X(16).). */
    public String cardCardNumX;

    /** CARD-CARD-NUM-N (uuid:758cb72b-de0e-98a7-1e6b-f2e21287c0de, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardCardNumN;

    /** CARD-NAME-EMBOSSED-X (uuid:813ffc3a-2c0c-22cc-dc34-2239da873acc, level 10, PIC X(50).). */
    public String cardNameEmbossedX;

    /** CARD-STATUS-X (uuid:fceb5204-5f49-de99-fc69-22fa5fac1792, level 10, PIC X.). */
    public String cardStatusX;

    /** CARD-EXPIRAION-DATE-X (uuid:1c42bb69-e743-5495-a4af-b384b35c0512, level 10, PIC X(10).). */
    public String cardExpiraionDateX;

    /** CARD-EXPIRY-YEAR (uuid:25d3e6cb-0e86-072d-ed0c-0e013b5ad3e6, level 20, PIC X(4).). */
    public String cardExpiryYear;

    /** CARD-EXPIRY-MONTH (uuid:bd970b8d-fc9b-9174-4d25-2ce8a1ec5e05, level 20, PIC X(2).). */
    public String cardExpiryMonth;

    /** CARD-EXPIRY-DAY (uuid:2810c2d5-f4b8-82e1-5eed-8e5152614937, level 20, PIC X(2).). */
    public String cardExpiryDay;

    /** CARD-EXPIRAION-DATE-N (uuid:404b34c6-ad28-2781-e00d-c45a7da4af3a, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardExpiraionDateN;

    /** WS-CARD-RID (uuid:f2c81df8-0114-d9f7-1aa6-5439488b5e3f, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCardRid;

    /** WS-CARD-RID-CARDNUM (uuid:38580ae5-34c4-3280-686a-19aac39cced1, level 10, PIC X(16).). */
    public String wsCardRidCardnum;

    /** WS-CARD-RID-ACCT-ID (uuid:475554cb-b700-e226-bb6f-97d7d55c6f9e, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ wsCardRidAcctId;

    /** WS-CARD-RID-ACCT-ID-X (uuid:b8c0f828-8396-a8da-483a-760624d3638e, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCardRidAcctIdX;

    /** WS-FILE-ERROR-MESSAGE (uuid:bb5f820e-a4c6-6647-6a39-e6d1bb6be20d, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsFileErrorMessage;

    /** ERROR-OPNAME (uuid:2414b8fb-2d46-81c9-da15-5a7fb37f7637, level 10, PIC X(8)). */
    public String errorOpname;

    /** ERROR-FILE (uuid:7d4b5409-45f4-f16d-2d1f-31769ae275f5, level 10, PIC X(9)). */
    public int /* PIC X(9) */ errorFile;

    /** ERROR-RESP (uuid:6221e940-e0b2-66c2-07e3-c95b670d59ca, level 10, PIC X(10)). */
    public String errorResp;

    /** ERROR-RESP2 (uuid:fe6c9b8a-a9ef-20b2-9f78-86ca9365ee0e, level 10, PIC X(10)). */
    public String errorResp2;

    /** WS-LONG-MSG (uuid:97c2522c-d384-8628-b221-1efae814e278, level 5, PIC X(500).). */
    public String wsLongMsg;

    /** WS-INFO-MSG (uuid:8a34a8d2-714f-c479-2559-1c1e9570e0a6, level 5, PIC X(40).). */
    public String wsInfoMsg;

    /** WS-RETURN-MSG (uuid:1a8da7ea-5f49-09f4-dd6d-8000efeafc4d, level 5, PIC X(75).). */
    public String wsReturnMsg;

    /** WS-LITERALS (uuid:62a1210c-638d-f425-f43b-835d9be2f0e4, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsLiterals;

    /** LIT-THISPGM (uuid:15777b15-dde5-b877-c2f6-a318db0d6a89, level 5, PIC X(8)). */
    public String litThispgm;

    /** LIT-THISTRANID (uuid:a8ebff0d-5ed0-cca0-3832-d6f1060e3029, level 5, PIC X(4)). */
    public String litThistranid;

    /** LIT-THISMAPSET (uuid:ddf1f7bc-7cdb-ec43-9b82-7b2acb22975b, level 5, PIC X(8)). */
    public String litThismapset;

    /** LIT-THISMAP (uuid:c2a268b9-c60d-b4cd-133e-c18443337512, level 5, PIC X(7)). */
    public String litThismap;

    /** LIT-CCLISTPGM (uuid:e415effb-aa91-896e-0cb3-ad05153806fb, level 5, PIC X(8)). */
    public String litCclistpgm;

    /** LIT-CCLISTTRANID (uuid:49ce6384-271c-416e-b55f-8b292f3ec645, level 5, PIC X(4)). */
    public String litCclisttranid;

    /** LIT-CCLISTMAPSET (uuid:3427b3b0-d80a-4cc8-f755-8fc8038c0bed, level 5, PIC X(7)). */
    public String litCclistmapset;

    /** LIT-CCLISTMAP (uuid:fa131171-49ec-3e3d-5ed4-7679b8e11979, level 5, PIC X(7)). */
    public String litCclistmap;

    /** LIT-MENUPGM (uuid:7f9055af-a1e3-f207-856f-ed0eabcd7d40, level 5, PIC X(8)). */
    public String litMenupgm;

    /** LIT-MENUTRANID (uuid:eef897d0-d065-daa2-b749-49c4158a0d7e, level 5, PIC X(4)). */
    public String litMenutranid;

    /** LIT-MENUMAPSET (uuid:c5b688a8-140b-6b5f-1109-cbd78ba6da20, level 5, PIC X(7)). */
    public String litMenumapset;

    /** LIT-MENUMAP (uuid:ed12d757-bf5d-bc2d-2661-54e530b4d90a, level 5, PIC X(7)). */
    public String litMenumap;

    /** LIT-CARDDTLPGM (uuid:14418d25-6950-a316-1087-7f75d7cee958, level 5, PIC X(8)). */
    public String litCarddtlpgm;

    /** LIT-CARDDTLTRANID (uuid:7f155a77-8e73-dced-2809-27e718f4b2f5, level 5, PIC X(4)). */
    public String litCarddtltranid;

    /** LIT-CARDDTLMAPSET (uuid:421e9bc2-fc1e-bb13-4438-0e5604b328ef, level 5, PIC X(7)). */
    public String litCarddtlmapset;

    /** LIT-CARDDTLMAP (uuid:86ef32ee-6001-2d36-8487-69faf96fc78d, level 5, PIC X(7)). */
    public String litCarddtlmap;

    /** LIT-CARDFILENAME (uuid:e2fb0fc3-b0f2-a9b9-f8e3-c685d3dd1932, level 5, PIC X(8)). */
    public String litCardfilename;

    /** LIT-CARDFILENAME-ACCT-PATH (uuid:389256be-28e7-d685-79e4-1646862ad9d3, level 5, PIC X(8)). */
    public String litCardfilenameAcctPath;

    /** LIT-ALL-ALPHA-FROM (uuid:9afe7004-b349-a4c7-fb3d-a68b1c5e1ad0, level 5, PIC X(52)). */
    public String litAllAlphaFrom;

    /** LIT-ALL-SPACES-TO (uuid:a3f614b0-5670-27f7-07e6-a1c49dfb369c, level 5, PIC X(52)). */
    public String litAllSpacesTo;

    /** LIT-UPPER (uuid:702d18e1-8023-dd02-c3cc-766bc19ba559, level 5, PIC X(26)). */
    public String litUpper;

    /** LIT-LOWER (uuid:878d8042-babc-a5d4-dd29-e18328e9c1e8, level 5, PIC X(26)). */
    public String litLower;

    /** CC-WORK-AREAS (uuid:600d92cd-7047-edf7-05f4-e7aeeb3e24d9, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccWorkAreas;

    /** CC-WORK-AREA (uuid:102b481f-454c-c833-641d-94e88c6afe40, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccWorkArea;

    /** CCARD-AID (uuid:003f63b2-651f-05ce-3e4a-97b808a594bf, level 10, PIC X(5).). */
    public String ccardAid;

    /** CCARD-NEXT-PROG (uuid:db552680-e295-55c6-d51b-7a19fa3be7a7, level 10, PIC X(8).). */
    public String ccardNextProg;

    /** CCARD-NEXT-MAPSET (uuid:d89164ac-542d-6c57-66f5-0661eb690c2d, level 10, PIC X(7).). */
    public String ccardNextMapset;

    /** CCARD-NEXT-MAP (uuid:2a598e27-276e-6121-b265-e07e6486c765, level 10, PIC X(7).). */
    public String ccardNextMap;

    /** CCARD-ERROR-MSG (uuid:8b3ee094-d912-b610-5b66-eb003157dcd7, level 10, PIC X(75).). */
    public String ccardErrorMsg;

    /** CCARD-RETURN-MSG (uuid:7035c340-00ad-6277-b40d-6bf0c239e41b, level 10, PIC X(75).). */
    public String ccardReturnMsg;

    /** CC-ACCT-ID (uuid:c2db2804-7b89-8ca6-3e0b-5ed13f6843b6, level 10, PIC X(11)). */
    public String ccAcctId;

    /** CC-ACCT-ID-N (uuid:002a8411-ec4e-3207-49aa-bfb26e5bb531, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ ccAcctIdN;

    /** CC-CARD-NUM (uuid:58a158b4-ddb7-5a6d-6402-73c7d395b993, level 10, PIC X(16)). */
    public String ccCardNum;

    /** CC-CARD-NUM-N (uuid:4c03d4a4-b8ae-4195-b5f5-54db68e0578e, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ ccCardNumN;

    /** CC-CUST-ID (uuid:c108090b-d2f5-3bdc-8442-ca2affbfc2e6, level 10, PIC X(09)). */
    public int /* PIC X(09) */ ccCustId;

    /** CC-CUST-ID-N (uuid:fb7e44b2-91bc-9b52-b196-96a9ec927879, level 10, PIC 9(9).). */
    public int /* PIC 9(9). */ ccCustIdN;

    /** CARDDEMO-COMMAREA (uuid:8a5066a6-c602-2805-5e7a-f693fc4a8fe9, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:bbf4025f-434a-d49f-3e6e-a27b3d5e5988, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:c50ff92d-ca10-3082-ae98-883a23a35679, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:c3ae77ba-9547-6692-96e6-3ef34a9a46e3, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:85b9c997-1208-f77b-0206-e230529347ff, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:e2eba031-2175-30e2-c239-39f7c0ca07d6, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:d63d23b8-5076-664d-0f5e-63106214616d, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:4c636222-b881-111c-16d0-3b763f68f645, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:4d2ec909-ca0d-5f4b-07f2-c8a6c577eafd, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:b5296192-3414-6b08-1dd6-04d3edf17eec, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:0d55fecc-90df-3219-057b-74d685918c89, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:130db2a8-8510-ba6c-cda1-10ec17fdae0b, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:01a3247f-8ae2-68e3-2d08-f4dcb285bd03, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:392f6e48-24ca-886b-7613-811102839bb1, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:e8a2c631-93e7-01fa-f10d-9497a1eecf5e, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:0ca52d04-6e90-d4a8-decd-67e5c09e0704, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:1625a9e4-715b-4d0d-9c8c-7bb5d57605c0, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:9e41f4f1-49be-37d8-4f4d-62f6f41762bb, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:2b68021d-1958-a499-a008-4be78ad2f4d8, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:15ceb385-cbbf-e29b-c9d5-009d428649d2, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:f8a6f206-9939-027e-7f8e-3e61f047330f, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:541182e9-c69f-04af-37ed-dc24f9b00dd1, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** WS-THIS-PROGCOMMAREA (uuid:2886fed7-4a14-901a-e5cc-44099d458eb4, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsThisProgcommarea;

    /** CARD-UPDATE-SCREEN-DATA (uuid:b0617e40-d9aa-9c01-d8a3-410bb0b33dc3, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardUpdateScreenData;

    /** CCUP-CHANGE-ACTION (uuid:7d6bcb5f-75d8-a156-da11-98b1628af629, level 10, PIC X(1)). */
    public String ccupChangeAction;

    /** CCUP-OLD-DETAILS (uuid:d16f30c9-d961-0ac5-0aab-1b4e919155de, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccupOldDetails;

    /** CCUP-OLD-ACCTID (uuid:0a3fe54a-72cf-6144-5472-08b4146d8905, level 10, PIC X(11).). */
    public String ccupOldAcctid;

    /** CCUP-OLD-CARDID (uuid:af903835-7e9a-368a-2e09-259c8d2f9854, level 10, PIC X(16).). */
    public String ccupOldCardid;

    /** CCUP-OLD-CVV-CD (uuid:02be6aae-2c68-7945-2601-887b5ad3d93d, level 10, PIC X(3).). */
    public String ccupOldCvvCd;

    /** CCUP-OLD-CARDDATA (uuid:ec85d973-809f-dc06-9df3-7136650cfece, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccupOldCarddata;

    /** CCUP-OLD-CRDNAME (uuid:6a1bfde8-7652-630e-4769-e51f8ff6d099, level 20, PIC X(50).). */
    public String ccupOldCrdname;

    /** CCUP-OLD-EXPIRAION-DATE (uuid:066b8232-dca8-d70d-4b61-a2d94571c3dd, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccupOldExpiraionDate;

    /** CCUP-OLD-EXPYEAR (uuid:6b0f3c2f-9f16-b687-dede-048e1305cfd7, level 25, PIC X(4).). */
    public String ccupOldExpyear;

    /** CCUP-OLD-EXPMON (uuid:6bde2b94-2667-aa92-9452-ba525ecbf070, level 25, PIC X(2).). */
    public String ccupOldExpmon;

    /** CCUP-OLD-EXPDAY (uuid:607ba8ec-389c-f079-0432-61e2a97e08fe, level 25, PIC X(2).). */
    public String ccupOldExpday;

    /** CCUP-OLD-CRDSTCD (uuid:0bb5ade7-f965-d627-f4f8-458a82e0353a, level 20, PIC X(1).). */
    public String ccupOldCrdstcd;

    /** CCUP-NEW-DETAILS (uuid:c75fad0b-86f7-f932-8bf1-5f34b266d6a4, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccupNewDetails;

    /** CCUP-NEW-ACCTID (uuid:103eb778-aa00-a1bf-153b-a4aa3ced5fa5, level 10, PIC X(11).). */
    public String ccupNewAcctid;

    /** CCUP-NEW-CARDID (uuid:83f5ac61-b041-56a1-0b4e-1705be544ff7, level 10, PIC X(16).). */
    public String ccupNewCardid;

    /** CCUP-NEW-CVV-CD (uuid:b4ba676b-cd97-ecd2-1285-cd6dc7727c09, level 10, PIC X(3).). */
    public String ccupNewCvvCd;

    /** CCUP-NEW-CARDDATA (uuid:2c0b6d8a-7dff-c4d4-c0e1-2722ca483160, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccupNewCarddata;

    /** CCUP-NEW-CRDNAME (uuid:ecc21846-6230-c3a4-0d07-5785b6ec5728, level 20, PIC X(50).). */
    public String ccupNewCrdname;

    /** CCUP-NEW-EXPIRAION-DATE (uuid:555a153b-a859-60f4-4009-afd8d1dc0d31, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccupNewExpiraionDate;

    /** CCUP-NEW-EXPYEAR (uuid:429b1e6a-a34b-96d9-a9ef-9c6dbb3b00d5, level 25, PIC X(4).). */
    public String ccupNewExpyear;

    /** CCUP-NEW-EXPMON (uuid:342cbc35-4d9a-da9f-29ff-8f1234fc9ecb, level 25, PIC X(2).). */
    public String ccupNewExpmon;

    /** CCUP-NEW-EXPDAY (uuid:0e99b0a8-df2f-5f2a-a221-cd3194fd49a9, level 25, PIC X(2).). */
    public String ccupNewExpday;

    /** CCUP-NEW-CRDSTCD (uuid:7424a1f6-f283-a0b7-bb3a-1fa5bdaf308f, level 20, PIC X(1).). */
    public String ccupNewCrdstcd;

    /** CARD-UPDATE-RECORD (uuid:7d6550cb-36ed-bf98-3438-c66617068e96, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardUpdateRecord;

    /** CARD-UPDATE-NUM (uuid:bd4a0af6-786a-26f6-6b9d-fcc76dbe4c03, level 10, PIC X(16).). */
    public String cardUpdateNum;

    /** CARD-UPDATE-ACCT-ID (uuid:da34df9a-74eb-8fe2-af12-42ad7929dc6c, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cardUpdateAcctId;

    /** CARD-UPDATE-CVV-CD (uuid:a66d151b-2412-8bb5-2d75-0c1d0f607f93, level 10, PIC 9(03).). */
    public int /* PIC 9(03). */ cardUpdateCvvCd;

    /** CARD-UPDATE-EMBOSSED-NAME (uuid:b2ed85cc-485e-bf2d-a4d3-2295524d5e3e, level 10, PIC X(50).). */
    public String cardUpdateEmbossedName;

    /** CARD-UPDATE-EXPIRAION-DATE (uuid:d510dffc-af07-a773-bd11-9a0fb92df211, level 10, PIC X(10).). */
    public String cardUpdateExpiraionDate;

    /** CARD-UPDATE-ACTIVE-STATUS (uuid:c9f7b594-330f-57e6-4807-d164486baa03, level 10, PIC X(01).). */
    public String cardUpdateActiveStatus;

    /** WS-COMMAREA (uuid:3ea5403c-d87a-000b-642f-8f96488e8425, level 1, PIC X(2000).). */
    public String wsCommarea;

    /** DFHBMSCA (uuid:176bd793-99a5-62d1-19d0-4ff8792b1a8d, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:bfea353f-7039-7952-ee22-fc73b17d0654, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:06c39d8c-4d3c-1d2a-0d7d-e6d2214d6e9b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:708b61ba-9ac4-022b-79ec-728794bbe1d5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:0fb04fb0-611b-aeb8-8caa-8008be2d3ae8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:9ab7a708-2f25-c536-e723-3a578e22d985, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:bae4f423-b833-f84c-680b-44da912f0e69, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:9618a941-c57e-4124-c0a3-4a57cdc73dbc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:53f62c9d-d882-f55e-010b-c2b957cb7240, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:fc863aad-4aa5-4376-f9fc-5da32fce366a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:01cba058-09fd-331a-06bb-fe7c5b977318, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:8e66337d-370d-413d-87f8-db29a1ef0f6a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:c1507b78-5f10-3ae1-317a-17ddd7b906cc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:a4e8348f-d715-7e60-8635-201f5ac80d5b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:45e9d461-cf06-d74b-259e-da78092bfd83, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:72c3b82a-4738-0a14-74d4-7154e9220cc3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:aa950e7f-4386-2e79-b9dd-0e5f0baabead, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:fc568152-48a6-f387-30de-587bda60f2c1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:19d586eb-a97d-1fc7-cfc0-9dbe9dc77cc7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:5bd9d604-f1ed-a61e-4852-35a77a4991d4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:aada0915-23af-3b4e-dd30-467b507a10ad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:3866dbfb-9f7d-1c40-522a-58d25d3a3bd7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:3a943e50-a714-25db-57b4-42c9a4792def, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:398c7f37-8176-0383-972f-7ad02ad8864b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:b9b8a830-9c7f-4d24-2875-929fe97a5508, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:467033f6-1b3d-d219-e01b-1016c98c6728, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:857e79d1-0ac5-8a2d-4289-bdb082ca9dc3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:1581d9bf-bf14-5be0-14be-60f76d81266d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:dcaeb21c-2751-0645-3488-65fffb8f2ce6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:42ec27f1-b1b6-a2f1-ad3e-1a963ad589f4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;

    /** DFHAID (uuid:2089d8ab-f4e5-e9f0-ae72-c8f1ab7bb05a, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:fba65663-3322-9f4c-7c46-3de2bd8aa60e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:1c596a66-a5d2-b124-116c-8ef5e68e6898, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:aa4dee4d-87ea-f58d-d60e-0bcc43f0d5fe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:1e196918-3994-eb87-193d-5e00263f394e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:2ff5214b-150e-3a63-d110-7a8d27b8234e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:5a012116-f69e-d123-eed1-77484cd111f7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:7a4be725-834e-5229-8b1c-c7654769b35e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:425f4acc-9e07-573c-0b69-e8cd24347efb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:59ebedec-656f-c5f4-a6ab-ee550eecbd4c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:f9e6b517-d16a-7cca-7360-df8c80a7e340, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:edfce0ae-a195-0795-49e4-e46d3cec47fa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:581f1a13-656a-0e1b-dc40-b5cc4b8c9df2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:b8929ebd-4043-1abf-d988-fbf5075ce6ef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:faeed494-c979-4bdf-94a2-d8a08da04018, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:3ccbd489-0c5d-45d3-4b15-13e14a83ad91, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:6858bd39-d52c-f0e6-c84b-d6fe74639a3b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:6d2f6695-ca55-891c-e331-6c6e2df436d6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:37e43eed-d189-56b1-2475-456aa179b575, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:6ee251fb-df43-6897-dc4e-2c884c089227, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:12056fd3-edec-32ff-cc6e-0758ca52fce8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:4b85218b-9068-c314-e0c4-c0a1d0ab4237, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:ca1359b2-3eaa-a4f2-aea4-e911fd75f40a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:606bf340-d2ef-70c9-3735-9964a26262ad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:9700fad6-76a1-e06b-9124-eacf8a611b95, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:14c6247e-d238-dffb-6b43-305c031cf265, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:313a2ad9-640a-0672-b172-634d5a4e4bce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:7b641531-3684-6099-8c66-6b151bc0e0e6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:a6422fea-4316-4298-52a0-1811e31d7720, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:7e9a27e4-12ed-a1f3-fcc8-e9c35dd131bb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:f68bc30b-b7d2-c16c-4303-97f64da2cb2d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:44f95a0e-cb35-b9ad-d774-6766cbb86666, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:7cba1bb2-9dfc-4d49-8c60-82f87cc55cd1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:ca7c6460-9f00-afe3-e0a9-d13b2a71c933, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:a0e9a7cb-6788-24d2-2355-c484b8d58f5e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:5aef42c8-487c-9d4f-c7fd-1b495e3f01d0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:df10c852-3e41-b8d1-beb7-7b7dcea4d39c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** CCDA-SCREEN-TITLE (uuid:f6b676f9-cf14-8aa6-2db0-4383e171493c, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:5ccce9d9-b522-9ecb-3b69-32c695b41110, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:82e7f90e-e45b-53c6-aa36-3f184cf27af3, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:460e6889-75e6-b6ad-7441-60490648c4ed, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** CCRDUPAI (uuid:2a58b558-574d-e973-02a0-0a369a9162c6, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccrdupai;

    /** TRNNAMEL (uuid:6ae23724-9441-bed3-ba36-dd8b5113dc07, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamel;

    /** TRNNAMEF (uuid:7def908c-2864-50a6-e982-79c81eb8ba22, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamef;

    /** TRNNAMEA (uuid:124c761a-e5cb-a243-8040-b43408aeed50, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamea;

    /** TRNNAMEI (uuid:b4c0d28a-6208-e639-dce8-40e6372a7211, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamei;

    /** TITLE01L (uuid:87fb18c2-a293-9697-2627-0098adc0a960, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01l;

    /** TITLE01F (uuid:890d377a-6a72-f219-7816-735bec7bf17b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01f;

    /** TITLE01A (uuid:47ccb4d0-86b0-7847-1b96-a381a999e576, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01a;

    /** TITLE01I (uuid:04f1bb44-1a08-7533-238a-f225e69026d8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01i;

    /** CURDATEL (uuid:9910eae4-a1ab-7c61-0f34-b7dffc07b5e8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatel;

    /** CURDATEF (uuid:adad4867-9513-32b6-b9dd-6dbf134654ed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatef;

    /** CURDATEA (uuid:c9c5d83a-2f0f-66f4-e408-4255200ac38b, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatea;

    /** CURDATEI (uuid:e985b68b-2b2e-e436-375e-d1e34f1d59bc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatei;

    /** PGMNAMEL (uuid:18b4a1df-670a-5b1a-149a-a325533a82e7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamel;

    /** PGMNAMEF (uuid:7e4fddb0-8b10-5883-5fa6-86f76c614256, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamef;

    /** PGMNAMEA (uuid:34639b78-153e-3105-bf9d-5d0bf96ecc82, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamea;

    /** PGMNAMEI (uuid:225afff7-b8b1-b0d0-6472-d47dcd3a50da, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamei;

    /** TITLE02L (uuid:cbaa6940-5ae4-5036-ca4a-ceedc328de46, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02l;

    /** TITLE02F (uuid:915424bc-9c68-c246-6b89-ee5b08d175fb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02f;

    /** TITLE02A (uuid:0a5b1c97-a4af-8cfe-1522-414246fc84e2, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02a;

    /** TITLE02I (uuid:57b07c6f-bf4a-c108-f0cb-f53e92fdb6ed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02i;

    /** CURTIMEL (uuid:43328d1c-111d-77c2-eeb3-356775ff7408, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimel;

    /** CURTIMEF (uuid:0b69e69e-597c-5906-fc88-4fa2315a8be2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimef;

    /** CURTIMEA (uuid:ba5e6151-c688-56ef-5569-af2094afcb1c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimea;

    /** CURTIMEI (uuid:3d41e6d8-8bed-9204-305c-86497f4d046a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimei;

    /** ACCTSIDL (uuid:dc3313ca-5ef1-af68-4271-c8fe0feb40ca, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidl;

    /** ACCTSIDF (uuid:ebe01ec7-81c0-1e48-7b69-289fd787c50b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidf;

    /** ACCTSIDA (uuid:9424757b-3c47-1064-e5c7-a7afa66449a9, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsida;

    /** ACCTSIDI (uuid:d7498e4d-7510-97a5-6b1c-5282603e01dc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidi;

    /** CARDSIDL (uuid:ed48ba5a-6243-40e1-45d5-8ef7a3819c6b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidl;

    /** CARDSIDF (uuid:61685bc2-4a02-305b-c244-4c4613b87e57, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidf;

    /** CARDSIDA (uuid:f2c625bd-12fb-e045-802d-305ea38eb076, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsida;

    /** CARDSIDI (uuid:7849e6b4-1d2a-c66b-060e-2e0bd28d4b80, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidi;

    /** CRDNAMEL (uuid:b9651bf5-09e2-108a-eb65-b37ecfb77a09, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnamel;

    /** CRDNAMEF (uuid:df40ab33-cd53-fd83-6ad5-38a90caea5f0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnamef;

    /** CRDNAMEA (uuid:f48171dc-7c1b-5836-dd6e-f9f5c6a87789, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnamea;

    /** CRDNAMEI (uuid:e2fc6e65-0c28-6899-3f42-56dee0164376, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnamei;

    /** CRDSTCDL (uuid:ab8587af-f771-f179-90cd-d1af36caed32, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcdl;

    /** CRDSTCDF (uuid:9bed17ca-fdba-b402-ebb9-d983f235ab7b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcdf;

    /** CRDSTCDA (uuid:962b673f-4b9a-18a7-6371-df57d0dfe027, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcda;

    /** CRDSTCDI (uuid:3026564d-eca2-cf76-b464-51eb3c525b73, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcdi;

    /** EXPMONL (uuid:199b6162-5326-ed9a-6bda-c02d59dd596e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonl;

    /** EXPMONF (uuid:2353b12c-9294-36e2-2950-85e59afaa134, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonf;

    /** EXPMONA (uuid:cd1e9065-513f-60aa-1002-4b64013e3456, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmona;

    /** EXPMONI (uuid:d95b6133-7361-d2b6-2e10-3a5a840fa651, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmoni;

    /** EXPYEARL (uuid:b558438e-0e63-e02d-85a2-69fdfd39321c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearl;

    /** EXPYEARF (uuid:c5b88302-4098-2368-32b3-205784a9e548, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearf;

    /** EXPYEARA (uuid:27f3856e-e7a7-1bdd-f6a8-cc767455134d, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyeara;

    /** EXPYEARI (uuid:87279f2e-7ce1-0cdf-cf94-6502adba6d31, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyeari;

    /** EXPDAYL (uuid:449c9c59-77bf-a299-bbdd-8d7c96904ee0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdayl;

    /** EXPDAYF (uuid:e06da6cf-f386-9b95-e418-4699b3bb9323, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdayf;

    /** EXPDAYA (uuid:e5a5061a-f68a-c97b-a630-4a19d1e52500, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdaya;

    /** EXPDAYI (uuid:c5a24dbd-72f7-1492-d94e-ff6e2e38266e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdayi;

    /** INFOMSGL (uuid:c46741d0-c892-795e-99ca-c7d1cb325123, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgl;

    /** INFOMSGF (uuid:ee507a09-708e-ff79-dec7-843715f69306, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgf;

    /** INFOMSGA (uuid:df79b146-c706-b098-d862-a80d24503305, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsga;

    /** INFOMSGI (uuid:1a6196ec-7330-9a2a-187e-38ead2a6e110, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgi;

    /** ERRMSGL (uuid:7a7a3776-2f7f-ae17-1916-1fbabd954ba1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgl;

    /** ERRMSGF (uuid:b8631376-8ca3-48d0-6f92-5e965a2618ae, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgf;

    /** ERRMSGA (uuid:5e0b0c77-369f-7614-3e4f-0aca1892250b, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsga;

    /** ERRMSGI (uuid:611883bd-0a1d-856a-72fc-df9081726e9b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgi;

    /** FKEYSL (uuid:c058d4fb-974e-0767-598d-15173a94cc82, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysl;

    /** FKEYSF (uuid:254f2f10-e54d-7c9e-925c-facfb9aecb1d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysf;

    /** FKEYSA (uuid:6cd559d5-107e-63cc-c578-489d07739862, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysa;

    /** FKEYSI (uuid:55a0ba0f-7bee-ecc8-3048-d421032a66ea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysi;

    /** FKEYSCL (uuid:59d0ddd2-0b1a-cc72-f4b4-150ebe861743, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeyscl;

    /** FKEYSCF (uuid:74463a8a-e85a-076d-80de-c677a531032b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeyscf;

    /** FKEYSCA (uuid:5044dcd3-7915-7107-bf79-ca7b0ef795fc, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysca;

    /** FKEYSCI (uuid:3f01c8ab-6f30-01a3-4f3d-23fbd07030a0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysci;

    /** CCRDUPAO (uuid:d56f74e1-06bb-3d5f-4636-29c23c7f6cd4, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccrdupao;

    /** TRNNAMEC (uuid:c60bfad3-98b3-336f-7a8d-728db9cf432f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamec;

    /** TRNNAMEP (uuid:20d88819-91e6-6a40-2e29-7703ede8f59a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamep;

    /** TRNNAMEH (uuid:32140e39-8798-57f6-dbfb-5161e405dab9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameh;

    /** TRNNAMEV (uuid:bbc334da-5844-bee2-852d-50f356a56d0e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamev;

    /** TRNNAMEO (uuid:dd05940a-b837-8687-a348-51f37f524689, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameo;

    /** TITLE01C (uuid:89130711-7bae-2668-5e21-a4451cedffea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01c;

    /** TITLE01P (uuid:4e8e2471-2e5e-5bfc-19b8-d56c81f3bb47, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01p;

    /** TITLE01H (uuid:f64cdb50-f5ae-80ea-c2d4-fbbf5074edfe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01h;

    /** TITLE01V (uuid:03c1c61f-6ef9-aaf0-9e50-e515cab61cbe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01v;

    /** TITLE01O (uuid:875c24ca-fbcc-d22d-2d07-4db73c0f6003, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01o;

    /** CURDATEC (uuid:c4e647a1-c710-6fb9-fddd-87db40870f61, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatec;

    /** CURDATEP (uuid:b639053d-afb2-6406-8004-ac1c352fbc7e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatep;

    /** CURDATEH (uuid:c97bf2f0-c634-8d84-ca4e-9544f71e6db0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateh;

    /** CURDATEV (uuid:67e8005f-e01a-e198-32f5-cd052ea768f5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatev;

    /** CURDATEO (uuid:39d44ae7-163d-c90f-3749-cf3f835a873e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateo;

    /** PGMNAMEC (uuid:d277bed4-601a-b209-f2f7-18778262c290, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamec;

    /** PGMNAMEP (uuid:cb408ede-c3e4-3071-4a82-38c0f515a87c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamep;

    /** PGMNAMEH (uuid:2822877a-011e-a845-bf8d-2c2b1a85a5c8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameh;

    /** PGMNAMEV (uuid:51f5a458-e394-61f8-0e46-19e6f0ed20fa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamev;

    /** PGMNAMEO (uuid:a35ba9c3-aa11-2b55-8270-4601583c4f9c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameo;

    /** TITLE02C (uuid:e93946f1-0c0d-ebfe-8411-cf7496dab600, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02c;

    /** TITLE02P (uuid:84e9db5d-014b-dfce-74b0-c026cdd3538d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02p;

    /** TITLE02H (uuid:06363b9d-f06f-a2fc-336f-ab32bf0e0734, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02h;

    /** TITLE02V (uuid:8ec9504f-e787-8103-ce8f-61780d8c5448, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02v;

    /** TITLE02O (uuid:9f75cc0b-80bf-800a-4b59-cd2754f2394c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02o;

    /** CURTIMEC (uuid:167cb294-ae4f-2377-a0d5-6bd9bbbe5163, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimec;

    /** CURTIMEP (uuid:eae27c95-512d-b9b8-a666-7f5ed6a4ea0f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimep;

    /** CURTIMEH (uuid:16c9042c-7ddf-5b22-3049-73f6cce39538, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeh;

    /** CURTIMEV (uuid:9ae50bab-b3e7-9b89-67f6-e2b7bfbceb7b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimev;

    /** CURTIMEO (uuid:7312ec78-9f56-a8c7-b382-928d7609d874, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeo;

    /** ACCTSIDC (uuid:63172c7c-65e6-2cb2-8096-d01ef6821760, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidc;

    /** ACCTSIDP (uuid:72ac6cbe-3305-d584-9cf1-e34675fe48a0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidp;

    /** ACCTSIDH (uuid:eb1f3ab2-c764-3517-f7ae-a76924778d28, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidh;

    /** ACCTSIDV (uuid:90d3fddc-b8c1-45da-76ff-0cb380014870, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidv;

    /** ACCTSIDO (uuid:35388b29-fd65-2b8d-cfe7-9e699a87c8ab, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsido;

    /** CARDSIDC (uuid:cf63b74c-7a5f-bd6d-ace9-def3920ed1f6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidc;

    /** CARDSIDP (uuid:6a6fa1b7-d855-b267-1dfc-2b98efc34ec7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidp;

    /** CARDSIDH (uuid:8d0f555e-6c5e-271e-b4bd-892eb797e31f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidh;

    /** CARDSIDV (uuid:c3c9baad-d81f-acfc-1de0-055a874d8b08, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidv;

    /** CARDSIDO (uuid:b4c54c23-ebdc-4a25-2f22-2edfe0e6ce3f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsido;

    /** CRDNAMEC (uuid:a9c0f7f9-240b-0c99-b24c-300ba5ef211d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnamec;

    /** CRDNAMEP (uuid:82984f57-847f-d469-4bb8-5469b5cb25a8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnamep;

    /** CRDNAMEH (uuid:fecc8909-1a2a-9e3b-2f01-4bdd477e5a30, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnameh;

    /** CRDNAMEV (uuid:5a39bcc3-fb54-5ea2-8e77-560d33bd1f17, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnamev;

    /** CRDNAMEO (uuid:7ddc8858-8564-d2f1-cd95-014fc6876d2d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnameo;

    /** CRDSTCDC (uuid:5982f107-1f04-0682-9044-dab461968c5a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcdc;

    /** CRDSTCDP (uuid:865508e0-0b43-187a-a5c9-0fd843d62ee4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcdp;

    /** CRDSTCDH (uuid:d1ae4596-579d-0afb-a3b4-afe69544e4a5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcdh;

    /** CRDSTCDV (uuid:50d4d536-a4af-15f5-63de-f7b3c71bc157, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcdv;

    /** CRDSTCDO (uuid:c84ac876-c689-6a5f-7078-c0d5eddf5d4e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcdo;

    /** EXPMONC (uuid:7d95f8b7-3903-8b19-0d2f-a4d2ed0548fc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonc;

    /** EXPMONP (uuid:4ef7be7b-76d8-8715-87bc-1f878128581e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonp;

    /** EXPMONH (uuid:9a466edf-2d9b-7534-9e71-306dfba96893, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonh;

    /** EXPMONV (uuid:9e30a62b-4a94-814d-e839-a9839b1807c6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonv;

    /** EXPMONO (uuid:2619c6bf-cc7e-9ec1-e307-25b1ff60a02b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmono;

    /** EXPYEARC (uuid:91d16937-8c6f-912d-ac08-3efb750006dd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearc;

    /** EXPYEARP (uuid:ffbec12b-6df2-bee0-0238-6b10527fbe06, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearp;

    /** EXPYEARH (uuid:c12545fb-75a3-93c7-9f47-6a25f69de34b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearh;

    /** EXPYEARV (uuid:b18e8495-fe6c-8a89-7f93-2c4a325eed53, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearv;

    /** EXPYEARO (uuid:12a32213-d7ff-7e34-5d59-229d975c6886, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearo;

    /** EXPDAYC (uuid:27e72fc7-cbc5-005f-4524-0e6f4d0a4db9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdayc;

    /** EXPDAYP (uuid:407893b8-478c-91e2-1476-a91db0265be9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdayp;

    /** EXPDAYH (uuid:997129ca-aa57-3911-6a73-5999fa1edce0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdayh;

    /** EXPDAYV (uuid:c3b65ced-6e7f-c7cc-d23a-3328de4d0fda, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdayv;

    /** EXPDAYO (uuid:e96a96c0-939e-1288-3b1a-743f098d7398, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdayo;

    /** INFOMSGC (uuid:15151223-0d85-1e5d-e4c5-e454fb27c09e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgc;

    /** INFOMSGP (uuid:40ad2e01-78e9-484e-8490-83031733af74, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgp;

    /** INFOMSGH (uuid:c287bdb2-19c9-1de6-85a7-2d1aa93a1f9a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgh;

    /** INFOMSGV (uuid:7fb110eb-ab2c-e06b-082e-bc44bc1a2395, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgv;

    /** INFOMSGO (uuid:44f0dba2-ba40-9f94-bb17-bb4cc17c1dc7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgo;

    /** ERRMSGC (uuid:c3efa4eb-96c2-30f6-ad98-8e7692f45ce1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgc;

    /** ERRMSGP (uuid:d7fe5556-23f6-7ed8-935e-6b0cc5b29c10, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgp;

    /** ERRMSGH (uuid:35fedf7b-87ec-e01d-66e7-637278d8b990, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgh;

    /** ERRMSGV (uuid:e53ec7da-18ab-c3d3-1613-c2425324acb5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgv;

    /** ERRMSGO (uuid:dd57d260-23e4-1a9d-e3dc-b20add85f5bb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgo;

    /** FKEYSC (uuid:de26cf45-cb05-8280-9dcf-69f120a16b7d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysc;

    /** FKEYSP (uuid:7fc53ce4-afe0-c4cb-d11f-5051eed66d3b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysp;

    /** FKEYSH (uuid:08a470b1-21cd-4bd4-e5e7-76d8329e1343, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysh;

    /** FKEYSV (uuid:08e6466d-88c2-0d08-18b6-30527369f06f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysv;

    /** FKEYSO (uuid:6d40f93c-3b39-73d3-b2fd-1b086c71a49d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeyso;

    /** FKEYSCC (uuid:1e700c56-d6d5-a134-4917-73d078035d9e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeyscc;

    /** FKEYSCP (uuid:7ab47e4f-e035-7176-3854-dd983d91462d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeyscp;

    /** FKEYSCH (uuid:5bdc8016-6274-e851-b603-9580dad7332f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysch;

    /** FKEYSCV (uuid:e2b95b06-b945-30f2-e5ed-2ef2c849ad95, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeyscv;

    /** FKEYSCO (uuid:280c2a98-4ec3-f157-618d-9fa3252b85d3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysco;

    /** WS-DATE-TIME (uuid:266fee92-274e-6314-8f98-ac941567911d, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:12b12440-dca6-7203-05f5-6c309e1af38b, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:434752d1-cd30-ac35-dbbb-d1dada181e09, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:1802dcf4-0e2d-a553-2a4d-5e9e5fb3b592, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:ee7671aa-534d-4b5b-7ff1-2a970f0369fe, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:b3b20fd2-a3eb-7c7a-479e-69403c4c5d53, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:e45d3bde-1016-4042-0cec-691bd82980a1, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:5f68ac43-9e86-ed4f-56d0-29e2e7977b30, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:a9105e0b-e8c1-5554-8d19-9fe90e7adcd4, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:159a184d-7bfb-e8b6-5d48-ea251d7b1faa, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:c9eee130-eb18-1d7a-27ee-acb1a8dd1e29, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:30c286b7-8c51-89d2-5d55-b875b9aced61, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:455663b9-e1a0-06d9-1dc0-9ff0aa69ef4b, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:e9291c13-f7a2-9479-edf7-5269223ebd71, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:bcd46000-6f70-172d-42a7-3036d7323257, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:f520df3d-e0a9-4e66-b215-7dff610be887, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:2787a386-c421-193b-7619-fdda9ead8d2e, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:237dafab-d665-85f6-1cda-1758a59861f3, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:c60f0544-01a4-6f91-2916-c2d178b7ff60, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:58b72191-8dca-1d45-62b8-531aeb66f8ba, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:730bff7c-2913-f209-4cbe-24bb4e4d7f86, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:5924f272-e929-9025-14e2-9132e59b2b8d, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:207da95e-ea7d-2704-a473-32512901216a, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:2c267f91-2202-cdad-444a-85dc56c5264c, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:28074e50-5e67-891d-7a8e-1c3baf3d4b9c, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:76131bbf-ac5f-4faa-9a3a-287c622eab71, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:376f2f4b-f210-39ec-34f7-0ff6131cfe70, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:93cb5289-f0fd-d5d6-5e2b-9cc5be19894e, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:29b8ad89-54d9-96f7-c70e-5bd82ce37e73, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:5f0d9b41-1512-02b6-1b96-dea0e1dba610, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:b2cf926d-41b7-f189-a612-355566f76dc1, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:2c811a20-6a9b-a1d0-6b62-9daca6b3c939, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** ABEND-DATA (uuid:b6f8347f-4dbd-5bf9-eb28-85bf1a5d01b0, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ abendData;

    /** ABEND-CODE (uuid:65fd9bfd-6e7c-4976-9695-dddd9a69c81b, level 5, PIC X(4)). */
    public String abendCode;

    /** ABEND-CULPRIT (uuid:dfe9cc27-aa97-47ec-0b2c-440ae78cca83, level 5, PIC X(8)). */
    public String abendCulprit;

    /** ABEND-REASON (uuid:5fea65c5-0a54-bd77-4451-6518b98b9f0b, level 5, PIC X(50)). */
    public String abendReason;

    /** ABEND-MSG (uuid:8b6403ae-3ed2-e9da-4500-f9e0e4724b3d, level 5, PIC X(72)). */
    public String abendMsg;

    /** SEC-USER-DATA (uuid:27da18fc-6b83-7033-1871-ec9305279dac, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ secUserData;

    /** SEC-USR-ID (uuid:e4cebdc9-cadf-7f30-ae19-9c736f80ad55, level 5, PIC X(08).). */
    public String secUsrId;

    /** SEC-USR-FNAME (uuid:d967f247-5b0d-4983-c475-8b7013c5e345, level 5, PIC X(20).). */
    public String secUsrFname;

    /** SEC-USR-LNAME (uuid:646a72dc-566a-9a04-9405-952904b8abb1, level 5, PIC X(20).). */
    public String secUsrLname;

    /** SEC-USR-PWD (uuid:dfb0c957-98e4-eef5-7579-4e67b489e52b, level 5, PIC X(08).). */
    public String secUsrPwd;

    /** SEC-USR-TYPE (uuid:23488211-7394-30e6-1649-af4149bb4512, level 5, PIC X(01).). */
    public String secUsrType;

    /** SEC-USR-FILLER (uuid:0eee9e5b-372d-7674-d54e-1018baf668d6, level 5, PIC X(23).). */
    public String secUsrFiller;

    /** CARD-RECORD (uuid:46d89f28-0a4d-210d-a600-112dbabf7ad9, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardRecord;

    /** CARD-NUM (uuid:a9aab208-9c3a-66b0-9b9a-e323b1ff6ead, level 5, PIC X(16).). */
    public String cardNum;

    /** CARD-ACCT-ID (uuid:eb60542d-c2b6-ad4b-e18a-46adc3e2e14e, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ cardAcctId;

    /** CARD-CVV-CD (uuid:2ba229bc-4927-3941-c9c1-e66927b03ce0, level 5, PIC 9(03).). */
    public int /* PIC 9(03). */ cardCvvCd;

    /** CARD-EMBOSSED-NAME (uuid:0c20ac7a-1daa-917c-f806-bc4e59308977, level 5, PIC X(50).). */
    public String cardEmbossedName;

    /** CARD-EXPIRAION-DATE (uuid:1742e74c-c101-db2d-b0f5-8011eb321877, level 5, PIC X(10).). */
    public String cardExpiraionDate;

    /** CARD-ACTIVE-STATUS (uuid:b894ff04-7966-2c3a-bf68-87212ca71bc6, level 5, PIC X(01).). */
    public String cardActiveStatus;

    /** CUSTOMER-RECORD (uuid:38a42f96-f656-77c3-b4a7-063dbe0df284, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ customerRecord;

    /** CUST-ID (uuid:9cd40f4c-ceae-8471-c8f1-4d96b3134645, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ custId;

    /** CUST-FIRST-NAME (uuid:8556d830-9812-6539-02fd-aba7e18c46e8, level 5, PIC X(25).). */
    public String custFirstName;

    /** CUST-MIDDLE-NAME (uuid:8c603ba7-0caa-2ff2-74ee-4a4363ca9a9e, level 5, PIC X(25).). */
    public String custMiddleName;

    /** CUST-LAST-NAME (uuid:9e027453-8bb2-e225-3b43-10714ff6c427, level 5, PIC X(25).). */
    public String custLastName;

    /** CUST-ADDR-LINE-1 (uuid:8088d2a8-e3e7-dae0-1e11-5ecdcd821a88, level 5, PIC X(50).). */
    public String custAddrLine1;

    /** CUST-ADDR-LINE-2 (uuid:53349550-8547-2599-238b-24e3221ba92b, level 5, PIC X(50).). */
    public String custAddrLine2;

    /** CUST-ADDR-LINE-3 (uuid:843ccd24-d27e-f0f8-0ea3-63abe67b8a21, level 5, PIC X(50).). */
    public String custAddrLine3;

    /** CUST-ADDR-STATE-CD (uuid:9081d0e2-6703-aa6d-f434-175aa8e3138f, level 5, PIC X(02).). */
    public String custAddrStateCd;

    /** CUST-ADDR-COUNTRY-CD (uuid:b87db5bd-9baf-b566-cd80-5afb26116ec3, level 5, PIC X(03).). */
    public String custAddrCountryCd;

    /** CUST-ADDR-ZIP (uuid:6cbddcfc-b69e-8ccc-0477-ddd4cc57764b, level 5, PIC X(10).). */
    public String custAddrZip;

    /** CUST-PHONE-NUM-1 (uuid:cfc2d51b-e0da-ef95-76d9-91274494dca6, level 5, PIC X(15).). */
    public String custPhoneNum1;

    /** CUST-PHONE-NUM-2 (uuid:1a53a20b-5052-d4e5-787e-5813c7524c01, level 5, PIC X(15).). */
    public String custPhoneNum2;

    /** CUST-SSN (uuid:edd83fcf-4850-c331-8e29-490994f3fe7a, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ custSsn;

    /** CUST-GOVT-ISSUED-ID (uuid:57668ec9-26d4-3f6b-b548-779e6b2d812b, level 5, PIC X(20).). */
    public String custGovtIssuedId;

    /** CUST-DOB-YYYY-MM-DD (uuid:73e7ef14-b3df-1533-2ed3-15bbdefdf7ea, level 5, PIC X(10).). */
    public String custDobYyyyMmDd;

    /** CUST-EFT-ACCOUNT-ID (uuid:03e1381b-b816-17a1-74c2-2bc91739acdb, level 5, PIC X(10).). */
    public String custEftAccountId;

    /** CUST-PRI-CARD-HOLDER-IND (uuid:483c9e3a-deb4-1315-44e6-de1e362b1ae2, level 5, PIC X(01).). */
    public String custPriCardHolderInd;

    /** CUST-FICO-CREDIT-SCORE (uuid:1b9bcfe6-d03d-a34a-0cb6-d40cba6d7133, level 5, PIC 9(03).). */
    public int /* PIC 9(03). */ custFicoCreditScore;


    // --- auto-generated stubs for undeclared references ---
    public Object dfhresp;  // auto-stub for undeclared reference

    /** 0000-MAIN  (uuid:4df526ab-3415-1ce0-35f1-f7d7c905de03, source lines 971-1148). */
    public void p0000Main() {
        // INITIALIZE ccWorkArea wsMiscStorage wsCommarea: reset to PIC defaults
        this.ccWorkArea = null;  // TODO: set to type-appropriate zero/spaces
        this.wsMiscStorage = null;  // TODO: set to type-appropriate zero/spaces
        this.wsCommarea = null;  // TODO: set to type-appropriate zero/spaces
        // MOVE LIT-THISTRANID TO WS-TRANID  -- identifier MOVE; needs PIC-aware type coercion
        // SET WS-RETURN-MSG-OFF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (((true /* TODO translate: EIBCALEN IS EQUAL TO 0 */) || (java.util.Objects.equals(this.(cdemoFromProgram, this.litMenupgm))) && (true /* TODO translate: NOT CDEMO-PGM-REENTER) */)) {
            // TODO: translate body for: EIBCALEN IS EQUAL TO 0 OR (CDEMO-FROM-PROGRAM = LIT-MENUPGM AND NOT CDEMO-PGM-REENTER)
        }
        this.yyyyStorePfkey();  // PERFORM
        // SET PFK-INVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (((true /* TODO translate: CCARD-AID-ENTER */) || (true /* TODO translate: CCARD-AID-PFK03 */) || (true /* TODO translate: (CCARD-AID-PFK05 */)) && ((true /* TODO translate: CCUP-CHANGES-OK-NOT-CONFIRMED) */) || (true /* TODO translate: (CCARD-AID-PFK12 */)) && (true /* TODO translate: NOT CCUP-DETAILS-NOT-FETCHED) */)) {
            // TODO: translate body for: CCARD-AID-ENTER OR CCARD-AID-PFK03 OR (CCARD-AID-PFK05 AND CCUP-CHANGES-OK-NOT-CONFIRMED) OR (CCARD-AID-PFK12 AND NOT CCUP-DETAILS-NOT-FETCHED)
        }
        if (true /* TODO translate: PFK-INVALID */) {
            // TODO: translate body for: PFK-INVALID
        }
        // EVALUATE TRUE *> ***************************************************************** *> USER PRESSES PF03 TO EXIT *> OR USER IS DONE WITH UPDATE *> XCTL TO CALLING PROGRAM OR MAIN MENU *> *****************************************************************
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if ((true /* TODO translate: TRUE *> ***************************************************************** *> USER PRESSES PF03 TO EXIT *> */) || (true /* TODO translate: USER IS DONE WITH UPDATE *> XCTL TO CALLING PROGRAM */) || (true /* TODO translate: MAIN MENU *> ***************************************************************** */)) { /* WHEN branches follow */ }
    }

    /** COMMON-RETURN  (uuid:c6f32286-514b-f2a4-20a6-efa3fbeaeb0a, source lines 1150-1163). */
    public void commonReturn() {
        // MOVE WS-RETURN-MSG TO CCARD-ERROR-MSG  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CARDDEMO-COMMAREA TO WS-COMMAREA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-THIS-PROGCOMMAREA TO WS-COMMAREA(LENGTH OF CARDDEMO-COMMAREA, LENGTH OF WS-THIS-PROGCOMMAREA  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 0000-MAIN-EXIT  (uuid:d270b398-067e-819f-b835-1c80901d9202, source lines 1164-1166). */
    public void p0000MainExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1000-PROCESS-INPUTS  (uuid:15505785-84b2-b559-1436-c3a17f3b51a9, source lines 1168-1177). */
    public void p1000ProcessInputs() {
        // COBOL [PERFORM]: PERFORM 1100-RECEIVE-MAP THRU 1100-RECEIVE-MAP-EXIT
        // COBOL [PERFORM]: PERFORM 1200-EDIT-MAP-INPUTS THRU 1200-EDIT-MAP-INPUTS-EXIT
        // MOVE WS-RETURN-MSG TO CCARD-ERROR-MSG  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISPGM TO CCARD-NEXT-PROG  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISMAPSET TO CCARD-NEXT-MAPSET  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISMAP TO CCARD-NEXT-MAP  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 1000-PROCESS-INPUTS-EXIT  (uuid:24fb3d99-442f-5c9b-2e89-05f858ea7a28, source lines 1179-1181). */
    public void p1000ProcessInputsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1100-RECEIVE-MAP  (uuid:386b998d-bceb-1c0f-f262-82ebe6317415, source lines 1182-1240). */
    public void p1100ReceiveMap() {
        // INITIALIZE ccupNewDetails: reset to PIC defaults
        this.ccupNewDetails = null;  // TODO: set to type-appropriate zero/spaces
        if ((true /* TODO translate: ACCTSIDI OF CCRDUPAI = '*' */) || (true /* TODO translate: ACCTSIDI OF CCRDUPAI = SPACES */)) {
            // TODO: translate body for: ACCTSIDI OF CCRDUPAI = '*' OR ACCTSIDI OF CCRDUPAI = SPACES
        }
        if ((true /* TODO translate: CARDSIDI OF CCRDUPAI = '*' */) || (true /* TODO translate: CARDSIDI OF CCRDUPAI = SPACES */)) {
            // TODO: translate body for: CARDSIDI OF CCRDUPAI = '*' OR CARDSIDI OF CCRDUPAI = SPACES
        }
        if ((true /* TODO translate: CRDNAMEI OF CCRDUPAI = '*' */) || (true /* TODO translate: CRDNAMEI OF CCRDUPAI = SPACES */)) {
            // TODO: translate body for: CRDNAMEI OF CCRDUPAI = '*' OR CRDNAMEI OF CCRDUPAI = SPACES
        }
        if ((true /* TODO translate: CRDSTCDI OF CCRDUPAI = '*' */) || (true /* TODO translate: CRDSTCDI OF CCRDUPAI = SPACES */)) {
            // TODO: translate body for: CRDSTCDI OF CCRDUPAI = '*' OR CRDSTCDI OF CCRDUPAI = SPACES
        }
        // MOVE EXPDAYI OF CCRDUPAI TO CCUP-NEW-EXPDAY  -- identifier MOVE; needs PIC-aware type coercion
        if ((true /* TODO translate: EXPMONI OF CCRDUPAI = '*' */) || (true /* TODO translate: EXPMONI OF CCRDUPAI = SPACES */)) {
            // TODO: translate body for: EXPMONI OF CCRDUPAI = '*' OR EXPMONI OF CCRDUPAI = SPACES
        }
        if ((true /* TODO translate: EXPYEARI OF CCRDUPAI = '*' */) || (true /* TODO translate: EXPYEARI OF CCRDUPAI = SPACES */)) {
            // TODO: translate body for: EXPYEARI OF CCRDUPAI = '*' OR EXPYEARI OF CCRDUPAI = SPACES
        }
    }

    /** 1100-RECEIVE-MAP-EXIT  (uuid:41220173-62c6-ba26-b7ea-cea568984540, source lines 1242-1244). */
    public void p1100ReceiveMapExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1200-EDIT-MAP-INPUTS  (uuid:6e9746c0-0750-b39d-f965-7c639ca96ced, source lines 1245-1319). */
    public void p1200EditMapInputs() {
        // SET INPUT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (true /* TODO translate: CCUP-DETAILS-NOT-FETCHED *> VALIDATE THE SEARCH KEYS */) {
            // TODO: translate body for: CCUP-DETAILS-NOT-FETCHED *> VALIDATE THE SEARCH KEYS
        }
        // SET FOUND-CARDS-FOR-ACCOUNT TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET FLG-ACCTFILTER-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET FLG-CARDFILTER-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // MOVE CCUP-OLD-ACCTID TO CDEMO-ACCT-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCUP-OLD-CARDID TO CDEMO-CARD-NUM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCUP-OLD-CRDNAME TO CARD-EMBOSSED-NAME  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCUP-OLD-CRDSTCD TO CARD-ACTIVE-STATUS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCUP-OLD-EXPDAY TO CARD-EXPIRY-DAY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCUP-OLD-EXPMON TO CARD-EXPIRY-MONTH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCUP-OLD-EXPYEAR TO CARD-EXPIRY-YEAR  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: (FUNCTION UPPER-CASE(CCUP-NEW-CARDDATA) EQUAL FUNCTION UPPER-CASE(CCUP-OLD-CARDDATA)) */) {
            // TODO: translate body for: (FUNCTION UPPER-CASE(CCUP-NEW-CARDDATA) EQUAL FUNCTION UPPER-CASE(CCUP-OLD-CARDDATA))
        }
        if ((true /* TODO translate: NO-CHANGES-DETECTED */) || (true /* TODO translate: CCUP-CHANGES-OK-NOT-CONFIRMED */) || (true /* TODO translate: CCUP-CHANGES-OKAYED-AND-DONE */)) {
            // TODO: translate body for: NO-CHANGES-DETECTED OR CCUP-CHANGES-OK-NOT-CONFIRMED OR CCUP-CHANGES-OKAYED-AND-DONE
        }
        // SET CCUP-CHANGES-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [PERFORM]: PERFORM 1230-EDIT-NAME THRU 1230-EDIT-NAME-EXIT
        // COBOL [PERFORM]: PERFORM 1240-EDIT-CARDSTATUS THRU 1240-EDIT-CARDSTATUS-EXIT
        // COBOL [PERFORM]: PERFORM 1250-EDIT-EXPIRY-MON THRU 1250-EDIT-EXPIRY-MON-EXIT
        // COBOL [PERFORM]: PERFORM 1260-EDIT-EXPIRY-YEAR THRU 1260-EDIT-EXPIRY-YEAR-EXIT
        if (true /* TODO translate: INPUT-ERROR */) {
            // TODO: translate body for: INPUT-ERROR
        }
    }

    /** 1200-EDIT-MAP-INPUTS-EXIT  (uuid:be3c834c-8e11-b680-7045-f6c117f75262, source lines 1321-1323). */
    public void p1200EditMapInputsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1210-EDIT-ACCOUNT  (uuid:5a585e98-8643-7f60-65d1-c9c7adcc4026, source lines 1325-1360). */
    public void p1210EditAccount() {
        // SET FLG-ACCTFILTER-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.ccAcctId, "\u0000")) {
            // TODO: translate body for: CC-ACCT-ID EQUAL LOW-VALUES OR CC-ACCT-ID EQUAL SPACES OR CC-ACCT-ID-N EQUAL ZEROS
        }
        if (!this.ccAcctId.toString().matches("-?\\d+(\\.\\d+)?")) {
            // TODO: translate body for: CC-ACCT-ID IS NOT NUMERIC
        }
    }

    /** 1210-EDIT-ACCOUNT-EXIT  (uuid:483fd763-3d2d-e109-3859-d84450319722, source lines 1362-1364). */
    public void p1210EditAccountExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1220-EDIT-CARD  (uuid:f7b3ab0b-1d80-83ec-ff7a-1d6c61172844, source lines 1366-1404). */
    public void p1220EditCard() {
        // SET FLG-CARDFILTER-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.ccCardNum, "\u0000")) {
            // TODO: translate body for: CC-CARD-NUM EQUAL LOW-VALUES OR CC-CARD-NUM EQUAL SPACES OR CC-CARD-NUM-N EQUAL ZEROS
        }
        if (!this.ccCardNum.toString().matches("-?\\d+(\\.\\d+)?")) {
            // TODO: translate body for: CC-CARD-NUM IS NOT NUMERIC
        }
    }

    /** 1220-EDIT-CARD-EXIT  (uuid:b226097f-f7b7-8fcf-68dc-58fb5ca5873c, source lines 1406-1408). */
    public void p1220EditCardExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1230-EDIT-NAME  (uuid:f2244108-308f-f5f2-7fcc-d0e5bbf34a91, source lines 1410-1444). */
    public void p1230EditName() {
        // SET FLG-CARDNAME-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.ccupNewCrdname, "\u0000")) {
            // TODO: translate body for: CCUP-NEW-CRDNAME EQUAL LOW-VALUES OR CCUP-NEW-CRDNAME EQUAL SPACES OR CCUP-NEW-CRDNAME EQUAL ZEROS
        }
        // MOVE CCUP-NEW-CRDNAME TO CARD-NAME-CHECK  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [INSPECT]: INSPECT CARD-NAME-CHECK CONVERTING LIT-ALL-ALPHA-FROM TO LIT-ALL-SPACES-TO
        if (true /* TODO translate: FUNCTION LENGTH(FUNCTION TRIM(CARD-NAME-CHECK)) = 0 */) {
            // TODO: translate body for: FUNCTION LENGTH(FUNCTION TRIM(CARD-NAME-CHECK)) = 0
        }
        // SET FLG-CARDNAME-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** 1230-EDIT-NAME-EXIT  (uuid:7fa7b1c1-763b-ddbf-f9ae-a6e3a104e0a7, source lines 1445-1447). */
    public void p1230EditNameExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1240-EDIT-CARDSTATUS  (uuid:a4b19724-f546-fbff-df9b-5fa561ca0586, source lines 1449-1477). */
    public void p1240EditCardstatus() {
        // SET FLG-CARDSTATUS-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.ccupNewCrdstcd, "\u0000")) {
            // TODO: translate body for: CCUP-NEW-CRDSTCD EQUAL LOW-VALUES OR CCUP-NEW-CRDSTCD EQUAL SPACES OR CCUP-NEW-CRDSTCD EQUAL ZEROS
        }
        // MOVE CCUP-NEW-CRDSTCD TO FLG-YES-NO-CHECK  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: FLG-YES-NO-VALID */) {
            // TODO: translate body for: FLG-YES-NO-VALID
        }
    }

    /** 1240-EDIT-CARDSTATUS-EXIT  (uuid:57eff315-8bf1-c739-04f2-0a621d829374, source lines 1478-1480). */
    public void p1240EditCardstatusExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1250-EDIT-EXPIRY-MON  (uuid:b7b98b35-f8b3-871d-6368-666a7151c369, source lines 1481-1512). */
    public void p1250EditExpiryMon() {
        // SET FLG-CARDEXPMON-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.ccupNewExpmon, "\u0000")) {
            // TODO: translate body for: CCUP-NEW-EXPMON EQUAL LOW-VALUES OR CCUP-NEW-EXPMON EQUAL SPACES OR CCUP-NEW-EXPMON EQUAL ZEROS
        }
        // MOVE CCUP-NEW-EXPMON TO CARD-MONTH-CHECK  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: VALID-MONTH */) {
            // TODO: translate body for: VALID-MONTH
        }
    }

    /** 1250-EDIT-EXPIRY-MON-EXIT  (uuid:3546167d-c002-5038-6c9b-5faab7198b85, source lines 1514-1516). */
    public void p1250EditExpiryMonExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1260-EDIT-EXPIRY-YEAR  (uuid:3237ca68-17db-6c8e-9051-743aefb8b36d, source lines 1517-1548). */
    public void p1260EditExpiryYear() {
        if (java.util.Objects.equals(this.ccupNewExpyear, "\u0000")) {
            // TODO: translate body for: CCUP-NEW-EXPYEAR EQUAL LOW-VALUES OR CCUP-NEW-EXPYEAR EQUAL SPACES OR CCUP-NEW-EXPYEAR EQUAL ZEROS
        }
        // SET FLG-CARDEXPYEAR-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // MOVE CCUP-NEW-EXPYEAR TO CARD-YEAR-CHECK  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: VALID-YEAR */) {
            // TODO: translate body for: VALID-YEAR
        }
    }

    /** 1260-EDIT-EXPIRY-YEAR-EXIT  (uuid:cefe50cd-27bc-e591-7285-a8dbc2215bf3, source lines 1549-1551). */
    public void p1260EditExpiryYearExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2000-DECIDE-ACTION  (uuid:cba10828-67ff-9f71-b1c4-9a53da874be8, source lines 1552-1632). */
    public void p2000DecideAction() {
        // EVALUATE TRUE *> ***************************************************************** *> NO DETAILS SHOWN. *> SO GET THEM AND SETUP DETAIL EDIT SCREEN *> *****************************************************************
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if ((true /* TODO translate: TRUE *> ***************************************************************** *> NO DETAILS SHOWN. *> SO GET THEM */) && (true /* TODO translate: SETUP DETAIL EDIT SCREEN *> ***************************************************************** */)) { /* WHEN branches follow */ }
    }

    /** 2000-DECIDE-ACTION-EXIT  (uuid:4d982b7d-427d-3206-4ef4-b6c7c08d5574, source lines 1633-1635). */
    public void p2000DecideActionExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3000-SEND-MAP  (uuid:cc9d027a-6c83-2a97-42e9-9adf612a0dfe, source lines 1639-1650). */
    public void p3000SendMap() {
        // COBOL [PERFORM]: PERFORM 3100-SCREEN-INIT THRU 3100-SCREEN-INIT-EXIT
        // COBOL [PERFORM]: PERFORM 3200-SETUP-SCREEN-VARS THRU 3200-SETUP-SCREEN-VARS-EXIT
        // COBOL [PERFORM]: PERFORM 3250-SETUP-INFOMSG THRU 3250-SETUP-INFOMSG-EXIT
        // COBOL [PERFORM]: PERFORM 3300-SETUP-SCREEN-ATTRS THRU 3300-SETUP-SCREEN-ATTRS-EXIT
        // COBOL [PERFORM]: PERFORM 3400-SEND-SCREEN THRU 3400-SEND-SCREEN-EXIT
    }

    /** 3000-SEND-MAP-EXIT  (uuid:c3131976-a89d-eaf9-dac2-9637b6bd6dd5, source lines 1652-1654). */
    public void p3000SendMapExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3100-SCREEN-INIT  (uuid:e18a4bd2-68e8-5ae3-45fe-68b663b86430, source lines 1656-1680). */
    public void p3100ScreenInit() {
        this.ccrdupao = "\u0000";
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF CCRDUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF CCRDUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISTRANID TO TRNNAMEO OF CCRDUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISPGM TO PGMNAMEO OF CCRDUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF CCRDUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF CCRDUPAO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 3100-SCREEN-INIT-EXIT  (uuid:63eb94d2-76b2-8182-de18-f3f86d2aac85, source lines 1682-1684). */
    public void p3100ScreenInitExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3200-SETUP-SCREEN-VARS  (uuid:9e9a3d22-8fc8-5d4a-5f80-3f8672253129, source lines 1686-1738). */
    public void p3200SetupScreenVars() {
        if (true /* TODO translate: CDEMO-PGM-ENTER */) {
            // TODO: translate body for: CDEMO-PGM-ENTER
        }
    }

    /** 3200-SETUP-SCREEN-VARS-EXIT  (uuid:37ad6f48-75eb-8bf3-79fe-6becfeaaa5cb, source lines 1739-1741). */
    public void p3200SetupScreenVarsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3250-SETUP-INFOMSG  (uuid:4ffd3cdf-1e30-64d1-86ab-da4bfcb1e05d, source lines 1742-1768). */
    public void p3250SetupInfomsg() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        // MOVE WS-INFO-MSG TO INFOMSGO OF CCRDUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-RETURN-MSG TO ERRMSGO OF CCRDUPAO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 3250-SETUP-INFOMSG-EXIT  (uuid:9249fb4a-1c93-0dc0-7295-dd6dbe0ec1ed, source lines 1769-1771). */
    public void p3250SetupInfomsgExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3300-SETUP-SCREEN-ATTRS  (uuid:265b38e8-eac9-1851-a6b6-54fdbb723d16, source lines 1772-1922). */
    public void p3300SetupScreenAttrs() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        if (java.util.Objects.equals(this.cdemoLastMapset, this.litCclistmapset)) {
            // TODO: translate body for: CDEMO-LAST-MAPSET EQUAL LIT-CCLISTMAPSET
        }
        if (true /* TODO translate: FLG-ACCTFILTER-NOT-OK */) {
            // TODO: translate body for: FLG-ACCTFILTER-NOT-OK
        }
        if ((true /* TODO translate: FLG-ACCTFILTER-BLANK */) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: FLG-ACCTFILTER-BLANK AND CDEMO-PGM-REENTER
        }
        if (true /* TODO translate: FLG-CARDFILTER-NOT-OK */) {
            // TODO: translate body for: FLG-CARDFILTER-NOT-OK
        }
        if ((true /* TODO translate: FLG-CARDFILTER-BLANK */) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: FLG-CARDFILTER-BLANK AND CDEMO-PGM-REENTER
        }
        if ((true /* TODO translate: FLG-CARDNAME-NOT-OK */) && (true /* TODO translate: CCUP-CHANGES-NOT-OK */)) {
            // TODO: translate body for: FLG-CARDNAME-NOT-OK AND CCUP-CHANGES-NOT-OK
        }
        if ((true /* TODO translate: FLG-CARDNAME-BLANK */) && (true /* TODO translate: CCUP-CHANGES-NOT-OK */)) {
            // TODO: translate body for: FLG-CARDNAME-BLANK AND CCUP-CHANGES-NOT-OK
        }
        if ((true /* TODO translate: FLG-CARDSTATUS-NOT-OK */) && (true /* TODO translate: CCUP-CHANGES-NOT-OK */)) {
            // TODO: translate body for: FLG-CARDSTATUS-NOT-OK AND CCUP-CHANGES-NOT-OK
        }
        if ((true /* TODO translate: FLG-CARDSTATUS-BLANK */) && (true /* TODO translate: CCUP-CHANGES-NOT-OK */)) {
            // TODO: translate body for: FLG-CARDSTATUS-BLANK AND CCUP-CHANGES-NOT-OK
        }
        // MOVE DFHBMDAR TO EXPDAYC OF CCRDUPAO  -- identifier MOVE; needs PIC-aware type coercion
        if ((true /* TODO translate: FLG-CARDEXPMON-NOT-OK */) && (true /* TODO translate: CCUP-CHANGES-NOT-OK */)) {
            // TODO: translate body for: FLG-CARDEXPMON-NOT-OK AND CCUP-CHANGES-NOT-OK
        }
        if ((true /* TODO translate: FLG-CARDEXPMON-BLANK */) && (true /* TODO translate: CCUP-CHANGES-NOT-OK */)) {
            // TODO: translate body for: FLG-CARDEXPMON-BLANK AND CCUP-CHANGES-NOT-OK
        }
        if ((true /* TODO translate: FLG-CARDEXPYEAR-NOT-OK */) && (true /* TODO translate: CCUP-CHANGES-NOT-OK */)) {
            // TODO: translate body for: FLG-CARDEXPYEAR-NOT-OK AND CCUP-CHANGES-NOT-OK
        }
        if ((true /* TODO translate: FLG-CARDEXPYEAR-BLANK */) && (true /* TODO translate: CCUP-CHANGES-NOT-OK */)) {
            // TODO: translate body for: FLG-CARDEXPYEAR-BLANK AND CCUP-CHANGES-NOT-OK
        }
        if (true /* TODO translate: WS-NO-INFO-MESSAGE */) {
            // TODO: translate body for: WS-NO-INFO-MESSAGE
        }
        if (true /* TODO translate: PROMPT-FOR-CONFIRMATION */) {
            // TODO: translate body for: PROMPT-FOR-CONFIRMATION
        }
    }

    /** 3300-SETUP-SCREEN-ATTRS-EXIT  (uuid:d46f5991-2221-3d00-3565-4b6205d71b47, source lines 1923-1925). */
    public void p3300SetupScreenAttrsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3400-SEND-SCREEN  (uuid:17b7b97f-f1ae-377b-83ad-0df4d473b974, source lines 1928-1941). */
    public void p3400SendScreen() {
        // MOVE LIT-THISMAPSET TO CCARD-NEXT-MAPSET  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISMAP TO CCARD-NEXT-MAP  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 3400-SEND-SCREEN-EXIT  (uuid:c9b4be27-6ed8-9d55-b15a-b89520b49c09, source lines 1942-1944). */
    public void p3400SendScreenExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9000-READ-DATA  (uuid:b7302aef-23e4-0cb0-b7a1-dbfdbfd2328f, source lines 1947-1974). */
    public void p9000ReadData() {
        // INITIALIZE ccupOldDetails: reset to PIC defaults
        this.ccupOldDetails = null;  // TODO: set to type-appropriate zero/spaces
        // MOVE CC-ACCT-ID TO CCUP-OLD-ACCTID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CC-CARD-NUM TO CCUP-OLD-CARDID  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 9100-GETCARD-BYACCTCARD THRU 9100-GETCARD-BYACCTCARD-EXIT
        if (true /* TODO translate: FOUND-CARDS-FOR-ACCOUNT */) {
            // TODO: translate body for: FOUND-CARDS-FOR-ACCOUNT
        }
    }

    /** 9000-READ-DATA-EXIT  (uuid:6f65816d-e0a6-9dc4-d21e-7b65cfaf84ee, source lines 1976-1978). */
    public void p9000ReadDataExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9100-GETCARD-BYACCTCARD  (uuid:2ba31259-da52-a388-05c7-eeea22d98d0e, source lines 1980-2017). */
    public void p9100GetcardByacctcard() {
        // MOVE CC-CARD-NUM TO WS-CARD-RID-CARDNUM  -- identifier MOVE; needs PIC-aware type coercion
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** 9100-GETCARD-BYACCTCARD-EXIT  (uuid:197ff6e1-beb2-be08-0bb0-07d93b0b2121, source lines 2019-2021). */
    public void p9100GetcardByacctcardExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9200-WRITE-PROCESSING  (uuid:fbc3aa48-c131-7d3d-17af-46affd185c26, source lines 2024-2097). */
    public void p9200WriteProcessing() {
        // MOVE CC-CARD-NUM TO WS-CARD-RID-CARDNUM  -- identifier MOVE; needs PIC-aware type coercion
        if (java.util.Objects.equals(this.wsRespCd, this.dfhresp(normal))) {
            // TODO: translate body for: WS-RESP-CD EQUAL TO DFHRESP(NORMAL)
        }
        // COBOL [PERFORM]: PERFORM 9300-CHECK-CHANGE-IN-REC THRU 9300-CHECK-CHANGE-IN-REC-EXIT
        if (true /* TODO translate: DATA-WAS-CHANGED-BEFORE-UPDATE */) {
            // TODO: translate body for: DATA-WAS-CHANGED-BEFORE-UPDATE
        }
        // INITIALIZE cardUpdateRecord: reset to PIC defaults
        this.cardUpdateRecord = null;  // TODO: set to type-appropriate zero/spaces
        // MOVE CCUP-NEW-CARDID TO CARD-UPDATE-NUM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CC-ACCT-ID-N TO CARD-UPDATE-ACCT-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCUP-NEW-CVV-CD TO CARD-CVV-CD-X  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CARD-CVV-CD-N TO CARD-UPDATE-CVV-CD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCUP-NEW-CRDNAME TO CARD-UPDATE-EMBOSSED-NAME  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [STRING]: STRING CCUP-NEW-EXPYEAR '-' CCUP-NEW-EXPMON '-' CCUP-NEW-EXPDAY DELIMITED BY SIZE INTO CARD-UPDATE-EXPIRAION-DATE END-STRING
        // MOVE CCUP-NEW-CRDSTCD TO CARD-UPDATE-ACTIVE-STATUS  -- identifier MOVE; needs PIC-aware type coercion
        if (java.util.Objects.equals(this.wsRespCd, this.dfhresp(normal))) {
            // TODO: translate body for: WS-RESP-CD EQUAL TO DFHRESP(NORMAL)
        }
    }

    /** 9200-WRITE-PROCESSING-EXIT  (uuid:641fc8ef-7baf-3b75-34d1-a552c1cc406b, source lines 2098-2100). */
    public void p9200WriteProcessingExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9300-CHECK-CHANGE-IN-REC  (uuid:476d73bc-deb9-c8c5-1315-b51233fc0b60, source lines 2102-2124). */
    public void p9300CheckChangeInRec() {
        // COBOL [INSPECT]: INSPECT CARD-EMBOSSED-NAME CONVERTING LIT-LOWER TO LIT-UPPER
        if (java.util.Objects.equals(this.cardCvvCd, this.ccupOldCvvCd)) {
            // TODO: translate body for: CARD-CVV-CD EQUAL TO CCUP-OLD-CVV-CD AND CARD-EMBOSSED-NAME EQUAL TO CCUP-OLD-CRDNAME AND CARD-EXPIRAION-DATE(1:4) EQUAL TO CCUP-OLD-EXPYEAR AND CARD-EXPIRAION-DATE(6:2) EQUAL TO CCUP-OLD-EXPMON AND CARD-EXPIRAION-DATE(9:2) EQUAL TO CCUP-OLD-EXPDAY AND CARD-ACTIVE-STATUS EQUAL TO CCUP-OLD-CRDSTCD
        }
        // COBOL [EXIT]: EXIT
    }

    /** 9300-CHECK-CHANGE-IN-REC-EXIT  (uuid:d39598d5-0c68-86a1-b571-466f16b218bc, source lines 2125-2127). */
    public void p9300CheckChangeInRecExit() {
        // COBOL [EXIT]: EXIT
    }

    /** YYYY-STORE-PFKEY  (uuid:59010df5-b628-76e6-60c9-0ea64c0f4d33, source lines 2148-2210). */
    public void yyyyStorePfkey() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
    }

    /** YYYY-STORE-PFKEY-EXIT  (uuid:55c04d8a-c273-b25a-1bfa-6d763cabe8ba, source lines 2211-2213). */
    public void yyyyStorePfkeyExit() {
        // COBOL [EXIT]: EXIT
    }

    /** ABEND-ROUTINE  (uuid:43e3fee9-36cf-ec5b-2c0d-1431d1f132b6, source lines 2219-2241). */
    public void abendRoutine() {
        if (java.util.Objects.equals(this.abendMsg, "\u0000")) {
            // TODO: translate body for: ABEND-MSG EQUAL LOW-VALUES
        }
        // MOVE LIT-THISPGM TO ABEND-CULPRIT  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** ABEND-ROUTINE-EXIT  (uuid:cc2f989e-a576-3ab0-7000-7526fdce7631, source lines 2242-2244). */
    public void abendRoutineExit() {
        // COBOL [EXIT]: EXIT
    }

    public static void main(String[] args) {
        new Cocrdupc().mainPara();
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
