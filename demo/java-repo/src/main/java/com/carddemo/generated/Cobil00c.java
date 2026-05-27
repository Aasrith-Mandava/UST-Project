// Generated from COBIL00C.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COBIL00C.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * COBIL00C (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: COBIL00C.cbl
 */
public class Cobil00c {

    /** WS-VARIABLES (uuid:20c1573e-5f22-887a-aec3-3a65343cc789, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsVariables;

    /** WS-PGMNAME (uuid:07a206fe-3c00-d4ff-ac28-f0ccbed60ec6, level 5, PIC X(08)). */
    public String wsPgmname;

    /** WS-TRANID (uuid:31447188-93b6-d0e6-3e14-be7860144b01, level 5, PIC X(04)). */
    public String wsTranid;

    /** WS-MESSAGE (uuid:7c33e8ae-734a-30d9-3b47-0ba5ce6b633e, level 5, PIC X(80)). */
    public String wsMessage;

    /** WS-TRANSACT-FILE (uuid:bfa0a0a5-a3f7-c6df-3ed3-ae47bc8e2668, level 5, PIC X(08)). */
    public String wsTransactFile;

    /** WS-ACCTDAT-FILE (uuid:0a73e07e-857a-a720-3fe3-ed15dfc11f6a, level 5, PIC X(08)). */
    public String wsAcctdatFile;

    /** WS-CXACAIX-FILE (uuid:e5aaf5f7-ea29-d46a-4639-687af45a66e4, level 5, PIC X(08)). */
    public String wsCxacaixFile;

    /** WS-ERR-FLG (uuid:7034febb-e9dc-b014-d8a0-6aa9444ad2ee, level 5, PIC X(01)). */
    public String wsErrFlg;

    /** WS-RESP-CD (uuid:5ea37468-031e-86d0-d521-ebec5685096b, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsRespCd;

    /** WS-REAS-CD (uuid:95d0b4b1-a4c2-d3a9-e5b8-64f732e4a81b, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsReasCd;

    /** WS-USR-MODIFIED (uuid:88cb4f99-2b5e-4683-33b5-8bac83d419b5, level 5, PIC X(01)). */
    public String wsUsrModified;

    /** WS-CONF-PAY-FLG (uuid:55962a49-0f56-c0d7-cdc6-1c951cbeb6b8, level 5, PIC X(01)). */
    public String wsConfPayFlg;

    /** WS-TRAN-AMT (uuid:567b9da8-f0c1-73b1-1460-00b571fb660b, level 5, PIC +99999999.99.). */
    public long /* PIC +99999999.99. */ wsTranAmt;

    /** WS-CURR-BAL (uuid:a64ec261-9125-e919-9a56-007157a22ed7, level 5, PIC +9999999999.99.). */
    public long /* PIC +9999999999.99. */ wsCurrBal;

    /** WS-TRAN-ID-NUM (uuid:d636245f-4ab4-3226-7a2e-1bf0b878c0f0, level 5, PIC 9(16)). */
    public long /* PIC 9(16) */ wsTranIdNum;

    /** WS-TRAN-DATE (uuid:e448239b-d361-71e4-609f-f2d7b498334d, level 5, PIC X(08)). */
    public String wsTranDate;

    /** WS-ABS-TIME (uuid:653451dc-3dd9-7ebf-852a-67f6a179bebf, level 5, PIC S9(15) COMP-3). */
    public BigDecimal /* PIC S9(15) COMP-3 */ wsAbsTime;

    /** WS-CUR-DATE-X10 (uuid:a7a96d04-7688-4df1-fed2-34f41caa5bad, level 5, PIC X(10)). */
    public String wsCurDateX10;

    /** WS-CUR-TIME-X08 (uuid:32e63ec2-3fe6-9f6c-22d2-75d53c764349, level 5, PIC X(08)). */
    public String wsCurTimeX08;

