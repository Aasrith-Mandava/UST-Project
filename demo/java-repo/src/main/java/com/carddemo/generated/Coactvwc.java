// Generated from COACTVWC.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COACTVWC.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * COACTVWC (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: COACTVWC.cbl
 */
public class Coactvwc {

    /** WS-MISC-STORAGE (uuid:c531fa5a-e47c-9176-64e3-ecdd1762746c, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsMiscStorage;

    /** WS-CICS-PROCESSNG-VARS (uuid:03ba74ca-f598-9d93-6698-5631b4720c58, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCicsProcessngVars;

    /** WS-RESP-CD (uuid:5dde0171-5d5c-5a28-7a01-c886427bc3a0, level 7, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsRespCd;

    /** WS-REAS-CD (uuid:8e4c58f4-3063-90f6-e1da-11723370099c, level 7, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsReasCd;

    /** WS-TRANID (uuid:8cf3268e-33ee-0fbd-263f-d667c85350d5, level 7, PIC X(4)). */
    public String wsTranid;

    /** WS-INPUT-FLAG (uuid:e5d6fc04-1bfa-8376-bfee-d1f4ac0d9fb5, level 5, PIC X(1).). */
    public String wsInputFlag;

    /** WS-PFK-FLAG (uuid:4370c4c3-49b9-faac-8233-e3bf6ee01585, level 5, PIC X(1).). */
    public String wsPfkFlag;

    /** WS-EDIT-ACCT-FLAG (uuid:3da3ca03-24a6-d1b5-ffb8-c8bd96ffdf25, level 5, PIC X(1).). */
    public String wsEditAcctFlag;

    /** WS-EDIT-CUST-FLAG (uuid:4818f4e7-d3a7-69d9-a879-fcbff7958dce, level 5, PIC X(1).). */
    public String wsEditCustFlag;

    /** WS-XREF-RID (uuid:8c8dce29-d2ec-3add-48c3-2bb5b3291735, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsXrefRid;

    /** WS-CARD-RID-CARDNUM (uuid:bbf9dc87-97ca-2a48-afbc-1752b41efadd, level 10, PIC X(16).). */
    public String wsCardRidCardnum;

    /** WS-CARD-RID-CUST-ID (uuid:1373f27a-0605-01a5-8e61-811179a54cec, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ wsCardRidCustId;

    /** WS-CARD-RID-CUST-ID-X (uuid:20fa7bd0-9478-c9f5-22d6-7b7df7c1900f, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCardRidCustIdX;

    /** WS-CARD-RID-ACCT-ID (uuid:1f543bed-e023-fe97-92b1-d9a07801bf58, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ wsCardRidAcctId;

    /** WS-CARD-RID-ACCT-ID-X (uuid:68f103fd-6640-aa87-1751-777b1236cb80, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCardRidAcctIdX;

    /** WS-FILE-READ-FLAGS (uuid:8c863058-ccc7-3fc3-e56a-965b3abe9fda, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsFileReadFlags;

    /** WS-ACCOUNT-MASTER-READ-FLAG (uuid:d1620c14-2ce2-f40f-9da4-b8f4792ea123, level 10, PIC X(1).). */
    public String wsAccountMasterReadFlag;

    /** WS-CUST-MASTER-READ-FLAG (uuid:6c63cbe7-e129-5977-1c34-2fdc2ef818c0, level 10, PIC X(1).). */
    public String wsCustMasterReadFlag;

    /** WS-FILE-ERROR-MESSAGE (uuid:65be496d-0ee8-3278-03b9-d528bae28fbe, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsFileErrorMessage;

    /** ERROR-OPNAME (uuid:f216ba55-48d8-f233-c5bd-9a4657124228, level 10, PIC X(8)). */
    public String errorOpname;

    /** ERROR-FILE (uuid:c3d2f28d-2ce8-a08b-c394-77d66c8e6290, level 10, PIC X(9)). */
    public int /* PIC X(9) */ errorFile;

    /** ERROR-RESP (uuid:16f71651-8cd3-ce53-4786-2e1444008ef5, level 10, PIC X(10)). */
    public String errorResp;

    /** ERROR-RESP2 (uuid:82e7540a-7789-7233-70a7-bd9b3e29b58e, level 10, PIC X(10)). */
    public String errorResp2;

    /** WS-LONG-MSG (uuid:682c6099-f696-2c18-6f78-383132bdb3f2, level 5, PIC X(500).). */
    public String wsLongMsg;

    /** WS-INFO-MSG (uuid:b2071d3c-9d30-6e10-0699-ef9b6f7c202d, level 5, PIC X(40).). */
    public String wsInfoMsg;

    /** WS-RETURN-MSG (uuid:01b6c0ef-2f67-8f20-0427-2ae06966c28b, level 5, PIC X(75).). */
    public String wsReturnMsg;

    /** WS-LITERALS (uuid:2448ff75-7cf4-6c22-8c00-d9a2bd67c481, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsLiterals;

    /** LIT-THISPGM (uuid:7959ac09-97c2-57aa-6dde-bad257cd875e, level 5, PIC X(8)). */
    public String litThispgm;

    /** LIT-THISTRANID (uuid:c649e48d-498b-e2db-11ab-3f91074dedb3, level 5, PIC X(4)). */
    public String litThistranid;

    /** LIT-THISMAPSET (uuid:4ed5ee2a-fc32-0348-383e-981e6da19c71, level 5, PIC X(8)). */
    public String litThismapset;

    /** LIT-THISMAP (uuid:218593bc-5229-7aeb-9b15-c0bb93bf451c, level 5, PIC X(7)). */
    public String litThismap;

    /** LIT-CCLISTPGM (uuid:407e9296-101c-98dc-abf3-9dd11ca8c2fd, level 5, PIC X(8)). */
    public String litCclistpgm;

    /** LIT-CCLISTTRANID (uuid:8ca329cf-909a-9662-50da-745f348289f9, level 5, PIC X(4)). */
    public String litCclisttranid;

    /** LIT-CCLISTMAPSET (uuid:d6f943d8-dfca-5c77-6d03-0f7a264d0a76, level 5, PIC X(7)). */
    public String litCclistmapset;

    /** LIT-CCLISTMAP (uuid:7ecf0dc0-5f54-092e-4ef8-674a28a7eb06, level 5, PIC X(7)). */
    public String litCclistmap;

    /** LIT-CARDUPDATEPGM (uuid:b97a53be-91be-7a17-e84c-3abb10da6339, level 5, PIC X(8)). */
    public String litCardupdatepgm;

    /** LIT-CARDUDPATETRANID (uuid:2b119f12-4978-4095-0781-3d71af29748a, level 5, PIC X(4)). */
    public String litCardudpatetranid;

    /** LIT-CARDUPDATEMAPSET (uuid:87b0d05b-1b62-22ea-f0c3-c5ac8d5c90ae, level 5, PIC X(8)). */
    public String litCardupdatemapset;

    /** LIT-CARDUPDATEMAP (uuid:8a885256-0ee6-0bdc-e22d-a47447fe3356, level 5, PIC X(7)). */
    public String litCardupdatemap;

    /** LIT-MENUPGM (uuid:64dc1aa0-87d1-6276-9e32-bb3d55f21394, level 5, PIC X(8)). */
    public String litMenupgm;

    /** LIT-MENUTRANID (uuid:4add355a-6db3-3a97-9f8f-c68a9c323fed, level 5, PIC X(4)). */
    public String litMenutranid;

    /** LIT-MENUMAPSET (uuid:ea62a070-0037-ac51-0437-1c9eaa59fb34, level 5, PIC X(7)). */
    public String litMenumapset;

    /** LIT-MENUMAP (uuid:ae61a388-af8f-4e1e-95b4-6d0283eeccdd, level 5, PIC X(7)). */
    public String litMenumap;

    /** LIT-CARDDTLPGM (uuid:91a9dcb0-9462-f368-b560-e82871fcff23, level 5, PIC X(8)). */
    public String litCarddtlpgm;

    /** LIT-CARDDTLTRANID (uuid:29d69bd5-0582-0838-2426-8033998220c0, level 5, PIC X(4)). */
    public String litCarddtltranid;

    /** LIT-CARDDTLMAPSET (uuid:74558384-3afa-e82c-c163-c5ce6504431c, level 5, PIC X(7)). */
    public String litCarddtlmapset;

    /** LIT-CARDDTLMAP (uuid:26ad6333-8104-08a5-a95a-3899f81951c0, level 5, PIC X(7)). */
    public String litCarddtlmap;

    /** LIT-ACCTFILENAME (uuid:e9873d7f-c8a3-7944-2aec-afeb7a172cc5, level 5, PIC X(8)). */
    public String litAcctfilename;

    /** LIT-CARDFILENAME (uuid:997369bf-5b42-b624-e445-f1382eea4a6a, level 5, PIC X(8)). */
    public String litCardfilename;

    /** LIT-CUSTFILENAME (uuid:2f6310aa-0c56-3871-6d04-6b7d5794df78, level 5, PIC X(8)). */
    public String litCustfilename;

    /** LIT-CARDFILENAME-ACCT-PATH (uuid:5b7989df-a1d2-0264-e309-5d36a409fe4c, level 5, PIC X(8)). */
    public String litCardfilenameAcctPath;

    /** LIT-CARDXREFNAME-ACCT-PATH (uuid:67663c7e-4898-68c3-03fc-cd73af5d4738, level 5, PIC X(8)). */
    public String litCardxrefnameAcctPath;

    /** LIT-ALL-ALPHA-FROM (uuid:23041e8f-4117-5fd7-b86f-44e999a8e492, level 5, PIC X(52)). */
    public String litAllAlphaFrom;

    /** LIT-ALL-SPACES-TO (uuid:91820b23-4b55-9c60-d72d-50d3f6e578b5, level 5, PIC X(52)). */
    public String litAllSpacesTo;

    /** LIT-UPPER (uuid:a1bf97c3-7bd0-f0b7-cceb-bb6b04b5c764, level 5, PIC X(26)). */
    public String litUpper;

    /** LIT-LOWER (uuid:7bfa52bc-536b-c5f6-22ba-9a295c878341, level 5, PIC X(26)). */
    public String litLower;

    /** CC-WORK-AREAS (uuid:cfb42675-dfb1-ca5c-152b-6f7d953aef35, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccWorkAreas;

    /** CC-WORK-AREA (uuid:62831a83-98fb-5396-5eb5-57a7c5880efa, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccWorkArea;

    /** CCARD-AID (uuid:27febc58-62ea-be21-ec51-deea7aadbe76, level 10, PIC X(5).). */
    public String ccardAid;

    /** CCARD-NEXT-PROG (uuid:b9556e36-753e-02b2-2af5-f8b65d9d97d0, level 10, PIC X(8).). */
    public String ccardNextProg;

