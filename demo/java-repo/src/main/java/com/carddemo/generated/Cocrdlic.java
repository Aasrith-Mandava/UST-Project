// Generated from COCRDLIC.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COCRDLIC.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * COCRDLIC (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: COCRDLIC.cbl
 */
public class Cocrdlic {

    /** WS-MISC-STORAGE (uuid:bd24cde8-10c0-c10b-5647-ecb59c9b2f4f, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsMiscStorage;

    /** WS-CICS-PROCESSNG-VARS (uuid:b91a89f2-14c2-ad19-3f73-88b211f6f9f1, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCicsProcessngVars;

    /** WS-RESP-CD (uuid:28bb1b26-faeb-d002-f665-1c5db824c69a, level 7, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsRespCd;

    /** WS-REAS-CD (uuid:d4f85edc-9ee9-1807-a8de-5a0f57483568, level 7, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsReasCd;

    /** WS-TRANID (uuid:05e1f66e-757a-7d5b-df9c-f9cd767102b6, level 7, PIC X(4)). */
    public String wsTranid;

    /** WS-INPUT-FLAG (uuid:48b7a376-b7e2-bd1a-bfd3-3d272fa0e98d, level 5, PIC X(1).). */
    public String wsInputFlag;

    /** WS-EDIT-ACCT-FLAG (uuid:c0b5f51b-06a2-2769-a9ce-b35ae950dd24, level 5, PIC X(1).). */
    public String wsEditAcctFlag;

    /** WS-EDIT-CARD-FLAG (uuid:4fcd67c5-9615-3145-6c7a-7ad088718cd8, level 5, PIC X(1).). */
    public String wsEditCardFlag;

    /** WS-EDIT-SELECT-COUNTER (uuid:5034920a-add7-4de7-9048-5b0a3bc74ff8, level 5, PIC S9(04)). */
    public int /* PIC S9(04) signed */ wsEditSelectCounter;

    /** WS-EDIT-SELECT-FLAGS (uuid:353b28db-f65e-7020-1bea-1d5dfdd51ef0, level 5, PIC X(7)). */
    public String wsEditSelectFlags;

    /** WS-EDIT-SELECT-ARRAY (uuid:090ed881-2b93-fd42-6d7f-b8cca4c3288c, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditSelectArray;

    /** WS-EDIT-SELECT (uuid:deed0b1b-9780-5c3a-6b41-f117d6fdcc3d, level 10, PIC X(1)). */
    public String wsEditSelect;

    /** WS-EDIT-SELECT-ERROR-FLAGS (uuid:5a8d0b38-658c-0149-c4d3-1b6b4b083eb6, level 5, PIC X(7).). */
    public String wsEditSelectErrorFlags;

    /** WS-EDIT-SELECT-ERROR-FLAGX (uuid:d42fe62d-d508-cdfa-433a-00345e8b7236, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditSelectErrorFlagx;

    /** WS-EDIT-SELECT-ERRORS (uuid:de03608f-f039-134b-213c-65df900e1c47, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditSelectErrors;

    /** WS-ROW-CRDSELECT-ERROR (uuid:4c872bbb-6bbf-9730-5270-8a9f872260e3, level 20, PIC X(1).). */
    public String wsRowCrdselectError;

    /** WS-SUBSCRIPT-VARS (uuid:ff5dbba8-c53e-3b8c-2f39-acb8711832d7, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsSubscriptVars;

    /** I (uuid:6a16de39-aa24-a710-7f06-0e37a028cfbb, level 10, PIC S9(4) COMP). */
    public int /* PIC S9(4) signed */ i;

    /** I-SELECTED (uuid:ce008e2f-4dd6-73d9-79e6-cc27654b4a64, level 10, PIC S9(4) COMP). */
    public int /* PIC S9(4) signed */ iSelected;

    /** CICS-OUTPUT-EDIT-VARS (uuid:f7d419af-ce84-91c8-72c8-f1ab8e2a5672, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cicsOutputEditVars;

    /** CARD-ACCT-ID-X (uuid:4bd9784e-ba6d-9dfe-71c2-c0127aa354f6, level 10, PIC X(11).). */
    public String cardAcctIdX;

    /** CARD-ACCT-ID-N (uuid:23504081-1ee4-79f0-3b56-6d0930a34fa6, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardAcctIdN;

    /** CARD-CVV-CD-X (uuid:9eb1d722-7f1f-0359-8b07-d4ca20c7ef05, level 10, PIC X(03).). */
    public String cardCvvCdX;

    /** CARD-CVV-CD-N (uuid:56593bb3-8dc4-0f6d-7c3f-62eebbdc741f, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardCvvCdN;

    /** FLG-PROTECT-SELECT-ROWS (uuid:49972411-14f1-7a8c-bf6f-36c83bfb5638, level 10, PIC X(1).). */
    public String flgProtectSelectRows;

    /** WS-LONG-MSG (uuid:359f1dda-d639-5c52-bffb-f2d538c484ea, level 5, PIC X(500).). */
    public String wsLongMsg;

    /** WS-INFO-MSG (uuid:8f844ca7-e676-99b9-8a77-cf485c687005, level 5, PIC X(45).). */
    public String wsInfoMsg;

    /** WS-ERROR-MSG (uuid:d45fc4b8-a0e7-d4b5-4a33-8e6dca1ade63, level 5, PIC X(75).). */
    public String wsErrorMsg;

    /** WS-PFK-FLAG (uuid:916acc1b-a37b-f7a3-39e4-1086541ef4bd, level 5, PIC X(1).). */
    public String wsPfkFlag;

    /** WS-CONTEXT-FLAG (uuid:1f88bf52-c4b0-98f5-1dc1-4141d1862f70, level 5, PIC X(1).). */
    public String wsContextFlag;

    /** WS-FILE-HANDLING-VARS (uuid:969ac3c7-7d6a-6f5f-fbb8-ee53fe8fa836, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsFileHandlingVars;

    /** WS-CARD-RID (uuid:119fbc01-c345-4616-0dc6-7babba1bd5d0, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCardRid;

    /** WS-CARD-RID-CARDNUM (uuid:37271246-66ae-19ce-7c84-95313f379dc7, level 20, PIC X(16).). */
    public String wsCardRidCardnum;

    /** WS-CARD-RID-ACCT-ID (uuid:7b740971-dd99-5fb0-10b6-f324cec43eb8, level 20, PIC 9(11).). */
    public long /* PIC 9(11). */ wsCardRidAcctId;

    /** WS-CARD-RID-ACCT-ID-X (uuid:036f7bed-5f48-5c07-5101-c94840ba4b42, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCardRidAcctIdX;

    /** WS-SCRN-COUNTER (uuid:c2f654b2-490f-c744-d9db-ad7eab8e8d9f, level 5, PIC S9(4) COMP). */
    public int /* PIC S9(4) signed */ wsScrnCounter;

    /** WS-FILTER-RECORD-FLAG (uuid:d3bd2e5e-f94f-a5a5-7a65-4fe9268bde55, level 5, PIC X(1).). */
    public String wsFilterRecordFlag;

    /** WS-RECORDS-TO-PROCESS-FLAG (uuid:fd41e0e3-53f9-4ab4-fefc-e9204985101a, level 5, PIC X(1).). */
    public String wsRecordsToProcessFlag;

    /** WS-FILE-ERROR-MESSAGE (uuid:b3653065-517c-b176-ccd2-3e107575fb36, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsFileErrorMessage;

    /** ERROR-OPNAME (uuid:7a7a2751-1e86-2919-4cdf-0909f6ebe9b0, level 10, PIC X(8)). */
    public String errorOpname;

    /** ERROR-FILE (uuid:b289071a-9605-b136-3a54-d627b57d9b8d, level 10, PIC X(9)). */
    public int /* PIC X(9) */ errorFile;

    /** ERROR-RESP (uuid:8a2d571f-f0cf-3d53-90b6-f4ed92172c9d, level 10, PIC X(10)). */
    public String errorResp;

    /** ERROR-RESP2 (uuid:b9a65c7f-9a50-0dde-9174-edc4d3aa101b, level 10, PIC X(10)). */
    public String errorResp2;

    /** WS-CONSTANTS (uuid:c9036455-eb0d-6ee6-246d-a08bec5c9997, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsConstants;

    /** WS-MAX-SCREEN-LINES (uuid:8807e839-bb0e-e366-0d88-77205c5eb091, level 5, PIC S9(4) COMP). */
    public int /* PIC S9(4) signed */ wsMaxScreenLines;

    /** LIT-THISPGM (uuid:30770c82-a52d-0116-a6a2-2865e049adfd, level 5, PIC X(8)). */
    public String litThispgm;

    /** LIT-THISTRANID (uuid:7e77def9-8b41-a0ed-985c-cf6362641ec5, level 5, PIC X(4)). */
    public String litThistranid;

    /** LIT-THISMAPSET (uuid:f50f303f-be8f-d478-d19e-6c341f93fec7, level 5, PIC X(7)). */
    public String litThismapset;

    /** LIT-THISMAP (uuid:b0389356-ef43-790e-285f-fc167d2085c5, level 5, PIC X(7)). */
    public String litThismap;

    /** LIT-MENUPGM (uuid:b0f09669-4077-ef6f-da9f-0fd8a28fb2d0, level 5, PIC X(8)). */
    public String litMenupgm;

    /** LIT-MENUTRANID (uuid:2fb8b72a-1cb3-19e3-afab-182a58603aab, level 5, PIC X(4)). */
    public String litMenutranid;

    /** LIT-MENUMAPSET (uuid:65bd01bb-e0d9-4b5d-59e5-5ca886dc1f84, level 5, PIC X(7)). */
    public String litMenumapset;

    /** LIT-MENUMAP (uuid:5acbe5ed-48b6-ec77-9ee4-04a32d72524e, level 5, PIC X(7)). */
    public String litMenumap;

    /** LIT-CARDDTLPGM (uuid:6a5c8ee6-5bcc-f4dc-8d80-dfa48ef24883, level 5, PIC X(8)). */
    public String litCarddtlpgm;

    /** LIT-CARDDTLTRANID (uuid:4e076a57-0b21-c2e9-b0dd-e2e8afb0a338, level 5, PIC X(4)). */
    public String litCarddtltranid;

    /** LIT-CARDDTLMAPSET (uuid:1ed1cbe7-b948-9cc1-8593-789878569924, level 5, PIC X(7)). */
    public String litCarddtlmapset;

    /** LIT-CARDDTLMAP (uuid:05e7dc40-7a03-1677-5e74-50dadb7cc179, level 5, PIC X(7)). */
    public String litCarddtlmap;

    /** LIT-CARDUPDPGM (uuid:db31db22-3d67-78d0-4bef-a4e36a3fcdfd, level 5, PIC X(8)). */
    public String litCardupdpgm;

    /** LIT-CARDUPDTRANID (uuid:37af55e5-2e9e-dc8e-b3f4-5e6cbc36bd03, level 5, PIC X(4)). */
    public String litCardupdtranid;

    /** LIT-CARDUPDMAPSET (uuid:31e1b1ac-087e-b85d-c147-ffae919b2c58, level 5, PIC X(7)). */
    public String litCardupdmapset;

    /** LIT-CARDUPDMAP (uuid:a5a84c86-f896-0fda-6e5a-943da48fe511, level 5, PIC X(7)). */
    public String litCardupdmap;

    /** LIT-CARD-FILE (uuid:9921f641-acf8-bced-68a9-aee8d5af3975, level 5, PIC X(8)). */
    public String litCardFile;

    /** LIT-CARD-FILE-ACCT-PATH (uuid:f5f1f94d-ae30-c4c2-7f4e-ee80f29132fc, level 5, PIC X(8)). */
    public String litCardFileAcctPath;

    /** CC-WORK-AREAS (uuid:c98000da-238d-2f0b-466a-087ddb9a1e11, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccWorkAreas;

    /** CC-WORK-AREA (uuid:18d7dc38-904e-d0a4-9e90-579bd806a436, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccWorkArea;

    /** CCARD-AID (uuid:f45a723e-f624-2916-d56c-5a8a38a733a7, level 10, PIC X(5).). */
    public String ccardAid;

    /** CCARD-NEXT-PROG (uuid:32888be7-2403-b3d3-766d-b417b65a6f4b, level 10, PIC X(8).). */
    public String ccardNextProg;