    /** CARDDEMO-COMMAREA (uuid:f033a7a0-041f-3ad5-3d69-96effdbd6af1, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:9a4b2d8d-6ec6-e9b4-0403-9b33053cad03, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:89bae3d6-453b-1f81-257a-5f5e537e3849, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:0e364700-887e-265a-e25c-e19704679bf6, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:a7bd503e-d38f-2c1c-aafc-5acd44c8028f, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:b4df878c-cef7-255c-c0c3-f9b344c50c8b, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:657d8d8b-accb-e90c-81e5-7da2216e0162, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:225cf2ca-2713-f1cf-bbe6-abef767a301f, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:0b624062-5377-d097-4699-c803f9b9e531, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:f0732c6a-2899-be2d-136e-a99ba33d5ab1, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:4650e539-dd5d-ccd5-580d-5edc84dd3753, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:ef907114-c346-7505-3aa7-97a798454660, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:cd5f2b51-9900-12f9-4f80-c4f8678acfde, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:5b520ceb-e2d9-9e40-955f-6876fca3dfb0, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:40c39876-2d46-4be6-03b9-7d48721090f4, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:0ee5c690-b9ed-b3bb-29ae-2fbd612280b4, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:c8ad1736-9a9a-eb1a-3034-113aa7d74438, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:89a135a5-90ad-43bf-2876-a33d99913e2c, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:e8bd5e97-aeb1-20e2-a312-aa54f552e103, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:0f267f7e-d0fb-4c48-48b6-1154eed8feba, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:eebfcd25-44ec-b9ba-8c12-ea104121dd0d, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:3a034393-27e1-7576-72fd-52c73066e7d6, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** CDEMO-CB00-INFO (uuid:30726586-694a-437c-1d4b-326a6688b6e8, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCb00Info;

    /** CDEMO-CB00-TRNID-FIRST (uuid:f6432ec4-88d0-b460-f79d-bb883dd2d057, level 10, PIC X(16).). */
    public String cdemoCb00TrnidFirst;

    /** CDEMO-CB00-TRNID-LAST (uuid:06c84d2c-ff1d-2972-42ac-4da0ffb15341, level 10, PIC X(16).). */
    public String cdemoCb00TrnidLast;

    /** CDEMO-CB00-PAGE-NUM (uuid:d68dcc16-c95d-1d40-db3f-6f2b8236a130, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ cdemoCb00PageNum;

    /** CDEMO-CB00-NEXT-PAGE-FLG (uuid:b24ce6b3-8f7b-ffff-999e-7176eee373b3, level 10, PIC X(01)). */
    public String cdemoCb00NextPageFlg;

    /** CDEMO-CB00-TRN-SEL-FLG (uuid:4d27cbaf-e3ba-b96c-d028-c291cd51fa0f, level 10, PIC X(01).). */
    public String cdemoCb00TrnSelFlg;

    /** CDEMO-CB00-TRN-SELECTED (uuid:deac672f-24a5-83f4-4b0a-94ecf8a10be5, level 10, PIC X(16).). */
    public String cdemoCb00TrnSelected;