    /** CCARD-NEXT-MAPSET (uuid:2db2dc6c-8247-0df3-21df-7619989c7858, level 10, PIC X(7).). */
    public String ccardNextMapset;

    /** CCARD-NEXT-MAP (uuid:c51f454f-bee4-dac6-11ad-700eabfada9c, level 10, PIC X(7).). */
    public String ccardNextMap;

    /** CCARD-ERROR-MSG (uuid:17e45d3b-d494-5682-9946-c4b4de91a456, level 10, PIC X(75).). */
    public String ccardErrorMsg;

    /** CCARD-RETURN-MSG (uuid:4ecc06b5-5ac8-ddef-f4bd-1b3c0b474c8f, level 10, PIC X(75).). */
    public String ccardReturnMsg;

    /** CC-ACCT-ID (uuid:e5de7a56-3be9-abd3-d419-4f44a36cc04f, level 10, PIC X(11)). */
    public String ccAcctId;

    /** CC-ACCT-ID-N (uuid:d2ef7a97-1a3f-d73c-f2a3-7dd784dfe24f, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ ccAcctIdN;

    /** CC-CARD-NUM (uuid:7e5cfe17-c9ec-9c1f-81a4-42382f8badc4, level 10, PIC X(16)). */
    public String ccCardNum;

    /** CC-CARD-NUM-N (uuid:19cdd058-fbde-cb08-468c-4168a19d51f7, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ ccCardNumN;

    /** CC-CUST-ID (uuid:d1fd53f2-1aeb-93c0-b5b6-4d221ee11158, level 10, PIC X(09)). */
    public int /* PIC X(09) */ ccCustId;

    /** CC-CUST-ID-N (uuid:85aef047-7991-8818-d826-3f54c1769e39, level 10, PIC 9(9).). */
    public int /* PIC 9(9). */ ccCustIdN;

    /** CARDDEMO-COMMAREA (uuid:07612521-217a-e535-6190-3866d39eef5f, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:a3b37845-4737-7bef-0281-436c99d59313, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:ddf78195-d353-12ad-4560-b3066226d74b, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:6d7f68bf-9ef5-21a5-e1e3-e31bb889c977, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:b3317514-c281-e03d-d5f6-d07286276d54, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:379546ef-9236-90da-be5a-69d2c78421a6, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:3823efbe-be21-431b-45ba-b71a38a8022e, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:a2237012-46cc-a623-3ab6-775193e48159, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:524e63bb-6eb3-5e2a-a3a4-92c04a53eab2, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:7ade7f92-4b1c-45ba-c593-5a5881c6a185, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:1800f049-9076-2176-b472-c2f44fb1a85d, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:570314f9-f273-455a-4e44-2c799f41d443, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:886cdfee-b43e-9584-ec4d-d1dc6be8b0f1, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:0521b530-fc25-929c-49e5-63b2fd65d92f, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:b512ba2f-fc6e-b8ff-735e-229de46b4951, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:caf443c7-3cce-97eb-41ac-ce0b662c1a0f, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:6598d5d2-2010-bfe8-1461-6d560d377f61, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:ae17fad1-67c0-6231-2b9f-2c1deb761142, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:d3f31a55-6057-0eb8-a638-5538d553053b, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:b549ed8c-e1ec-3e09-cdc3-120aae444f9e, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:2199a0fb-c839-4e91-1987-191311200096, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:dc1dab2f-c9ad-7a54-7c09-593aedf684a6, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** WS-THIS-PROGCOMMAREA (uuid:3780186c-598c-d845-b10d-e8d14a248f61, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsThisProgcommarea;

    /** CA-CALL-CONTEXT (uuid:efc076a8-ea3c-9adc-0c25-618e42bd7774, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ caCallContext;

    /** CA-FROM-PROGRAM (uuid:4ef02617-0fcf-1532-0778-7655e8268cc2, level 10, PIC X(08).). */
    public String caFromProgram;

    /** CA-FROM-TRANID (uuid:56db60d0-6048-a261-dcf0-bff56e4edaf3, level 10, PIC X(04).). */
    public String caFromTranid;

    /** WS-COMMAREA (uuid:f37c33b0-1cd5-e333-8d4e-320bcdb6c596, level 1, PIC X(2000).). */
    public String wsCommarea;