    /** CCARD-NEXT-MAPSET (uuid:88a98693-12fd-abef-e713-ec01f1fa4c4e, level 10, PIC X(7).). */
    public String ccardNextMapset;

    /** CCARD-NEXT-MAP (uuid:21c5e7e0-2945-d1c6-5e14-8fba5867487e, level 10, PIC X(7).). */
    public String ccardNextMap;

    /** CCARD-ERROR-MSG (uuid:6b44f549-8269-6679-b7aa-77a0f0cf8c7e, level 10, PIC X(75).). */
    public String ccardErrorMsg;

    /** CCARD-RETURN-MSG (uuid:0ed6e24e-4092-274e-6bff-1cf2403c9a78, level 10, PIC X(75).). */
    public String ccardReturnMsg;

    /** CC-ACCT-ID (uuid:c58b0104-3208-9cf5-4d58-7faba7a14e30, level 10, PIC X(11)). */
    public String ccAcctId;

    /** CC-ACCT-ID-N (uuid:c1670bb8-d298-5d4d-af13-7ff0ab038856, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ ccAcctIdN;

    /** CC-CARD-NUM (uuid:9740623c-f55f-75bc-9f1f-f3976711155f, level 10, PIC X(16)). */
    public String ccCardNum;

    /** CC-CARD-NUM-N (uuid:a98c25e7-2a73-0786-f6a4-b4aea6515cf3, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ ccCardNumN;

    /** CC-CUST-ID (uuid:5b446d2a-d8fa-f097-32fb-1e168a12125d, level 10, PIC X(09)). */
    public int /* PIC X(09) */ ccCustId;

    /** CC-CUST-ID-N (uuid:4630e42f-573a-0803-e792-dd6faf3f3aa3, level 10, PIC 9(9).). */
    public int /* PIC 9(9). */ ccCustIdN;

    /** CARDDEMO-COMMAREA (uuid:307bdc92-7a93-3ad8-5150-f83b0de3f21e, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:b4740975-fd8e-30ad-fee0-80443547a560, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:9f802294-8b9a-c442-6c06-3b582c1b0693, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:7ef6b324-4077-ea54-5e7a-6c0cb80297fc, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:c69f4582-537e-9271-15f8-9ef512d2b841, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:ba149614-1746-8244-05ef-d4211c5e8614, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:336a94f4-0a3d-676e-1f0c-c1d48a1f2cf3, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:b769115e-99c6-1a64-d385-09ac6c1dd6d5, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:adfbacb3-43ee-915d-87c5-b9d8979721ab, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:e24fdf04-f7ea-506d-630a-fe0efa1f1a93, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:d271461a-64c0-6d89-1670-7bc78c7d048d, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:6b89ab65-fc19-56f7-b35c-6fc6289c73c3, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:15027ed6-9c01-8adc-b99b-73e366a51f35, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:42dfa0b9-3457-e72a-5146-7840a52ff651, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:c9b5a2b1-2771-fb00-f336-ff1d90fcfeb2, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:e19cf821-0aee-b899-f693-e1c581577b69, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:9af0a9c2-9def-40e2-692b-83c5bd51db62, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:49702707-8efa-6aa9-0cb4-f5a680e841d3, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:f63f24ed-0b2e-cae5-90c1-a1fbbe04dce1, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:d7a8ac46-f81a-146c-7cf9-9c7fa95acdbe, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:9d1c4b3f-cc76-1148-9b9d-256ad70bf6ae, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:4b691027-cbf8-6a4a-e4b7-f5c0c8d38f39, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** WS-THIS-PROGCOMMAREA (uuid:4b53a83e-eb5c-3a7f-0e11-e7de5e1f8dcd, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsThisProgcommarea;

    /** WS-CA-LAST-CARDKEY (uuid:485ad4f1-b2f7-97d5-5dca-ea5e358d4954, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCaLastCardkey;

    /** WS-CA-LAST-CARD-NUM (uuid:faa2e44e-c530-8143-b93b-a332bdbfaad5, level 15, PIC X(16).). */
    public String wsCaLastCardNum;

    /** WS-CA-LAST-CARD-ACCT-ID (uuid:b4b8ba85-6b6d-f475-7ba6-189e23c882f4, level 15, PIC 9(11).). */
    public long /* PIC 9(11). */ wsCaLastCardAcctId;

    /** WS-CA-FIRST-CARDKEY (uuid:a38e7633-775d-e6ba-03ba-a5140cf6da1c, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCaFirstCardkey;

    /** WS-CA-FIRST-CARD-NUM (uuid:bb43b313-5f21-ee8f-746a-0b5af8ffa189, level 15, PIC X(16).). */
    public String wsCaFirstCardNum;

    /** WS-CA-FIRST-CARD-ACCT-ID (uuid:1786dc73-5729-1d6a-4dc7-d62262a92881, level 15, PIC 9(11).). */
    public long /* PIC 9(11). */ wsCaFirstCardAcctId;

    /** WS-CA-SCREEN-NUM (uuid:8ddd8751-6540-2bba-0dff-7f455ec926fc, level 10, PIC 9(1).). */
    public int /* PIC 9(1). */ wsCaScreenNum;

    /** WS-CA-LAST-PAGE-DISPLAYED (uuid:a6ccd48e-75fe-5baa-1d1d-24ab32e7a32a, level 10, PIC 9(1).). */
    public int /* PIC 9(1). */ wsCaLastPageDisplayed;

    /** WS-CA-NEXT-PAGE-IND (uuid:7f341ebb-0faa-f070-9326-00ee1cf9b473, level 10, PIC X(1).). */
    public String wsCaNextPageInd;

    /** WS-RETURN-FLAG (uuid:83ffd07e-bf6d-f01e-f19b-0d286f507bb3, level 10, PIC X(1).). */
    public String wsReturnFlag;

    /** WS-SCREEN-DATA (uuid:10b90e65-64f1-7198-f338-3a2da27a19f9, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsScreenData;

    /** WS-ALL-ROWS (uuid:305dbba7-fe81-ebcb-085c-77c034d240d6, level 10, PIC X(196).). */
    public int /* PIC X(196). */ wsAllRows;

    /** WS-SCREEN-ROWS (uuid:75f9284d-76eb-6d25-dacd-261fd4381904, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsScreenRows;

    /** WS-EACH-ROW (uuid:8b6ca438-05f7-d001-02ac-02765c0e536f, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEachRow;

    /** WS-EACH-CARD (uuid:af5d6dc2-badf-81b5-e572-78e5d4a6c9ec, level 25, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEachCard;

    /** WS-ROW-ACCTNO (uuid:bb1c606c-7eec-fd81-c334-2bbc1daa024d, level 30, PIC X(11).). */
    public String wsRowAcctno;

    /** WS-ROW-CARD-NUM (uuid:26a7d989-1288-bdef-280d-f25eee35168d, level 30, PIC X(16).). */
    public String wsRowCardNum;

    /** WS-ROW-CARD-STATUS (uuid:ba4987c9-686b-6233-4d22-89aac52a6867, level 30, PIC X(1).). */
    public String wsRowCardStatus;

    /** WS-COMMAREA (uuid:a5458c4f-6a0c-a773-59e0-312c96d7f276, level 1, PIC X(2000).). */
    public String wsCommarea;

