// Generated from COMEN01C.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COMEN01C.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * COMEN01C (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: COMEN01C.cbl
 */
public class Comen01c {

    /** WS-VARIABLES (uuid:ee4df6e5-42be-35d3-f038-6002f1ab52dd, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsVariables;

    /** WS-PGMNAME (uuid:13d7fe9e-6c5a-2934-1ac3-9d1e551f324d, level 5, PIC X(08)). */
    public String wsPgmname;

    /** WS-TRANID (uuid:ce8a64a8-f121-c97c-9794-2f99b030599d, level 5, PIC X(04)). */
    public String wsTranid;

    /** WS-MESSAGE (uuid:e3f4e59c-1e5b-0fab-7ff8-c1445735d85a, level 5, PIC X(80)). */
    public String wsMessage;

    /** WS-USRSEC-FILE (uuid:ff563129-01fc-ed10-2a81-2a45cee8e8c7, level 5, PIC X(08)). */
    public String wsUsrsecFile;

    /** WS-ERR-FLG (uuid:e32bdab9-0f12-16d8-6e8b-21a4fda61149, level 5, PIC X(01)). */
    public String wsErrFlg;

    /** WS-RESP-CD (uuid:2d650f9c-c12e-4f91-ce8d-d930904d893f, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsRespCd;

    /** WS-REAS-CD (uuid:99d27d05-086c-527b-2ca9-29069de4fee9, level 5, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsReasCd;

    /** WS-OPTION-X (uuid:8cda7ec5-f92b-c04f-bccf-c6dd1500c06b, level 5, PIC X(02)). */
    public String wsOptionX;

    /** WS-OPTION (uuid:aeeab5b8-2450-8d44-bfbd-475ab0a22638, level 5, PIC 9(02)). */
    public int /* PIC 9(02) */ wsOption;

    /** WS-IDX (uuid:875c0fb8-9633-f88c-b0f4-24a9741334ac, level 5, PIC S9(04) COMP). */
    public int /* PIC S9(04) signed */ wsIdx;

    /** WS-MENU-OPT-TXT (uuid:630a7408-9ad1-c5b2-745a-b88314616a35, level 5, PIC X(40)). */
    public String wsMenuOptTxt;

    /** CARDDEMO-COMMAREA (uuid:e9a34821-a0af-fb6c-ddb3-c8e728cc30bc, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:d46c821e-97ef-2c58-4515-b2bed5029e49, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:e31c073c-24c3-15c6-fdb7-f8c8a2697659, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:fbf7d1bc-779b-c0d9-5b40-7bd3a53cd0b6, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:cd4aa675-9832-c6df-e363-a38003215a60, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:b9289bda-1be9-976d-0b66-5f030bf1812c, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:ea90baad-3509-4b5d-a448-2797dcbf144c, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:284f88d3-316a-875d-8afe-8d50639f177c, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:14ad51e4-907d-6a45-2468-caa0bb52ff28, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:f5123525-277b-cd8e-3466-6141063d4c1a, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:8f8d5aa7-f42c-4e3a-3a5b-96cfb58b34dd, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:31504f8f-fe40-087d-db24-20c2bbf1cae3, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:93cf29e4-45bb-e091-7888-c46829be96c8, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:7cf9211e-c828-4d8f-c4b9-e592b6d18de5, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:80d4775e-07b9-6736-2236-0958f036a21a, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:e1441b05-6f65-f0d6-3322-361520e7e34d, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:939a8560-414b-80e0-e860-d559202f8832, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:f5d28192-197d-2a86-318c-495792ade745, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:f86a1014-dfae-3f5d-addf-9ca2af46245a, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:dd1ac2fc-8e27-f00e-86ce-4654807aebbb, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:ee40fb45-b9f8-a897-69d3-e95eba9bcc58, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:8af310da-f045-a42d-2e1a-a5dada6f094a, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** CARDDEMO-MAIN-MENU-OPTIONS (uuid:a6206c64-5ac2-33e8-e90b-cda9ddebd0e3, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoMainMenuOptions;

    /** CDEMO-MENU-OPT-COUNT (uuid:a9afa6c4-271f-8a9f-30af-6dc9c6460852, level 5, PIC 9(02)). */
    public int /* PIC 9(02) */ cdemoMenuOptCount;

    /** CDEMO-MENU-OPTIONS-DATA (uuid:415fa496-5574-e8cc-d22b-faf1f9fb684b, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMenuOptionsData;

    /** CDEMO-MENU-OPTIONS (uuid:6055acb3-6d96-98ba-7abe-4b095d62a991, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMenuOptions;

    /** CDEMO-MENU-OPT (uuid:de6a570b-5fe5-afdc-88a4-68e9ad381d2e, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMenuOpt;

    /** CDEMO-MENU-OPT-NUM (uuid:5c4ac6cd-154b-6ad7-07fa-9c0715a725f7, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ cdemoMenuOptNum;

    /** CDEMO-MENU-OPT-NAME (uuid:2f7c3397-b5dc-731d-e408-f556995c2c08, level 15, PIC X(35).). */
    public String cdemoMenuOptName;