    /** DFHBMSCA (uuid:9135de0b-6ff7-2934-88bb-ec921c5d1b4c, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:f076981b-c5be-c8f3-8324-08f5eaa5b84d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:ebb19a8a-c32c-f4c9-7d64-11d123d068ad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:68026f76-119c-1b5a-e996-7be25615f04a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:6ce48af3-a06b-df03-148d-9e89fe27f9c9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:eb4ab28f-b5e8-f6c5-7060-3356f443cec5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:6c1c1105-ad68-1867-8a4b-64e669ec12a2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:c241cb6d-4f00-67b7-7434-f9344424ec10, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:20e4d214-ca49-89e6-bf46-f1e3cf47a03a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:92395425-68e7-86ef-2042-b529aa774c3e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:f5faa840-d79d-0ffa-158f-954337ccc90f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:4c313a5e-1086-3b0d-b511-77a2b2550f14, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:a3eb2dbc-b2ea-8262-395c-2eb52374011b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:c48065ce-9bd3-a336-f7d3-785cd79a7eb0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:6a363af6-c188-c542-323c-f63e8f2a0bb8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:0d9dbf94-892a-d26b-e945-abdfbbc61dc1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:c47d3bd6-b94e-dff8-2cef-6a88f88bbeda, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:fa49e129-c4bd-d504-0680-25c913078578, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:ec93aeb7-e747-c3e5-b4ed-15e4148bf1d2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:e440fd43-f9cb-0589-b8ee-a372a0be0a17, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:3e640e36-dfb7-eb09-67aa-3ba48f8b5edd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:b56502bf-e7ba-c425-29f0-b14738447871, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:fb0d1922-ceed-e9f3-7426-a4d5c6d30af0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:6aa6e68e-bfa7-21ef-9809-8be0369911d9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:6759b160-f1d1-32a1-089d-9ff3dbfed04e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:8bead589-c9fa-648c-99ae-48e25aa1ba58, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:74606beb-5fc3-1349-d372-5463bd00eb5a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:0ec73c01-cfa1-caa1-4568-0a3058634a4f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:04361a66-ab03-ee2c-51ed-99981a5a2e2d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:42c01052-157d-3743-78f7-a6e379fa52b2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;

    /** DFHAID (uuid:c74a5283-f111-5e15-384c-7ee9773aa222, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:5e49daf6-b510-f7b1-de3e-afc36444cc36, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:41045fc7-a8e7-4bed-944d-3056b2ddfda4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:6fb7d5af-6f5d-8d76-6720-99282dbe3a53, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:fc8f0b1e-95d8-a5b8-4082-d93b3eb7be0b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:8d2e6906-bc82-a4ab-0366-51dc45224d32, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:e6436f3b-1259-3931-55d9-51badabf3f47, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:f1826d40-d020-aa0e-0a17-818958ef9216, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:17fd1de6-b648-02c6-a22f-b7af6123de79, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:0f6dfd80-96c4-aeac-f911-56af50d23c8e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:398ff8ec-9c19-cd60-4f3f-4bb6cc07c73e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:2990a459-8f8d-402b-8cb6-fcbcafe2acdc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:21fb02cc-2444-80ee-016d-a3fa36e96e3e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:a2292228-76de-eeeb-90a0-c258aa3d388c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:4c63ff17-6578-1e06-8e1b-584ff4488a11, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:9d2a13c6-746b-e91f-1df2-000f41645583, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:6cae01e6-8341-0b5c-50a6-31fb56075397, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:c319ba35-5998-bb57-e744-00e81181d7a4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:690799d8-710a-13a1-d514-6d9ae67ec70e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:e56e3749-5cc0-d8ea-71d1-cc185f06fd5a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:e5b98aa9-6e46-a153-61dd-3f782d333346, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:1763d9a4-f619-3924-a42e-82dc0ea61a59, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:6133ff50-a763-76ef-3503-633750ee79a3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:bf13ffe9-c2eb-2092-8bbc-9ec4f6b56059, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:cf08f98c-699f-70a9-f75a-2658793c42e7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:0d882bba-ad41-a4e1-b295-8bf41162370d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:ae1fe16a-2928-ceb3-7293-363c2d1443f0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:99822d61-5dff-c7f9-70b5-4fdb3db28074, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:d817344e-b41f-8381-33c3-388ff1ccda5a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:0ec78cdd-c643-3efb-7561-b4edab827ac9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:1f27b33d-355c-8355-f3f1-230461b1b9b7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:1882d903-0778-7914-307a-59a91d85d329, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:69bf9955-03d4-f233-6527-8b6b0eeeffa3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:68c12924-7b63-4bfd-1d5f-0c4c7a91de62, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:25fa127d-b243-4355-15c9-bb999c5e9550, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:94a13601-6223-677b-eae0-0594aaaa80cd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:b2763b04-583b-9285-acf2-2993436fb083, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** CCDA-SCREEN-TITLE (uuid:45f49bb3-4f3b-321d-6ed3-bf3413a0a1df, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:77bd310c-4481-badc-c085-741b6d4e2163, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:2629ac10-ba0e-0307-3164-be1d3e9b253f, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:a6693bdd-e7cf-bfef-231e-8702263fee1e, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** CACTVWAI (uuid:6913ab00-9ff6-96c1-212a-f560419cadd0, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cactvwai;

    /** TRNNAMEL (uuid:8ca2e79b-f0f7-f21b-8941-c72f82bb4c56, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamel;

    /** TRNNAMEF (uuid:9b8cd09a-2923-2577-0186-dad218d8ca66, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamef;

    /** TRNNAMEA (uuid:42c578ac-9189-4f62-f350-63e7d3aa087b, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamea;

    /** TRNNAMEI (uuid:101cfbcc-1bc7-ee52-3aa5-32f9157b98ab, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamei;

    /** TITLE01L (uuid:8144bfda-d796-716e-39d4-012a0bff8031, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01l;

    /** TITLE01F (uuid:702df07b-ddc1-acbd-7b4c-65b720c6a386, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01f;

    /** TITLE01A (uuid:6f2b6090-31e4-614a-1050-70688f31ebca, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01a;

    /** TITLE01I (uuid:9d782b63-04e1-d402-12b1-ce4c11660b2b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01i;

    /** CURDATEL (uuid:13035970-f6c1-eca7-8c1d-9abffa2c86d1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatel;

    /** CURDATEF (uuid:c7c00dda-62a7-16c7-5d9e-2370640e24eb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatef;

    /** CURDATEA (uuid:863dabe3-f7bd-7c80-b4b8-cf98eeecf8b7, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatea;

    /** CURDATEI (uuid:4f451eb5-73a0-15d8-b3fc-5692e5d82eea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatei;

    /** PGMNAMEL (uuid:7ee5f3df-ffa8-fc66-5ed1-91945662dce6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamel;

    /** PGMNAMEF (uuid:8819e2d8-beb5-d018-583c-2062f74a2092, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamef;

    /** PGMNAMEA (uuid:f9d93b30-0ba5-28b9-f797-594f11034217, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamea;

    /** PGMNAMEI (uuid:abdb3cef-c7dd-1945-f6f7-3859812a8193, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamei;

    /** TITLE02L (uuid:31020a6d-f1f2-2d8f-a968-ac6136485622, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02l;

    /** TITLE02F (uuid:b1f1344b-164d-501e-e544-99213548eb45, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02f;

    /** TITLE02A (uuid:74867221-975a-88aa-ca05-9f00c0fe0e83, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02a;

    /** TITLE02I (uuid:9df47362-c5f3-3c75-f18b-d26a47ca425d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02i;

    /** CURTIMEL (uuid:30820ee9-d4dd-ea76-9889-4e0dbd15de3f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimel;

    /** CURTIMEF (uuid:6aed3093-5966-181e-4a43-6793cf09ac59, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimef;

    /** CURTIMEA (uuid:cd740d23-e3f7-431b-20c9-69fe3091aa42, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimea;

    /** CURTIMEI (uuid:86e9a74f-7efa-e1d6-f4b1-04c5362ce2cb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimei;

    /** ACCTSIDL (uuid:f6cd87db-668d-6055-808b-40ddf09c2fac, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidl;

    /** ACCTSIDF (uuid:a399c4ed-b8da-fa2c-dd95-81c60977aeaa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidf;

    /** ACCTSIDA (uuid:22e561e8-575e-3d0d-4f50-b296afaacc7c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsida;

    /** ACCTSIDI (uuid:fc17f8fc-86b8-7f49-ef34-bd32dd9b19d5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidi;

    /** ACSTTUSL (uuid:d5c22c22-40f7-6f5b-66bb-6be505890107, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttusl;

    /** ACSTTUSF (uuid:6b2da2a3-4eee-10ed-2d4b-c12ee1792150, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttusf;

    /** ACSTTUSA (uuid:445ff62d-341e-e8b1-3c6b-071102a5c27c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttusa;

    /** ACSTTUSI (uuid:31689fa0-f6b8-823f-70e4-73a67a8ff5b5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttusi;

    /** ADTOPENL (uuid:4fe8ec00-a089-9062-5f14-52b504a87573, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ adtopenl;

    /** ADTOPENF (uuid:20d7d94e-8a9b-d2ad-9e12-8a0eae41be56, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ adtopenf;

    /** ADTOPENA (uuid:763bc297-0ae1-79c6-e58f-4901e5e1fa83, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ adtopena;

    /** ADTOPENI (uuid:4736e259-96d2-b91e-17ec-ba978d5827c9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ adtopeni;

    /** ACRDLIML (uuid:b9e198bf-4643-dc6d-3458-e847c0b36953, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdliml;

    /** ACRDLIMF (uuid:13e5fa59-3169-920a-0fc2-5aaccf195d59, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdlimf;

    /** ACRDLIMA (uuid:a67bb768-9a13-6e3e-c408-940bcaabe992, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdlima;

    /** ACRDLIMI (uuid:2842c701-44d5-9a33-6a00-1a1ba39b6663, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdlimi;

    /** AEXPDTL (uuid:f327f7ec-d848-66fd-1d27-5ea4af2b7f0a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aexpdtl;

    /** AEXPDTF (uuid:f0b7315a-008b-810e-e099-30711d583f84, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aexpdtf;

    /** AEXPDTA (uuid:773fa9e1-f795-02b0-fc2b-e0c904402a87, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aexpdta;

    /** AEXPDTI (uuid:ff5346ee-f2e9-c423-ebcb-651388445ad0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aexpdti;

    /** ACSHLIML (uuid:82b46177-3055-00a7-7dd1-f9a567d7acb2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshliml;

    /** ACSHLIMF (uuid:d2027109-364c-b8c3-e442-90b926b3d350, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshlimf;

    /** ACSHLIMA (uuid:669a36df-3e7d-93a0-8ee1-6631a97ffd43, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshlima;

    /** ACSHLIMI (uuid:a0117deb-6aab-cb93-6c8f-49aaf421ed42, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshlimi;

    /** AREISDTL (uuid:69c636bb-190a-47aa-6754-05b844688bba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ areisdtl;

    /** AREISDTF (uuid:6046701e-9ac5-0478-f843-07ce590cbc78, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ areisdtf;

    /** AREISDTA (uuid:0dc6d04d-5a67-8f0e-d239-a6309352da33, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ areisdta;

    /** AREISDTI (uuid:d0619d49-7a69-707f-763e-5f931955f782, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ areisdti;

    /** ACURBALL (uuid:5d9b45fb-e687-8f9b-c662-e9e01b5bab83, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurball;

    /** ACURBALF (uuid:fbb190dd-1eb8-fcf3-65a8-60dbb964f7ed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurbalf;

    /** ACURBALA (uuid:e399c31f-7ee3-10c0-e92d-c756ae13e597, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurbala;

    /** ACURBALI (uuid:82a94422-9098-470c-e51f-b5687a609439, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurbali;

    /** ACRCYCRL (uuid:345c4688-d464-061b-4e26-728852b433e7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycrl;

    /** ACRCYCRF (uuid:716818b0-d1d0-eb4f-92a6-3503c560dfd3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycrf;

    /** ACRCYCRA (uuid:5788d9ab-0d92-ad99-5d99-67c140377225, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycra;

    /** ACRCYCRI (uuid:7f9d9303-2378-a85e-bff0-5469032d55ae, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycri;

    /** AADDGRPL (uuid:ea318157-73f0-3e2a-bb1d-f9f6ebd5aa87, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrpl;

    /** AADDGRPF (uuid:64834ee9-f8e8-8721-e68f-36b986864a47, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrpf;

    /** AADDGRPA (uuid:8d8bf6a5-2360-d290-f0af-7c6db2c748d2, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrpa;

    /** AADDGRPI (uuid:77692133-b16c-7516-8ff2-d9e3518802c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrpi;

    /** ACRCYDBL (uuid:a87357f0-7e10-7c85-e17a-765992bb226a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydbl;

    /** ACRCYDBF (uuid:5a2c2ebe-4067-9787-cc9b-7bf6c5ce4564, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydbf;

    /** ACRCYDBA (uuid:ce28a9d6-a186-3d50-1650-2fce8bf16896, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydba;

    /** ACRCYDBI (uuid:717e0a10-58e9-2b9f-9695-a5493a0d8b65, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydbi;

    /** ACSTNUML (uuid:69939c9b-f65f-fc7d-58ed-1c01317a46e5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnuml;

    /** ACSTNUMF (uuid:3069ee50-762d-d6d6-582e-69efe49887b9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnumf;

    /** ACSTNUMA (uuid:89f94410-21c0-3f6b-3132-bc0eacffcbcd, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnuma;

    /** ACSTNUMI (uuid:1e329e5d-3f23-ff02-f2cf-40c8ca515e8a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnumi;

    /** ACSTSSNL (uuid:dbec8d08-513d-2003-b1d8-ce13944bdccc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstssnl;

    /** ACSTSSNF (uuid:6937dc96-1b03-e4e5-d716-3fc85f2c86c6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstssnf;

    /** ACSTSSNA (uuid:068b3b2a-0684-7d45-a72b-47a20022944c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstssna;

    /** ACSTSSNI (uuid:114104fa-fb9e-ac78-e9f6-62346ded1d04, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstssni;

    /** ACSTDOBL (uuid:9376b990-6b68-fe29-ac35-06943344a2b0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstdobl;

    /** ACSTDOBF (uuid:89f3b2fd-a14d-7e1a-5e89-a5f76deb8ed1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstdobf;

    /** ACSTDOBA (uuid:017e0be9-d524-28ef-167c-8b9b2935f675, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstdoba;

    /** ACSTDOBI (uuid:073db2a8-46fa-28ed-df3a-984ac6ab593b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstdobi;

    /** ACSTFCOL (uuid:0ceb94ef-cb6b-7bc1-8704-23ce4abf4659, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcol;

    /** ACSTFCOF (uuid:7145e3fe-1106-b89b-4bdf-0391bfc9f316, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcof;

    /** ACSTFCOA (uuid:0f3cd94c-f73b-c557-9fa4-6c08d8af6d77, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcoa;

    /** ACSTFCOI (uuid:ae879a80-d6b3-7916-1326-4144653318c9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcoi;

    /** ACSFNAML (uuid:235c3ec6-27bd-8824-4c6d-e1ec354b556c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnaml;

    /** ACSFNAMF (uuid:a5b42a15-66ba-c996-616f-678bd9af796d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnamf;

    /** ACSFNAMA (uuid:7999348b-43a2-80ec-0bfd-2bc0ff8e6f91, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnama;

    /** ACSFNAMI (uuid:bd9bab0a-cf09-3ebb-4095-ceb8f7022cd7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnami;

    /** ACSMNAML (uuid:0fd9ab70-bdd6-ab2e-8e47-5fde38fd63ee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnaml;

    /** ACSMNAMF (uuid:a21de485-7017-38ad-bd81-19d018a0b2d1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnamf;

    /** ACSMNAMA (uuid:3c2ff3f7-0456-bc9c-5c13-650fc604d3b2, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnama;

    /** ACSMNAMI (uuid:da9977d1-17b2-b93c-b28c-65cbb46cec62, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnami;

    /** ACSLNAML (uuid:cc9a13a0-f73f-9116-9d25-425c086c682e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnaml;

    /** ACSLNAMF (uuid:7bab80f7-9380-93a1-9e3e-0c4a14e7e3e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnamf;

    /** ACSLNAMA (uuid:d3643d5c-e001-486b-45a6-110d83d05445, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnama;

    /** ACSLNAMI (uuid:3e859d43-a917-748d-13a2-62b7ff1549ed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnami;

    /** ACSADL1L (uuid:28fe03fd-5164-43ba-8a07-d6913d095765, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1l;

    /** ACSADL1F (uuid:e6380e88-1618-4e7d-127f-282b6daf2adc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1f;

    /** ACSADL1A (uuid:dfa18f0a-9a52-1cca-fb15-2b8c7da65fa7, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1a;

    /** ACSADL1I (uuid:3dbeb474-6c2b-48b3-9912-7c758f8086d8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1i;

    /** ACSSTTEL (uuid:cd56d055-acd2-3bf0-7510-40066793b006, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acssttel;

    /** ACSSTTEF (uuid:f4fa5e3e-0cc4-01a3-752a-7f0f8a2502e0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acssttef;

    /** ACSSTTEA (uuid:4e896878-5055-6c4f-3fc9-4fc4fabf7e29, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acssttea;

    /** ACSSTTEI (uuid:0b97ed20-7de6-b89e-cc37-45b945a76b20, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acssttei;

    /** ACSADL2L (uuid:3cfa71e8-ad41-f274-e4d8-c9ef9b32a2c8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2l;

    /** ACSADL2F (uuid:4a93f820-820a-ee5e-c4dd-d7cdc5beabf3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2f;

    /** ACSADL2A (uuid:2b945487-6f33-16dc-6e1d-ad34bebba2fc, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2a;

    /** ACSADL2I (uuid:502d81ce-c77a-0ed1-8060-cf8edf12a094, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2i;

    /** ACSZIPCL (uuid:032c4d43-2396-b124-ac4b-eebbeb022a84, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipcl;

    /** ACSZIPCF (uuid:e41e187b-b6b2-6ce2-d29d-6af4484e07f6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipcf;

    /** ACSZIPCA (uuid:a4595641-cb1b-e0fc-9fe3-4d6c553745be, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipca;

    /** ACSZIPCI (uuid:c36cd62e-cd1d-3cd8-60ba-8267a169d702, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipci;

    /** ACSCITYL (uuid:6a9a761e-6809-0639-5467-d3b6fb8697c1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscityl;

    /** ACSCITYF (uuid:981f3f37-1920-cc84-62c9-b4591211ece5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscityf;

    /** ACSCITYA (uuid:b62348b6-6ba2-1d09-9d66-0e8aa9f231ff, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscitya;

    /** ACSCITYI (uuid:a1a6d61e-27c1-c296-1cd8-043296922e00, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscityi;

    /** ACSCTRYL (uuid:d8da3318-2b29-f261-9f1e-549aebcb6f34, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctryl;

    /** ACSCTRYF (uuid:d6f14a33-12a1-eb03-95ea-60b274407cf3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctryf;

    /** ACSCTRYA (uuid:ed40cd70-1c00-0852-0694-d1e4227ea0ba, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctrya;

    /** ACSCTRYI (uuid:ad0fc4ea-afb8-0320-8480-b3e7448d99fa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctryi;

    /** ACSPHN1L (uuid:a8e83086-9c38-3ff4-6c9d-536d82197180, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn1l;

    /** ACSPHN1F (uuid:248036b7-3ec2-0586-4994-0446c0bbfb87, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn1f;

    /** ACSPHN1A (uuid:c59deaa0-54d9-1d21-7762-d6b483575617, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn1a;

    /** ACSPHN1I (uuid:76ac7d13-8b2f-82fa-1851-50665737423d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn1i;

    /** ACSGOVTL (uuid:942b800a-3625-2849-d775-4636b8d9e703, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovtl;

    /** ACSGOVTF (uuid:74217d2f-bd87-4915-a710-bac30cd3eb15, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovtf;

    /** ACSGOVTA (uuid:ff41ac88-64ab-f3f8-9f17-dc8d83741dd2, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovta;

    /** ACSGOVTI (uuid:d5d35dbc-6bd7-0534-3970-4c0cbf76378f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovti;

    /** ACSPHN2L (uuid:a3f1623c-daff-c9e5-0552-365f5f39a361, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn2l;

    /** ACSPHN2F (uuid:a860dbcb-f57e-93c9-50c1-79ff9f052869, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn2f;

    /** ACSPHN2A (uuid:7439496c-4f24-b602-24c4-98f45c90bbde, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn2a;

    /** ACSPHN2I (uuid:dc43b7d8-ddc4-1d07-20c6-45ea55c6ce2b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn2i;

    /** ACSEFTCL (uuid:27113732-382b-eb69-4b1b-e5cc43b6c6e5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftcl;

    /** ACSEFTCF (uuid:7c330fd3-aed0-ec43-f360-df1bb2e3b2bc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftcf;

    /** ACSEFTCA (uuid:9ecf03d2-4280-54d1-15f8-f8dff6050270, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftca;

    /** ACSEFTCI (uuid:369b5035-8d8e-7f5b-b805-a1042102119c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftci;

    /** ACSPFLGL (uuid:5d8132fd-b44c-f42f-d72b-a3ccf0d606a2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflgl;

    /** ACSPFLGF (uuid:44230f33-a1bd-0006-2476-2c032d139c5a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflgf;

    /** ACSPFLGA (uuid:f741ffdd-ad76-f5de-274b-2f4fcf8b50ed, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflga;

    /** ACSPFLGI (uuid:15c5ad4d-e123-bc38-91e9-6ec9b9c55d3c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflgi;

    /** INFOMSGL (uuid:147a10e2-648c-2444-a321-11c511a07031, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgl;

    /** INFOMSGF (uuid:b845c2ac-c2ef-11e4-8f5d-b0b58b618983, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgf;

    /** INFOMSGA (uuid:3de04374-b9ce-2d9f-f95f-fbb8f32304a5, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsga;

    /** INFOMSGI (uuid:7d655e77-53dc-ecd8-e404-4cdc557f8faf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgi;

    /** ERRMSGL (uuid:901e1824-5c73-484d-ba94-a6b5d48c9ad8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgl;

    /** ERRMSGF (uuid:cc3ae9fc-dba7-9e91-1581-f84848b9253f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgf;

    /** ERRMSGA (uuid:0d9d8071-4335-fc46-2f2b-d77e0cc192b4, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsga;

    /** ERRMSGI (uuid:6800f218-4f50-f532-b236-cf233c1d74eb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgi;

    /** CACTVWAO (uuid:26968c4f-ea16-cf42-992e-8d1f61d535d9, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cactvwao;

    /** TRNNAMEC (uuid:6dd9bc7b-e263-2553-0fb4-6b72f3ad1eaf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamec;

    /** TRNNAMEP (uuid:7ab5b074-a263-65dd-69c2-895fb871548c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamep;

    /** TRNNAMEH (uuid:6532cec2-4052-e2af-f8f5-d830e24883aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameh;

    /** TRNNAMEV (uuid:18f6d579-5b28-7d45-9b12-3f6b74f1f1a5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamev;

    /** TRNNAMEO (uuid:d93d030a-9b36-8d9a-dbab-2e0376551c32, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameo;

    /** TITLE01C (uuid:0fa0850c-431e-96e6-c9e0-398d170fdaac, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01c;

    /** TITLE01P (uuid:f3655ef2-4ace-3b69-cf8d-019f597fe104, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01p;

    /** TITLE01H (uuid:eff6f8bf-64ce-2960-792f-72dd726b0d9b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01h;

    /** TITLE01V (uuid:d8a6f6b6-3dde-8f71-2cb3-7249bb632844, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01v;

    /** TITLE01O (uuid:0635eb33-ff62-817e-630c-1ad8fa6ca17a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01o;

    /** CURDATEC (uuid:0ae53665-a540-3a4f-43cf-63f779c5cd7d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatec;

    /** CURDATEP (uuid:57216b7a-cbcc-b69d-be07-41dd1fb076ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatep;

    /** CURDATEH (uuid:158ffdfe-6351-1d9a-3895-702ec6eeb00c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateh;

    /** CURDATEV (uuid:e71b8b8c-d551-cc10-f0c2-0241318c1142, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatev;

    /** CURDATEO (uuid:3b332d5d-ead3-db27-dbb6-a7c40b135848, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateo;

    /** PGMNAMEC (uuid:7c5f5812-e548-a24f-92ab-667ab328319e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamec;

    /** PGMNAMEP (uuid:5063c50f-87ef-2dda-0a55-e6ef0f82495d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamep;

    /** PGMNAMEH (uuid:5f92a7dd-85dd-3514-2d48-a09b7ba42739, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameh;

    /** PGMNAMEV (uuid:fac8c4f7-0dc6-5264-b0f6-855936480c0c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamev;

    /** PGMNAMEO (uuid:585b2bf2-eb77-4aa4-463d-2683b477e690, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameo;

    /** TITLE02C (uuid:3c77d556-fef1-17a1-be31-c9d52535ea95, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02c;

    /** TITLE02P (uuid:98e3dceb-8c4b-7b31-3141-6955757b15c4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02p;

    /** TITLE02H (uuid:235143e0-0a6a-262e-653b-8624f8c2b250, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02h;

    /** TITLE02V (uuid:05d2b16d-0ecd-cfad-8488-13ecb492c318, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02v;

    /** TITLE02O (uuid:6201099a-1ec7-3e1d-65db-79a74896a450, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02o;

    /** CURTIMEC (uuid:bc1273c9-506b-fcbb-858d-2875a9934abd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimec;

    /** CURTIMEP (uuid:3e42ec30-e903-f931-b326-ddcddd89aeb2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimep;

    /** CURTIMEH (uuid:fff3475a-1654-0fb5-4731-6a059319201b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeh;

    /** CURTIMEV (uuid:5a2b3974-737a-0c37-b96b-7d1a962ebb83, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimev;

    /** CURTIMEO (uuid:d58c360c-ca63-989b-e64f-4a4642d70c88, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeo;

    /** ACCTSIDC (uuid:4c89c73f-1c01-1db5-68b1-3f4a22b21ec3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidc;

    /** ACCTSIDP (uuid:c3d10df9-b914-1d33-b388-e6512f915ad6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidp;

    /** ACCTSIDH (uuid:5de22511-4888-e3c3-73d2-4817c23b31f5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidh;

    /** ACCTSIDV (uuid:a6fb7984-2e49-428f-16dd-89aca552b1fa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidv;

    /** ACCTSIDO (uuid:63366024-54bc-ee68-9b31-27f4f94b6c2a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsido;

    /** ACSTTUSC (uuid:041368ac-6b2e-9346-2753-525e42fb63df, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttusc;

    /** ACSTTUSP (uuid:4a94a3d9-a83b-bda4-69fd-3800ace71a63, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttusp;

    /** ACSTTUSH (uuid:7f2510e4-db49-4e26-c87d-c4820c4c0b8c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttush;

    /** ACSTTUSV (uuid:3d8dfd18-a671-b3d5-933a-76460c37f743, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttusv;

    /** ACSTTUSO (uuid:fa264a93-70b0-194c-df1e-156bac168e19, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttuso;

    /** ADTOPENC (uuid:a5e42cef-b24a-db03-71c1-161b6f3bf94f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ adtopenc;

    /** ADTOPENP (uuid:d77bd2d3-4614-b563-8464-ce6b16ce1da7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ adtopenp;

    /** ADTOPENH (uuid:89f1728c-96d9-5fc3-0d0e-d5ae2a0b175f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ adtopenh;

    /** ADTOPENV (uuid:bf21f27f-b339-e94b-ba08-992754cdaf75, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ adtopenv;

    /** ADTOPENO (uuid:36a7de2e-365e-6a27-80b3-f4c355279092, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ adtopeno;

    /** ACRDLIMC (uuid:1410bada-9ae6-0ee6-3869-02cc178011b9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdlimc;

    /** ACRDLIMP (uuid:3251fd8e-25a5-933b-be99-c65468168042, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdlimp;

    /** ACRDLIMH (uuid:310c634c-f446-1cf6-e702-1bc17f8c81f8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdlimh;

    /** ACRDLIMV (uuid:ae1dd19e-25fb-9033-7998-28d4ea0899f1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdlimv;

    /** ACRDLIMO (uuid:a4331e15-864b-54f4-2dcf-2c824d94667d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdlimo;

    /** AEXPDTC (uuid:e6483c86-57f8-70e5-d653-fb88bbda58d8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aexpdtc;

    /** AEXPDTP (uuid:34235338-9a9a-5db8-5b75-0e4fb471ed82, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aexpdtp;

    /** AEXPDTH (uuid:4e37116e-7fe3-a73e-39a2-7a843b007575, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aexpdth;

    /** AEXPDTV (uuid:1bbbb35e-657a-0a63-b78b-ad76dcadd1bb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aexpdtv;

    /** AEXPDTO (uuid:d8c4fad6-50f1-8eef-ab83-35d483a94aff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aexpdto;

    /** ACSHLIMC (uuid:230ccdcc-60e0-6160-3621-ec1dd60e8e46, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshlimc;

    /** ACSHLIMP (uuid:ff9cb71c-fcc5-3d5b-798a-ebfe987f28de, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshlimp;

    /** ACSHLIMH (uuid:c6fb78cb-a653-7507-44a9-181947d0ea46, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshlimh;

    /** ACSHLIMV (uuid:8ec6868c-f88c-9d61-ca64-ad9247043d7b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshlimv;

    /** ACSHLIMO (uuid:bbfa46cb-3cc4-f8cd-2187-4348607f9e29, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshlimo;

    /** AREISDTC (uuid:8d09e657-8f55-a77e-64f5-c2d301016398, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ areisdtc;

    /** AREISDTP (uuid:fb31ec54-bf3e-c6f8-cfa4-45a286ce2eca, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ areisdtp;

    /** AREISDTH (uuid:5d386e82-763c-c05f-0887-d3f78aab1aef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ areisdth;

    /** AREISDTV (uuid:285c8a09-d17f-a286-969d-9f7a7f8a6a84, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ areisdtv;

    /** AREISDTO (uuid:17b97a9d-33b6-1e06-0c0d-f6385ad6302d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ areisdto;

    /** ACURBALC (uuid:c2485fcb-6a89-0afb-383e-4a5516e791ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurbalc;

    /** ACURBALP (uuid:a5a4ddfb-901d-ac9b-91da-22121b2c0dfc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurbalp;

    /** ACURBALH (uuid:e660150c-df12-077c-e7f7-7b20f426b101, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurbalh;

    /** ACURBALV (uuid:f8c73ec6-25e3-66b5-2a6b-c0c193abf061, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurbalv;

    /** ACURBALO (uuid:b291a30c-7349-cbdf-e33d-d83a2345b483, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurbalo;

    /** ACRCYCRC (uuid:a685afa7-9ee7-fb1a-5fda-e2493aba04f2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycrc;

    /** ACRCYCRP (uuid:3e379638-3344-abe1-1a65-f89c98def65d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycrp;

    /** ACRCYCRH (uuid:99616061-1598-1052-d479-2580acd53481, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycrh;

    /** ACRCYCRV (uuid:3bcd591e-b206-a1d1-e4c4-e47ffc2175eb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycrv;

    /** ACRCYCRO (uuid:9c4575c3-cf7a-e748-579c-2691a767d215, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycro;

    /** AADDGRPC (uuid:bffd634b-72ac-a7b9-0150-f4ef997d8078, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrpc;

    /** AADDGRPP (uuid:98d61aed-7688-8396-8204-624cdd614e26, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrpp;

    /** AADDGRPH (uuid:8e994b81-b247-6efd-7134-d84ea887a45c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrph;

    /** AADDGRPV (uuid:44909741-6b85-7e52-7149-79304c2c7de7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrpv;

    /** AADDGRPO (uuid:fef08ae3-4830-4fc9-a5bc-d4056d00ebed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrpo;

    /** ACRCYDBC (uuid:2ee23cf3-7aac-2cc7-aed9-0c397582cb51, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydbc;

    /** ACRCYDBP (uuid:228a3373-470f-01ea-dfb6-ce91553d0c5a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydbp;

    /** ACRCYDBH (uuid:f807136e-97ca-b412-fd7b-26031ccdd6bf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydbh;

    /** ACRCYDBV (uuid:f12ae49d-4a85-0442-8924-7f142f72de85, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydbv;

    /** ACRCYDBO (uuid:7b660869-8e60-b4d2-f381-6d75d49af3fe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydbo;

    /** ACSTNUMC (uuid:9a619854-e0c0-fc77-2822-c8b7dbe8655a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnumc;

    /** ACSTNUMP (uuid:a13fbbec-da30-accb-2b63-2e2f47da08c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnump;

    /** ACSTNUMH (uuid:1b0d74f4-94bc-929a-5de2-3b7f4b710a15, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnumh;

    /** ACSTNUMV (uuid:1e4a3a6a-8c77-eda1-18c8-d4561394b837, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnumv;

    /** ACSTNUMO (uuid:c8831e19-60fa-4a32-cc75-a4921245b9b8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnumo;

    /** ACSTSSNC (uuid:fa554196-74a8-9957-d5b6-a6869db9b6a1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstssnc;

    /** ACSTSSNP (uuid:7b30c888-a69b-a199-04c9-e50035a6373b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstssnp;

    /** ACSTSSNH (uuid:14bc93fb-f99e-e5c6-68c6-cf58d3c00796, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstssnh;

    /** ACSTSSNV (uuid:9c588a3a-2658-7233-da6f-d51f465e5c57, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstssnv;

    /** ACSTSSNO (uuid:c6a0ffaf-402d-f76a-f963-181483445824, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstssno;

    /** ACSTDOBC (uuid:b4dbca86-6172-4ff3-a54c-b8cf7426ea58, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstdobc;

    /** ACSTDOBP (uuid:c209e1d6-9f68-97b0-54f8-dad158614db4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstdobp;

    /** ACSTDOBH (uuid:915cd2c6-a6be-3873-9cd1-5a967af680d3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstdobh;

    /** ACSTDOBV (uuid:7e354c41-031b-83df-ecf4-7007e4eba8e9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstdobv;

    /** ACSTDOBO (uuid:9b5b496f-f197-3594-86ea-d399ad0a7e27, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstdobo;

    /** ACSTFCOC (uuid:643c9479-0278-fa12-518c-4800aec1e347, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcoc;

    /** ACSTFCOP (uuid:a20dbee1-b5eb-b8f3-9655-160422ac7ce6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcop;

    /** ACSTFCOH (uuid:2b278547-b2d8-5758-82d4-78b61bffd775, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcoh;

    /** ACSTFCOV (uuid:092c66c7-248b-443c-342d-65029f4c2537, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcov;

    /** ACSTFCOO (uuid:a71c67e0-8920-91dd-4cbf-1278e4b971a1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcoo;

    /** ACSFNAMC (uuid:7309b644-19f3-b760-bba7-83f29af039ce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnamc;

    /** ACSFNAMP (uuid:3dde831f-e1e6-170b-2051-f958694717d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnamp;

    /** ACSFNAMH (uuid:e1b574f6-94a1-eaa4-6b99-3fe049dcd001, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnamh;

    /** ACSFNAMV (uuid:0f9e30bc-1c79-79f9-a3c9-9c430c6192b1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnamv;

    /** ACSFNAMO (uuid:5e3d5ca8-b836-4ff3-ecf7-1968d62e3f90, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnamo;

    /** ACSMNAMC (uuid:e41bbbf3-06d6-61a6-21f1-3b72d01025a3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnamc;

    /** ACSMNAMP (uuid:3d3d2a25-6ae8-1cdf-e0c9-4e921d6131c1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnamp;

    /** ACSMNAMH (uuid:1ba72731-0f0b-26c0-33ac-126e23e06aa1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnamh;

    /** ACSMNAMV (uuid:8f7ec93d-e3d4-c52e-2ecb-85d4da18d569, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnamv;

    /** ACSMNAMO (uuid:99eeb0a7-e9ba-1ae4-4cf1-2174d31c3bcf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnamo;

    /** ACSLNAMC (uuid:98c53299-487a-df93-b2ec-2ee37dd5f847, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnamc;

    /** ACSLNAMP (uuid:d8986fd1-3d6d-c85e-ef7c-1aa3a16465e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnamp;

    /** ACSLNAMH (uuid:c965e469-cfea-c127-5411-740b7ba52753, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnamh;

    /** ACSLNAMV (uuid:7e654b9e-7bd2-f4f4-127c-ec8439159d49, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnamv;

    /** ACSLNAMO (uuid:13bc5f77-ec55-70a0-3d35-1ce200a73bc8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnamo;

    /** ACSADL1C (uuid:d0b3422c-b3ab-2476-863a-d1cf5abd59c8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1c;

    /** ACSADL1P (uuid:63bb5698-fcc1-0a97-42ee-dd837bf3c061, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1p;

    /** ACSADL1H (uuid:f46b017a-f1aa-501f-1b53-7656a7d53ffa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1h;

    /** ACSADL1V (uuid:28cd2b27-e52b-961a-132b-7ed74e726f98, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1v;

    /** ACSADL1O (uuid:3fd605e2-662b-85e4-96af-2a494e30625e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1o;

    /** ACSSTTEC (uuid:c3aec75f-b48b-2c0c-c3d2-acb616d365e8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acssttec;

    /** ACSSTTEP (uuid:e7c8ecce-0f25-159f-afb7-f597724d0aca, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acssttep;

    /** ACSSTTEH (uuid:4b578c30-b61c-f7fe-3e28-e6fd65037bed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsstteh;

    /** ACSSTTEV (uuid:89a1e646-3c08-62df-ddde-bc8abdc20f91, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acssttev;

    /** ACSSTTEO (uuid:230919bc-e312-0828-f696-5943cd4365e2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsstteo;

    /** ACSADL2C (uuid:8184fbf4-bbc5-d60d-4659-d664746bd1a9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2c;

    /** ACSADL2P (uuid:b94f7fdb-076d-da73-5e92-0a708eac33ab, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2p;

    /** ACSADL2H (uuid:e9630f5b-a352-55bc-c9fd-b7581615953c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2h;

    /** ACSADL2V (uuid:a2d3709f-d8df-957b-6805-3abe14d74c88, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2v;

    /** ACSADL2O (uuid:7fc0f00e-bd5c-99fb-4a47-e5a6ce9307df, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2o;

    /** ACSZIPCC (uuid:9766d77b-712f-675c-ff8c-b66a4dc2f3f6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipcc;

    /** ACSZIPCP (uuid:f8b9e8a6-4fc5-4062-ac95-af6b80c133dc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipcp;

    /** ACSZIPCH (uuid:71a82167-00ce-28d4-04ff-ae0908a47488, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipch;

    /** ACSZIPCV (uuid:9318dd9b-152a-ac3f-facb-67f927b62e84, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipcv;

    /** ACSZIPCO (uuid:d9a984c9-9f79-7a06-ffc0-96639b13e40a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipco;

    /** ACSCITYC (uuid:919c1c0e-ce6f-f9fe-2356-cb1460635823, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscityc;

    /** ACSCITYP (uuid:4bab45cd-f725-7cd3-131b-bc33a4372987, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscityp;

    /** ACSCITYH (uuid:ad7f95f6-0d9e-6abf-7799-8ba7bf29acac, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscityh;

    /** ACSCITYV (uuid:129e06a4-aecc-e819-1158-af49cd169381, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscityv;

    /** ACSCITYO (uuid:b27cddef-a746-22f4-bd03-4ebcbe297f25, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscityo;

    /** ACSCTRYC (uuid:1830a349-8195-82b1-4765-3eb5b87a0a2d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctryc;

    /** ACSCTRYP (uuid:f5d5fdbb-b94b-bfd1-fd14-0a80d08af960, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctryp;

    /** ACSCTRYH (uuid:5f827ca3-a691-1890-8ece-c3c1d3ea7e33, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctryh;

    /** ACSCTRYV (uuid:434227ad-0130-6f74-e7aa-62d1d13bdc07, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctryv;

    /** ACSCTRYO (uuid:92ceb0a8-b84b-6beb-8923-d159151d8200, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctryo;

    /** ACSPHN1C (uuid:e0fb5dec-3ef0-49cb-48d3-db5ca08e7577, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn1c;

    /** ACSPHN1P (uuid:19af16f1-f723-0666-58a8-40d06db14d53, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn1p;

    /** ACSPHN1H (uuid:7c5a860c-0fb5-8827-8f53-ca336b87b770, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn1h;

    /** ACSPHN1V (uuid:7a87131b-f0b5-619c-9966-fe754025fa56, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn1v;

    /** ACSPHN1O (uuid:15690023-32d9-8585-eed6-a769435c9bdb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn1o;

    /** ACSGOVTC (uuid:40897015-d79e-c9b6-0810-5af0cad87867, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovtc;

    /** ACSGOVTP (uuid:fd6bb580-ef13-c2b4-c413-658a46cf1488, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovtp;

    /** ACSGOVTH (uuid:62d06bab-9bab-0bbf-c7b0-d4a80945362b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovth;

    /** ACSGOVTV (uuid:ddcc5ae1-1641-9bf6-ff89-4a6de1e7d209, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovtv;

    /** ACSGOVTO (uuid:baa19031-0787-d163-aace-99e30fa5aa86, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovto;

    /** ACSPHN2C (uuid:4a7ba61c-c686-e6b0-94c7-96b97c96cc86, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn2c;

    /** ACSPHN2P (uuid:154d2717-db17-3976-ede0-7e62c44139cb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn2p;

    /** ACSPHN2H (uuid:0a65c94b-008e-3fe0-a8a3-2ae4640bc184, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn2h;

    /** ACSPHN2V (uuid:f5e41a17-b00c-f63b-a0bd-b9d767c4953d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn2v;

    /** ACSPHN2O (uuid:a16b0a08-5bc9-e4b4-df01-3b8c4d9a11ef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsphn2o;

    /** ACSEFTCC (uuid:1c08ea35-9638-0172-94ad-bbdb0f84a575, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftcc;

    /** ACSEFTCP (uuid:e258726f-e077-7067-3754-6a174f224324, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftcp;

    /** ACSEFTCH (uuid:e0cea59f-5a3b-8191-f8cd-821cb3188524, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftch;

    /** ACSEFTCV (uuid:07c0a135-0f65-36b0-cb7e-dc266429ceee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftcv;

    /** ACSEFTCO (uuid:5340c93d-f065-e932-3e9d-54f0496f733c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftco;

    /** ACSPFLGC (uuid:28a5222c-4e04-d99c-e365-cebbe8d9d54e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflgc;

    /** ACSPFLGP (uuid:d6c09b72-12e8-0fc0-069f-39fffc5fc358, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflgp;

    /** ACSPFLGH (uuid:39a50538-6c59-14fd-b44a-1bdcbb2ad886, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflgh;

    /** ACSPFLGV (uuid:a6649895-0255-3feb-dad4-4b9a03e8e822, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflgv;

    /** ACSPFLGO (uuid:5049cc9f-5f7d-e34f-0a95-637b398fc016, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflgo;

    /** INFOMSGC (uuid:1a677e78-be8f-d4e2-7cff-2e209ca4c59b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgc;

    /** INFOMSGP (uuid:0f4d46a0-e891-9f59-2453-071864c5f8d0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgp;

    /** INFOMSGH (uuid:825bd14e-b653-f905-1edc-0e91dd4f78ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgh;

    /** INFOMSGV (uuid:59f81418-3f0d-2c85-6b3f-1179a736f237, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgv;

    /** INFOMSGO (uuid:a0c3fb97-5aac-16b0-9d50-4cfaa1ca153d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgo;

    /** ERRMSGC (uuid:9a3ed101-bb77-908d-25a1-5ef287641447, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgc;

    /** ERRMSGP (uuid:6ef875c6-3da1-28f1-4a1e-63bd657b60be, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgp;

    /** ERRMSGH (uuid:2fa2aa72-6509-6b1a-e1e2-bf4619688d13, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgh;

    /** ERRMSGV (uuid:5691c6fc-1a90-0189-d955-bdc75a9ad51f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgv;

    /** ERRMSGO (uuid:58ad0e18-d9dc-0707-76e7-6e193fdb7ac9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgo;

    /** WS-DATE-TIME (uuid:515c532d-92bc-fd13-4426-029f7c0631e9, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:cd17c2b1-b2a9-2b3d-0b84-e91042170895, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:c7768ff4-0747-6bb1-3bd1-af43e4ba8eec, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:5cddcce8-ee96-8b07-4f94-0c7216338515, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:ca010908-604c-5f5c-226c-57d5f5246116, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:3afdd0e4-790b-1952-c179-389240bd8104, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:bf4572d0-b665-add7-51cb-e6a41c0fba41, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:9d930b98-f64e-1569-87da-82ae64e6b6ed, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:3cfcb887-6f3f-dba0-7bcf-3a2ef841ac98, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:6bea8c2f-c3e7-fd7d-14e1-85baf5144580, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:d8d3d8e0-19a8-4f52-1478-7c94afef85a7, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:a9ac162e-94d6-62ff-14bd-7b6aadd77915, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:337ec66c-5b36-6f52-b411-f06fe2244c5e, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:f360986e-6506-567f-5910-19eaf8f3b8ab, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:94c224d0-cdca-6931-b15a-0902cbd60896, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:bebd87f0-47b2-7c45-a601-793ce05c6d90, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:f913abba-3384-3a64-0459-4ae9829796a3, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:f1deff8e-507e-13f4-160c-add5a0846c98, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:6346cd6a-8c72-c02f-942a-48271bec9084, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:0a54d1e5-e28d-521c-2b9c-c9664e6752b8, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:318f63e1-3cc1-8970-7eaf-7f99032736d7, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:d46bee99-b4b3-efac-fb86-04eb87cdb8ea, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:1e995300-24a9-e721-7d0d-635e68670d72, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:676e0d69-8263-a18a-2ec6-a5432cb77f57, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:46ab2214-1f82-4e36-6d88-6aa42c765f36, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:a40fec3a-90b5-7c0f-27c3-a031f8467ce5, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:c6912e71-8d1f-24fe-17a7-1198d2f5a9c9, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:bbd78092-76ba-690a-7251-b2463d6ff2f6, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:15eb0f79-d97d-1185-4eac-b8d827708157, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:7928f66c-2b76-22a2-44aa-4af19ac285eb, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:30c6aa24-d705-8bbb-970a-2d5d9c39b6a5, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:37745635-12b6-9ba3-450e-ec5990ee9c2f, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** ABEND-DATA (uuid:136bc572-a14d-b1dc-b200-43c8a564c2ee, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ abendData;

    /** ABEND-CODE (uuid:9b7f9ca3-b53b-8ee7-66f0-164bfd070e21, level 5, PIC X(4)). */
    public String abendCode;

