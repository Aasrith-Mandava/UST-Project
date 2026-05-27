// Generated from COTRTUPC.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COTRTUPC.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * COTRTUPC (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: COTRTUPC.cbl
 */
public class Cotrtupc {

    /** WS-MISC-STORAGE (uuid:8e39baf7-635f-e46b-e0fd-75e05a434151, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsMiscStorage;

    /** WS-CICS-PROCESSNG-VARS (uuid:b244f624-68d0-a396-5483-35a2635b5587, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCicsProcessngVars;

    /** WS-RESP-CD (uuid:12730838-e6ae-9473-c0dc-2afdc9ab41c1, level 7, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsRespCd;

    /** WS-REAS-CD (uuid:18c0a176-f461-945c-e319-cd563dfe3f79, level 7, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsReasCd;

    /** WS-TRANID (uuid:d9ee1e12-bf32-9e28-3014-69bd3d52985d, level 7, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTranid;

    /** WS-UCTRANS (uuid:2fc75946-6a3e-16fa-6764-fc64df6699db, level 7, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsUctrans;

    /** WS-GENERIC-EDITS (uuid:579564b9-fd9e-8cb2-9bbf-1baafe1e0ec6, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsGenericEdits;

    /** WS-EDIT-VARIABLE-NAME (uuid:c4452fb4-1b44-37a5-e0f6-39c5f1a604f9, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditVariableName;

    /** WS-EDIT-ALPHANUM-ONLY (uuid:fe780f41-f70e-1bf8-e3d0-938991581e34, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditAlphanumOnly;

    /** WS-EDIT-ALPHANUM-LENGTH (uuid:0deefdbc-4589-d413-8ca2-32d4649e817b, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditAlphanumLength;

    /** WS-EDIT-ALPHANUM-ONLY-FLAGS (uuid:ba34b76c-b356-8da2-1989-bd4090c1c7a9, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditAlphanumOnlyFlags;

    /** WS-MISC-VARS (uuid:02fbd79b-9e06-026d-f70d-e0aa90bf2750, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsMiscVars;

    /** WS-DISP-SQLCODE (uuid:d267fdfc-05b9-ccee-9aff-c5b466d0bc22, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDispSqlcode;

    /** WS-STRING-MID (uuid:5e709492-95aa-792a-245e-b4e512783157, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsStringMid;

    /** WS-STRING-LEN (uuid:cc839985-d321-038a-a3e2-4cd8d225e539, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsStringLen;

    /** WS-STRING-OUT (uuid:93e46b8d-c585-82e4-cc44-f1ac426b86b6, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsStringOut;

    /** WS-EDIT-DATE-CCYYMMDD (uuid:d7d925ac-5d09-f0aa-0f25-ff531453a3fc, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateCcyymmdd;

    /** WS-EDIT-DATE-CCYY (uuid:2ef34efe-c51b-9cf4-3dcc-f40ffa81e82a, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateCcyy;

    /** WS-EDIT-DATE-CC (uuid:7aaf1e1f-4acf-c033-8f59-1df5b83ad7aa, level 25, PIC X(2).). */
    public String wsEditDateCc;

    /** WS-EDIT-DATE-CC-N (uuid:b751d02b-36a8-d9ea-a8e6-42ba27bc0fad, level 25, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateCcN;

    /** WS-EDIT-DATE-YY (uuid:5607346c-667a-dc02-63c7-c8ceb01cca2b, level 25, PIC X(2).). */
    public String wsEditDateYy;

    /** WS-EDIT-DATE-YY-N (uuid:a272554e-7542-b766-d0d9-0477325ff973, level 25, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateYyN;

    /** WS-EDIT-DATE-CCYY-N (uuid:13c7157a-f380-cf40-76cc-7f457efce51c, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateCcyyN;

    /** WS-EDIT-DATE-MM (uuid:168beba4-2491-9e19-4ea8-25ba7feb73c4, level 20, PIC X(2).). */
    public String wsEditDateMm;

    /** WS-EDIT-DATE-MM-N (uuid:8770afd3-3cde-f109-0939-8f641924cdda, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateMmN;

    /** WS-EDIT-DATE-DD (uuid:c5754390-fdb1-a858-65bc-25a89d721bb6, level 20, PIC X(2).). */
    public String wsEditDateDd;

    /** WS-EDIT-DATE-DD-N (uuid:135c692c-c2ac-bc68-102e-9103b90d0a14, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateDdN;

    /** WS-EDIT-DATE-CCYYMMDD-N (uuid:c6f7ed6f-05df-f2b4-9383-9e4e551cf7d0, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateCcyymmddN;

    /** WS-EDIT-DATE-BINARY (uuid:c2d138cc-300c-82a8-cf48-495997ad201d, level 10, PIC S9(9) BINARY). */
    public int /* PIC S9(9) signed */ wsEditDateBinary;

    /** WS-CURRENT-DATE (uuid:842f367a-bfce-5700-5e46-1c070ee9837d, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurrentDate;

    /** WS-CURRENT-DATE-YYYYMMDD (uuid:a15c4a5f-bfd5-05d1-7ea2-9ff3b9738842, level 20, PIC X(8).). */
    public String wsCurrentDateYyyymmdd;

    /** WS-CURRENT-DATE-YYYYMMDD-N (uuid:6a519992-8f40-e08f-217c-ed83462a5902, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurrentDateYyyymmddN;

    /** WS-CURRENT-DATE-BINARY (uuid:d1c2cc14-abdf-e7ba-a916-8a2d4b1d7774, level 20, PIC S9(9) BINARY). */
    public int /* PIC S9(9) signed */ wsCurrentDateBinary;

    /** WS-EDIT-DATE-FLGS (uuid:691dd294-1c60-98e3-da0a-b47cc8a22bf4, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateFlgs;

    /** WS-EDIT-YEAR-FLG (uuid:dc6fe2dd-01c3-9caa-61c5-1a95c84427f2, level 20, PIC X(01).). */
    public String wsEditYearFlg;

    /** WS-EDIT-MONTH (uuid:683c3321-63c5-dbc3-a8c1-6e08f8896f31, level 20, PIC X(01).). */
    public String wsEditMonth;

    /** WS-EDIT-DAY (uuid:47b4c9e5-ef3e-2aca-6dc6-b053ffc9142a, level 20, PIC X(01).). */
    public String wsEditDay;

    /** WS-DATE-FORMAT (uuid:c8015d38-08a6-c3e3-7382-6f624b289b6b, level 10, PIC X(08)). */
    public String wsDateFormat;

    /** WS-DATE-VALIDATION-RESULT (uuid:966a4ad7-360b-a3f0-be23-83ac906b99b2, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateValidationResult;

    /** WS-SEVERITY (uuid:9fa3be0e-261a-edd2-d1af-5df6ce524fe8, level 20, PIC X(04).). */
    public String wsSeverity;

    /** WS-SEVERITY-N (uuid:c5bcfac4-9467-61fe-1de9-56a326cd2e0d, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsSeverityN;

    /** WS-MSG-NO (uuid:6a3ed1f6-4a76-c876-8010-647282d67864, level 20, PIC X(04).). */
    public String wsMsgNo;

    /** WS-MSG-NO-N (uuid:16b87c61-4b9c-dcc6-0187-85760aa7430c, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsMsgNoN;

    /** WS-RESULT (uuid:ffc19c09-88a8-96ab-5299-b76740740cae, level 20, PIC X(15).). */
    public String wsResult;

    /** WS-DATE (uuid:017ab8ec-49f5-3ad7-6484-91e72d9cd8de, level 20, PIC X(10).). */
    public String wsDate;

    /** WS-DATE-FMT (uuid:106af634-6b04-3e62-0359-89a025351c03, level 20, PIC X(10).). */
    public String wsDateFmt;