    /** COBIL0AI (uuid:9227002c-54d0-d9b0-a5c2-e6ae81566b5b, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cobil0ai;

    /** TRNNAMEL (uuid:9587bd46-092d-7ab0-cca2-e230eb39ed32, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamel;

    /** TRNNAMEF (uuid:b0310f1f-1ff7-6369-83d5-ba647debedcc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamef;

    /** TRNNAMEA (uuid:dde9d235-a371-aef6-ba55-0b1fd6e7a929, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamea;

    /** TRNNAMEI (uuid:d3ddee8d-a61e-5112-930e-4a4f04ab57dc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamei;

    /** TITLE01L (uuid:034d91f4-7c40-f74e-6f12-30da6346630f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01l;

    /** TITLE01F (uuid:ee0de702-29a0-fb4c-cda3-15b1661b505f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01f;

    /** TITLE01A (uuid:3a16ba0e-84db-5c48-064f-42dd45015a44, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01a;

    /** TITLE01I (uuid:499df833-4d37-63a2-cab5-6d69f8536d1f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01i;

    /** CURDATEL (uuid:b518244d-b540-ef78-2926-be7f681b883b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatel;

    /** CURDATEF (uuid:c28bc1f1-adfe-03d5-5296-c301b5be97f3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatef;

    /** CURDATEA (uuid:6d5acd74-7da4-c3c8-4fc4-1c8cc4ebefe5, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatea;

    /** CURDATEI (uuid:3619f49d-43bb-bdb1-e713-dce9e36c8c03, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatei;

    /** PGMNAMEL (uuid:90f6d11a-3c3d-3815-74dd-93573b741c67, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamel;

    /** PGMNAMEF (uuid:58c72eb8-535a-0fe9-8ade-7952e4a8460e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamef;

    /** PGMNAMEA (uuid:8ed26dff-731e-4784-f93c-6f027b98ad6e, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamea;

    /** PGMNAMEI (uuid:5b7447d8-9e07-3d9f-27ca-84c237bcf399, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamei;

    /** TITLE02L (uuid:ea4d0846-1726-f0a0-6a6f-4b4739569e9f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02l;

    /** TITLE02F (uuid:f2c0bb7b-385a-5a79-6a60-10420136c81c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02f;

    /** TITLE02A (uuid:f4d4d958-ba20-28dc-ec01-b97aceb72869, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02a;

    /** TITLE02I (uuid:95a2b1cc-0627-2e06-46f7-612d98f7ac85, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02i;

    /** CURTIMEL (uuid:c3d8cfa2-8de6-f7b1-aa15-ef3c2806da68, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimel;

    /** CURTIMEF (uuid:680fab02-911d-0aa5-e1dd-25e3d0c79440, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimef;

    /** CURTIMEA (uuid:fb711388-fcde-db00-d767-7357eb51ff2f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimea;

    /** CURTIMEI (uuid:25f7b42c-313e-2989-ecec-c3ed1fffe138, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimei;

    /** ACTIDINL (uuid:c67e852f-83cd-3dc5-ee60-53be05fe43ff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidinl;

    /** ACTIDINF (uuid:49fedb9f-8882-93fb-405f-5ea4c257d8e0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidinf;

    /** ACTIDINA (uuid:f4014e94-1d32-718a-4e4b-03fb510abb42, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidina;

    /** ACTIDINI (uuid:0b9be20a-7aa7-065e-e023-f52273cd9bc6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidini;

    /** CURBALL (uuid:037c304e-52bf-60dd-e054-70e795ae5268, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curball;

    /** CURBALF (uuid:750b98c7-8958-b64b-3ea8-62abcfd7f2ff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curbalf;

    /** CURBALA (uuid:12c22275-2b78-0191-9f1e-37a3594f892c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curbala;

    /** CURBALI (uuid:c9f2c418-e6fe-f972-4f8e-447dfcf70e11, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curbali;

    /** CONFIRML (uuid:43680eb2-0fc0-8c81-54f1-8a2cf7785833, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirml;

    /** CONFIRMF (uuid:78bbf7d3-ebfc-3bd8-ce0a-1f040c9bfdd7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmf;

    /** CONFIRMA (uuid:89bcdf20-3d32-c537-f4ed-47a333f5d13a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirma;

    /** CONFIRMI (uuid:02a37e81-64f3-4d42-8f0c-0bf8cdcd4bd2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmi;

    /** ERRMSGL (uuid:5714ff50-d610-00d8-10a5-8243716e99c4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgl;

    /** ERRMSGF (uuid:90df7180-8967-1861-c153-dbccd331549f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgf;

    /** ERRMSGA (uuid:ad4eb5c5-8630-d81f-b828-aec4c72b8977, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsga;

    /** ERRMSGI (uuid:ae398d60-c8fc-1231-ef9a-ec002c0bb28e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgi;

    /** COBIL0AO (uuid:a7f27392-dd1d-4675-fb18-a95da1f67d2a, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cobil0ao;

    /** TRNNAMEC (uuid:ba713fd3-d041-75df-817a-4599750e2ca5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamec;

    /** TRNNAMEP (uuid:5f8d3477-f4ec-c8bf-dcdc-4e660d29adf2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamep;

    /** TRNNAMEH (uuid:591aa6fb-e81d-c2a8-69d2-74b959f124a3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameh;

    /** TRNNAMEV (uuid:2b33cf1c-5887-df3e-cb61-e46da13d368c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamev;

    /** TRNNAMEO (uuid:5e937a57-8f9b-aa56-5a4b-148f5a0a14bd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameo;

    /** TITLE01C (uuid:bbaf1a32-77c0-b6a0-5b6c-ff6d1bc46d49, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01c;

    /** TITLE01P (uuid:911025da-451f-b5b7-afd1-889a38b23644, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01p;

    /** TITLE01H (uuid:e3309a2c-03fc-6bb9-9269-925a399bb510, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01h;

    /** TITLE01V (uuid:7ffdb905-3a12-1b06-9e55-1b61f99cbbfd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01v;

    /** TITLE01O (uuid:e3452341-3688-b673-4d85-f4e95914bc3a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01o;

    /** CURDATEC (uuid:b73e3ab7-0716-a96a-93fa-e9f5db8f21ce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatec;

    /** CURDATEP (uuid:060a0f6c-6c47-33cd-7277-2f717a4fb62d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatep;

    /** CURDATEH (uuid:fc74ab43-ee0b-9db2-f059-52796b0ea728, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateh;

    /** CURDATEV (uuid:409c42e8-ab8c-943e-2eae-293eb0e01354, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatev;

    /** CURDATEO (uuid:cd06b965-d695-badc-0d73-b60c5bfba52b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateo;

    /** PGMNAMEC (uuid:54f194ee-af82-e108-90ae-e5825b107820, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamec;

    /** PGMNAMEP (uuid:8eb059d6-6177-33e8-6167-bc744569f4a9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamep;

    /** PGMNAMEH (uuid:b23602ac-a552-a651-7a16-aade3c6a0241, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameh;

    /** PGMNAMEV (uuid:a804b327-0b34-5c8b-8ea1-3ec1b226b570, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamev;

    /** PGMNAMEO (uuid:570cd904-9241-5b98-5cf9-42cd3f731764, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameo;

    /** TITLE02C (uuid:a89c5ee7-3429-dfa5-928d-066466135c0d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02c;

    /** TITLE02P (uuid:f0b55f32-1e4b-f081-ccf2-1441de1b1cfc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02p;

    /** TITLE02H (uuid:4814a85f-8aa6-1449-7de0-b1fa94b99f6a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02h;

    /** TITLE02V (uuid:d7dc54a6-915e-4cbc-e441-40c9801c9d09, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02v;

    /** TITLE02O (uuid:a0bf48f2-40f7-8926-be42-b770861bb7f0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02o;

    /** CURTIMEC (uuid:b7a2ca97-451b-e672-bec5-54e407837cc7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimec;

    /** CURTIMEP (uuid:7984ad45-b1d4-43ae-4ca4-f176ad01b37a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimep;

    /** CURTIMEH (uuid:0b4c11ad-2cea-3e66-2e49-62b09a52deb9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeh;

    /** CURTIMEV (uuid:c1d73452-8ba8-c1a9-86c9-897a9de55ed5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimev;

    /** CURTIMEO (uuid:aa8db09c-dbe1-2776-c28c-a3d7e4ce3d7f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeo;

    /** ACTIDINC (uuid:a398d23c-31c6-4cb6-c03b-afacd17e4f52, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidinc;

    /** ACTIDINP (uuid:fa3f6f46-10bb-3a16-5c4b-cc2d124841ff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidinp;

    /** ACTIDINH (uuid:e2d29308-be4a-4567-299e-4953647464f7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidinh;

    /** ACTIDINV (uuid:399cbec6-bb40-bdcc-51c8-faaa48c01da6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidinv;

    /** ACTIDINO (uuid:4ae6d430-4c1b-9e17-2050-214edebfee0b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actidino;

    /** CURBALC (uuid:3c29489b-598c-52ad-f0bc-73f191ddc2b5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curbalc;

    /** CURBALP (uuid:bde9b690-5785-2ffa-417c-847f85b9dc5a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curbalp;

    /** CURBALH (uuid:0bdfd8e4-b1df-14ca-9282-12d33e67b9cc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curbalh;

    /** CURBALV (uuid:520ef235-42a2-1909-b4ca-2739ae8516bb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curbalv;

    /** CURBALO (uuid:e6da9396-8807-75dd-1a9a-88c3d1499921, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curbalo;

    /** CONFIRMC (uuid:76debf38-911b-fe71-5dfa-6d1ae6fe0217, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmc;

    /** CONFIRMP (uuid:683205d5-af62-4776-2ced-fccd55c5abc4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmp;

    /** CONFIRMH (uuid:fc9e0633-ab8f-a468-5550-51e56da44a79, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmh;

    /** CONFIRMV (uuid:69b5591b-b384-c3d7-1a2f-52ba5864274d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmv;

    /** CONFIRMO (uuid:80983fbb-7ef7-53d6-8db2-fbef1325907c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ confirmo;

    /** ERRMSGC (uuid:6b87f871-795c-3c72-b40f-fbe02f2242f9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgc;

    /** ERRMSGP (uuid:6de1665e-c56d-5c1a-b3d7-090067554430, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgp;

    /** ERRMSGH (uuid:998c399b-fd22-ee5e-7c46-67544881ecff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgh;

    /** ERRMSGV (uuid:b7e464e0-cdfa-b443-2307-e1cd8433a4d0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgv;

    /** ERRMSGO (uuid:b2f594cc-ce23-f693-92ce-8c6e300ca912, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgo;

    /** CCDA-SCREEN-TITLE (uuid:a949c253-8b7a-3cf2-3bfd-513ff0c8f067, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:ce2f0bcf-5476-8ddb-f74f-1a20cd26616d, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:59198246-e579-346b-8490-cb8bb6680cf2, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:d85a5820-1bcf-9d8b-11b3-17203287c74a, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** WS-DATE-TIME (uuid:e037119e-4e20-30c7-6d04-43f07c592bc1, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:a45e7e25-2960-7c17-620b-090ca247e9dc, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:fc86a758-822f-f1cd-009d-b7b6551f9ee0, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:6897beb3-7558-7875-eac6-77a27a272789, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:ecee176e-e3a5-c054-9e42-cf75a1208ed4, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:81209848-a057-bbad-c9ca-85e9f49c8252, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:55596c28-877f-7ec9-6bff-efaa605d295a, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:a4b8b2ed-b0e3-6775-13a7-c1f694eb9e1e, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:210f46f8-e434-bff7-afae-b0c480eabb1a, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:2f40ec48-dca4-9603-b270-e1d68c80457c, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:0d7cd862-77c7-5b2f-3f55-1799a6181364, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:7917c365-882c-1ec4-f0dc-63b6390a6de6, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:0d928b3c-272a-7461-d6af-b40771fc808c, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:3ca9ed2c-e86a-59d8-e4b5-46c338b2124b, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:91084c5f-9295-1a8d-836a-f88b2859d346, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:aec1f7f9-505a-437d-18de-0bcb4d982717, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:e830b7df-6493-9f13-5d24-4b20c1626339, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:80247d25-d465-c536-4993-035caca3f657, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:70e90fdf-ac71-2ea0-5810-2ee335ffd835, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:ddaef60d-4619-6531-a59c-47e84c167728, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:b1424430-106d-6267-f543-70db0b3c80c8, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:8a674262-1b34-b5d7-968c-6c2a152b7b83, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:a6c84299-7873-f50a-6e63-fc26a195c315, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:26d20da3-87b4-aa3e-9c4b-432e40b1be4e, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:64be0338-4ec1-7e89-51ae-643fc9e27acf, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:870bc2c0-2f52-f5bb-155d-f387075674a0, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:95963eef-d911-8521-30ec-5c50bb0daa72, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:14df69c0-ff09-b081-985d-6f0f1b9e1a24, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:1b777fa5-4e56-f0b9-eb6a-da26ef9f441d, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:5e643bfb-f864-d8ad-092a-6a8cb6f1a1a8, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:52a67bb0-fb57-b694-dee3-750038711877, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:5483a851-57f9-d9f4-0309-520e2587ccdc, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** ACCOUNT-RECORD (uuid:3c1cd4af-9724-9b1d-3c6c-b7a1dbe97c3f, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ accountRecord;

    /** ACCT-ID (uuid:8368ff1a-abf7-fca5-1fde-9baccb53bee7, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ acctId;

    /** ACCT-ACTIVE-STATUS (uuid:eca79aa2-c692-a645-8b22-0f241d59ae2a, level 5, PIC X(01).). */
    public String acctActiveStatus;