    /** DFHBMSCA (uuid:bc44477c-edba-a675-0cbb-5eb64e1437a5, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:6e24030f-870f-495f-a8f1-b64d7f799b34, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:b6351985-ac14-06c9-9201-c3e8432d7863, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:6296f592-02d7-0814-266c-6b0c2ef5c732, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:93bb1c4a-6012-c4de-1d70-5719e53a6bf0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:3a6aeaae-d2c0-f912-4702-a1fb8d5b5b08, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:9d0a1483-f19a-54f3-6e8d-e23ea1b8c84c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:15edb719-543d-0fed-f38b-e1cc0457d153, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:7f499690-53b9-dbd9-1e16-e06ad5dff22c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:057f144b-63fe-66a1-9ce2-8399bd7a5117, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:3ec256d1-420a-8173-eb7d-ee65c507ac69, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:a1f10ae5-70eb-2050-1173-2cb873fe9eb0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:e56ec05e-3eb5-db66-82a7-52b63e78133a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:35f1f8ef-d417-5065-3461-4e154040372a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:973e89a4-35d7-de1f-c055-76392bcfaa14, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:f05894e3-7764-ea39-8b32-f8e3d239b870, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:95a0289d-77e2-b693-024c-1c2c52f71eaf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:83762970-8b7a-801b-8018-a3a5eaf944e7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:6a1d34f1-43ba-87eb-7245-ec79a2cd26f0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:32840c35-57e5-13f5-5343-c820baae892f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:1ad410d8-b4c1-a843-f035-acbef1d384a1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:dd21dd52-753e-8df1-d7b2-453df7e06616, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:fe07b22c-5a70-2c77-ab75-30f114a2fab7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:17f9827f-5d99-007e-16c3-51662b4ad045, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:4035cce7-96c8-3b29-aa61-c3950472bcdf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:579cbc7a-c4d3-5ed1-488b-3568ac7da5ca, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:8d149f77-7ea3-d96c-43b7-c80644133896, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:33df4f15-d8ac-c6c7-c764-aac213c84af6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:18791ae1-3d74-3ea8-bcdd-f79554540c4e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:183840da-19cb-268e-51f2-d25efc1e8e83, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;

    /** DFHAID (uuid:5f78ac75-b110-be35-4325-a670163d755c, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:0c063982-25c2-7840-b086-246a16e968f8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:4939760f-acc5-30c2-a479-04b7743ec14f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:aa2338b6-b2e3-3bd3-0b8a-6dccbaead70b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:2066ec07-bd7c-d1e7-b73a-9a5582483a8a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:b0ab2325-0342-ee02-41e9-adb5007c1a58, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:9021cc29-fd56-32af-da9c-8f8e9ae14b6e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:d80384cc-e4d6-3592-54bd-2bf78884dca8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:2783064a-9d49-283f-5acf-b28ee2c6c505, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:eb677990-5ddb-0251-06a9-1097eca3570d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:3b873719-8106-8096-80b5-37ba5fdb2bea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:e583a4f7-d629-68bf-2a91-5dc51d07715d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:b23f4782-a450-73c3-ef0f-d1d589259011, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:1bc87cf6-362b-8511-6684-5bec67b427e2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:9dbd6339-697b-1cfd-0cfd-5f770f44ba07, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:3a8211fb-a880-1def-d73d-808e4c91c4f6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:59729909-152d-fad8-36a7-d5bce3e6b883, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:ce209807-171f-3546-668b-d57ba22020f8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:32600ffc-9c0e-7777-20f1-4f1beb870710, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:c1c10bae-085f-8c21-5df5-f3ba2e89525f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:6faddb01-4f09-65c2-ebb4-711b4dbc72fe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:9101d9be-73ef-bb76-0ed8-0d76355c0dad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:2b3d450f-6d9a-8bdd-875b-ae17d6bcf2e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:16facf8f-c548-24ff-3209-f2e0d737217b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:31dbb1ec-6630-e8a0-8e60-654f299ffa84, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:996e97b6-e186-05d6-0fe4-7e4fc0b7c6a2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:aec67950-008b-aff9-1ed0-eb6c0d353551, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:230b401a-6118-b20a-001c-0f54ce427dce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:22b4e451-8918-f7f7-4f09-c535fcbe1900, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:0fcd37db-e2b3-40a2-8ffb-bbfb6b77241c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:56401ce1-7c30-49da-381f-e7321639eb98, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:31b8da39-63be-fc18-64b5-da44cc76eefe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:d53742c0-e488-bc22-0bbb-c92d624a237b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:62f7558b-7b49-321f-8788-94cc0946720a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:55b4131b-cc39-42cb-4b59-6dd068494044, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:7a7dcb62-7167-41bf-6d5c-95dade5016b3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:1ab5f447-c38d-2d9b-37ce-2bc8f75ac0fa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** CCDA-SCREEN-TITLE (uuid:db7b89dd-39a6-d055-4e10-b40b5420658c, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:dc586018-26a0-beac-72f8-d66d7a0808f2, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:bd081947-f94c-4676-821f-63bb7116f95f, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:d5f4c2b1-1214-b2d5-113b-6c42606a0dbe, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** CCRDLIAI (uuid:171324a3-3db6-2ef6-8839-b7aa92a050ba, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccrdliai;

    /** TRNNAMEL (uuid:55562c0e-fa77-0dca-3be4-774ff88db749, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamel;

    /** TRNNAMEF (uuid:bb0c377b-42ab-2854-27c6-fd78247bc955, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamef;

    /** TRNNAMEA (uuid:229811ba-9eca-631e-24cd-9f744231d330, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamea;

    /** TRNNAMEI (uuid:0d3ea7ba-1717-6049-f4ca-596cafc0843d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamei;

    /** TITLE01L (uuid:952f1db0-5e06-535c-9433-813e48cfa87e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01l;

    /** TITLE01F (uuid:5f80c67f-47cb-2e8f-59bf-992160029173, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01f;

    /** TITLE01A (uuid:b19b64c8-b353-9172-6d72-a52b1ba90a52, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01a;

    /** TITLE01I (uuid:b65d2676-4c85-3721-724f-5bdd4b7d8e54, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01i;

    /** CURDATEL (uuid:98cddd4d-5c29-c69a-2f87-94ef41635930, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatel;

    /** CURDATEF (uuid:dfbffd51-0ea3-575b-9500-576d26169a3d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatef;

    /** CURDATEA (uuid:343d809b-54ee-211b-13f2-9b70a2a34044, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatea;

    /** CURDATEI (uuid:66bc547d-2403-6e52-192e-5613daa16da6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatei;

    /** PGMNAMEL (uuid:a37c1dd8-b5f0-dc57-cc1a-27e4dee15be2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamel;

    /** PGMNAMEF (uuid:ad38af11-7724-c367-00b9-108c844a3116, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamef;

    /** PGMNAMEA (uuid:3cce2376-b636-1c97-5920-34bff5025015, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamea;

    /** PGMNAMEI (uuid:10ab24e0-e70b-ff21-ce13-28f42a10de87, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamei;

    /** TITLE02L (uuid:28429b2f-0936-82f7-6009-60d01961465e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02l;

    /** TITLE02F (uuid:66a34e12-f039-4673-5eae-41f4e7f37c02, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02f;

    /** TITLE02A (uuid:94b4e8ab-e97e-bbc4-d4de-fec8c6c8750b, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02a;

    /** TITLE02I (uuid:a18de6ec-5bd7-d22d-5161-cd62035d0a9e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02i;

    /** CURTIMEL (uuid:59334c1b-f075-672c-9cd4-b36a5caaea37, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimel;

    /** CURTIMEF (uuid:ece30a96-a1e1-fee2-974e-9c7924df64bc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimef;

    /** CURTIMEA (uuid:86b50e7d-af10-bf99-0508-1028ceaaa0af, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimea;

    /** CURTIMEI (uuid:b54aac74-0c9b-e706-dc42-1e6bc8dddb79, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimei;

    /** PAGENOL (uuid:7ef46204-a477-f1a1-cef8-6e6349939d16, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenol;

    /** PAGENOF (uuid:fe071676-078e-df15-bd6f-6e6c48faa822, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenof;

    /** PAGENOA (uuid:7fdca058-f60f-4148-e1d8-b61123d5e71c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenoa;

    /** PAGENOI (uuid:81d13429-92ad-eada-17ef-5ddc38e33b27, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenoi;

    /** ACCTSIDL (uuid:1977c3d6-212f-e459-4a11-65621b05f66f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidl;

    /** ACCTSIDF (uuid:621ec887-bc66-ab55-e76f-2e1be106de28, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidf;

    /** ACCTSIDA (uuid:ff45e082-5754-3c2f-106c-8feee38049a6, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsida;

    /** ACCTSIDI (uuid:086a9ce1-5b08-1d6c-fb01-9d04cbca3744, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidi;

    /** CARDSIDL (uuid:6dced982-db96-15e8-f116-8c417a1fdc95, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidl;

    /** CARDSIDF (uuid:6e9587ea-99fc-3d18-5761-7b5abe9fe0ae, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidf;

    /** CARDSIDA (uuid:a7786543-bece-e4d1-e5a7-99ba14db9fed, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsida;

    /** CARDSIDI (uuid:01de6c63-1d58-1a4f-63f4-d6db8fcddd5a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidi;

    /** CRDSEL1L (uuid:3048323b-2102-3bbc-ea8f-7d051c7092bb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel1l;

    /** CRDSEL1F (uuid:74cc5fcd-68ea-6ac3-8062-8705b00c7b6b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel1f;

    /** CRDSEL1A (uuid:90f05273-93ce-3119-0d8e-0df8b2e46b47, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel1a;

    /** CRDSEL1I (uuid:bc00dc4e-f251-e49b-5fe1-b3f4a00c0c30, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel1i;

    /** ACCTNO1L (uuid:cadfe912-bcda-a2f7-487c-792df5ae1240, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno1l;

    /** ACCTNO1F (uuid:a6d17233-9491-c647-8427-93a8d157540a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno1f;

    /** ACCTNO1A (uuid:91388bd8-0192-4ea8-3d1c-48c033670654, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno1a;

    /** ACCTNO1I (uuid:1784d974-064f-e8fb-1b58-5969f359040c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno1i;

    /** CRDNUM1L (uuid:8f7bb474-ac48-8fe9-3e62-55760b1515c1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum1l;

    /** CRDNUM1F (uuid:8b46b214-b18a-0359-af58-a2fea348b318, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum1f;

    /** CRDNUM1A (uuid:12aebcee-a3f0-8adc-889d-ff3b5b1f91ac, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum1a;

    /** CRDNUM1I (uuid:0df3a05e-9f86-9ef2-a2aa-25d55c2bd92b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum1i;

    /** CRDSTS1L (uuid:7c22c57f-2db9-785e-2b8f-6747badbdb69, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts1l;

    /** CRDSTS1F (uuid:ce118dcf-ab3e-4beb-f1eb-d9f89de77482, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts1f;

    /** CRDSTS1A (uuid:419562bd-f30b-33f8-4cde-ba964bf64d87, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts1a;

    /** CRDSTS1I (uuid:51141d3f-e2dc-2399-6497-d21505833a93, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts1i;

    /** CRDSEL2L (uuid:f9d12dfc-8e9f-111c-fa56-95e94dfe7bf9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel2l;

    /** CRDSEL2F (uuid:6fd04e89-8f04-2a54-96e7-1abe350566f6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel2f;

    /** CRDSEL2A (uuid:c9a5db66-753c-c5c6-5364-352327826fde, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel2a;

    /** CRDSEL2I (uuid:d5b61f6b-873b-df13-eb23-0ab2e27f0ad8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel2i;

    /** CRDSTP2L (uuid:44cebaaa-ca99-2e19-bbdc-e24d8708d95c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp2l;

    /** CRDSTP2F (uuid:ba007c62-3125-1921-3aa1-35b93c547e2d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp2f;

    /** CRDSTP2A (uuid:49e8adff-fe59-ff8e-28e2-f97f04d73926, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp2a;

    /** CRDSTP2I (uuid:2b894d73-252c-fbd4-6309-a6ef2d8cf141, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp2i;

    /** ACCTNO2L (uuid:06535139-f17f-eb3c-8cd3-f930cd19c213, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno2l;

    /** ACCTNO2F (uuid:27620a5b-9ec8-884a-10f1-132d48e831a1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno2f;

    /** ACCTNO2A (uuid:48b0e4be-df46-b9e2-7da2-785f60f5f359, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno2a;

    /** ACCTNO2I (uuid:fff10ae3-5847-e268-c54e-b3d9b400a161, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno2i;

    /** CRDNUM2L (uuid:abed64c1-5af3-51c7-702b-9da43f5b8da5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum2l;

    /** CRDNUM2F (uuid:cc3c87b6-8f26-25f0-25c5-43948c836fe6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum2f;

    /** CRDNUM2A (uuid:7f695108-dcb3-e609-129a-cbf30e428717, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum2a;

    /** CRDNUM2I (uuid:215651e6-f19d-042e-f20a-f0b76893dc53, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum2i;

    /** CRDSTS2L (uuid:15a37df8-4970-333b-4bcb-ae83f670cd61, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts2l;

    /** CRDSTS2F (uuid:d81d6001-d3b4-c702-48bc-dbd463b4a571, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts2f;

    /** CRDSTS2A (uuid:42e5bdf5-e17f-4c03-6a03-6b7feb9f41c1, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts2a;

    /** CRDSTS2I (uuid:70690ed7-9d34-522e-0c5b-df8d5a5d5dfd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts2i;

    /** CRDSEL3L (uuid:1714b1c2-50c5-97de-a225-3563e26328a5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel3l;

    /** CRDSEL3F (uuid:cea53c98-13c6-9141-4f62-5bc360c717c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel3f;

    /** CRDSEL3A (uuid:d134405b-40d3-e3c2-2908-2480eceba3cb, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel3a;

    /** CRDSEL3I (uuid:6342f610-9ad8-af8d-727b-f584d6880abe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel3i;

    /** CRDSTP3L (uuid:a695eb9d-c108-4082-fb32-515c586bfe87, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp3l;

    /** CRDSTP3F (uuid:f2affcfc-2d94-dc3f-19ec-89269da1b124, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp3f;

    /** CRDSTP3A (uuid:d357abd5-30cb-1607-fdc6-f6fda8c111b5, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp3a;

    /** CRDSTP3I (uuid:1adb01a4-2675-a765-4253-d947bdc027ea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp3i;

    /** ACCTNO3L (uuid:31c34ceb-4d3a-9c65-7020-7b84da95470a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno3l;

    /** ACCTNO3F (uuid:d7f0da66-cab9-60aa-8093-3ae7400c6483, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno3f;

    /** ACCTNO3A (uuid:2eef2130-f606-d5bb-f1bf-cf5a1b3f30c3, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno3a;

    /** ACCTNO3I (uuid:830d4a92-d625-f70f-8250-22199f2af4e8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno3i;

    /** CRDNUM3L (uuid:94dd4d50-b45a-ff60-62c7-394f6f7fe7ad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum3l;

    /** CRDNUM3F (uuid:18b0b46a-94dd-31ca-3bc8-db4accb39145, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum3f;

    /** CRDNUM3A (uuid:fb392718-eefb-f9d4-27d7-19334cc788aa, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum3a;

    /** CRDNUM3I (uuid:c1ab587b-b169-b8c5-032e-6c817dbfa005, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum3i;

    /** CRDSTS3L (uuid:4aa2995c-68b3-7385-5d3e-72acf9f10c51, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts3l;

    /** CRDSTS3F (uuid:472d829d-5274-7710-ce67-9c19bcfa2355, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts3f;

    /** CRDSTS3A (uuid:6ea7c55a-87ae-9b5c-857e-2822ec1bd30b, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts3a;

    /** CRDSTS3I (uuid:b721e8fb-2859-e339-4197-7a2d4ca38d6f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts3i;

    /** CRDSEL4L (uuid:5aa80963-e268-fdb1-74d7-8994aab89c24, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel4l;

    /** CRDSEL4F (uuid:ec396046-6c7a-89f5-a3be-dc166b952f22, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel4f;

    /** CRDSEL4A (uuid:081b647c-b0bf-efb0-87c6-f2ddf69dbfce, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel4a;

    /** CRDSEL4I (uuid:1a64aa62-7184-fdd9-a71f-f05e586b79cf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel4i;

    /** CRDSTP4L (uuid:151e2229-6bc2-7e7a-61b3-806f614cf46d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp4l;

    /** CRDSTP4F (uuid:c52f9071-3a59-7aef-8c4c-9efd7e044f57, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp4f;

    /** CRDSTP4A (uuid:2efd0c50-0502-a45f-fd14-fb710e5b098a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp4a;

    /** CRDSTP4I (uuid:b1deb8b2-063f-4201-b65f-f89b696825bd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp4i;

    /** ACCTNO4L (uuid:5bb4bcde-9560-a95f-8df5-f948c7c26dc7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno4l;

    /** ACCTNO4F (uuid:efe66c44-3b26-1e1b-4775-5d833b2769b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno4f;

    /** ACCTNO4A (uuid:8ae4e962-9459-78fb-b699-b0661f70dee0, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno4a;

    /** ACCTNO4I (uuid:1eeae79f-d1db-dc56-2b2e-6ed863361e60, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno4i;

    /** CRDNUM4L (uuid:2009ce62-69d4-5d15-6194-dbb222e2da2a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum4l;

    /** CRDNUM4F (uuid:53a6f5a3-f571-c714-2864-0f7b2a067ea9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum4f;

    /** CRDNUM4A (uuid:7cf2b7b5-1160-22dc-67f9-c4c5bd1a40f6, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum4a;

    /** CRDNUM4I (uuid:0833311a-5fca-4f43-f69f-b640dd70a4aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum4i;

    /** CRDSTS4L (uuid:6c02b9c1-03f9-1716-5e38-be98e148c82f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts4l;

    /** CRDSTS4F (uuid:d3254878-e172-69e0-771a-23de523fc553, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts4f;

    /** CRDSTS4A (uuid:82e8232e-6c93-434f-c54f-b79195abadde, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts4a;

    /** CRDSTS4I (uuid:bdfdda43-9b24-a0e6-46d5-d2290285b85d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts4i;

    /** CRDSEL5L (uuid:ec09ea88-7a76-81bf-b857-62e019ee47bd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel5l;

    /** CRDSEL5F (uuid:7bbaa79c-96e6-1207-93dc-823e234015ce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel5f;

    /** CRDSEL5A (uuid:af9af96a-2964-fc33-bd66-7c1f6e786a2d, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel5a;

    /** CRDSEL5I (uuid:993e3ccd-269f-3820-b4e4-b3f7e2078369, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel5i;

    /** CRDSTP5L (uuid:9ef1de31-ada9-38a1-2ecc-45456e597dfc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp5l;

    /** CRDSTP5F (uuid:e7ce5330-199b-4430-a54e-b2dbd5b12254, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp5f;

    /** CRDSTP5A (uuid:3920ec1e-651d-853d-1c98-af91e5abe068, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp5a;

    /** CRDSTP5I (uuid:dc436186-e23c-a232-40e1-c909e5f7cd1a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp5i;

    /** ACCTNO5L (uuid:27c0c66e-69c1-1981-bcad-c2e9e13bb076, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno5l;

    /** ACCTNO5F (uuid:320b7452-53ad-7e7e-fe8a-26de0311fa03, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno5f;

    /** ACCTNO5A (uuid:91cac59c-22e5-b068-969b-a90e8d249eed, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno5a;

    /** ACCTNO5I (uuid:d75f5379-65d7-e138-8452-fa0e992832f4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno5i;

    /** CRDNUM5L (uuid:d827ded7-8eed-4365-229b-e47931a9600f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum5l;

    /** CRDNUM5F (uuid:71704497-2f8a-8671-ff9c-53b016d11488, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum5f;

    /** CRDNUM5A (uuid:88401086-bb80-a3b2-53c1-c7b47e76664f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum5a;

    /** CRDNUM5I (uuid:e1bfdda8-13c0-1ace-381a-2b6433d4635f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum5i;

    /** CRDSTS5L (uuid:a60905bb-d8b5-adcb-84c1-17f4ae765b50, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts5l;

    /** CRDSTS5F (uuid:0a303bb1-0263-74fd-a586-1386bb48c198, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts5f;

    /** CRDSTS5A (uuid:eb40e88c-319b-efb2-393f-7bc77b91ae2a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts5a;

    /** CRDSTS5I (uuid:39f239ae-0aae-c84e-4101-47abd598f29c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts5i;

    /** CRDSEL6L (uuid:af5924ee-b6d5-7b54-9d86-0050ce264a0e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel6l;

    /** CRDSEL6F (uuid:57ca6adf-e709-2d53-ab3e-791e4a0999de, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel6f;

    /** CRDSEL6A (uuid:03b5b61f-9fec-fb48-903d-9e6cad8a0760, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel6a;

    /** CRDSEL6I (uuid:fcc8fa8a-4d3d-ba03-02ca-1b83f8909c2c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel6i;

    /** CRDSTP6L (uuid:07cd0e0f-2596-69d9-7c32-9dec2bb92de2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp6l;

    /** CRDSTP6F (uuid:c570eb2e-cbcb-0e56-1391-7cceeab59ffd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp6f;

    /** CRDSTP6A (uuid:57194a17-f9e3-f2ee-5733-315727cfb4df, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp6a;

    /** CRDSTP6I (uuid:40450fa3-b294-792b-9e1a-46cbe55f0b8e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp6i;

    /** ACCTNO6L (uuid:f12d4e47-cdef-f3db-80f2-300d278a2b53, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno6l;

    /** ACCTNO6F (uuid:255758a5-2620-6aaa-b7a3-c643a53e7734, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno6f;

    /** ACCTNO6A (uuid:4987bc78-2245-3b68-f0b1-11071d49c523, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno6a;

    /** ACCTNO6I (uuid:a8edb76f-ea42-5e19-6ee2-4a8916d74259, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno6i;

    /** CRDNUM6L (uuid:f4811638-49e5-f59c-81c0-38154e26afcf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum6l;

    /** CRDNUM6F (uuid:42d062cc-e6bf-6117-3432-4b0f325a27c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum6f;

    /** CRDNUM6A (uuid:953c8ba4-c089-630b-011c-ef73e197cdbb, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum6a;

    /** CRDNUM6I (uuid:ce1a152d-2a16-c993-3023-2c6a47548f0b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum6i;

    /** CRDSTS6L (uuid:552ca8a7-a5ec-dbd8-d5ba-65f4cd0e62c6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts6l;

    /** CRDSTS6F (uuid:f97fd51c-27a4-da74-815f-50a58b6a8c96, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts6f;

    /** CRDSTS6A (uuid:b5c5ecaa-b306-13e7-0c1e-b51e0244ba07, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts6a;

    /** CRDSTS6I (uuid:2b936dd1-9642-c8b2-abaa-cc041c509f8c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts6i;

    /** CRDSEL7L (uuid:d007e86c-c371-3e31-5997-583f5e3ff331, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel7l;

    /** CRDSEL7F (uuid:21214f9a-f7ad-5336-53af-38befb1fdd47, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel7f;

    /** CRDSEL7A (uuid:161b5d82-a3fd-f17d-4533-b334cb4fbc26, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel7a;

    /** CRDSEL7I (uuid:f5992278-672e-d242-10a3-3d8b1401ae42, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel7i;

    /** CRDSTP7L (uuid:ba1cb587-2c8e-7b68-9bdd-e327af82bc19, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp7l;

    /** CRDSTP7F (uuid:5c66586e-7f86-e2e9-d04f-c61060a04d75, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp7f;

    /** CRDSTP7A (uuid:7e6a9b46-253a-430d-4d69-ec09c068c0a7, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp7a;

    /** CRDSTP7I (uuid:1860846f-f4b8-232f-2224-33bed6b3fa39, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp7i;

    /** ACCTNO7L (uuid:d421dd0d-e912-697f-ffa0-93519ca98f88, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno7l;

    /** ACCTNO7F (uuid:615b4256-c17f-3fbd-4801-c30d52ff66e7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno7f;

    /** ACCTNO7A (uuid:dd14efbc-36e5-e17e-c61a-5178a3cb224c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno7a;

    /** ACCTNO7I (uuid:331d8472-9c83-266d-29ce-727650968b9b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno7i;

    /** CRDNUM7L (uuid:b7a5d5cf-bbdc-6e2b-a68c-54255e84c826, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum7l;

    /** CRDNUM7F (uuid:afff64eb-3df6-9329-8853-31bf611a08e4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum7f;

    /** CRDNUM7A (uuid:53ffb851-79a3-8bd7-6f58-7926ecea6ae7, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum7a;

    /** CRDNUM7I (uuid:46e5b8ee-983f-bd46-9c26-54e942c1a371, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum7i;

    /** CRDSTS7L (uuid:111d0371-152d-a610-8f95-6f0931632bc8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts7l;

    /** CRDSTS7F (uuid:ef8c76a4-86dd-fa82-8e3b-16e1e26e8175, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts7f;

    /** CRDSTS7A (uuid:2c9e2fe9-2998-c538-0fa3-9ab268a96961, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts7a;

    /** CRDSTS7I (uuid:cb2d2aaa-d32a-8f78-4bd8-ea81835ec5ec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts7i;

    /** INFOMSGL (uuid:77a744ee-df36-62ab-fb9a-09319fdce11d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgl;

    /** INFOMSGF (uuid:f73f7c12-288e-7003-3868-fe257119bc93, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgf;

    /** INFOMSGA (uuid:4d3d8905-7992-3af0-4283-dab46f455cb0, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsga;

    /** INFOMSGI (uuid:a27e95dc-aa58-c516-4eda-68f321a0fb0b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgi;

    /** ERRMSGL (uuid:e2f686c4-db5e-3b80-74f1-68ad0405e85f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgl;

    /** ERRMSGF (uuid:0530e28c-a09a-bbb7-ea6f-55a46a8cbac2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgf;

    /** ERRMSGA (uuid:43d6e7b4-f28f-d7eb-eb9d-8ef992ec753d, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsga;

    /** ERRMSGI (uuid:6bf7193a-7faf-7012-fe53-70cf1423b629, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgi;

    /** CCRDLIAO (uuid:d3e07472-3ff6-6d4f-f1bb-a08a8c87b824, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccrdliao;

    /** TRNNAMEC (uuid:2bfae0c9-45cb-b7c5-3038-5299263e6b64, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamec;

    /** TRNNAMEP (uuid:7695ad8b-2606-756b-4a09-0fc38ae2aaa5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamep;

    /** TRNNAMEH (uuid:b30ca32a-8384-903b-0ad1-c1e7462d817b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameh;

    /** TRNNAMEV (uuid:8bd7fe0d-a5ff-d1b2-e6c1-062cd19d83c4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamev;

    /** TRNNAMEO (uuid:3fd1711a-ced1-700d-78a4-194210550080, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameo;

    /** TITLE01C (uuid:9756e92e-d205-6bb8-7678-79a951c3c833, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01c;

    /** TITLE01P (uuid:45f09778-40ef-87d7-0a2d-a0d6dd291d88, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01p;

    /** TITLE01H (uuid:11944e29-7c61-cbfa-7542-dae623d36170, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01h;

    /** TITLE01V (uuid:59df5f0d-e516-ec9a-f568-16947019ae94, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01v;

    /** TITLE01O (uuid:03d2588e-58c7-ee08-08c5-a7b4a08ac69c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01o;

    /** CURDATEC (uuid:2a368eaf-a386-965e-49c9-3aae873faa2e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatec;

    /** CURDATEP (uuid:c5703598-0905-8eda-fbe4-51ddd62295b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatep;

    /** CURDATEH (uuid:bba954a9-853c-7953-e48f-9d8b45ab6dc8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateh;

    /** CURDATEV (uuid:23898fab-9a36-7346-0efc-b06a09a8f0cc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatev;

    /** CURDATEO (uuid:0a5cd529-167b-8b26-810e-31eee0983c07, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateo;

    /** PGMNAMEC (uuid:be127f15-dbec-9e5f-974f-8b0cde9c7beb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamec;

    /** PGMNAMEP (uuid:b1d8a0f2-ae28-f1bd-fb60-4629f14aa844, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamep;

    /** PGMNAMEH (uuid:fca30d46-ddc7-27f3-d390-66cd1958cb86, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameh;

    /** PGMNAMEV (uuid:b77231d4-293f-7c0b-0a3d-8b3cb633b3cf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamev;

    /** PGMNAMEO (uuid:4993d7e6-73a2-bc7c-486c-086c421222d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameo;

    /** TITLE02C (uuid:522e378b-002d-af29-2d9e-96818da246be, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02c;

    /** TITLE02P (uuid:e27f1b98-ea51-1062-4b8f-9e033b72a121, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02p;

    /** TITLE02H (uuid:3f759efe-0c5c-8df5-ba98-f2029fced21d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02h;

    /** TITLE02V (uuid:08e4355f-f4eb-ac44-de9a-e7f4f5b27e3e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02v;

    /** TITLE02O (uuid:cab20acb-0aeb-9e61-9984-419df57198db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02o;

    /** CURTIMEC (uuid:0d2e1058-9ba6-c7c6-56c7-140578dfba83, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimec;

    /** CURTIMEP (uuid:8edfa47d-eda2-fd0c-abb8-ae16caac67f9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimep;

    /** CURTIMEH (uuid:95ccee56-4479-b444-fa29-e84ff7b581dc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeh;

    /** CURTIMEV (uuid:b3ae890e-d343-0ddd-7ad1-5d0c2cbb18c7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimev;

    /** CURTIMEO (uuid:bdba72ce-ba91-82b7-252c-12503233799a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeo;

    /** PAGENOC (uuid:384b2988-99f8-24d9-b607-7e02082e50bb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenoc;

    /** PAGENOP (uuid:b3d099b0-1aa5-3e8d-5872-85a670434394, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenop;

    /** PAGENOH (uuid:088c5f3a-bc1d-3b8f-760e-310eba597259, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenoh;

    /** PAGENOV (uuid:3b0e6693-2861-6b21-bceb-083c814e03d2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenov;

    /** PAGENOO (uuid:857fa892-3223-9512-5b02-dba6c2a19bc4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pagenoo;

    /** ACCTSIDC (uuid:d1ba4eb7-a764-9ca4-de42-1d50ddbcb519, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidc;

    /** ACCTSIDP (uuid:92896215-6e91-b3e3-5d1a-ee58132295d1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidp;

    /** ACCTSIDH (uuid:688010ff-0868-09ce-9ceb-d4acecfe12bb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidh;

    /** ACCTSIDV (uuid:eab9d049-b681-d82e-a5e4-a51b85b890e1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidv;

    /** ACCTSIDO (uuid:58cc7b93-ae91-bced-a059-b2a925719f70, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsido;

    /** CARDSIDC (uuid:185db9e8-12c8-2127-d4ce-67a4433f2a16, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidc;

    /** CARDSIDP (uuid:ea7e611b-334e-719c-71b0-767695cee7d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidp;

    /** CARDSIDH (uuid:cf4d6469-3f84-3f77-d202-37c28f6ed2e7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidh;

    /** CARDSIDV (uuid:07f2268d-3e80-2ec5-5d17-03744466a794, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidv;

    /** CARDSIDO (uuid:44c75c8f-6c27-a73d-d853-3e8df990dae8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsido;

    /** CRDSEL1C (uuid:576887c8-5bde-7f16-6a4e-755e40d51dbe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel1c;

    /** CRDSEL1P (uuid:8f5fc1f9-3cae-e444-5dc9-8d423091e3b1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel1p;

    /** CRDSEL1H (uuid:6b38e2ae-3a47-fa93-e9fa-e20270bb7ebc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel1h;

    /** CRDSEL1V (uuid:3e3fda65-2310-75e8-62db-70930a0e1541, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel1v;

    /** CRDSEL1O (uuid:1ba61a18-0223-3b91-0152-9c6b87a37283, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel1o;

    /** ACCTNO1C (uuid:aba871ad-8a0f-a145-4075-e0ac4d42c4b0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno1c;

    /** ACCTNO1P (uuid:50ae8545-cd04-9b24-a3ed-33b38427c0db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno1p;

    /** ACCTNO1H (uuid:9fb413c7-b1e0-aaf4-34d2-cc7fc654731c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno1h;

    /** ACCTNO1V (uuid:52c72c12-0329-555d-99b3-9af0cb2038e5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno1v;

    /** ACCTNO1O (uuid:5a9cdf97-8747-3629-3fe1-446e26db9dce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno1o;

    /** CRDNUM1C (uuid:a68edcf5-e75b-699b-6c6b-b97a4ac770f8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum1c;

    /** CRDNUM1P (uuid:32060a1c-5a61-19a7-fb67-c20cc5c4546d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum1p;

    /** CRDNUM1H (uuid:f1ba973a-a17d-2f97-3edc-b76be5ede323, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum1h;

    /** CRDNUM1V (uuid:ba48ad96-15d8-421f-77f2-2a03145eb8fd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum1v;

    /** CRDNUM1O (uuid:90cb6266-a7d2-de16-8e72-e5cb3caad582, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum1o;

    /** CRDSTS1C (uuid:f0ad03c0-b2a8-bc23-c580-f56b0542dbf1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts1c;

    /** CRDSTS1P (uuid:9e2f158c-9ba7-e77a-0452-48191470919e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts1p;

    /** CRDSTS1H (uuid:09fdc1d5-929c-1d4e-7a1b-e6811a6d9df7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts1h;

    /** CRDSTS1V (uuid:77c15d8b-5382-9438-3fef-e7d8d331899c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts1v;

    /** CRDSTS1O (uuid:9b65b6fe-182c-3672-2d8a-efa59e840008, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts1o;

    /** CRDSEL2C (uuid:c14fc007-9127-14fe-76c9-c47f1e23689e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel2c;

    /** CRDSEL2P (uuid:253525c2-eee2-2c65-dc32-9d4b63a8d739, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel2p;

    /** CRDSEL2H (uuid:3176aa62-cfe3-1d87-5d88-c29d83bab0f0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel2h;

    /** CRDSEL2V (uuid:f5cdbf29-a1b8-a793-b97e-34bdfbaaea67, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel2v;

    /** CRDSEL2O (uuid:0dccfa39-127d-6680-b25f-f606da55c5e0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel2o;

    /** CRDSTP2C (uuid:e9032bc2-1153-39f7-7c45-889fdb83ddb0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp2c;

    /** CRDSTP2P (uuid:1d42c4e0-dd8a-c532-54c7-06a6a0c70666, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp2p;

    /** CRDSTP2H (uuid:91bb8e39-5631-21b2-45c9-306ae4d55e3a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp2h;

    /** CRDSTP2V (uuid:cf3fb9b2-e024-005e-6668-8b32fa02f55f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp2v;

    /** CRDSTP2O (uuid:b06c9b0e-c558-f644-71f9-b03383eebdf1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp2o;

    /** ACCTNO2C (uuid:88f3f768-917b-c9f1-0093-e9445b838e93, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno2c;

    /** ACCTNO2P (uuid:0b308e94-d390-13b6-c808-ef5995c539a6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno2p;

    /** ACCTNO2H (uuid:c576f34f-3156-84e8-a67c-3ba4062134d2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno2h;

    /** ACCTNO2V (uuid:6896a5ea-f76c-9ae3-400c-bfc7b2aac9be, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno2v;

    /** ACCTNO2O (uuid:89eb4b9f-f779-3420-1089-c113982567d4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno2o;

    /** CRDNUM2C (uuid:d3e59e5f-1858-8743-f877-3a5a7e3f60f5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum2c;

    /** CRDNUM2P (uuid:54faa009-5cdb-e211-4734-f99cd5287e49, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum2p;

    /** CRDNUM2H (uuid:386bc999-85af-d301-cf05-0b7cd29ed5fd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum2h;

    /** CRDNUM2V (uuid:e48d9fbd-1b18-345a-640e-3b245eb1b472, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum2v;

    /** CRDNUM2O (uuid:b70fc57a-a77a-cd09-d478-ec222d5c5431, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum2o;

    /** CRDSTS2C (uuid:90a00afb-60ea-554a-c381-258952e6acd2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts2c;

    /** CRDSTS2P (uuid:f9f3f507-b1e6-f289-37c2-286d713e2af6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts2p;

    /** CRDSTS2H (uuid:f079aa94-7718-768a-11a7-91b4d7d55c5b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts2h;

    /** CRDSTS2V (uuid:8c07ff28-d2d4-67e3-477c-325b10d53900, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts2v;

    /** CRDSTS2O (uuid:f6db5bf7-212c-8698-4caa-ccddda3e113c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts2o;

    /** CRDSEL3C (uuid:4828df22-116f-179d-2726-bb95d07baa08, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel3c;

    /** CRDSEL3P (uuid:b9f0283e-d124-8ce2-8fa3-53feae988453, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel3p;

    /** CRDSEL3H (uuid:65e12406-b7c2-50f8-8618-6354e99cb844, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel3h;

    /** CRDSEL3V (uuid:8619c496-4246-aea9-fa1e-17d2cc23aa45, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel3v;

    /** CRDSEL3O (uuid:210bc5eb-cf89-9194-7863-41f23528a5ff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel3o;

    /** CRDSTP3C (uuid:46f94637-4122-4e60-a4ee-4d1ca0c97427, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp3c;

    /** CRDSTP3P (uuid:d1f79123-f418-a6b4-6bc0-b159b9e2031d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp3p;

    /** CRDSTP3H (uuid:c8faa70e-3fe5-d96a-81d1-716bee8bfef3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp3h;

    /** CRDSTP3V (uuid:25908399-7f92-b56b-41bf-243ca7368374, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp3v;

    /** CRDSTP3O (uuid:8462a060-813d-ad54-5553-fe24d6017c79, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp3o;

    /** ACCTNO3C (uuid:b5343b4f-dbec-c6f1-1117-a4c8f75035fa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno3c;

    /** ACCTNO3P (uuid:f9a80781-789a-7e6b-0938-89d65d397849, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno3p;

    /** ACCTNO3H (uuid:eb0deef8-4d63-5901-0e5a-13c47bd64d00, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno3h;

    /** ACCTNO3V (uuid:f16cd937-aa0b-bc1f-1e8c-ef14890653f9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno3v;

    /** ACCTNO3O (uuid:e1fe99db-993c-696d-1f72-7a9ddcd81f23, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno3o;

    /** CRDNUM3C (uuid:571554ac-47e7-713a-258f-234f23fe4f02, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum3c;

    /** CRDNUM3P (uuid:2107a482-a85f-1673-72c7-3fdf08f64851, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum3p;

    /** CRDNUM3H (uuid:fae75eef-b7a2-568c-c12e-1a40d24f809c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum3h;

    /** CRDNUM3V (uuid:59de06ab-98e2-464a-0335-d9653cb7a9aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum3v;

    /** CRDNUM3O (uuid:bec796a6-e3d8-35b8-e188-2c4134a0578d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum3o;

    /** CRDSTS3C (uuid:ca51f339-7119-061f-7101-b9b4e3aa82f4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts3c;

    /** CRDSTS3P (uuid:7d71200f-6ba8-72d9-b502-bc93788c7068, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts3p;

    /** CRDSTS3H (uuid:51b4cbce-a312-dc4a-8dc7-4d5c24fbe14a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts3h;

    /** CRDSTS3V (uuid:444534df-b8bc-b68a-b4c7-2f9c1a02ed92, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts3v;

    /** CRDSTS3O (uuid:ff17a2d4-2bcd-0231-ea7b-12ab49a7300d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts3o;

    /** CRDSEL4C (uuid:abeb529f-372e-162c-2b83-2f142041f302, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel4c;

    /** CRDSEL4P (uuid:3de4659f-d165-e747-b2e7-4a7fa90fd16b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel4p;

    /** CRDSEL4H (uuid:2c124dd9-315d-92ed-bd95-af8856f13d69, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel4h;

    /** CRDSEL4V (uuid:46e63561-8170-7adf-0a57-afe7622fdd1e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel4v;

    /** CRDSEL4O (uuid:d2086c57-9545-83df-33c6-2b9b27e57e29, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel4o;

    /** CRDSTP4C (uuid:0339d813-3303-1362-b831-c76996f71c79, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp4c;

    /** CRDSTP4P (uuid:9c5a4216-32c7-eb78-38c5-e58200ce3f37, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp4p;

    /** CRDSTP4H (uuid:56e24414-12eb-32ee-4be1-1fc14cec6809, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp4h;

    /** CRDSTP4V (uuid:d3231308-075c-25a0-c26c-50f07681041c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp4v;

    /** CRDSTP4O (uuid:16dfeb15-1392-b94d-703b-8b64d89562bf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp4o;

    /** ACCTNO4C (uuid:d31a95b1-31e9-6915-e496-0fd8632b0175, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno4c;

    /** ACCTNO4P (uuid:cc303701-53ed-6dad-3fa4-7e40c1737da9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno4p;

    /** ACCTNO4H (uuid:7f5348a5-2329-9034-a00b-d93572fee936, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno4h;

    /** ACCTNO4V (uuid:c031c819-2b36-31c9-d0b7-949bdc6c1833, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno4v;

    /** ACCTNO4O (uuid:1c736f3f-d86d-369b-4598-32f19857e180, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno4o;

    /** CRDNUM4C (uuid:ed34d2a3-2e2a-b251-2e70-a1b5d5b4d1f7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum4c;

    /** CRDNUM4P (uuid:f2be1fd0-40de-437d-986e-90b4259fc391, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum4p;

    /** CRDNUM4H (uuid:845fca56-7003-ef94-74c2-ae441fe5043c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum4h;

    /** CRDNUM4V (uuid:f2a51fdf-f092-00f7-1800-085f5cb02554, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum4v;

    /** CRDNUM4O (uuid:949e5816-203d-9e7d-31dc-39f9e9b4186c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum4o;

    /** CRDSTS4C (uuid:907d86fc-44bc-3fed-4105-c7c82394a2d3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts4c;

    /** CRDSTS4P (uuid:b1bf255d-5afe-450d-070e-8f1c8f9138b0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts4p;

    /** CRDSTS4H (uuid:190b5766-570e-d739-2651-a52eb5c77de3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts4h;

    /** CRDSTS4V (uuid:5bcddf68-c612-7149-2f7d-03f8c6aed749, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts4v;

    /** CRDSTS4O (uuid:58506ae1-d1f8-61f5-3aae-c82b2a1da5fc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts4o;

    /** CRDSEL5C (uuid:7e9e788b-6b67-ba7d-5c2d-53db5fab5acb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel5c;

    /** CRDSEL5P (uuid:073c9009-5a0c-68ef-43ee-ea4e59c5152a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel5p;

    /** CRDSEL5H (uuid:4353939c-c01c-71bd-c277-c56c3f5551eb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel5h;

    /** CRDSEL5V (uuid:ebac9f8f-aff5-8685-7b18-ea1d7e056b1b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel5v;

    /** CRDSEL5O (uuid:87c4fc7c-82df-efe9-f5bf-75df85fe2000, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel5o;

    /** CRDSTP5C (uuid:b7480b54-10fc-79c0-8c45-c4e588a620ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp5c;

    /** CRDSTP5P (uuid:2f76e13a-807a-020b-11fd-d562a2097cb8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp5p;

    /** CRDSTP5H (uuid:06e11294-302e-815c-4b58-daef387d30ff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp5h;

    /** CRDSTP5V (uuid:4d3625d2-96ec-447b-067b-00dfdcf15c8a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp5v;

    /** CRDSTP5O (uuid:6d62e9d0-0427-6d86-c158-4a9299c02a8d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp5o;

    /** ACCTNO5C (uuid:d72223c4-3557-54fa-28ff-2568217d1dc9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno5c;

    /** ACCTNO5P (uuid:5aa19e14-c6fd-bafc-0e54-b1ac702b4928, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno5p;

    /** ACCTNO5H (uuid:e0ffbaa8-a44e-881c-b8d1-11ea2a7d01d0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno5h;

    /** ACCTNO5V (uuid:5d608dfd-e092-0a1f-a8d9-d39d6c17aed4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno5v;

    /** ACCTNO5O (uuid:6ec148a6-7c01-3934-32ca-7ae5eaeba94f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno5o;

    /** CRDNUM5C (uuid:ee7d5191-4027-7389-2456-c760d5496c03, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum5c;

    /** CRDNUM5P (uuid:36d54884-702d-68da-caa2-52cb1191ecf3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum5p;

    /** CRDNUM5H (uuid:f90a7f6b-e1af-badf-c173-d5572296bb1d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum5h;

    /** CRDNUM5V (uuid:248790ce-a992-c555-1398-668aaf726c68, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum5v;

    /** CRDNUM5O (uuid:fc910cd8-aad9-0304-cc70-48adc2e45144, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum5o;

    /** CRDSTS5C (uuid:b6b5eaf5-52be-3556-274b-42670edd5b64, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts5c;

    /** CRDSTS5P (uuid:44841197-bb4b-38ec-d053-7da206bc4237, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts5p;

    /** CRDSTS5H (uuid:67c0fc12-b21a-9482-57ec-82ec9d85933b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts5h;

    /** CRDSTS5V (uuid:417ce38d-35bc-6d40-7a4b-ccc042c49957, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts5v;

    /** CRDSTS5O (uuid:876512e5-f665-ba2e-8ab8-63cbfa64f48e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts5o;

    /** CRDSEL6C (uuid:61d6c489-c438-20ba-ae87-6e2503d495d5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel6c;

    /** CRDSEL6P (uuid:e9d0a794-da08-abe0-1cc6-b2322bd95cf8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel6p;

    /** CRDSEL6H (uuid:e766b409-a503-0daf-bd56-8d80beea087f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel6h;

    /** CRDSEL6V (uuid:00a631bc-8e83-2c6c-7d8e-a5333546bf71, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel6v;

    /** CRDSEL6O (uuid:91b92d75-4ac8-9c8a-f33f-b4bd1f58928e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel6o;

    /** CRDSTP6C (uuid:88129725-b8a0-a8d8-38c7-66b477b8ca02, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp6c;

    /** CRDSTP6P (uuid:61d6f273-b4cb-e6ae-897b-35a88e70147c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp6p;

    /** CRDSTP6H (uuid:c934a414-5974-f5b3-cbe6-332010b73b6f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp6h;

    /** CRDSTP6V (uuid:b958666f-65f9-a534-04ec-05ba355ce446, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp6v;

    /** CRDSTP6O (uuid:cb337d02-4b6b-acff-89fe-63e6b719e141, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp6o;

    /** ACCTNO6C (uuid:fb4222cb-4260-3e93-4307-165f6d613bc4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno6c;

    /** ACCTNO6P (uuid:24723f52-1f76-dc67-3b1a-1c6c76865bc0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno6p;

    /** ACCTNO6H (uuid:27d1f8d7-71b8-f349-9e72-2c80cef6d071, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno6h;

    /** ACCTNO6V (uuid:0328c6ba-ecf6-d480-cb5c-87256533efae, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno6v;

    /** ACCTNO6O (uuid:2f503324-cf93-9076-f537-44dbee0cc15f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno6o;

    /** CRDNUM6C (uuid:dfd2921e-1348-7377-226f-caa8c96c0aa7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum6c;

    /** CRDNUM6P (uuid:46b95c15-6d9d-b7ce-334e-1be5b1421d46, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum6p;

    /** CRDNUM6H (uuid:ac0c233f-47d0-b8ef-e760-7e876d2ae21d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum6h;

    /** CRDNUM6V (uuid:7d284395-7a52-5b5c-481e-4999a1dcc9dd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum6v;

    /** CRDNUM6O (uuid:e3c16fd4-e2c7-0e8b-fbb7-32dbc8847416, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum6o;

    /** CRDSTS6C (uuid:c67903b4-e8c0-4b23-cdfd-187194b51e89, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts6c;

    /** CRDSTS6P (uuid:796ea454-a52c-4bad-9a9f-38724adcf485, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts6p;

    /** CRDSTS6H (uuid:7824b7d5-e0ad-2652-6ce4-616e2e22c68e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts6h;

    /** CRDSTS6V (uuid:7e09a437-3cc3-269e-40a1-728e4400380f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts6v;

    /** CRDSTS6O (uuid:779a420a-f015-e5c9-1af7-406e210cdbc1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts6o;

    /** CRDSEL7C (uuid:f624d013-f868-fe22-8ce8-bd623e33b01f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel7c;

    /** CRDSEL7P (uuid:5ee0f93a-d861-9424-746a-e1687bff4858, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel7p;

    /** CRDSEL7H (uuid:c4de1a59-ee93-791b-64c8-9a6ef8bb32b2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel7h;

    /** CRDSEL7V (uuid:8afc4146-ba36-569d-fcd0-2175197f57b1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel7v;

    /** CRDSEL7O (uuid:6e1db5ce-ca06-2aea-c124-edf89a0779e9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsel7o;

    /** CRDSTP7C (uuid:3197bf85-a2ea-15d0-ed1e-5d26ffbf4fd3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp7c;

    /** CRDSTP7P (uuid:2b0f9d6b-2ff3-73bb-fadd-d78aee8cc735, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp7p;

    /** CRDSTP7H (uuid:4cde99ff-01e5-7fa3-80f9-c35704a36d18, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp7h;

    /** CRDSTP7V (uuid:62e7a498-a69c-e198-5866-397dd2783cdb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp7v;

    /** CRDSTP7O (uuid:c2c37a02-4e7c-4b83-a55f-b4812b6901c2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstp7o;

    /** ACCTNO7C (uuid:13fd889e-02df-6a38-bce9-0862630fcae2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno7c;

    /** ACCTNO7P (uuid:c59a0f8e-0157-8429-382f-3a2c83883529, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno7p;

    /** ACCTNO7H (uuid:915f8c3a-4a42-d146-0a68-1b6b1f2a269d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno7h;

    /** ACCTNO7V (uuid:353282dd-2072-71c1-0c87-3d5b47b21339, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno7v;

    /** ACCTNO7O (uuid:e2c2d2b1-bcbc-79dc-71df-a9873beab72a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctno7o;

    /** CRDNUM7C (uuid:3cbde6ca-4375-67ad-0f1d-d5ecb34148d5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum7c;

    /** CRDNUM7P (uuid:1a395bf3-a3ac-d86f-7809-87a07ca6b614, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum7p;

    /** CRDNUM7H (uuid:4c59197c-a72e-9223-3c12-09de7fc51be1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum7h;

    /** CRDNUM7V (uuid:f9b9a7f7-6af4-4bbb-dd6c-1947c73265bb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum7v;

    /** CRDNUM7O (uuid:ee833b04-5dfe-baca-c3c1-977e44041180, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnum7o;

    /** CRDSTS7C (uuid:b3ebabf3-1b66-1d28-177e-e5c47c75585e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts7c;

    /** CRDSTS7P (uuid:2b35e80d-4fec-4c36-d632-9e3d5840010d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts7p;

    /** CRDSTS7H (uuid:9ee2a03f-e2d0-d1dd-42fa-c32c5f23fa98, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts7h;

    /** CRDSTS7V (uuid:7ef7cfdb-605a-9844-b3f4-9de0bd7d4823, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts7v;

    /** CRDSTS7O (uuid:2fe78e45-3d8d-79de-01ff-b35c3bd10f20, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdsts7o;

    /** INFOMSGC (uuid:fe463fde-1ad6-8ff6-7a13-55b28551ed5a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgc;

    /** INFOMSGP (uuid:007e74e5-030b-d662-4ce4-a84d630ab344, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgp;

    /** INFOMSGH (uuid:38a624e2-cbe6-1481-f5e9-d478a460314b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgh;

    /** INFOMSGV (uuid:2be94e03-fd3a-bdca-baf4-65c50c3de796, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgv;

    /** INFOMSGO (uuid:198c3bc3-f297-61b6-68e2-7cabae3677d9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgo;

    /** ERRMSGC (uuid:b01ed0e7-fba5-f754-4b1a-99a421d18ebe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgc;

    /** ERRMSGP (uuid:847f92e0-83d1-ff4f-94f3-488bb5da7245, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgp;

    /** ERRMSGH (uuid:3b7ddcc0-8a3e-374b-ecf8-f59867ad592c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgh;

    /** ERRMSGV (uuid:801c5372-807e-698d-0612-f4b2276996c6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgv;

    /** ERRMSGO (uuid:ebefcdf1-e73f-db7a-002a-3d3b4fb978b2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgo;

    /** WS-DATE-TIME (uuid:69a7be25-49c5-0c01-6fd9-ba4c57b0365e, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:e52724f3-7ae4-0dfd-534b-2fd1e718cc6d, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:d3de4db3-75cb-499c-2ce5-3ca557fc83cb, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:abf52fbb-adc0-bbf2-10e7-d9404ca6e8d2, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:4f25a810-0e70-9b44-d644-e423523c4b2c, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:672d0567-c572-f4a0-3b4b-851948749706, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:46282aae-c0a1-a65c-a81a-19e0b41c501d, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:783b9cf5-ecd6-1e31-84ae-d4be91bb236b, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:b9b58ac9-5619-a644-ee72-ed8200ce9702, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:7598bcf1-7df8-feb2-49a5-5baf1279a5f9, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:f7f813be-4be6-1a6e-5510-17c5996dc8b7, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:fbd3afa8-fb94-ee08-e310-47f41c7994c9, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:3d915a78-a87c-10aa-960f-332742b33330, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:7792e0b4-97c8-88e8-277e-3bde69d4e5d9, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:832a0298-42e7-09ee-8854-5868827baaf8, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:eb8ac13d-5d1a-d192-dc0c-cba7a03d0908, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:04dc3493-5196-62ed-ac16-1181dcaa3e2a, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:8693def0-0fa5-2754-828d-9ab71d7a87bb, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:76bac77e-306b-50a5-ec7f-2c151bf8fb4b, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:2cbdca7b-9fbe-668c-b7fa-f19cf8e1f956, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:e85d35fb-b517-ef16-b8f4-9fa1106754a3, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:d68039a2-435d-073a-a5ef-0c7caa53e341, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:ad0941b7-2e46-7392-ba79-8c9b2bd0250a, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:ecbe9516-d6cc-8cc6-9a70-bbc145862f97, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:555061f6-a719-b9e7-a35c-1973b0c9b2e1, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:c8732508-dc9a-17f9-6574-c5fbd9287a9d, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:3c74dd43-7fd7-ff55-a772-8b1653b8ef9e, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:89ecd4a8-9fb2-986d-9849-dc03036e5cc4, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:6ba56ad6-a1de-6cf1-0483-606025042a1b, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:81c1aff0-feac-9605-7a83-fad6805f0622, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:5d87ca07-1f40-8a38-1d1f-59e170bfa5e4, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:a5202782-02a2-6c8c-9c7a-48f9e02078bc, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** SEC-USER-DATA (uuid:0ee9ad53-f01e-ef2d-51db-7d8f7facdf4c, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ secUserData;

    /** SEC-USR-ID (uuid:dcc13841-69cd-429d-21c8-5d00159d6795, level 5, PIC X(08).). */
    public String secUsrId;