    /** WS-DATACHANGED-FLAG (uuid:7250620a-0664-fbf4-2db2-1c3bf9c9daf8, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDatachangedFlag;

    /** WS-INPUT-FLAG (uuid:1f12c2c8-2d00-d9f9-b8a2-e1e6f2eb8a4c, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsInputFlag;

    /** WS-RETURN-FLAG (uuid:661c802c-5e44-ffef-b910-d3c7628bc806, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsReturnFlag;

    /** WS-PFK-FLAG (uuid:86b3ddc3-5a7c-74c0-7d44-a15a9e638b4a, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsPfkFlag;

    /** WS-EDIT-TTYP-FLAG (uuid:d60e2811-0204-9e8e-e77f-a96e23d82918, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditTtypFlag;

    /** WS-NON-KEY-FLAGS (uuid:a0d1187d-b0be-f012-a433-4fe104ce14f5, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsNonKeyFlags;

    /** WS-EDIT-DESC-FLAGS (uuid:df6a36c9-7785-4279-48fd-3d43f8d129a3, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDescFlags;

    /** CICS-OUTPUT-EDIT-VARS (uuid:bcb4c6a6-3ef7-c8f1-315f-2d756432c91b, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cicsOutputEditVars;

    /** WS-EDIT-DATE-X (uuid:c3d0c9a6-440f-1303-79fb-ec3f6acec0fb, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateX;

    /** WS-EDIT-DATE-X-YEAR (uuid:d201ec77-705d-ee08-aefd-efc464d65088, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateXYear;

    /** WS-EDIT-DATE-MONTH (uuid:363441e7-c2a7-c9d0-2902-9593e675ef0b, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateMonth;

    /** WS-EDIT-DATE-DAY (uuid:64e3c1bd-139e-c080-240f-9f7d0a23e0ae, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateDay;

    /** WS-EDIT-DATE-X (uuid:f9cd24d9-bd8e-03a4-1a39-24515862d8d3, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateX;

    /** WS-EDIT-CURRENCY-9-2 (uuid:df0c317e-55d0-82ad-84d5-04b5b5c71d77, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditCurrency92;

    /** WS-EDIT-CURRENCY-9-2-F (uuid:b2c2bd20-7052-f7b5-65ae-80707028f00f, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditCurrency92F;

    /** WS-EDIT-NUMERIC-2 (uuid:8042def6-131e-50d7-9f0f-ad613a081d7f, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditNumeric2;

    /** WS-EDIT-ALPHANUMERIC-2 (uuid:bf374c6c-3fcf-c2fe-b21a-7bf8c4bf0bca, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditAlphanumeric2;

    /** WS-TABLE-READ-FLAGS (uuid:f439ce63-8912-9c0f-4de3-de5b89dae907, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTableReadFlags;

    /** WS-TRANTYPE-MASTER-READ-FLAG (uuid:636356d2-a166-0da4-6731-e642a578e7d8, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTrantypeMasterReadFlag;

    /** TTYP-UPDATE-RECORD (uuid:48073a5c-faf8-4c2a-2945-e22a2bdfeee3, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttypUpdateRecord;

    /** TTUP-UPDATE-TTYP-TYPE (uuid:439dae34-5748-9f8c-1460-70fc5a9cf97c, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttupUpdateTtypType;

    /** TTUP-UPDATE-TTYP-TYPE-DESC (uuid:4bb1d042-9a4a-cf49-710b-53fcb8e9b790, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttupUpdateTtypTypeDesc;

    /** WS-INFO-MSG (uuid:672852c1-a92d-0e51-97b8-5440e4d0d5bb, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsInfoMsg;

    /** WS-RETURN-MSG (uuid:ed1c0090-8b12-7ed9-9878-aaa04ab8c603, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsReturnMsg;

    /** WS-LITERALS (uuid:76a53376-6b2d-95e0-3641-1fb821078a2a, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsLiterals;

    /** LIT-THISPGM (uuid:79c1660e-8f45-2cc6-18c8-db0e5f4d9296, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litThispgm;

    /** LIT-THISTRANID (uuid:02162c15-e3b6-81b3-8e3e-d1832526897b, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litThistranid;

    /** LIT-THISMAPSET (uuid:bc82d539-1ac0-2f20-6b88-81276ee2b644, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litThismapset;

    /** LIT-THISMAP (uuid:f5d74976-de78-3e80-8763-12e4c4c78a4f, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litThismap;

    /** LIT-ADMINPGM (uuid:b24ee83d-0b35-7eff-8af6-4249c40a204e, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litAdminpgm;

    /** LIT-ADMINTRANID (uuid:2f2f13ce-ac96-8194-70d1-2c6cccee9b31, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litAdmintranid;

    /** LIT-ADMINMAPSET (uuid:758832da-e107-9320-9591-8b0dff060a38, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litAdminmapset;

    /** LIT-ADMINMAP (uuid:44036e55-c9f2-d1df-8d34-6bcf7adeb34f, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litAdminmap;

    /** LIT-LISTTPGM (uuid:c4519559-3eda-feb7-7ace-6155be338d72, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litListtpgm;

    /** LIT-LISTTTRANID (uuid:058aceb1-f902-ecc4-11a4-cba339a1eca5, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litListttranid;

    /** LIT-LISTTMAPSET (uuid:d85d8d9c-93c6-ca47-cb82-64c6959963b6, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litListtmapset;

    /** LIT-LISTTMAP (uuid:8b7bcc67-b963-2367-6a9d-c8ac12262d54, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litListtmap;

    /** LIT-ALL-ALPHANUM-FROM-X (uuid:09f38e82-fae8-6ba7-ac9d-6436db53dd3c, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litAllAlphanumFromX;

    /** LIT-ALL-ALPHA-FROM-X (uuid:a5e68bad-1444-627c-8fa6-0c1aa7b044b0, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litAllAlphaFromX;

    /** LIT-UPPER (uuid:2b2de94b-843e-5421-0943-c91ca4ee4b93, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litUpper;

    /** LIT-LOWER (uuid:13defcb4-9898-3313-12f0-32701033d11d, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litLower;

    /** LIT-NUMBERS (uuid:9760c81f-d5e9-1d0c-0378-ac241593913e, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litNumbers;

    /** CC-WORK-AREAS (uuid:0d3d0be1-5299-b74d-92eb-d25923eedf09, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccWorkAreas;

    /** CC-WORK-AREA (uuid:e9b3e6e3-0d0d-3f64-128b-6446f8044258, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccWorkArea;

    /** CCARD-AID (uuid:8f564b60-6f8e-d4fb-85fa-16895a980285, level 10, PIC X(5).). */
    public String ccardAid;

    /** CCARD-NEXT-PROG (uuid:a7170ac8-12cf-2640-628f-87b5b18a45fc, level 10, PIC X(8).). */
    public String ccardNextProg;

    /** CCARD-NEXT-MAPSET (uuid:423cc190-ddee-bdef-f464-2979198e485e, level 10, PIC X(7).). */
    public String ccardNextMapset;

    /** CCARD-NEXT-MAP (uuid:be74bbf6-f61a-bc1d-a939-7acafec2a986, level 10, PIC X(7).). */
    public String ccardNextMap;

    /** CCARD-ERROR-MSG (uuid:f45ea6af-9608-57c7-0162-2c7032da18bf, level 10, PIC X(75).). */
    public String ccardErrorMsg;

    /** CCARD-RETURN-MSG (uuid:253ae412-92a4-dc9c-5f78-dcecab8aa862, level 10, PIC X(75).). */
    public String ccardReturnMsg;

    /** CC-ACCT-ID (uuid:67ea5564-a2ff-9f1a-44c4-3cd094a62ab1, level 10, PIC X(11)). */
    public String ccAcctId;

    /** CC-ACCT-ID-N (uuid:f246f966-75fb-45b5-2aed-6d636589761b, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ ccAcctIdN;

    /** CC-CARD-NUM (uuid:7b7f3942-4b9a-f2d1-8b3d-b6e845ac4da0, level 10, PIC X(16)). */
    public String ccCardNum;

    /** CC-CARD-NUM-N (uuid:85121cfc-b9a4-1625-0639-9712d113c367, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ ccCardNumN;

    /** CC-CUST-ID (uuid:abce175f-8e87-60e5-06e9-51ea38bd42bb, level 10, PIC X(09)). */
    public int /* PIC X(09) */ ccCustId;

    /** CC-CUST-ID-N (uuid:3a1d7e7a-90e0-566a-ab3a-10cf64c19ff7, level 10, PIC 9(9).). */
    public int /* PIC 9(9). */ ccCustIdN;

    /** LIT-ALL-ALPHA-FROM (uuid:87a31ba4-7860-a88e-abdf-9d458b426114, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litAllAlphaFrom;

    /** LIT-ALL-ALPHANUM-FROM (uuid:3db40b4b-9221-b4e4-caba-05dc697d07c4, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litAllAlphanumFrom;

    /** LIT-ALL-NUM-FROM (uuid:915240bb-2d56-64e2-21b3-98851ce890b1, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litAllNumFrom;

    /** LIT-ALPHA-SPACES-TO (uuid:15c856d0-7447-50b3-210e-a8a68ae95c18, level 77, PIC unknown — fell back to name-suffix heuristic). */
    public String litAlphaSpacesTo;

