// Generated from COCRDSLC.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COCRDSLC.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * COCRDSLC (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: COCRDSLC.cbl
 */
public class Cocrdslc {

    /** WS-MISC-STORAGE (uuid:95ad0700-cac6-a9b7-2f45-919432e4a456, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsMiscStorage;

    /** WS-CICS-PROCESSNG-VARS (uuid:d98c0141-e7bc-81a3-585e-bb0ec04bd640, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCicsProcessngVars;

    /** WS-RESP-CD (uuid:c64b8dd4-a6fb-c171-1488-a96c0b1f39b7, level 7, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsRespCd;

    /** WS-REAS-CD (uuid:14b985fb-d5d8-223c-abf2-e219b66785e9, level 7, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsReasCd;

    /** WS-TRANID (uuid:84eff883-4a8d-effb-e4ab-838c72ae8398, level 7, PIC X(4)). */
    public String wsTranid;

    /** WS-INPUT-FLAG (uuid:defdc076-ad7c-79e2-76e1-f41e82b7eb6f, level 5, PIC X(1).). */
    public String wsInputFlag;

    /** WS-EDIT-ACCT-FLAG (uuid:30e2975d-b54a-9c26-0386-f71b8678858c, level 5, PIC X(1).). */
    public String wsEditAcctFlag;

    /** WS-EDIT-CARD-FLAG (uuid:21c71998-eb41-1d34-e5f2-b2e75c77de08, level 5, PIC X(1).). */
    public String wsEditCardFlag;

    /** WS-RETURN-FLAG (uuid:f7fa690f-628d-5acc-e85c-a4ac7c690b8a, level 5, PIC X(1).). */
    public String wsReturnFlag;

    /** WS-PFK-FLAG (uuid:eec7d184-a588-a415-53b8-972f575ced3a, level 5, PIC X(1).). */
    public String wsPfkFlag;

    /** CICS-OUTPUT-EDIT-VARS (uuid:494b5162-0537-ec3a-b17b-c0d045434048, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cicsOutputEditVars;

    /** CARD-ACCT-ID-X (uuid:c598f1b7-ba72-4c19-17e5-e1c1e5cb32d0, level 10, PIC X(11).). */
    public String cardAcctIdX;

    /** CARD-ACCT-ID-N (uuid:d83f704b-b7cf-fe28-510b-fb282e8da7dc, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardAcctIdN;

    /** CARD-CVV-CD-X (uuid:2d514159-27db-eb25-b6ac-16e710f5d8a4, level 10, PIC X(03).). */
    public String cardCvvCdX;

    /** CARD-CVV-CD-N (uuid:527711db-e059-e434-b326-ae5a8836fe87, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardCvvCdN;

    /** CARD-CARD-NUM-X (uuid:890400e5-e904-c5e9-84bb-aa5a3d5fc4e7, level 10, PIC X(16).). */
    public String cardCardNumX;

    /** CARD-CARD-NUM-N (uuid:9046710f-64be-d123-ce1f-ddaa79903903, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardCardNumN;

    /** CARD-NAME-EMBOSSED-X (uuid:220bcb77-6228-30ae-7b22-fbc1943f9823, level 10, PIC X(50).). */
    public String cardNameEmbossedX;

    /** CARD-STATUS-X (uuid:867df1b4-4647-77bf-35a9-d3be0d4f1fba, level 10, PIC X.). */
    public String cardStatusX;

    /** CARD-EXPIRAION-DATE-X (uuid:b867ab45-60d2-3ecb-f30d-2bd3a59ffe4a, level 10, PIC X(10).). */
    public String cardExpiraionDateX;

    /** CARD-EXPIRY-YEAR (uuid:eb901cf5-994c-2db8-1c5d-d04115a23a20, level 20, PIC X(4).). */
    public String cardExpiryYear;

    /** CARD-EXPIRY-MONTH (uuid:89763aa9-1deb-2046-aeff-2a4fcf58d236, level 20, PIC X(2).). */
    public String cardExpiryMonth;

    /** CARD-EXPIRY-DAY (uuid:954b1f6f-4e91-14f0-2326-9716aa359cd6, level 20, PIC X(2).). */
    public String cardExpiryDay;

    /** CARD-EXPIRAION-DATE-N (uuid:81732da2-60e2-9e03-33f8-39982264e789, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardExpiraionDateN;

    /** WS-CARD-RID (uuid:d9a88c7a-fe69-d027-2a12-c4512d3f412b, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCardRid;

    /** WS-CARD-RID-CARDNUM (uuid:70dd3a8a-5161-674e-7c68-e352fc86880a, level 10, PIC X(16).). */
    public String wsCardRidCardnum;

    /** WS-CARD-RID-ACCT-ID (uuid:019ef53a-9267-aafc-ba9e-8970bcd11b20, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ wsCardRidAcctId;

    /** WS-CARD-RID-ACCT-ID-X (uuid:26d829b0-a06e-7ea2-f938-71460911b581, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCardRidAcctIdX;

    /** WS-FILE-ERROR-MESSAGE (uuid:1db11b11-49c4-a4d9-68d0-dc3ca85aaff6, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsFileErrorMessage;

    /** ERROR-OPNAME (uuid:cd5a6b5c-de47-9a65-cd08-4ba977855dd0, level 10, PIC X(8)). */
    public String errorOpname;

    /** ERROR-FILE (uuid:d5b66e36-781d-6c6d-10f9-15f964aaa704, level 10, PIC X(9)). */
    public int /* PIC X(9) */ errorFile;

    /** ERROR-RESP (uuid:7c88dee7-9cdd-7f5c-dfc8-5f726e233e18, level 10, PIC X(10)). */
    public String errorResp;

    /** ERROR-RESP2 (uuid:51f37530-98df-c328-ad1f-eff0c3b56e0c, level 10, PIC X(10)). */
    public String errorResp2;

    /** WS-LONG-MSG (uuid:e6ea2a12-a22c-b57c-4c8c-2e8871202d63, level 5, PIC X(500).). */
    public String wsLongMsg;

    /** WS-INFO-MSG (uuid:ed45930a-6b45-c502-df1f-d3465b99e50b, level 5, PIC X(40).). */
    public String wsInfoMsg;

    /** WS-RETURN-MSG (uuid:c1cbd2ef-7a55-cca5-ef38-cdf893ade41d, level 5, PIC X(75).). */
    public String wsReturnMsg;

    /** WS-LITERALS (uuid:0fae2caa-75ef-5fba-e925-21b71b619917, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsLiterals;

    /** LIT-THISPGM (uuid:af1b71d5-065a-84c5-b8a1-f95bd9e483a3, level 5, PIC X(8)). */
    public String litThispgm;

    /** LIT-THISTRANID (uuid:0f76b693-c7ed-6d3e-d425-4a032432b6e5, level 5, PIC X(4)). */
    public String litThistranid;

    /** LIT-THISMAPSET (uuid:627c24ee-2873-2da9-8cc8-6795f9bcdbd7, level 5, PIC X(8)). */
    public String litThismapset;

    /** LIT-THISMAP (uuid:aae0f3ee-8602-e74c-4c75-cb392584d5f5, level 5, PIC X(7)). */
    public String litThismap;

    /** LIT-CCLISTPGM (uuid:2269556c-9778-0746-cc32-2003008e28b4, level 5, PIC X(8)). */
    public String litCclistpgm;