    /** SEC-USR-FNAME (uuid:0fab3cb0-5058-820f-47a4-98bd295931f9, level 5, PIC X(20).). */
    public String secUsrFname;

    /** SEC-USR-LNAME (uuid:dee6f3bf-9d28-42a7-5773-24bca7ae74e2, level 5, PIC X(20).). */
    public String secUsrLname;

    /** SEC-USR-PWD (uuid:73894008-2191-6056-f48c-b773d7d63697, level 5, PIC X(08).). */
    public String secUsrPwd;

    /** SEC-USR-TYPE (uuid:5cb44871-c7de-88aa-34d4-149b3e0aaa8d, level 5, PIC X(01).). */
    public String secUsrType;

    /** SEC-USR-FILLER (uuid:44863cd5-25ce-16c7-59c7-7fac669bba39, level 5, PIC X(23).). */
    public String secUsrFiller;

    /** CARD-RECORD (uuid:a06ae502-5baa-bd28-2ca9-59704c4316e2, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardRecord;

    /** CARD-NUM (uuid:a207cb34-fc95-e3d4-2bfa-224101c8be1b, level 5, PIC X(16).). */
    public String cardNum;

    /** CARD-ACCT-ID (uuid:0443a0c2-9473-e7a2-1656-6710b5763800, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ cardAcctId;

    /** CARD-CVV-CD (uuid:b61e2b01-39d8-12a9-f964-b81003667a75, level 5, PIC 9(03).). */
    public int /* PIC 9(03). */ cardCvvCd;