    /** ACCT-CURR-BAL (uuid:3f105c46-7814-6831-f1f2-a859e69e5db9, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrBal;

    /** ACCT-CREDIT-LIMIT (uuid:002c28ad-f099-80cd-b358-51b927e70a8f, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCreditLimit;

    /** ACCT-CASH-CREDIT-LIMIT (uuid:aef6187d-1b2c-4314-a019-2d087b3fc444, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCashCreditLimit;

    /** ACCT-OPEN-DATE (uuid:c1a14613-8245-7041-2d0d-f37b95720221, level 5, PIC X(10).). */
    public String acctOpenDate;

    /** ACCT-EXPIRAION-DATE (uuid:d8715bd9-a01b-9609-6938-d6db70373b24, level 5, PIC X(10).). */
    public String acctExpiraionDate;

    /** ACCT-REISSUE-DATE (uuid:a92dbcbb-7334-af35-07b2-e7391fdf6317, level 5, PIC X(10).). */
    public String acctReissueDate;

    /** ACCT-CURR-CYC-CREDIT (uuid:bf415baa-6045-d9f4-dfe9-3af8fc9cc0bb, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrCycCredit;

    /** ACCT-CURR-CYC-DEBIT (uuid:29102d49-d1a1-1cc7-e6b8-b653ef4099d9, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrCycDebit;

    /** ACCT-ADDR-ZIP (uuid:e8144372-918f-dc62-5cb5-68f8ecac11a1, level 5, PIC X(10).). */
    public String acctAddrZip;