    /** LIT-CCLISTTRANID (uuid:f712824a-b358-85fa-7055-fdeeacce9539, level 5, PIC X(4)). */
    public String litCclisttranid;

    /** LIT-CCLISTMAPSET (uuid:96634bc2-aa1b-5bb5-64f9-fa25e27bcd12, level 5, PIC X(7)). */
    public String litCclistmapset;

    /** LIT-CCLISTMAP (uuid:a4a798d6-e86a-b4d0-843b-d5532b0bb7bc, level 5, PIC X(7)). */
    public String litCclistmap;

    /** LIT-MENUPGM (uuid:99fb8e23-67c0-32f0-91d1-ac0a1dde5acd, level 5, PIC X(8)). */
    public String litMenupgm;

    /** LIT-MENUTRANID (uuid:15fc8b5b-d62e-582d-bee3-6098a5305044, level 5, PIC X(4)). */
    public String litMenutranid;

    /** LIT-MENUMAPSET (uuid:d04e8bbc-543e-f373-84fb-688464f6e7da, level 5, PIC X(7)). */
    public String litMenumapset;

    /** LIT-MENUMAP (uuid:de617206-125f-86ee-efe0-f0a7da67c4d2, level 5, PIC X(7)). */
    public String litMenumap;

    /** LIT-CARDFILENAME (uuid:743f2ed5-b4ee-0431-2b63-aa77650e79c1, level 5, PIC X(8)). */
    public String litCardfilename;

    /** LIT-CARDFILENAME-ACCT-PATH (uuid:40f4f8ff-26d1-f2b9-a7f3-8455d0350504, level 5, PIC X(8)). */
    public String litCardfilenameAcctPath;

    /** CC-WORK-AREAS (uuid:82969d5b-15a4-37da-3bd0-88e80efa2c12, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccWorkAreas;

    /** CC-WORK-AREA (uuid:5d904c13-682f-9c92-4829-4a0c0f09db63, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccWorkArea;

    /** CCARD-AID (uuid:7f28fe8b-4dd0-b86d-9451-088fea2451f1, level 10, PIC X(5).). */
    public String ccardAid;

    /** CCARD-NEXT-PROG (uuid:8ebf7423-16a3-ef2f-00aa-f06e36aa5465, level 10, PIC X(8).). */
    public String ccardNextProg;

    /** CCARD-NEXT-MAPSET (uuid:18412748-4f0a-f243-53f1-ed6f8e1cd692, level 10, PIC X(7).). */
    public String ccardNextMapset;

    /** CCARD-NEXT-MAP (uuid:66981850-426b-8722-fd5c-b5b2d98c60ef, level 10, PIC X(7).). */
    public String ccardNextMap;

    /** CCARD-ERROR-MSG (uuid:8eaaa527-862b-7990-ec17-d78a04c3c8cb, level 10, PIC X(75).). */
    public String ccardErrorMsg;

    /** CCARD-RETURN-MSG (uuid:e01f8dca-4b37-fb07-ea6e-4cc3afc0b8d4, level 10, PIC X(75).). */
    public String ccardReturnMsg;

    /** CC-ACCT-ID (uuid:7cd93322-ab52-d274-d817-9a7a84c53389, level 10, PIC X(11)). */
    public String ccAcctId;

    /** CC-ACCT-ID-N (uuid:412dc273-ec49-54b1-916d-1c4f6d650514, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ ccAcctIdN;

    /** CC-CARD-NUM (uuid:8fdddb9b-d867-0e74-f4d1-73f6c2252344, level 10, PIC X(16)). */
    public String ccCardNum;

    /** CC-CARD-NUM-N (uuid:bd7fa85a-bc37-29da-c94e-93c304f18442, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ ccCardNumN;

    /** CC-CUST-ID (uuid:83263485-3214-913f-fc29-a10c593889aa, level 10, PIC X(09)). */
    public int /* PIC X(09) */ ccCustId;

    /** CC-CUST-ID-N (uuid:d1a7509b-072c-cbff-fd82-3cad3ffed956, level 10, PIC 9(9).). */
    public int /* PIC 9(9). */ ccCustIdN;

    /** CARDDEMO-COMMAREA (uuid:0d69aece-58a8-0a99-5c6f-01765abbb921, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:44e70424-d730-e57c-65a4-53be7b63fc0e, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:7516262c-793b-b952-db1d-6ec1e2985d5a, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:b534b76b-72b7-198f-9725-4593587ac3f5, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:461b42b8-69ed-fe9f-b71b-b64a34d576ce, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:068dd60e-72ac-565d-5ae6-a7a8a9e5dee9, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:e826f742-5fbd-476b-794c-cc4702bb770d, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:1adea0b8-1307-d344-8716-d7322d5ab0ce, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:590cc822-0af0-cc0c-d1e5-567f2d8128cd, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:6bd538ec-e9d6-04f7-0012-c5993a8b9e8d, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:093c4d31-2438-7963-e017-85e691cfdadf, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:f00c449c-2166-8b68-c12c-0a0bb0756ebb, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:5e31f77b-7371-b92c-7930-b24c504a9081, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:522b660d-737a-c42a-ec00-740e97150d0f, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:d2dd94a7-7d9d-58ea-8ef8-f8737ae0e565, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:f5beb7f3-53d3-b714-1285-59727a10392c, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:b55e440c-4324-b52c-a983-124c98bb413f, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:25bdfb99-1e11-5dea-e6be-67d0d368b83e, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:06c6c56e-69c7-8951-2ab6-4a1e583deb3f, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:0e0b4aaa-e011-ede0-48d4-fea0482b4846, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:e22343a3-6dc1-cad5-7501-5bf31942a52a, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:2fc219a6-d8bf-f4e7-27a3-1513f4474f67, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** WS-THIS-PROGCOMMAREA (uuid:9373dae3-16ec-e0f2-c30c-b5aff3f8d1d1, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsThisProgcommarea;

    /** CA-CALL-CONTEXT (uuid:587c18cf-d060-cfca-12b9-7a9369a1bfd8, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ caCallContext;

    /** CA-FROM-PROGRAM (uuid:590ba1ad-fd28-d97e-3e33-5cf595eb057e, level 10, PIC X(08).). */
    public String caFromProgram;

    /** CA-FROM-TRANID (uuid:7b721b1d-c5f8-335b-81d0-eb37a160ce2d, level 10, PIC X(04).). */
    public String caFromTranid;

    /** WS-COMMAREA (uuid:83fa3bcd-b68f-b965-5f9c-f84d5aeca64e, level 1, PIC X(2000).). */
    public String wsCommarea;