    /** LIT-ALPHANUM-SPACES-TO (uuid:0d1e651f-7edb-91cd-9dda-f9523ad25468, level 77, PIC unknown — fell back to name-suffix heuristic). */
    public String litAlphanumSpacesTo;

    /** LIT-NUM-SPACES-TO (uuid:ec0b4480-4921-4abb-bd21-74faf8f4812e, level 77, PIC unknown — fell back to name-suffix heuristic). */
    public String litNumSpacesTo;

    /** DFHBMSCA (uuid:e40876cb-9bfb-96d7-5d5c-26bd311948e2, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:41be0866-ae2e-ad1c-b240-150c14b137bf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:81877230-dff2-2860-1152-111513a22fb8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:75897b6d-d31c-2a5d-e422-dd65fd4a02f9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:3e5ea560-5043-ac9a-8bdf-dbd4933bb779, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:e98db6e9-c2c8-30e6-f379-cd4e5cb0502f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:8dd7f4a7-344a-7b9f-5348-5b34328508e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:f0e324bd-40f4-749d-2953-b10d67a73fff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:d2a9568e-5a63-ae25-8475-ea80d312af72, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:f03240bd-baf9-4a01-820a-56ed9349cf5a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:8f8bc6e7-9085-c1d8-3190-dbe34d6c184b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:a66db63b-d7b4-df03-5e78-7a96dcb5a596, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:d5c97526-8448-57e7-313d-5ed049c8befe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:c1c60ec3-d806-2df4-5bc6-fc068e13c97e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:3b580ec3-ea8f-7548-a451-c2bd91036fe6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:edd45556-2490-d04e-486a-e71052dd45b8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:2aea4bf2-c1a8-6fdb-bdf6-35381ff75c13, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:43f84fe3-75be-b343-58c2-a4d124abbfa8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:d89da31b-c0ae-cae3-bf70-1e318fe6d753, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:acc8de07-e045-8ee5-ed8d-cb2247ddabdc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:5ce1aecf-4bd9-9a4c-74d7-86119f0e741b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:36866e8d-d5b8-9c4f-dca0-9e2c461dfff5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:49c7433d-c973-143f-4df9-c4187c1922ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:fb1248c4-61c2-7bf4-475d-87f7d3de6598, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:dcec39c2-3b57-4372-8bfa-c9822c9c5fdc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:3dbe8fa3-098e-3945-3526-00949127c33a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:a8933833-eb8d-fefa-af38-dea49f4f4828, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:14d0a05f-ebff-c473-c044-5e5feefc05b6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:30f15205-9846-aded-e591-0a30bc72195e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:23de00e3-7ffd-7209-10aa-c46f21172ab5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;

    /** DFHAID (uuid:166b09f6-d393-e841-4b18-fb6f65f165e3, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:f3edcaa2-7ae0-8004-81c4-c9ebc6e46cdd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:53da486d-7e57-265e-ebc2-8b5cd53de7a4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:fa51241b-936f-96c3-93d0-c70961219762, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:161429b2-71d4-8f92-cc5d-579d28246ed4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:b464c76a-e43e-1cde-b276-8cba94b2c659, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:98063c63-9372-55d8-5ee4-25239cb19cbc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:fd5a8298-5ead-5a89-bb25-86bab1d36363, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:67118f33-27d6-5782-2fe8-e30badbed5e6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:39cbf5cb-e1ba-c18f-1e4b-b92f3d6109c9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:3336c06d-9be2-5b02-ff14-22cd4bbfecc2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:41335a0b-5408-5de6-3511-f57b65df6f53, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:e57fc53b-e4ef-a660-a5d6-2ad1c5e9905a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:27e2ceef-a704-7125-e4a3-903bb7140752, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:57337bb4-447a-2070-1ad3-7a099758208a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:b66f9026-abfe-3900-a9ee-74d918c28013, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:9b7d19e1-07e6-ab74-5e77-561e610ff668, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:6d93d4b5-0c93-2663-23ed-3ccfb79d6a7c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:de6bde97-656d-5da2-0bd5-6df6a56f705c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:3718853d-0c7d-7fab-daf0-712c487728fe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:7cd39c99-d937-2e1e-8bee-6b4452e1cdc2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:14c9697d-c905-13c8-1a33-0093871a78f7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:060a0560-56f4-0992-a7ab-9ba860ad0003, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:ac8b9ef8-641d-978b-d391-af1127019a52, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:d9c05907-ac70-4b8a-f05c-c07fc1c18921, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:6c8500b3-f5ec-9aef-1ab7-5da636a377bb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:4175801a-0802-c0d6-cf2d-bb6701266c25, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:888df9af-ec4d-f2b6-e7b5-8721a4c0b73c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:7a8e215c-e99a-bd0c-4d35-b9fcad16a5e5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:a9803084-62b3-47ab-f362-724ba8b44019, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:3ff3b43d-b7fc-adc5-d063-0d5bd745c5c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:d1251bcc-8bb7-bba0-ce7c-f39a448861a6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:7bd26487-7911-1852-aec8-b8e2f411f11b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:88580081-626d-8a23-1d4c-2a5464d2d6cb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:d9ba60a5-613c-647e-d583-fdb598e27790, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:68b8c522-8931-90f0-d6a4-78e9e0b4a05f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:d5c3e4a3-b1f4-d4c4-4f68-1c237892366e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** CCDA-SCREEN-TITLE (uuid:e910bb11-910a-9ba2-6ec0-ecbfe7e1f694, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:e2653439-e496-75b6-68e9-11dba40475ea, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:07207656-ed5e-37b0-7d4a-c701d8b23454, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:c96b56d4-57f5-0b71-166a-21bf7a18cf65, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** COTRTUP-AREA (uuid:be399b18-8450-4431-cab4-159bb284a396, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cotrtupArea;

    /** COTRTUP-TRAN-TYPE (uuid:ae0cdc88-85f9-c2d6-2800-8f5b33456a2c, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cotrtupTranType;

    /** COTRTUP-TRAN-DESC (uuid:4bee4752-0564-2b2c-6dd8-1d5ddad693a2, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cotrtupTranDesc;

    /** COTRTUP-OP-FLAG (uuid:6b7c8ca0-ce03-e254-1f59-b04efd6bee44, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cotrtupOpFlag;

    /** WS-DATE-TIME (uuid:6e51f888-dd46-4648-4127-6c28f47262d1, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:13f7bd13-ccd1-6766-495f-491d2679d075, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:cd53a4e7-4b99-4129-8052-9ef930eecaf4, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:49991d98-e41b-f271-2b22-ac6499e82d12, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:75f0ce7c-f22e-df93-9cae-d45ccdebb711, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:3bf5a6cb-bb91-a537-b019-c5622b8510d0, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:66b4d426-ae93-e803-cf04-29be8c462219, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:9bcc1f7e-801b-b648-8859-9d4bc44f9271, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:213b7859-0e01-d953-6d75-eb3dbdbc28b3, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:72ae1fb7-c0b5-a27b-08c4-11da6722ad61, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:f9edae54-713a-bde4-c46e-42fa264afb8a, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:d188bd15-5b12-3ad1-0e04-d0a49edde378, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:de5dc84a-13f3-aa67-c1e2-a249fe366929, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:1596f640-8ad9-9a2b-79b4-db2043176f90, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:6dc3f1c6-e822-c4ba-eda5-6088fec87dbd, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:ee2d0bc5-e8fe-6a2c-c585-3b7cf3fe25d6, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:8e55b8a1-0248-815d-f309-486647fed66e, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:ec66c8f1-cae4-34b3-b973-8a270a231dc5, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:ff4f1c45-b419-1c18-844e-6685ff2073ea, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:94ce62f6-3fe0-884f-1556-59e0d95de4aa, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:cc398e96-84eb-4653-17a4-e1ba9534920c, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:d03a3bfc-4a6c-7362-5874-0f3faca8e2cd, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:80e75901-73e8-abe0-45e0-694a956fc824, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:5236199f-e19a-630a-fbfc-40dd5d24585c, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:26e34c92-32af-137b-5267-569f048f42bf, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:9c4e7c4b-4956-62e3-f49d-35e3895dbaef, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:a717b2aa-bff7-9180-f5a7-731bff0940b6, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:278724fc-ae04-bfb7-821f-c9a5335a90c0, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:ad363e6e-5a03-b410-74d5-4c1ad967dace, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:f5dc5864-14b9-f392-48b0-33a8d785a9b9, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:56121248-4ac8-238b-60ab-44e5eec8b603, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:8adb31f6-5a76-5a35-48cb-320c4dc3e814, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** ABEND-DATA (uuid:4c3159ae-3a45-b84f-ba0c-004925355a19, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ abendData;

    /** ABEND-CODE (uuid:285db15e-eda5-4167-e42d-6e0729d707f5, level 5, PIC X(4)). */
    public String abendCode;