    /** ABEND-CULPRIT (uuid:c7fa9b26-b13e-615c-da96-6d0f9542cdb1, level 5, PIC X(8)). */
    public String abendCulprit;

    /** ABEND-REASON (uuid:b3593600-3274-91a8-6905-1487a3bc43e5, level 5, PIC X(50)). */
    public String abendReason;

    /** ABEND-MSG (uuid:f1c0465d-c52e-f76f-01bc-baf3a52b2f04, level 5, PIC X(72)). */
    public String abendMsg;

    /** SEC-USER-DATA (uuid:2abc5903-64e5-8749-87d9-6e8823fe32ce, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ secUserData;

    /** SEC-USR-ID (uuid:2f476ba5-2431-078a-1f68-b1168e711830, level 5, PIC X(08).). */
    public String secUsrId;

    /** SEC-USR-FNAME (uuid:e15f3d52-6959-0cd0-f833-1a42fe71b9ee, level 5, PIC X(20).). */
    public String secUsrFname;

    /** SEC-USR-LNAME (uuid:c03cffdc-6dc0-77eb-9ce9-920ff5b2b08b, level 5, PIC X(20).). */
    public String secUsrLname;

    /** SEC-USR-PWD (uuid:333d4597-a8b7-30e3-f599-f56f0baf40ae, level 5, PIC X(08).). */
    public String secUsrPwd;