    /** DFHBMSCA (uuid:17a4f249-dbae-bddf-46b5-6d41d326d001, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:73a3e58c-ecd9-5a07-4fd2-35cfabe59c71, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:a9c77b3f-90d2-956f-c931-388fa0c69c37, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:fde83810-e9c3-7481-f9f4-a2f6263a924f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:fad95c83-dd55-1b4d-e973-dc6749f0617a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:aef01b78-2840-01cb-12c9-309fe59ec2ec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:b4fcb7fa-f127-90ad-7d79-14aaa53db3be, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:39c6da15-cad4-30c7-60a4-7c7617d818ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:b2ea3a8e-945d-9103-a86c-8af694f885d5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:7f52c8b9-05f9-681f-4488-548e81f12291, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:edb12535-06ae-760d-23ac-ebcb06e8220e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:94014ba5-99eb-19d9-cb0d-c7e1fdd2706a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:85dd381a-ea9e-2f92-e286-fefb2a64ca8e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:0dcdb3b8-1db4-8d0e-37ad-23ce371d2a12, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:8f98dc11-3c76-d2f3-ae9e-1e32e4f06a7c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:809c8d74-aa3b-9e04-e1ad-dba2554333ce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:bb551d91-f8ab-1397-6b7c-72905961f9f1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:5b032b71-c20f-2331-a6ca-9e8e6251603f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:3a98e7d4-7c2f-ffe9-4fd3-e7678fc644ed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:fdd0a2d3-1386-9f24-9d7b-d35b12cd3a70, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:1a256c46-07e5-7812-7693-2cdf2e1b9526, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:38c35eaf-65ed-99e2-484e-5710cafe0d5c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:dd929345-401b-cfaa-e610-fde8587af1b1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:87ac620d-e8a5-6069-48b5-d09bbfcd91f3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:4a4c95d4-8e90-f098-733a-f0bbca6e69fc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:192c8afc-bd45-56c6-486b-7acaef1a08ef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:daaaf395-090d-bf28-f318-d0351892716d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:88f3e411-78de-124d-5e59-2fe8f909d20e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:87c93c1c-44de-c4ed-4679-609070b41488, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:79608244-af78-ae04-963e-ce99f832b938, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;

    /** DFHAID (uuid:2f8ea7fd-5e04-1fde-3f38-f52501cd478e, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:3cd18935-a7e5-b7f7-b3aa-0e48d1376720, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:8169959a-a208-a643-3283-d94c6b33749f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:bbe28d6e-338e-3325-9430-ca80013acaf1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:550d2abe-ab62-6e1e-0e75-302fc3f74eb4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:45d11ea0-b7f5-0883-5b05-765f03d6d211, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:370cfff6-4d68-297b-ef22-aae23d63a303, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:bcb56ecb-212d-b1a8-7a5e-eea6a6d3b7c6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:ba017a2f-b22c-e9de-f2fc-52c54eaa9695, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:c94fcd6d-e043-4621-3724-705fcd128a3d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:4e9f35c7-a0f5-1dd2-cbac-f94454970abb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:4e6ea1ea-ee2a-c702-7f11-3b20a80b999d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:12601e5e-9c5a-df6c-c575-735ae21b3164, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:5f7c0d7f-df7b-f761-a27a-87f457c71f32, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:09790ad2-cd8a-a31c-1f52-2e1552596980, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:d8887c57-172c-02b9-0813-86379040bba4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:13d5bb80-0087-64a5-6cc3-3472e427cbc1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:ec2c2ad1-fd6e-864e-5b58-108f688fd6ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:9cc51ba0-9e59-17ec-5ae6-b84a86ebf8aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:89eae01b-0fad-7f41-bb1d-b67886b582db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:04cf4462-768c-3652-b22d-cac6c212404c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:bec1e7dc-acbf-c7ad-f821-48cdb29fb870, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:925473c2-c312-258d-ff64-8118b6ecbe4d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:f577f91a-2ed1-4af5-aefd-2a08a9af870a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:6f2c031b-7d12-62fc-72cd-5adedc09899e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:6a6a9891-8873-4c44-76a4-0346bb2a80c4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:6ad99755-5d90-03e0-c8f7-c384e078dc87, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:4e5e1bdb-ee95-c335-2222-839ee39e2f34, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:ff44eab6-d9c5-b1d6-3d42-6b043225bed7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:a572a046-3b14-8252-cff5-0d3276625695, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:dd5c38d4-f979-3c76-3b9c-b6c299cad0f5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:9c953133-1bab-f383-655b-29a0f61de63e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:9c4d7569-5fb0-5e77-24f3-fd0d4953bcb0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:b87b828b-b5ca-362d-fe2b-bb7cd39e3dae, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:2b5d4302-5876-d402-e9a3-c9aaf2e7db6e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:194685d3-e9f7-3744-1001-be9eabfa79bd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:3e07b6b8-088d-4f7f-f47b-e7043f46641a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** CCDA-SCREEN-TITLE (uuid:04528636-79ea-bcbd-e360-6e551166bb47, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:09aedcfd-daa7-f9b8-e7eb-022b2e923bf3, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:b26aae28-9d30-f32e-6eaf-660b8dea1ca3, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:f56ce159-9765-5ab4-3451-85a17f4249a8, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** CCRDSLAI (uuid:4ffdac4a-5140-7e57-6943-3b329fd55d7e, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccrdslai;

    /** TRNNAMEL (uuid:2f473a5a-51ad-45cb-31eb-7fa223b28ad3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamel;

    /** TRNNAMEF (uuid:540854ee-c5bc-1562-a5bc-c0787e8c1f1d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamef;

    /** TRNNAMEA (uuid:ee0cfc5e-b772-8aa0-6587-3b9686065619, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamea;

    /** TRNNAMEI (uuid:6a101689-bc9a-a658-eb23-694000d56dc8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamei;

    /** TITLE01L (uuid:e1225bb0-3119-68ff-30cc-73a2062b4c4b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01l;

    /** TITLE01F (uuid:f0808754-5b18-d087-595a-3d53a522abae, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01f;

    /** TITLE01A (uuid:f5fa0955-e23b-31b9-80ee-65f4660474bc, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01a;

    /** TITLE01I (uuid:b1157225-99ea-94ef-a7ea-af555f7c2d93, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01i;

    /** CURDATEL (uuid:945fa218-479a-7760-d5f5-8ee19f314475, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatel;

    /** CURDATEF (uuid:b225c76d-99b9-945c-54fb-41560fb3fa89, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatef;

    /** CURDATEA (uuid:fce6c4c0-0e1b-d192-09c9-f79c827918b0, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatea;

    /** CURDATEI (uuid:ef59fb42-5aa0-b4de-714b-7f3cd67fd806, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatei;

    /** PGMNAMEL (uuid:0f73fbe3-15eb-31e7-9771-45f09f10c3db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamel;

    /** PGMNAMEF (uuid:1ec23a30-4450-3160-5dc9-6fc7ff6ee70c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamef;

    /** PGMNAMEA (uuid:4c08480c-3994-5653-c151-1ecc0d75e4b7, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamea;

    /** PGMNAMEI (uuid:d577a63f-5933-2b5c-dbf9-3e9d56bb41b3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamei;

    /** TITLE02L (uuid:48c2550f-5d08-0b79-b1ef-2417e169aea6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02l;

    /** TITLE02F (uuid:1a628214-5d25-311f-4668-c0a6954704fb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02f;

    /** TITLE02A (uuid:69bf7999-a9cb-f51a-1392-c543a4f3a8bf, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02a;

    /** TITLE02I (uuid:ab0fc1ae-59f4-4421-0bce-8cbbb35997a0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02i;

    /** CURTIMEL (uuid:ca4f9a88-9a5a-5ae0-b87d-5e187dc05f4f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimel;

    /** CURTIMEF (uuid:9d12fd32-e2aa-1b9e-b924-3047f05f1793, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimef;

    /** CURTIMEA (uuid:f519f07d-b428-5be5-0671-eb27e775575c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimea;

    /** CURTIMEI (uuid:4b997eac-ff10-9079-c883-d82a69985ad2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimei;

    /** ACCTSIDL (uuid:eb3227fb-ad28-3e5b-319a-61a7c471c387, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidl;

    /** ACCTSIDF (uuid:1afb60e6-8dd7-c8df-a2f9-b65f413ea557, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidf;

    /** ACCTSIDA (uuid:99e0a6a5-e3d3-59ff-6185-bbb20485129e, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsida;

    /** ACCTSIDI (uuid:513b419c-d94f-0456-4bef-dc4212a1ddb4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidi;

    /** CARDSIDL (uuid:655f5f76-07e4-b930-b988-306bef8a9899, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidl;

    /** CARDSIDF (uuid:bf3f4d35-2405-5212-ded9-0bd98508ebfa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidf;

    /** CARDSIDA (uuid:c59f6193-bf44-33de-e915-f8303f0a46d1, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsida;

    /** CARDSIDI (uuid:15b9957e-7e51-dc73-f131-415c80a2c1e4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidi;

    /** CRDNAMEL (uuid:35d59af3-b3cd-c9f5-9bec-8cc3f7332690, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnamel;

    /** CRDNAMEF (uuid:cba6f795-65de-c895-3cdd-77c115c51803, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnamef;

    /** CRDNAMEA (uuid:236e9a38-a907-acc7-11c2-ce9d95065cb3, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnamea;

    /** CRDNAMEI (uuid:f9ae0e82-0cc8-2bc5-4367-ea11f54d2b20, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnamei;

    /** CRDSTCDL (uuid:9b746b6c-dbde-6a3a-659e-7909f0bd77c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcdl;

    /** CRDSTCDF (uuid:d7659e3f-64b2-f8ba-5c7f-17c52e305e63, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcdf;

    /** CRDSTCDA (uuid:453251a7-9b78-728c-1de2-146ec0ae3ab4, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcda;

    /** CRDSTCDI (uuid:577ffaa2-3ad8-bd86-0885-234642b92ca9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcdi;

    /** EXPMONL (uuid:4ee535f3-516a-07e7-291a-4e14a7bd774e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonl;

    /** EXPMONF (uuid:25a1cc93-60ba-b311-50df-5552ba0fbfe7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonf;

    /** EXPMONA (uuid:9ffbb7b4-c43d-310c-6f87-c7d784bf4ef1, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmona;

    /** EXPMONI (uuid:d51a197d-0984-d874-eca9-3bcf318434d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmoni;

    /** EXPYEARL (uuid:4c7a9a47-bbf0-8ea2-0051-6e1500a05186, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearl;

    /** EXPYEARF (uuid:887c03ab-a6d0-d217-0574-2e375e00a6ec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearf;

    /** EXPYEARA (uuid:28ebe106-1285-bf2a-e550-2f7b08d4c6b2, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyeara;

    /** EXPYEARI (uuid:7c0fcd5a-2485-8dec-81e6-d93ce938bb25, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyeari;

    /** INFOMSGL (uuid:d6a0b7f0-a981-e5ee-4bba-b6c43038b4b0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgl;

    /** INFOMSGF (uuid:09e77c4d-1fab-033d-ecde-3dea92951feb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgf;

    /** INFOMSGA (uuid:6acf1a86-c7ba-47c0-f881-de1b2079879e, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsga;

    /** INFOMSGI (uuid:26ea2a91-5886-24af-5147-97c00524bc99, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgi;

    /** ERRMSGL (uuid:3c243c83-5084-32fa-27b3-61fa5b571033, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgl;

    /** ERRMSGF (uuid:9a844a3a-1361-103c-1a32-040633782f89, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgf;

    /** ERRMSGA (uuid:c539eb93-5c1f-e739-780a-ec71180fa276, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsga;

    /** ERRMSGI (uuid:33fea451-b3dc-e865-423e-ab434824b178, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgi;

    /** FKEYSL (uuid:18ad0e16-5de0-8d99-8aba-099a08fd03bc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysl;

    /** FKEYSF (uuid:4d42e8c7-3dd0-a994-6275-29af6a28e546, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysf;

    /** FKEYSA (uuid:56025005-222c-7b8e-2243-f574c8794109, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysa;

    /** FKEYSI (uuid:19d7ec5d-8d10-cd15-d174-d153e67d191b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysi;

    /** CCRDSLAO (uuid:4c294a79-9570-8cd4-dcb3-8670f1db5550, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccrdslao;

    /** TRNNAMEC (uuid:e54e365a-3035-b314-5942-dd239dcdd8e9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamec;

    /** TRNNAMEP (uuid:ad4b8aaa-3f36-e128-bfeb-002645d328b6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamep;

    /** TRNNAMEH (uuid:895b4217-5494-0154-131a-a52d34fa6d9a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameh;

    /** TRNNAMEV (uuid:f918a0d3-cbaf-b1df-5929-aadd11689364, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamev;

    /** TRNNAMEO (uuid:de49ec1f-3b7c-c94d-7152-8e3cd1f55d8d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameo;

    /** TITLE01C (uuid:9f488c6e-3443-df66-53df-ebe1cf52d4c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01c;

    /** TITLE01P (uuid:6cfa0947-ea47-ba91-d006-2737edf93816, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01p;

    /** TITLE01H (uuid:8a534419-992f-fc70-2584-e38938715600, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01h;

    /** TITLE01V (uuid:9e4d5832-4214-f86f-f160-e0e5b29f6613, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01v;

    /** TITLE01O (uuid:802084b0-8572-5bb6-7afb-7933b095fbbf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01o;

    /** CURDATEC (uuid:8b67e11a-bc54-7303-f206-e24224887b49, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatec;

    /** CURDATEP (uuid:26f32171-83c0-60f4-893d-f1a563fbcb1c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatep;

    /** CURDATEH (uuid:77dac098-75d8-9168-ab0f-1f50f0a69a4c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateh;

    /** CURDATEV (uuid:a3de3672-12c1-7e37-f2c5-c5aec6ef1c06, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatev;

    /** CURDATEO (uuid:660ecda8-efc8-89c5-72e0-0afcb9e6170b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateo;

    /** PGMNAMEC (uuid:893fa65c-50e6-497d-35e7-0580ec84c194, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamec;

    /** PGMNAMEP (uuid:191df59a-7529-7da0-0349-2f180ee670d9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamep;

    /** PGMNAMEH (uuid:0a4fe349-9975-1eb0-9614-def10141d7d8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameh;

    /** PGMNAMEV (uuid:c7019ed1-eeaf-cc0b-43b7-d2c32f9979de, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamev;

    /** PGMNAMEO (uuid:22f331cd-da4f-2963-9882-89e1ff8202d3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameo;

    /** TITLE02C (uuid:f71c7abe-27ab-9206-f45b-dc8a3c81874c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02c;

    /** TITLE02P (uuid:a6a69ff7-dafe-920e-89aa-9c008fa3f8f5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02p;

    /** TITLE02H (uuid:4e1b89e9-216b-a93f-2fe4-415342a8257c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02h;

    /** TITLE02V (uuid:732aa7fc-a708-10c1-59da-02c4e401d9c7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02v;

    /** TITLE02O (uuid:a50102aa-2aae-e3ff-7135-ac5d3de3964a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02o;

    /** CURTIMEC (uuid:bb676910-2698-f582-9148-42382ea41ae2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimec;

    /** CURTIMEP (uuid:d85c5143-4793-5d0e-7447-1ac6d74abbd2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimep;

    /** CURTIMEH (uuid:0080f1bb-ed81-0930-cd62-addb02691191, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeh;

    /** CURTIMEV (uuid:a7bfdc13-3cc9-a147-6292-cf085b3d7201, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimev;

    /** CURTIMEO (uuid:04f99580-aab6-2a14-7196-96a1baaab2b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeo;

    /** ACCTSIDC (uuid:bf0a034d-fcd1-c6d8-99b8-8c3c1f19899e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidc;

    /** ACCTSIDP (uuid:4a4921ad-22f7-988f-a2b5-3075c7ce2f8e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidp;

    /** ACCTSIDH (uuid:7d3ec736-06e2-3c40-0ec4-c64ab45a2b61, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidh;

    /** ACCTSIDV (uuid:5883bc02-9c9a-0e1b-f92c-d87feb256e05, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidv;

    /** ACCTSIDO (uuid:f0110266-ff18-e307-8225-817e7608aaac, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsido;

    /** CARDSIDC (uuid:377f30b2-74f5-92bb-6168-33569c252127, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidc;

    /** CARDSIDP (uuid:a318a195-91e6-e3df-07c0-4503d562d475, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidp;

    /** CARDSIDH (uuid:636a46ed-40df-9173-f09a-441261b712d0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidh;

    /** CARDSIDV (uuid:a250c106-cf8d-5699-6007-30570287b6cc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsidv;

    /** CARDSIDO (uuid:1e77c2f5-b361-03b1-5311-b5f88f4d8e61, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardsido;

    /** CRDNAMEC (uuid:337c9ac4-c81a-5c89-2a0b-9bdaa9f0f3dd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnamec;

    /** CRDNAMEP (uuid:cbc6cf6f-9671-5fa0-c13c-01b40612ffeb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnamep;

    /** CRDNAMEH (uuid:29cb9c7d-b6f4-8ee2-b1a7-575851eac38c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnameh;

    /** CRDNAMEV (uuid:c3452b2e-022b-c421-4ba9-2635fb46328e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnamev;

    /** CRDNAMEO (uuid:38e32aa2-c788-e72b-fc9b-7a429888e67a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdnameo;

    /** CRDSTCDC (uuid:57279f05-3687-468a-4879-9322312a7d0e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcdc;

    /** CRDSTCDP (uuid:a0dad4b4-1889-9ace-7dd7-d391e5460d57, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcdp;

    /** CRDSTCDH (uuid:5413d73b-7411-9200-2fb1-909968646aae, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcdh;

    /** CRDSTCDV (uuid:46fc7a4c-e181-a4a7-16e7-aaa2d44b55c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcdv;

    /** CRDSTCDO (uuid:85a9f2e8-31d1-5a78-7d16-4e95798868e2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ crdstcdo;

    /** EXPMONC (uuid:9727460f-ea36-55fa-d9f6-9806fa4f1ead, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonc;

    /** EXPMONP (uuid:27efcc86-a9a5-4674-11bb-7b982e1eaef3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonp;

    /** EXPMONH (uuid:bb669aad-1115-ceb1-c0d1-33eee4cea09c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonh;

    /** EXPMONV (uuid:a8121ba2-8a68-2d6e-2f38-38f5e68adb94, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonv;

    /** EXPMONO (uuid:84a7e5d8-fba1-9c89-951b-a979ae4b6aa4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmono;

    /** EXPYEARC (uuid:6f94f3c1-59db-cae8-b85a-8e2c848eb89f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearc;

    /** EXPYEARP (uuid:5ccd1a79-a436-3b37-3c95-cd4576a946b5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearp;

    /** EXPYEARH (uuid:60808119-b4a8-c33a-29e9-3a354d41d892, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearh;

    /** EXPYEARV (uuid:ec6369c1-883f-e7b4-d4f9-7457c4b2d13f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearv;

    /** EXPYEARO (uuid:4c3b0143-348c-42e9-6d40-98f6280547eb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearo;

    /** INFOMSGC (uuid:85f00899-53ce-3172-a3d4-4ab7b384ad54, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgc;

    /** INFOMSGP (uuid:1edf5c84-8f82-11e4-41de-d68bd2ac7395, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgp;

    /** INFOMSGH (uuid:405cf40d-5b54-94db-224b-f81a0cc181de, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgh;

    /** INFOMSGV (uuid:7644d1bb-f9e4-eecb-b691-a9656f7572de, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgv;

    /** INFOMSGO (uuid:9e5e1f9d-5ff8-ba0f-52e5-685f5615ff9b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgo;

    /** ERRMSGC (uuid:e05be9d8-e3a7-85a4-db95-62a01de98c48, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgc;

    /** ERRMSGP (uuid:8789d3d8-a5f8-3501-9b0a-3027ade941b2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgp;

    /** ERRMSGH (uuid:8d5da097-c017-0d66-876f-61e605bbd072, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgh;

    /** ERRMSGV (uuid:cce410c8-cbe6-a093-b5e7-e85fd62e9c91, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgv;

    /** ERRMSGO (uuid:662ec53c-9cf5-5279-35a6-4b6302a85643, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgo;

    /** FKEYSC (uuid:d6725da7-1a0b-9e21-ba64-5f5a78c5bb66, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysc;

    /** FKEYSP (uuid:44df1791-3cc4-57e0-9ecc-553732c3bab7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysp;

    /** FKEYSH (uuid:fd7220ae-2df4-6cc5-bb6b-d212f83b086e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysh;

    /** FKEYSV (uuid:fa99ab42-bc9e-14b4-c959-e81f979dc872, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysv;

    /** FKEYSO (uuid:64793f49-b457-2c65-7411-8e3e54b19023, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeyso;

    /** WS-DATE-TIME (uuid:25704957-75b9-217c-da5a-b98c604fa026, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:5d129325-a4da-d913-0d78-b252437ad47b, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:9ed4da2f-5f35-0663-954d-5e2575a15717, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:41273c22-f9db-cc5a-d61b-8e21c824e223, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:c5fe0eda-3f07-ec9f-07b7-28870ee9d653, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:1148c1b8-205e-c789-2dab-27fb2ff4fac0, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:a2bd3e9b-2888-9a1d-25dd-039643e60f35, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:1c2356a2-b0a0-a4e9-6270-73712017928a, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:2a5970d0-5cf9-d6ef-1369-13ec6c4da963, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:79762172-e36e-aa18-cb86-929f9108ff58, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:234eff09-0c15-cccd-3efb-64d9e471a89a, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:0d52cdd5-93ba-ca6f-336b-f54b91b5c075, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:9288117a-5df6-aef2-7b46-a848e181fffe, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:add5f88d-5506-663e-0e31-8a96116c37c7, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:17c4e597-3f5b-c9e3-28ce-3463bd279c0b, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:8f1c3fe5-c181-7642-2bd3-8b28aaeeacf2, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:227b005b-e55f-01e7-f127-ebbc6a5f3bdd, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:cbc67d28-5511-1f68-0cb5-ef0d1d144e2c, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:b5179055-f472-cf29-9ed1-d7edb7beea3b, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:c9932c2e-a560-02e6-5f99-ddcbb832bf25, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:c48a15fc-7fa1-33ce-d868-a0e627a8fa47, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:cb1eea66-2790-eb1a-8535-3102dee2daff, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:e35ba99d-07af-a92a-5449-20c8bed0c852, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:1482ae55-8a1e-a92d-ed86-76c7a04efa23, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:f6644907-9c4c-56fb-d55c-bf32a89d8d9d, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:989751e0-de36-ac57-af75-eb4a675b1f79, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:c2a0c66e-8201-f15c-7843-25f1fc68a1a0, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:e572f555-f455-c6ff-7408-e60172c0c934, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:a1a5ae1a-ce61-4b41-f47c-3116a0f7b208, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:921b2c16-7bbb-4591-cf6f-97cfae8935ee, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:4b0bffcd-dcdd-b79d-74ba-7cae32477efc, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:cd915e84-6942-8507-3642-ab096ceb9793, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** ABEND-DATA (uuid:5d9695b1-b2d9-1588-58e8-7bdd82e2456b, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ abendData;

    /** ABEND-CODE (uuid:16a991eb-ecf5-4f5e-1122-8a31b849be29, level 5, PIC X(4)). */
    public String abendCode;