    /** ACCT-GROUP-ID (uuid:60b14892-9eeb-89f8-46fd-46e72a459a34, level 5, PIC X(10).). */
    public String acctGroupId;

    /** CARD-XREF-RECORD (uuid:ec1f77be-3deb-d8a5-c315-11a79e11e322, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardXrefRecord;

    /** XREF-CARD-NUM (uuid:c96477fe-c5ae-dd7d-b79d-f9f4a32b8431, level 5, PIC X(16).). */
    public String xrefCardNum;

    /** XREF-CUST-ID (uuid:5e599f38-f955-c1f3-8e41-391ca490d937, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ xrefCustId;

    /** XREF-ACCT-ID (uuid:ddabb59b-6ff6-b218-7b1d-1c8f1be71446, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ xrefAcctId;

    /** TRAN-RECORD (uuid:5b0a87d5-d3ab-3e63-06d1-834a691d238e, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ tranRecord;

    /** TRAN-ID (uuid:24b798d4-a9c3-b15b-feaf-2f7155a8a0fb, level 5, PIC X(16).). */
    public String tranId;

    /** TRAN-TYPE-CD (uuid:68b29ad1-8a2b-a88d-2ab5-235c3f104f2b, level 5, PIC X(02).). */
    public String tranTypeCd;