    /** SEC-USR-TYPE (uuid:99bddab9-5265-1386-ca2b-abfbc14b8797, level 5, PIC X(01).). */
    public String secUsrType;

    /** SEC-USR-FILLER (uuid:1a643b92-d9e7-dcaa-07af-8d8fa9c7a5d4, level 5, PIC X(23).). */
    public String secUsrFiller;

    /** ACCOUNT-RECORD (uuid:4e8e1770-fc99-19be-5782-7f36dadd0a09, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ accountRecord;

    /** ACCT-ID (uuid:2be7473d-98d9-5d29-f05d-2a216a0fbb9f, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ acctId;

    /** ACCT-ACTIVE-STATUS (uuid:12d63d57-781f-27d8-0abc-e9660c316423, level 5, PIC X(01).). */
    public String acctActiveStatus;

    /** ACCT-CURR-BAL (uuid:3ce7eca0-e429-259b-1ce0-930bff1ddbbc, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrBal;

    /** ACCT-CREDIT-LIMIT (uuid:859e8f47-c59e-c851-fb9e-c269b5a59b33, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCreditLimit;

    /** ACCT-CASH-CREDIT-LIMIT (uuid:1942d110-0800-ea26-3350-c67faf9a9261, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCashCreditLimit;

    /** ACCT-OPEN-DATE (uuid:3d7c41d2-42cf-b5c0-b9bb-c101fca307d7, level 5, PIC X(10).). */
    public String acctOpenDate;