    /** ABEND-CULPRIT (uuid:25e229f1-ae9e-2d62-e48e-ffcd6518ba97, level 5, PIC X(8)). */
    public String abendCulprit;

    /** ABEND-REASON (uuid:52bd46fa-2160-b267-208c-497d142559a7, level 5, PIC X(50)). */
    public String abendReason;

    /** ABEND-MSG (uuid:9a3702a6-0df6-90a0-05ca-77790e2051d8, level 5, PIC X(72)). */
    public String abendMsg;

    /** SEC-USER-DATA (uuid:97a19621-485f-c31d-9660-9a7946b8ce94, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ secUserData;

    /** SEC-USR-ID (uuid:d79235ab-d81f-e208-7fea-2bd76346b703, level 5, PIC X(08).). */
    public String secUsrId;

    /** SEC-USR-FNAME (uuid:d7354b53-7fc5-f278-6681-89f430ef9a0c, level 5, PIC X(20).). */
    public String secUsrFname;

    /** SEC-USR-LNAME (uuid:975ffe44-c46e-5fc6-da62-d7069fedfe7d, level 5, PIC X(20).). */
    public String secUsrLname;

    /** SEC-USR-PWD (uuid:d3be1420-a56e-464b-4f27-2365acf79ad8, level 5, PIC X(08).). */
    public String secUsrPwd;