    /** ABEND-CULPRIT (uuid:d4e1af79-3e2f-5524-e783-ce1fc955bcf6, level 5, PIC X(8)). */
    public String abendCulprit;

    /** ABEND-REASON (uuid:970e2d8a-0db9-ca61-b28f-2d9093f9bb02, level 5, PIC X(50)). */
    public String abendReason;

    /** ABEND-MSG (uuid:0e5cb87d-2ed5-2688-10ed-e933740de55f, level 5, PIC X(72)). */
    public String abendMsg;

    /** SEC-USER-DATA (uuid:084ccf69-ee92-1066-544c-2bcd07d4b354, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ secUserData;

    /** SEC-USR-ID (uuid:43d680f9-2529-3b28-83ff-1dd41dcf3994, level 5, PIC X(08).). */
    public String secUsrId;

    /** SEC-USR-FNAME (uuid:e5d9606d-f7ba-4b7d-84ac-989690d67c82, level 5, PIC X(20).). */
    public String secUsrFname;

    /** SEC-USR-LNAME (uuid:393916bb-b1b7-1f58-e198-58b1d970205b, level 5, PIC X(20).). */
    public String secUsrLname;

    /** SEC-USR-PWD (uuid:8d880b48-f566-a7bb-611f-3defcd64ed40, level 5, PIC X(08).). */
    public String secUsrPwd;

    /** SEC-USR-TYPE (uuid:ce3cf4b8-0a3c-6984-5e50-c833dd13a1e1, level 5, PIC X(01).). */
    public String secUsrType;

    /** SEC-USR-FILLER (uuid:963a5634-2f46-44f6-d6ef-080968871d2d, level 5, PIC X(23).). */
    public String secUsrFiller;