    /** CDEMO-MENU-OPT-PGMNAME (uuid:077b10df-f044-a214-aa37-ecd459202691, level 15, PIC X(08).). */
    public String cdemoMenuOptPgmname;

    /** CDEMO-MENU-OPT-USRTYPE (uuid:980a95c7-9862-cc4e-f07e-d23dd667e370, level 15, PIC X(01).). */
    public String cdemoMenuOptUsrtype;

    /** COMEN1AI (uuid:bb13962f-ca25-1bd1-6311-459536eec5c9, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ comen1ai;

    /** TRNNAMEL (uuid:0238accd-1618-ad16-a93e-ab450961e6b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamel;

    /** TRNNAMEF (uuid:08746336-9112-40cc-e20b-9798e52c2e8f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamef;

    /** TRNNAMEA (uuid:3be59344-4804-95d8-f96a-947d176a4068, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamea;

    /** TRNNAMEI (uuid:03548c98-3c81-12ab-9a19-db1593cfcd31, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamei;

    /** TITLE01L (uuid:5849bafa-844b-f7b6-c148-c2f488818005, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01l;

    /** TITLE01F (uuid:98074070-c71f-8aca-d0de-c34705dba026, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01f;

    /** TITLE01A (uuid:6bac0a23-8ac3-dc00-ea5a-215739dc8fde, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01a;

    /** TITLE01I (uuid:be6bb87b-12ef-e94b-c5dc-1065f148611b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01i;

    /** CURDATEL (uuid:3a4c5b03-51e5-9732-821c-1c9dcad82b13, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatel;

    /** CURDATEF (uuid:70831ae3-6532-62e0-c230-e30a94e3d831, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatef;

    /** CURDATEA (uuid:911a5d8d-65f1-5a8d-143d-62b0144426ad, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatea;

    /** CURDATEI (uuid:3279340c-5fb0-6c75-b3ac-40cea2ff32ec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatei;

    /** PGMNAMEL (uuid:655bb2c2-722c-ae83-ff79-c7c0cf1caac2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamel;

    /** PGMNAMEF (uuid:eba17815-f4fc-f10c-653e-93abc29de61e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamef;

    /** PGMNAMEA (uuid:8a41b77f-8457-46b4-f453-93b88ba15900, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamea;

    /** PGMNAMEI (uuid:d87e9947-2cf1-0743-0e4d-b347ab3221ad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamei;

    /** TITLE02L (uuid:f890934a-0a5f-331c-ad45-f7a1f3c4add6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02l;

    /** TITLE02F (uuid:0bb438d8-450f-539e-d8b2-fe8b163727bd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02f;

    /** TITLE02A (uuid:e95bab7b-1061-f260-f68e-cd4d4c918d03, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02a;

    /** TITLE02I (uuid:0cfdea17-3d48-8dd7-af50-425da647d953, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02i;

    /** CURTIMEL (uuid:cdb7826a-5ece-7d84-364c-febf314eae80, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimel;

    /** CURTIMEF (uuid:a6a5d836-6d21-fc2d-af0e-913c0585a53a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimef;

    /** CURTIMEA (uuid:c62f124f-e7c7-4869-aece-9ed07788e8c3, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimea;

    /** CURTIMEI (uuid:9dac179c-1c47-1df3-f5ef-607b3976bc36, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimei;

    /** OPTN001L (uuid:c7f55985-e95e-375e-d4f1-b94d97cc588d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001l;

    /** OPTN001F (uuid:95561674-5dce-4313-b294-7a79fc0e5e9a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001f;

    /** OPTN001A (uuid:402ac807-97af-d30a-f430-a36c9761851f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001a;

    /** OPTN001I (uuid:bf2d6561-54d9-3f49-021f-bfb99c83ee14, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001i;

    /** OPTN002L (uuid:d76b58d0-01e3-e6ca-e69b-88b2e7dfbc96, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002l;

    /** OPTN002F (uuid:590ec26c-81ac-aea3-a72a-015a3343754a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002f;

    /** OPTN002A (uuid:35f63bbc-30fc-26aa-ab3a-085450a0ea2f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002a;

    /** OPTN002I (uuid:ec6d23f5-713f-0276-b4ad-40fcc94749a1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002i;

    /** OPTN003L (uuid:ae8cc5a5-1b40-a560-288f-540723acb65e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003l;

    /** OPTN003F (uuid:43cccfe0-1676-60bd-c825-87cb36b9c9e8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003f;

    /** OPTN003A (uuid:cd9fe326-7573-419e-7dec-b4c7aad023fa, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003a;

    /** OPTN003I (uuid:54882348-2f41-4dd4-ca5e-b9da9dd1808c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003i;

    /** OPTN004L (uuid:764c0b04-f9a1-e844-021f-a205ef2dc4be, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004l;

    /** OPTN004F (uuid:bc03e0bf-b086-53bd-ab9c-098d3aa0964a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004f;

    /** OPTN004A (uuid:0ec64d6f-8917-eb8e-6f7e-8f27c786afe2, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004a;

    /** OPTN004I (uuid:6b253dd0-26d3-bca2-0540-aee3611a4135, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004i;

    /** OPTN005L (uuid:135754a1-bd4c-7f64-7f7e-4a4fe9b85734, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005l;

    /** OPTN005F (uuid:37546bea-d50f-fb4b-25cf-2986488fcf57, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005f;

    /** OPTN005A (uuid:da901cec-1760-ddcc-730a-dfe84bc8a7e4, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005a;

    /** OPTN005I (uuid:2cec9a61-71cd-be92-510c-5edb7add1544, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005i;

    /** OPTN006L (uuid:eec8fdb3-2521-4fb9-9807-0f04caf50378, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006l;

    /** OPTN006F (uuid:68cc3d03-5555-8267-e8b3-1caa76aa5acf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006f;

    /** OPTN006A (uuid:ee24129b-8007-879d-1b72-27f6a40f3735, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006a;

    /** OPTN006I (uuid:4244913a-4100-6fef-8467-40039a7ad303, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006i;

    /** OPTN007L (uuid:3aca2a9b-bf0b-7272-1a5d-1e681a97fbe9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007l;

    /** OPTN007F (uuid:5d860261-dcf1-c03f-395a-d391d0cf1039, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007f;

    /** OPTN007A (uuid:7e998913-9140-c794-e0dc-3885bda91092, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007a;

    /** OPTN007I (uuid:e75bf5b4-e3e2-9519-7496-218c7f53c423, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007i;

    /** OPTN008L (uuid:a025dd43-f8ac-6c92-a038-d176b4ff2172, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008l;

    /** OPTN008F (uuid:54c0424e-5eb1-a951-a769-159454a8dbe7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008f;

    /** OPTN008A (uuid:b0a58629-8ec2-428a-4179-5548d96944b0, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008a;

    /** OPTN008I (uuid:6361a9a9-158d-9781-1a14-4c28c3231833, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008i;

    /** OPTN009L (uuid:880ca0cc-ee1e-ed92-9df0-c6fa3914d08c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009l;

    /** OPTN009F (uuid:3f8f66fa-4381-232f-f9cd-63db5ef30365, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009f;

    /** OPTN009A (uuid:ffe2b821-a19a-b3dd-b1cd-2d17ba37be74, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009a;

    /** OPTN009I (uuid:9c3803b9-4e2c-5f1d-7209-69afa6be9272, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009i;

    /** OPTN010L (uuid:a7bdd90f-1f92-fdf8-c0a1-208e21d308aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010l;

    /** OPTN010F (uuid:f0339899-ab8e-8851-5dc3-2450e5e29452, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010f;

    /** OPTN010A (uuid:e5accf9f-bef8-0e92-7bd4-44135fac6851, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010a;

    /** OPTN010I (uuid:8c11e22f-f9f7-733e-0a70-42057518f478, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010i;

    /** OPTN011L (uuid:032919e1-3b93-2882-07b8-286c46fb3143, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011l;

    /** OPTN011F (uuid:5f5c99a7-c99c-ae99-dfca-0637eed6a809, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011f;

    /** OPTN011A (uuid:60ab7b31-49f7-90a7-2a7f-e5eccec9c169, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011a;

    /** OPTN011I (uuid:a168bf4b-1980-d91b-bd02-ed548b29d649, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011i;

    /** OPTN012L (uuid:06413e49-4da7-86a6-0251-5bd5552216bf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012l;

    /** OPTN012F (uuid:e64f7738-37ad-ba69-72b9-49af8fc449e5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012f;

    /** OPTN012A (uuid:7ff78f62-c5f7-c7a3-dba7-7c4fbb2bceb3, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012a;

    /** OPTN012I (uuid:50ea6364-87b9-e0db-44f5-c9fc88050b4c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012i;

    /** OPTIONL (uuid:19512ec0-cf51-c252-4d37-e3c08eace041, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optionl;

    /** OPTIONF (uuid:08e04f5f-33da-56fc-9625-9bcef21832e0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optionf;

    /** OPTIONA (uuid:5d406c3d-0625-25f1-60eb-9ab65be1248e, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optiona;

    /** OPTIONI (uuid:6b766d08-c0c1-d1f1-054c-3417cd556218, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optioni;

    /** ERRMSGL (uuid:977c5a10-4f00-b7d9-93a0-d3ea2aa2d858, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgl;

    /** ERRMSGF (uuid:dec1ad83-470b-1600-af31-4dd5e8bc969f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgf;

    /** ERRMSGA (uuid:28a9de49-9352-3c92-48bf-808dcbce5f1f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsga;

    /** ERRMSGI (uuid:2629e05b-b3cc-c685-75f5-a14cca5e874f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgi;

    /** COMEN1AO (uuid:14b18126-0fef-eea8-1c3e-ad09b593eb89, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ comen1ao;

    /** TRNNAMEC (uuid:0978f303-25d6-ae1a-d0d7-35b3def42d37, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamec;

    /** TRNNAMEP (uuid:900b9a33-e20a-d5dc-772d-a9b53d5c698e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamep;

    /** TRNNAMEH (uuid:14ddbf69-3903-30cd-8489-4e69f1094e65, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameh;

    /** TRNNAMEV (uuid:3d525758-a94e-1cf2-3434-93b6a02e65e8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamev;

    /** TRNNAMEO (uuid:82d68471-1260-8bfc-beb8-be54a346553d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameo;

    /** TITLE01C (uuid:a682b184-31dd-ffcf-e927-5a84b0a96040, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01c;

    /** TITLE01P (uuid:f7763f35-0bcc-0bf6-ad63-cfe799abce8c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01p;

    /** TITLE01H (uuid:1d24e456-e335-d2a0-789d-1c36511c2933, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01h;

    /** TITLE01V (uuid:d8dfdee2-0f51-a3e9-bdfa-fe2abcb44d0d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01v;

    /** TITLE01O (uuid:d6e68b76-046f-f357-ca63-857111f4e648, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01o;

    /** CURDATEC (uuid:fa5a8c6a-8c56-8474-c41c-a199833e2af2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatec;

    /** CURDATEP (uuid:d1d3c86d-8a3f-38ee-3f4a-5bed4eca72cb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatep;

    /** CURDATEH (uuid:3aaef33f-7c26-7112-0e33-61e8230f216e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateh;

    /** CURDATEV (uuid:190d6208-358d-fe9a-085f-77e53185f2ac, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatev;

    /** CURDATEO (uuid:813e7048-9cfe-ca88-fd8a-c6048433dfe4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateo;

    /** PGMNAMEC (uuid:53898de2-051f-fc93-421e-efa68e4e52fa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamec;

    /** PGMNAMEP (uuid:dcbbdf09-1083-d9c1-c42b-622777da517a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamep;

    /** PGMNAMEH (uuid:eff97671-5513-2ba0-30ed-918ca1f390aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameh;

    /** PGMNAMEV (uuid:71b57eae-88b4-6e99-8293-2ced5155e1c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamev;

    /** PGMNAMEO (uuid:06cd4b96-9a63-068f-2897-3a5ff30960b9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameo;

    /** TITLE02C (uuid:cae4c911-ad9f-24ff-a29c-11a461e9d328, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02c;

    /** TITLE02P (uuid:7c11ee26-4f4c-c22d-ad53-ecb33f0c056f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02p;

    /** TITLE02H (uuid:e892dedd-06f1-e8cb-aed8-98ff53727998, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02h;

    /** TITLE02V (uuid:a7b29f51-79eb-2bb5-146f-0b35cbbf67d3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02v;

    /** TITLE02O (uuid:c7d1a873-3be4-7921-76f9-8aad14aa355b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02o;

    /** CURTIMEC (uuid:16e8fb63-f736-10eb-fabc-82385fd3385b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimec;

    /** CURTIMEP (uuid:54341f50-a4e0-6675-5200-f0bb8bceb242, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimep;

    /** CURTIMEH (uuid:fbc345d9-d646-579f-f944-6b439229229e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeh;

    /** CURTIMEV (uuid:0e7da9a9-6543-b842-bd57-077cb7312ed7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimev;

    /** CURTIMEO (uuid:2d75d798-58d6-8080-a79c-4a8e0091294a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeo;

    /** OPTN001C (uuid:7246097d-31aa-0ea9-d7cc-e01941f0f015, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001c;

    /** OPTN001P (uuid:09d63576-b7ef-c9a9-e384-786828521e30, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001p;

    /** OPTN001H (uuid:2e4e552d-542a-4480-c90e-d32e08aeb79e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001h;

    /** OPTN001V (uuid:00125fe8-fb59-3f33-f105-b1b1b329386d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001v;

    /** OPTN001O (uuid:b9df1c0c-7c56-db87-438f-355ccbc7de11, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn001o;

    /** OPTN002C (uuid:3bce7d91-86ec-742f-bc3f-c1166271d14b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002c;

    /** OPTN002P (uuid:85fc154c-fa38-faff-210d-cb58070ad06e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002p;

    /** OPTN002H (uuid:12633be1-153e-898d-d93f-b9dd1b7c1f8c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002h;

    /** OPTN002V (uuid:dbebd892-6966-8e55-9eaa-dfa5f04a043a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002v;

    /** OPTN002O (uuid:f9c633ee-662b-d266-5323-1dd91b9e5975, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn002o;

    /** OPTN003C (uuid:bef7d2e0-7730-f5d5-7ef8-653b47908438, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003c;

    /** OPTN003P (uuid:0491eec9-8515-72dd-5bd3-c0cff3fcc75b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003p;

    /** OPTN003H (uuid:9d423c09-46da-3720-dec5-bcc34e0bb5e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003h;

    /** OPTN003V (uuid:b6146090-c469-bf66-49fb-066255fc5ce6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003v;

    /** OPTN003O (uuid:32a3f659-07ec-16f5-559a-7717645d019b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn003o;

    /** OPTN004C (uuid:638a0811-cd3b-cdff-7e51-48609c3f0057, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004c;

    /** OPTN004P (uuid:67502c37-8833-4177-a21b-1cb8f5cd6420, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004p;

    /** OPTN004H (uuid:9e2238eb-df70-f841-1f26-52caca493e67, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004h;

    /** OPTN004V (uuid:f8bd1ebf-81af-7b43-b544-b4c85b6d8221, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004v;

    /** OPTN004O (uuid:8ead7ede-5e23-6bce-2e69-7940beb955e9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn004o;

    /** OPTN005C (uuid:2cc56a5d-72b9-2cda-323e-83a593a5af5c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005c;

    /** OPTN005P (uuid:8435f9f7-8cf0-fbef-561e-da16411e72e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005p;

    /** OPTN005H (uuid:6d1dc46c-a164-4849-9029-90b8bc4294f8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005h;

    /** OPTN005V (uuid:05e7a01d-3aad-a12b-87b3-d70181148171, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005v;

    /** OPTN005O (uuid:b6f575b0-6147-55d7-70a3-4fbf600ab67e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn005o;

    /** OPTN006C (uuid:8c9a569d-2aeb-e506-ed96-eaf13a04df71, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006c;

    /** OPTN006P (uuid:0ee5acb3-be70-411e-7453-3d6df0eb49de, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006p;

    /** OPTN006H (uuid:eaa2ee05-296a-135d-00fa-40d70d6c6595, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006h;

    /** OPTN006V (uuid:bed04ed5-40fa-68c1-f772-a25ec8365168, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006v;

    /** OPTN006O (uuid:ab035f89-7800-8abb-fedc-a692f47c17c1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn006o;

    /** OPTN007C (uuid:69e92750-eea4-dea9-fcee-ae99458b1639, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007c;

    /** OPTN007P (uuid:6d984b46-b4c6-a02e-ac19-a0ed9d07422e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007p;

    /** OPTN007H (uuid:0a8e31e9-6f01-0ad0-5ca2-f5608ca51008, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007h;

    /** OPTN007V (uuid:fc7754f0-2ffb-0770-06fb-123fcb727bfd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007v;

    /** OPTN007O (uuid:6d22a1de-d59f-f327-29e0-f966703663ad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn007o;

    /** OPTN008C (uuid:c9c91b69-789b-b683-38f9-eb2f0f7c6459, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008c;

    /** OPTN008P (uuid:6daed16e-47ce-ab8f-a02e-11c6e87f297b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008p;

    /** OPTN008H (uuid:efad7e26-4026-d8b0-9dbb-0b835f210294, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008h;

    /** OPTN008V (uuid:e49ed888-cf2b-2cc3-6890-322f91e103fa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008v;

    /** OPTN008O (uuid:133d17a8-33d4-8f51-9777-41a1a309d0c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn008o;

    /** OPTN009C (uuid:b5ae2caa-76b1-ad22-1021-2c5a1e217cb4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009c;

    /** OPTN009P (uuid:55e6bc16-0835-5821-7629-566ac6abd99a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009p;

    /** OPTN009H (uuid:0ff7d825-c7b2-2b55-ec8b-85cd9c9d43a0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009h;

    /** OPTN009V (uuid:78202f1d-b6ca-527c-359d-c5e854d23d1c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009v;

    /** OPTN009O (uuid:b1e70b5a-e63e-4ad8-dc9e-da0ab4b5160a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn009o;

    /** OPTN010C (uuid:5109d0bc-7d20-4de4-3705-c476b5c1243a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010c;

    /** OPTN010P (uuid:55e5ba47-d5c7-8aaf-31ce-d62f4b34d982, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010p;

    /** OPTN010H (uuid:42a81a6a-9a80-5311-fe46-1bed43fde911, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010h;

    /** OPTN010V (uuid:b4a83a29-7367-357f-5d28-697b83fbc264, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010v;

    /** OPTN010O (uuid:26f0b892-a7e9-7f5c-92b4-624103d2ee3d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn010o;

    /** OPTN011C (uuid:34f7ab78-7208-4bca-bea4-cec40c34241a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011c;

    /** OPTN011P (uuid:0b9a7a53-294a-4866-43fc-79ddb0ac831b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011p;

    /** OPTN011H (uuid:cbf6af1a-40ea-faa5-c036-de831de1e773, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011h;

    /** OPTN011V (uuid:99f9bc4b-d14d-8010-3085-d50fae293eae, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011v;

    /** OPTN011O (uuid:a439df94-15e6-92a8-4bce-4f97b6aa6768, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn011o;

    /** OPTN012C (uuid:24a1b7b0-0ca5-a790-20db-65b95d899077, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012c;

    /** OPTN012P (uuid:b65702f7-c136-6a93-a1cd-ec79433f4f6e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012p;

    /** OPTN012H (uuid:cc3bdc7d-e1c3-df0d-7a10-ef1d3597c36f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012h;

    /** OPTN012V (uuid:fe4ace71-eb97-d227-36f8-1a4b1771c7cd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012v;

    /** OPTN012O (uuid:94087393-8900-1d38-af6c-37ec5dbf6a28, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optn012o;

    /** OPTIONC (uuid:d964cb44-94b8-d2ff-9870-8f0c245a34fb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optionc;

    /** OPTIONP (uuid:90e02a40-698a-838d-1520-2a91594e6b31, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optionp;

    /** OPTIONH (uuid:0a62cad9-3e6d-2fcc-8613-ab4bfc92e7e2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optionh;

    /** OPTIONV (uuid:d1f369c5-d931-2154-b47e-518cf350c200, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optionv;

    /** OPTIONO (uuid:16133a49-8e8c-36a6-8649-1e2a43b357de, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ optiono;

    /** ERRMSGC (uuid:d03ef356-6e4d-859c-76e4-62c56f2eed2e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgc;

    /** ERRMSGP (uuid:1d08876b-af2d-7f36-c629-56cea65424ad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgp;

    /** ERRMSGH (uuid:3ceb9b2d-d045-ad82-ec2d-8d365277d4e1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgh;

    /** ERRMSGV (uuid:74e66d51-e36d-beca-9f9a-f0bf6b965939, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgv;

    /** ERRMSGO (uuid:47cd3601-41e3-a631-1a37-e53807f70e59, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgo;

    /** CCDA-SCREEN-TITLE (uuid:702e9f64-5cc7-32ca-ff42-c2f714a6b1bd, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:b8168486-e266-5b9b-f7b7-552140b47312, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:db87132d-43cb-d178-1173-c3abeda696d8, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:6e063734-20e3-c901-8778-362830f9de65, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** WS-DATE-TIME (uuid:d015cb9e-188e-50b3-8593-e30583d0dbe9, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:5103cf67-b396-16ae-8b0d-de135040f4c8, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:c9ac34df-05e7-5d93-d40f-8c4e4c8230ee, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:6fbb1b92-570d-cb5d-6839-19ce914b6480, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:5a4514ff-a2e9-2c49-7172-5ef3556ece1d, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:b3c00b05-9afd-3621-2751-3d0f4125717b, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:3d0beb94-6ecd-fc2d-c02e-7baf6eb8c4cf, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:3e56a842-b33e-3c97-0d0c-4ff8a970a6f9, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:52937277-8428-ab9a-411a-450c4bc43612, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:7dd8e099-98e8-85d7-c642-9f58ef8ffab1, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:0883cf85-945a-f25f-e331-c580d61a07eb, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:53397853-b01b-1633-3309-3010aab432e9, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:64468e04-1528-c7e4-ace6-f9eeb16bf6fe, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:fd7fa491-4fb2-e792-c18a-b7e6373d50c4, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:7a31af98-9cda-625e-6505-0637e358c004, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:960cec53-1368-997f-1b83-940c71df73fe, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:0a654971-da23-4511-972c-318f90c5367e, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:d3e084c1-893d-3986-ea21-9a01b36643a7, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:55afa846-fc32-b22c-ca0b-658dfab7e137, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:0ef8082b-97ef-0968-fac0-2e581da9c93b, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:29bc58aa-aad2-a3e8-d784-9b79cc63f1b2, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:fc9f0fd9-2e2c-8b4a-a0ef-632643afe3cf, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:64dc029c-291f-c3de-05f2-74742180dfb9, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:8f2f1d63-1254-cc13-8bda-c4f1c9572213, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:11277ba7-6d0b-58ca-e895-24938fea9e9d, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:60149916-9477-aa95-62be-b001d9c1f573, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:44d6ad6c-84dd-ad2b-a257-296d827aebe6, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:b5e7da53-09ea-1123-11eb-8a203fe6d797, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:652cf63c-442b-01ef-fbb7-d6b7ac8e29c4, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:bca57d7a-a9c6-44fc-bf53-b726adfce812, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:76f3462b-ffe5-4d3c-f9ab-fd4908a8621f, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:86a01b84-5fee-02dd-9d95-d7187a8d0b7b, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** SEC-USER-DATA (uuid:9fe9d6f9-0f4c-58a9-1063-93620ce81891, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ secUserData;

    /** SEC-USR-ID (uuid:23876f77-d010-63c9-1d37-a59d31a15909, level 5, PIC X(08).). */
    public String secUsrId;