    /** TRAN-CAT-CD (uuid:a7f92f90-d2d2-da6f-ed2d-4ca5c661d07a, level 5, PIC 9(04).). */
    public int /* PIC 9(04). */ tranCatCd;

    /** TRAN-SOURCE (uuid:ef46d15e-75f6-f849-381f-8281c59ee94d, level 5, PIC X(10).). */
    public String tranSource;

    /** TRAN-DESC (uuid:cd08210d-edfb-9c75-a6d8-0b4ab8e4349a, level 5, PIC X(100).). */
    public String tranDesc;

    /** TRAN-AMT (uuid:87c2ec13-c621-0be3-00e4-b28ad8852d03, level 5, PIC S9(09)V99.). */
    public BigDecimal /* precision=11, scale=2, signed */ tranAmt;

    /** TRAN-MERCHANT-ID (uuid:df611856-2162-5a2a-6a25-c15f945be8c0, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ tranMerchantId;

    /** TRAN-MERCHANT-NAME (uuid:c0483b8b-cb17-be03-34d6-de0ac8c08773, level 5, PIC X(50).). */
    public String tranMerchantName;

    /** TRAN-MERCHANT-CITY (uuid:a6fa6e48-42d4-c8b5-1ad8-6da6dd704863, level 5, PIC X(50).). */
    public String tranMerchantCity;

    /** TRAN-MERCHANT-ZIP (uuid:46510a1e-aa9f-5cd3-efb9-d83aac25df22, level 5, PIC X(10).). */
    public String tranMerchantZip;

    /** TRAN-CARD-NUM (uuid:a354cd2e-318d-70fd-78ee-a68684211d1a, level 5, PIC X(16).). */
    public String tranCardNum;

    /** TRAN-ORIG-TS (uuid:fa07c3cc-a243-abd1-c754-2743147719d0, level 5, PIC X(26).). */
    public String tranOrigTs;

    /** TRAN-PROC-TS (uuid:840ae5a7-100c-4393-f326-818eaff16040, level 5, PIC X(26).). */
    public String tranProcTs;