    /** ACCT-EXPIRAION-DATE (uuid:14b7156f-9384-30ad-2061-89d57419e947, level 5, PIC X(10).). */
    public String acctExpiraionDate;

    /** ACCT-REISSUE-DATE (uuid:e9ac1497-9934-0e8f-0128-82cd9d921107, level 5, PIC X(10).). */
    public String acctReissueDate;

    /** ACCT-CURR-CYC-CREDIT (uuid:0b4f6fbc-d4bc-0a44-4aa7-46f91fe1c916, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrCycCredit;

    /** ACCT-CURR-CYC-DEBIT (uuid:bfdf8848-1b23-6ab3-230f-cb54cbc11ff0, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrCycDebit;

    /** ACCT-ADDR-ZIP (uuid:1334d1f1-dd04-44a7-6d10-bf257ad36b38, level 5, PIC X(10).). */
    public String acctAddrZip;

    /** ACCT-GROUP-ID (uuid:ff2f8668-6897-d27d-8b09-d71dba650cac, level 5, PIC X(10).). */
    public String acctGroupId;

    /** CARD-RECORD (uuid:9eace314-1198-0cee-641e-ac5c5064fdf9, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardRecord;

    /** CARD-NUM (uuid:e09db947-cb0e-acf7-80c1-a0175947d7b1, level 5, PIC X(16).). */
    public String cardNum;