    /** SEC-USR-FNAME (uuid:6a107ea8-0c9f-8632-f710-fc89bde8bd76, level 5, PIC X(20).). */
    public String secUsrFname;

    /** SEC-USR-LNAME (uuid:dd97b951-a734-9ec5-e5c8-40f295fa6f02, level 5, PIC X(20).). */
    public String secUsrLname;

    /** SEC-USR-PWD (uuid:8c5a63c9-40d5-2ce2-155b-357d04891de1, level 5, PIC X(08).). */
    public String secUsrPwd;

    /** SEC-USR-TYPE (uuid:2ac3e605-011d-08ad-f436-d9774dde73ef, level 5, PIC X(01).). */
    public String secUsrType;

    /** SEC-USR-FILLER (uuid:b0a33e79-1cd4-7646-11de-24f82d7809a5, level 5, PIC X(23).). */
    public String secUsrFiller;

    /** DFHAID (uuid:da8d4cbc-8999-0550-b24e-44f6a2102c26, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:1a910a12-f3f4-ad03-bfc2-8fd3c1c5cbe0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:691ce85f-53b1-2fe6-c1cc-6288bfda2787, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:0f0542d4-81ab-fc45-386a-8a05a31d52b7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:0094ff42-6326-7efc-3f01-cfc1e32de221, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:19a3e360-d778-742b-3320-64ee07a3839c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:6887e68b-d9c6-353a-e7c0-a1f620fcec92, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:f79de074-a82d-02b1-c149-13da0e48beba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:1db8c033-d6b5-6e95-dde1-61b9f07b21db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:db3223cd-7d3d-4d95-e203-8e7791f6d1dd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:d8d6091c-e0ec-8edc-c75b-b76123a2148a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:73d86eb2-9a90-24df-2ad4-d853c9d492c9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:a9d5129b-4cdb-0d84-3ef6-06d12dfffc17, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:b13902fa-47f3-1b1c-c30f-d2da0d55f094, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:f741d5bf-464a-575e-1073-dc0075960cb1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:df6c0aaa-0b19-4a71-b236-4d0a3f2efaa4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:9f12c603-c69d-a3ca-9d11-537b2ae942d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:ca82126b-d115-33f6-1816-5b1b1de173bc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:efe66a9c-e4a6-876b-8584-00d464b8a789, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:59224ccf-aca9-3e2b-82f4-3c669b121ee5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:35f22de5-c037-8015-d0e6-eeab99729f16, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:4d63f3cf-2ad7-69b6-5dc2-c767593a3d84, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:215f5ba4-221c-ddb0-693f-0e071375cebf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:ace58365-2015-5d6c-c910-a4c288fca994, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:fc0d99da-27ed-d58e-3bb7-face704a1426, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:5c33e11e-e677-75b1-f30c-e21d630cb9a1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:7052e534-3ae9-fd09-c671-8d0d542e9947, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:5ed8eb32-76f3-5d91-16e2-e0d19375429e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:dc2bac3f-aece-73dc-d3e4-8a712808020a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:a61f2a65-8f1c-5000-ae29-328fdf15dac6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:b9f83026-17a2-53e9-23a3-4b35fae080d0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:468ae3ab-e9ea-c643-3d24-1722924719a3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:a22a05a9-59f7-9385-5029-2ef803f6bfe7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:9f3af71b-9e2d-908a-61e5-3095bed224b6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:406b2b1e-676d-3224-f485-4c5b9b26eb9e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:e0080295-9095-fee3-fbd4-2431bf66e302, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:2ee32b65-97e3-3935-d7bb-4e1d45c3af45, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** DFHBMSCA (uuid:dc634219-8c7b-3255-1bde-1ca26c0c80b9, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:95de9bfb-e7b2-56e3-555b-57ac9d709916, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:3ff9a2a6-4089-4146-7eca-bcb58ad60d7c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:70d2864f-467d-b71b-85e9-9636f7dc173b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:43a9fa74-b5d8-5c1a-c765-00ae41150c1e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:aa5262d3-38b2-a77c-958a-ef6f0aa47fe1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:36f1a20e-0e40-af8f-980e-a9ef6752b5a6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:0a72b404-201b-e4c9-1a21-7cbb8f9e3248, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:a3c0534a-4f7e-a45d-add1-c870c91b7f53, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:808d8f59-56d2-63b3-5078-df9a4ca92e3b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:e40dfd18-7e17-cd16-dbf0-67a2097b6cc3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:d44e4d27-d1bc-d17f-4279-26391547529c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:67a458f3-9828-8c73-7e86-1972e9e09656, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:c558e6a4-b260-101c-0655-93748b854034, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:e8afc4c1-6b09-5d88-f119-70613a728e5e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:4cda7c83-891b-af13-7bfa-68d68ce55b31, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:d78da6c2-d280-d4c4-18e9-29051d22d532, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:9f8bdb1f-e645-1c3a-628d-72ce808a9d3e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:1aab1f18-5bd9-7963-29b9-76662784323f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:2262f566-8192-a007-8c0d-cf3e45343b69, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:ca8ed0ca-da3b-5c89-da1f-95146cf743d3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:402beaf6-98a1-5f2d-273f-ed42d63cd732, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:98fda441-34b0-4721-6999-9654f6a10f14, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:7f9001f6-8641-0b2a-8e04-3297c6626a4a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:2da01eb5-065f-24c5-1ec5-250fc434f2b1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:64128548-6085-fd99-9efc-e480973fc406, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:ef88ae2c-de1e-277f-a774-593f2be927ec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:f387f004-fe74-1718-c595-9cc5d8b5238d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:d2246d21-5218-8db8-41d4-e1a8c8598e1c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:8afce34c-b2ed-c61a-355d-ca8bf51f7ec0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;


    // --- auto-generated stubs for undeclared references ---
    public Object eibcalen;  // auto-stub for undeclared reference
    public Object varying;  // auto-stub for undeclared reference

    /** MAIN-PARA  (uuid:9cae60e2-e7f3-2389-1bbe-807af9bf2532, source lines 695-730). */
    public void mainPara() {
        // SET ERR-FLG-OFF TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsMessage = "";
        this.errmsgo = "";
        if (java.util.Objects.equals(this.eibcalen, 0)) {
            // TODO: translate body for: EIBCALEN = 0
        }
    }