    /** CARDDEMO-COMMAREA (uuid:207d4b6e-512c-c31f-5737-a6f6a88b6b76, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:0faab4cc-b442-8884-41e8-e50504eb7c04, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:24b0a150-bc9e-15f2-2e05-83cc10625627, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:a73d4090-3363-99bc-6ef2-c6830b5cbf99, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:bf797f26-af6c-5b5b-8064-dc8ebf1d4927, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:c81593eb-990f-1e10-54d5-bbb621bff26e, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:e2d0a465-a9d0-492b-2a79-215760ed9219, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:c82f77ce-5605-6864-b72d-53fef7754035, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:3a3ffcca-7f47-671c-0142-4cd833d3f7d2, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:c06a9569-99c3-0a16-084c-bcd9dae74b86, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:4166504a-1773-b6c6-40be-2e0eed842d5a, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:d4ff3619-6e86-e998-b9b0-d19dd05576df, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:b6d803ec-bf5f-8684-dca5-b504baf9ca61, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:1c0156b1-5a18-a3d1-e112-50c98c973b4e, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:98b8fdb0-a597-4d89-5560-1e258584e771, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:398c4045-b816-cb74-339a-b8b1f8be565b, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:d487f827-1048-28ae-5bc6-c9dca55a7b75, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:214a09e8-c066-9e66-a6e7-48da6d3cd363, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:74d0fb92-8f1c-e1cf-372c-569ee9492707, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:1663b3ce-6ae3-74a0-b784-dfcb1a85b33e, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:6eea5331-540d-4ecb-3324-18a91f99d73e, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:9716ca31-517a-9bdd-6722-52f2990b00d4, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** WS-THIS-PROGCOMMAREA (uuid:27d00696-3ec4-e521-17c3-3720dde87dde, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsThisProgcommarea;

    /** TTUP-UPDATE-SCREEN-DATA (uuid:8b08e473-6e9d-4414-3540-a4387b7b37f0, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttupUpdateScreenData;

    /** TTUP-CHANGE-ACTION (uuid:b3096aa8-fc10-9b1a-91c3-a5821bcff27e, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttupChangeAction;

    /** TTUP-OLD-DETAILS (uuid:e1257a8d-6cc3-d1a7-9b14-0b9fde12b13d, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttupOldDetails;

    /** TTUP-OLD-TTYP-DATA (uuid:744d282b-7db6-6d6b-e92d-941be773bcc2, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttupOldTtypData;

    /** TTUP-OLD-TTYP-TYPE (uuid:00370c20-37db-9507-6aed-5afc644b91f7, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttupOldTtypType;

    /** TTUP-OLD-TTYP-TYPE-DESC (uuid:bd265fec-370d-797f-bd6d-35914cda901a, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttupOldTtypTypeDesc;

    /** TTUP-NEW-DETAILS (uuid:9ed6b8d2-8667-4f6b-9ec2-8cabea617b5d, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttupNewDetails;

    /** TTUP-NEW-TTYP-DATA (uuid:a88c3a7e-005b-5737-73df-87ad3fc0fd70, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttupNewTtypData;

    /** TTUP-NEW-TTYP-TYPE (uuid:93f31065-c933-7fa6-3e7f-313bc4339a48, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttupNewTtypType;

    /** TTUP-NEW-TTYP-TYPE-DESC (uuid:4866a4c7-80dd-3736-41b3-a6d52602d493, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ttupNewTtypTypeDesc;

    /** WS-COMMAREA (uuid:5d179afb-5a08-1dd5-edd1-4269f220f627, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCommarea;


    // --- auto-generated stubs for undeclared references ---
    public Object ctrtupao;  // auto-stub for undeclared reference
    public Object trtypcdo;  // auto-stub for undeclared reference

    /** 0000-MAIN  (uuid:968939ed-32ae-837c-caf2-7137ded8a63b, source lines 781-993). */
    public void p0000Main() {
        // INITIALIZE ccWorkArea wsMiscStorage wsCommarea: reset to PIC defaults
        this.ccWorkArea = null;  // TODO: set to type-appropriate zero/spaces
        this.wsMiscStorage = null;  // TODO: set to type-appropriate zero/spaces
        this.wsCommarea = null;  // TODO: set to type-appropriate zero/spaces
        // MOVE LIT-THISTRANID TO WS-TRANID  -- identifier MOVE; needs PIC-aware type coercion
        // SET WS-RETURN-MSG-OFF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (((true /* TODO translate: EIBCALEN IS EQUAL TO 0 */) || (java.util.Objects.equals(this.(cdemoFromProgram, this.litAdminpgm))) && ((true /* TODO translate: NOT CDEMO-PGM-REENTER) */) || (java.util.Objects.equals(this.(cdemoFromProgram, this.litListtpgm))) && (true /* TODO translate: NOT CDEMO-PGM-REENTER) */)) {
            // TODO: translate body for: EIBCALEN IS EQUAL TO 0 OR (CDEMO-FROM-PROGRAM = LIT-ADMINPGM AND NOT CDEMO-PGM-REENTER) OR (CDEMO-FROM-PROGRAM = LIT-LISTTPGM AND NOT CDEMO-PGM-REENTER)
        }
        this.yyyyStorePfkey();  // PERFORM
        // SET PFK-INVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [PERFORM]: PERFORM 0001-CHECK-PFKEYS THRU 0001-CHECK-PFKEYS-EXIT
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        // EVALUATE TRUE *> ***************************************************************** *> USER PRESSES PF03 TO EXIT *> OR USER IS DONE WITH UPDATE *> XCTL TO CALLING PROGRAM OR MAIN MENU *> *****************************************************************
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if ((true /* TODO translate: TRUE *> ***************************************************************** *> USER PRESSES PF03 TO EXIT *> */) || (true /* TODO translate: USER IS DONE WITH UPDATE *> XCTL TO CALLING PROGRAM */) || (true /* TODO translate: MAIN MENU *> ***************************************************************** */)) { /* WHEN branches follow */ }
    }

    /** COMMON-RETURN  (uuid:6b64f1d8-26a2-b223-1a79-dbc7b7ba3f1a, source lines 995-1008). */
    public void commonReturn() {
        // MOVE WS-RETURN-MSG TO CCARD-ERROR-MSG  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CARDDEMO-COMMAREA TO WS-COMMAREA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-THIS-PROGCOMMAREA TO WS-COMMAREA(LENGTH OF CARDDEMO-COMMAREA, LENGTH OF WS-THIS-PROGCOMMAREA  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 0000-MAIN-EXIT  (uuid:3a49cd74-7e56-155d-a0fe-a7561f71556d, source lines 1009-1011). */
    public void p0000MainExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 0001-CHECK-PFKEYS  (uuid:853b3684-f569-5a14-ee20-b441a08d978b, source lines 1013-1054). */
    public void p0001CheckPfkeys() {
        if (((true /* TODO translate: (CCARD-AID-PFK03) */) || (true /* TODO translate: (CCARD-AID-ENTER */)) && ((true /* TODO translate: NOT TTUP-CONFIRM-DELETE) */) || (true /* TODO translate: (CCARD-AID-PFK04 */)) && ((true /* TODO translate: (TTUP-SHOW-DETAILS */) || (true /* TODO translate: TTUP-CONFIRM-DELETE ) ) */) || (true /* TODO translate: (CCARD-AID-PFK05 */)) && ((true /* TODO translate: ( TTUP-CHANGES-OK-NOT-CONFIRMED */) || (true /* TODO translate: TTUP-DETAILS-NOT-FOUND */) || (true /* TODO translate: TTUP-DELETE-IN-PROGRESS ) ) */) || (true /* TODO translate: (CCARD-AID-PFK12 */)) && ((true /* TODO translate: ( TTUP-CHANGES-OK-NOT-CONFIRMED */) || (true /* TODO translate: TTUP-SHOW-DETAILS */) || (true /* TODO translate: TTUP-DETAILS-NOT-FOUND */) || (true /* TODO translate: TTUP-CONFIRM-DELETE */) || (true /* TODO translate: TTUP-CREATE-NEW-RECORD ) ) */))) {
            // TODO: translate body for: (CCARD-AID-PFK03) OR (CCARD-AID-ENTER AND NOT TTUP-CONFIRM-DELETE) OR (CCARD-AID-PFK04 AND (TTUP-SHOW-DETAILS OR TTUP-CONFIRM-DELETE ) ) OR (CCARD-AID-PFK05 AND ( TTUP-CHANGES-OK-NOT-CONFIRMED OR TTUP-DETAILS-NOT-FOUND OR TTUP-DELETE-IN-PROGRESS ) ) OR (CCARD-AID-PFK12 AND ( TTUP-CHANGES-OK-NOT-CONFIRMED OR TTUP-SHOW-DETAILS OR TTUP-DETAILS-NOT-FOUND OR TTUP-CONFIRM-DELETE OR TTUP-CREATE-NEW-RECORD ) )
        }
    }

    /** 0001-CHECK-PFKEYS-EXIT  (uuid:99d06f08-7fe7-8275-ec66-f1601d3239dd, source lines 1057-1059). */
    public void p0001CheckPfkeysExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1000-PROCESS-INPUTS  (uuid:1cce2af4-7d69-c26b-cd30-d18489c1df05, source lines 1061-1072). */
    public void p1000ProcessInputs() {
        // COBOL [PERFORM]: PERFORM 1100-RECEIVE-MAP THRU 1100-RECEIVE-MAP-EXIT
        // COBOL [PERFORM]: PERFORM 1150-STORE-MAP-IN-NEW THRU 1150-STORE-MAP-IN-NEW-EXIT
        // COBOL [PERFORM]: PERFORM 1200-EDIT-MAP-INPUTS THRU 1200-EDIT-MAP-INPUTS-EXIT
        // MOVE WS-RETURN-MSG TO CCARD-ERROR-MSG  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISPGM TO CCARD-NEXT-PROG  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISMAPSET TO CCARD-NEXT-MAPSET  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISMAP TO CCARD-NEXT-MAP  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 1000-PROCESS-INPUTS-EXIT  (uuid:c9384e21-e7ef-b85b-167b-8897ce4eacbe, source lines 1074-1076). */
    public void p1000ProcessInputsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1100-RECEIVE-MAP  (uuid:c19ffb63-e038-b025-762d-6f9dd935e3e5, source lines 1077-1084). */
    public void p1100ReceiveMap() {
        // TODO: implement p1100ReceiveMap.  See uuid:c19ffb63-e038-b025-762d-6f9dd935e3e5
    }

    /** 1100-RECEIVE-MAP-EXIT  (uuid:1adb262f-3c8c-1e9c-9bfd-36d335dd7c1d, source lines 1085-1086). */
    public void p1100ReceiveMapExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1150-STORE-MAP-IN-NEW  (uuid:6e16b1bf-3e1b-65cd-a1e6-0e8eaa5840b3, source lines 1088-1121). */
    public void p1150StoreMapInNew() {
        if ((true /* TODO translate: TTUP-DETAILS-NOT-FOUND */) && (true /* TODO translate: NOT CCARD-AID-PFK05 */) && (true /* TODO translate: FUNCTION TRIM(TRTYPCDI OF CTRTUPAI) = TTUP-NEW-TTYP-TYPE */)) {
            // TODO: translate body for: TTUP-DETAILS-NOT-FOUND AND NOT CCARD-AID-PFK05 AND FUNCTION TRIM(TRTYPCDI OF CTRTUPAI) = TTUP-NEW-TTYP-TYPE
        }
        // INITIALIZE ttupNewDetails: reset to PIC defaults
        this.ttupNewDetails = null;  // TODO: set to type-appropriate zero/spaces
        if ((true /* TODO translate: TRTYPCDI OF CTRTUPAI = '*' */) || (true /* TODO translate: TRTYPCDI OF CTRTUPAI = SPACES */)) {
            // TODO: translate body for: TRTYPCDI OF CTRTUPAI = '*' OR TRTYPCDI OF CTRTUPAI = SPACES
        }
        if ((true /* TODO translate: TRTYDSCI OF CTRTUPAI = '*' */) || (true /* TODO translate: TRTYDSCI OF CTRTUPAI = SPACES */)) {
            // TODO: translate body for: TRTYDSCI OF CTRTUPAI = '*' OR TRTYDSCI OF CTRTUPAI = SPACES
        }
    }

    /** 1150-STORE-MAP-IN-NEW-EXIT  (uuid:767b453f-5b55-068e-c7eb-0c0466bfc5c2, source lines 1122-1124). */
    public void p1150StoreMapInNewExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1200-EDIT-MAP-INPUTS  (uuid:d8aa82fb-dc2a-9c6b-6732-6deba7927817, source lines 1125-1213). */
    public void p1200EditMapInputs() {
        // SET INPUT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if ((true /* TODO translate: TTUP-DETAILS-NOT-FOUND */) && (true /* TODO translate: FUNCTION TRIM(TRTYPCDI OF CTRTUPAI) = TTUP-NEW-TTYP-TYPE */)) {
            // TODO: translate body for: TTUP-DETAILS-NOT-FOUND AND FUNCTION TRIM(TRTYPCDI OF CTRTUPAI) = TTUP-NEW-TTYP-TYPE
        }
        if ((true /* TODO translate: TTUP-CREATE-NEW-RECORD */) || (true /* TODO translate: TTUP-CHANGES-OK-NOT-CONFIRMED */)) {
            // TODO: translate body for: TTUP-CREATE-NEW-RECORD OR TTUP-CHANGES-OK-NOT-CONFIRMED
        }
        // SET FLG-TRANFILTER-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [PERFORM]: PERFORM 1205-COMPARE-OLD-NEW THRU 1205-COMPARE-OLD-NEW-EXIT
        if ((true /* TODO translate: NO-CHANGES-FOUND */) || (true /* TODO translate: TTUP-CHANGES-OK-NOT-CONFIRMED */) || (true /* TODO translate: TTUP-CHANGES-OKAYED-AND-DONE */)) {
            // TODO: translate body for: NO-CHANGES-FOUND OR TTUP-CHANGES-OK-NOT-CONFIRMED OR TTUP-CHANGES-OKAYED-AND-DONE
        }
        // SET TTUP-CHANGES-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsEditVariableName = "Transaction Desc";
        // MOVE TTUP-NEW-TTYP-TYPE-DESC TO WS-EDIT-ALPHANUM-ONLY  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditAlphanumLength = 50;
        // COBOL [PERFORM]: PERFORM 1230-EDIT-ALPHANUM-REQD THRU 1230-EDIT-ALPHANUM-REQD-EXIT
        // MOVE WS-EDIT-ALPHANUM-ONLY-FLAGS TO WS-EDIT-DESC-FLAGS  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: INPUT-ERROR */) {
            // TODO: translate body for: INPUT-ERROR
        }
    }

    /** 1200-EDIT-MAP-INPUTS-EXIT  (uuid:218b1737-06c2-1889-c826-632aa7e12fca, source lines 1215-1217). */
    public void p1200EditMapInputsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1205-COMPARE-OLD-NEW  (uuid:43027db1-cfda-b245-0845-048f8c381aa1, source lines 1219-1248). */
    public void p1205CompareOldNew() {
        // SET NO-CHANGES-FOUND TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if ((true /* TODO translate: FUNCTION UPPER-CASE ( TTUP-NEW-TTYP-TYPE) = FUNCTION UPPER-CASE ( TTUP-OLD-TTYP-TYPE) */) && (true /* TODO translate: FUNCTION UPPER-CASE ( FUNCTION TRIM (TTUP-NEW-TTYP-TYPE-DESC))= FUNCTION UPPER-CASE ( FUNCTION TRIM (TTUP-OLD-TTYP-TYPE-DESC)) */) && (true /* TODO translate: FUNCTION LENGTH ( FUNCTION TRIM (TTUP-NEW-TTYP-TYPE-DESC))= FUNCTION LENGTH ( FUNCTION TRIM (TTUP-OLD-TTYP-TYPE-DESC)) */)) {
            // TODO: translate body for: FUNCTION UPPER-CASE ( TTUP-NEW-TTYP-TYPE) = FUNCTION UPPER-CASE ( TTUP-OLD-TTYP-TYPE) AND FUNCTION UPPER-CASE ( FUNCTION TRIM (TTUP-NEW-TTYP-TYPE-DESC))= FUNCTION UPPER-CASE ( FUNCTION TRIM (TTUP-OLD-TTYP-TYPE-DESC)) AND FUNCTION LENGTH ( FUNCTION TRIM (TTUP-NEW-TTYP-TYPE-DESC))= FUNCTION LENGTH ( FUNCTION TRIM (TTUP-OLD-TTYP-TYPE-DESC))
        }
    }

    /** 1205-COMPARE-OLD-NEW-EXIT  (uuid:105c2e20-bae4-4219-a958-a50bfc314025, source lines 1250-1252). */
    public void p1205CompareOldNewExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1210-EDIT-TRANTYPE  (uuid:9b84c0f1-3589-c54c-4d60-67d981e5594f, source lines 1256-1279). */
    public void p1210EditTrantype() {
        // SET FLG-TRANFILTER-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsEditVariableName = "Tran Type code";
        // MOVE TTUP-NEW-TTYP-TYPE TO WS-EDIT-ALPHANUM-ONLY  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditAlphanumLength = 2;
        // COBOL [PERFORM]: PERFORM 1245-EDIT-NUM-REQD THRU 1245-EDIT-NUM-REQD-EXIT
        // MOVE WS-EDIT-ALPHANUM-ONLY-FLAGS TO WS-EDIT-TTYP-FLAG  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: FLG-TRANFILTER-ISVALID */) {
            // TODO: translate body for: FLG-TRANFILTER-ISVALID
        }
    }

    /** 1210-EDIT-TRANTYPE-EXIT  (uuid:d0fb100c-6f04-49c0-663e-60e2aa386311, source lines 1281-1283). */
    public void p1210EditTrantypeExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1230-EDIT-ALPHANUM-REQD  (uuid:f4ed2628-a2a1-b134-1cf9-edae6382ed07, source lines 1285-1338). */
    public void p1230EditAlphanumReqd() {
        // SET FLG-ALPHNANUM-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.wsEditAlphanumOnly(1:wsEditAlphanumLength), "\u0000")) {
            // TODO: translate body for: WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) EQUAL LOW-VALUES OR WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) EQUAL SPACES OR FUNCTION LENGTH(FUNCTION TRIM( WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH))) = 0
        }
        // MOVE LIT-ALL-ALPHANUM-FROM-X TO LIT-ALL-ALPHANUM-FROM  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [INSPECT]: INSPECT WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) CONVERTING LIT-ALL-ALPHANUM-FROM TO LIT-ALPHANUM-SPACES-TO
        if (true /* TODO translate: FUNCTION LENGTH( FUNCTION TRIM( WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) )) = 0 */) {
            // TODO: translate body for: FUNCTION LENGTH( FUNCTION TRIM( WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) )) = 0
        }
        // SET FLG-ALPHNANUM-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** 1230-EDIT-ALPHANUM-REQD-EXIT  (uuid:ffdd3d47-fc32-3785-f37a-dd5f7bb5561c, source lines 1339-1341). */
    public void p1230EditAlphanumReqdExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1245-EDIT-NUM-REQD  (uuid:6f3ea31c-a448-d7cf-7ce1-432df0e351d2, source lines 1343-1409). */
    public void p1245EditNumReqd() {
        // SET FLG-ALPHNANUM-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.wsEditAlphanumOnly(1:wsEditAlphanumLength), "\u0000")) {
            // TODO: translate body for: WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) EQUAL LOW-VALUES OR WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) EQUAL SPACES OR FUNCTION LENGTH(FUNCTION TRIM( WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH))) = 0
        }
        if (true /* TODO translate: FUNCTION TEST-NUMVAL(WS-EDIT-ALPHANUM-ONLY(1: WS-EDIT-ALPHANUM-LENGTH)) = 0 */) {
            // TODO: translate body for: FUNCTION TEST-NUMVAL(WS-EDIT-ALPHANUM-ONLY(1: WS-EDIT-ALPHANUM-LENGTH)) = 0
        }
        if (true /* TODO translate: FUNCTION NUMVAL(WS-EDIT-ALPHANUM-ONLY(1: WS-EDIT-ALPHANUM-LENGTH)) = 0 */) {
            // TODO: translate body for: FUNCTION NUMVAL(WS-EDIT-ALPHANUM-ONLY(1: WS-EDIT-ALPHANUM-LENGTH)) = 0
        }
        // SET FLG-ALPHNANUM-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** 1245-EDIT-NUM-REQD-EXIT  (uuid:d97d6ee2-cb43-c33a-b071-dd3dbb8ba09e, source lines 1410-1412). */
    public void p1245EditNumReqdExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2000-DECIDE-ACTION  (uuid:ef6430ad-a0ab-3d2f-968b-1a7d168eee1b, source lines 1414-1518). */
    public void p2000DecideAction() {
        // EVALUATE TRUE *> ***************************************************************** *> NO DETAILS SHOWN. *> SO GET THEM AND SETUP DETAIL EDIT SCREEN *> *****************************************************************
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if ((true /* TODO translate: TRUE *> ***************************************************************** *> NO DETAILS SHOWN. *> SO GET THEM */) && (true /* TODO translate: SETUP DETAIL EDIT SCREEN *> ***************************************************************** */)) { /* WHEN branches follow */ }
    }

    /** 2000-DECIDE-ACTION-EXIT  (uuid:52a2d4a7-514e-bb95-ced1-a40fff860216, source lines 1519-1521). */
    public void p2000DecideActionExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3000-SEND-MAP  (uuid:68481ec3-a9bd-ff2e-7ca1-b6dc0ca67016, source lines 1525-1540). */
    public void p3000SendMap() {
        // COBOL [PERFORM]: PERFORM 3100-SCREEN-INIT THRU 3100-SCREEN-INIT-EXIT
        // COBOL [PERFORM]: PERFORM 3200-SETUP-SCREEN-VARS THRU 3200-SETUP-SCREEN-VARS-EXIT
        // COBOL [PERFORM]: PERFORM 3250-SETUP-INFOMSG THRU 3250-SETUP-INFOMSG-EXIT
        // COBOL [PERFORM]: PERFORM 3300-SETUP-SCREEN-ATTRS THRU 3300-SETUP-SCREEN-ATTRS-EXIT
        // COBOL [PERFORM]: PERFORM 3390-SETUP-INFOMSG-ATTRS THRU 3390-SETUP-INFOMSG-ATTRS-EXIT
        // COBOL [PERFORM]: PERFORM 3391-SETUP-PFKEY-ATTRS THRU 3391-SETUP-PFKEY-ATTRS-EXIT
        // COBOL [PERFORM]: PERFORM 3400-SEND-SCREEN THRU 3400-SEND-SCREEN-EXIT
    }

    /** 3000-SEND-MAP-EXIT  (uuid:6edeed90-b431-1900-4572-46a5b47c5689, source lines 1542-1544). */
    public void p3000SendMapExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3100-SCREEN-INIT  (uuid:e194b003-dd02-b452-4f9a-8f0332e12e1a, source lines 1546-1570). */
    public void p3100ScreenInit() {
        this.ctrtupao = "\u0000";
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF CTRTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF CTRTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISTRANID TO TRNNAMEO OF CTRTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISPGM TO PGMNAMEO OF CTRTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF CTRTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF CTRTUPAO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 3100-SCREEN-INIT-EXIT  (uuid:58b3619c-b9bf-07cd-7595-6eb9fa5625d9, source lines 1572-1574). */
    public void p3100ScreenInitExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3200-SETUP-SCREEN-VARS  (uuid:2365e7f8-4bad-83b5-32de-9b03cb58b9ad, source lines 1576-1607). */
    public void p3200SetupScreenVars() {
        if (true /* TODO translate: CDEMO-PGM-ENTER */) {
            // TODO: translate body for: CDEMO-PGM-ENTER
        }
    }

    /** 3200-SETUP-SCREEN-VARS-EXIT  (uuid:da18a9c9-a445-73bd-28c7-e620b62510d0, source lines 1608-1610). */
    public void p3200SetupScreenVarsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3201-SHOW-INITIAL-VALUES  (uuid:8ee0e8d7-5a8a-4c12-5e41-e392d94ae991, source lines 1612-1615). */
    public void p3201ShowInitialValues() {
        this.trtypcdo = "\u0000";
        this.trtypcdo = "\u0000";
    }

    /** 3201-SHOW-INITIAL-VALUES-EXIT  (uuid:396844cc-8628-17cc-c730-a3f7ac152efb, source lines 1617-1619). */
    public void p3201ShowInitialValuesExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3202-SHOW-ORIGINAL-VALUES  (uuid:28c9ba88-0501-e0e7-5cec-19afada724b2, source lines 1621-1628). */
    public void p3202ShowOriginalValues() {
        this.wsNonKeyFlags = "\u0000";
        // MOVE TTUP-OLD-TTYP-TYPE TO TRTYPCDO OF CTRTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TTUP-OLD-TTYP-TYPE-DESC TO TRTYDSCO OF CTRTUPAO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 3202-SHOW-ORIGINAL-VALUES-EXIT  (uuid:b70f77b4-7cee-76c2-1f9f-3dcc57f9e2c5, source lines 1630-1632). */
    public void p3202ShowOriginalValuesExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3203-SHOW-UPDATED-VALUES  (uuid:ebec7fb7-6545-c8a6-3746-bcf909edb832, source lines 1633-1637). */
    public void p3203ShowUpdatedValues() {
        // MOVE TTUP-NEW-TTYP-TYPE TO TRTYPCDO OF CTRTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE TTUP-NEW-TTYP-TYPE-DESC TO TRTYDSCO OF CTRTUPAO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 3203-SHOW-UPDATED-VALUES-EXIT  (uuid:a30a241e-11cb-6de9-28ed-898e8d3a695f, source lines 1639-1641). */
    public void p3203ShowUpdatedValuesExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3250-SETUP-INFOMSG  (uuid:4ce57257-2c0c-3a38-d28c-8f563df13954, source lines 1646-1701). */
    public void p3250SetupInfomsg() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        // COMPUTE (needs PIC-aware expression translation): COMPUTE WS-STRING-LEN = FUNCTION LENGTH( FUNCTION TRIM(WS-INFO-MSG) );
        // COMPUTE (needs PIC-aware expression translation): COMPUTE WS-STRING-MID = (FUNCTION LENGTH(WS-INFO-MSG) - WS-STRING-LEN) / 2 + 1;
        // MOVE WS-INFO-MSG(1:WS-STRING-LEN) TO WS-STRING-OUT(WS-STRING-MID:, WS-STRING-LEN)  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-STRING-OUT TO INFOMSGO OF CTRTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-RETURN-MSG TO ERRMSGO OF CTRTUPAO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 3250-SETUP-INFOMSG-EXIT  (uuid:e3230444-5175-41ea-edca-01b262026085, source lines 1702-1704). */
    public void p3250SetupInfomsgExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3300-SETUP-SCREEN-ATTRS  (uuid:9ed75c3c-0c38-2f12-7552-fe0df94fe38d, source lines 1705-1826). */
    public void p3300SetupScreenAttrs() {
        // COBOL [PERFORM]: PERFORM 3310-PROTECT-ALL-ATTRS THRU 3310-PROTECT-ALL-ATTRS-EXIT
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        if ((true /* TODO translate: FLG-TRANFILTER-NOT-OK */) || (true /* TODO translate: TTUP-DELETE-FAILED */)) {
            // TODO: translate body for: FLG-TRANFILTER-NOT-OK OR TTUP-DELETE-FAILED
        }
        if ((true /* TODO translate: FLG-TRANFILTER-BLANK */) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: FLG-TRANFILTER-BLANK AND CDEMO-PGM-REENTER
        }
        if ((true /* TODO translate: TTUP-DETAILS-NOT-FETCHED */) || (true /* TODO translate: TTUP-DETAILS-NOT-FOUND */) || (true /* TODO translate: TTUP-INVALID-SEARCH-KEYS */) || (true /* TODO translate: FLG-TRANFILTER-BLANK */) || (true /* TODO translate: FLG-TRANFILTER-NOT-OK */)) {
            // TODO: translate body for: TTUP-DETAILS-NOT-FETCHED OR TTUP-DETAILS-NOT-FOUND OR TTUP-INVALID-SEARCH-KEYS OR FLG-TRANFILTER-BLANK OR FLG-TRANFILTER-NOT-OK
        }
        if (((true /* TODO translate: (FLG-DESCRIPTION-NOT-OK */) || (true /* TODO translate: FLG-DESCRIPTION-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-DESCRIPTION-NOT-OK OR FLG-DESCRIPTION-BLANK) AND CDEMO-PGM-REENTER
        }
    }

    /** 3300-SETUP-SCREEN-ATTRS-EXIT  (uuid:508cd30b-89b4-891a-6fda-43711053d962, source lines 1827-1829). */
    public void p3300SetupScreenAttrsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3310-PROTECT-ALL-ATTRS  (uuid:6205efc3-330a-5bef-0e2d-d854fb63b088, source lines 1831-1835). */
    public void p3310ProtectAllAttrs() {
        // MOVE DFHBMPRF TO TRTYPCDA OF CTRTUPAI, TRTYDSCA OF CTRTUPAI, INFOMSGA OF CTRTUPAI  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 3310-PROTECT-ALL-ATTRS-EXIT  (uuid:9ae9f943-aa19-7b91-029a-060f69fd2e3d, source lines 1836-1838). */
    public void p3310ProtectAllAttrsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3320-UNPROTECT-FEW-ATTRS  (uuid:d08eb4fd-7813-b6cf-bf9f-0bb196c69f8d, source lines 1840-1844). */
    public void p3320UnprotectFewAttrs() {
        // MOVE DFHBMFSE TO TRTYDSCA OF CTRTUPAI  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE DFHBMPRF TO INFOMSGA OF CTRTUPAI  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 3320-UNPROTECT-FEW-ATTRS-EXIT  (uuid:c895ca77-e939-61b1-bc64-e9bfa40b46fd, source lines 1845-1847). */
    public void p3320UnprotectFewAttrsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3390-SETUP-INFOMSG-ATTRS  (uuid:31c916f1-e276-b8f1-f59d-4ca277cc1c34, source lines 1849-1855). */
    public void p3390SetupInfomsgAttrs() {
        if (true /* TODO translate: WS-NO-INFO-MESSAGE */) {
            // TODO: translate body for: WS-NO-INFO-MESSAGE
        }
    }

    /** 3390-SETUP-INFOMSG-ATTRS-EXIT  (uuid:75693a55-bf02-c0fb-c12a-5a535407e1c5, source lines 1856-1858). */
    public void p3390SetupInfomsgAttrsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3391-SETUP-PFKEY-ATTRS  (uuid:ff9f1fd9-713a-e4c8-9c05-5ca27dc71855, source lines 1860-1886). */
    public void p3391SetupPfkeyAttrs() {
        if (true /* TODO translate: TTUP-CONFIRM-DELETE */) {
            // TODO: translate body for: TTUP-CONFIRM-DELETE
        }
        if ((true /* TODO translate: TTUP-SHOW-DETAILS */) || (true /* TODO translate: TTUP-CONFIRM-DELETE */)) {
            // TODO: translate body for: TTUP-SHOW-DETAILS OR TTUP-CONFIRM-DELETE
        }
        if ((true /* TODO translate: TTUP-CHANGES-OK-NOT-CONFIRMED */) || (true /* TODO translate: TTUP-DETAILS-NOT-FOUND */)) {
            // TODO: translate body for: TTUP-CHANGES-OK-NOT-CONFIRMED OR TTUP-DETAILS-NOT-FOUND
        }
        if ((true /* TODO translate: TTUP-CHANGES-OK-NOT-CONFIRMED */) || (true /* TODO translate: TTUP-SHOW-DETAILS */) || (true /* TODO translate: TTUP-DETAILS-NOT-FOUND */) || (true /* TODO translate: TTUP-CONFIRM-DELETE */) || (true /* TODO translate: TTUP-CREATE-NEW-RECORD */)) {
            // TODO: translate body for: TTUP-CHANGES-OK-NOT-CONFIRMED OR TTUP-SHOW-DETAILS OR TTUP-DETAILS-NOT-FOUND OR TTUP-CONFIRM-DELETE OR TTUP-CREATE-NEW-RECORD
        }
    }

    /** 3391-SETUP-PFKEY-ATTRS-EXIT  (uuid:69a6b3ce-6cf5-1a0c-cc92-b45619307391, source lines 1887-1889). */
    public void p3391SetupPfkeyAttrsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3400-SEND-SCREEN  (uuid:676a6132-fc15-fdad-6a29-56950ed8dc51, source lines 1891-1904). */
    public void p3400SendScreen() {
        // MOVE LIT-THISMAPSET TO CCARD-NEXT-MAPSET  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISMAP TO CCARD-NEXT-MAP  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 3400-SEND-SCREEN-EXIT  (uuid:5cad71b6-abd8-f074-9c0e-4211c29cc7a4, source lines 1905-1907). */
    public void p3400SendScreenExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9000-READ-TRANTYPE  (uuid:57ff811d-e6d6-ff40-e776-5542cf93d4f4, source lines 1910-1926). */
    public void p9000ReadTrantype() {
        // INITIALIZE ttupOldDetails: reset to PIC defaults
        this.ttupOldDetails = null;  // TODO: set to type-appropriate zero/spaces
        // SET WS-NO-INFO-MESSAGE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [PERFORM]: PERFORM 9100-GET-TRANSACTION-TYPE THRU 9100-GET-TRANSACTION-TYPE-EXIT
        if (true /* TODO translate: FLG-TRANFILTER-NOT-OK */) {
            // TODO: translate body for: FLG-TRANFILTER-NOT-OK
        }
        // COBOL [PERFORM]: PERFORM 9500-STORE-FETCHED-DATA THRU 9500-STORE-FETCHED-DATA-EXIT
    }

    /** 9000-READ-TRANTYPE-EXIT  (uuid:994df869-dcdd-63f3-2d2b-5551018bf60a, source lines 1929-1931). */
    public void p9000ReadTrantypeExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9100-GET-TRANSACTION-TYPE  (uuid:5d8a4389-7297-9d33-acc5-3ad1d4fcbc7f, source lines 1932-1974). */
    public void p9100GetTransactionType() {
        // MOVE TTUP-NEW-TTYP-TYPE TO DCL-TR-TYPE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE SQLCODE TO WS-DISP-SQLCODE  -- identifier MOVE; needs PIC-aware type coercion
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        // COBOL [EXIT]: EXIT
    }

    /** 9100-GET-TRANSACTION-TYPE-EXIT  (uuid:897c7b26-9fd3-0190-1995-7f9ec26b1259, source lines 1975-1977). */
    public void p9100GetTransactionTypeExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9500-STORE-FETCHED-DATA  (uuid:0b3d232b-e5a1-ae0c-0d40-423b13956c3b, source lines 1980-1990). */
    public void p9500StoreFetchedData() {
        // INITIALIZE ttupOldDetails: reset to PIC defaults
        this.ttupOldDetails = null;  // TODO: set to type-appropriate zero/spaces
        // MOVE DCL-TR-TYPE TO TTUP-OLD-TTYP-TYPE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE DCL-TR-DESCRIPTION-TEXT(1: TO TTUP-OLD-TTYP-TYPE-DESC  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 9500-STORE-FETCHED-DATA-EXIT  (uuid:66333074-5597-7c96-cce6-3e955913d134, source lines 1991-1993). */
    public void p9500StoreFetchedDataExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9600-WRITE-PROCESSING  (uuid:62bd806b-4da2-2597-c984-4acac9de2f9b, source lines 1994-2055). */
    public void p9600WriteProcessing() {
        // MOVE TTUP-NEW-TTYP-TYPE TO DCL-TR-TYPE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE FUNCTION TO DCL-TR-DESCRIPTION-TEXT  -- identifier MOVE; needs PIC-aware type coercion
        // COMPUTE (needs PIC-aware expression translation): COMPUTE DCL-TR-DESCRIPTION-LEN = FUNCTION LENGTH(TTUP-NEW-TTYP-TYPE-DESC);
        // MOVE SQLCODE TO WS-DISP-SQLCODE  -- identifier MOVE; needs PIC-aware type coercion
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        // COBOL [EXIT]: EXIT
    }

    /** 9600-WRITE-PROCESSING-EXIT  (uuid:acb75de0-a7e2-9bae-ffd3-ccabed906ec6, source lines 2056-2058). */
    public void p9600WriteProcessingExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9700-INSERT-RECORD  (uuid:e5b142fd-cdf9-748d-9293-d56e53207d52, source lines 2059-2083). */
    public void p9700InsertRecord() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
    }

    /** 9700-INSERT-RECORD-EXIT  (uuid:cd5cac4e-b85a-b1e4-ec1e-1cd785ab1dd4, source lines 2084-2086). */
    public void p9700InsertRecordExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9800-DELETE-PROCESSING  (uuid:bf32e751-beec-2f43-e92f-1ca882724fb1, source lines 2087-2126). */
    public void p9800DeleteProcessing() {
        // MOVE TTUP-OLD-TTYP-TYPE TO DCL-TR-TYPE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE SQLCODE TO WS-DISP-SQLCODE  -- identifier MOVE; needs PIC-aware type coercion
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
    }

    /** 9800-DELETE-PROCESSING-EXIT  (uuid:c1caa71b-e640-66d7-89b7-94737002693c, source lines 2127-2129). */
    public void p9800DeleteProcessingExit() {
        // COBOL [EXIT]: EXIT
    }

    /** YYYY-STORE-PFKEY  (uuid:fd034caf-93f2-cecd-176d-79addb8223db, source lines 2150-2212). */
    public void yyyyStorePfkey() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
    }

    /** YYYY-STORE-PFKEY-EXIT  (uuid:755ae5b3-8125-02a1-c2d5-9b0b11c9e89d, source lines 2213-2215). */
    public void yyyyStorePfkeyExit() {
        // COBOL [EXIT]: EXIT
    }

    /** ABEND-ROUTINE  (uuid:81ab1b02-9660-208e-66cd-6b6a860937ae, source lines 2222-2245). */
    public void abendRoutine() {
        if (java.util.Objects.equals(this.abendMsg, "\u0000")) {
            // TODO: translate body for: ABEND-MSG EQUAL LOW-VALUES
        }
        // MOVE LIT-THISPGM TO ABEND-CULPRIT  -- identifier MOVE; needs PIC-aware type coercion
        this.abendCode = "9999";
    }

    /** ABEND-ROUTINE-EXIT  (uuid:8e64e1ad-01f4-3161-66db-c021f2f88841, source lines 2246-2248). */
    public void abendRoutineExit() {
        // COBOL [EXIT]: EXIT
    }

    public static void main(String[] args) {
        new Cotrtupc().mainPara();
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