    /** CARD-ACCT-ID (uuid:1f6b13b1-1229-1f72-40e7-a5304ac01225, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ cardAcctId;

    /** CARD-CVV-CD (uuid:c446f77a-1199-bb31-035d-b7b55769e2bc, level 5, PIC 9(03).). */
    public int /* PIC 9(03). */ cardCvvCd;

    /** CARD-EMBOSSED-NAME (uuid:a156cde8-8884-5737-1078-5b7c7a4c20ea, level 5, PIC X(50).). */
    public String cardEmbossedName;

    /** CARD-EXPIRAION-DATE (uuid:727db9fe-9c65-f62b-d1b1-ec684d9de358, level 5, PIC X(10).). */
    public String cardExpiraionDate;

    /** CARD-ACTIVE-STATUS (uuid:83d248d0-a6b5-a882-108b-dc6bd06f27c0, level 5, PIC X(01).). */
    public String cardActiveStatus;

    /** CARD-XREF-RECORD (uuid:89b12f7a-a039-f76a-582d-3ef932480f20, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardXrefRecord;

    /** XREF-CARD-NUM (uuid:5c80d1b0-f193-8d76-8606-3be0c737c147, level 5, PIC X(16).). */
    public String xrefCardNum;

    /** XREF-CUST-ID (uuid:2279d110-78b4-98cb-672f-ea9607d47b1f, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ xrefCustId;

    /** XREF-ACCT-ID (uuid:5022f10b-8bd5-633d-4764-0abe2de1c57b, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ xrefAcctId;

    /** CUSTOMER-RECORD (uuid:9a7fc2a4-94e6-caa0-a0f0-3d42e7225e8e, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ customerRecord;

    /** CUST-ID (uuid:92963c0b-67bf-e6eb-4a3b-d9f1d4cdc0f5, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ custId;

    /** CUST-FIRST-NAME (uuid:b5d736f1-cec2-56a0-176f-24e8b8795584, level 5, PIC X(25).). */
    public String custFirstName;

    /** CUST-MIDDLE-NAME (uuid:3ae9ecd9-dfd1-19c0-8072-2495c57d9685, level 5, PIC X(25).). */
    public String custMiddleName;

    /** CUST-LAST-NAME (uuid:61804b5b-e3ed-d773-4c21-ef89ce0d1daa, level 5, PIC X(25).). */
    public String custLastName;

    /** CUST-ADDR-LINE-1 (uuid:bd3a96ea-a837-e448-83d9-11a17175d267, level 5, PIC X(50).). */
    public String custAddrLine1;

    /** CUST-ADDR-LINE-2 (uuid:88a8776a-4e8e-78b7-a98d-99cf2932d880, level 5, PIC X(50).). */
    public String custAddrLine2;

    /** CUST-ADDR-LINE-3 (uuid:74bbbf92-8816-a82e-2967-33c04f6488c2, level 5, PIC X(50).). */
    public String custAddrLine3;

    /** CUST-ADDR-STATE-CD (uuid:e0bf64b4-4137-27a1-43e6-bffe61dc6454, level 5, PIC X(02).). */
    public String custAddrStateCd;

    /** CUST-ADDR-COUNTRY-CD (uuid:ae97de15-315c-5f2e-11bd-28fda990fba9, level 5, PIC X(03).). */
    public String custAddrCountryCd;

    /** CUST-ADDR-ZIP (uuid:784d11e9-12a6-d1ea-b593-07789e025d75, level 5, PIC X(10).). */
    public String custAddrZip;

    /** CUST-PHONE-NUM-1 (uuid:b0754bcd-099d-d18d-3288-f98ca2c79900, level 5, PIC X(15).). */
    public String custPhoneNum1;

    /** CUST-PHONE-NUM-2 (uuid:b3dd93c7-0768-a2d7-d1dd-3dbaf86593bb, level 5, PIC X(15).). */
    public String custPhoneNum2;

    /** CUST-SSN (uuid:feeed459-a607-02b6-0a20-c82282ee9375, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ custSsn;

    /** CUST-GOVT-ISSUED-ID (uuid:f1f62c6e-1a57-17fe-4735-605832839449, level 5, PIC X(20).). */
    public String custGovtIssuedId;

    /** CUST-DOB-YYYY-MM-DD (uuid:1b96e98f-d601-f769-1967-b40a6388482d, level 5, PIC X(10).). */
    public String custDobYyyyMmDd;

    /** CUST-EFT-ACCOUNT-ID (uuid:cb533932-6180-c7fa-037c-2753030d9c29, level 5, PIC X(10).). */
    public String custEftAccountId;

    /** CUST-PRI-CARD-HOLDER-IND (uuid:e6bdc350-3afe-a67e-89ff-961a2d7652e1, level 5, PIC X(01).). */
    public String custPriCardHolderInd;

    /** CUST-FICO-CREDIT-SCORE (uuid:59334a84-6723-aba2-697d-1f8c6ef3151a, level 5, PIC 9(03).). */
    public int /* PIC 9(03). */ custFicoCreditScore;


    // --- auto-generated stubs for undeclared references ---
    public Object eibcalen;  // auto-stub for undeclared reference