    /** PROCESS-ENTER-KEY  (uuid:2916d666-51bb-83dd-c825-2235e7aa7e90, source lines 735-811). */
    public void processEnterKey() {
        this.varying();  // PERFORM
        // MOVE OPTIONI OF COMEN1AI(1:WS-IDX) TO WS-OPTION-X  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [INSPECT]: INSPECT WS-OPTION-X REPLACING ALL ' ' BY '0'
        // MOVE WS-OPTION-X TO WS-OPTION  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-OPTION TO OPTIONO OF COMEN1AO  -- identifier MOVE; needs PIC-aware type coercion
        if ((!this.wsOption.toString().matches("-?\\d+(\\.\\d+)?")) || (true /* TODO translate: WS-OPTION > CDEMO-MENU-OPT-COUNT */) || (java.util.Objects.equals(this.wsOption, 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */))) {
            // TODO: translate body for: WS-OPTION IS NOT NUMERIC OR WS-OPTION > CDEMO-MENU-OPT-COUNT OR WS-OPTION = ZEROS
        }
        if ((true /* TODO translate: CDEMO-USRTYP-USER */) && (java.util.Objects.equals(this.cdemoMenuOptUsrtype(wsOption), "A"))) {
            // TODO: translate body for: CDEMO-USRTYP-USER AND CDEMO-MENU-OPT-USRTYPE(WS-OPTION) = 'A'
        }
        if (true /* TODO translate: NOT ERR-FLG-ON */) {
            // TODO: translate body for: NOT ERR-FLG-ON
        }
    }