    /** CARD-EMBOSSED-NAME (uuid:4f6b5617-b881-c427-cfc0-f06130907197, level 5, PIC X(50).). */
    public String cardEmbossedName;

    /** CARD-EXPIRAION-DATE (uuid:b0953b56-7331-90de-bf5e-d789b01a2b12, level 5, PIC X(10).). */
    public String cardExpiraionDate;

    /** CARD-ACTIVE-STATUS (uuid:cc496383-c444-255b-af01-a9b2557a5adc, level 5, PIC X(01).). */
    public String cardActiveStatus;


    // --- auto-generated stubs for undeclared references ---
    public Object eibcalen;  // auto-stub for undeclared reference
    public Object until;  // auto-stub for undeclared reference
    public Object varying;  // auto-stub for undeclared reference

    /** 0000-MAIN  (uuid:11b20dfe-4f38-7413-ada1-ffec5e9af917, source lines 1177-1481). */
    public void p0000Main() {
        // INITIALIZE ccWorkArea wsMiscStorage wsCommarea: reset to PIC defaults
        this.ccWorkArea = null;  // TODO: set to type-appropriate zero/spaces
        this.wsMiscStorage = null;  // TODO: set to type-appropriate zero/spaces
        this.wsCommarea = null;  // TODO: set to type-appropriate zero/spaces
        // MOVE LIT-THISTRANID TO WS-TRANID  -- identifier MOVE; needs PIC-aware type coercion
        // SET WS-ERROR-MSG-OFF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.eibcalen, 0)) {
            // TODO: translate body for: EIBCALEN = 0
        }
        if ((true /* TODO translate: (CDEMO-PGM-ENTER */) && (!java.util.Objects.equals(this.cdemoFromProgram, this.litThispgm)))) {
            // TODO: translate body for: (CDEMO-PGM-ENTER AND CDEMO-FROM-PROGRAM NOT EQUAL LIT-THISPGM)
        }
        this.yyyyStorePfkey();  // PERFORM
        if ((true /* TODO translate: EIBCALEN > 0 */) && (java.util.Objects.equals(this.cdemoFromProgram, this.litThispgm))) {
            // TODO: translate body for: EIBCALEN > 0 AND CDEMO-FROM-PROGRAM EQUAL LIT-THISPGM
        }
        // SET PFK-INVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if ((true /* TODO translate: CCARD-AID-ENTER */) || (true /* TODO translate: CCARD-AID-PFK03 */) || (true /* TODO translate: CCARD-AID-PFK07 */) || (true /* TODO translate: CCARD-AID-PFK08 */)) {
            // TODO: translate body for: CCARD-AID-ENTER OR CCARD-AID-PFK03 OR CCARD-AID-PFK07 OR CCARD-AID-PFK08
        }
        if (true /* TODO translate: PFK-INVALID */) {
            // TODO: translate body for: PFK-INVALID
        }
        if ((true /* TODO translate: (CCARD-AID-PFK03 */) && (java.util.Objects.equals(this.cdemoFromProgram, this.litThispgm)))) {
            // TODO: translate body for: (CCARD-AID-PFK03 AND CDEMO-FROM-PROGRAM EQUAL LIT-THISPGM)
        }
        if (true /* TODO translate: CCARD-AID-PFK08 */) {
            // TODO: translate body for: CCARD-AID-PFK08
        }
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        if (true /* TODO translate: INPUT-ERROR */) {
            // TODO: translate body for: INPUT-ERROR
        }
        // MOVE LIT-THISPGM TO CCARD-NEXT-PROG  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [GO_TO]: GO TO COMMON-RETURN
    }

    /** COMMON-RETURN  (uuid:b6bb791d-a367-cde7-21f4-8657fef3e576, source lines 1483-1499). */
    public void commonReturn() {
        // MOVE LIT-THISTRANID TO CDEMO-FROM-TRANID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISPGM TO CDEMO-FROM-PROGRAM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISMAPSET TO CDEMO-LAST-MAPSET  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISMAP TO CDEMO-LAST-MAP  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CARDDEMO-COMMAREA TO WS-COMMAREA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-THIS-PROGCOMMAREA TO WS-COMMAREA(LENGTH OF CARDDEMO-COMMAREA, LENGTH OF WS-THIS-PROGCOMMAREA  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 0000-MAIN-EXIT  (uuid:67f3df1d-99f7-78f4-db1f-9fee88e37157, source lines 1500-1502). */
    public void p0000MainExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1000-SEND-MAP  (uuid:8211869f-dfd1-ec94-d78e-00218bf21c67, source lines 1503-1516). */
    public void p1000SendMap() {
        // COBOL [PERFORM]: PERFORM 1100-SCREEN-INIT THRU 1100-SCREEN-INIT-EXIT
        // COBOL [PERFORM]: PERFORM 1200-SCREEN-ARRAY-INIT THRU 1200-SCREEN-ARRAY-INIT-EXIT
        // COBOL [PERFORM]: PERFORM 1250-SETUP-ARRAY-ATTRIBS THRU 1250-SETUP-ARRAY-ATTRIBS-EXIT
        // COBOL [PERFORM]: PERFORM 1300-SETUP-SCREEN-ATTRS THRU 1300-SETUP-SCREEN-ATTRS-EXIT
        // COBOL [PERFORM]: PERFORM 1400-SETUP-MESSAGE THRU 1400-SETUP-MESSAGE-EXIT
        // COBOL [PERFORM]: PERFORM 1500-SEND-SCREEN THRU 1500-SEND-SCREEN-EXIT
    }

    /** 1000-SEND-MAP-EXIT  (uuid:b09fd9a7-5025-1bb6-2444-40be89922721, source lines 1518-1520). */
    public void p1000SendMapExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1100-SCREEN-INIT  (uuid:d68594d0-005b-2581-b2f9-352d78969e3e, source lines 1521-1551). */
    public void p1100ScreenInit() {
        this.ccrdliao = "\u0000";
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF CCRDLIAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF CCRDLIAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISTRANID TO TRNNAMEO OF CCRDLIAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISPGM TO PGMNAMEO OF CCRDLIAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF CCRDLIAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF CCRDLIAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CA-SCREEN-NUM TO PAGENOO OF CCRDLIAO  -- identifier MOVE; needs PIC-aware type coercion
        // SET WS-NO-INFO-MESSAGE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // MOVE WS-INFO-MSG TO INFOMSGO OF CCRDLIAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE DFHBMDAR TO INFOMSGC OF CCRDLIAO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 1100-SCREEN-INIT-EXIT  (uuid:1ef1e3f8-65d7-fc5c-7f4d-2ef2fad6fbf5, source lines 1553-1555). */
    public void p1100ScreenInitExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1200-SCREEN-ARRAY-INIT  (uuid:0bdaafdf-8c67-f513-86b0-07409f2cd9a0, source lines 1557-1622). */
    public void p1200ScreenArrayInit() {
        if (java.util.Objects.equals(this.wsEachCard(1), "\u0000")) {
            // TODO: translate body for: WS-EACH-CARD(1) EQUAL LOW-VALUES
        }
        if (java.util.Objects.equals(this.wsEachCard(2), "\u0000")) {
            // TODO: translate body for: WS-EACH-CARD(2) EQUAL LOW-VALUES
        }
        if (java.util.Objects.equals(this.wsEachCard(3), "\u0000")) {
            // TODO: translate body for: WS-EACH-CARD(3) EQUAL LOW-VALUES
        }
        if (java.util.Objects.equals(this.wsEachCard(4), "\u0000")) {
            // TODO: translate body for: WS-EACH-CARD(4) EQUAL LOW-VALUES
        }
        if (java.util.Objects.equals(this.wsEachCard(5), "\u0000")) {
            // TODO: translate body for: WS-EACH-CARD(5) EQUAL LOW-VALUES
        }
        if (java.util.Objects.equals(this.wsEachCard(6), "\u0000")) {
            // TODO: translate body for: WS-EACH-CARD(6) EQUAL LOW-VALUES
        }
        if (java.util.Objects.equals(this.wsEachCard(7), "\u0000")) {
            // TODO: translate body for: WS-EACH-CARD(7) EQUAL LOW-VALUES
        }
    }

    /** 1200-SCREEN-ARRAY-INIT-EXIT  (uuid:0e145dcb-f762-d93e-d2d0-0efb1749a123, source lines 1624-1626). */
    public void p1200ScreenArrayInitExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1250-SETUP-ARRAY-ATTRIBS  (uuid:6fcf5f5b-8477-9961-2696-4b20e78eec89, source lines 1627-1711). */
    public void p1250SetupArrayAttribs() {
        if (java.util.Objects.equals(this.wsEachCard(1), "\u0000")) {
            // TODO: translate body for: WS-EACH-CARD(1) EQUAL LOW-VALUES OR FLG-PROTECT-SELECT-ROWS-YES
        }
        if (java.util.Objects.equals(this.wsEachCard(2), "\u0000")) {
            // TODO: translate body for: WS-EACH-CARD(2) EQUAL LOW-VALUES OR FLG-PROTECT-SELECT-ROWS-YES
        }
        if (java.util.Objects.equals(this.wsEachCard(3), "\u0000")) {
            // TODO: translate body for: WS-EACH-CARD(3) EQUAL LOW-VALUES OR FLG-PROTECT-SELECT-ROWS-YES
        }
        if (java.util.Objects.equals(this.wsEachCard(4), "\u0000")) {
            // TODO: translate body for: WS-EACH-CARD(4) EQUAL LOW-VALUES OR FLG-PROTECT-SELECT-ROWS-YES
        }
        if (java.util.Objects.equals(this.wsEachCard(5), "\u0000")) {
            // TODO: translate body for: WS-EACH-CARD(5) EQUAL LOW-VALUES OR FLG-PROTECT-SELECT-ROWS-YES
        }
        if (java.util.Objects.equals(this.wsEachCard(6), "\u0000")) {
            // TODO: translate body for: WS-EACH-CARD(6) EQUAL LOW-VALUES OR FLG-PROTECT-SELECT-ROWS-YES
        }
        if (java.util.Objects.equals(this.wsEachCard(7), "\u0000")) {
            // TODO: translate body for: WS-EACH-CARD(7) EQUAL LOW-VALUES OR FLG-PROTECT-SELECT-ROWS-YES
        }
    }

    /** 1250-SETUP-ARRAY-ATTRIBS-EXIT  (uuid:f754ecbd-0aa7-820e-18e9-f81492acf9b4, source lines 1713-1715). */
    public void p1250SetupArrayAttribsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1300-SETUP-SCREEN-ATTRS  (uuid:c7a7c4d8-ffe8-65d9-19b4-d0c702dc52c2, source lines 1716-1768). */
    public void p1300SetupScreenAttrs() {
        if (java.util.Objects.equals(this.eibcalen, 0)) {
            // TODO: translate body for: EIBCALEN = 0 OR (CDEMO-PGM-ENTER AND CDEMO-FROM-PROGRAM = LIT-MENUPGM)
        }
        if (true /* TODO translate: FLG-ACCTFILTER-NOT-OK */) {
            // TODO: translate body for: FLG-ACCTFILTER-NOT-OK
        }
        if (true /* TODO translate: FLG-CARDFILTER-NOT-OK */) {
            // TODO: translate body for: FLG-CARDFILTER-NOT-OK
        }
        if (true /* TODO translate: INPUT-OK */) {
            // TODO: translate body for: INPUT-OK
        }
    }

    /** 1300-SETUP-SCREEN-ATTRS-EXIT  (uuid:8b9e64ce-c543-57e9-2b0c-6a9a8515fafc, source lines 1769-1771). */
    public void p1300SetupScreenAttrsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1400-SETUP-MESSAGE  (uuid:155236de-c334-7e5e-bdf8-611e403624d1, source lines 1774-1811). */
    public void p1400SetupMessage() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        // MOVE WS-ERROR-MSG TO ERRMSGO OF CCRDLIAO  -- identifier MOVE; needs PIC-aware type coercion
        if ((true /* TODO translate: NOT WS-NO-INFO-MESSAGE */) && (true /* TODO translate: NOT WS-NO-RECORDS-FOUND */)) {
            // TODO: translate body for: NOT WS-NO-INFO-MESSAGE AND NOT WS-NO-RECORDS-FOUND
        }
    }

    /** 1400-SETUP-MESSAGE-EXIT  (uuid:4a511b52-9234-6e58-7756-45500c89cc56, source lines 1812-1814). */
    public void p1400SetupMessageExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1500-SEND-SCREEN  (uuid:391dfaca-cb96-01f5-73e9-8ba482735639, source lines 1817-1826). */
    public void p1500SendScreen() {
        // TODO: implement p1500SendScreen.  See uuid:391dfaca-cb96-01f5-73e9-8ba482735639
    }

    /** 1500-SEND-SCREEN-EXIT  (uuid:e6beefcf-4ebe-4e9c-e2e0-3732c61e8f54, source lines 1827-1829). */
    public void p1500SendScreenExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2000-RECEIVE-MAP  (uuid:e4d834ec-9382-426d-2e7a-9bd211025891, source lines 1830-1836). */
    public void p2000ReceiveMap() {
        // COBOL [PERFORM]: PERFORM 2100-RECEIVE-SCREEN THRU 2100-RECEIVE-SCREEN-EXIT
        // COBOL [PERFORM]: PERFORM 2200-EDIT-INPUTS THRU 2200-EDIT-INPUTS-EXIT
    }

    /** 2000-RECEIVE-MAP-EXIT  (uuid:95a2d24e-0e21-ac98-4e47-012e5b92f81b, source lines 1838-1840). */
    public void p2000ReceiveMapExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2100-RECEIVE-SCREEN  (uuid:9ca0091b-ca6e-063f-0c85-620e25ce534a, source lines 1841-1858). */
    public void p2100ReceiveScreen() {
        // MOVE ACCTSIDI OF CCRDLIAI TO CC-ACCT-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CARDSIDI OF CCRDLIAI TO CC-CARD-NUM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CRDSEL1I OF CCRDLIAI TO WS-EDIT-SELECT(1)  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CRDSEL2I OF CCRDLIAI TO WS-EDIT-SELECT(2)  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CRDSEL3I OF CCRDLIAI TO WS-EDIT-SELECT(3)  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CRDSEL4I OF CCRDLIAI TO WS-EDIT-SELECT(4)  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CRDSEL5I OF CCRDLIAI TO WS-EDIT-SELECT(5)  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CRDSEL6I OF CCRDLIAI TO WS-EDIT-SELECT(6)  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CRDSEL7I OF CCRDLIAI TO WS-EDIT-SELECT(7)  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 2100-RECEIVE-SCREEN-EXIT  (uuid:3f105f3c-f0fa-e86a-aafb-674b1da756b2, source lines 1860-1862). */
    public void p2100ReceiveScreenExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2200-EDIT-INPUTS  (uuid:65e2624e-3d5d-8bb3-5b50-09ddc6ccc608, source lines 1864-1876). */
    public void p2200EditInputs() {
        // SET INPUT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET FLG-PROTECT-SELECT-ROWS-NO TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [PERFORM]: PERFORM 2210-EDIT-ACCOUNT THRU 2210-EDIT-ACCOUNT-EXIT
        // COBOL [PERFORM]: PERFORM 2220-EDIT-CARD THRU 2220-EDIT-CARD-EXIT
        // COBOL [PERFORM]: PERFORM 2250-EDIT-ARRAY THRU 2250-EDIT-ARRAY-EXIT
    }

    /** 2200-EDIT-INPUTS-EXIT  (uuid:fcfaddc9-ce1b-5f4c-3874-735bd1b2343f, source lines 1878-1880). */
    public void p2200EditInputsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2210-EDIT-ACCOUNT  (uuid:120a53ae-6fcc-c00b-e31d-f8cb1b2351c2, source lines 1882-1909). */
    public void p2210EditAccount() {
        // SET FLG-ACCTFILTER-BLANK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.ccAcctId, "\u0000")) {
            // TODO: translate body for: CC-ACCT-ID EQUAL LOW-VALUES OR CC-ACCT-ID EQUAL SPACES OR CC-ACCT-ID-N EQUAL ZEROS
        }
        if (!this.ccAcctId.toString().matches("-?\\d+(\\.\\d+)?")) {
            // TODO: translate body for: CC-ACCT-ID IS NOT NUMERIC
        }
    }

    /** 2210-EDIT-ACCOUNT-EXIT  (uuid:87798ddf-4d36-fda4-ae72-66d1e8d6f49f, source lines 1911-1913). */
    public void p2210EditAccountExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2220-EDIT-CARD  (uuid:573384c7-8edf-2713-0133-9175a4e3a61d, source lines 1915-1946). */
    public void p2220EditCard() {
        // SET FLG-CARDFILTER-BLANK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.ccCardNum, "\u0000")) {
            // TODO: translate body for: CC-CARD-NUM EQUAL LOW-VALUES OR CC-CARD-NUM EQUAL SPACES OR CC-CARD-NUM-N EQUAL ZEROS
        }
        if (!this.ccCardNum.toString().matches("-?\\d+(\\.\\d+)?")) {
            // TODO: translate body for: CC-CARD-NUM IS NOT NUMERIC
        }
    }

    /** 2220-EDIT-CARD-EXIT  (uuid:08e4203e-95b8-017b-df90-de439af6e534, source lines 1948-1950). */
    public void p2220EditCardExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2250-EDIT-ARRAY  (uuid:55a6fefe-739f-973b-ba3b-4ecf68d6ef6a, source lines 1952-1996). */
    public void p2250EditArray() {
        if (true /* TODO translate: INPUT-ERROR */) {
            // TODO: translate body for: INPUT-ERROR
        }
        // COBOL [INSPECT]: INSPECT WS-EDIT-SELECT-FLAGS TALLYING I FOR ALL 'S' ALL 'U'
        if (true /* TODO translate: I > +1 */) {
            // TODO: translate body for: I > +1
        }
        this.iSelected = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
        this.varying();  // PERFORM
    }

    /** 2250-EDIT-ARRAY-EXIT  (uuid:c00a452f-0265-02ab-a6b2-fb0495acda76, source lines 1998-2000). */
    public void p2250EditArrayExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9000-READ-FORWARD  (uuid:19eea770-ce61-47dd-5ae4-9019293f210f, source lines 2002-2139). */
    public void p9000ReadForward() {
        this.wsAllRows = "\u0000";
        this.wsScrnCounter = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
        // SET CA-NEXT-PAGE-EXISTS TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET MORE-RECORDS-TO-READ TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.until();  // PERFORM
    }

    /** 9000-READ-FORWARD-EXIT  (uuid:79378f28-a59e-5ca3-1cf7-76be8a2619f4, source lines 2140-2142). */
    public void p9000ReadForwardExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9100-READ-BACKWARDS  (uuid:d8aa4ca4-ecd1-df30-d34a-89e356bdf03f, source lines 2143-2251). */
    public void p9100ReadBackwards() {
        this.wsAllRows = "\u0000";
        // MOVE WS-CA-FIRST-CARDKEY TO WS-CA-LAST-CARDKEY  -- identifier MOVE; needs PIC-aware type coercion
        // COMPUTE (needs PIC-aware expression translation): COMPUTE WS-SCRN-COUNTER = WS-MAX-SCREEN-LINES + 1 END-COMPUTE;
        // SET CA-NEXT-PAGE-EXISTS TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET MORE-RECORDS-TO-READ TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
        this.until();  // PERFORM
    }

    /** 9100-READ-BACKWARDS-EXIT  (uuid:6b9d2718-7713-4cc9-9750-aaacec31f37c, source lines 2253-2259). */
    public void p9100ReadBackwardsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9500-FILTER-RECORDS  (uuid:9c810052-40bc-6efa-379b-66db81dd98cb, source lines 2261-2286). */
    public void p9500FilterRecords() {
        // SET WS-DONOT-EXCLUDE-THIS-RECORD TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (true /* TODO translate: FLG-ACCTFILTER-ISVALID */) {
            // TODO: translate body for: FLG-ACCTFILTER-ISVALID
        }
        if (true /* TODO translate: FLG-CARDFILTER-ISVALID */) {
            // TODO: translate body for: FLG-CARDFILTER-ISVALID
        }
    }

    /** 9500-FILTER-RECORDS-EXIT  (uuid:0499ef41-7281-746c-3945-7606f4c3e4e3, source lines 2288-2290). */
    public void p9500FilterRecordsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** YYYY-STORE-PFKEY  (uuid:437912b9-2ef6-cd94-b8b8-df9253053be2, source lines 2311-2373). */
    public void yyyyStorePfkey() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
    }

    /** YYYY-STORE-PFKEY-EXIT  (uuid:e2ba5fb6-4c96-0624-5cc4-3ee8fba4d78f, source lines 2374-2376). */
    public void yyyyStorePfkeyExit() {
        // COBOL [EXIT]: EXIT
    }

    /** SEND-PLAIN-TEXT  (uuid:638cdd06-144b-3f89-03f7-08fab4d9d11b, source lines 2385-2395). */
    public void sendPlainText() {
        // TODO: implement sendPlainText.  See uuid:638cdd06-144b-3f89-03f7-08fab4d9d11b
    }

    /** SEND-PLAIN-TEXT-EXIT  (uuid:a9d0753f-56ab-b2b3-0a3f-bf763b505f36, source lines 2396-2398). */
    public void sendPlainTextExit() {
        // COBOL [EXIT]: EXIT
    }

    /** SEND-LONG-TEXT  (uuid:23a581f0-a24c-02a8-afc9-45589cc6a035, source lines 2404-2414). */
    public void sendLongText() {
        // TODO: implement sendLongText.  See uuid:23a581f0-a24c-02a8-afc9-45589cc6a035
    }

    /** SEND-LONG-TEXT-EXIT  (uuid:28250922-40c4-7e39-64d3-ccc8ddc202fb, source lines 2415-2417). */
    public void sendLongTextExit() {
        // COBOL [EXIT]: EXIT
    }

    public static void main(String[] args) {
        new Cocrdlic().mainPara();
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