    /** 0000-MAIN  (uuid:49a03157-9de2-faf6-bf6d-83d4d78f7a35, source lines 1137-1268). */
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
        if ((true /* TODO translate: CCARD-AID-ENTER */) || (true /* TODO translate: CCARD-AID-PFK03 */)) {
            // TODO: translate body for: CCARD-AID-ENTER OR CCARD-AID-PFK03
        }
        if (true /* TODO translate: PFK-INVALID */) {
            // TODO: translate body for: PFK-INVALID
        }
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        if (true /* TODO translate: INPUT-ERROR */) {
            // TODO: translate body for: INPUT-ERROR
        }
    }

    /** COMMON-RETURN  (uuid:a63d3b64-9980-df53-e787-75dc3fcdb3a8, source lines 1269-1282). */
    public void commonReturn() {
        // MOVE WS-RETURN-MSG TO CCARD-ERROR-MSG  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CARDDEMO-COMMAREA TO WS-COMMAREA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-THIS-PROGCOMMAREA TO WS-COMMAREA(LENGTH OF CARDDEMO-COMMAREA, LENGTH OF WS-THIS-PROGCOMMAREA  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 0000-MAIN-EXIT  (uuid:31d9b311-bb4b-8ca7-cc1a-ee14e1fe7534, source lines 1283-1285). */
    public void p0000MainExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 0000-MAIN-EXIT  (uuid:78e455de-138c-5a47-212d-2ec6d564eb9b, source lines 1286-1288). */
    public void p0000MainExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1000-SEND-MAP  (uuid:56c5f1dc-88ce-5521-7ab3-a375b3a8d549, source lines 1291-1300). */
    public void p1000SendMap() {
        // COBOL [PERFORM]: PERFORM 1100-SCREEN-INIT THRU 1100-SCREEN-INIT-EXIT
        // COBOL [PERFORM]: PERFORM 1200-SETUP-SCREEN-VARS THRU 1200-SETUP-SCREEN-VARS-EXIT
        // COBOL [PERFORM]: PERFORM 1300-SETUP-SCREEN-ATTRS THRU 1300-SETUP-SCREEN-ATTRS-EXIT
        // COBOL [PERFORM]: PERFORM 1400-SEND-SCREEN THRU 1400-SEND-SCREEN-EXIT
    }

    /** 1000-SEND-MAP-EXIT  (uuid:fa9ba7d5-b712-271e-48e6-f6b1066fdb45, source lines 1302-1304). */
    public void p1000SendMapExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1100-SCREEN-INIT  (uuid:b93b1ca8-422c-492d-85f3-0eca012927ae, source lines 1306-1330). */
    public void p1100ScreenInit() {
        this.cactvwao = "\u0000";
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF CACTVWAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF CACTVWAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISTRANID TO TRNNAMEO OF CACTVWAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISPGM TO PGMNAMEO OF CACTVWAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF CACTVWAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF CACTVWAO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 1100-SCREEN-INIT-EXIT  (uuid:aed82e72-be3b-260f-5fb8-d497573143b3, source lines 1332-1334). */
    public void p1100ScreenInitExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1200-SETUP-SCREEN-VARS  (uuid:a62d4caf-fa05-fdb4-124e-b84e45a4c4f5, source lines 1335-1410). */
    public void p1200SetupScreenVars() {
        if (java.util.Objects.equals(this.eibcalen, 0)) {
            // TODO: translate body for: EIBCALEN = 0
        }
        if (true /* TODO translate: WS-NO-INFO-MESSAGE */) {
            // TODO: translate body for: WS-NO-INFO-MESSAGE
        }
        // MOVE WS-RETURN-MSG TO ERRMSGO OF CACTVWAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-INFO-MSG TO INFOMSGO OF CACTVWAO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 1200-SETUP-SCREEN-VARS-EXIT  (uuid:5f2d2b65-3fce-2dd5-95be-2c091dceca92, source lines 1412-1414). */
    public void p1200SetupScreenVarsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1300-SETUP-SCREEN-ATTRS  (uuid:a0443f9d-ec23-52ce-ed33-37c51de82346, source lines 1416-1447). */
    public void p1300SetupScreenAttrs() {
        // MOVE DFHBMFSE TO ACCTSIDA OF CACTVWAI  -- identifier MOVE; needs PIC-aware type coercion
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        // MOVE DFHDFCOL TO ACCTSIDC OF CACTVWAO  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: FLG-ACCTFILTER-NOT-OK */) {
            // TODO: translate body for: FLG-ACCTFILTER-NOT-OK
        }
        if ((true /* TODO translate: FLG-ACCTFILTER-BLANK */) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: FLG-ACCTFILTER-BLANK AND CDEMO-PGM-REENTER
        }
        if (true /* TODO translate: WS-NO-INFO-MESSAGE */) {
            // TODO: translate body for: WS-NO-INFO-MESSAGE
        }
    }

    /** 1300-SETUP-SCREEN-ATTRS-EXIT  (uuid:d4f5fbce-104d-b42c-09fb-5004bad64572, source lines 1449-1451). */
    public void p1300SetupScreenAttrsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1400-SEND-SCREEN  (uuid:d16f2c5f-562a-c0bd-be34-b8cd9c024bbf, source lines 1452-1466). */
    public void p1400SendScreen() {
        // MOVE LIT-THISMAPSET TO CCARD-NEXT-MAPSET  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISMAP TO CCARD-NEXT-MAP  -- identifier MOVE; needs PIC-aware type coercion
        // SET CDEMO-PGM-REENTER TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** 1400-SEND-SCREEN-EXIT  (uuid:97a3997a-3631-2d43-e70f-cf48f3b2f23b, source lines 1467-1469). */
    public void p1400SendScreenExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2000-PROCESS-INPUTS  (uuid:92d4aa92-6f30-c94f-ef0a-5e7fd34f21da, source lines 1471-1480). */
    public void p2000ProcessInputs() {
        // COBOL [PERFORM]: PERFORM 2100-RECEIVE-MAP THRU 2100-RECEIVE-MAP-EXIT
        // COBOL [PERFORM]: PERFORM 2200-EDIT-MAP-INPUTS THRU 2200-EDIT-MAP-INPUTS-EXIT
        // MOVE WS-RETURN-MSG TO CCARD-ERROR-MSG  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISPGM TO CCARD-NEXT-PROG  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISMAPSET TO CCARD-NEXT-MAPSET  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISMAP TO CCARD-NEXT-MAP  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 2000-PROCESS-INPUTS-EXIT  (uuid:9b370888-b9bc-845e-b3b9-8f62b89ed314, source lines 1482-1484). */
    public void p2000ProcessInputsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2100-RECEIVE-MAP  (uuid:2f7557f3-33cc-8d88-a7f6-f2fd8bf23753, source lines 1485-1492). */
    public void p2100ReceiveMap() {
        // TODO: implement p2100ReceiveMap.  See uuid:2f7557f3-33cc-8d88-a7f6-f2fd8bf23753
    }

    /** 2100-RECEIVE-MAP-EXIT  (uuid:4501d697-513a-412a-7441-4f549552f735, source lines 1494-1496). */
    public void p2100ReceiveMapExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2200-EDIT-MAP-INPUTS  (uuid:27811e8f-b0b0-02a4-0dea-8ac62653a51e, source lines 1497-1518). */
    public void p2200EditMapInputs() {
        // SET INPUT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET FLG-ACCTFILTER-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if ((true /* TODO translate: ACCTSIDI OF CACTVWAI = '*' */) || (true /* TODO translate: ACCTSIDI OF CACTVWAI = SPACES */)) {
            // TODO: translate body for: ACCTSIDI OF CACTVWAI = '*' OR ACCTSIDI OF CACTVWAI = SPACES
        }
        // COBOL [PERFORM]: PERFORM 2210-EDIT-ACCOUNT THRU 2210-EDIT-ACCOUNT-EXIT
        if (true /* TODO translate: FLG-ACCTFILTER-BLANK */) {
            // TODO: translate body for: FLG-ACCTFILTER-BLANK
        }
    }

    /** 2200-EDIT-MAP-INPUTS-EXIT  (uuid:ffc99ee3-ff64-528f-41ce-02762bbffd17, source lines 1520-1522). */
    public void p2200EditMapInputsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2210-EDIT-ACCOUNT  (uuid:0f075bd2-3099-15dd-73ab-11be6ef52e85, source lines 1524-1556). */
    public void p2210EditAccount() {
        // SET FLG-ACCTFILTER-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.ccAcctId, "\u0000")) {
            // TODO: translate body for: CC-ACCT-ID EQUAL LOW-VALUES OR CC-ACCT-ID EQUAL SPACES
        }
        if ((!this.ccAcctId.toString().matches("-?\\d+(\\.\\d+)?")) || (java.util.Objects.equals(this.ccAcctId, 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */))) {
            // TODO: translate body for: CC-ACCT-ID IS NOT NUMERIC OR CC-ACCT-ID EQUAL ZEROES
        }
    }

    /** 2210-EDIT-ACCOUNT-EXIT  (uuid:d5f90dfb-dfbb-481a-4d3e-fa51cd242662, source lines 1558-1560). */
    public void p2210EditAccountExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9000-READ-ACCT  (uuid:a3cdd110-8261-760b-153e-2c3f0f90bdb0, source lines 1562-1593). */
    public void p9000ReadAcct() {
        // SET WS-NO-INFO-MESSAGE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // MOVE CDEMO-ACCT-ID TO WS-CARD-RID-ACCT-ID  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 9200-GETCARDXREF-BYACCT THRU 9200-GETCARDXREF-BYACCT-EXIT
        if (true /* TODO translate: FLG-ACCTFILTER-NOT-OK */) {
            // TODO: translate body for: FLG-ACCTFILTER-NOT-OK
        }
        // COBOL [PERFORM]: PERFORM 9300-GETACCTDATA-BYACCT THRU 9300-GETACCTDATA-BYACCT-EXIT
        if (true /* TODO translate: DID-NOT-FIND-ACCT-IN-ACCTDAT */) {
            // TODO: translate body for: DID-NOT-FIND-ACCT-IN-ACCTDAT
        }
        // MOVE CDEMO-CUST-ID TO WS-CARD-RID-CUST-ID  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 9400-GETCUSTDATA-BYCUST THRU 9400-GETCUSTDATA-BYCUST-EXIT
        if (true /* TODO translate: DID-NOT-FIND-CUST-IN-CUSTDAT */) {
            // TODO: translate body for: DID-NOT-FIND-CUST-IN-CUSTDAT
        }
    }

    /** 9000-READ-ACCT-EXIT  (uuid:4b20a9d1-0254-0254-b6f1-336428ad95b2, source lines 1595-1597). */
    public void p9000ReadAcctExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9200-GETCARDXREF-BYACCT  (uuid:6e1e5c1f-6831-6ea3-ddd3-9ada5be9b13a, source lines 1598-1645). */
    public void p9200GetcardxrefByacct() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** 9200-GETCARDXREF-BYACCT-EXIT  (uuid:2e14c93a-d1df-6491-5756-8638881d34bc, source lines 1646-1648). */
    public void p9200GetcardxrefByacctExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9300-GETACCTDATA-BYACCT  (uuid:e960e3ce-f55a-5430-5c46-074c64776c0a, source lines 1649-1695). */
    public void p9300GetacctdataByacct() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** 9300-GETACCTDATA-BYACCT-EXIT  (uuid:3363883c-02f4-bc20-2261-ef6d747f4b37, source lines 1696-1698). */
    public void p9300GetacctdataByacctExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9400-GETCUSTDATA-BYCUST  (uuid:651d91ba-3925-07b7-19ac-31303950970f, source lines 1700-1744). */
    public void p9400GetcustdataBycust() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** 9400-GETCUSTDATA-BYCUST-EXIT  (uuid:1634d3ee-9da2-371d-b477-1d63bad1f0b2, source lines 1745-1747). */
    public void p9400GetcustdataBycustExit() {
        // COBOL [EXIT]: EXIT
    }

    /** SEND-PLAIN-TEXT  (uuid:2ab2a03b-c45a-76d7-ff0f-6bbdbd4e55de, source lines 1752-1762). */
    public void sendPlainText() {
        // TODO: implement sendPlainText.  See uuid:2ab2a03b-c45a-76d7-ff0f-6bbdbd4e55de
    }

    /** SEND-PLAIN-TEXT-EXIT  (uuid:64d3768a-b660-27cd-0247-291e77e56b5c, source lines 1763-1765). */
    public void sendPlainTextExit() {
        // COBOL [EXIT]: EXIT
    }

    /** SEND-LONG-TEXT  (uuid:5abdbf63-f008-e6de-3161-ec185c8cc768, source lines 1771-1781). */
    public void sendLongText() {
        // TODO: implement sendLongText.  See uuid:5abdbf63-f008-e6de-3161-ec185c8cc768
    }

    /** SEND-LONG-TEXT-EXIT  (uuid:84d93c2d-334d-e9ac-b672-229448b9e2d6, source lines 1782-1784). */
    public void sendLongTextExit() {
        // COBOL [EXIT]: EXIT
    }

    /** YYYY-STORE-PFKEY  (uuid:5d038d79-6da1-2b35-8b85-1fe23296db7e, source lines 1804-1866). */
    public void yyyyStorePfkey() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
    }

    /** YYYY-STORE-PFKEY-EXIT  (uuid:92b949fe-97f3-1860-2cee-29c908c0cc73, source lines 1867-1869). */
    public void yyyyStorePfkeyExit() {
        // COBOL [EXIT]: EXIT
    }

    /** ABEND-ROUTINE  (uuid:abe2e63b-8ca3-e994-5bf2-a4c7e004b6bd, source lines 1875-1896). */
    public void abendRoutine() {
        if (java.util.Objects.equals(this.abendMsg, "\u0000")) {
            // TODO: translate body for: ABEND-MSG EQUAL LOW-VALUES
        }
        // MOVE LIT-THISPGM TO ABEND-CULPRIT  -- identifier MOVE; needs PIC-aware type coercion
    }

    public static void main(String[] args) {
        new Coactvwc().mainPara();
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