    /** DFHAID (uuid:286d5033-691f-a4d0-ac55-eefae87394cf, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:8069f5fa-8a34-bf15-e493-427fedeb24a8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:058dd689-efbf-37a3-de26-bffc27951ed2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:1d39e460-5b77-32d7-2e19-d1452fd010f9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:eeaefc89-38e3-baef-e70c-dd1b505d8dd4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:68ee98a9-745e-a5e3-3fb6-df8d94e5b374, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:38da66e3-8816-2c26-1991-7c0f090b0ffd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:99edfd8c-040a-ccc2-7ea0-1458cbf71d48, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:d99c1dfb-5c01-6316-2471-4e9dc8f67fc1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:7625fcfd-50e7-027c-b036-47f1a5c95d78, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:5160e5c9-c878-96a6-1180-9969129b5824, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:6cf14f3a-65e2-cee5-0a47-a293cee19400, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:b2c369ce-8111-8625-825a-8d9d4004003a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:4d374812-d644-13e1-d50d-1942fda48b14, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:8dd74064-a8ce-4cc1-6eb6-08a2337d4989, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:9bed4794-0c63-3f47-4c9d-2585ae313be7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:72d23c78-efe6-9943-7408-cc58bcd7431b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:a18c5ed3-95f8-a572-8637-27f314f4d713, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:3427a1db-92f3-b5b4-ffb4-9384b471cffc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:92d84d3e-69b6-524f-d5bf-454686a5e9dd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:18ed409b-1281-a16d-785f-838c3f6a9899, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:09492582-ea7d-1d39-b2c4-d4285db02b41, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:501906fb-10f2-e42e-6965-d7baac0d3742, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:043429d4-7554-fd50-94c5-350d8637fa12, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:3f5c2033-00c6-8a87-3b66-6ef4d31de519, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:becbbe64-fb6f-037b-e985-f6652d098f34, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:9354075e-ba13-3c78-aa96-61fa7c827e9c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:d10dd2c6-475c-6e29-a816-a6aeee49f000, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:eff8241c-cb2d-a25a-fb21-4a4806dd109c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:78c85167-619d-9ac0-3b09-ee3fd7a22250, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:3f7621b4-6412-13c2-be94-730c5ca5a151, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:4aca8e5f-d8c0-a97c-a9cf-2add19edde17, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:a729b24c-0bda-b3e3-2cec-0876b51418a7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:085d52d2-6d6b-6666-db13-36fc76d55808, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:c4cd7e7d-d5c6-05bb-f33d-f549bb190aa3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:202b9a68-421e-47bf-8ff8-c81747573f7c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:5e1766f7-d1b0-91b4-ff91-c442674daa8b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** DFHBMSCA (uuid:8de12c4c-1e51-6675-a43a-c7209ae5668e, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:1403585e-4d93-3fef-cbe0-2d22c5e709ec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:d27ecea2-9a45-94e2-4064-ea55ede9d1b9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:f7a31168-fba8-3cc0-7ea0-2195ebcf0b65, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:0d4c871e-1f25-0a14-7326-774904c12209, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:38cf2541-20c3-6288-3220-929256f4338a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:d0ec023d-b393-15c6-0ca0-a537ec778201, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:88ceccd3-9bd9-0e2b-9638-460ee7062b61, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:6ce7ac63-65f3-dba0-da77-6297521e41d3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:3b7ba9c4-1e73-e139-5a8b-05e5ff506874, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:88a9a4c8-ca76-12f0-e5d2-8a91c09fc9be, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:f4e748f2-5007-23a4-095d-d15068c5b897, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:9a25ac32-1eb9-175a-5daa-fb47c1c1cf61, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:69c72638-0d6b-5e6a-5fe0-e6ae63ddf81a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:676689fd-aadb-179f-c127-dd495079babd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:3f070e59-8684-6314-6bdd-a19265f8c598, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:18394501-efc0-8a55-2669-f0eaefd66188, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:ea6228ae-6dba-b2f0-d23c-ae5d92379a15, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:b1056c45-20ae-8c2d-64d6-d557d780987a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:c744f4ef-f9aa-b52e-32c5-25328bbcb702, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:28525c54-8af2-f467-d598-7e19c2404303, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:ebe4d0f5-9a06-d042-8e98-b41e48654a60, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:42c13189-54f9-cf60-cab6-ec9860b637a5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:ee9a5f33-11be-1b37-42c1-7aa2d721c77b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:3c46b249-b2cf-fc27-511f-8af33262b29d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:db5105cf-10f2-6bcc-dca2-d70098017cb3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:40da8974-fa5e-7ace-4d46-cf130ea04554, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:3ba6c53b-2dda-fffb-4943-e647db744aaf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:76602436-1e94-4172-bd07-f55c3dbc001b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:f93d0ab3-9001-7350-3fd4-2aa0751fbb35, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;


    // --- auto-generated stubs for undeclared references ---
    public Object eibcalen;  // auto-stub for undeclared reference

    /** MAIN-PARA  (uuid:5f6d2c3c-3cc0-16ca-652b-a4d2671e1021, source lines 524-574). */
    public void mainPara() {
        // SET ERR-FLG-OFF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET USR-MODIFIED-NO TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsMessage = "";
        this.errmsgo = "";
        if (java.util.Objects.equals(this.eibcalen, 0)) {
            // TODO: translate body for: EIBCALEN = 0
        }
    }