    /** SEC-USR-TYPE (uuid:3fae3f16-36c3-98a0-af52-26433293a57b, level 5, PIC X(01).). */
    public String secUsrType;

    /** SEC-USR-FILLER (uuid:4f1719ff-00b9-a1d3-377e-f503f38c1ce6, level 5, PIC X(23).). */
    public String secUsrFiller;

    /** CARD-RECORD (uuid:625c268d-e6d0-b4a5-72ab-8f461a215d9b, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardRecord;

    /** CARD-NUM (uuid:3bf485ec-71ba-0e7c-924c-1de1d45a2caa, level 5, PIC X(16).). */
    public String cardNum;

    /** CARD-ACCT-ID (uuid:8652bd53-0af8-492c-57bb-19e898c9c419, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ cardAcctId;

    /** CARD-CVV-CD (uuid:eb353443-643e-f09b-4505-bff6b648a504, level 5, PIC 9(03).). */
    public int /* PIC 9(03). */ cardCvvCd;

    /** CARD-EMBOSSED-NAME (uuid:80d89f8b-9a6b-22ab-d141-be7c96b95eee, level 5, PIC X(50).). */
    public String cardEmbossedName;

    /** CARD-EXPIRAION-DATE (uuid:1a0ed47b-35cc-b783-ce93-492c786931dc, level 5, PIC X(10).). */
    public String cardExpiraionDate;