    /** RETURN-TO-SIGNON-SCREEN  (uuid:7bf2c313-3dc9-d56d-2b33-be26d79768a9, source lines 816-823). */
    public void returnToSignonScreen() {
        if (java.util.Objects.equals(this.cdemoToProgram, "\u0000")) {
            // TODO: translate body for: CDEMO-TO-PROGRAM = LOW-VALUES OR SPACES
        }
    }

    /** SEND-MENU-SCREEN  (uuid:5bd47205-9170-0e75-4607-e2401eff63f1, source lines 828-840). */
    public void sendMenuScreen() {
        this.populateHeaderInfo();  // PERFORM
        this.buildMenuOptions();  // PERFORM
        // MOVE WS-MESSAGE TO ERRMSGO OF COMEN1AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** RECEIVE-MENU-SCREEN  (uuid:b819eb54-cfa0-adba-7a09-7ab92d2939ac, source lines 845-853). */
    public void receiveMenuScreen() {
        // TODO: implement receiveMenuScreen.  See uuid:b819eb54-cfa0-adba-7a09-7ab92d2939ac
    }

    /** POPULATE-HEADER-INFO  (uuid:6aeff472-e377-5b92-d9a1-e66337ad14b3, source lines 858-877). */
    public void populateHeaderInfo() {
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF COMEN1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF COMEN1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-TRANID TO TRNNAMEO OF COMEN1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-PGMNAME TO PGMNAMEO OF COMEN1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF COMEN1AO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF COMEN1AO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** BUILD-MENU-OPTIONS  (uuid:d44802c7-2e38-1c3b-c17f-69c572279b30, source lines 882-923). */
    public void buildMenuOptions() {
        this.varying();  // PERFORM
    }

    public static void main(String[] args) {
        new Comen01c().mainPara();
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