    /** PROCESS-ENTER-KEY  (uuid:68963935-e69e-e6c1-c876-27dc7d7bdfb1, source lines 579-669). */
    public void processEnterKey() {
        // SET CONF-PAY-NO TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
    }

    /** GET-CURRENT-TIMESTAMP  (uuid:8248eed8-c918-4fab-e6cd-23af31933caa, source lines 674-692). */
    public void getCurrentTimestamp() {
        // INITIALIZE wsTimestamp: reset to PIC defaults
        this.wsTimestamp = null;  // TODO: set to type-appropriate zero/spaces
        // MOVE WS-CUR-DATE-X10 TO WS-TIMESTAMP(01:10)  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CUR-TIME-X08 TO WS-TIMESTAMP(12:08)  -- identifier MOVE; needs PIC-aware type coercion
        this.wsTimestampTmMs6 = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
    }

    /** RETURN-TO-PREV-SCREEN  (uuid:d2c8bc3c-250b-4a60-a3d2-2507e3d583bc, source lines 698-709). */
    public void returnToPrevScreen() {
        if (java.util.Objects.equals(this.cdemoToProgram, "\u0000")) {
            // TODO: translate body for: CDEMO-TO-PROGRAM = LOW-VALUES OR SPACES
        }
        // MOVE WS-TRANID TO CDEMO-FROM-TRANID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO CDEMO-FROM-PROGRAM  -- identifier MOVE; needs PIC-aware type coercion
        this.cdemoPgmContext = 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */;
    }

    /** SEND-BILLPAY-SCREEN  (uuid:691e1d80-efd1-65a1-d02b-70b5a9394d0a, source lines 714-726). */
    public void sendBillpayScreen() {
        this.populateHeaderInfo();  // PERFORM
        // MOVE WS-MESSAGE TO ERRMSGO OF COBIL0AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** RECEIVE-BILLPAY-SCREEN  (uuid:7c9525f9-0aac-5bed-e3ac-b56bdafd33a0, source lines 731-739). */
    public void receiveBillpayScreen() {
        // TODO: implement receiveBillpayScreen.  See uuid:7c9525f9-0aac-5bed-e3ac-b56bdafd33a0
    }

    /** POPULATE-HEADER-INFO  (uuid:51cc68b8-61f0-7e81-668b-5a4b4e7763b1, source lines 744-763). */
    public void populateHeaderInfo() {
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF COBIL0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF COBIL0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-TRANID TO TRNNAMEO OF COBIL0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO PGMNAMEO OF COBIL0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF COBIL0AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF COBIL0AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** READ-ACCTDAT-FILE  (uuid:13774dbe-8c64-fbd1-4bee-7a5151d1a133, source lines 768-797). */
    public void readAcctdatFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** UPDATE-ACCTDAT-FILE  (uuid:adf8ef2a-1da9-d50a-f0b5-96e38b42adea, source lines 802-828). */
    public void updateAcctdatFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** READ-CXACAIX-FILE  (uuid:a88df688-886e-b778-7963-915e58de2afe, source lines 833-861). */
    public void readCxacaixFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** STARTBR-TRANSACT-FILE  (uuid:b4cb5ede-9493-6d89-e49c-402d722715c5, source lines 866-892). */
    public void startbrTransactFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** READPREV-TRANSACT-FILE  (uuid:095a6d04-8e19-6307-b893-2920a0cbe066, source lines 897-921). */
    public void readprevTransactFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** ENDBR-TRANSACT-FILE  (uuid:10726b2e-864a-64e9-e404-ce881305f7fa, source lines 926-930). */
    public void endbrTransactFile() {
        Vsam.endbr("WS-TRANSACT-FILE");  // line 928
    }

    /** WRITE-TRANSACT-FILE  (uuid:7e97930b-5690-109f-82a6-c07e46b599e4, source lines 935-972). */
    public void writeTransactFile() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** CLEAR-CURRENT-SCREEN  (uuid:2870a812-eb96-4895-a73f-ceadc51ff47f, source lines 977-980). */
    public void clearCurrentScreen() {
        this.initializeAllFields();  // PERFORM
        this.sendBillpayScreen();  // PERFORM
    }

    /** INITIALIZE-ALL-FIELDS  (uuid:c1e7f73b-a948-187e-6989-572ae750debf, source lines 985-991). */
    public void initializeAllFields() {
        this.actidinl = -1;
        this.actidini = "";
        this.curbali = "";
        this.confirmi = "";
        this.wsMessage = "";
    }

    public static void main(String[] args) {
        new Cobil00c().mainPara();
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