    /** CARD-ACTIVE-STATUS (uuid:605031c6-6c62-32a7-93fb-f5519786b6dd, level 5, PIC X(01).). */
    public String cardActiveStatus;

    /** CUSTOMER-RECORD (uuid:e2fcc9d6-7dff-d639-8012-b205426b0554, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ customerRecord;

    /** CUST-ID (uuid:89e29b19-7ec8-603c-a156-030853d9a767, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ custId;

    /** CUST-FIRST-NAME (uuid:cfe05bc3-174e-e968-eb14-f0855d0e70a1, level 5, PIC X(25).). */
    public String custFirstName;

    /** CUST-MIDDLE-NAME (uuid:7041be0e-e4fc-c2ef-6dd9-360083ab4cca, level 5, PIC X(25).). */
    public String custMiddleName;

    /** CUST-LAST-NAME (uuid:e2fde3d1-f09f-1027-0393-e59afc5dc693, level 5, PIC X(25).). */
    public String custLastName;

    /** CUST-ADDR-LINE-1 (uuid:d2e9a81d-b748-a81b-c608-fc6a14b6ab0c, level 5, PIC X(50).). */
    public String custAddrLine1;

    /** CUST-ADDR-LINE-2 (uuid:88669d74-9c10-43c2-e18a-88c0451867a6, level 5, PIC X(50).). */
    public String custAddrLine2;

    /** CUST-ADDR-LINE-3 (uuid:67811258-f6ae-eb49-2821-f0edcf3ddea3, level 5, PIC X(50).). */
    public String custAddrLine3;

    /** CUST-ADDR-STATE-CD (uuid:0a388c5b-3c5e-0e41-88f4-90c8ece48137, level 5, PIC X(02).). */
    public String custAddrStateCd;

    /** CUST-ADDR-COUNTRY-CD (uuid:ef2c85d6-eac0-236b-36cf-0d8b0566c467, level 5, PIC X(03).). */
    public String custAddrCountryCd;

    /** CUST-ADDR-ZIP (uuid:c63ec4bd-3a52-19a2-2f12-1d4601f81e63, level 5, PIC X(10).). */
    public String custAddrZip;

    /** CUST-PHONE-NUM-1 (uuid:fbd30877-4c2a-b417-0c33-73285f15f0bd, level 5, PIC X(15).). */
    public String custPhoneNum1;

    /** CUST-PHONE-NUM-2 (uuid:53da0822-7ddb-1c79-724b-b1c520f817fc, level 5, PIC X(15).). */
    public String custPhoneNum2;

    /** CUST-SSN (uuid:60a22244-58bd-3215-0fb4-513bad6c4151, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ custSsn;

    /** CUST-GOVT-ISSUED-ID (uuid:ec00653d-d2f8-f149-357a-2e3360ba7661, level 5, PIC X(20).). */
    public String custGovtIssuedId;

    /** CUST-DOB-YYYY-MM-DD (uuid:b307977f-25cb-b5cf-2746-38fbdd0a458d, level 5, PIC X(10).). */
    public String custDobYyyyMmDd;

    /** CUST-EFT-ACCOUNT-ID (uuid:01d44819-bf89-7c79-1fd9-bf9034f6d300, level 5, PIC X(10).). */
    public String custEftAccountId;

    /** CUST-PRI-CARD-HOLDER-IND (uuid:e752b974-53af-979a-9c7b-96af155b43f9, level 5, PIC X(01).). */
    public String custPriCardHolderInd;

    /** CUST-FICO-CREDIT-SCORE (uuid:d9f4413a-9296-dc76-1267-000475b7317c, level 5, PIC 9(03).). */
    public int /* PIC 9(03). */ custFicoCreditScore;


    // --- auto-generated stubs for undeclared references ---
    public Object eibcalen;  // auto-stub for undeclared reference

    /** 0000-MAIN  (uuid:3c719136-0747-90a6-549d-22d64c4687a9, source lines 828-972). */
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

    /** COMMON-RETURN  (uuid:c34eb051-2315-ef41-c863-ad8c82f45558, source lines 974-987). */
    public void commonReturn() {
        // MOVE WS-RETURN-MSG TO CCARD-ERROR-MSG  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CARDDEMO-COMMAREA TO WS-COMMAREA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-THIS-PROGCOMMAREA TO WS-COMMAREA(LENGTH OF CARDDEMO-COMMAREA, LENGTH OF WS-THIS-PROGCOMMAREA  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 0000-MAIN-EXIT  (uuid:71efc95f-7a1e-664e-c528-3ce49606500e, source lines 988-990). */
    public void p0000MainExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1000-SEND-MAP  (uuid:878b879b-3ae2-955d-6134-8d88fe7fe3f3, source lines 992-1001). */
    public void p1000SendMap() {
        // COBOL [PERFORM]: PERFORM 1100-SCREEN-INIT THRU 1100-SCREEN-INIT-EXIT
        // COBOL [PERFORM]: PERFORM 1200-SETUP-SCREEN-VARS THRU 1200-SETUP-SCREEN-VARS-EXIT
        // COBOL [PERFORM]: PERFORM 1300-SETUP-SCREEN-ATTRS THRU 1300-SETUP-SCREEN-ATTRS-EXIT
        // COBOL [PERFORM]: PERFORM 1400-SEND-SCREEN THRU 1400-SEND-SCREEN-EXIT
    }

    /** 1000-SEND-MAP-EXIT  (uuid:044b44ec-ed15-6294-b153-40c6ebea7c30, source lines 1003-1005). */
    public void p1000SendMapExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1100-SCREEN-INIT  (uuid:96e18fad-a190-cd68-0325-88b2fde6ad26, source lines 1007-1031). */
    public void p1100ScreenInit() {
        this.ccrdslao = "\u0000";
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF CCRDSLAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF CCRDSLAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISTRANID TO TRNNAMEO OF CCRDSLAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISPGM TO PGMNAMEO OF CCRDSLAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF CCRDSLAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF CCRDSLAO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 1100-SCREEN-INIT-EXIT  (uuid:a2276c9f-63e7-b317-276f-c86adfef4257, source lines 1033-1035). */
    public void p1100ScreenInitExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1200-SETUP-SCREEN-VARS  (uuid:5224b055-aad8-8133-6dcf-a864d8c95b17, source lines 1037-1077). */
    public void p1200SetupScreenVars() {
        if (java.util.Objects.equals(this.eibcalen, 0)) {
            // TODO: translate body for: EIBCALEN = 0
        }
        if (true /* TODO translate: WS-NO-INFO-MESSAGE */) {
            // TODO: translate body for: WS-NO-INFO-MESSAGE
        }
        // MOVE WS-RETURN-MSG TO ERRMSGO OF CCRDSLAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-INFO-MSG TO INFOMSGO OF CCRDSLAO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 1200-SETUP-SCREEN-VARS-EXIT  (uuid:e60f3867-cf78-7038-9c64-345c05f0b63d, source lines 1079-1081). */
    public void p1200SetupScreenVarsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1300-SETUP-SCREEN-ATTRS  (uuid:71e8bb64-3740-1e8a-8531-67388b9cda10, source lines 1082-1138). */
    public void p1300SetupScreenAttrs() {
        if (java.util.Objects.equals(this.cdemoLastMapset, this.litCclistmapset)) {
            // TODO: translate body for: CDEMO-LAST-MAPSET EQUAL LIT-CCLISTMAPSET AND CDEMO-FROM-PROGRAM EQUAL LIT-CCLISTPGM
        }
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        if (java.util.Objects.equals(this.cdemoLastMapset, this.litCclistmapset)) {
            // TODO: translate body for: CDEMO-LAST-MAPSET EQUAL LIT-CCLISTMAPSET AND CDEMO-FROM-PROGRAM EQUAL LIT-CCLISTPGM
        }
        if (true /* TODO translate: FLG-ACCTFILTER-NOT-OK */) {
            // TODO: translate body for: FLG-ACCTFILTER-NOT-OK
        }
        if (true /* TODO translate: FLG-CARDFILTER-NOT-OK */) {
            // TODO: translate body for: FLG-CARDFILTER-NOT-OK
        }
        if ((true /* TODO translate: FLG-ACCTFILTER-BLANK */) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: FLG-ACCTFILTER-BLANK AND CDEMO-PGM-REENTER
        }
        if ((true /* TODO translate: FLG-CARDFILTER-BLANK */) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: FLG-CARDFILTER-BLANK AND CDEMO-PGM-REENTER
        }
        if (true /* TODO translate: WS-NO-INFO-MESSAGE */) {
            // TODO: translate body for: WS-NO-INFO-MESSAGE
        }
    }

    /** 1300-SETUP-SCREEN-ATTRS-EXIT  (uuid:bca7aa6e-1729-c6da-83ef-2f4149873625, source lines 1139-1140). */
    public void p1300SetupScreenAttrsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1400-SEND-SCREEN  (uuid:5f5e5891-309c-b2d8-34bb-027ff4bc71a4, source lines 1143-1157). */
    public void p1400SendScreen() {
        // MOVE LIT-THISMAPSET TO CCARD-NEXT-MAPSET  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISMAP TO CCARD-NEXT-MAP  -- identifier MOVE; needs PIC-aware type coercion
        // SET CDEMO-PGM-REENTER TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** 1400-SEND-SCREEN-EXIT  (uuid:a97db29a-1e1b-015b-042a-d4c59b5a8574, source lines 1158-1160). */
    public void p1400SendScreenExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2000-PROCESS-INPUTS  (uuid:79cd1362-b4fe-f359-61a1-108fd2ba4a94, source lines 1162-1171). */
    public void p2000ProcessInputs() {
        // COBOL [PERFORM]: PERFORM 2100-RECEIVE-MAP THRU 2100-RECEIVE-MAP-EXIT
        // COBOL [PERFORM]: PERFORM 2200-EDIT-MAP-INPUTS THRU 2200-EDIT-MAP-INPUTS-EXIT
        // MOVE WS-RETURN-MSG TO CCARD-ERROR-MSG  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISPGM TO CCARD-NEXT-PROG  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISMAPSET TO CCARD-NEXT-MAPSET  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISMAP TO CCARD-NEXT-MAP  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 2000-PROCESS-INPUTS-EXIT  (uuid:aa224473-419b-ad62-2870-0119e0b70252, source lines 1173-1175). */
    public void p2000ProcessInputsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2100-RECEIVE-MAP  (uuid:13caf3b3-a5d9-0dc3-3c5b-88da92596f7d, source lines 1176-1183). */
    public void p2100ReceiveMap() {
        // TODO: implement p2100ReceiveMap.  See uuid:13caf3b3-a5d9-0dc3-3c5b-88da92596f7d
    }

    /** 2100-RECEIVE-MAP-EXIT  (uuid:fc9406e3-1237-985f-681e-a95ab112ada4, source lines 1185-1187). */
    public void p2100ReceiveMapExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2200-EDIT-MAP-INPUTS  (uuid:09763f1d-393b-e9d1-ea5e-b65c704ccdb6, source lines 1188-1221). */
    public void p2200EditMapInputs() {
        // SET INPUT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET FLG-CARDFILTER-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET FLG-ACCTFILTER-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if ((true /* TODO translate: ACCTSIDI OF CCRDSLAI = '*' */) || (true /* TODO translate: ACCTSIDI OF CCRDSLAI = SPACES */)) {
            // TODO: translate body for: ACCTSIDI OF CCRDSLAI = '*' OR ACCTSIDI OF CCRDSLAI = SPACES
        }
        if ((true /* TODO translate: CARDSIDI OF CCRDSLAI = '*' */) || (true /* TODO translate: CARDSIDI OF CCRDSLAI = SPACES */)) {
            // TODO: translate body for: CARDSIDI OF CCRDSLAI = '*' OR CARDSIDI OF CCRDSLAI = SPACES
        }
        // COBOL [PERFORM]: PERFORM 2210-EDIT-ACCOUNT THRU 2210-EDIT-ACCOUNT-EXIT
        // COBOL [PERFORM]: PERFORM 2220-EDIT-CARD THRU 2220-EDIT-CARD-EXIT
        if ((true /* TODO translate: FLG-ACCTFILTER-BLANK */) && (true /* TODO translate: FLG-CARDFILTER-BLANK */)) {
            // TODO: translate body for: FLG-ACCTFILTER-BLANK AND FLG-CARDFILTER-BLANK
        }
    }

    /** 2200-EDIT-MAP-INPUTS-EXIT  (uuid:90596149-6101-accf-11b1-eb107ae0aa71, source lines 1223-1225). */
    public void p2200EditMapInputsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2210-EDIT-ACCOUNT  (uuid:0a6596bb-ffb6-bd28-4c01-f35328a2e275, source lines 1227-1259). */
    public void p2210EditAccount() {
        // SET FLG-ACCTFILTER-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.ccAcctId, "\u0000")) {
            // TODO: translate body for: CC-ACCT-ID EQUAL LOW-VALUES OR CC-ACCT-ID EQUAL SPACES OR CC-ACCT-ID-N EQUAL ZEROS
        }
        if (!this.ccAcctId.toString().matches("-?\\d+(\\.\\d+)?")) {
            // TODO: translate body for: CC-ACCT-ID IS NOT NUMERIC
        }
    }

    /** 2210-EDIT-ACCOUNT-EXIT  (uuid:9e3b416a-8b4a-c5e0-7965-d5f0eb023d5f, source lines 1261-1263). */
    public void p2210EditAccountExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2220-EDIT-CARD  (uuid:98264d41-e046-44a4-2f18-41c109c54b3e, source lines 1265-1300). */
    public void p2220EditCard() {
        // SET FLG-CARDFILTER-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.ccCardNum, "\u0000")) {
            // TODO: translate body for: CC-CARD-NUM EQUAL LOW-VALUES OR CC-CARD-NUM EQUAL SPACES OR CC-CARD-NUM-N EQUAL ZEROS
        }
        if (!this.ccCardNum.toString().matches("-?\\d+(\\.\\d+)?")) {
            // TODO: translate body for: CC-CARD-NUM IS NOT NUMERIC
        }
    }

    /** 2220-EDIT-CARD-EXIT  (uuid:43fbd843-3297-fdce-9aa6-108261a6a54c, source lines 1302-1304). */
    public void p2220EditCardExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9000-READ-DATA  (uuid:415a8a57-18e1-a57a-182a-7a4e31912a98, source lines 1306-1310). */
    public void p9000ReadData() {
        // COBOL [PERFORM]: PERFORM 9100-GETCARD-BYACCTCARD THRU 9100-GETCARD-BYACCTCARD-EXIT
    }

    /** 9000-READ-DATA-EXIT  (uuid:9fb7f81d-1d3f-155c-6466-33d4e277b4c4, source lines 1312-1314). */
    public void p9000ReadDataExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9100-GETCARD-BYACCTCARD  (uuid:68b5428a-21cc-0f32-f5f5-70dca7f590dc, source lines 1316-1353). */
    public void p9100GetcardByacctcard() {
        // MOVE CC-CARD-NUM TO WS-CARD-RID-CARDNUM  -- identifier MOVE; needs PIC-aware type coercion
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** 9100-GETCARD-BYACCTCARD-EXIT  (uuid:5067ab84-1617-0f75-bf68-8e57fe47fb05, source lines 1355-1357). */
    public void p9100GetcardByacctcardExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9150-GETCARD-BYACCT  (uuid:a743cfad-0a4a-b87d-0857-91b3b185056d, source lines 1359-1389). */
    public void p9150GetcardByacct() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** 9150-GETCARD-BYACCT-EXIT  (uuid:3312c2ea-d6a4-574f-0d29-e11834f30bb1, source lines 1390-1392). */
    public void p9150GetcardByacctExit() {
        // COBOL [EXIT]: EXIT
    }

    /** SEND-LONG-TEXT  (uuid:eab2975e-a418-80f1-6e95-d992ddcacaad, source lines 1400-1410). */
    public void sendLongText() {
        // TODO: implement sendLongText.  See uuid:eab2975e-a418-80f1-6e95-d992ddcacaad
    }

    /** SEND-LONG-TEXT-EXIT  (uuid:155a9b11-0f70-ee54-a73d-a5da3ccebbf3, source lines 1411-1413). */
    public void sendLongTextExit() {
        // COBOL [EXIT]: EXIT
    }

    /** SEND-PLAIN-TEXT  (uuid:8bc4eb5d-7dbd-7787-2d41-6f87a721a1ea, source lines 1418-1428). */
    public void sendPlainText() {
        // TODO: implement sendPlainText.  See uuid:8bc4eb5d-7dbd-7787-2d41-6f87a721a1ea
    }

    /** SEND-PLAIN-TEXT-EXIT  (uuid:7311f668-de68-6403-5b74-18d5c22e2a06, source lines 1429-1431). */
    public void sendPlainTextExit() {
        // COBOL [EXIT]: EXIT
    }

    /** YYYY-STORE-PFKEY  (uuid:455ebb87-0019-bd8a-2d1a-df9f9409b694, source lines 1451-1513). */
    public void yyyyStorePfkey() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
    }

    /** YYYY-STORE-PFKEY-EXIT  (uuid:4abc78e8-70c8-e312-b487-8ba420f9b00c, source lines 1514-1516). */
    public void yyyyStorePfkeyExit() {
        // COBOL [EXIT]: EXIT
    }

    /** ABEND-ROUTINE  (uuid:54cc7e41-d360-f129-f8ff-35d2d3bc605e, source lines 1521-1542). */
    public void abendRoutine() {
        if (java.util.Objects.equals(this.abendMsg, "\u0000")) {
            // TODO: translate body for: ABEND-MSG EQUAL LOW-VALUES
        }
        // MOVE LIT-THISPGM TO ABEND-CULPRIT  -- identifier MOVE; needs PIC-aware type coercion
    }

    public static void main(String[] args) {
        new Cocrdslc().mainPara();
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
