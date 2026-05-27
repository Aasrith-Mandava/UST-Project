// Generated from COACTUPC.cbl - CardDemo Pipeline (forward engineering).
// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated
// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).
// Class/method Javadocs come from the LLM spec at
// demo/program_spec_COACTUPC.json (grounded in the SQLite artifact graph).
package com.carddemo.generated;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * COACTUPC (no LLM spec available).
 *
 * <p>Forward-engineered skeleton from the parsed artifact graph only —
 * run the LLM pipeline phase to enrich this Javadoc.
 *
 * <p>Source file: COACTUPC.cbl
 */
public class Coactupc {

    /** WS-MISC-STORAGE (uuid:ec19e382-1415-e5cd-07c3-f4a29ad60d71, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsMiscStorage;

    /** WS-CICS-PROCESSNG-VARS (uuid:ca1708f8-ba93-8a94-3ac7-46728fd3089d, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCicsProcessngVars;

    /** WS-RESP-CD (uuid:84b135de-3faa-c977-f9d4-5d233f56eaf0, level 7, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsRespCd;

    /** WS-REAS-CD (uuid:289a3d6b-6baa-4962-0bac-2f3c64af12d7, level 7, PIC S9(09) COMP). */
    public int /* PIC S9(09) signed */ wsReasCd;

    /** WS-TRANID (uuid:d9616094-52ba-9ad6-60a2-0591a5829f24, level 7, PIC X(4)). */
    public String wsTranid;

    /** WS-UCTRANS (uuid:b16cd77b-7e1c-bb05-4e28-b3c8018bed23, level 7, PIC X(4)). */
    public String wsUctrans;

    /** WS-GENERIC-EDITS (uuid:397ef08f-780c-1f27-2d96-ab533675b2c2, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsGenericEdits;

    /** WS-EDIT-VARIABLE-NAME (uuid:df449546-8690-45df-4df7-55862e82c2fc, level 10, PIC X(25).). */
    public String wsEditVariableName;

    /** WS-EDIT-SIGNED-NUMBER-9V2-X (uuid:ffc7aa03-610e-5bc0-7a54-4a8f782cae1f, level 10, PIC X(15).). */
    public String wsEditSignedNumber9v2X;

    /** WS-FLG-SIGNED-NUMBER-EDIT (uuid:c418d406-2a99-dec6-4f7f-08bd005f09f9, level 10, PIC X(1).). */
    public String wsFlgSignedNumberEdit;

    /** WS-EDIT-ALPHANUM-ONLY (uuid:23a6cd47-72ad-28cc-9fd6-00902bc8381a, level 10, PIC X(256).). */
    public String wsEditAlphanumOnly;

    /** WS-EDIT-ALPHANUM-LENGTH (uuid:9f120d87-cc47-197f-36f0-6706db27d842, level 10, PIC S9(4) COMP-3). */
    public BigDecimal /* PIC S9(4) COMP-3 */ wsEditAlphanumLength;

    /** WS-EDIT-ALPHA-ONLY-FLAGS (uuid:d736fd5f-ddb1-1466-9284-9cb8b87cdc03, level 10, PIC X(1).). */
    public String wsEditAlphaOnlyFlags;

    /** WS-EDIT-ALPHANUM-ONLY-FLAGS (uuid:856f2e34-2b71-c444-ac7e-0440bc41e747, level 10, PIC X(1).). */
    public String wsEditAlphanumOnlyFlags;

    /** WS-EDIT-MANDATORY-FLAGS (uuid:c67ea54b-8f04-bbb0-a4f3-3c32019dd8fd, level 10, PIC X(1).). */
    public String wsEditMandatoryFlags;

    /** WS-EDIT-YES-NO (uuid:fef95685-95c0-f5b9-49e6-5f9cba676968, level 10, PIC X(1)). */
    public String wsEditYesNo;

    /** WS-EDIT-US-PHONE-NUM (uuid:99c1660c-63af-5fb5-4774-07fd5d297a4e, level 10, PIC X(15).). */
    public String wsEditUsPhoneNum;

    /** WS-EDIT-US-PHONE-NUM-X (uuid:f9ebbb5f-e638-a7f8-ce8a-abcf0a1d0339, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditUsPhoneNumX;

    /** WS-EDIT-US-PHONE-NUMA (uuid:a0e57434-01bc-c46f-3dea-e0b33f1c8bb4, level 20, PIC X(3).). */
    public String wsEditUsPhoneNuma;

    /** WS-EDIT-US-PHONE-NUMA-N (uuid:bbb12dab-892c-dd49-f8b4-5accf9ffd47f, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditUsPhoneNumaN;

    /** WS-EDIT-US-PHONE-NUMB (uuid:ddc59cf5-26ca-d5ac-4379-26a0b7b1cb78, level 20, PIC X(3).). */
    public String wsEditUsPhoneNumb;

    /** WS-EDIT-US-PHONE-NUMB-N (uuid:8070b525-af5c-07ae-723f-776261bbbd61, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditUsPhoneNumbN;

    /** WS-EDIT-US-PHONE-NUMC (uuid:52821581-b695-3b51-0217-562b8c8ede42, level 20, PIC X(4).). */
    public String wsEditUsPhoneNumc;

    /** WS-EDIT-US-PHONE-NUMC-N (uuid:187d64ff-b5d5-9410-c265-a837f8aa76b6, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditUsPhoneNumcN;

    /** WS-EDIT-US-PHONE-NUM-FLGS (uuid:52858ef5-a941-69be-07b2-d00c6e0cba4f, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditUsPhoneNumFlgs;

    /** WS-EDIT-US-PHONEA-FLG (uuid:45a6328f-6792-16cf-aafd-6562fc7ad55b, level 20, PIC X(01).). */
    public String wsEditUsPhoneaFlg;

    /** WS-EDIT-EDIT-US-PHONEB (uuid:1e3b0ca8-9493-d2de-86af-bf689e90495f, level 20, PIC X(01).). */
    public String wsEditEditUsPhoneb;

    /** WS-EDIT-EDIT-PHONEC (uuid:f6ab9c67-5576-a1e7-69dc-7ea2b5edb836, level 20, PIC X(01).). */
    public String wsEditEditPhonec;

    /** WS-EDIT-US-SSN (uuid:5efd8f3c-f656-bdc3-e20a-055e7918c488, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditUsSsn;

    /** WS-EDIT-US-SSN-PART1 (uuid:1a6c2bbc-dce7-281a-9294-b4473ab65f57, level 20, PIC X(3).). */
    public String wsEditUsSsnPart1;

    /** WS-EDIT-US-SSN-PART1-N (uuid:4fac110f-d295-08f8-6747-d030a0a7bf21, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditUsSsnPart1N;

    /** WS-EDIT-US-SSN-PART2 (uuid:00d855b3-79f8-59db-0815-f9d3ff129c57, level 20, PIC X(2).). */
    public String wsEditUsSsnPart2;

    /** WS-EDIT-US-SSN-PART2-N (uuid:b2216aa1-8e9e-7ce9-ce0b-e3397d2e9dc8, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditUsSsnPart2N;

    /** WS-EDIT-US-SSN-PART3 (uuid:e9cfb5c9-1325-cd26-b745-0182a0bbc2b3, level 20, PIC X(4).). */
    public String wsEditUsSsnPart3;

    /** WS-EDIT-US-SSN-PART3-N (uuid:345be6af-063f-183f-0f7d-3930e4060e72, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditUsSsnPart3N;

    /** WS-EDIT-US-SSN-N (uuid:6f0eea74-9bf3-616e-008d-d0115d2593b7, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditUsSsnN;

    /** WS-EDIT-US-SSN-FLGS (uuid:f7d618b5-7f73-57c8-f69f-195f25216948, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditUsSsnFlgs;

    /** WS-EDIT-US-SSN-PART1-FLGS (uuid:53189e8e-84c6-e3c1-850b-c517c5e11247, level 20, PIC X(01).). */
    public String wsEditUsSsnPart1Flgs;

    /** WS-EDIT-US-SSN-PART2-FLGS (uuid:60fb73fb-11f2-d189-2016-28006754b1f6, level 20, PIC X(01).). */
    public String wsEditUsSsnPart2Flgs;

    /** WS-EDIT-US-SSN-PART3-FLGS (uuid:6b7b63b5-9738-6e0d-1529-945013e9e43d, level 20, PIC X(01).). */
    public String wsEditUsSsnPart3Flgs;

    /** WS-CALCULATION-VARS (uuid:69ccefdc-7bb0-3c59-fed5-7538588f2d25, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCalculationVars;

    /** WS-DIV-BY (uuid:2306b1f0-4335-440b-d637-6803cc0a35b1, level 10, PIC S9(4) COMP-3). */
    public BigDecimal /* PIC S9(4) COMP-3 */ wsDivBy;

    /** WS-DIVIDEND (uuid:8161a4cd-76a2-4efe-9ca1-193b2082d5b8, level 10, PIC S9(4) COMP-3). */
    public BigDecimal /* PIC S9(4) COMP-3 */ wsDividend;

    /** WS-REMAINDER (uuid:972c65ac-5c03-d954-8034-bb4131d51b9a, level 10, PIC S9(4) COMP-3). */
    public BigDecimal /* PIC S9(4) COMP-3 */ wsRemainder;

    /** WS-CURR-DATE (uuid:dfdea87f-768f-a5f2-f523-76dbedd499fb, level 10, PIC X(21)). */
    public String wsCurrDate;

    /** WS-EDIT-DATE-CCYYMMDD (uuid:f3eb1435-84d6-ba32-9729-f1003d732b19, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateCcyymmdd;

    /** WS-EDIT-DATE-CCYY (uuid:363c3f8c-16f4-73f9-3723-e897a3a16d1c, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateCcyy;

    /** WS-EDIT-DATE-CC (uuid:7dccfe3e-cd86-74a7-3513-7c84992ec8df, level 25, PIC X(2).). */
    public String wsEditDateCc;

    /** WS-EDIT-DATE-CC-N (uuid:505d6503-8e26-0162-6ae5-2476a25dfa08, level 25, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateCcN;

    /** WS-EDIT-DATE-YY (uuid:ee19301e-ff03-1d08-1157-a9855baf904b, level 25, PIC X(2).). */
    public String wsEditDateYy;

    /** WS-EDIT-DATE-YY-N (uuid:3ed46374-9265-845e-2a23-e67b4ee1b9c1, level 25, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateYyN;

    /** WS-EDIT-DATE-CCYY-N (uuid:4ee8e969-e89f-3c91-d57c-1ead56f0f2bb, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateCcyyN;

    /** WS-EDIT-DATE-MM (uuid:7e2ca47b-03c1-dc89-b1a7-236ad9d80e98, level 20, PIC X(2).). */
    public String wsEditDateMm;

    /** WS-EDIT-DATE-MM-N (uuid:c9d0eeb2-8fe9-7c15-cabe-4b1657b2a665, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateMmN;

    /** WS-EDIT-DATE-DD (uuid:e7df6c30-65e5-750b-dca4-bc594c063bb3, level 20, PIC X(2).). */
    public String wsEditDateDd;

    /** WS-EDIT-DATE-DD-N (uuid:d6f06169-9521-7163-8a5d-d916b1d893e3, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateDdN;

    /** WS-EDIT-DATE-CCYYMMDD-N (uuid:07b220ae-5b43-d2f2-2b04-83bb793e56e9, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateCcyymmddN;

    /** WS-EDIT-DATE-BINARY (uuid:f46c7306-63cd-5f18-cb83-52ecab80a700, level 10, PIC S9(9) BINARY). */
    public int /* PIC S9(9) signed */ wsEditDateBinary;

    /** WS-CURRENT-DATE (uuid:5508d87a-9349-3fd4-8eaa-17ed375d91fb, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurrentDate;

    /** WS-CURRENT-DATE-YYYYMMDD (uuid:596eea77-1b5d-d681-362f-6be9dc4560ea, level 20, PIC X(8).). */
    public String wsCurrentDateYyyymmdd;

    /** WS-CURRENT-DATE-YYYYMMDD-N (uuid:49da25cf-4fcd-b95a-f4c5-bb32b9d4291c, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurrentDateYyyymmddN;

    /** WS-CURRENT-DATE-BINARY (uuid:2eb76f63-242a-7c9f-5e1f-96c9f984af59, level 20, PIC S9(9) BINARY). */
    public int /* PIC S9(9) signed */ wsCurrentDateBinary;

    /** WS-EDIT-DATE-FLGS (uuid:f62253ef-b351-32d9-aa70-d4040b834eca, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDateFlgs;

    /** WS-EDIT-YEAR-FLG (uuid:326c50d3-1aa4-b64e-3375-b2f5660fc444, level 20, PIC X(01).). */
    public String wsEditYearFlg;

    /** WS-EDIT-MONTH (uuid:317227ba-3163-02e9-8ef5-88f41379a401, level 20, PIC X(01).). */
    public String wsEditMonth;

    /** WS-EDIT-DAY (uuid:2a637aa7-acf3-2e75-6d0b-235fa35207e0, level 20, PIC X(01).). */
    public String wsEditDay;

    /** WS-DATE-FORMAT (uuid:e9c15340-eeee-b3b3-c1af-2cef25f60a9c, level 10, PIC X(08)). */
    public String wsDateFormat;

    /** WS-DATE-VALIDATION-RESULT (uuid:a087d352-4d02-6f7b-f063-536c5c90e4ae, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateValidationResult;

    /** WS-SEVERITY (uuid:f650e57a-a73e-a56b-97f9-c9b246f94c96, level 20, PIC X(04).). */
    public String wsSeverity;

    /** WS-SEVERITY-N (uuid:368f83c5-25e5-4060-60f8-77464fbbdc64, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsSeverityN;

    /** WS-MSG-NO (uuid:5aba0322-c048-2979-7086-682a18838968, level 20, PIC X(04).). */
    public String wsMsgNo;

    /** WS-MSG-NO-N (uuid:b04631ec-e639-9cf7-a404-74428f232620, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsMsgNoN;

    /** WS-RESULT (uuid:fdc0e559-e479-70b7-9059-f18b03349402, level 20, PIC X(15).). */
    public String wsResult;

    /** WS-DATE (uuid:e428d15f-0a43-a052-a896-a25ec4cb0676, level 20, PIC X(10).). */
    public String wsDate;

    /** WS-DATE-FMT (uuid:8e8e872d-c90c-f15e-8e87-ee6d11207583, level 20, PIC X(10).). */
    public String wsDateFmt;

    /** WS-DATACHANGED-FLAG (uuid:23f83938-3617-5e24-cf08-b397e2c3bab9, level 5, PIC X(1).). */
    public String wsDatachangedFlag;

    /** WS-INPUT-FLAG (uuid:9c80b3ef-b520-6720-f26a-ba7adc87943d, level 5, PIC X(1).). */
    public String wsInputFlag;

    /** WS-RETURN-FLAG (uuid:5145e9ba-ad76-55fc-48f1-b0b6033da7fa, level 5, PIC X(1).). */
    public String wsReturnFlag;

    /** WS-PFK-FLAG (uuid:a701db15-a37e-ec2d-d04b-e72ede96e157, level 5, PIC X(1).). */
    public String wsPfkFlag;

    /** WS-EDIT-ACCT-FLAG (uuid:d1dbd3ae-3a4a-fecf-ad91-91b358a649d8, level 5, PIC X(1).). */
    public String wsEditAcctFlag;

    /** WS-EDIT-CUST-FLAG (uuid:c74019b3-e241-f5eb-df24-b9f33d114a2a, level 5, PIC X(1).). */
    public String wsEditCustFlag;

    /** WS-NON-KEY-FLAGS (uuid:d5418486-650f-eaf3-7ffd-5b7309b58639, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsNonKeyFlags;

    /** WS-EDIT-ACCT-STATUS (uuid:38c68c25-e8da-04b1-3f05-d8b1bf7492bf, level 10, PIC X(1).). */
    public String wsEditAcctStatus;

    /** WS-EDIT-CREDIT-LIMIT (uuid:5b540919-0d2d-d59b-f082-0557b58250cf, level 10, PIC X(1).). */
    public String wsEditCreditLimit;

    /** WS-EDIT-CASH-CREDIT-LIMIT (uuid:0d5253db-e23a-b727-301e-17b3fffeb421, level 10, PIC X(1).). */
    public String wsEditCashCreditLimit;

    /** WS-EDIT-CURR-BAL (uuid:959345ac-e9aa-ba26-a45d-ca509975232c, level 10, PIC X(1).). */
    public String wsEditCurrBal;

    /** WS-EDIT-CURR-CYC-CREDIT (uuid:1105eec5-3431-4f2c-aa0b-56581e1e2961, level 10, PIC X(1).). */
    public String wsEditCurrCycCredit;

    /** WS-EDIT-CURR-CYC-DEBIT (uuid:ae1f4a79-6e25-c4b1-bdf1-cd1b0c0190bf, level 10, PIC X(1).). */
    public String wsEditCurrCycDebit;

    /** WS-EDIT-DT-OF-BIRTH-FLGS (uuid:fb7d5625-b9b2-8933-348e-d261de0b83f5, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditDtOfBirthFlgs;

    /** WS-EDIT-DT-OF-BIRTH-YEAR-FLG (uuid:c55ba32d-24a3-a0dc-7ef5-58fba480fae2, level 20, PIC X(01).). */
    public String wsEditDtOfBirthYearFlg;

    /** WS-EDIT-DT-OF-BIRTH-MONTH (uuid:12d80a03-ede4-9253-9fda-7ef383ed8787, level 20, PIC X(01).). */
    public String wsEditDtOfBirthMonth;

    /** WS-EDIT-DT-OF-BIRTH-DAY (uuid:f7ac586a-269b-6f8b-b5ad-544d042aebfe, level 20, PIC X(01).). */
    public String wsEditDtOfBirthDay;

    /** WS-EDIT-FICO-SCORE-FLGS (uuid:12569106-b16c-2b7a-a51e-024bb77cec2d, level 10, PIC X(1).). */
    public String wsEditFicoScoreFlgs;

    /** WS-EDIT-OPEN-DATE-FLGS (uuid:58b96830-baff-3ea6-302c-b6e82d5e359a, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditOpenDateFlgs;

    /** WS-EDIT-OPEN-YEAR-FLG (uuid:8f73c3dd-096f-314d-06e0-f7b6067fa960, level 20, PIC X(01).). */
    public String wsEditOpenYearFlg;

    /** WS-EDIT-OPEN-MONTH (uuid:f9eb5456-a1f1-5bc7-8a39-53c5903a9f0d, level 20, PIC X(01).). */
    public String wsEditOpenMonth;

    /** WS-EDIT-OPEN-DAY (uuid:9b71ed55-463d-5686-46db-a1b923581fb9, level 20, PIC X(01).). */
    public String wsEditOpenDay;

    /** WS-EXPIRY-DATE-FLGS (uuid:c6ae8715-a45a-aa7a-6571-76656f0c9a0e, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsExpiryDateFlgs;

    /** WS-EDIT-EXPIRY-YEAR-FLG (uuid:3e4c4469-e996-57c1-ef5d-ab5722a55130, level 20, PIC X(01).). */
    public String wsEditExpiryYearFlg;

    /** WS-EDIT-EXPIRY-MONTH (uuid:2b6cf08a-3433-315f-f9b3-5dc799bf5c3c, level 20, PIC X(01).). */
    public String wsEditExpiryMonth;

    /** WS-EDIT-EXPIRY-DAY (uuid:b3e3dd7a-1a59-a334-5847-4a9220b84e26, level 20, PIC X(01).). */
    public String wsEditExpiryDay;

    /** WS-EDIT-REISSUE-DATE-FLGS (uuid:59dcf2dd-c191-9e07-f224-5bd03d328913, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditReissueDateFlgs;

    /** WS-EDIT-REISSUE-YEAR-FLG (uuid:c839e614-3fa1-10f8-4d39-2081869a70f7, level 20, PIC X(01).). */
    public String wsEditReissueYearFlg;

    /** WS-EDIT-REISSUE-MONTH (uuid:b7118f93-b3ef-8518-cec7-4ea9986cd0d2, level 20, PIC X(01).). */
    public String wsEditReissueMonth;

    /** WS-EDIT-REISSUE-DAY (uuid:cd411759-c067-4a61-279b-7dc4e9ef622a, level 20, PIC X(01).). */
    public String wsEditReissueDay;

    /** WS-EDIT-NAME-FLAGS (uuid:c6916b00-9481-9d25-e9ad-ee5bff70156c, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditNameFlags;

    /** WS-EDIT-FIRST-NAME-FLGS (uuid:6a7b0c72-b286-2629-10ac-e76b3aa8d071, level 20, PIC X(01).). */
    public String wsEditFirstNameFlgs;

    /** WS-EDIT-MIDDLE-NAME-FLGS (uuid:b9c7045b-5be5-4565-5d0f-a4deaf0a8c7b, level 20, PIC X(01).). */
    public String wsEditMiddleNameFlgs;

    /** WS-EDIT-LAST-NAME-FLGS (uuid:0d015ce9-7dd6-3f8a-c331-7ab8da254973, level 20, PIC X(01).). */
    public String wsEditLastNameFlgs;

    /** WS-EDIT-ADDRESS-FLAGS (uuid:c34b0b40-3e98-e55c-9bc5-ac1dfbf65031, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditAddressFlags;

    /** WS-EDIT-ADDRESS-LINE-1-FLGS (uuid:63be148e-00a9-d4a0-f4b9-8668d7598414, level 20, PIC X(01).). */
    public String wsEditAddressLine1Flgs;

    /** WS-EDIT-ADDRESS-LINE-2-FLGS (uuid:837ca84a-f0cf-4d75-cc86-3e97772c83e9, level 20, PIC X(01).). */
    public String wsEditAddressLine2Flgs;

    /** WS-EDIT-CITY-FLGS (uuid:97e23193-87f3-a317-657e-7b6093c4ce5a, level 20, PIC X(01).). */
    public String wsEditCityFlgs;

    /** WS-EDIT-STATE-FLGS (uuid:02b686ee-100d-8827-dcc5-7120948a9967, level 20, PIC X(01).). */
    public String wsEditStateFlgs;

    /** WS-EDIT-ZIPCODE-FLGS (uuid:06589455-c7e1-5667-c276-79d26610c255, level 20, PIC X(01).). */
    public String wsEditZipcodeFlgs;

    /** WS-EDIT-COUNTRY-FLGS (uuid:4c1f8a04-9e32-4926-153e-b35affcd90fc, level 20, PIC X(01).). */
    public String wsEditCountryFlgs;

    /** WS-EDIT-PHONE-NUM-1-FLGS (uuid:3533885f-2be7-11b4-9221-d5ecd8d5aa4f, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditPhoneNum1Flgs;

    /** WS-EDIT-PHONE-NUM-1A-FLG (uuid:cfb04b49-2fbb-90f4-ab1c-c687d07ba09c, level 30, PIC X(01).). */
    public String wsEditPhoneNum1aFlg;

    /** WS-EDIT-PHONE-NUM-1B (uuid:6226c001-0f76-53b6-505c-458494b100e9, level 30, PIC X(01).). */
    public String wsEditPhoneNum1b;

    /** WS-EDIT-PHONE-NUM-1C (uuid:25be4bb2-974d-ce34-ac31-d2dbfade2007, level 30, PIC X(01).). */
    public String wsEditPhoneNum1c;

    /** WS-EDIT-PHONE-NUM-2-FLGS (uuid:b7f8b9bc-d27b-6880-8295-9c6a2dd443a4, level 20, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsEditPhoneNum2Flgs;

    /** WS-EDIT-PHONE-NUM-2A-FLG (uuid:8d654b38-7439-d84f-49a9-3822b7f4bdf2, level 30, PIC X(01).). */
    public String wsEditPhoneNum2aFlg;

    /** WS-EDIT-PHONE-NUM-2B (uuid:f85d5f8d-5649-679d-731c-e04ccb3a7f2c, level 30, PIC X(01).). */
    public String wsEditPhoneNum2b;

    /** WS-EDIT-PHONE-NUM-2C (uuid:7efce21e-35a7-9b7b-7c93-1c2636602a1b, level 30, PIC X(01).). */
    public String wsEditPhoneNum2c;

    /** WS-EFT-ACCOUNT-ID-FLGS (uuid:ae2e6cad-cbd8-4007-a31c-09f34ecd7010, level 10, PIC X(01).). */
    public String wsEftAccountIdFlgs;

    /** WS-EDIT-PRI-CARDHOLDER (uuid:487d98ab-feab-94a3-f407-0b4b083a7302, level 10, PIC X(1).). */
    public String wsEditPriCardholder;

    /** CICS-OUTPUT-EDIT-VARS (uuid:147c31cd-dd3a-9c80-fbfb-6cae26483bdd, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cicsOutputEditVars;

    /** CUST-ACCT-ID-X (uuid:cae5ada6-1f4a-d9a5-57f2-3b7d86538227, level 10, PIC X(11).). */
    public String custAcctIdX;

    /** CUST-ACCT-ID-N (uuid:1891126e-83cb-46d9-e7ad-433a296684c4, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ custAcctIdN;

    /** WS-EDIT-DATE-X (uuid:54769433-cffe-1a15-cf49-ed2c88029af7, level 10, PIC X(10).). */
    public String wsEditDateX;

    /** WS-EDIT-DATE-X-YEAR (uuid:4a9fa05b-46a2-02d7-9aad-4d3fa01d1309, level 20, PIC X(4).). */
    public String wsEditDateXYear;

    /** WS-EDIT-DATE-MONTH (uuid:f00d2dc3-7eb3-2123-56be-11f98425b0db, level 20, PIC X(2).). */
    public String wsEditDateMonth;

    /** WS-EDIT-DATE-DAY (uuid:2b1f356c-107a-fccc-7b71-377ea7f10b93, level 20, PIC X(2).). */
    public String wsEditDateDay;

    /** WS-EDIT-DATE-X (uuid:8019d4a0-7452-2273-45c2-fd940bf08542, level 10, PIC X(10).). */
    public String wsEditDateX;

    /** WS-EDIT-CURRENCY-9-2 (uuid:b419731c-3445-cdf7-874a-13a15c07fa97, level 10, PIC X(15).). */
    public String wsEditCurrency92;

    /** WS-EDIT-CURRENCY-9-2-F (uuid:e59022e7-0666-346f-1c70-8ed2f2556552, level 10, PIC +ZZZ,ZZZ,ZZZ.99.). */
    public int /* PIC +ZZZ,ZZZ,ZZZ.99. */ wsEditCurrency92F;

    /** WS-XREF-RID (uuid:724fa741-009a-ec03-0276-f2d45042b71a, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsXrefRid;

    /** WS-CARD-RID-CARDNUM (uuid:98ecf809-734b-284c-0b01-e9041ddff7b6, level 10, PIC X(16).). */
    public String wsCardRidCardnum;

    /** WS-CARD-RID-CUST-ID (uuid:f9f0f4c0-44d6-2db8-2621-f0e9622896a6, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ wsCardRidCustId;

    /** WS-CARD-RID-CUST-ID-X (uuid:c783cf5b-119b-2e9b-c11d-6281f108a62d, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCardRidCustIdX;

    /** WS-CARD-RID-ACCT-ID (uuid:6b52c6e7-8f65-4114-b559-a93cdc3554d4, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ wsCardRidAcctId;

    /** WS-CARD-RID-ACCT-ID-X (uuid:aa514150-b32f-b540-91bf-688c339ec4d5, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCardRidAcctIdX;

    /** WS-FILE-READ-FLAGS (uuid:5da9c092-aea0-8eb6-e6c5-8531dfa78375, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsFileReadFlags;

    /** WS-ACCOUNT-MASTER-READ-FLAG (uuid:dac88d30-f7b1-9117-b2fa-e038b9ce2da2, level 10, PIC X(1).). */
    public String wsAccountMasterReadFlag;

    /** WS-CUST-MASTER-READ-FLAG (uuid:d9f5a7b0-1faf-a371-567d-b8a51414e915, level 10, PIC X(1).). */
    public String wsCustMasterReadFlag;

    /** WS-FILE-ERROR-MESSAGE (uuid:26b459cc-c491-00c5-4a4c-03f27b93cd43, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsFileErrorMessage;

    /** ERROR-OPNAME (uuid:faf6b9c1-055e-094a-1a5d-a22e78c91bc2, level 10, PIC X(8)). */
    public String errorOpname;

    /** ERROR-FILE (uuid:2c186b5c-65ea-7188-ab66-f40d17b1370b, level 10, PIC X(9)). */
    public int /* PIC X(9) */ errorFile;

    /** ERROR-RESP (uuid:80240f3e-3244-e096-be20-c2238125f093, level 10, PIC X(10)). */
    public String errorResp;

    /** ERROR-RESP2 (uuid:05ac5897-9c32-684f-d722-1defcc9c6971, level 10, PIC X(10)). */
    public String errorResp2;

    /** ALPHA-VARS-FOR-DATA-EDITING (uuid:013b9e1a-f9db-332e-eefa-6d93e93cf8e9, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ alphaVarsForDataEditing;

    /** ACUP-NEW-CREDIT-LIMIT-X (uuid:6c430a20-26be-3a27-311d-fa3c9a54c84e, level 15, PIC X(15).). */
    public String acupNewCreditLimitX;

    /** ACUP-NEW-CASH-CREDIT-LIMIT-X (uuid:928d8db2-e280-04f8-7101-1f5c3b70ab98, level 15, PIC X(15).). */
    public String acupNewCashCreditLimitX;

    /** ACUP-NEW-CURR-BAL-X (uuid:0f50e7da-421a-1629-f803-d2047f690028, level 15, PIC X(15).). */
    public String acupNewCurrBalX;

    /** ACUP-NEW-CURR-CYC-CREDIT-X (uuid:637503b0-f82f-494f-f100-648d5c90a202, level 15, PIC X(15).). */
    public String acupNewCurrCycCreditX;

    /** ACUP-NEW-CURR-CYC-DEBIT-X (uuid:98455e76-7a94-fac8-7085-dfb8a368dabc, level 15, PIC X(15).). */
    public String acupNewCurrCycDebitX;

    /** ACCT-UPDATE-RECORD (uuid:613c4be7-d992-e0e9-3167-ef08157f24d0, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctUpdateRecord;

    /** ACCT-UPDATE-ID (uuid:e540f4c3-ebd9-51b7-6364-efca9a9c7150, level 15, PIC 9(11).). */
    public long /* PIC 9(11). */ acctUpdateId;

    /** ACCT-UPDATE-ACTIVE-STATUS (uuid:a7623182-4414-e162-a86e-1254226ded0e, level 15, PIC X(01).). */
    public String acctUpdateActiveStatus;

    /** ACCT-UPDATE-CURR-BAL (uuid:01d8b73c-baf2-89f7-74ed-cba512faa2e3, level 15, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctUpdateCurrBal;

    /** ACCT-UPDATE-CREDIT-LIMIT (uuid:cd1fb28d-9dd2-b510-a583-efe7dd9f0386, level 15, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctUpdateCreditLimit;

    /** ACCT-UPDATE-CASH-CREDIT-LIMIT (uuid:c7205a0b-6fe1-8234-6e1f-52c8ce9a9256, level 15, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctUpdateCashCreditLimit;

    /** ACCT-UPDATE-OPEN-DATE (uuid:422ca083-b4a1-b524-e3c4-1d39db485944, level 15, PIC X(10).). */
    public String acctUpdateOpenDate;

    /** ACCT-UPDATE-EXPIRAION-DATE (uuid:b59d3a75-022b-a261-e7ff-634e7b7ab51d, level 15, PIC X(10).). */
    public String acctUpdateExpiraionDate;

    /** ACCT-UPDATE-REISSUE-DATE (uuid:96d863c5-fd94-720e-1574-c5e03de0a8a9, level 15, PIC X(10).). */
    public String acctUpdateReissueDate;

    /** ACCT-UPDATE-CURR-CYC-CREDIT (uuid:e5760f58-413c-6ffc-3f22-bf853668f4fb, level 15, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctUpdateCurrCycCredit;

    /** ACCT-UPDATE-CURR-CYC-DEBIT (uuid:4539089c-a989-e910-d50d-e502960a5f34, level 15, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctUpdateCurrCycDebit;

    /** ACCT-UPDATE-GROUP-ID (uuid:a09624f8-1f18-01ae-1e12-2224d325bf4c, level 15, PIC X(10).). */
    public String acctUpdateGroupId;

    /** CUST-UPDATE-RECORD (uuid:32642652-988c-a5fd-d87a-b2b267ab6acb, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ custUpdateRecord;

    /** CUST-UPDATE-ID (uuid:8c4dc772-bd31-c22b-dfa5-5828c5e83a56, level 15, PIC 9(09).). */
    public int /* PIC 9(09). */ custUpdateId;

    /** CUST-UPDATE-FIRST-NAME (uuid:4bf6f54e-052b-83e6-f93a-7f591da8f7d2, level 15, PIC X(25).). */
    public String custUpdateFirstName;

    /** CUST-UPDATE-MIDDLE-NAME (uuid:bfb2b911-e572-af9e-3940-c5487434f39b, level 15, PIC X(25).). */
    public String custUpdateMiddleName;

    /** CUST-UPDATE-LAST-NAME (uuid:609af9c8-bd2b-1dea-a60b-f1d6efd2e9d2, level 15, PIC X(25).). */
    public String custUpdateLastName;

    /** CUST-UPDATE-ADDR-LINE-1 (uuid:30cad27a-a627-8173-d5c4-d693339d0a52, level 15, PIC X(50).). */
    public String custUpdateAddrLine1;

    /** CUST-UPDATE-ADDR-LINE-2 (uuid:e66d5cb2-c4d7-6049-ae0f-cc2571330e23, level 15, PIC X(50).). */
    public String custUpdateAddrLine2;

    /** CUST-UPDATE-ADDR-LINE-3 (uuid:e438936c-04af-4eb1-b439-284d3d10d84f, level 15, PIC X(50).). */
    public String custUpdateAddrLine3;

    /** CUST-UPDATE-ADDR-STATE-CD (uuid:aade6bf0-e6ac-b16f-785b-b8f0833d8d65, level 15, PIC X(02).). */
    public String custUpdateAddrStateCd;

    /** CUST-UPDATE-ADDR-COUNTRY-CD (uuid:5e0e4a50-6d90-81b1-0542-fd2330e2baaf, level 15, PIC X(03).). */
    public String custUpdateAddrCountryCd;

    /** CUST-UPDATE-ADDR-ZIP (uuid:fa21de61-d03e-f28f-6575-3e9e48e7501d, level 15, PIC X(10).). */
    public String custUpdateAddrZip;

    /** CUST-UPDATE-PHONE-NUM-1 (uuid:668b149d-ad82-4eb1-9f99-0263c516eac4, level 15, PIC X(15).). */
    public String custUpdatePhoneNum1;

    /** CUST-UPDATE-PHONE-NUM-2 (uuid:b2641bf5-b19c-c02b-450f-1fbcb3ede6bf, level 15, PIC X(15).). */
    public String custUpdatePhoneNum2;

    /** CUST-UPDATE-SSN (uuid:2857e298-2f93-2270-e2cd-11d830c35790, level 15, PIC 9(09).). */
    public int /* PIC 9(09). */ custUpdateSsn;

    /** CUST-UPDATE-GOVT-ISSUED-ID (uuid:0b699609-bd94-bd7c-a503-7616248c52b9, level 15, PIC X(20).). */
    public String custUpdateGovtIssuedId;

    /** CUST-UPDATE-DOB-YYYY-MM-DD (uuid:ced631b4-2c3d-7c5c-cd84-da3a3da40aa7, level 15, PIC X(10).). */
    public String custUpdateDobYyyyMmDd;

    /** CUST-UPDATE-EFT-ACCOUNT-ID (uuid:5a06645b-12c5-6d4a-f733-95f04c1fad59, level 15, PIC X(10).). */
    public String custUpdateEftAccountId;

    /** CUST-UPDATE-PRI-CARD-IND (uuid:54063ff5-1fa6-b8bb-0c3c-4f1ed44532cc, level 15, PIC X(01).). */
    public String custUpdatePriCardInd;

    /** CUST-UPDATE-FICO-CREDIT-SCORE (uuid:bb7dba9e-0ab9-ba48-ac2b-1638062aaf07, level 15, PIC 9(03).). */
    public int /* PIC 9(03). */ custUpdateFicoCreditScore;

    /** WS-LONG-MSG (uuid:8555de9a-0861-eb95-0522-d6f8fc7688db, level 5, PIC X(500).). */
    public String wsLongMsg;

    /** WS-INFO-MSG (uuid:400fa52e-5ef1-f7aa-7cb5-11933b279d30, level 5, PIC X(40).). */
    public String wsInfoMsg;

    /** WS-RETURN-MSG (uuid:28d7304a-470c-8100-26d9-fb2dd8fa1247, level 5, PIC X(75).). */
    public String wsReturnMsg;

    /** WS-LITERALS (uuid:0264d1ac-6d16-2ca1-bca2-97906714ac95, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsLiterals;

    /** LIT-THISPGM (uuid:c1aa1e21-1183-bad1-2cc7-337d760498c6, level 5, PIC X(8)). */
    public String litThispgm;

    /** LIT-THISTRANID (uuid:46d8ecab-8677-3de4-f1bf-368b1b637570, level 5, PIC X(4)). */
    public String litThistranid;

    /** LIT-THISMAPSET (uuid:c036c065-f37a-2304-f842-67a90ffb1891, level 5, PIC X(8)). */
    public String litThismapset;

    /** LIT-THISMAP (uuid:8af6c8ec-2abb-360b-ea0e-2b53684eac52, level 5, PIC X(7)). */
    public String litThismap;

    /** LIT-CARDUPDATE-PGM (uuid:a3a3e907-3216-c81d-838d-2e10e4aba638, level 5, PIC X(8)). */
    public String litCardupdatePgm;

    /** LIT-CARDUPDATE-TRANID (uuid:6e78bcb6-1ce1-9893-6d14-51c4588bef04, level 5, PIC X(4)). */
    public String litCardupdateTranid;

    /** LIT-CARDUPDATE-MAPSET (uuid:7f535d2d-d1b3-0c24-2744-05dae2d7675a, level 5, PIC X(8)). */
    public String litCardupdateMapset;

    /** LIT-CARDUPDATE-MAP (uuid:f1a75eea-a54c-ac4a-4117-59c786e51e06, level 5, PIC X(7)). */
    public String litCardupdateMap;

    /** LIT-CCLISTPGM (uuid:bc984104-63c7-0045-013b-54325b87fa11, level 5, PIC X(8)). */
    public String litCclistpgm;

    /** LIT-CCLISTTRANID (uuid:1e688f60-44ed-3fa2-f585-9daee36fc580, level 5, PIC X(4)). */
    public String litCclisttranid;

    /** LIT-CCLISTMAPSET (uuid:d3c23335-b078-8782-c1e4-ba6d89036fb5, level 5, PIC X(7)). */
    public String litCclistmapset;

    /** LIT-CCLISTMAP (uuid:1a1703de-5466-df98-e2c0-0cad0c42941e, level 5, PIC X(7)). */
    public String litCclistmap;

    /** LIT-MENUPGM (uuid:7e804ca8-4327-3159-15a8-0bf7734c7987, level 5, PIC X(8)). */
    public String litMenupgm;

    /** LIT-MENUTRANID (uuid:a1b68b1b-e50d-2708-a385-9d6f100dc2d7, level 5, PIC X(4)). */
    public String litMenutranid;

    /** LIT-MENUMAPSET (uuid:d28fdf55-c63d-ef0b-4499-bb9fd5dad793, level 5, PIC X(7)). */
    public String litMenumapset;

    /** LIT-MENUMAP (uuid:baf8af5a-d33b-7a69-4699-37cdb2b03431, level 5, PIC X(7)). */
    public String litMenumap;

    /** LIT-CARDDTLPGM (uuid:14484594-d938-72ae-2ad1-b7bb5fe13955, level 5, PIC X(8)). */
    public String litCarddtlpgm;

    /** LIT-CARDDTLTRANID (uuid:9ddfb527-fb6a-4706-328f-d9693d71c328, level 5, PIC X(4)). */
    public String litCarddtltranid;

    /** LIT-CARDDTLMAPSET (uuid:4102fde2-8aff-7116-1cb4-b36f3f9e8d8d, level 5, PIC X(7)). */
    public String litCarddtlmapset;

    /** LIT-CARDDTLMAP (uuid:1cdde133-8094-e25b-9062-5b55e947fd2d, level 5, PIC X(7)). */
    public String litCarddtlmap;

    /** LIT-ACCTFILENAME (uuid:5ad57009-c6a5-e724-cf64-2ce4416180d3, level 5, PIC X(8)). */
    public String litAcctfilename;

    /** LIT-CUSTFILENAME (uuid:147011c1-14dd-09bf-4fa1-333987c8ee07, level 5, PIC X(8)). */
    public String litCustfilename;

    /** LIT-CARDFILENAME (uuid:0b6cf2d1-a863-ab84-7138-6c1aece9d6d0, level 5, PIC X(8)). */
    public String litCardfilename;

    /** LIT-CARDFILENAME-ACCT-PATH (uuid:09b60d31-d85a-470e-10c0-ad1411eea534, level 5, PIC X(8)). */
    public String litCardfilenameAcctPath;

    /** LIT-CARDXREFNAME-ACCT-PATH (uuid:afe5cdf6-6eb6-db06-28ed-0269e0df2a06, level 5, PIC X(8)). */
    public String litCardxrefnameAcctPath;

    /** LIT-ALL-ALPHANUM-FROM-X (uuid:ed1d211f-2cbb-1dfd-d44c-99a8444be135, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litAllAlphanumFromX;

    /** LIT-ALL-ALPHA-FROM-X (uuid:fbe123a0-4d83-e0ed-6be0-1fb7c10c2dbd, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ litAllAlphaFromX;

    /** LIT-UPPER (uuid:e191ccb1-9cb2-b4be-4234-eb7eede9f811, level 15, PIC X(26)). */
    public String litUpper;

    /** LIT-LOWER (uuid:4775dc72-b4f8-0397-ca15-b66cd7ed870a, level 15, PIC X(26)). */
    public String litLower;

    /** LIT-NUMBERS (uuid:4b12c542-1326-28fb-f9ed-8283c17bbef6, level 10, PIC X(10)). */
    public String litNumbers;

    /** CC-WORK-AREAS (uuid:93586945-265e-1ffc-2e9d-1098bf0e8ff9, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccWorkAreas;

    /** CC-WORK-AREA (uuid:581ab397-0171-cff9-cb1f-92e7ae1dc92d, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccWorkArea;

    /** CCARD-AID (uuid:91a80f43-1438-b8ba-e8b1-71668a0dbb04, level 10, PIC X(5).). */
    public String ccardAid;

    /** CCARD-NEXT-PROG (uuid:622afb0e-4fe4-00aa-7039-ea23e428fa6e, level 10, PIC X(8).). */
    public String ccardNextProg;

    /** CCARD-NEXT-MAPSET (uuid:c1dced6c-c351-f191-e270-c741446f3244, level 10, PIC X(7).). */
    public String ccardNextMapset;

    /** CCARD-NEXT-MAP (uuid:16ad6d61-99d6-0aa1-f554-19242b29b1e5, level 10, PIC X(7).). */
    public String ccardNextMap;

    /** CCARD-ERROR-MSG (uuid:253e0554-bc8c-caf9-3b49-b9e805220d80, level 10, PIC X(75).). */
    public String ccardErrorMsg;

    /** CCARD-RETURN-MSG (uuid:73817130-0dbc-8eae-3217-b45238f98deb, level 10, PIC X(75).). */
    public String ccardReturnMsg;

    /** CC-ACCT-ID (uuid:bae7b25f-772d-a2e3-6077-54d3daef4176, level 10, PIC X(11)). */
    public String ccAcctId;

    /** CC-ACCT-ID-N (uuid:f22c3a11-e798-6d9e-63bc-b36597e6f166, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ ccAcctIdN;

    /** CC-CARD-NUM (uuid:b193e37f-8b78-f991-8919-1ee27ff16f74, level 10, PIC X(16)). */
    public String ccCardNum;

    /** CC-CARD-NUM-N (uuid:42b48f98-5849-9b26-82c8-d33fe01e1cb2, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ ccCardNumN;

    /** CC-CUST-ID (uuid:e1c4b9b6-ff81-417d-041a-248079067343, level 10, PIC X(09)). */
    public int /* PIC X(09) */ ccCustId;

    /** CC-CUST-ID-N (uuid:a47b2783-f604-054c-53eb-f9747890cc59, level 10, PIC 9(9).). */
    public int /* PIC 9(9). */ ccCustIdN;

    /** WS-US-PHONE-AREA-CODE-TO-EDIT (uuid:e556c012-4c9c-e18c-dc66-5a5b0f81fee7, level 1, PIC XXX.). */
    public String wsUsPhoneAreaCodeToEdit;

    /** US-STATE-CODE-TO-EDIT (uuid:f048ebc8-a0d5-1886-49b0-e3d0221fc36e, level 1, PIC X(2).). */
    public String usStateCodeToEdit;

    /** US-STATE-ZIPCODE-TO-EDIT (uuid:06baa1a0-afa6-d288-580c-02b1701c47ff, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ usStateZipcodeToEdit;

    /** US-STATE-AND-FIRST-ZIP2 (uuid:5f5fa9b9-36cb-75ee-1314-db3493976b9d, level 2, PIC X(4).). */
    public String usStateAndFirstZip2;

    /** LAST-3-OF-ZIP (uuid:a3e8e24c-f56e-49bd-e094-57cb8ee2ecf0, level 2, PIC X(3).). */
    public String last3OfZip;

    /** LIT-ALL-ALPHA-FROM (uuid:76656838-86fd-7d51-d82d-e41f4360584d, level 1, PIC X(52)). */
    public String litAllAlphaFrom;

    /** LIT-ALL-ALPHANUM-FROM (uuid:a88dacec-d7ad-1521-0bc7-45d3797ed89d, level 1, PIC X(62)). */
    public String litAllAlphanumFrom;

    /** LIT-ALL-NUM-FROM (uuid:0d26e57a-645e-6099-a5d0-9575342e639f, level 1, PIC X(10)). */
    public String litAllNumFrom;

    /** LIT-ALPHA-SPACES-TO (uuid:0bab49f0-2944-0bc4-c5f2-d1f0e4acb666, level 77, PIC X(52)). */
    public String litAlphaSpacesTo;

    /** LIT-ALPHANUM-SPACES-TO (uuid:b81ca58d-5125-4e29-b218-19c878cd003f, level 77, PIC X(62)). */
    public String litAlphanumSpacesTo;

    /** LIT-NUM-SPACES-TO (uuid:c73f2ece-b7d5-f513-d4b3-e9c3b43a94af, level 77, PIC X(10)). */
    public String litNumSpacesTo;

    /** DFHBMSCA (uuid:c6e43ab6-6d0a-ae82-c561-e9d2e6049f15, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmsca;

    /** DFHBMPEM (uuid:eec3757d-fc00-752e-f311-0d478c63a60d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpem;

    /** DFHBMPNL (uuid:31277cce-d0b2-2f78-fc47-8931ee7d1e63, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpnl;

    /** DFHBMPFF (uuid:4605bab6-9211-c627-2da4-8138a05d8265, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpff;

    /** DFHBMPCR (uuid:bf047f7c-b4ef-8938-e4ff-d711e2c18c7f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpcr;

    /** DFHBMASK (uuid:b7c0c6b3-99d1-0df3-5ffb-f4685dea3ec9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmask;

    /** DFHBMUNP (uuid:95ed89b0-cf26-d1bb-9c1f-2fb4e8cce206, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunp;

    /** DFHBMUNN (uuid:3c7c14bf-9e32-7915-2cdc-8edfea99e4d5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmunn;

    /** DFHBMPRO (uuid:407cb05c-3dee-c99c-7bc6-23335204a28d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmpro;

    /** DFHBMBRY (uuid:38f897db-8bef-a661-0f70-e987b8720f7e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmbry;

    /** DFHBMDAR (uuid:99526939-3ec2-a223-710f-f3aea1382fe1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdar;

    /** DFHBMFSE (uuid:d2f35cf1-91c8-de43-15d0-fb4493b5c3d5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmfse;

    /** DFHBMPRF (uuid:09060c8c-8423-fb81-5989-a52d1ffbd060, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmprf;

    /** DFHBMASF (uuid:ba935382-493c-ddc4-9a9a-1a588364f6af, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasf;

    /** DFHBMASB (uuid:1c0fc8ac-6bd6-77fd-3ab5-773a30483ba8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmasb;

    /** DFHBMEOF (uuid:bf75a9aa-5702-a175-4df7-ae1750616667, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmeof;

    /** DFHBMDET (uuid:10342215-5fdd-c973-3aa3-74f3f6212b8f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbmdet;

    /** DFHRED (uuid:20454b94-7b7a-eaf1-9cc7-94ef0ae1f24c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhred;

    /** DFHGREEN (uuid:d28f96da-3aca-af5d-bff4-046ac769001a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhgreen;

    /** DFHYELLO (uuid:430e16c3-a930-d811-ef38-8b8d5bd566ea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhyello;

    /** DFHBLUE (uuid:cdce1aea-252d-b163-4696-84b851be80d3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblue;

    /** DFHPINK (uuid:22b34c73-c584-13d3-b8a3-7dce522457ea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpink;

    /** DFHTURQ (uuid:710b7441-e791-4f82-fec3-393ceb275bea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhturq;

    /** DFHNEUTR (uuid:5b9c4125-1e88-2502-78f0-c1ad7c008c8a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhneutr;

    /** DFHDFCOL (uuid:3fd7cf16-fe12-3eca-4e9e-9be475b42c2e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfcol;

    /** DFHBASE (uuid:2897c97d-1d46-0e18-a42b-5da255278a55, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhbase;

    /** DFHDFHI (uuid:e5715fe3-1e88-182b-9e7c-e836a0be51cb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhdfhi;

    /** DFHBLINK (uuid:c5b94d6f-d118-4ebd-f7f5-2dfece796a03, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhblink;

    /** DFHREVRS (uuid:f38c381f-b394-259b-1023-2776042b7aef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhrevrs;

    /** DFHUNDLN (uuid:6a142068-18a8-521c-0f1b-8682a602f38b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhundln;

    /** DFHAID (uuid:2c448d76-5c1e-e3d1-5511-5bbaf27fc5d3, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhaid;

    /** DFHNULL (uuid:1bab4fff-a0a7-2555-6454-f6f928a85150, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhnull;

    /** DFHENTER (uuid:120b6aa2-bbc0-9425-4259-41dfcc476755, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhenter;

    /** DFHCLEAR (uuid:efe14e3d-40c5-e1af-77b5-e2f3988848c1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclear;

    /** DFHCLRP (uuid:d9324d66-9b20-6aef-54f5-e672228d3a3c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhclrp;

    /** DFHPEN (uuid:5286785f-6556-83ee-bdb8-7ca1153648f3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpen;

    /** DFHOPID (uuid:e6a1cabb-37b4-6f2e-2726-63477c1d0a4f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhopid;

    /** DFHMSRE (uuid:28fd8572-b270-6ebe-d8f7-86abd3bd5659, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhmsre;

    /** DFHSTRF (uuid:58c5dba0-172c-867d-ff49-ef22c5d718ee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhstrf;

    /** DFHTRIG (uuid:338d00ba-cb60-1fe6-31d2-cbb0d07e0945, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhtrig;

    /** DFHPA1 (uuid:9cbc5843-18ea-1ad5-bb4d-ccad51f02b08, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa1;

    /** DFHPA2 (uuid:689f34ca-8074-314c-6f1e-13a185ae969f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa2;

    /** DFHPA3 (uuid:07c198d2-0198-4e92-7c9a-8bc41ba493f3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpa3;

    /** DFHPF1 (uuid:c176a756-b5c7-9e53-5d71-83d0fc96ae10, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf1;

    /** DFHPF2 (uuid:9c92e541-e8e7-d51d-0382-240bf7c5c689, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf2;

    /** DFHPF3 (uuid:3d728cfe-1c33-fcc9-0903-41d57d259337, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf3;

    /** DFHPF4 (uuid:9fa2aa39-9ebe-ff10-af95-89275b219901, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf4;

    /** DFHPF5 (uuid:5aeeb4b0-0f8f-d8c3-1203-60bddf921059, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf5;

    /** DFHPF6 (uuid:9ef21ca2-579d-612c-e085-e00ec856acd5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf6;

    /** DFHPF7 (uuid:c21a87b1-6f07-1077-bbfc-82429ade4553, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf7;

    /** DFHPF8 (uuid:4d0e1ddb-ed2e-c5ad-6ba5-8d2908ce5a7b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf8;

    /** DFHPF9 (uuid:c71e420b-1ccd-b509-71f6-808134e563da, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf9;

    /** DFHPF10 (uuid:15d0c08a-3d9f-7754-15f9-2965c7dbf19c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf10;

    /** DFHPF11 (uuid:d1a3943d-7770-0b85-5209-05b0e0d75d98, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf11;

    /** DFHPF12 (uuid:ae1bf6e9-37a0-efbb-0fdf-1fd5aaf19490, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf12;

    /** DFHPF13 (uuid:69696055-a255-14e0-0275-c6eced9f882c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf13;

    /** DFHPF14 (uuid:fef12b14-a08d-eb47-1ac2-e3fc9c587b54, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf14;

    /** DFHPF15 (uuid:0d96913f-77cc-82a2-0f7b-af743b458b9c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf15;

    /** DFHPF16 (uuid:ace1c460-6865-99f8-19e0-efeeac5a6cf2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf16;

    /** DFHPF17 (uuid:27255fa1-d009-4159-1f08-b657edd983e6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf17;

    /** DFHPF18 (uuid:6f84081f-5a56-c1fc-86af-2ed01d9b92ee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf18;

    /** DFHPF19 (uuid:0fe6000a-3422-0556-0b46-a5bce0439185, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf19;

    /** DFHPF20 (uuid:a74ee754-011f-40a7-b31d-752df717c123, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf20;

    /** DFHPF21 (uuid:ac82ddd8-3f9c-9e3e-78de-5e135b0470a8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf21;

    /** DFHPF22 (uuid:93b2400b-0a59-8c4a-5e4f-ae4234a99fb7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf22;

    /** DFHPF23 (uuid:c467d7bc-fc22-42b2-d0a1-7da73b9ba3a8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf23;

    /** DFHPF24 (uuid:711c04e6-5010-c1ff-338d-8c52c0bc8bc1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dfhpf24;

    /** CCDA-SCREEN-TITLE (uuid:105e199c-7da5-07d3-ffab-3d6438f77cf3, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaScreenTitle;

    /** CCDA-TITLE01 (uuid:70b8f5b0-d649-452a-932d-095504a18cc6, level 5, PIC X(40)). */
    public String ccdaTitle01;

    /** CCDA-TITLE02 (uuid:0be8e3a1-b3cb-c835-84a0-11e624b3ef5f, level 5, PIC X(40)). */
    public String ccdaTitle02;

    /** CCDA-THANK-YOU (uuid:0021aa62-28a6-9e5e-0628-400cd03f8fff, level 5, PIC X(40)). */
    public String ccdaThankYou;

    /** CACTUPAI (uuid:a880d29a-2924-0b3c-4495-3f7403032de7, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cactupai;

    /** TRNNAMEL (uuid:f9ab22bf-c3a2-18e6-d44c-4689e0ecb01f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamel;

    /** TRNNAMEF (uuid:c2397e32-d18e-78f7-4783-caabdd05b96d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamef;

    /** TRNNAMEA (uuid:6c395ba4-479a-19d2-002c-6e244d1cd0ad, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamea;

    /** TRNNAMEI (uuid:b63babeb-704d-2f99-1b5c-6081d194ca05, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamei;

    /** TITLE01L (uuid:6fb0ffb1-d2fa-e3ef-0d70-e23195b0d052, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01l;

    /** TITLE01F (uuid:e68b910f-d2b7-6ad6-e460-4d4a19e9b430, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01f;

    /** TITLE01A (uuid:e130b1d5-bc87-95d1-168d-2e6dd2673121, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01a;

    /** TITLE01I (uuid:01a080ae-b189-ca9a-3844-4edeb92f6e13, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01i;

    /** CURDATEL (uuid:297463a4-0c1b-773f-f3eb-d30ad22cbad8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatel;

    /** CURDATEF (uuid:d7040304-80c8-4157-b751-145d128d9179, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatef;

    /** CURDATEA (uuid:120ac4b0-2386-5f48-98c8-920e8496f2e8, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatea;

    /** CURDATEI (uuid:263453d2-637a-7605-3b53-42bbe4e92da5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatei;

    /** PGMNAMEL (uuid:35acaef4-f253-9c81-ac90-2cb5af1dce3f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamel;

    /** PGMNAMEF (uuid:8eb71af9-033d-1aaf-c705-dc91998829ca, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamef;

    /** PGMNAMEA (uuid:a76f7222-3c79-4965-6d99-cabe887ac2e7, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamea;

    /** PGMNAMEI (uuid:5ccf1ea6-84a5-f6e1-c2e2-f87e53ea3133, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamei;

    /** TITLE02L (uuid:2c57bc10-3c34-c3d4-7112-7cefcbb5a336, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02l;

    /** TITLE02F (uuid:f9af92d2-3d6d-7037-cc6f-4bcf970931c8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02f;

    /** TITLE02A (uuid:0fa71d8b-0c88-a448-3960-ab7bba710e19, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02a;

    /** TITLE02I (uuid:ec1ac372-189a-2a01-3e80-a71a8da01fe6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02i;

    /** CURTIMEL (uuid:5ed7150a-cf56-19b5-83f0-634961985c7c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimel;

    /** CURTIMEF (uuid:a88cef0a-e139-6cc4-2dbc-12b5fd69e59a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimef;

    /** CURTIMEA (uuid:79c0bb97-7221-9228-79a3-36b2260d9a84, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimea;

    /** CURTIMEI (uuid:c38a5ba3-0a81-7d2d-10e0-0774a01581bd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimei;

    /** ACCTSIDL (uuid:109c40c2-f048-4a3c-f27a-08fe541ff576, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidl;

    /** ACCTSIDF (uuid:c828e32a-9ea7-e23f-3b51-560968ab292d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidf;

    /** ACCTSIDA (uuid:c88396d8-a6cb-22d7-7550-0c67d312691e, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsida;

    /** ACCTSIDI (uuid:41d4af7e-d1e1-fa53-920a-263dcab6002a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidi;

    /** ACSTTUSL (uuid:42aba96e-9af7-a20b-8a99-cf7b96185196, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttusl;

    /** ACSTTUSF (uuid:4809b424-a681-0dbc-0c04-4b9dcfd18570, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttusf;

    /** ACSTTUSA (uuid:ca91ae7e-69b5-7e98-a7f3-5d4ecd3fa722, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttusa;

    /** ACSTTUSI (uuid:4a769621-81e4-4922-7682-82ccec7910e2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttusi;

    /** OPNYEARL (uuid:604d2992-9a49-901e-4e86-c8322cf184cc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnyearl;

    /** OPNYEARF (uuid:06f45d8d-8c15-0da3-9f89-99987777f807, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnyearf;

    /** OPNYEARA (uuid:de286a63-9234-5d24-d8f6-dc596dbeae4a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnyeara;

    /** OPNYEARI (uuid:a272d1d8-56d9-1b8a-f135-b77fa52046c8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnyeari;

    /** OPNMONL (uuid:492605e5-e63b-ea76-7e27-2072a84f8ab4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnmonl;

    /** OPNMONF (uuid:ec815705-73c4-298d-d771-8ff81ce933dc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnmonf;

    /** OPNMONA (uuid:f2b41042-661b-4160-63c7-8a70025ceebb, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnmona;

    /** OPNMONI (uuid:945afacf-3fa9-618d-03fa-24b40bf2d8d0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnmoni;

    /** OPNDAYL (uuid:5914e635-4437-b2b3-b4d1-c602d976f97a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opndayl;

    /** OPNDAYF (uuid:4642c591-b9e7-0f90-9469-1632150596b7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opndayf;

    /** OPNDAYA (uuid:d9651fc3-b8b6-66b1-52de-53d5bd87331f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opndaya;

    /** OPNDAYI (uuid:a208f936-8ad7-30aa-b661-304c917e6ed7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opndayi;

    /** ACRDLIML (uuid:e097c443-532b-d89f-f598-bfc4df58dbcc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdliml;

    /** ACRDLIMF (uuid:92f1ff60-14a9-ee32-a7fa-c6766c2eb907, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdlimf;

    /** ACRDLIMA (uuid:59b43071-d280-205b-5833-f1528f5d9a55, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdlima;

    /** ACRDLIMI (uuid:cb63db42-9766-0796-45c5-24194151c004, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdlimi;

    /** EXPYEARL (uuid:69a2e4d0-5047-70c7-75bc-16b4d1d8c867, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearl;

    /** EXPYEARF (uuid:1f90333a-b1dc-ad59-f8b3-331f95f91c0a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearf;

    /** EXPYEARA (uuid:d4954d6d-a8c7-fa25-5fe7-3436a8ead189, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyeara;

    /** EXPYEARI (uuid:65c5a50b-affd-335b-20a8-71bc122553e5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyeari;

    /** EXPMONL (uuid:e4c239e0-fb14-a664-efe1-f50b4de28801, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonl;

    /** EXPMONF (uuid:f54b827d-e740-1658-9d81-28689d85a66a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonf;

    /** EXPMONA (uuid:100c71ca-b076-abed-44a1-697edda13f38, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmona;

    /** EXPMONI (uuid:da6bd669-19a7-02cb-d457-60840847015f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmoni;

    /** EXPDAYL (uuid:ad565a86-211c-4ae8-5147-349b0453e990, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdayl;

    /** EXPDAYF (uuid:63d85f44-389b-a907-6da2-52b3016fbcf5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdayf;

    /** EXPDAYA (uuid:e8fd879d-55ae-5c11-a456-439ab235bf62, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdaya;

    /** EXPDAYI (uuid:c78c1ff6-52b8-580b-0208-2503bdc420d1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdayi;

    /** ACSHLIML (uuid:0943f511-8a8f-7aec-1cc1-16dfe697f912, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshliml;

    /** ACSHLIMF (uuid:afdcc61b-a3b4-c3aa-25ee-9f1e6d7546bf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshlimf;

    /** ACSHLIMA (uuid:fb7c38a9-5e34-0ee1-e023-0053c758fa71, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshlima;

    /** ACSHLIMI (uuid:c6417660-bafe-9a96-e4c0-f4b1905c83e6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshlimi;

    /** RISYEARL (uuid:4517b8bf-0c96-a9d8-6606-1682b2ba9621, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risyearl;

    /** RISYEARF (uuid:5aa2acc0-e588-63d9-de24-42cedb86d5e6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risyearf;

    /** RISYEARA (uuid:c470abde-8a22-2546-dc8d-44df6b28e03f, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risyeara;

    /** RISYEARI (uuid:bf8ac5f9-21d4-098c-f5fc-7282e1e9aeef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risyeari;

    /** RISMONL (uuid:c4357708-de10-7f03-ea4a-5c670c25e3aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ rismonl;

    /** RISMONF (uuid:a3b36235-03dc-410d-bf90-749c07e9f161, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ rismonf;

    /** RISMONA (uuid:84bc265d-9e88-8112-f1b1-76cd4825e56e, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ rismona;

    /** RISMONI (uuid:6eda404a-c0fa-89ba-b4ff-1e4888ff7066, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ rismoni;

    /** RISDAYL (uuid:d71a26de-2b97-595e-23e5-31687cdf11f8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risdayl;

    /** RISDAYF (uuid:25e3fe8c-49f5-11d7-3053-750d19263bed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risdayf;

    /** RISDAYA (uuid:5992d6b9-0992-77b9-1802-0eb365da94f5, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risdaya;

    /** RISDAYI (uuid:72a269e6-dc46-1677-c4fd-ab2f490a36d4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risdayi;

    /** ACURBALL (uuid:27e143b7-b5e9-cc66-2408-bfed38030a61, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurball;

    /** ACURBALF (uuid:7b113dd4-4939-548b-46b4-33b484d16c7f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurbalf;

    /** ACURBALA (uuid:b15de87b-faa3-30dc-0acc-ce8c6bfe0d50, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurbala;

    /** ACURBALI (uuid:6182c3e9-135b-6094-ce0d-6eeb9b126822, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurbali;

    /** ACRCYCRL (uuid:48b39a43-2188-dce4-3b21-2c6ba55ebf2f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycrl;

    /** ACRCYCRF (uuid:a901be13-4380-0059-b195-92ab574790d9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycrf;

    /** ACRCYCRA (uuid:d80cbd2e-36e7-6381-7709-ed0f90b92ece, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycra;

    /** ACRCYCRI (uuid:72745783-8425-55be-3d6b-488717be41bd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycri;

    /** AADDGRPL (uuid:9c6ffd48-39f7-aed2-9aac-180761f58e8b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrpl;

    /** AADDGRPF (uuid:738c169d-8fd4-e347-af57-5db081eeb229, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrpf;

    /** AADDGRPA (uuid:191af310-3c25-b8fc-8310-7e10bc6be76b, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrpa;

    /** AADDGRPI (uuid:4d16feb9-2c41-3bd1-1fd1-0f7d7e91af66, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrpi;

    /** ACRCYDBL (uuid:e6300beb-0c17-0938-68ce-1824372e48a2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydbl;

    /** ACRCYDBF (uuid:736d8a19-96b6-4c12-4a1d-76c917413580, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydbf;

    /** ACRCYDBA (uuid:86fa82af-d3d8-90b6-2935-8687324e6407, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydba;

    /** ACRCYDBI (uuid:5756db4a-732b-1f80-4867-90b652c21f58, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydbi;

    /** ACSTNUML (uuid:fc3caff0-7710-b443-7bdc-f77117705105, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnuml;

    /** ACSTNUMF (uuid:72c1edca-8a3b-8b1d-dccd-d0c1d8df70ed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnumf;

    /** ACSTNUMA (uuid:b76dd7dc-3666-f32d-bbb3-649e3995ca21, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnuma;

    /** ACSTNUMI (uuid:42e34d72-f5ad-e82d-be87-7169c409176f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnumi;

    /** ACTSSN1L (uuid:7f127459-e741-2758-a0e5-7c2d322102b6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn1l;

    /** ACTSSN1F (uuid:42f28024-b9c1-143d-3913-68b043721d07, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn1f;

    /** ACTSSN1A (uuid:e2575d81-9a71-49fd-cefd-24e662d4db35, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn1a;

    /** ACTSSN1I (uuid:813919f2-e291-8295-f877-7f9f515668f7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn1i;

    /** ACTSSN2L (uuid:8ad7e7b8-863f-203f-3e13-f6ffeb20bb93, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn2l;

    /** ACTSSN2F (uuid:1094cd30-c8c4-5b8f-8f29-425da3b76df2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn2f;

    /** ACTSSN2A (uuid:6f457aa3-b450-79ff-cef9-d8b654bb2f04, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn2a;

    /** ACTSSN2I (uuid:3f9e28d8-4ca9-5d88-4019-de95831c153c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn2i;

    /** ACTSSN3L (uuid:63dbe08d-fcce-6e40-1ce5-2356eda53402, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn3l;

    /** ACTSSN3F (uuid:3814bcd5-d054-f585-cd02-a1a189d8dad9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn3f;

    /** ACTSSN3A (uuid:a0169bf7-245a-808a-0615-eb8c748d1101, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn3a;

    /** ACTSSN3I (uuid:f95620b8-1d9d-7154-ef76-93f554f10036, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn3i;

    /** DOBYEARL (uuid:7b53d9f8-0429-d2d5-b092-8d05f192161e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobyearl;

    /** DOBYEARF (uuid:d98c86c2-fde7-dc0f-fdf1-82ff7456ba7a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobyearf;

    /** DOBYEARA (uuid:362aa5f8-402c-3896-a318-600d13dbb325, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobyeara;

    /** DOBYEARI (uuid:3758e886-b6de-81a8-a0af-1ed7113c1979, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobyeari;

    /** DOBMONL (uuid:8af292a0-275a-75dd-18f2-588222eff469, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobmonl;

    /** DOBMONF (uuid:1fc8801b-c023-762b-76a4-b2fe63dc790b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobmonf;

    /** DOBMONA (uuid:9b2d8e4c-306d-365b-e04e-fbadd7a0bb79, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobmona;

    /** DOBMONI (uuid:4768a04d-1af0-956d-4ed7-2045a23090cf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobmoni;

    /** DOBDAYL (uuid:6c28c950-bf79-ab79-cfab-4d6d2cd8a98a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobdayl;

    /** DOBDAYF (uuid:b825789c-c9fe-61b7-106c-6687dac6f747, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobdayf;

    /** DOBDAYA (uuid:12da3dc4-2d2c-7fa6-38f9-93f5ef474324, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobdaya;

    /** DOBDAYI (uuid:86b211a8-2078-6bbb-8507-0c77df23bbbf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobdayi;

    /** ACSTFCOL (uuid:99bc2a80-edb3-ae0b-a5c2-d5a0b46164fb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcol;

    /** ACSTFCOF (uuid:8461062d-51d2-8866-87ab-8c41272fb0fa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcof;

    /** ACSTFCOA (uuid:86112a5b-8ee7-b667-e267-b48e0600c524, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcoa;

    /** ACSTFCOI (uuid:d7de2f8c-f9be-06f5-024d-2c6c29cbfa43, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcoi;

    /** ACSFNAML (uuid:24a6bb5d-0a9b-d313-a790-f425650668b0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnaml;

    /** ACSFNAMF (uuid:fa433cbf-f6ab-4131-7d37-07cd7c2d1fd7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnamf;

    /** ACSFNAMA (uuid:d94d7534-6869-2ba6-1ee5-cc175cbf5371, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnama;

    /** ACSFNAMI (uuid:78b362bf-3e89-0456-a2b4-2cd1c0dae9b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnami;

    /** ACSMNAML (uuid:52a666d6-4167-4726-adbf-99e132463d9d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnaml;

    /** ACSMNAMF (uuid:b60016f6-7bca-d40e-d7d5-5252607dcc92, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnamf;

    /** ACSMNAMA (uuid:a671f8b4-ac17-10b1-a371-702f86b68ceb, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnama;

    /** ACSMNAMI (uuid:de5fe0ca-123d-a1e0-8b1e-2cbd866cc28b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnami;

    /** ACSLNAML (uuid:93a6344d-a766-c923-fcfa-5710aea1ba65, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnaml;

    /** ACSLNAMF (uuid:a3ed2059-9409-3b3b-9e6b-b18ea61e77db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnamf;

    /** ACSLNAMA (uuid:54141391-dfd3-090c-484c-03db17880ef9, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnama;

    /** ACSLNAMI (uuid:6afc4ebc-fe2a-de2b-b376-8b912331cc0c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnami;

    /** ACSADL1L (uuid:f1842197-d078-0335-98d5-8964d4382c41, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1l;

    /** ACSADL1F (uuid:7f776cff-b914-e51b-df88-e68a050c5488, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1f;

    /** ACSADL1A (uuid:6f1b9bb3-4f31-1431-5f25-ecdff93b5d52, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1a;

    /** ACSADL1I (uuid:be9d1332-8c28-47fd-8e0d-db9abf2defb3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1i;

    /** ACSSTTEL (uuid:991ef347-dfb5-d1b2-6be4-78916d09d28d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acssttel;

    /** ACSSTTEF (uuid:008478e1-84fe-586b-9fc6-559535f8d253, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acssttef;

    /** ACSSTTEA (uuid:903a245e-4dc0-dd2f-f708-e2f3cff5f2ef, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acssttea;

    /** ACSSTTEI (uuid:e43cb228-8a83-1d2e-8bac-2ef1f7beb3b0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acssttei;

    /** ACSADL2L (uuid:24f46e35-a76b-5407-0001-967bfe8737bf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2l;

    /** ACSADL2F (uuid:34cbce6f-707b-2ac7-c523-6b47be6fcf99, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2f;

    /** ACSADL2A (uuid:b8fc33a5-7178-0a92-623d-df5647ad3856, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2a;

    /** ACSADL2I (uuid:2bde02ed-28d0-dc85-ec1c-eeade2aba690, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2i;

    /** ACSZIPCL (uuid:94f76df9-6d47-a186-975b-2aac58bc9217, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipcl;

    /** ACSZIPCF (uuid:92560ced-b12d-1bf7-d521-b013b08b9c4a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipcf;

    /** ACSZIPCA (uuid:bc384c0d-b41b-779b-0341-84f089bed879, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipca;

    /** ACSZIPCI (uuid:e1a2c77f-f6e6-a427-2d7b-f5c439acc8fc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipci;

    /** ACSCITYL (uuid:0de1489b-16ae-d764-830d-46abeb75e8c1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscityl;

    /** ACSCITYF (uuid:25b3e026-ff83-881a-ef6d-6be58fdf87f9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscityf;

    /** ACSCITYA (uuid:4105a7ea-6c9e-b3cf-10ed-72a2c4b9795c, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscitya;

    /** ACSCITYI (uuid:8df041fb-1d1e-7f88-65a5-0f8ce9e1613d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscityi;

    /** ACSCTRYL (uuid:a96a9bbd-ad99-7887-fddf-fe31d4ecbbe9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctryl;

    /** ACSCTRYF (uuid:a06a63bf-a489-270e-7d44-39769067b463, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctryf;

    /** ACSCTRYA (uuid:3468ff02-9df2-19e2-d5c9-93e142eaa204, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctrya;

    /** ACSCTRYI (uuid:3dd96dd9-e74f-aac8-1d7e-bcdd940c22b7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctryi;

    /** ACSPH1AL (uuid:ee52c860-39ae-bf74-ca2e-9bea9124aa2f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1al;

    /** ACSPH1AF (uuid:4d8c85a0-5deb-6623-2b1d-c914195ae777, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1af;

    /** ACSPH1AA (uuid:4adf8b9a-da07-6dbb-90a2-a629f45d6db4, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1aa;

    /** ACSPH1AI (uuid:f13b5ed0-d5ff-1756-1d50-b2ab7265b611, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1ai;

    /** ACSPH1BL (uuid:4944a569-6f03-c302-40b2-c9f103c4d825, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1bl;

    /** ACSPH1BF (uuid:edbb91e5-dd17-427f-7ef0-dad30d348e21, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1bf;

    /** ACSPH1BA (uuid:fb6a20e3-4c80-0a3f-dd74-7c6c5dd87bc9, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1ba;

    /** ACSPH1BI (uuid:72a55277-409a-c12d-e48c-64a69abb60de, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1bi;

    /** ACSPH1CL (uuid:a75a2aa9-b8f6-f7e3-8a0b-7683cc671c51, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1cl;

    /** ACSPH1CF (uuid:c11cace7-7280-be62-e341-a0ccce86578d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1cf;

    /** ACSPH1CA (uuid:37c79493-76e0-37d5-a6f4-1ad756d796c5, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1ca;

    /** ACSPH1CI (uuid:b965f701-9b5f-5180-3946-da1fda5f33d5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1ci;

    /** ACSGOVTL (uuid:88521777-ef92-5c5b-cc8b-41b1849de63b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovtl;

    /** ACSGOVTF (uuid:97139650-0680-192b-e4c6-2dc850ab14b7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovtf;

    /** ACSGOVTA (uuid:b915fafc-70de-c3c9-9415-990b88af848a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovta;

    /** ACSGOVTI (uuid:c03aa737-3386-3632-4fff-2d6665d386a7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovti;

    /** ACSPH2AL (uuid:2ad015ca-dd28-9b78-f54f-22a089826c56, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2al;

    /** ACSPH2AF (uuid:bfcf9bb7-4fc4-322b-f398-d5deb7fd0d63, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2af;

    /** ACSPH2AA (uuid:283ce7ee-a3ec-47ac-e653-23b73f730b05, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2aa;

    /** ACSPH2AI (uuid:9beedb7f-57d3-983c-386c-5ab5b68d6bf2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2ai;

    /** ACSPH2BL (uuid:90c73fd8-d41e-eb07-7de0-a703f437edc6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2bl;

    /** ACSPH2BF (uuid:47395b82-8f11-26ba-c72b-70b31aeb430c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2bf;

    /** ACSPH2BA (uuid:92069640-f728-079c-1251-44100f1fcb47, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2ba;

    /** ACSPH2BI (uuid:91d6a671-c07c-1591-5536-7b616861cf95, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2bi;

    /** ACSPH2CL (uuid:c11f3cd7-9242-01af-f872-ea7fb6a1be86, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2cl;

    /** ACSPH2CF (uuid:3d162ad0-5d35-cc96-539b-0a20a1a1972b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2cf;

    /** ACSPH2CA (uuid:3b522636-cfa0-6d7f-6e61-57c399835deb, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2ca;

    /** ACSPH2CI (uuid:9d498253-bba1-e4d5-81ff-5793a1a61932, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2ci;

    /** ACSEFTCL (uuid:6320d33e-6c56-312f-3b6a-842aeaffebd4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftcl;

    /** ACSEFTCF (uuid:9575e4d1-1ee1-cc35-92c4-4c02ffe7571f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftcf;

    /** ACSEFTCA (uuid:5eaeef40-8116-61c2-02c2-747d80b16962, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftca;

    /** ACSEFTCI (uuid:3afc767e-ed80-52a0-f254-8d9d7bcabc88, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftci;

    /** ACSPFLGL (uuid:7e08b71b-1b38-cca8-58ac-9ff82f2b2dd5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflgl;

    /** ACSPFLGF (uuid:25a3f274-2389-a862-de2a-68ddac091d8a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflgf;

    /** ACSPFLGA (uuid:f056016c-8eb5-b9d0-70f9-0fbe3f6973b5, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflga;

    /** ACSPFLGI (uuid:a7c3f912-f6dd-a686-ba1c-d0f80ed7c28c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflgi;

    /** INFOMSGL (uuid:5df53d9d-34e0-a20a-b127-74eba653014e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgl;

    /** INFOMSGF (uuid:c396bd7c-06aa-3522-76fd-c8a745b1a261, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgf;

    /** INFOMSGA (uuid:0ae90d15-2bd2-5a69-caa2-e6f9978d1c87, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsga;

    /** INFOMSGI (uuid:2a5bd658-4eda-a027-b1f7-1c431ff295b2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgi;

    /** ERRMSGL (uuid:2cbc3249-6f22-f2c1-9c11-eb3110b5b384, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgl;

    /** ERRMSGF (uuid:adc7ead9-ac3b-cf1e-8037-bca202fbb85e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgf;

    /** ERRMSGA (uuid:569a47ab-b65b-64e0-b28f-05146fa734ae, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsga;

    /** ERRMSGI (uuid:e623add3-31ba-f101-e11e-a9f1bde128ad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgi;

    /** FKEYSL (uuid:de314e3b-8e8c-6086-c442-8fbf8147d658, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysl;

    /** FKEYSF (uuid:bbc04733-f454-40a2-515e-497daa25e2ad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysf;

    /** FKEYSA (uuid:0c96548b-c4a4-0b22-566f-9489ff7d85c4, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysa;

    /** FKEYSI (uuid:c9638d8c-f2b4-bf67-c4e2-6886c4ff7fe2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysi;

    /** FKEY05L (uuid:4adbe052-6948-8b04-b802-b3e88fad8023, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey05l;

    /** FKEY05F (uuid:fd0387e5-b77a-6b2a-a87f-8537e233f357, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey05f;

    /** FKEY05A (uuid:8b7584c5-a325-a7f6-94b6-e7a0d1fbcd77, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey05a;

    /** FKEY05I (uuid:4a9c37a6-83d1-0122-6b7b-c6eeeb5fc17d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey05i;

    /** FKEY12L (uuid:5b92b750-00a1-795e-4ea7-083a87c3d879, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey12l;

    /** FKEY12F (uuid:5baff0e2-2621-2bf0-4571-0ecece07b247, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey12f;

    /** FKEY12A (uuid:fb161875-4ffc-8ac2-f0aa-ae36b53bcf8a, level 3, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey12a;

    /** FKEY12I (uuid:de043ed9-0d12-d3bf-57f4-a361111b7980, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey12i;

    /** CACTUPAO (uuid:4f41a3ac-43ff-db2c-38bd-85e0cbc36b62, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cactupao;

    /** TRNNAMEC (uuid:d0019e41-240b-b22a-a7e9-06ca02bfd2f9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamec;

    /** TRNNAMEP (uuid:dd122473-3ce4-c33d-9818-b4b2eac8514f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamep;

    /** TRNNAMEH (uuid:ae2539d8-73ce-db60-9e91-6841c1e48c3a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameh;

    /** TRNNAMEV (uuid:ff0b78c0-7038-d988-cb3a-4d205fd5cd70, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnamev;

    /** TRNNAMEO (uuid:3f1edc91-0331-29c9-6554-a8532f853251, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ trnnameo;

    /** TITLE01C (uuid:ac4c808b-1f43-9989-2efa-ef43d330bef0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01c;

    /** TITLE01P (uuid:c9ddf932-437e-866f-00d2-419db4f1e831, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01p;

    /** TITLE01H (uuid:3b804970-5f41-6b02-b620-e89ec3c45ca8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01h;

    /** TITLE01V (uuid:e9ccd94e-e723-560c-87d0-7b93ad89697e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01v;

    /** TITLE01O (uuid:f7b23b19-d3b9-46cd-3b8f-705cc0c7acf2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title01o;

    /** CURDATEC (uuid:35a1ba64-ff99-fcf6-e6ed-42ec9f03812b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatec;

    /** CURDATEP (uuid:ae3740c2-1fce-d65f-f02c-a87a83efe86e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatep;

    /** CURDATEH (uuid:0620a1bb-3d98-30cd-390b-1a4c9a130303, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateh;

    /** CURDATEV (uuid:41051efb-6beb-b5ac-4d9c-369a7a47be3b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdatev;

    /** CURDATEO (uuid:44003a97-ebcb-9dc4-1ad6-e72bc45c08cb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curdateo;

    /** PGMNAMEC (uuid:025cb113-d7c3-cc04-1012-093d012ae6fe, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamec;

    /** PGMNAMEP (uuid:b26b6dc9-bd78-2f1c-e4e2-a2a9e4e31550, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamep;

    /** PGMNAMEH (uuid:0ff38cf2-1db0-dfbe-2837-b2e1fb1d72e0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameh;

    /** PGMNAMEV (uuid:a7cf421e-ff32-c6e5-5e7b-bb1064b3a7d5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnamev;

    /** PGMNAMEO (uuid:ed7068b5-7370-6c7e-94b6-44b1e7add59d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ pgmnameo;

    /** TITLE02C (uuid:68529fba-0abb-4a3c-7a31-781f8cd5676a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02c;

    /** TITLE02P (uuid:8f444a67-bd88-a487-eac2-f68571347f2d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02p;

    /** TITLE02H (uuid:338d4c48-cb26-6742-fd79-e1928b242a74, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02h;

    /** TITLE02V (uuid:68d7defc-0953-78df-55de-985ddc5fa88e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02v;

    /** TITLE02O (uuid:9ebbf6db-a3e0-04b7-5805-b3ab8ff22bf9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ title02o;

    /** CURTIMEC (uuid:4e0ed5e5-7eca-b9c5-ab15-59977138c496, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimec;

    /** CURTIMEP (uuid:9ffcc0e6-c9ff-24dc-1850-0f656148643b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimep;

    /** CURTIMEH (uuid:7dd3b2ed-54aa-e8ca-85c2-cb6a98d836a6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeh;

    /** CURTIMEV (uuid:9106835f-e3f4-1df8-48ee-f7a18b355f40, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimev;

    /** CURTIMEO (uuid:0f31bd98-1a1b-8eea-d881-879db22ccf55, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ curtimeo;

    /** ACCTSIDC (uuid:c0b666fe-6bb0-f928-009e-21a250eafe90, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidc;

    /** ACCTSIDP (uuid:c2a984f5-faee-3143-6c5b-a7ed3f3cf625, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidp;

    /** ACCTSIDH (uuid:2b9b8cf1-ed11-fffd-bde7-6c2c0db3d61b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidh;

    /** ACCTSIDV (uuid:85001db0-390c-4cfd-571d-bc3d6f686efb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsidv;

    /** ACCTSIDO (uuid:1be40b8e-acdf-228b-236c-c26f13d652ed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctsido;

    /** ACSTTUSC (uuid:dc84074c-92b6-b69b-4b09-4830b879904d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttusc;

    /** ACSTTUSP (uuid:21e167e7-0f9d-6d8f-b9f6-52097ce905ba, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttusp;

    /** ACSTTUSH (uuid:1f8fecd9-c34b-c14f-0cc1-6643b350f8e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttush;

    /** ACSTTUSV (uuid:e4030769-5c50-b56c-40ac-461c5667dea2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttusv;

    /** ACSTTUSO (uuid:42e4f916-771b-a833-f13b-341a109ccb4c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsttuso;

    /** OPNYEARC (uuid:a58129d9-606c-58e4-8db3-760d6b596160, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnyearc;

    /** OPNYEARP (uuid:f5e5cb70-868e-8c64-98b7-6f4a95f8f28a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnyearp;

    /** OPNYEARH (uuid:eda1657b-34ed-992a-266a-3e5d2726862f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnyearh;

    /** OPNYEARV (uuid:00d94951-cc0b-5c11-b314-7cc13e395e26, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnyearv;

    /** OPNYEARO (uuid:27306e4b-7457-c45f-5768-6437eec6d853, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnyearo;

    /** OPNMONC (uuid:97ebf0c3-956d-b81b-901a-8e53f81e952c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnmonc;

    /** OPNMONP (uuid:13987299-dd28-7869-a120-705b6cd43b16, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnmonp;

    /** OPNMONH (uuid:d4c2c7c8-29b8-3185-bc48-a39f1b5e552b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnmonh;

    /** OPNMONV (uuid:8b9f78e7-fcf4-943f-5e91-d6002300332d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnmonv;

    /** OPNMONO (uuid:9142a7fc-7e02-d146-be51-593bcaf92ec2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opnmono;

    /** OPNDAYC (uuid:a6f5e372-0793-0340-251a-9e1b76e46743, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opndayc;

    /** OPNDAYP (uuid:1bed53f7-c8bf-afd7-b2e8-9bfdd2e7b957, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opndayp;

    /** OPNDAYH (uuid:dc168dad-2488-b769-4d9e-25c83a996c38, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opndayh;

    /** OPNDAYV (uuid:db6e45e9-9219-e83d-0b26-60558a390e3e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opndayv;

    /** OPNDAYO (uuid:5701d99d-c9e5-3cd0-7668-0b249f3d7115, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ opndayo;

    /** ACRDLIMC (uuid:541ead3a-e74f-bb2c-d6a9-0d7363ed32da, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdlimc;

    /** ACRDLIMP (uuid:d7e9980b-981f-8930-c8e5-b86926eed575, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdlimp;

    /** ACRDLIMH (uuid:e952bff4-d617-bb66-517c-07d110008160, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdlimh;

    /** ACRDLIMV (uuid:369507ae-9431-2432-cd59-fb83fe50d8ae, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdlimv;

    /** ACRDLIMO (uuid:a50441b9-806d-54ed-ab31-0ed78a71420c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrdlimo;

    /** EXPYEARC (uuid:6728fb40-2db1-f8c2-e648-9a9f0031b9ab, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearc;

    /** EXPYEARP (uuid:892327a2-07bb-5a6f-5708-e2d4dbe0b3b1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearp;

    /** EXPYEARH (uuid:ff496df9-0872-7b79-4e15-19b3c9bbf612, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearh;

    /** EXPYEARV (uuid:1b0d7ae8-529d-5b46-9dc8-e5999111d223, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearv;

    /** EXPYEARO (uuid:7419097f-8af0-411d-9891-233faaad8cb0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expyearo;

    /** EXPMONC (uuid:a80adfaf-9657-8f7c-1a63-661fc6fcc040, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonc;

    /** EXPMONP (uuid:1a47990a-33ab-3a1d-da86-a1d70bf2636f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonp;

    /** EXPMONH (uuid:74c198fd-01a8-e1a5-95a4-41af302f43bb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonh;

    /** EXPMONV (uuid:61e58a52-0eb7-b86a-f719-a2463d6fde9d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmonv;

    /** EXPMONO (uuid:872a4e50-9bb5-9dc0-e633-be1b6e6b276a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expmono;

    /** EXPDAYC (uuid:bd482780-bcc7-e543-db84-a80233d4f917, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdayc;

    /** EXPDAYP (uuid:e19ab7fc-8f46-6f2c-e059-05a4f315e85e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdayp;

    /** EXPDAYH (uuid:55e17f4d-0187-1d6a-35f1-c4c27bc11767, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdayh;

    /** EXPDAYV (uuid:483d3caf-5953-b81b-3563-89762ef2058a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdayv;

    /** EXPDAYO (uuid:d19c67bd-c4d1-76a6-9cd8-eb9f9a776bfa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ expdayo;

    /** ACSHLIMC (uuid:5c37017c-c994-5f0e-3e1b-85c3234e4712, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshlimc;

    /** ACSHLIMP (uuid:c7bf26ad-0501-fae7-ae57-f1865f5324ec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshlimp;

    /** ACSHLIMH (uuid:1ce1d7c0-b956-b446-c7c3-178862e51bdc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshlimh;

    /** ACSHLIMV (uuid:b936e12a-9c4e-dc60-e263-31ff874ef606, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshlimv;

    /** ACSHLIMO (uuid:f660f731-0056-984d-c0d4-8ea206de1838, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acshlimo;

    /** RISYEARC (uuid:14504a60-4421-df44-c05d-484de1be261d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risyearc;

    /** RISYEARP (uuid:9b703c8a-edb9-28db-ebd7-b4e727903d7b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risyearp;

    /** RISYEARH (uuid:d4a81ae4-e9b8-3e85-d487-77b7ebd1e96d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risyearh;

    /** RISYEARV (uuid:2e8ed7ff-22a6-8b30-1ac7-8dd533bc4a1e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risyearv;

    /** RISYEARO (uuid:cce0e7df-aa57-9bca-aabd-2a3d2604f437, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risyearo;

    /** RISMONC (uuid:2166c1af-7bf2-4f5e-32a2-564ec9e3a86a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ rismonc;

    /** RISMONP (uuid:fa4c0724-0586-dcb9-dd32-410324c7c899, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ rismonp;

    /** RISMONH (uuid:6a249751-5325-de31-69d5-1352302c1c6f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ rismonh;

    /** RISMONV (uuid:8be977b3-d37a-fcb7-2283-ed4db99ddb85, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ rismonv;

    /** RISMONO (uuid:b9ef66e0-bdcf-2d22-62c7-826a01673273, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ rismono;

    /** RISDAYC (uuid:9e890a15-c5a5-ecd4-43c9-5225e5e2eb3c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risdayc;

    /** RISDAYP (uuid:51f35d6f-e463-68f2-8365-659a9d2f440d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risdayp;

    /** RISDAYH (uuid:60a9f63c-3982-c842-4c03-6ed83d7f0eea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risdayh;

    /** RISDAYV (uuid:b8f8a960-228e-a00d-b59d-09225c46004a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risdayv;

    /** RISDAYO (uuid:d8d7e15c-28ec-3b71-15f0-5f79ff140abc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ risdayo;

    /** ACURBALC (uuid:7d680477-eabc-66eb-fc21-9c5351677e32, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurbalc;

    /** ACURBALP (uuid:f1e356d4-1ce9-9ddd-e44f-3cf8ea62d23c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurbalp;

    /** ACURBALH (uuid:fcd52399-364c-638c-e03a-ea01f6a9a026, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurbalh;

    /** ACURBALV (uuid:a8a669e0-3947-bcf9-86b3-f4c1f8174412, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurbalv;

    /** ACURBALO (uuid:c0f30e91-0817-f68f-3505-384c99bbfab6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acurbalo;

    /** ACRCYCRC (uuid:ee5610c7-5e3a-a610-7ab8-2d73e43fe204, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycrc;

    /** ACRCYCRP (uuid:d536d597-94bb-00aa-f268-40bb6eb2837a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycrp;

    /** ACRCYCRH (uuid:6055eccf-8f76-db99-de8f-e344a3b32c2d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycrh;

    /** ACRCYCRV (uuid:9c73a9db-d36c-3134-c7f0-61e28ff201ef, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycrv;

    /** ACRCYCRO (uuid:8ec4e688-7d17-3d38-02e6-991fa7dd14ee, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcycro;

    /** AADDGRPC (uuid:91e20e35-9829-905d-4af8-8af2f1d9c7cd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrpc;

    /** AADDGRPP (uuid:617765fa-5567-65cf-df41-0c48ce71a38f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrpp;

    /** AADDGRPH (uuid:7686cb74-5006-f289-7fbb-9388dcd3910a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrph;

    /** AADDGRPV (uuid:e2c6c9b1-a2b9-412f-344c-7503c1a842f0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrpv;

    /** AADDGRPO (uuid:bc51d37d-a308-db10-226b-4357d751d210, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ aaddgrpo;

    /** ACRCYDBC (uuid:1b5a2975-794f-a055-0046-f5b4ed194948, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydbc;

    /** ACRCYDBP (uuid:9d68328c-5be4-6778-9a02-ab79cdaac19e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydbp;

    /** ACRCYDBH (uuid:04faf952-48e8-9dc0-f907-df0f3d19ee5d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydbh;

    /** ACRCYDBV (uuid:7c56afd4-6bbe-aba4-79d6-50de07eb1f2e, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydbv;

    /** ACRCYDBO (uuid:c69a03d3-4127-efc7-c6d5-0a8a78170b95, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acrcydbo;

    /** ACSTNUMC (uuid:3e3930af-7a6f-16bb-a30e-2db040747bb9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnumc;

    /** ACSTNUMP (uuid:0c8cce65-921d-def9-aa70-fb2238b6f224, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnump;

    /** ACSTNUMH (uuid:1658ac77-7193-9a00-c466-8284763db546, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnumh;

    /** ACSTNUMV (uuid:80384d65-c734-8a97-112c-ec890d6151e3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnumv;

    /** ACSTNUMO (uuid:fafc7fe2-c15d-a7c0-13b2-bc79074287b9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstnumo;

    /** ACTSSN1C (uuid:ae336839-0304-71b3-aa2a-2d2d82db1a2a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn1c;

    /** ACTSSN1P (uuid:d4af5e95-1a0e-6307-8008-b998a432e5b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn1p;

    /** ACTSSN1H (uuid:9d3173b2-05f7-6a4d-7fb4-fbfd08036a36, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn1h;

    /** ACTSSN1V (uuid:4a5537df-1393-f14f-4045-2dd477653674, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn1v;

    /** ACTSSN1O (uuid:66b9ed8e-92a8-4dfc-6a4c-eb8ee10756e1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn1o;

    /** ACTSSN2C (uuid:788a34fb-12ab-89c1-cc3b-fa8470270ea1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn2c;

    /** ACTSSN2P (uuid:a24d9408-e90d-720a-e806-fb443830049c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn2p;

    /** ACTSSN2H (uuid:a448d4d4-a2ac-0e6b-73ea-eb69e3b0468f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn2h;

    /** ACTSSN2V (uuid:066f758f-079e-c462-c01c-267a24f43ed5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn2v;

    /** ACTSSN2O (uuid:3addb487-42cc-8e2f-8875-b684c84ff3d5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn2o;

    /** ACTSSN3C (uuid:a9125601-d2fe-93d7-d6e8-71e907f8286b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn3c;

    /** ACTSSN3P (uuid:688b50d6-d97f-1e70-2cda-de6085bcbe2f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn3p;

    /** ACTSSN3H (uuid:9043acb5-22b2-cb94-1ce1-7d4ca5164017, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn3h;

    /** ACTSSN3V (uuid:c844580b-551f-ab8d-f65e-44b019245f79, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn3v;

    /** ACTSSN3O (uuid:5ab4111b-c2fb-a24d-636e-01290a7b09f7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ actssn3o;

    /** DOBYEARC (uuid:07f7a5a9-29bd-96b3-e663-f2f1f75b1875, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobyearc;

    /** DOBYEARP (uuid:a99a6edf-2743-1234-ee77-1402fc02e9dd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobyearp;

    /** DOBYEARH (uuid:c6457ba0-073d-430c-6cfe-c2728f417b2a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobyearh;

    /** DOBYEARV (uuid:71989bb9-2c47-001f-a315-21e70b34a502, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobyearv;

    /** DOBYEARO (uuid:bffa5d2f-225d-5dd8-fae9-a6ff0a783b7d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobyearo;

    /** DOBMONC (uuid:715e3c6f-6d85-53cf-3b5a-c1a2a1411fce, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobmonc;

    /** DOBMONP (uuid:a36c9b95-2f4f-b947-bd74-4a7591e5caab, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobmonp;

    /** DOBMONH (uuid:1eeefd6f-7f8b-789e-b204-8ba18079d8c8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobmonh;

    /** DOBMONV (uuid:b1053804-f13c-1624-d1af-b1b9da64ebec, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobmonv;

    /** DOBMONO (uuid:3ff3f3eb-8173-fa07-6ec3-45d2e5b85813, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobmono;

    /** DOBDAYC (uuid:4754567f-c4e8-d68e-28f5-826f5c82b8ed, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobdayc;

    /** DOBDAYP (uuid:a5f32f79-7236-ea5d-cdee-f5c0f1119894, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobdayp;

    /** DOBDAYH (uuid:3c3669a0-fc80-3fa0-817a-fa91350d732c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobdayh;

    /** DOBDAYV (uuid:494881ad-bd18-885d-fcf0-a0f82fa547f9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobdayv;

    /** DOBDAYO (uuid:b10725c9-ecc1-4ab3-ce6b-8c0a803681b8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ dobdayo;

    /** ACSTFCOC (uuid:1232845e-e15a-4893-e4dd-ff8733788f63, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcoc;

    /** ACSTFCOP (uuid:4f5c4525-eb0a-b1d5-c4d3-3b00125db578, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcop;

    /** ACSTFCOH (uuid:55f76771-449d-2331-b527-2c5b652763c6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcoh;

    /** ACSTFCOV (uuid:bed5864a-1018-efa7-5cec-126b19e101b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcov;

    /** ACSTFCOO (uuid:6fa268c0-878e-2224-3fd4-7f2632a378a8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acstfcoo;

    /** ACSFNAMC (uuid:7d2cf153-ef56-e1f4-980d-e3947492b2b1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnamc;

    /** ACSFNAMP (uuid:2a414ac2-1c09-2dad-6b60-7280d20a8584, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnamp;

    /** ACSFNAMH (uuid:2f2fe4fd-0035-3c3f-15c7-6ff2c6760f18, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnamh;

    /** ACSFNAMV (uuid:f0673b4b-613d-4e99-00ad-b4579110ac28, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnamv;

    /** ACSFNAMO (uuid:f4d3e10f-f7a8-c792-d5d8-4d265d8cb845, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsfnamo;

    /** ACSMNAMC (uuid:5b100c12-71de-68b1-67c2-8c5ec5ec4608, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnamc;

    /** ACSMNAMP (uuid:2e520896-4848-9b84-752f-2f399cc991f8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnamp;

    /** ACSMNAMH (uuid:0dfd354c-5ad8-dab8-145a-59bf72acc5cb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnamh;

    /** ACSMNAMV (uuid:242204ff-e98a-2a72-6348-b54858eb22a4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnamv;

    /** ACSMNAMO (uuid:44ce08a0-3d43-22b4-d64c-75a6b91c5546, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsmnamo;

    /** ACSLNAMC (uuid:88cef557-9f02-c6dd-e112-7417e0822d23, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnamc;

    /** ACSLNAMP (uuid:c4fbc67e-8e9e-929b-f8c9-37bb6ec24bb3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnamp;

    /** ACSLNAMH (uuid:b3b6344d-c0de-4cff-1c72-ffb0e76d9460, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnamh;

    /** ACSLNAMV (uuid:4924bef9-93d2-a976-6a15-6acb9b64f6b2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnamv;

    /** ACSLNAMO (uuid:c5b82946-a4c7-fe0e-d73d-098f7ec5bf73, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acslnamo;

    /** ACSADL1C (uuid:4173e621-7e21-47ce-3807-f2dabb379852, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1c;

    /** ACSADL1P (uuid:399b2b25-80a6-9430-f95b-2c30962eee0a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1p;

    /** ACSADL1H (uuid:d3c888ec-6a67-fdde-b603-e5974d57d9bd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1h;

    /** ACSADL1V (uuid:ba00f782-d880-68b3-ca1f-4070a8adf0a4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1v;

    /** ACSADL1O (uuid:75014d57-20ee-4520-acd5-7cfc9dce413f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl1o;

    /** ACSSTTEC (uuid:aa89ff17-56ca-1ae3-435c-271deb99c0b9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acssttec;

    /** ACSSTTEP (uuid:f16e897c-0129-ff23-7981-84ef739768bf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acssttep;

    /** ACSSTTEH (uuid:7960f7e2-64be-5202-09f5-3c6aee9e0235, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsstteh;

    /** ACSSTTEV (uuid:2c2f944b-6e3e-7ee9-afdc-aa65eb2edb9f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acssttev;

    /** ACSSTTEO (uuid:7ba29c81-b062-c2c0-63f4-2115c3cf9aea, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsstteo;

    /** ACSADL2C (uuid:398d0998-295b-6616-8f12-9d60ab0e8359, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2c;

    /** ACSADL2P (uuid:df0ff1f9-4651-5c43-4fce-c113ffaabb50, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2p;

    /** ACSADL2H (uuid:aaeac6b2-8bef-c6cf-f903-17db16c0e1fa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2h;

    /** ACSADL2V (uuid:be5169c1-59dc-1cc6-7305-a36500411d30, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2v;

    /** ACSADL2O (uuid:1a8de253-9e9c-9167-cfcd-e3971f488ab2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsadl2o;

    /** ACSZIPCC (uuid:9d95ebe9-67cc-0b43-322b-2b6f4f50a281, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipcc;

    /** ACSZIPCP (uuid:8b7bc08e-a4b9-0ac4-16fb-fba2698488af, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipcp;

    /** ACSZIPCH (uuid:ebae99fd-d02d-99eb-9845-f1a23c26a596, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipch;

    /** ACSZIPCV (uuid:3c28a60a-4a43-8fe6-8d2e-702191833c82, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipcv;

    /** ACSZIPCO (uuid:c2e9f8c3-2474-e3d1-f71f-1255e1306d39, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acszipco;

    /** ACSCITYC (uuid:c8ef517b-7a2f-5ea1-95b3-4a55fa3f5231, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscityc;

    /** ACSCITYP (uuid:1abe1822-043c-464f-c40d-8f3bc3c9f50b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscityp;

    /** ACSCITYH (uuid:9c0ca953-8533-601a-e92d-aca52fad4e8c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscityh;

    /** ACSCITYV (uuid:031a018a-a392-4e94-e2e2-d0161f024468, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscityv;

    /** ACSCITYO (uuid:03167589-f193-9cae-0441-b2e91df1763f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acscityo;

    /** ACSCTRYC (uuid:1228e19e-2084-8f2a-ff88-37d3780c483b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctryc;

    /** ACSCTRYP (uuid:53da7fd3-3b23-d2a1-a7a1-1b1a21759b67, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctryp;

    /** ACSCTRYH (uuid:c2baddca-960d-f127-f683-3399c8b609a8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctryh;

    /** ACSCTRYV (uuid:92c4f5ca-32c5-ce3f-6813-523277ffc917, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctryv;

    /** ACSCTRYO (uuid:ceed8eb3-b900-5ba8-c222-ad28e74eab0c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsctryo;

    /** ACSPH1AC (uuid:5a20c160-c98d-db0e-fd73-6dcb31e527f2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1ac;

    /** ACSPH1AP (uuid:9379d4dd-cf6e-3066-c3bd-4f16f8d3afdb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1ap;

    /** ACSPH1AH (uuid:3e2d4304-8084-fd72-5e2e-4e0406bd58ad, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1ah;

    /** ACSPH1AV (uuid:cda8873c-3dd3-79aa-c904-7876eacb1d5d, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1av;

    /** ACSPH1AO (uuid:e928aa48-c12b-64c3-a15b-855d475db20c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1ao;

    /** ACSPH1BC (uuid:1950361d-2243-ff45-e1c9-1e6bfdbe38a2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1bc;

    /** ACSPH1BP (uuid:45e61701-58a1-dff7-bf61-abb2ec62dc46, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1bp;

    /** ACSPH1BH (uuid:062b4ba3-4a3c-a5cb-75e1-58702d200495, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1bh;

    /** ACSPH1BV (uuid:aaebf1b5-2a8b-3c28-1b71-7b5364bc6bd8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1bv;

    /** ACSPH1BO (uuid:0f018468-ecba-81d4-d17f-bc749dba14ca, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1bo;

    /** ACSPH1CC (uuid:5c8f8bca-8cb3-2196-a3d4-0244c25e4669, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1cc;

    /** ACSPH1CP (uuid:28e42e39-d9d6-65a4-7686-a9c42cc680a5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1cp;

    /** ACSPH1CH (uuid:65c6a30e-7517-e5a9-3c3a-1d47751c56a9, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1ch;

    /** ACSPH1CV (uuid:d9f48015-9680-1cf9-82dd-cfab8a05f93c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1cv;

    /** ACSPH1CO (uuid:e6ec1d25-1e91-191a-1a07-3b0148bfb66a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph1co;

    /** ACSGOVTC (uuid:b02036c1-52c6-8d86-8a6a-8ad74d64d5aa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovtc;

    /** ACSGOVTP (uuid:6def9381-82ca-56af-8499-a24547c36a16, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovtp;

    /** ACSGOVTH (uuid:e504d23a-58bf-ff7e-102d-398231b35053, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovth;

    /** ACSGOVTV (uuid:d3c56353-6e26-ccec-dda6-053a2d4bcb66, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovtv;

    /** ACSGOVTO (uuid:f27bf744-5197-b87b-a525-5b8d621a0006, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsgovto;

    /** ACSPH2AC (uuid:d17e560f-fc8e-c01f-516d-32ec6d8b01f4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2ac;

    /** ACSPH2AP (uuid:5a27db35-94dc-6dbe-cf2f-980b78a6b8bb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2ap;

    /** ACSPH2AH (uuid:cfa1752e-5146-8ba7-64e0-05867e1a13b4, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2ah;

    /** ACSPH2AV (uuid:5fe31ce0-c54c-0ceb-931b-89d2fbab89c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2av;

    /** ACSPH2AO (uuid:528b05bd-bd61-3857-cbf7-0e556dd8dcaa, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2ao;

    /** ACSPH2BC (uuid:e457419e-abb5-3474-d082-95593e6955e0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2bc;

    /** ACSPH2BP (uuid:3c39dd3d-ae5c-d338-7f77-906b54444061, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2bp;

    /** ACSPH2BH (uuid:6799770a-668a-b7a9-4dd6-ee9e429a4190, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2bh;

    /** ACSPH2BV (uuid:4bd1b385-740b-d3ed-c9c0-40f97f710cf8, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2bv;

    /** ACSPH2BO (uuid:ed04c4d0-b55e-a327-b577-9375ae6fd1c3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2bo;

    /** ACSPH2CC (uuid:2faaea3d-c277-da6d-1d78-670a2df21acc, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2cc;

    /** ACSPH2CP (uuid:e282752b-7215-cfbe-58a6-089db71bc8cf, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2cp;

    /** ACSPH2CH (uuid:05e4ac47-0efa-0c3a-a610-5ec330467cb0, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2ch;

    /** ACSPH2CV (uuid:21663af6-b721-c5e3-0759-16f6dd0ab5ff, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2cv;

    /** ACSPH2CO (uuid:ee761126-1a44-32e3-cbf4-306d3daf89fb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acsph2co;

    /** ACSEFTCC (uuid:e2fc4c29-5014-0fc6-c553-b08b87ca6830, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftcc;

    /** ACSEFTCP (uuid:1e388173-0658-78f4-d0e6-668997a8ee15, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftcp;

    /** ACSEFTCH (uuid:1f56a8cf-f7dd-85dc-c77e-cd2cfc935a23, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftch;

    /** ACSEFTCV (uuid:43f280f4-f64a-3110-1703-eed9c2bb04f5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftcv;

    /** ACSEFTCO (uuid:27c49fbf-38c3-3da3-4902-72510d47aace, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acseftco;

    /** ACSPFLGC (uuid:d93cc0f2-3a50-84e1-17cf-620c6972327b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflgc;

    /** ACSPFLGP (uuid:8d35d562-0ffa-dc78-684e-c3fbf406c66f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflgp;

    /** ACSPFLGH (uuid:56aa4ad5-f685-8e64-756b-45bd957bd044, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflgh;

    /** ACSPFLGV (uuid:a277d2ba-06fa-8361-9034-cffb585d9963, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflgv;

    /** ACSPFLGO (uuid:e311008d-6888-6f4c-ec45-b6d6fef849e5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acspflgo;

    /** INFOMSGC (uuid:4bed214d-00b2-c6c7-0008-1a8513bf7d5c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgc;

    /** INFOMSGP (uuid:af87a61f-23f8-9223-dd9c-1893efa43856, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgp;

    /** INFOMSGH (uuid:0ab8ab69-e306-5b94-e02c-785fb8001fbb, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgh;

    /** INFOMSGV (uuid:663ba307-51a4-efd3-3bf4-9a3c92d48d04, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgv;

    /** INFOMSGO (uuid:66c65aac-aec7-68c3-1e3d-132759653173, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ infomsgo;

    /** ERRMSGC (uuid:4a0b86ee-fd30-af13-8e58-c07683f6ca0c, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgc;

    /** ERRMSGP (uuid:8b85fc4b-ccea-5d3c-ab0b-5ee1069250db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgp;

    /** ERRMSGH (uuid:2d42bd1e-de84-8c39-0a55-87e78d06515f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgh;

    /** ERRMSGV (uuid:1bc7c506-f21e-8d33-18a2-c589a9f51883, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgv;

    /** ERRMSGO (uuid:8b3b507c-5a35-8ff1-37bf-0ab2a58db5c2, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ errmsgo;

    /** FKEYSC (uuid:121788d5-ce76-ff36-08bd-0fb89f7731d7, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysc;

    /** FKEYSP (uuid:82a99441-d345-412c-65d0-b56794073f33, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysp;

    /** FKEYSH (uuid:cf19857f-b28e-9f14-5c11-5ac917ab7f2f, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysh;

    /** FKEYSV (uuid:1bcd62c0-73bc-6cb6-c6a4-3acf9656f02a, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeysv;

    /** FKEYSO (uuid:20851b7d-69d8-1865-eeaf-d6821c8445e6, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkeyso;

    /** FKEY05C (uuid:eb1fddbe-0dcc-bc06-6493-8bbe2eea4fc5, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey05c;

    /** FKEY05P (uuid:83964d8f-7b40-2139-b0e3-f38fdf2b52fd, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey05p;

    /** FKEY05H (uuid:30cbddc6-c936-3fb7-7973-5205bad6b758, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey05h;

    /** FKEY05V (uuid:0b31d626-971b-621d-c521-af0c6ddff412, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey05v;

    /** FKEY05O (uuid:ced43d13-0d61-1454-f7f4-6c90ff0c9c60, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey05o;

    /** FKEY12C (uuid:6a537879-3a1e-1236-29bb-35432d8ba83b, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey12c;

    /** FKEY12P (uuid:7c7e5dbf-6165-1674-3065-783a563484b3, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey12p;

    /** FKEY12H (uuid:cba443b3-afcf-ac15-43df-5fd5d46162db, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey12h;

    /** FKEY12V (uuid:c176f22a-0060-dba8-4925-b6ce6872f734, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey12v;

    /** FKEY12O (uuid:12a9b91e-986a-896d-2b36-4501109bd6b1, level 2, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ fkey12o;

    /** WS-DATE-TIME (uuid:d3c814c0-ee0a-bf37-cdef-df87f1805d7f, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsDateTime;

    /** WS-CURDATE-DATA (uuid:fee2be5e-ea51-b778-8322-b934c3c788e4, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateData;

    /** WS-CURDATE (uuid:cc2d2bfe-2381-2a60-abb9-bc49d1973825, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdate;

    /** WS-CURDATE-YEAR (uuid:633da75e-1b6b-bdd2-cbed-417bb991ee61, level 15, PIC 9(04).). */
    public int /* PIC 9(04). */ wsCurdateYear;

    /** WS-CURDATE-MONTH (uuid:3b55f10a-b368-3767-c64d-6b3872ed4cda, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMonth;

    /** WS-CURDATE-DAY (uuid:ed0b490c-3375-e45e-2fb6-47de34eebd7e, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDay;

    /** WS-CURDATE-N (uuid:2211c1f8-f2dc-e8b4-cbbd-d9eacda07a79, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurdateN;

    /** WS-CURTIME (uuid:4c39f510-556c-f9a9-6fde-d40bf88c42f7, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtime;

    /** WS-CURTIME-HOURS (uuid:d174f2e0-d6b7-1019-95a8-41398f229d9e, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHours;

    /** WS-CURTIME-MINUTE (uuid:983f7ae6-ab48-ae7b-84f3-651468e507bf, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMinute;

    /** WS-CURTIME-SECOND (uuid:fcec7ed6-bf5d-5aa7-41c2-ba909f4f6b18, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSecond;

    /** WS-CURTIME-MILSEC (uuid:eaf93cde-4fd3-f7d5-482b-1757695b7981, level 15, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMilsec;

    /** WS-CURTIME-N (uuid:054e39be-7aa1-9add-c59a-553bf466648b, level 10, PIC 9(08).). */
    public int /* PIC 9(08). */ wsCurtimeN;

    /** WS-CURDATE-MM-DD-YY (uuid:cfdfa9dc-e935-e157-d9dd-9426e580d1e1, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurdateMmDdYy;

    /** WS-CURDATE-MM (uuid:cc706028-af28-2e21-abc0-c6600e0462ee, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateMm;

    /** WS-CURDATE-DD (uuid:253341a9-6e72-e2db-a1b3-1fd0057396ca, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateDd;

    /** WS-CURDATE-YY (uuid:81942fa4-206f-3fb6-e937-7f7607573f3e, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurdateYy;

    /** WS-CURTIME-HH-MM-SS (uuid:1377a6e2-7b0e-b67b-df9a-66bc4a23a5a7, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsCurtimeHhMmSs;

    /** WS-CURTIME-HH (uuid:468dd511-71f4-0f5b-b3dc-60b6d86a6e56, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeHh;

    /** WS-CURTIME-MM (uuid:cd60cc55-91eb-c26a-28d6-803f50d3ec42, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeMm;

    /** WS-CURTIME-SS (uuid:08d6af6b-6fc4-e8b5-57c3-2031e26ffa97, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsCurtimeSs;

    /** WS-TIMESTAMP (uuid:5bd8e68c-9e86-0fe2-da1d-cce0b1d9fcac, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsTimestamp;

    /** WS-TIMESTAMP-DT-YYYY (uuid:2898a5dd-c8ec-5bea-20e6-d6c4193520ea, level 10, PIC 9(04).). */
    public int /* PIC 9(04). */ wsTimestampDtYyyy;

    /** WS-TIMESTAMP-DT-MM (uuid:7af2e579-2f0e-b751-7e9d-2b9694a0662a, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtMm;

    /** WS-TIMESTAMP-DT-DD (uuid:26107b29-17d1-a1e0-eb2b-ee11a5c3ca97, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampDtDd;

    /** WS-TIMESTAMP-TM-HH (uuid:6d5c79f2-bcfd-a2e9-0d05-d0a85630c751, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmHh;

    /** WS-TIMESTAMP-TM-MM (uuid:d6964c0c-f153-1870-4205-88c347b6158f, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmMm;

    /** WS-TIMESTAMP-TM-SS (uuid:efd89c09-a1a8-57b6-9ac5-e0c4cf0935d4, level 10, PIC 9(02).). */
    public int /* PIC 9(02). */ wsTimestampTmSs;

    /** WS-TIMESTAMP-TM-MS6 (uuid:168802b1-71d0-4ac5-9ca5-265af1a84a5f, level 10, PIC 9(06).). */
    public int /* PIC 9(06). */ wsTimestampTmMs6;

    /** CCDA-COMMON-MESSAGES (uuid:b0bdacd6-63e6-606f-d459-e50e53487b7c, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ ccdaCommonMessages;

    /** CCDA-MSG-THANK-YOU (uuid:d24403bc-50cc-8faa-692f-3c2ec8cee8f6, level 5, PIC X(50)). */
    public String ccdaMsgThankYou;

    /** CCDA-MSG-INVALID-KEY (uuid:76b9f956-f673-36ef-7a56-362232b0a479, level 5, PIC X(50)). */
    public String ccdaMsgInvalidKey;

    /** ABEND-DATA (uuid:10683a69-1685-a551-a223-b94daf77acb4, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ abendData;

    /** ABEND-CODE (uuid:b42cd9fa-0602-031f-d085-20b18e255ffa, level 5, PIC X(4)). */
    public String abendCode;

    /** ABEND-CULPRIT (uuid:c636bbae-98cb-4505-b711-bf2d8aae37df, level 5, PIC X(8)). */
    public String abendCulprit;

    /** ABEND-REASON (uuid:f157574d-a360-edd9-630b-3b4d3036695d, level 5, PIC X(50)). */
    public String abendReason;

    /** ABEND-MSG (uuid:5a360884-f83d-c906-3278-a34d4f49968a, level 5, PIC X(72)). */
    public String abendMsg;

    /** SEC-USER-DATA (uuid:d9d1ecaa-9e9a-9caa-7df6-36b162d0cab8, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ secUserData;

    /** SEC-USR-ID (uuid:6f83326a-0c2a-da5c-32a6-a5527e19bb75, level 5, PIC X(08).). */
    public String secUsrId;

    /** SEC-USR-FNAME (uuid:0afca2a1-201c-d0f3-d9a1-6a7a93db78b9, level 5, PIC X(20).). */
    public String secUsrFname;

    /** SEC-USR-LNAME (uuid:0eaefcb5-4f70-ebc6-22ce-aadfe0431fdf, level 5, PIC X(20).). */
    public String secUsrLname;

    /** SEC-USR-PWD (uuid:14b5889e-9fb4-d8bb-be72-304e38d3a5f3, level 5, PIC X(08).). */
    public String secUsrPwd;

    /** SEC-USR-TYPE (uuid:35be86ed-9218-3de6-e815-4dc516426517, level 5, PIC X(01).). */
    public String secUsrType;

    /** SEC-USR-FILLER (uuid:cac9b55f-3e9e-ccc1-f5a0-88b776ba422e, level 5, PIC X(23).). */
    public String secUsrFiller;

    /** ACCOUNT-RECORD (uuid:1f2ab30f-5d18-ea2c-84aa-14d01d58797c, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ accountRecord;

    /** ACCT-ID (uuid:9a9024c4-73c5-a2a1-6adf-ec3ed55b9cb1, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ acctId;

    /** ACCT-ACTIVE-STATUS (uuid:88d7f550-3245-6742-1ed2-22a48ad6573d, level 5, PIC X(01).). */
    public String acctActiveStatus;

    /** ACCT-CURR-BAL (uuid:ae2f2d08-853e-1124-2d90-4aa2cdcbf1e3, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrBal;

    /** ACCT-CREDIT-LIMIT (uuid:e8a4c9fc-2698-6369-3410-d046c5da9507, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCreditLimit;

    /** ACCT-CASH-CREDIT-LIMIT (uuid:5513a8fa-4090-8881-c90f-33b2a648a0f1, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCashCreditLimit;

    /** ACCT-OPEN-DATE (uuid:cea93714-5e04-504b-0cf9-59674cdde72f, level 5, PIC X(10).). */
    public String acctOpenDate;

    /** ACCT-EXPIRAION-DATE (uuid:e4f734ac-d873-a9f2-5e5d-9d3b7846bd61, level 5, PIC X(10).). */
    public String acctExpiraionDate;

    /** ACCT-REISSUE-DATE (uuid:660b50c8-44ac-2940-03ca-2f3c71eea1ce, level 5, PIC X(10).). */
    public String acctReissueDate;

    /** ACCT-CURR-CYC-CREDIT (uuid:5b88f9f9-5a85-90b5-e11e-011f7893dd7f, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrCycCredit;

    /** ACCT-CURR-CYC-DEBIT (uuid:309fe056-8f75-2595-60ce-0d76af2f9ffc, level 5, PIC S9(10)V99.). */
    public BigDecimal /* precision=12, scale=2, signed */ acctCurrCycDebit;

    /** ACCT-ADDR-ZIP (uuid:94d0e5e9-9824-23e7-8179-ed6d89191528, level 5, PIC X(10).). */
    public String acctAddrZip;

    /** ACCT-GROUP-ID (uuid:fc69ac41-3225-5364-1695-ad9c6853270d, level 5, PIC X(10).). */
    public String acctGroupId;

    /** CARD-XREF-RECORD (uuid:18cafa7d-d45d-048b-e44b-6e6911f8f0b9, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cardXrefRecord;

    /** XREF-CARD-NUM (uuid:27ae9444-b715-0ebd-2dc5-2d0453f40f6a, level 5, PIC X(16).). */
    public String xrefCardNum;

    /** XREF-CUST-ID (uuid:61b23c5e-90c6-626d-6f98-622277a2c60c, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ xrefCustId;

    /** XREF-ACCT-ID (uuid:3da3301e-a0d5-761e-156e-c185c6457403, level 5, PIC 9(11).). */
    public long /* PIC 9(11). */ xrefAcctId;

    /** CUSTOMER-RECORD (uuid:65cc9dee-b597-5bbb-6e8d-8bd820ef88d6, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ customerRecord;

    /** CUST-ID (uuid:19b9e620-cabc-b8c1-5930-99bc3896b859, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ custId;

    /** CUST-FIRST-NAME (uuid:0bb18ac0-bb76-0b16-b889-592628299f46, level 5, PIC X(25).). */
    public String custFirstName;

    /** CUST-MIDDLE-NAME (uuid:ee83b3f0-fdfd-5127-c193-eedc16068844, level 5, PIC X(25).). */
    public String custMiddleName;

    /** CUST-LAST-NAME (uuid:fa77c4da-70c4-47bb-4207-d378fdd3986e, level 5, PIC X(25).). */
    public String custLastName;

    /** CUST-ADDR-LINE-1 (uuid:0d4e4f51-867d-5e1a-2085-c5914df50837, level 5, PIC X(50).). */
    public String custAddrLine1;

    /** CUST-ADDR-LINE-2 (uuid:a4457243-9903-ae88-bebb-1a64083b32fb, level 5, PIC X(50).). */
    public String custAddrLine2;

    /** CUST-ADDR-LINE-3 (uuid:06e12b49-9134-9bf5-c129-2b4dd9a1abe3, level 5, PIC X(50).). */
    public String custAddrLine3;

    /** CUST-ADDR-STATE-CD (uuid:bbf4279e-18a7-e82d-903a-201cf16a8336, level 5, PIC X(02).). */
    public String custAddrStateCd;

    /** CUST-ADDR-COUNTRY-CD (uuid:a154ed3e-544c-e12b-2949-53774dab0914, level 5, PIC X(03).). */
    public String custAddrCountryCd;

    /** CUST-ADDR-ZIP (uuid:27ced9d3-a4cc-896e-9dd8-25c96e6104b2, level 5, PIC X(10).). */
    public String custAddrZip;

    /** CUST-PHONE-NUM-1 (uuid:9edf2c10-3bf3-1ba2-2fac-9412ba6cd2ed, level 5, PIC X(15).). */
    public String custPhoneNum1;

    /** CUST-PHONE-NUM-2 (uuid:3f9ac56e-7eae-8348-d12f-43f57254de5b, level 5, PIC X(15).). */
    public String custPhoneNum2;

    /** CUST-SSN (uuid:d575c299-0cfa-5d68-414f-a0eb87a5f41b, level 5, PIC 9(09).). */
    public int /* PIC 9(09). */ custSsn;

    /** CUST-GOVT-ISSUED-ID (uuid:3050b307-d99f-9fcf-018b-d0fd9ffd4062, level 5, PIC X(20).). */
    public String custGovtIssuedId;

    /** CUST-DOB-YYYY-MM-DD (uuid:b5f49d19-89c1-a049-13e9-5ad4913eddd4, level 5, PIC X(10).). */
    public String custDobYyyyMmDd;

    /** CUST-EFT-ACCOUNT-ID (uuid:c1ac2f08-38a1-fa1e-758e-3521db3373df, level 5, PIC X(10).). */
    public String custEftAccountId;

    /** CUST-PRI-CARD-HOLDER-IND (uuid:be944f27-5f42-51ed-eeb7-ab0de82135e4, level 5, PIC X(01).). */
    public String custPriCardHolderInd;

    /** CUST-FICO-CREDIT-SCORE (uuid:75017b7b-2eec-6f43-1149-21c0998afeea, level 5, PIC 9(03).). */
    public int /* PIC 9(03). */ custFicoCreditScore;

    /** CARDDEMO-COMMAREA (uuid:7479af99-c1a5-3593-75dd-21bcec8404f7, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ carddemoCommarea;

    /** CDEMO-GENERAL-INFO (uuid:76fbab31-1b51-8b18-69d8-5227f14197c9, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoGeneralInfo;

    /** CDEMO-FROM-TRANID (uuid:913756ff-924f-31a2-58d1-1555bb8af7e5, level 10, PIC X(04).). */
    public String cdemoFromTranid;

    /** CDEMO-FROM-PROGRAM (uuid:6b60dad8-0e8c-0c91-2438-2edb46ab1464, level 10, PIC X(08).). */
    public String cdemoFromProgram;

    /** CDEMO-TO-TRANID (uuid:0ba24c9b-9d83-f72f-4f2a-6758d0d8dba4, level 10, PIC X(04).). */
    public String cdemoToTranid;

    /** CDEMO-TO-PROGRAM (uuid:876a32c0-c450-4405-2758-d6c3dfd947ec, level 10, PIC X(08).). */
    public String cdemoToProgram;

    /** CDEMO-USER-ID (uuid:ce071440-b4e8-7ab0-fb96-dd267d08a449, level 10, PIC X(08).). */
    public String cdemoUserId;

    /** CDEMO-USER-TYPE (uuid:e8ff5a30-2704-79b1-2c99-e63e8c9bace6, level 10, PIC X(01).). */
    public String cdemoUserType;

    /** CDEMO-PGM-CONTEXT (uuid:0677f97f-22b0-b690-7e21-6453b30508c7, level 10, PIC 9(01).). */
    public int /* PIC 9(01). */ cdemoPgmContext;

    /** CDEMO-CUSTOMER-INFO (uuid:eefd6380-af8f-003b-78bc-e6a6889b370f, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCustomerInfo;

    /** CDEMO-CUST-ID (uuid:1585af25-afed-6c01-673c-0f022cc7fe73, level 10, PIC 9(09).). */
    public int /* PIC 9(09). */ cdemoCustId;

    /** CDEMO-CUST-FNAME (uuid:ea3a7846-eac8-6026-b3f6-533eb194b5e6, level 10, PIC X(25).). */
    public String cdemoCustFname;

    /** CDEMO-CUST-MNAME (uuid:23a0bec4-f255-fde5-92e8-4a52c584817d, level 10, PIC X(25).). */
    public String cdemoCustMname;

    /** CDEMO-CUST-LNAME (uuid:255cf6d1-0981-f3a4-a12f-abd051193c71, level 10, PIC X(25).). */
    public String cdemoCustLname;

    /** CDEMO-ACCOUNT-INFO (uuid:8d7b2e8d-ef4a-c02b-604b-f80e30358f1d, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoAccountInfo;

    /** CDEMO-ACCT-ID (uuid:78ef2df2-260e-cf72-a6c0-bc51aeaec5b2, level 10, PIC 9(11).). */
    public long /* PIC 9(11). */ cdemoAcctId;

    /** CDEMO-ACCT-STATUS (uuid:546c155e-ced2-8a2d-3c30-0625b29038c8, level 10, PIC X(01).). */
    public String cdemoAcctStatus;

    /** CDEMO-CARD-INFO (uuid:59a5c413-da9a-1515-ac8a-1e23fbf13e42, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoCardInfo;

    /** CDEMO-CARD-NUM (uuid:8153d0a6-f126-f3e1-e6a4-8776a5d8b0f8, level 10, PIC 9(16).). */
    public long /* PIC 9(16). */ cdemoCardNum;

    /** CDEMO-MORE-INFO (uuid:1358837f-a5a4-4f1f-bf2e-8014ae78774b, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ cdemoMoreInfo;

    /** CDEMO-LAST-MAP (uuid:ee7f6ee0-08c9-7aea-d0f5-9715f32e600d, level 10, PIC X(7).). */
    public String cdemoLastMap;

    /** CDEMO-LAST-MAPSET (uuid:2bd522b3-83de-df68-70a4-846960358657, level 10, PIC X(7).). */
    public String cdemoLastMapset;

    /** WS-THIS-PROGCOMMAREA (uuid:b4f65f98-ca89-16be-1055-758907a076b3, level 1, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ wsThisProgcommarea;

    /** ACCT-UPDATE-SCREEN-DATA (uuid:73d35da1-63c3-e6f8-9c5b-8763f12d1f9a, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acctUpdateScreenData;

    /** ACUP-CHANGE-ACTION (uuid:4f353842-301b-d0f0-2d76-4b22096d649f, level 10, PIC X(1)). */
    public String acupChangeAction;

    /** ACUP-OLD-DETAILS (uuid:90cff107-59f9-eac8-89c8-6970b38b72a2, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldDetails;

    /** ACUP-OLD-ACCT-DATA (uuid:fb14c0ab-d02f-d2c4-e234-e313ca28179c, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldAcctData;

    /** ACUP-OLD-ACCT-ID-X (uuid:7c4475d1-d37b-e0e3-c8fb-6ad9d2a73b7e, level 15, PIC X(11).). */
    public String acupOldAcctIdX;

    /** ACUP-OLD-ACCT-ID (uuid:609dbd40-6bde-45d3-1876-9b40d46f275e, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldAcctId;

    /** ACUP-OLD-ACTIVE-STATUS (uuid:8cd37097-e38f-6243-2703-a5907acc65b7, level 15, PIC X(01).). */
    public String acupOldActiveStatus;

    /** ACUP-OLD-CURR-BAL (uuid:e850ebfb-963a-bc7c-43e7-0c4016351d59, level 15, PIC X(12).). */
    public String acupOldCurrBal;

    /** ACUP-OLD-CURR-BAL-N (uuid:ce456b2d-55e6-1925-568c-329036ea2fe2, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldCurrBalN;

    /** ACUP-OLD-CREDIT-LIMIT (uuid:00e8ac6c-a615-aa15-0727-5e7d0e0773d4, level 15, PIC X(12).). */
    public String acupOldCreditLimit;

    /** ACUP-OLD-CREDIT-LIMIT-N (uuid:c49ffcec-eed7-a937-553b-5a911ec889cc, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldCreditLimitN;

    /** ACUP-OLD-CASH-CREDIT-LIMIT (uuid:5b274afd-5c40-98fd-c5ac-8571433d262c, level 15, PIC X(12).). */
    public String acupOldCashCreditLimit;

    /** ACUP-OLD-CASH-CREDIT-LIMIT-N (uuid:c1b74ce8-106a-bf97-2d24-5f5ecc58a767, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldCashCreditLimitN;

    /** ACUP-OLD-OPEN-DATE (uuid:c0dd2018-39b5-d6c9-7203-14c680f44793, level 15, PIC X(08).). */
    public String acupOldOpenDate;

    /** ACUP-OLD-OPEN-DATE-PARTS (uuid:1263a675-0929-41be-a746-4edb2782e1b3, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldOpenDateParts;

    /** ACUP-OLD-OPEN-YEAR (uuid:b24ef2bb-0a31-88f2-2d92-7c48ecd442a3, level 20, PIC X(4).). */
    public String acupOldOpenYear;

    /** ACUP-OLD-OPEN-MON (uuid:7411f11c-fb97-0b95-1636-deda9be52210, level 20, PIC X(2).). */
    public String acupOldOpenMon;

    /** ACUP-OLD-OPEN-DAY (uuid:82566ebb-b9f0-84e7-8a8c-979908d3e854, level 20, PIC X(2).). */
    public String acupOldOpenDay;

    /** ACUP-OLD-EXPIRAION-DATE (uuid:6f4fa474-506c-d365-b066-c6d9a9998c4a, level 15, PIC X(08).). */
    public String acupOldExpiraionDate;

    /** ACUP-OLD-EXPIRAION-DATE-PARTS (uuid:6db42835-c1e6-639f-16fe-6f86751b2fd6, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldExpiraionDateParts;

    /** ACUP-OLD-EXP-YEAR (uuid:fd2c8c4d-4f6e-df2f-86a1-211346a1c044, level 20, PIC X(4).). */
    public String acupOldExpYear;

    /** ACUP-OLD-EXP-MON (uuid:0646c2da-4d2c-b84c-dbc2-293da309a090, level 20, PIC X(2).). */
    public String acupOldExpMon;

    /** ACUP-OLD-EXP-DAY (uuid:deb27c90-2b44-1fa4-e671-cf78b3c6372a, level 20, PIC X(2).). */
    public String acupOldExpDay;

    /** ACUP-OLD-REISSUE-DATE (uuid:2fa9ceed-4acb-8cae-f895-5731c5807395, level 15, PIC X(08).). */
    public String acupOldReissueDate;

    /** ACUP-OLD-REISSUE-DATE-PARTS (uuid:66a9b2e3-fd3d-4164-5848-36d239628852, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldReissueDateParts;

    /** ACUP-OLD-REISSUE-YEAR (uuid:8fdac8b8-f060-4386-57db-7daca6cdfed9, level 20, PIC X(4).). */
    public String acupOldReissueYear;

    /** ACUP-OLD-REISSUE-MON (uuid:3d6fa292-f296-f395-e393-328fd6e90642, level 20, PIC X(2).). */
    public String acupOldReissueMon;

    /** ACUP-OLD-REISSUE-DAY (uuid:8b511735-4534-3363-0ccd-29ae3cb7b4fe, level 20, PIC X(2).). */
    public String acupOldReissueDay;

    /** ACUP-OLD-CURR-CYC-CREDIT (uuid:2448b610-64fb-9bf0-99db-daf35ad9ceb6, level 15, PIC X(12).). */
    public String acupOldCurrCycCredit;

    /** ACUP-OLD-CURR-CYC-CREDIT-N (uuid:3222718f-4037-58aa-edb1-45837f2be479, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldCurrCycCreditN;

    /** ACUP-OLD-CURR-CYC-DEBIT (uuid:a58e0f94-17a1-aeea-b0dd-35be61100a7e, level 15, PIC X(12).). */
    public String acupOldCurrCycDebit;

    /** ACUP-OLD-CURR-CYC-DEBIT-N (uuid:a246ff90-d1c7-1f1c-4f0b-793fc9639b08, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldCurrCycDebitN;

    /** ACUP-OLD-GROUP-ID (uuid:9d2b8425-43dc-f715-d6ae-a09045ba2be2, level 15, PIC X(10).). */
    public String acupOldGroupId;

    /** ACUP-OLD-CUST-DATA (uuid:4a0bbb57-bcdf-a348-0121-39119e219df3, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldCustData;

    /** ACUP-OLD-CUST-ID-X (uuid:e92de84a-2242-e5c5-1ccb-fd2db57e26f4, level 15, PIC X(09).). */
    public int /* PIC X(09). */ acupOldCustIdX;

    /** ACUP-OLD-CUST-ID (uuid:8982d1ff-5b8f-4394-8ec8-ecd5842ad44f, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldCustId;

    /** ACUP-OLD-CUST-FIRST-NAME (uuid:0b3b3920-e882-e707-0786-bd6abebf67a1, level 15, PIC X(25).). */
    public String acupOldCustFirstName;

    /** ACUP-OLD-CUST-MIDDLE-NAME (uuid:cbee04c9-b971-67f9-15e2-d6ec44ada2cf, level 15, PIC X(25).). */
    public String acupOldCustMiddleName;

    /** ACUP-OLD-CUST-LAST-NAME (uuid:c24303d1-d918-0b1a-6611-bd94fe0a96a0, level 15, PIC X(25).). */
    public String acupOldCustLastName;

    /** ACUP-OLD-CUST-ADDR-LINE-1 (uuid:b314a3b2-d940-69b8-57b7-341e4229703e, level 15, PIC X(50).). */
    public String acupOldCustAddrLine1;

    /** ACUP-OLD-CUST-ADDR-LINE-2 (uuid:78a48c83-9426-d0c6-47b0-0f295051d538, level 15, PIC X(50).). */
    public String acupOldCustAddrLine2;

    /** ACUP-OLD-CUST-ADDR-LINE-3 (uuid:8cea2abf-1b0d-6818-9fe1-dc3b08bc733a, level 15, PIC X(50).). */
    public String acupOldCustAddrLine3;

    /** ACUP-OLD-CUST-ADDR-STATE-CD (uuid:81a3572d-c5e4-07b8-2fbe-9dcf77b67d51, level 15, PIC X(02).). */
    public String acupOldCustAddrStateCd;

    /** ACUP-OLD-CUST-ADDR-COUNTRY-CD (uuid:95106f04-532f-75c5-7cd0-4ca3aca806c4, level 15, PIC X(03).). */
    public String acupOldCustAddrCountryCd;

    /** ACUP-OLD-CUST-ADDR-ZIP (uuid:446eb9e4-7c01-56e7-4154-cc12bcddb1bb, level 15, PIC X(10).). */
    public String acupOldCustAddrZip;

    /** ACUP-OLD-CUST-PHONE-NUM-1 (uuid:781636ec-955c-d434-2635-76f21cfada79, level 15, PIC X(15).). */
    public String acupOldCustPhoneNum1;

    /** ACUP-OLD-CUST-PHONE-NUM-1-X (uuid:c9134369-088f-2a18-9c2b-5067c2cf4399, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldCustPhoneNum1X;

    /** ACUP-OLD-CUST-PHONE-NUM-1A (uuid:01fa9923-f472-e51f-cf62-416464b39d02, level 20, PIC X(3).). */
    public String acupOldCustPhoneNum1a;

    /** ACUP-OLD-CUST-PHONE-NUM-1B (uuid:63c0a38b-fbde-a4b2-ab93-854bd75f9342, level 20, PIC X(3).). */
    public String acupOldCustPhoneNum1b;

    /** ACUP-OLD-CUST-PHONE-NUM-1C (uuid:66a1e01d-1cd5-07ad-7612-1f05ea2fd65b, level 20, PIC X(4).). */
    public String acupOldCustPhoneNum1c;

    /** ACUP-OLD-CUST-PHONE-NUM-2 (uuid:1df47ed9-e2c8-bb1d-10a9-53050a92fa33, level 15, PIC X(15).). */
    public String acupOldCustPhoneNum2;

    /** ACUP-OLD-CUST-PHONE-NUM-2-X (uuid:5ee65c12-931e-308e-c63b-23a754060fc6, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldCustPhoneNum2X;

    /** ACUP-OLD-CUST-PHONE-NUM-2A (uuid:3246250e-1aa1-cb27-96de-d1def1e5c0d7, level 20, PIC X(3).). */
    public String acupOldCustPhoneNum2a;

    /** ACUP-OLD-CUST-PHONE-NUM-2B (uuid:d302c442-42bc-ef05-5b6c-e24a7ad8f359, level 20, PIC X(3).). */
    public String acupOldCustPhoneNum2b;

    /** ACUP-OLD-CUST-PHONE-NUM-2C (uuid:df715b66-68c9-1ad5-6738-3e6eee977213, level 20, PIC X(4).). */
    public String acupOldCustPhoneNum2c;

    /** ACUP-OLD-CUST-SSN-X (uuid:a49c7123-0a3e-3c43-f715-6c8bcd3e78f7, level 15, PIC X(09).). */
    public int /* PIC X(09). */ acupOldCustSsnX;

    /** ACUP-OLD-CUST-SSN (uuid:fb27249b-fb2b-5605-b4fd-9ff5263d4925, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldCustSsn;

    /** ACUP-OLD-CUST-GOVT-ISSUED-ID (uuid:e0e71a9d-306a-8691-3e22-3af01d0552df, level 15, PIC X(20).). */
    public String acupOldCustGovtIssuedId;

    /** ACUP-OLD-CUST-DOB-YYYY-MM-DD (uuid:aefe351c-3a09-2a5e-f943-bd3963ab2f82, level 15, PIC X(08).). */
    public String acupOldCustDobYyyyMmDd;

    /** ACUP-OLD-CUST-DOB-PARTS (uuid:f5e01009-bdd8-fbb4-9809-3c5170bc0ef7, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldCustDobParts;

    /** ACUP-OLD-CUST-DOB-YEAR (uuid:fe6f8692-4586-a6ae-2100-4b07bc789be2, level 20, PIC X(4).). */
    public String acupOldCustDobYear;

    /** ACUP-OLD-CUST-DOB-MON (uuid:db2c357b-3007-f630-5c41-41f0b570e10c, level 20, PIC X(2).). */
    public String acupOldCustDobMon;

    /** ACUP-OLD-CUST-DOB-DAY (uuid:b34cdf70-5b7c-9ca3-a10f-9fcbc6d55457, level 20, PIC X(2).). */
    public String acupOldCustDobDay;

    /** ACUP-OLD-CUST-EFT-ACCOUNT-ID (uuid:e31dad5e-3832-9a0d-920a-d0e286f4362d, level 15, PIC X(10).). */
    public String acupOldCustEftAccountId;

    /** ACUP-OLD-CUST-PRI-HOLDER-IND (uuid:2a4e60ed-c2ee-49cc-8e94-ed5942e3e773, level 15, PIC X(01).). */
    public String acupOldCustPriHolderInd;

    /** ACUP-OLD-CUST-FICO-SCORE-X (uuid:b73090ef-cc0a-952d-be8c-ef6860aca21d, level 15, PIC X(03).). */
    public String acupOldCustFicoScoreX;

    /** ACUP-OLD-CUST-FICO-SCORE (uuid:8604273d-e9a1-ef03-b425-7a5292fd7691, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupOldCustFicoScore;

    /** ACUP-NEW-DETAILS (uuid:b149a897-be75-666c-a1fe-a3e32d655e18, level 5, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewDetails;

    /** ACUP-NEW-ACCT-DATA (uuid:388afdb8-0a8f-76f3-c15d-4f3985dca694, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewAcctData;

    /** ACUP-NEW-ACCT-ID-X (uuid:dc7efa16-4a34-2486-7c86-379832092e8f, level 15, PIC X(11).). */
    public String acupNewAcctIdX;

    /** ACUP-NEW-ACCT-ID (uuid:876c13c4-14e9-7b3d-a732-e418c21cb7cc, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewAcctId;

    /** ACUP-NEW-ACTIVE-STATUS (uuid:8d555970-2648-9b84-65a0-d10e55eaecf4, level 15, PIC X(01).). */
    public String acupNewActiveStatus;

    /** ACUP-NEW-CURR-BAL (uuid:b7806b89-7f1b-2025-6394-10a4a09aecf2, level 15, PIC X(12).). */
    public String acupNewCurrBal;

    /** ACUP-NEW-CURR-BAL-N (uuid:bcd31778-0669-f8ff-9903-386f24e8198e, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewCurrBalN;

    /** ACUP-NEW-CREDIT-LIMIT (uuid:abf42de7-4a9e-32fa-cb6d-2437004dcbef, level 15, PIC X(12).). */
    public String acupNewCreditLimit;

    /** ACUP-NEW-CREDIT-LIMIT-N (uuid:4a3a7ab2-b45a-10ec-235d-1bd31c7b509e, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewCreditLimitN;

    /** ACUP-NEW-CASH-CREDIT-LIMIT (uuid:0fd1c23b-f4df-3d68-2132-afe0f5d3b509, level 15, PIC X(12).). */
    public String acupNewCashCreditLimit;

    /** ACUP-NEW-CASH-CREDIT-LIMIT-N (uuid:aaa46cdd-c61c-f517-63f8-63c53a22901b, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewCashCreditLimitN;

    /** ACUP-NEW-OPEN-DATE (uuid:d04fec2d-cb5a-44c0-5a28-0a37d3ce6c17, level 15, PIC X(08).). */
    public String acupNewOpenDate;

    /** ACUP-NEW-OPEN-DATE-PARTS (uuid:637d6210-50b8-f238-00e1-da9dfdf95336, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewOpenDateParts;

    /** ACUP-NEW-OPEN-YEAR (uuid:59e39332-2f7d-1e4e-4dd8-183df17b4636, level 20, PIC X(4).). */
    public String acupNewOpenYear;

    /** ACUP-NEW-OPEN-MON (uuid:85bee08b-6415-ff67-85f2-6da52a5b53f6, level 20, PIC X(2).). */
    public String acupNewOpenMon;

    /** ACUP-NEW-OPEN-DAY (uuid:a94b88c2-1bd6-1f4b-ee42-610af723f794, level 20, PIC X(2).). */
    public String acupNewOpenDay;

    /** ACUP-NEW-EXPIRAION-DATE (uuid:b0795e26-cffc-31a5-1d7a-c07c4b940d34, level 15, PIC X(08).). */
    public String acupNewExpiraionDate;

    /** ACUP-NEW-EXPIRAION-DATE-PARTS (uuid:332a2504-0519-b9be-4391-0e0ab77f30cd, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewExpiraionDateParts;

    /** ACUP-NEW-EXP-YEAR (uuid:8783c6a7-1360-69ea-a09d-0f4365f657c3, level 20, PIC X(4).). */
    public String acupNewExpYear;

    /** ACUP-NEW-EXP-MON (uuid:81dd157d-556a-1fa8-51fb-37451e887984, level 20, PIC X(2).). */
    public String acupNewExpMon;

    /** ACUP-NEW-EXP-DAY (uuid:c09b8e7d-8887-e979-130e-dfe4b3ff2fe9, level 20, PIC X(2).). */
    public String acupNewExpDay;

    /** ACUP-NEW-REISSUE-DATE (uuid:4adb1bab-0dd4-fd41-5fb3-d032b2d14d25, level 15, PIC X(08).). */
    public String acupNewReissueDate;

    /** ACUP-NEW-REISSUE-DATE-PARTS (uuid:f0b1a486-8551-4d1e-4ebc-9512c83abd25, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewReissueDateParts;

    /** ACUP-NEW-REISSUE-YEAR (uuid:79bd77d9-7eb0-da90-e83c-08f6b3d696f4, level 20, PIC X(4).). */
    public String acupNewReissueYear;

    /** ACUP-NEW-REISSUE-MON (uuid:5ba926bb-6383-e1a0-276d-0393fcb4f4fc, level 20, PIC X(2).). */
    public String acupNewReissueMon;

    /** ACUP-NEW-REISSUE-DAY (uuid:6a9d9a0e-f21e-a699-469a-f1a1cd7c2a1b, level 20, PIC X(2).). */
    public String acupNewReissueDay;

    /** ACUP-NEW-CURR-CYC-CREDIT (uuid:72cb3b1c-022a-39e4-d2bb-4aa67c471977, level 15, PIC X(12).). */
    public String acupNewCurrCycCredit;

    /** ACUP-NEW-CURR-CYC-CREDIT-N (uuid:3bcc3bf6-7242-a4b1-6a16-0bebd1623a44, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewCurrCycCreditN;

    /** ACUP-NEW-CURR-CYC-DEBIT (uuid:f864743e-179f-dacd-d3c9-98fb9adf44b1, level 15, PIC X(12).). */
    public String acupNewCurrCycDebit;

    /** ACUP-NEW-CURR-CYC-DEBIT-N (uuid:5319d543-d5eb-701b-9dcd-5b8cecf1071f, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewCurrCycDebitN;

    /** ACUP-NEW-GROUP-ID (uuid:f83bda67-4758-0d57-d16e-360221f11c1a, level 15, PIC X(10).). */
    public String acupNewGroupId;

    /** ACUP-NEW-CUST-DATA (uuid:60df09eb-f8fd-6d5c-16aa-db098568e4bc, level 10, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewCustData;

    /** ACUP-NEW-CUST-ID-X (uuid:931e1101-6214-6d32-5eb7-8767bcae94a1, level 15, PIC X(09).). */
    public int /* PIC X(09). */ acupNewCustIdX;

    /** ACUP-NEW-CUST-ID (uuid:76b81d9d-9b65-d936-5f40-7c68d3560342, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewCustId;

    /** ACUP-NEW-CUST-FIRST-NAME (uuid:3cb3bbab-d848-b587-62b6-4d937d9b6617, level 15, PIC X(25).). */
    public String acupNewCustFirstName;

    /** ACUP-NEW-CUST-MIDDLE-NAME (uuid:c9a9ce61-64bc-9786-d9e5-2b4859c43ab9, level 15, PIC X(25).). */
    public String acupNewCustMiddleName;

    /** ACUP-NEW-CUST-LAST-NAME (uuid:b0ba7d2f-4ce5-f004-b2fd-53751a3b1ec7, level 15, PIC X(25).). */
    public String acupNewCustLastName;

    /** ACUP-NEW-CUST-ADDR-LINE-1 (uuid:4d194a65-8ae0-0e51-178f-da92e3f82311, level 15, PIC X(50).). */
    public String acupNewCustAddrLine1;

    /** ACUP-NEW-CUST-ADDR-LINE-2 (uuid:c42e8cd9-39ec-8c17-8a76-617c11bb0efc, level 15, PIC X(50).). */
    public String acupNewCustAddrLine2;

    /** ACUP-NEW-CUST-ADDR-LINE-3 (uuid:7ecaa826-978b-cc8d-2eca-147fbb080e6a, level 15, PIC X(50).). */
    public String acupNewCustAddrLine3;

    /** ACUP-NEW-CUST-ADDR-STATE-CD (uuid:23996172-1551-391f-a4cb-4f0a8d5ebf7c, level 15, PIC X(02).). */
    public String acupNewCustAddrStateCd;

    /** ACUP-NEW-CUST-ADDR-COUNTRY-CD (uuid:edb57d7c-d70d-7869-89f3-f1eca51b7737, level 15, PIC X(03).). */
    public String acupNewCustAddrCountryCd;

    /** ACUP-NEW-CUST-ADDR-ZIP (uuid:5fcfd77a-b878-9fc1-6e0f-3d5993affa4f, level 15, PIC X(10).). */
    public String acupNewCustAddrZip;

    /** ACUP-NEW-CUST-PHONE-NUM-1 (uuid:958b44e2-5fd5-b986-1b98-3ade412ca896, level 15, PIC X(15).). */
    public String acupNewCustPhoneNum1;

    /** ACUP-NEW-CUST-PHONE-NUM-1-X (uuid:cdae4597-230a-e469-5900-d59f9acea2c3, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewCustPhoneNum1X;

    /** ACUP-NEW-CUST-PHONE-NUM-1A (uuid:8e3cd525-0bd9-a6f9-36cf-f4d8a87b1272, level 20, PIC X(3).). */
    public String acupNewCustPhoneNum1a;

    /** ACUP-NEW-CUST-PHONE-NUM-1B (uuid:bdebd594-0b25-3294-7390-bd0c3ffec56b, level 20, PIC X(3).). */
    public String acupNewCustPhoneNum1b;

    /** ACUP-NEW-CUST-PHONE-NUM-1C (uuid:a0a62cbd-2fb6-9d11-eedc-c15611560c4e, level 20, PIC X(4).). */
    public String acupNewCustPhoneNum1c;

    /** ACUP-NEW-CUST-PHONE-NUM-2 (uuid:af4018e4-f5b1-7ca0-d168-a00c8821943a, level 15, PIC X(15).). */
    public String acupNewCustPhoneNum2;

    /** ACUP-NEW-CUST-PHONE-NUM-2-X (uuid:a1478a74-13c7-ef7e-c426-a3b3489ac3a6, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewCustPhoneNum2X;

    /** ACUP-NEW-CUST-PHONE-NUM-2A (uuid:655cdc75-7fd7-0c67-e8bb-e7447e9dbfc7, level 20, PIC X(3).). */
    public String acupNewCustPhoneNum2a;

    /** ACUP-NEW-CUST-PHONE-NUM-2B (uuid:77340292-85ef-192e-7e6d-e3d38db176b0, level 20, PIC X(3).). */
    public String acupNewCustPhoneNum2b;

    /** ACUP-NEW-CUST-PHONE-NUM-2C (uuid:f2d0a06e-74f5-f0b3-e5ba-43792b433be6, level 20, PIC X(4).). */
    public String acupNewCustPhoneNum2c;

    /** ACUP-NEW-CUST-SSN-X (uuid:c4d1e4be-e99d-64bd-3c39-0aac6502ef5d, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewCustSsnX;

    /** ACUP-NEW-CUST-SSN-1 (uuid:13b241e4-4022-a289-1e90-effffcbe0bc7, level 20, PIC X(03).). */
    public String acupNewCustSsn1;

    /** ACUP-NEW-CUST-SSN-2 (uuid:ff26dfeb-4bec-cb9d-1ee2-fd236b1b43f7, level 20, PIC X(02).). */
    public String acupNewCustSsn2;

    /** ACUP-NEW-CUST-SSN-3 (uuid:2b1d260e-c4f9-fd9a-eee4-0540d9512810, level 20, PIC X(04).). */
    public String acupNewCustSsn3;

    /** ACUP-NEW-CUST-SSN (uuid:cb3e5e55-c5e2-cb63-97c0-7fbd32f274f3, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewCustSsn;

    /** ACUP-NEW-CUST-GOVT-ISSUED-ID (uuid:0652f736-f241-fc1c-49de-ae2d8c37893d, level 15, PIC X(20).). */
    public String acupNewCustGovtIssuedId;

    /** ACUP-NEW-CUST-DOB-YYYY-MM-DD (uuid:87f49e40-c532-816d-d27d-5caaadb3f7e8, level 15, PIC X(08).). */
    public String acupNewCustDobYyyyMmDd;

    /** ACUP-NEW-CUST-DOB-PARTS (uuid:c5c82f95-f27b-719c-1c26-37bf8d882873, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewCustDobParts;

    /** ACUP-NEW-CUST-DOB-YEAR (uuid:90735e98-8046-1256-9592-05848248d801, level 20, PIC X(4).). */
    public String acupNewCustDobYear;

    /** ACUP-NEW-CUST-DOB-MON (uuid:3052ef43-2287-aefd-2167-016f62244f7d, level 20, PIC X(2).). */
    public String acupNewCustDobMon;

    /** ACUP-NEW-CUST-DOB-DAY (uuid:ab24a2bc-18e5-669f-7bbf-a8c2485dbed3, level 20, PIC X(2).). */
    public String acupNewCustDobDay;

    /** ACUP-NEW-CUST-EFT-ACCOUNT-ID (uuid:a37f0ca5-44a6-619b-2481-50b48045cf34, level 15, PIC X(10).). */
    public String acupNewCustEftAccountId;

    /** ACUP-NEW-CUST-PRI-HOLDER-IND (uuid:39cbabac-9599-9750-4b13-58e3c09bc9d9, level 15, PIC X(01).). */
    public String acupNewCustPriHolderInd;

    /** ACUP-NEW-CUST-FICO-SCORE-X (uuid:aee48900-061e-2802-a5c0-fbeed20ebbe3, level 15, PIC X(03).). */
    public String acupNewCustFicoScoreX;

    /** ACUP-NEW-CUST-FICO-SCORE (uuid:de80d119-f39c-3581-6686-b56cdf685b05, level 15, PIC unknown — fell back to name-suffix heuristic). */
    public Object /* group item - nested class placeholder */ acupNewCustFicoScore;

    /** WS-COMMAREA (uuid:c48c1e2d-6021-9b5d-8e14-66ea00aca650, level 1, PIC X(2000).). */
    public String wsCommarea;


    // --- auto-generated stubs for undeclared references ---
    public Object account;  // auto-stub for undeclared reference
    public Object address;  // auto-stub for undeclared reference
    public Object and;  // auto-stub for undeclared reference
    public Object contact;  // auto-stub for undeclared reference
    public Object customer;  // auto-stub for undeclared reference
    public Object data;  // auto-stub for undeclared reference
    public Object dates;  // auto-stub for undeclared reference
    public Object dfhresp;  // auto-stub for undeclared reference
    public Object good;  // auto-stub for undeclared reference
    public Object info;  // auto-stub for undeclared reference
    public Object limits;  // auto-stub for undeclared reference
    public Object other;  // auto-stub for undeclared reference
    public Object stuff;  // auto-stub for undeclared reference

    /** 0000-MAIN  (uuid:88040946-39a1-85f3-3a4f-3538bf14787b, source lines 3331-3477). */
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
        if (((true /* TODO translate: CCARD-AID-ENTER */) || (true /* TODO translate: CCARD-AID-PFK03 */) || (true /* TODO translate: (CCARD-AID-PFK05 */)) && ((true /* TODO translate: ACUP-CHANGES-OK-NOT-CONFIRMED) */) || (true /* TODO translate: (CCARD-AID-PFK12 */)) && (true /* TODO translate: NOT ACUP-DETAILS-NOT-FETCHED) */)) {
            // TODO: translate body for: CCARD-AID-ENTER OR CCARD-AID-PFK03 OR (CCARD-AID-PFK05 AND ACUP-CHANGES-OK-NOT-CONFIRMED) OR (CCARD-AID-PFK12 AND NOT ACUP-DETAILS-NOT-FETCHED)
        }
        if (true /* TODO translate: PFK-INVALID */) {
            // TODO: translate body for: PFK-INVALID
        }
        // EVALUATE TRUE *> ***************************************************************** *> USER PRESSES PF03 TO EXIT *> OR USER IS DONE WITH UPDATE *> XCTL TO CALLING PROGRAM OR MAIN MENU *> *****************************************************************
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if ((true /* TODO translate: TRUE *> ***************************************************************** *> USER PRESSES PF03 TO EXIT *> */) || (true /* TODO translate: USER IS DONE WITH UPDATE *> XCTL TO CALLING PROGRAM */) || (true /* TODO translate: MAIN MENU *> ***************************************************************** */)) { /* WHEN branches follow */ }
    }

    /** COMMON-RETURN  (uuid:dd71c704-89f3-7166-ea16-b4127d2f0a45, source lines 3479-3492). */
    public void commonReturn() {
        // MOVE WS-RETURN-MSG TO CCARD-ERROR-MSG  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CARDDEMO-COMMAREA TO WS-COMMAREA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-THIS-PROGCOMMAREA TO WS-COMMAREA(LENGTH OF CARDDEMO-COMMAREA, LENGTH OF WS-THIS-PROGCOMMAREA  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 0000-MAIN-EXIT  (uuid:16ba2435-5b11-5eb7-263f-636de43ed18a, source lines 3493-3495). */
    public void p0000MainExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1000-PROCESS-INPUTS  (uuid:557f8782-5876-dd53-5762-91474ea2bd20, source lines 3497-3506). */
    public void p1000ProcessInputs() {
        // COBOL [PERFORM]: PERFORM 1100-RECEIVE-MAP THRU 1100-RECEIVE-MAP-EXIT
        // COBOL [PERFORM]: PERFORM 1200-EDIT-MAP-INPUTS THRU 1200-EDIT-MAP-INPUTS-EXIT
        // MOVE WS-RETURN-MSG TO CCARD-ERROR-MSG  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISPGM TO CCARD-NEXT-PROG  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISMAPSET TO CCARD-NEXT-MAPSET  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISMAP TO CCARD-NEXT-MAP  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 1000-PROCESS-INPUTS-EXIT  (uuid:033392fc-e570-64ce-07ac-a474b5931660, source lines 3508-3510). */
    public void p1000ProcessInputsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1100-RECEIVE-MAP  (uuid:fd12912b-edfd-50e1-0064-c353b05881bb, source lines 3511-3897). */
    public void p1100ReceiveMap() {
        // INITIALIZE acupNewDetails: reset to PIC defaults
        this.acupNewDetails = null;  // TODO: set to type-appropriate zero/spaces
        if ((true /* TODO translate: ACCTSIDI OF CACTUPAI = '*' */) || (true /* TODO translate: ACCTSIDI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACCTSIDI OF CACTUPAI = '*' OR ACCTSIDI OF CACTUPAI = SPACES
        }
        if (true /* TODO translate: ACUP-DETAILS-NOT-FETCHED */) {
            // TODO: translate body for: ACUP-DETAILS-NOT-FETCHED
        }
        if ((true /* TODO translate: ACSTTUSI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSTTUSI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSTTUSI OF CACTUPAI = '*' OR ACSTTUSI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACRDLIMI OF CACTUPAI = '*' */) || (true /* TODO translate: ACRDLIMI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACRDLIMI OF CACTUPAI = '*' OR ACRDLIMI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSHLIMI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSHLIMI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSHLIMI OF CACTUPAI = '*' OR ACSHLIMI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACURBALI OF CACTUPAI = '*' */) || (true /* TODO translate: ACURBALI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACURBALI OF CACTUPAI = '*' OR ACURBALI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACRCYCRI OF CACTUPAI = '*' */) || (true /* TODO translate: ACRCYCRI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACRCYCRI OF CACTUPAI = '*' OR ACRCYCRI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACRCYDBI OF CACTUPAI = '*' */) || (true /* TODO translate: ACRCYDBI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACRCYDBI OF CACTUPAI = '*' OR ACRCYDBI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: OPNYEARI OF CACTUPAI = '*' */) || (true /* TODO translate: OPNYEARI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: OPNYEARI OF CACTUPAI = '*' OR OPNYEARI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: OPNMONI OF CACTUPAI = '*' */) || (true /* TODO translate: OPNMONI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: OPNMONI OF CACTUPAI = '*' OR OPNMONI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: OPNDAYI OF CACTUPAI = '*' */) || (true /* TODO translate: OPNDAYI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: OPNDAYI OF CACTUPAI = '*' OR OPNDAYI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: EXPYEARI OF CACTUPAI = '*' */) || (true /* TODO translate: EXPYEARI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: EXPYEARI OF CACTUPAI = '*' OR EXPYEARI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: EXPMONI OF CACTUPAI = '*' */) || (true /* TODO translate: EXPMONI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: EXPMONI OF CACTUPAI = '*' OR EXPMONI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: EXPDAYI OF CACTUPAI = '*' */) || (true /* TODO translate: EXPDAYI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: EXPDAYI OF CACTUPAI = '*' OR EXPDAYI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: RISYEARI OF CACTUPAI = '*' */) || (true /* TODO translate: RISYEARI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: RISYEARI OF CACTUPAI = '*' OR RISYEARI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: RISMONI OF CACTUPAI = '*' */) || (true /* TODO translate: RISMONI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: RISMONI OF CACTUPAI = '*' OR RISMONI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: RISDAYI OF CACTUPAI = '*' */) || (true /* TODO translate: RISDAYI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: RISDAYI OF CACTUPAI = '*' OR RISDAYI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: AADDGRPI OF CACTUPAI = '*' */) || (true /* TODO translate: AADDGRPI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: AADDGRPI OF CACTUPAI = '*' OR AADDGRPI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSTNUMI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSTNUMI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSTNUMI OF CACTUPAI = '*' OR ACSTNUMI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACTSSN1I OF CACTUPAI = '*' */) || (true /* TODO translate: ACTSSN1I OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACTSSN1I OF CACTUPAI = '*' OR ACTSSN1I OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACTSSN2I OF CACTUPAI = '*' */) || (true /* TODO translate: ACTSSN2I OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACTSSN2I OF CACTUPAI = '*' OR ACTSSN2I OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACTSSN3I OF CACTUPAI = '*' */) || (true /* TODO translate: ACTSSN3I OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACTSSN3I OF CACTUPAI = '*' OR ACTSSN3I OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: DOBYEARI OF CACTUPAI = '*' */) || (true /* TODO translate: DOBYEARI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: DOBYEARI OF CACTUPAI = '*' OR DOBYEARI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: DOBMONI OF CACTUPAI = '*' */) || (true /* TODO translate: DOBMONI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: DOBMONI OF CACTUPAI = '*' OR DOBMONI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: DOBDAYI OF CACTUPAI = '*' */) || (true /* TODO translate: DOBDAYI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: DOBDAYI OF CACTUPAI = '*' OR DOBDAYI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSTFCOI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSTFCOI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSTFCOI OF CACTUPAI = '*' OR ACSTFCOI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSFNAMI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSFNAMI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSFNAMI OF CACTUPAI = '*' OR ACSFNAMI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSMNAMI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSMNAMI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSMNAMI OF CACTUPAI = '*' OR ACSMNAMI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSLNAMI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSLNAMI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSLNAMI OF CACTUPAI = '*' OR ACSLNAMI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSADL1I OF CACTUPAI = '*' */) || (true /* TODO translate: ACSADL1I OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSADL1I OF CACTUPAI = '*' OR ACSADL1I OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSADL2I OF CACTUPAI = '*' */) || (true /* TODO translate: ACSADL2I OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSADL2I OF CACTUPAI = '*' OR ACSADL2I OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSCITYI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSCITYI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSCITYI OF CACTUPAI = '*' OR ACSCITYI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSSTTEI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSSTTEI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSSTTEI OF CACTUPAI = '*' OR ACSSTTEI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSCTRYI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSCTRYI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSCTRYI OF CACTUPAI = '*' OR ACSCTRYI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSZIPCI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSZIPCI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSZIPCI OF CACTUPAI = '*' OR ACSZIPCI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSPH1AI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSPH1AI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSPH1AI OF CACTUPAI = '*' OR ACSPH1AI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSPH1BI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSPH1BI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSPH1BI OF CACTUPAI = '*' OR ACSPH1BI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSPH1CI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSPH1CI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSPH1CI OF CACTUPAI = '*' OR ACSPH1CI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSPH2AI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSPH2AI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSPH2AI OF CACTUPAI = '*' OR ACSPH2AI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSPH2BI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSPH2BI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSPH2BI OF CACTUPAI = '*' OR ACSPH2BI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSPH2CI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSPH2CI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSPH2CI OF CACTUPAI = '*' OR ACSPH2CI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSGOVTI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSGOVTI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSGOVTI OF CACTUPAI = '*' OR ACSGOVTI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSEFTCI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSEFTCI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSEFTCI OF CACTUPAI = '*' OR ACSEFTCI OF CACTUPAI = SPACES
        }
        if ((true /* TODO translate: ACSPFLGI OF CACTUPAI = '*' */) || (true /* TODO translate: ACSPFLGI OF CACTUPAI = SPACES */)) {
            // TODO: translate body for: ACSPFLGI OF CACTUPAI = '*' OR ACSPFLGI OF CACTUPAI = SPACES
        }
    }

    /** 1100-RECEIVE-MAP-EXIT  (uuid:d209e8cd-6dab-a61b-71ba-3ce8912f79a1, source lines 3898-3900). */
    public void p1100ReceiveMapExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1200-EDIT-MAP-INPUTS  (uuid:38a01ba2-68c4-1471-cbfb-40726aac7717, source lines 3901-4148). */
    public void p1200EditMapInputs() {
        // SET INPUT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (true /* TODO translate: ACUP-DETAILS-NOT-FETCHED *> VALIDATE THE SEARCH KEYS */) {
            // TODO: translate body for: ACUP-DETAILS-NOT-FETCHED *> VALIDATE THE SEARCH KEYS
        }
        // SET FOUND-ACCOUNT-DATA TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET FOUND-ACCT-IN-MASTER TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET FLG-ACCTFILTER-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET FOUND-CUST-IN-MASTER TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // SET FLG-CUSTFILTER-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // COBOL [PERFORM]: PERFORM 1205-COMPARE-OLD-NEW THRU 1205-COMPARE-OLD-NEW-EXIT
        if ((true /* TODO translate: NO-CHANGES-FOUND */) || (true /* TODO translate: ACUP-CHANGES-OK-NOT-CONFIRMED */) || (true /* TODO translate: ACUP-CHANGES-OKAYED-AND-DONE */)) {
            // TODO: translate body for: NO-CHANGES-FOUND OR ACUP-CHANGES-OK-NOT-CONFIRMED OR ACUP-CHANGES-OKAYED-AND-DONE
        }
        // SET ACUP-CHANGES-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        this.wsEditVariableName = "Account Status";
        // MOVE ACUP-NEW-ACTIVE-STATUS TO WS-EDIT-YES-NO  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1220-EDIT-YESNO THRU 1220-EDIT-YESNO-EXIT
        // MOVE WS-EDIT-YES-NO TO WS-EDIT-ACCT-STATUS  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "Open Date";
        // MOVE ACUP-NEW-OPEN-DATE TO WS-EDIT-DATE-CCYYMMDD  -- identifier MOVE; needs PIC-aware type coercion
        this.editDateCcyymmdd();  // PERFORM
        // MOVE WS-EDIT-DATE-FLGS TO WS-EDIT-OPEN-DATE-FLGS  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "Credit Limit";
        // MOVE ACUP-NEW-CREDIT-LIMIT-X TO WS-EDIT-SIGNED-NUMBER-9V2-X  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1250-EDIT-SIGNED-9V2 THRU 1250-EDIT-SIGNED-9V2-EXIT
        // MOVE WS-FLG-SIGNED-NUMBER-EDIT TO WS-EDIT-CREDIT-LIMIT  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "Expiry Date";
        // MOVE ACUP-NEW-EXPIRAION-DATE TO WS-EDIT-DATE-CCYYMMDD  -- identifier MOVE; needs PIC-aware type coercion
        this.editDateCcyymmdd();  // PERFORM
        // MOVE WS-EDIT-DATE-FLGS TO WS-EXPIRY-DATE-FLGS  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "Cash Credit Limit";
        // MOVE ACUP-NEW-CASH-CREDIT-LIMIT-X TO WS-EDIT-SIGNED-NUMBER-9V2-X  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1250-EDIT-SIGNED-9V2 THRU 1250-EDIT-SIGNED-9V2-EXIT
        // MOVE WS-FLG-SIGNED-NUMBER-EDIT TO WS-EDIT-CASH-CREDIT-LIMIT  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "Reissue Date";
        // MOVE ACUP-NEW-REISSUE-DATE TO WS-EDIT-DATE-CCYYMMDD  -- identifier MOVE; needs PIC-aware type coercion
        this.editDateCcyymmdd();  // PERFORM
        // MOVE WS-EDIT-DATE-FLGS TO WS-EDIT-REISSUE-DATE-FLGS  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "Current Balance";
        // MOVE ACUP-NEW-CURR-BAL-X TO WS-EDIT-SIGNED-NUMBER-9V2-X  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1250-EDIT-SIGNED-9V2 THRU 1250-EDIT-SIGNED-9V2-EXIT
        // MOVE WS-FLG-SIGNED-NUMBER-EDIT TO WS-EDIT-CURR-BAL  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "Current Cycle Credit Limit";
        // MOVE ACUP-NEW-CURR-CYC-CREDIT-X TO WS-EDIT-SIGNED-NUMBER-9V2-X  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1250-EDIT-SIGNED-9V2 THRU 1250-EDIT-SIGNED-9V2-EXIT
        // MOVE WS-FLG-SIGNED-NUMBER-EDIT TO WS-EDIT-CURR-CYC-CREDIT  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "Current Cycle Debit Limit";
        // MOVE ACUP-NEW-CURR-CYC-DEBIT-X TO WS-EDIT-SIGNED-NUMBER-9V2-X  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1250-EDIT-SIGNED-9V2 THRU 1250-EDIT-SIGNED-9V2-EXIT
        // MOVE WS-FLG-SIGNED-NUMBER-EDIT TO WS-EDIT-CURR-CYC-DEBIT  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "SSN";
        // COBOL [PERFORM]: PERFORM 1265-EDIT-US-SSN THRU 1265-EDIT-US-SSN-EXIT
        this.wsEditVariableName = "Date of Birth";
        // MOVE ACUP-NEW-CUST-DOB-YYYY-MM-DD TO WS-EDIT-DATE-CCYYMMDD  -- identifier MOVE; needs PIC-aware type coercion
        this.editDateCcyymmdd();  // PERFORM
        // MOVE WS-EDIT-DATE-FLGS TO WS-EDIT-DT-OF-BIRTH-FLGS  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: WS-EDIT-DT-OF-BIRTH-ISVALID */) {
            // TODO: translate body for: WS-EDIT-DT-OF-BIRTH-ISVALID
        }
        this.wsEditVariableName = "FICO Score";
        // MOVE ACUP-NEW-CUST-FICO-SCORE-X TO WS-EDIT-ALPHANUM-ONLY  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditAlphanumLength = 3;
        // COBOL [PERFORM]: PERFORM 1245-EDIT-NUM-REQD THRU 1245-EDIT-NUM-REQD-EXIT
        // MOVE WS-EDIT-ALPHANUM-ONLY-FLAGS TO WS-EDIT-FICO-SCORE-FLGS  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: FLG-FICO-SCORE-ISVALID */) {
            // TODO: translate body for: FLG-FICO-SCORE-ISVALID
        }
        this.wsEditVariableName = "First Name";
        // MOVE ACUP-NEW-CUST-FIRST-NAME TO WS-EDIT-ALPHANUM-ONLY  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditAlphanumLength = 25;
        // COBOL [PERFORM]: PERFORM 1225-EDIT-ALPHA-REQD THRU 1225-EDIT-ALPHA-REQD-EXIT
        // MOVE WS-EDIT-ALPHA-ONLY-FLAGS TO WS-EDIT-FIRST-NAME-FLGS  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "Middle Name";
        // MOVE ACUP-NEW-CUST-MIDDLE-NAME TO WS-EDIT-ALPHANUM-ONLY  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditAlphanumLength = 25;
        // COBOL [PERFORM]: PERFORM 1235-EDIT-ALPHA-OPT THRU 1235-EDIT-ALPHA-OPT-EXIT
        // MOVE WS-EDIT-ALPHA-ONLY-FLAGS TO WS-EDIT-MIDDLE-NAME-FLGS  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "Last Name";
        // MOVE ACUP-NEW-CUST-LAST-NAME TO WS-EDIT-ALPHANUM-ONLY  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditAlphanumLength = 25;
        // COBOL [PERFORM]: PERFORM 1225-EDIT-ALPHA-REQD THRU 1225-EDIT-ALPHA-REQD-EXIT
        // MOVE WS-EDIT-ALPHA-ONLY-FLAGS TO WS-EDIT-LAST-NAME-FLGS  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "Address Line 1";
        // MOVE ACUP-NEW-CUST-ADDR-LINE-1 TO WS-EDIT-ALPHANUM-ONLY  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditAlphanumLength = 50;
        // COBOL [PERFORM]: PERFORM 1215-EDIT-MANDATORY THRU 1215-EDIT-MANDATORY-EXIT
        // MOVE WS-EDIT-MANDATORY-FLAGS TO WS-EDIT-ADDRESS-LINE-1-FLGS  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "State";
        // MOVE ACUP-NEW-CUST-ADDR-STATE-CD TO WS-EDIT-ALPHANUM-ONLY  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditAlphanumLength = 2;
        // COBOL [PERFORM]: PERFORM 1225-EDIT-ALPHA-REQD THRU 1225-EDIT-ALPHA-REQD-EXIT
        // MOVE WS-EDIT-ALPHA-ONLY-FLAGS TO WS-EDIT-STATE-FLGS  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: FLG-ALPHA-ISVALID */) {
            // TODO: translate body for: FLG-ALPHA-ISVALID
        }
        this.wsEditVariableName = "Zip";
        // MOVE ACUP-NEW-CUST-ADDR-ZIP TO WS-EDIT-ALPHANUM-ONLY  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditAlphanumLength = 5;
        // COBOL [PERFORM]: PERFORM 1245-EDIT-NUM-REQD THRU 1245-EDIT-NUM-REQD-EXIT
        // MOVE WS-EDIT-ALPHANUM-ONLY-FLAGS TO WS-EDIT-ZIPCODE-FLGS  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "City";
        // MOVE ACUP-NEW-CUST-ADDR-LINE-3 TO WS-EDIT-ALPHANUM-ONLY  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditAlphanumLength = 50;
        // COBOL [PERFORM]: PERFORM 1225-EDIT-ALPHA-REQD THRU 1225-EDIT-ALPHA-REQD-EXIT
        // MOVE WS-EDIT-ALPHA-ONLY-FLAGS TO WS-EDIT-CITY-FLGS  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "Country";
        // MOVE ACUP-NEW-CUST-ADDR-COUNTRY-CD TO WS-EDIT-ALPHANUM-ONLY  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditAlphanumLength = 3;
        // COBOL [PERFORM]: PERFORM 1225-EDIT-ALPHA-REQD THRU 1225-EDIT-ALPHA-REQD-EXIT
        // MOVE WS-EDIT-ALPHA-ONLY-FLAGS TO WS-EDIT-COUNTRY-FLGS  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "Phone Number 1";
        // MOVE ACUP-NEW-CUST-PHONE-NUM-1 TO WS-EDIT-US-PHONE-NUM  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1260-EDIT-US-PHONE-NUM THRU 1260-EDIT-US-PHONE-NUM-EXIT
        // MOVE WS-EDIT-US-PHONE-NUM-FLGS TO WS-EDIT-PHONE-NUM-1-FLGS  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "Phone Number 2";
        // MOVE ACUP-NEW-CUST-PHONE-NUM-2 TO WS-EDIT-US-PHONE-NUM  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1260-EDIT-US-PHONE-NUM THRU 1260-EDIT-US-PHONE-NUM-EXIT
        // MOVE WS-EDIT-US-PHONE-NUM-FLGS TO WS-EDIT-PHONE-NUM-2-FLGS  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "EFT Account Id";
        // MOVE ACUP-NEW-CUST-EFT-ACCOUNT-ID TO WS-EDIT-ALPHANUM-ONLY  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditAlphanumLength = 10;
        // COBOL [PERFORM]: PERFORM 1245-EDIT-NUM-REQD THRU 1245-EDIT-NUM-REQD-EXIT
        // MOVE WS-EDIT-ALPHANUM-ONLY-FLAGS TO WS-EFT-ACCOUNT-ID-FLGS  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditVariableName = "Primary Card Holder";
        // MOVE ACUP-NEW-CUST-PRI-HOLDER-IND TO WS-EDIT-YES-NO  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [PERFORM]: PERFORM 1220-EDIT-YESNO THRU 1220-EDIT-YESNO-EXIT
        // MOVE WS-EDIT-YES-NO TO WS-EDIT-PRI-CARDHOLDER  -- identifier MOVE; needs PIC-aware type coercion
        if ((true /* TODO translate: FLG-STATE-ISVALID */) && (true /* TODO translate: FLG-ZIPCODE-ISVALID */)) {
            // TODO: translate body for: FLG-STATE-ISVALID AND FLG-ZIPCODE-ISVALID
        }
        if (true /* TODO translate: INPUT-ERROR */) {
            // TODO: translate body for: INPUT-ERROR
        }
    }

    /** 1200-EDIT-MAP-INPUTS-EXIT  (uuid:0f91b945-c749-838f-44ff-e4a3b1225f9a, source lines 4150-4152). */
    public void p1200EditMapInputsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1205-COMPARE-OLD-NEW  (uuid:6f890afc-5923-75b2-97b6-24ef3164c2ed, source lines 4153-4247). */
    public void p1205CompareOldNew() {
        // SET NO-CHANGES-FOUND TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.acupNewAcctIdX, this.acupOldAcctIdX)) {
            // TODO: translate body for: ACUP-NEW-ACCT-ID-X = ACUP-OLD-ACCT-ID-X AND FUNCTION UPPER-CASE ( ACUP-NEW-ACTIVE-STATUS) = FUNCTION UPPER-CASE ( ACUP-OLD-ACTIVE-STATUS) AND ACUP-NEW-CURR-BAL = ACUP-OLD-CURR-BAL AND ACUP-NEW-CREDIT-LIMIT = ACUP-OLD-CREDIT-LIMIT AND ACUP-NEW-CASH-CREDIT-LIMIT = ACUP-OLD-CASH-CREDIT-LIMIT AND ACUP-NEW-OPEN-DATE = ACUP-OLD-OPEN-DATE AND ACUP-NEW-EXPIRAION-DATE = ACUP-OLD-EXPIRAION-DATE AND ACUP-NEW-REISSUE-DATE = ACUP-OLD-REISSUE-DATE AND ACUP-NEW-CURR-CYC-CREDIT = ACUP-OLD-CURR-CYC-CREDIT AND ACUP-NEW-CURR-CYC-DEBIT = ACUP-OLD-CURR-CYC-DEBIT AND FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-GROUP-ID))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-GROUP-ID))
        }
        if ((true /* TODO translate: FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-ID-X))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-ID-X)) */) && (true /* TODO translate: FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-FIRST-NAME))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-FIRST-NAME)) */) && (true /* TODO translate: FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-MIDDLE-NAME))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-MIDDLE-NAME)) */) && (true /* TODO translate: FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-LAST-NAME))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-LAST-NAME)) */) && (true /* TODO translate: FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-ADDR-LINE-1))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-ADDR-LINE-1)) */) && (true /* TODO translate: FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-ADDR-LINE-2))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-ADDR-LINE-2)) */) && (true /* TODO translate: FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-ADDR-LINE-3))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-ADDR-LINE-3)) */) && (true /* TODO translate: FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-ADDR-STATE-CD))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-ADDR-STATE-CD)) */) && (true /* TODO translate: FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-ADDR-COUNTRY-CD))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-ADDR-COUNTRY-CD)) */) && (true /* TODO translate: FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-ADDR-ZIP))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-ADDR-ZIP)) */) && (java.util.Objects.equals(this.acupNewCustPhoneNum1a, this.acupOldCustPhoneNum1a)) && (java.util.Objects.equals(this.acupNewCustPhoneNum1b, this.acupOldCustPhoneNum1b)) && (java.util.Objects.equals(this.acupNewCustPhoneNum1c, this.acupOldCustPhoneNum1c)) && (java.util.Objects.equals(this.acupNewCustPhoneNum2a, this.acupOldCustPhoneNum2a)) && (java.util.Objects.equals(this.acupNewCustPhoneNum2b, this.acupOldCustPhoneNum2b)) && (java.util.Objects.equals(this.acupNewCustPhoneNum2c, this.acupOldCustPhoneNum2c)) && (java.util.Objects.equals(this.acupNewCustSsnX, this.acupOldCustSsnX)) && (true /* TODO translate: FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-GOVT-ISSUED-ID ))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-GOVT-ISSUED-ID)) */) && (java.util.Objects.equals(this.acupNewCustDobYyyyMmDd, this.acupOldCustDobYyyyMmDd)) && (java.util.Objects.equals(this.acupNewCustEftAccountId, this.acupOldCustEftAccountId)) && (true /* TODO translate: FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-PRI-HOLDER-IND))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-PRI-HOLDER-IND)) */) && (java.util.Objects.equals(this.acupNewCustFicoScoreX, this.acupOldCustFicoScoreX))) {
            // TODO: translate body for: FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-ID-X))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-ID-X)) AND FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-FIRST-NAME))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-FIRST-NAME)) AND FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-MIDDLE-NAME))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-MIDDLE-NAME)) AND FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-LAST-NAME))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-LAST-NAME)) AND FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-ADDR-LINE-1))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-ADDR-LINE-1)) AND FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-ADDR-LINE-2))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-ADDR-LINE-2)) AND FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-ADDR-LINE-3))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-ADDR-LINE-3)) AND FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-ADDR-STATE-CD))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-ADDR-STATE-CD)) AND FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-ADDR-COUNTRY-CD))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-ADDR-COUNTRY-CD)) AND FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-ADDR-ZIP))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-ADDR-ZIP)) AND ACUP-NEW-CUST-PHONE-NUM-1A = ACUP-OLD-CUST-PHONE-NUM-1A AND ACUP-NEW-CUST-PHONE-NUM-1B = ACUP-OLD-CUST-PHONE-NUM-1B AND ACUP-NEW-CUST-PHONE-NUM-1C = ACUP-OLD-CUST-PHONE-NUM-1C AND ACUP-NEW-CUST-PHONE-NUM-2A = ACUP-OLD-CUST-PHONE-NUM-2A AND ACUP-NEW-CUST-PHONE-NUM-2B = ACUP-OLD-CUST-PHONE-NUM-2B AND ACUP-NEW-CUST-PHONE-NUM-2C = ACUP-OLD-CUST-PHONE-NUM-2C AND ACUP-NEW-CUST-SSN-X = ACUP-OLD-CUST-SSN-X AND FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-GOVT-ISSUED-ID ))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-GOVT-ISSUED-ID)) AND ACUP-NEW-CUST-DOB-YYYY-MM-DD = ACUP-OLD-CUST-DOB-YYYY-MM-DD AND ACUP-NEW-CUST-EFT-ACCOUNT-ID = ACUP-OLD-CUST-EFT-ACCOUNT-ID AND FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-NEW-CUST-PRI-HOLDER-IND))= FUNCTION UPPER-CASE ( FUNCTION TRIM (ACUP-OLD-CUST-PRI-HOLDER-IND)) AND ACUP-NEW-CUST-FICO-SCORE-X = ACUP-OLD-CUST-FICO-SCORE-X
        }
    }

    /** 1205-COMPARE-OLD-NEW-EXIT  (uuid:aa343c18-48c5-ef38-70cd-e3c89f29b00f, source lines 4249-4251). */
    public void p1205CompareOldNewExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1210-EDIT-ACCOUNT  (uuid:e5824802-18d7-2c2d-40ef-9367e2906f16, source lines 4255-4290). */
    public void p1210EditAccount() {
        // SET FLG-ACCTFILTER-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.ccAcctId, "\u0000")) {
            // TODO: translate body for: CC-ACCT-ID EQUAL LOW-VALUES OR CC-ACCT-ID EQUAL SPACES
        }
        // MOVE CC-ACCT-ID TO ACUP-NEW-ACCT-ID  -- identifier MOVE; needs PIC-aware type coercion
        if ((!this.ccAcctId.toString().matches("-?\\d+(\\.\\d+)?")) || (java.util.Objects.equals(this.ccAcctIdN, 0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */))) {
            // TODO: translate body for: CC-ACCT-ID IS NOT NUMERIC OR CC-ACCT-ID-N EQUAL ZEROS
        }
    }

    /** 1210-EDIT-ACCOUNT-EXIT  (uuid:ce5ca5d5-b233-acbb-2782-5b9dc2aaf5bc, source lines 4292-4294). */
    public void p1210EditAccountExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1215-EDIT-MANDATORY  (uuid:b215b5ea-3388-449c-f970-17a1daf737a4, source lines 4296-4323). */
    public void p1215EditMandatory() {
        // SET FLG-MANDATORY-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.wsEditAlphanumOnly(1:wsEditAlphanumLength), "\u0000")) {
            // TODO: translate body for: WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) EQUAL LOW-VALUES OR WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) EQUAL SPACES OR FUNCTION LENGTH(FUNCTION TRIM( WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH))) = 0
        }
        // SET FLG-MANDATORY-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** 1215-EDIT-MANDATORY-EXIT  (uuid:c524b982-fcbe-3be6-5339-fa3a466ffe94, source lines 4324-4326). */
    public void p1215EditMandatoryExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1220-EDIT-YESNO  (uuid:92963373-3fa5-2e1e-fb70-e12c0325a1d2, source lines 4328-4365). */
    public void p1220EditYesno() {
        if (java.util.Objects.equals(this.wsEditYesNo, "\u0000")) {
            // TODO: translate body for: WS-EDIT-YES-NO EQUAL LOW-VALUES OR WS-EDIT-YES-NO EQUAL SPACES OR WS-EDIT-YES-NO EQUAL ZEROS
        }
        if (true /* TODO translate: FLG-YES-NO-ISVALID */) {
            // TODO: translate body for: FLG-YES-NO-ISVALID
        }
    }

    /** 1220-EDIT-YESNO-EXIT  (uuid:b5aa7659-3bca-bd34-8074-0de884d609ae, source lines 4366-4368). */
    public void p1220EditYesnoExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1225-EDIT-ALPHA-REQD  (uuid:c95a1263-0b5a-9266-b963-139d06b38b7c, source lines 4370-4422). */
    public void p1225EditAlphaReqd() {
        // SET FLG-ALPHA-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.wsEditAlphanumOnly(1:wsEditAlphanumLength), "\u0000")) {
            // TODO: translate body for: WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) EQUAL LOW-VALUES OR WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) EQUAL SPACES OR FUNCTION LENGTH(FUNCTION TRIM( WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH))) = 0
        }
        // MOVE LIT-ALL-ALPHA-FROM-X TO LIT-ALL-ALPHA-FROM  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [INSPECT]: INSPECT WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) CONVERTING LIT-ALL-ALPHA-FROM TO LIT-ALPHA-SPACES-TO
        if (true /* TODO translate: FUNCTION LENGTH( FUNCTION TRIM( WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) )) = 0 */) {
            // TODO: translate body for: FUNCTION LENGTH( FUNCTION TRIM( WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) )) = 0
        }
        // SET FLG-ALPHA-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** 1225-EDIT-ALPHA-REQD-EXIT  (uuid:ca48e79a-9e4e-aec2-0a7b-b0983842c18d, source lines 4423-4425). */
    public void p1225EditAlphaReqdExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1230-EDIT-ALPHANUM-REQD  (uuid:158f359f-1d33-ae6c-2e5d-1aab58863ba8, source lines 4427-4480). */
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

    /** 1230-EDIT-ALPHANUM-REQD-EXIT  (uuid:69e38621-7966-b101-8df4-ef974877d103, source lines 4481-4483). */
    public void p1230EditAlphanumReqdExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1235-EDIT-ALPHA-OPT  (uuid:88a89724-7623-3ed6-fab1-c7e0e0150e6a, source lines 4484-4528). */
    public void p1235EditAlphaOpt() {
        // SET FLG-ALPHA-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.wsEditAlphanumOnly(1:wsEditAlphanumLength), "\u0000")) {
            // TODO: translate body for: WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) EQUAL LOW-VALUES OR WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) EQUAL SPACES OR FUNCTION LENGTH(FUNCTION TRIM( WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH))) = 0
        }
        // MOVE LIT-ALL-ALPHA-FROM-X TO LIT-ALL-ALPHA-FROM  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [INSPECT]: INSPECT WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) CONVERTING LIT-ALL-ALPHA-FROM TO LIT-ALPHA-SPACES-TO
        if (true /* TODO translate: FUNCTION LENGTH( FUNCTION TRIM( WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) )) = 0 */) {
            // TODO: translate body for: FUNCTION LENGTH( FUNCTION TRIM( WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) )) = 0
        }
        // SET FLG-ALPHA-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** 1235-EDIT-ALPHA-OPT-EXIT  (uuid:94e12572-5aa8-a2e7-6712-78e521872035, source lines 4529-4531). */
    public void p1235EditAlphaOptExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1240-EDIT-ALPHANUM-OPT  (uuid:d89beabf-1656-af25-589e-d02abe0726c1, source lines 4533-4576). */
    public void p1240EditAlphanumOpt() {
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

    /** 1240-EDIT-ALPHANUM-OPT-EXIT  (uuid:de4488ea-3ac8-f6dd-1dc9-33e998c60285, source lines 4577-4579). */
    public void p1240EditAlphanumOptExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1245-EDIT-NUM-REQD  (uuid:dd8f7a9e-a69a-2a76-38c4-6eb88d67cc0b, source lines 4581-4647). */
    public void p1245EditNumReqd() {
        // SET FLG-ALPHNANUM-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.wsEditAlphanumOnly(1:wsEditAlphanumLength), "\u0000")) {
            // TODO: translate body for: WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) EQUAL LOW-VALUES OR WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) EQUAL SPACES OR FUNCTION LENGTH(FUNCTION TRIM( WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH))) = 0
        }
        if (this.wsEditAlphanumOnly(1:wsEditAlphanumLength).toString().matches("-?\\d+(\\.\\d+)?")) {
            // TODO: translate body for: WS-EDIT-ALPHANUM-ONLY(1:WS-EDIT-ALPHANUM-LENGTH) IS NUMERIC
        }
        if (true /* TODO translate: FUNCTION NUMVAL(WS-EDIT-ALPHANUM-ONLY(1: WS-EDIT-ALPHANUM-LENGTH)) = 0 */) {
            // TODO: translate body for: FUNCTION NUMVAL(WS-EDIT-ALPHANUM-ONLY(1: WS-EDIT-ALPHANUM-LENGTH)) = 0
        }
        // SET FLG-ALPHNANUM-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** 1245-EDIT-NUM-REQD-EXIT  (uuid:1090398c-143f-ee09-236e-07ee1f86ad7a, source lines 4648-4650). */
    public void p1245EditNumReqdExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1250-EDIT-SIGNED-9V2  (uuid:4fed438a-8673-194d-09dd-3bf86f7ef0b9, source lines 4652-4691). */
    public void p1250EditSigned9v2() {
        // SET FLG-SIGNED-NUMBER-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.wsEditSignedNumber9v2X, "\u0000")) {
            // TODO: translate body for: WS-EDIT-SIGNED-NUMBER-9V2-X EQUAL LOW-VALUES OR WS-EDIT-SIGNED-NUMBER-9V2-X EQUAL SPACES
        }
        if (true /* TODO translate: FUNCTION TEST-NUMVAL-C(WS-EDIT-SIGNED-NUMBER-9V2-X) = 0 */) {
            // TODO: translate body for: FUNCTION TEST-NUMVAL-C(WS-EDIT-SIGNED-NUMBER-9V2-X) = 0
        }
        // SET FLG-SIGNED-NUMBER-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** 1250-EDIT-SIGNED-9V2-EXIT  (uuid:4489eed4-79e4-1cc5-208d-77a18d365374, source lines 4693-4695). */
    public void p1250EditSigned9v2Exit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1260-EDIT-US-PHONE-NUM  (uuid:22a384fc-0656-a609-5b2e-ab6f594f9d25, source lines 4697-4717). */
    public void p1260EditUsPhoneNum() {
        // SET WS-EDIT-US-PHONE-IS-INVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.(wsEditUsPhoneNuma, "")) {
            // TODO: translate body for: (WS-EDIT-US-PHONE-NUMA EQUAL SPACES OR WS-EDIT-US-PHONE-NUMA EQUAL LOW-VALUES) AND (WS-EDIT-US-PHONE-NUMB EQUAL SPACES OR WS-EDIT-US-PHONE-NUMB EQUAL LOW-VALUES) AND (WS-EDIT-US-PHONE-NUMA EQUAL SPACES OR WS-EDIT-US-PHONE-NUMC EQUAL LOW-VALUES)
        }
    }

    /** EDIT-AREA-CODE  (uuid:befe0596-76cc-f5ad-d69d-33c72c7c9d91, source lines 4718-4787). */
    public void editAreaCode() {
        if (java.util.Objects.equals(this.wsEditUsPhoneNuma, "")) {
            // TODO: translate body for: WS-EDIT-US-PHONE-NUMA EQUAL SPACES OR WS-EDIT-US-PHONE-NUMA EQUAL LOW-VALUES
        }
        if (this.wsEditUsPhoneNuma.toString().matches("-?\\d+(\\.\\d+)?")) {
            // TODO: translate body for: WS-EDIT-US-PHONE-NUMA IS NUMERIC
        }
        if (java.util.Objects.equals(this.wsEditUsPhoneNumaN, 0)) {
            // TODO: translate body for: WS-EDIT-US-PHONE-NUMA-N = 0
        }
        // MOVE FUNCTION TO WS-US-PHONE-AREA-CODE-TO-EDIT  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: VALID-GENERAL-PURP-CODE */) {
            // TODO: translate body for: VALID-GENERAL-PURP-CODE
        }
        // SET FLG-EDIT-US-PHONEA-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** EDIT-US-PHONE-PREFIX  (uuid:59dc6eff-caf5-a3bc-5bcf-c2e87519fa22, source lines 4788-4840). */
    public void editUsPhonePrefix() {
        if (java.util.Objects.equals(this.wsEditUsPhoneNumb, "")) {
            // TODO: translate body for: WS-EDIT-US-PHONE-NUMB EQUAL SPACES OR WS-EDIT-US-PHONE-NUMB EQUAL LOW-VALUES
        }
        if (this.wsEditUsPhoneNumb.toString().matches("-?\\d+(\\.\\d+)?")) {
            // TODO: translate body for: WS-EDIT-US-PHONE-NUMB IS NUMERIC
        }
        if (java.util.Objects.equals(this.wsEditUsPhoneNumbN, 0)) {
            // TODO: translate body for: WS-EDIT-US-PHONE-NUMB-N = 0
        }
        // SET FLG-EDIT-US-PHONEB-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** EDIT-US-PHONE-LINENUM  (uuid:fd263842-39cf-9c7a-9541-9da94c8b79ed, source lines 4842-4894). */
    public void editUsPhoneLinenum() {
        if (java.util.Objects.equals(this.wsEditUsPhoneNumc, "")) {
            // TODO: translate body for: WS-EDIT-US-PHONE-NUMC EQUAL SPACES OR WS-EDIT-US-PHONE-NUMC EQUAL LOW-VALUES
        }
        if (this.wsEditUsPhoneNumc.toString().matches("-?\\d+(\\.\\d+)?")) {
            // TODO: translate body for: WS-EDIT-US-PHONE-NUMC IS NUMERIC
        }
        if (java.util.Objects.equals(this.wsEditUsPhoneNumcN, 0)) {
            // TODO: translate body for: WS-EDIT-US-PHONE-NUMC-N = 0
        }
        // SET FLG-EDIT-US-PHONEC-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** EDIT-US-PHONE-EXIT  (uuid:78328f66-4a5d-796f-c88a-cfa1941f53ec, source lines 4896-4898). */
    public void editUsPhoneExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1260-EDIT-US-PHONE-NUM-EXIT  (uuid:81d8554f-5ce7-423c-02ce-5920f87cdbf3, source lines 4899-4901). */
    public void p1260EditUsPhoneNumExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1265-EDIT-US-SSN  (uuid:d839448c-27b4-edd6-9c16-bff9cad3eaf4, source lines 4903-4960). */
    public void p1265EditUsSsn() {
        this.wsEditVariableName = "SSN: First 3 chars";
        // MOVE ACUP-NEW-CUST-SSN-1 TO WS-EDIT-ALPHANUM-ONLY  -- identifier MOVE; needs PIC-aware type coercion
        this.wsEditAlphanumLength = 3;
        // COBOL [PERFORM]: PERFORM 1245-EDIT-NUM-REQD THRU 1245-EDIT-NUM-REQD-EXIT
        // MOVE WS-EDIT-ALPHANUM-ONLY-FLAGS TO WS-EDIT-US-SSN-PART1-FLGS  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: FLG-EDIT-US-SSN-PART1-ISVALID */) {
            // TODO: translate body for: FLG-EDIT-US-SSN-PART1-ISVALID
        }
    }

    /** 1265-EDIT-US-SSN-EXIT  (uuid:0d8f1cb0-9b8e-6805-a039-904404b650ed, source lines 4961-4963). */
    public void p1265EditUsSsnExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1270-EDIT-US-STATE-CD  (uuid:9a185f21-0a07-b8e7-d7ab-98f1a6f3466e, source lines 4965-4982). */
    public void p1270EditUsStateCd() {
        // MOVE ACUP-NEW-CUST-ADDR-STATE-CD TO US-STATE-CODE-TO-EDIT  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: VALID-US-STATE-CODE */) {
            // TODO: translate body for: VALID-US-STATE-CODE
        }
    }

    /** 1270-EDIT-US-STATE-CD-EXIT  (uuid:fbe9475a-5b9b-ed83-8b96-392d493b3591, source lines 4983-4985). */
    public void p1270EditUsStateCdExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1275-EDIT-FICO-SCORE  (uuid:f7a4d723-7b7d-5fd0-921c-776cdba8c8e4, source lines 4986-5002). */
    public void p1275EditFicoScore() {
        if (true /* TODO translate: FICO-RANGE-IS-VALID */) {
            // TODO: translate body for: FICO-RANGE-IS-VALID
        }
    }

    /** 1275-EDIT-FICO-SCORE-EXIT  (uuid:13a9846f-150d-560b-9e5e-c8f9accbf435, source lines 5003-5005). */
    public void p1275EditFicoScoreExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 1280-EDIT-US-STATE-ZIP-CD  (uuid:062ac044-dcf3-d0b5-a089-4cbd9653fb37, source lines 5008-5029). */
    public void p1280EditUsStateZipCd() {
        // COBOL [STRING]: STRING ACUP-NEW-CUST-ADDR-STATE-CD ACUP-NEW-CUST-ADDR-ZIP(1:2) DELIMITED BY SIZE INTO US-STATE-AND-FIRST-ZIP2
        if (true /* TODO translate: VALID-US-STATE-ZIP-CD2-COMBO */) {
            // TODO: translate body for: VALID-US-STATE-ZIP-CD2-COMBO
        }
    }

    /** 1280-EDIT-US-STATE-ZIP-CD-EXIT  (uuid:f7b6df91-8051-ae70-edb3-5cacee6c3f7c, source lines 5030-5032). */
    public void p1280EditUsStateZipCdExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 2000-DECIDE-ACTION  (uuid:04d182fc-d957-b7e4-a62e-dcd998b98998, source lines 5034-5114). */
    public void p2000DecideAction() {
        // EVALUATE TRUE *> ***************************************************************** *> NO DETAILS SHOWN. *> SO GET THEM AND SETUP DETAIL EDIT SCREEN *> *****************************************************************
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if ((true /* TODO translate: TRUE *> ***************************************************************** *> NO DETAILS SHOWN. *> SO GET THEM */) && (true /* TODO translate: SETUP DETAIL EDIT SCREEN *> ***************************************************************** */)) { /* WHEN branches follow */ }
    }

    /** 2000-DECIDE-ACTION-EXIT  (uuid:e77f57c7-ac1b-1316-c785-ff60c25405b1, source lines 5115-5117). */
    public void p2000DecideActionExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3000-SEND-MAP  (uuid:19937289-1cbf-f2dd-7472-57a3e74ff330, source lines 5121-5134). */
    public void p3000SendMap() {
        // COBOL [PERFORM]: PERFORM 3100-SCREEN-INIT THRU 3100-SCREEN-INIT-EXIT
        // COBOL [PERFORM]: PERFORM 3200-SETUP-SCREEN-VARS THRU 3200-SETUP-SCREEN-VARS-EXIT
        // COBOL [PERFORM]: PERFORM 3250-SETUP-INFOMSG THRU 3250-SETUP-INFOMSG-EXIT
        // COBOL [PERFORM]: PERFORM 3300-SETUP-SCREEN-ATTRS THRU 3300-SETUP-SCREEN-ATTRS-EXIT
        // COBOL [PERFORM]: PERFORM 3390-SETUP-INFOMSG-ATTRS THRU 3390-SETUP-INFOMSG-ATTRS-EXIT
        // COBOL [PERFORM]: PERFORM 3400-SEND-SCREEN THRU 3400-SEND-SCREEN-EXIT
    }

    /** 3000-SEND-MAP-EXIT  (uuid:190669e8-d5dd-e014-0b34-f50c2b9f3997, source lines 5136-5138). */
    public void p3000SendMapExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3100-SCREEN-INIT  (uuid:35f7e155-208b-1d57-19b3-b5cbc3e0096a, source lines 5140-5164). */
    public void p3100ScreenInit() {
        this.cactupao = "\u0000";
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE01 TO TITLE01O OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CCDA-TITLE02 TO TITLE02O OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISTRANID TO TRNNAMEO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISPGM TO PGMNAMEO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE FUNCTION TO WS-CURDATE-DATA  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MONTH TO WS-CURDATE-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-DAY TO WS-CURDATE-DD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-YEAR(3:2) TO WS-CURDATE-YY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURDATE-MM-DD-YY TO CURDATEO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HOURS TO WS-CURTIME-HH  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-MINUTE TO WS-CURTIME-MM  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-SECOND TO WS-CURTIME-SS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-CURTIME-HH-MM-SS TO CURTIMEO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 3100-SCREEN-INIT-EXIT  (uuid:0f998ba6-fd2d-a327-db69-6e8cc26ada90, source lines 5166-5168). */
    public void p3100ScreenInitExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3200-SETUP-SCREEN-VARS  (uuid:0b4f554a-31c6-2d42-0e3e-552764caa236, source lines 5170-5198). */
    public void p3200SetupScreenVars() {
        if (true /* TODO translate: CDEMO-PGM-ENTER */) {
            // TODO: translate body for: CDEMO-PGM-ENTER
        }
    }

    /** 3200-SETUP-SCREEN-VARS-EXIT  (uuid:ae7d8a5a-203d-f91a-5e92-b3acad75ee07, source lines 5199-5201). */
    public void p3200SetupScreenVarsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3201-SHOW-INITIAL-VALUES  (uuid:feb45571-6d12-27a1-d715-a9eb19741c5e, source lines 5203-5253). */
    public void p3201ShowInitialValues() {
        this.acsttuso = "\u0000";
        this.acrdlimo = "\u0000";
        this.account = "\u0000";
        this.limits = "\u0000";
        this.acurbalo = "\u0000";
        this.acshlimo = "\u0000";
        this.acrcycro = "\u0000";
        this.acrcydbo = "\u0000";
        this.account = "\u0000";
        this.dates = "\u0000";
        this.opnyearo = "\u0000";
        this.opnmono = "\u0000";
        this.opndayo = "\u0000";
        this.expyearo = "\u0000";
        this.expmono = "\u0000";
        this.expdayo = "\u0000";
        this.risyearo = "\u0000";
        this.rismono = "\u0000";
        this.risdayo = "\u0000";
        this.aaddgrpo = "\u0000";
        this.customer = "\u0000";
        this.data = "\u0000";
        this.acstnumo = "\u0000";
        this.actssn1o = "\u0000";
        this.actssn2o = "\u0000";
        this.actssn3o = "\u0000";
        this.acstfcoo = "\u0000";
        this.dobyearo = "\u0000";
        this.dobmono = "\u0000";
        this.dobdayo = "\u0000";
        this.acsfnamo = "\u0000";
        this.acsmnamo = "\u0000";
        this.acslnamo = "\u0000";
        this.customer = "\u0000";
        this.address = "\u0000";
        this.and = "\u0000";
        this.contact = "\u0000";
        this.info = "\u0000";
        this.acsadl1o = "\u0000";
        this.acsadl2o = "\u0000";
        this.acscityo = "\u0000";
        this.acsstteo = "\u0000";
        this.acszipco = "\u0000";
        this.acsctryo = "\u0000";
        this.acsph1ao = "\u0000";
        this.acsph1bo = "\u0000";
        this.acsph1co = "\u0000";
        this.acsph2ao = "\u0000";
        this.acsph2bo = "\u0000";
        this.acsph2co = "\u0000";
        this.customer = "\u0000";
        this.other = "\u0000";
        this.good = "\u0000";
        this.stuff = "\u0000";
        this.acsgovto = "\u0000";
        this.acseftco = "\u0000";
        this.acspflgo = "\u0000";
    }

    /** 3201-SHOW-INITIAL-VALUES-EXIT  (uuid:7247a378-8025-f181-a4fc-79df10da6bff, source lines 5255-5257). */
    public void p3201ShowInitialValuesExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3202-SHOW-ORIGINAL-VALUES  (uuid:915ffcd6-98f0-d5af-7b9e-e7d9fb07ea09, source lines 5259-5337). */
    public void p3202ShowOriginalValues() {
        this.wsNonKeyFlags = "\u0000";
        // SET PROMPT-FOR-CHANGES TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if ((true /* TODO translate: FOUND-ACCT-IN-MASTER */) || (true /* TODO translate: FOUND-CUST-IN-MASTER */)) {
            // TODO: translate body for: FOUND-ACCT-IN-MASTER OR FOUND-CUST-IN-MASTER
        }
        if (true /* TODO translate: FOUND-CUST-IN-MASTER */) {
            // TODO: translate body for: FOUND-CUST-IN-MASTER
        }
    }

    /** 3202-SHOW-ORIGINAL-VALUES-EXIT  (uuid:1c189806-a03b-6e1a-df45-9f435ad51061, source lines 5339-5341). */
    public void p3202ShowOriginalValuesExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3203-SHOW-UPDATED-VALUES  (uuid:76e172c0-9b7e-6ae7-2fe7-ec412d5ab13c, source lines 5342-5421). */
    public void p3203ShowUpdatedValues() {
        // MOVE ACUP-NEW-ACTIVE-STATUS TO ACSTTUSO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        if (true /* TODO translate: FLG-CRED-LIMIT-ISVALID */) {
            // TODO: translate body for: FLG-CRED-LIMIT-ISVALID
        }
        if (true /* TODO translate: FLG-CASH-CREDIT-LIMIT-ISVALID */) {
            // TODO: translate body for: FLG-CASH-CREDIT-LIMIT-ISVALID
        }
        if (true /* TODO translate: FLG-CURR-BAL-ISVALID */) {
            // TODO: translate body for: FLG-CURR-BAL-ISVALID
        }
        if (true /* TODO translate: FLG-CURR-CYC-CREDIT-ISVALID */) {
            // TODO: translate body for: FLG-CURR-CYC-CREDIT-ISVALID
        }
        if (true /* TODO translate: FLG-CURR-CYC-DEBIT-ISVALID */) {
            // TODO: translate body for: FLG-CURR-CYC-DEBIT-ISVALID
        }
        // MOVE ACUP-NEW-OPEN-YEAR TO OPNYEARO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-OPEN-MON TO OPNMONO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-OPEN-DAY TO OPNDAYO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-EXP-YEAR TO EXPYEARO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-EXP-MON TO EXPMONO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-EXP-DAY TO EXPDAYO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-REISSUE-YEAR TO RISYEARO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-REISSUE-MON TO RISMONO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-REISSUE-DAY TO RISDAYO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-GROUP-ID TO AADDGRPO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-ID-X TO ACSTNUMO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-SSN-1 TO ACTSSN1O OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-SSN-2 TO ACTSSN2O OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-SSN-3 TO ACTSSN3O OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-FICO-SCORE-X TO ACSTFCOO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-DOB-YEAR TO DOBYEARO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-DOB-MON TO DOBMONO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-DOB-DAY TO DOBDAYO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-FIRST-NAME TO ACSFNAMO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-MIDDLE-NAME TO ACSMNAMO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-LAST-NAME TO ACSLNAMO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-ADDR-LINE-1 TO ACSADL1O OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-ADDR-LINE-2 TO ACSADL2O OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-ADDR-LINE-3 TO ACSCITYO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-ADDR-STATE-CD TO ACSSTTEO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-ADDR-ZIP TO ACSZIPCO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-ADDR-COUNTRY-CD TO ACSCTRYO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-PHONE-NUM-1A TO ACSPH1AO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-PHONE-NUM-1B TO ACSPH1BO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-PHONE-NUM-1C TO ACSPH1CO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-PHONE-NUM-2A TO ACSPH2AO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-PHONE-NUM-2B TO ACSPH2BO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-PHONE-NUM-2C TO ACSPH2CO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-GOVT-ISSUED-ID TO ACSGOVTO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-EFT-ACCOUNT-ID TO ACSEFTCO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-PRI-HOLDER-IND TO ACSPFLGO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 3203-SHOW-UPDATED-VALUES-EXIT  (uuid:f67794b6-4fee-351e-b34a-438e76a0f286, source lines 5423-5425). */
    public void p3203ShowUpdatedValuesExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3250-SETUP-INFOMSG  (uuid:bea69088-c123-a70f-7166-351de3ac1e3a, source lines 5427-5454). */
    public void p3250SetupInfomsg() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
        // MOVE WS-INFO-MSG TO INFOMSGO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE WS-RETURN-MSG TO ERRMSGO OF CACTUPAO  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 3250-SETUP-INFOMSG-EXIT  (uuid:7233415a-71e3-d91d-e468-ba5d64c434d4, source lines 5455-5457). */
    public void p3250SetupInfomsgExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3300-SETUP-SCREEN-ATTRS  (uuid:96558428-9a7d-0564-4cd8-5f95233a143b, source lines 5458-6961). */
    public void p3300SetupScreenAttrs() {
        // COBOL [PERFORM]: PERFORM 3310-PROTECT-ALL-ATTRS THRU 3310-PROTECT-ALL-ATTRS-EXIT
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
        if ((true /* TODO translate: ACUP-DETAILS-NOT-FETCHED */) || (true /* TODO translate: FLG-ACCTFILTER-BLANK */) || (true /* TODO translate: FLG-ACCTFILTER-NOT-OK */)) {
            // TODO: translate body for: ACUP-DETAILS-NOT-FETCHED OR FLG-ACCTFILTER-BLANK OR FLG-ACCTFILTER-NOT-OK
        }
        if (((true /* TODO translate: (FLG-ACCT-STATUS-NOT-OK */) || (true /* TODO translate: FLG-ACCT-STATUS-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-ACCT-STATUS-NOT-OK OR FLG-ACCT-STATUS-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-OPEN-YEAR-NOT-OK */) || (true /* TODO translate: FLG-OPEN-YEAR-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-OPEN-YEAR-NOT-OK OR FLG-OPEN-YEAR-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-OPEN-MONTH-NOT-OK */) || (true /* TODO translate: FLG-OPEN-MONTH-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-OPEN-MONTH-NOT-OK OR FLG-OPEN-MONTH-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-OPEN-DAY-NOT-OK */) || (true /* TODO translate: FLG-OPEN-DAY-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-OPEN-DAY-NOT-OK OR FLG-OPEN-DAY-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-CRED-LIMIT-NOT-OK */) || (true /* TODO translate: FLG-CRED-LIMIT-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-CRED-LIMIT-NOT-OK OR FLG-CRED-LIMIT-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-EXPIRY-YEAR-NOT-OK */) || (true /* TODO translate: FLG-EXPIRY-YEAR-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-EXPIRY-YEAR-NOT-OK OR FLG-EXPIRY-YEAR-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-EXPIRY-MONTH-NOT-OK */) || (true /* TODO translate: FLG-EXPIRY-MONTH-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-EXPIRY-MONTH-NOT-OK OR FLG-EXPIRY-MONTH-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-EXPIRY-DAY-NOT-OK */) || (true /* TODO translate: FLG-EXPIRY-DAY-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-EXPIRY-DAY-NOT-OK OR FLG-EXPIRY-DAY-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-CASH-CREDIT-LIMIT-NOT-OK */) || (true /* TODO translate: FLG-CASH-CREDIT-LIMIT-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-CASH-CREDIT-LIMIT-NOT-OK OR FLG-CASH-CREDIT-LIMIT-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-REISSUE-YEAR-NOT-OK */) || (true /* TODO translate: FLG-REISSUE-YEAR-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-REISSUE-YEAR-NOT-OK OR FLG-REISSUE-YEAR-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-REISSUE-MONTH-NOT-OK */) || (true /* TODO translate: FLG-REISSUE-MONTH-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-REISSUE-MONTH-NOT-OK OR FLG-REISSUE-MONTH-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-REISSUE-DAY-NOT-OK */) || (true /* TODO translate: FLG-REISSUE-DAY-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-REISSUE-DAY-NOT-OK OR FLG-REISSUE-DAY-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-CURR-BAL-NOT-OK */) || (true /* TODO translate: FLG-CURR-BAL-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-CURR-BAL-NOT-OK OR FLG-CURR-BAL-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-CURR-CYC-CREDIT-NOT-OK */) || (true /* TODO translate: FLG-CURR-CYC-CREDIT-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-CURR-CYC-CREDIT-NOT-OK OR FLG-CURR-CYC-CREDIT-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-CURR-CYC-DEBIT-NOT-OK */) || (true /* TODO translate: FLG-CURR-CYC-DEBIT-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-CURR-CYC-DEBIT-NOT-OK OR FLG-CURR-CYC-DEBIT-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-EDIT-US-SSN-PART1-NOT-OK */) || (true /* TODO translate: FLG-EDIT-US-SSN-PART1-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-EDIT-US-SSN-PART1-NOT-OK OR FLG-EDIT-US-SSN-PART1-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-EDIT-US-SSN-PART2-NOT-OK */) || (true /* TODO translate: FLG-EDIT-US-SSN-PART2-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-EDIT-US-SSN-PART2-NOT-OK OR FLG-EDIT-US-SSN-PART2-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-EDIT-US-SSN-PART3-NOT-OK */) || (true /* TODO translate: FLG-EDIT-US-SSN-PART3-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-EDIT-US-SSN-PART3-NOT-OK OR FLG-EDIT-US-SSN-PART3-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-DT-OF-BIRTH-YEAR-NOT-OK */) || (true /* TODO translate: FLG-DT-OF-BIRTH-YEAR-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-DT-OF-BIRTH-YEAR-NOT-OK OR FLG-DT-OF-BIRTH-YEAR-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-DT-OF-BIRTH-MONTH-NOT-OK */) || (true /* TODO translate: FLG-DT-OF-BIRTH-MONTH-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-DT-OF-BIRTH-MONTH-NOT-OK OR FLG-DT-OF-BIRTH-MONTH-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-DT-OF-BIRTH-DAY-NOT-OK */) || (true /* TODO translate: FLG-DT-OF-BIRTH-DAY-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-DT-OF-BIRTH-DAY-NOT-OK OR FLG-DT-OF-BIRTH-DAY-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-FICO-SCORE-NOT-OK */) || (true /* TODO translate: FLG-FICO-SCORE-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-FICO-SCORE-NOT-OK OR FLG-FICO-SCORE-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-FIRST-NAME-NOT-OK */) || (true /* TODO translate: FLG-FIRST-NAME-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-FIRST-NAME-NOT-OK OR FLG-FIRST-NAME-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-MIDDLE-NAME-NOT-OK */) || (true /* TODO translate: FLG-MIDDLE-NAME-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-MIDDLE-NAME-NOT-OK OR FLG-MIDDLE-NAME-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-LAST-NAME-NOT-OK */) || (true /* TODO translate: FLG-LAST-NAME-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-LAST-NAME-NOT-OK OR FLG-LAST-NAME-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-ADDRESS-LINE-1-NOT-OK */) || (true /* TODO translate: FLG-ADDRESS-LINE-1-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-ADDRESS-LINE-1-NOT-OK OR FLG-ADDRESS-LINE-1-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-STATE-NOT-OK */) || (true /* TODO translate: FLG-STATE-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-STATE-NOT-OK OR FLG-STATE-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-ADDRESS-LINE-2-NOT-OK */) || (true /* TODO translate: FLG-ADDRESS-LINE-2-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-ADDRESS-LINE-2-NOT-OK OR FLG-ADDRESS-LINE-2-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-ZIPCODE-NOT-OK */) || (true /* TODO translate: FLG-ZIPCODE-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-ZIPCODE-NOT-OK OR FLG-ZIPCODE-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-CITY-NOT-OK */) || (true /* TODO translate: FLG-CITY-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-CITY-NOT-OK OR FLG-CITY-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-COUNTRY-NOT-OK */) || (true /* TODO translate: FLG-COUNTRY-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-COUNTRY-NOT-OK OR FLG-COUNTRY-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-PHONE-NUM-1A-NOT-OK */) || (true /* TODO translate: FLG-PHONE-NUM-1A-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-PHONE-NUM-1A-NOT-OK OR FLG-PHONE-NUM-1A-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-PHONE-NUM-1B-NOT-OK */) || (true /* TODO translate: FLG-PHONE-NUM-1B-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-PHONE-NUM-1B-NOT-OK OR FLG-PHONE-NUM-1B-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-PHONE-NUM-1C-NOT-OK */) || (true /* TODO translate: FLG-PHONE-NUM-1C-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-PHONE-NUM-1C-NOT-OK OR FLG-PHONE-NUM-1C-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-PHONE-NUM-2A-NOT-OK */) || (true /* TODO translate: FLG-PHONE-NUM-2A-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-PHONE-NUM-2A-NOT-OK OR FLG-PHONE-NUM-2A-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-PHONE-NUM-2B-NOT-OK */) || (true /* TODO translate: FLG-PHONE-NUM-2B-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-PHONE-NUM-2B-NOT-OK OR FLG-PHONE-NUM-2B-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-PHONE-NUM-2C-NOT-OK */) || (true /* TODO translate: FLG-PHONE-NUM-2C-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-PHONE-NUM-2C-NOT-OK OR FLG-PHONE-NUM-2C-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-PRI-CARDHOLDER-NOT-OK */) || (true /* TODO translate: FLG-PRI-CARDHOLDER-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-PRI-CARDHOLDER-NOT-OK OR FLG-PRI-CARDHOLDER-BLANK) AND CDEMO-PGM-REENTER
        }
        if (((true /* TODO translate: (FLG-EFT-ACCOUNT-ID-NOT-OK */) || (true /* TODO translate: FLG-EFT-ACCOUNT-ID-BLANK) */)) && (true /* TODO translate: CDEMO-PGM-REENTER */)) {
            // TODO: translate body for: (FLG-EFT-ACCOUNT-ID-NOT-OK OR FLG-EFT-ACCOUNT-ID-BLANK) AND CDEMO-PGM-REENTER
        }
    }

    /** 3300-SETUP-SCREEN-ATTRS-EXIT  (uuid:ae4705b2-de5e-1438-f306-d357d5bde705, source lines 6962-6964). */
    public void p3300SetupScreenAttrsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3310-PROTECT-ALL-ATTRS  (uuid:a34982b7-851d-3d14-14d6-c3dc8d843dc1, source lines 6966-7020). */
    public void p3310ProtectAllAttrs() {
        // MOVE DFHBMPRF TO ACCTSIDA OF CACTUPAI, ACSTTUSA OF CACTUPAI, Account, Limits, ACRDLIMA OF CACTUPAI, ACSHLIMA OF CACTUPAI, ACURBALA OF CACTUPAI, ACRCYCRA OF CACTUPAI, ACRCYDBA OF CACTUPAI, Account, dates, OPNYEARA OF CACTUPAI, OPNMONA OF CACTUPAI, OPNDAYA OF CACTUPAI, EXPYEARA OF CACTUPAI, EXPMONA OF CACTUPAI, EXPDAYA OF CACTUPAI, RISYEARA OF CACTUPAI, RISMONA OF CACTUPAI, RISDAYA OF CACTUPAI, AADDGRPA OF CACTUPAI, Customer, data, ACSTNUMA OF CACTUPAI, ACTSSN1A OF CACTUPAI, ACTSSN2A OF CACTUPAI, ACTSSN3A OF CACTUPAI, ACSTFCOA OF CACTUPAI, Date of Birth, DOBYEARA OF CACTUPAI, DOBMONA OF CACTUPAI, DOBDAYA OF CACTUPAI, ACSFNAMA OF CACTUPAI, ACSMNAMA OF CACTUPAI, ACSLNAMA OF CACTUPAI, Address, ACSADL1A OF CACTUPAI, ACSADL2A OF CACTUPAI, ACSCITYA OF CACTUPAI, ACSSTTEA OF CACTUPAI, ACSZIPCA OF CACTUPAI, ACSCTRYA OF CACTUPAI, ACSPH1AA OF CACTUPAI, ACSPH1BA OF CACTUPAI, ACSPH1CA OF CACTUPAI, ACSPH2AA OF CACTUPAI, ACSPH2BA OF CACTUPAI, ACSPH2CA OF CACTUPAI, ACSGOVTA OF CACTUPAI, ACSEFTCA OF CACTUPAI, ACSPFLGA OF CACTUPAI, INFOMSGA OF CACTUPAI  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 3310-PROTECT-ALL-ATTRS-EXIT  (uuid:be78f607-d9ca-bfc3-23e1-1248d729dc77, source lines 7021-7023). */
    public void p3310ProtectAllAttrsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3320-UNPROTECT-FEW-ATTRS  (uuid:80a8e62a-22c2-83f6-51f2-ce1d60241822, source lines 7025-7086). */
    public void p3320UnprotectFewAttrs() {
        // MOVE DFHBMFSE TO ACSTTUSA OF CACTUPAI, Account, Limits, ACRDLIMA OF CACTUPAI, ACSHLIMA OF CACTUPAI, ACURBALA OF CACTUPAI, ACRCYCRA OF CACTUPAI, ACRCYDBA OF CACTUPAI, Account, dates, Open, Date, OPNYEARA OF CACTUPAI, OPNMONA OF CACTUPAI, OPNDAYA OF CACTUPAI, Expiry, date, EXPYEARA OF CACTUPAI, EXPMONA OF CACTUPAI, EXPDAYA OF CACTUPAI, Reissue, date, RISYEARA OF CACTUPAI, RISMONA OF CACTUPAI, RISDAYA OF CACTUPAI, Date of Birth, DOBYEARA OF CACTUPAI, DOBMONA OF CACTUPAI, DOBDAYA OF CACTUPAI, AADDGRPA OF CACTUPAI  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE DFHBMPRF TO ACSTNUMA OF CACTUPAI  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE DFHBMFSE TO ACTSSN1A OF CACTUPAI, ACTSSN2A OF CACTUPAI, ACTSSN3A OF CACTUPAI, ACSTFCOA OF CACTUPAI, ACSFNAMA OF CACTUPAI, ACSMNAMA OF CACTUPAI, ACSLNAMA OF CACTUPAI, Address, ACSADL1A OF CACTUPAI, ACSADL2A OF CACTUPAI, ACSCITYA OF CACTUPAI, ACSSTTEA OF CACTUPAI, ACSZIPCA OF CACTUPAI  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE DFHBMPRF TO ACSCTRYA OF CACTUPAI  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE DFHBMFSE TO ACSPH1AA OF CACTUPAI, ACSPH1BA OF CACTUPAI, ACSPH1CA OF CACTUPAI  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE DFHBMFSE TO ACSPH2AA OF CACTUPAI, ACSPH2BA OF CACTUPAI, ACSPH2CA OF CACTUPAI, ACSGOVTA OF CACTUPAI, ACSEFTCA OF CACTUPAI, ACSPFLGA OF CACTUPAI  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE DFHBMPRF TO INFOMSGA OF CACTUPAI  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 3320-UNPROTECT-FEW-ATTRS-EXIT  (uuid:efd14689-4b46-8aec-b310-802f778cf104, source lines 7087-7089). */
    public void p3320UnprotectFewAttrsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3390-SETUP-INFOMSG-ATTRS  (uuid:26e00852-87d4-6a09-b70d-aba8535ceb56, source lines 7091-7108). */
    public void p3390SetupInfomsgAttrs() {
        if (true /* TODO translate: WS-NO-INFO-MESSAGE */) {
            // TODO: translate body for: WS-NO-INFO-MESSAGE
        }
        if ((true /* TODO translate: ACUP-CHANGES-MADE */) && (true /* TODO translate: NOT ACUP-CHANGES-OKAYED-AND-DONE */)) {
            // TODO: translate body for: ACUP-CHANGES-MADE AND NOT ACUP-CHANGES-OKAYED-AND-DONE
        }
        if (true /* TODO translate: PROMPT-FOR-CONFIRMATION */) {
            // TODO: translate body for: PROMPT-FOR-CONFIRMATION
        }
    }

    /** 3390-SETUP-INFOMSG-ATTRS-EXIT  (uuid:e3ac5725-21a1-19cd-bc12-0183cca419f3, source lines 7109-7111). */
    public void p3390SetupInfomsgAttrsExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 3400-SEND-SCREEN  (uuid:6daf2633-fa32-eb86-11a8-ea68eab6934e, source lines 7114-7127). */
    public void p3400SendScreen() {
        // MOVE LIT-THISMAPSET TO CCARD-NEXT-MAPSET  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE LIT-THISMAP TO CCARD-NEXT-MAP  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 3400-SEND-SCREEN-EXIT  (uuid:33b1fffd-e969-a330-d748-ec28934cb3b7, source lines 7128-7130). */
    public void p3400SendScreenExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9000-READ-ACCT  (uuid:d127c952-af34-977a-2179-fcfc84a3b962, source lines 7133-7169). */
    public void p9000ReadAcct() {
        // INITIALIZE acupOldDetails: reset to PIC defaults
        this.acupOldDetails = null;  // TODO: set to type-appropriate zero/spaces
        // SET WS-NO-INFO-MESSAGE TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        // MOVE CC-ACCT-ID TO ACUP-OLD-ACCT-ID, WS-CARD-RID-ACCT-ID  -- identifier MOVE; needs PIC-aware type coercion
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
        // COBOL [PERFORM]: PERFORM 9500-STORE-FETCHED-DATA THRU 9500-STORE-FETCHED-DATA-EXIT
    }

    /** 9000-READ-ACCT-EXIT  (uuid:d0c49114-e383-b9fd-7d24-b0ab3d6b3732, source lines 7172-7174). */
    public void p9000ReadAcctExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9200-GETCARDXREF-BYACCT  (uuid:7e426e9f-0a9a-0f98-69f3-62b1b3c1e19c, source lines 7175-7222). */
    public void p9200GetcardxrefByacct() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** 9200-GETCARDXREF-BYACCT-EXIT  (uuid:7fc1458b-d931-6407-cc69-854d5ff4916e, source lines 7223-7225). */
    public void p9200GetcardxrefByacctExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9300-GETACCTDATA-BYACCT  (uuid:4b3188d0-618f-cd12-3fa1-1692c8bd35c0, source lines 7226-7272). */
    public void p9300GetacctdataByacct() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** 9300-GETACCTDATA-BYACCT-EXIT  (uuid:51fbda2c-5187-29bc-da32-af697021e35b, source lines 7273-7275). */
    public void p9300GetacctdataByacctExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9400-GETCUSTDATA-BYCUST  (uuid:0757be67-fd57-cca8-34ce-da7ad90a0c35, source lines 7277-7321). */
    public void p9400GetcustdataBycust() {
        // EVALUATE WS-RESP-CD
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* TODO translate: WS-RESP-CD */) { /* WHEN branches follow */ }
    }

    /** 9400-GETCUSTDATA-BYCUST-EXIT  (uuid:fb16c0c2-2d4d-3a6c-df16-80c8075f5011, source lines 7322-7324). */
    public void p9400GetcustdataBycustExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9500-STORE-FETCHED-DATA  (uuid:3746e6c3-88c5-6100-2dbd-5cf3fb62fa38, source lines 7326-7409). */
    public void p9500StoreFetchedData() {
        // MOVE ACCT-ID TO CDEMO-ACCT-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-ID TO CDEMO-CUST-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-FIRST-NAME TO CDEMO-CUST-FNAME  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-MIDDLE-NAME TO CDEMO-CUST-MNAME  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-LAST-NAME TO CDEMO-CUST-LNAME  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-ACTIVE-STATUS TO CDEMO-ACCT-STATUS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE XREF-CARD-NUM TO CDEMO-CARD-NUM  -- identifier MOVE; needs PIC-aware type coercion
        // INITIALIZE acupOldDetails: reset to PIC defaults
        this.acupOldDetails = null;  // TODO: set to type-appropriate zero/spaces
        // MOVE ACCT-ID TO ACUP-OLD-ACCT-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-ACTIVE-STATUS TO ACUP-OLD-ACTIVE-STATUS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-CURR-BAL TO ACUP-OLD-CURR-BAL-N  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-CREDIT-LIMIT TO ACUP-OLD-CREDIT-LIMIT-N  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-CASH-CREDIT-LIMIT TO ACUP-OLD-CASH-CREDIT-LIMIT-N  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-CURR-CYC-CREDIT TO ACUP-OLD-CURR-CYC-CREDIT-N  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-CURR-CYC-DEBIT TO ACUP-OLD-CURR-CYC-DEBIT-N  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-OPEN-DATE(1:4) TO ACUP-OLD-OPEN-YEAR  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-OPEN-DATE(6:2) TO ACUP-OLD-OPEN-MON  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-OPEN-DATE(9:2) TO ACUP-OLD-OPEN-DAY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-EXPIRAION-DATE(1:4) TO ACUP-OLD-EXP-YEAR  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-EXPIRAION-DATE(6:2) TO ACUP-OLD-EXP-MON  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-EXPIRAION-DATE(9:2) TO ACUP-OLD-EXP-DAY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-REISSUE-DATE(1:4) TO ACUP-OLD-REISSUE-YEAR  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-REISSUE-DATE(6:2) TO ACUP-OLD-REISSUE-MON  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-REISSUE-DATE(9:2) TO ACUP-OLD-REISSUE-DAY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACCT-GROUP-ID TO ACUP-OLD-GROUP-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-ID TO ACUP-OLD-CUST-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-SSN TO ACUP-OLD-CUST-SSN  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-DOB-YYYY-MM-DD(1:4) TO ACUP-OLD-CUST-DOB-YEAR  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-DOB-YYYY-MM-DD(6:2) TO ACUP-OLD-CUST-DOB-MON  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-DOB-YYYY-MM-DD(9:2) TO ACUP-OLD-CUST-DOB-DAY  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-FICO-CREDIT-SCORE TO ACUP-OLD-CUST-FICO-SCORE  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-FIRST-NAME TO ACUP-OLD-CUST-FIRST-NAME  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-MIDDLE-NAME TO ACUP-OLD-CUST-MIDDLE-NAME  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-LAST-NAME TO ACUP-OLD-CUST-LAST-NAME  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-ADDR-LINE-1 TO ACUP-OLD-CUST-ADDR-LINE-1  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-ADDR-LINE-2 TO ACUP-OLD-CUST-ADDR-LINE-2  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-ADDR-LINE-3 TO ACUP-OLD-CUST-ADDR-LINE-3  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-ADDR-STATE-CD TO ACUP-OLD-CUST-ADDR-STATE-CD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-ADDR-COUNTRY-CD TO ACUP-OLD-CUST-ADDR-COUNTRY-CD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-ADDR-ZIP TO ACUP-OLD-CUST-ADDR-ZIP  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-PHONE-NUM-1 TO ACUP-OLD-CUST-PHONE-NUM-1  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-PHONE-NUM-2 TO ACUP-OLD-CUST-PHONE-NUM-2  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-GOVT-ISSUED-ID TO ACUP-OLD-CUST-GOVT-ISSUED-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-EFT-ACCOUNT-ID TO ACUP-OLD-CUST-EFT-ACCOUNT-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE CUST-PRI-CARD-HOLDER-IND TO ACUP-OLD-CUST-PRI-HOLDER-IND  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** 9500-STORE-FETCHED-DATA-EXIT  (uuid:f787aafc-89d4-1eb1-b27f-58fc5227c7a1, source lines 7410-7412). */
    public void p9500StoreFetchedDataExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9600-WRITE-PROCESSING  (uuid:e4692ea2-7ba6-ece3-2267-a8f7ee18af69, source lines 7413-7629). */
    public void p9600WriteProcessing() {
        // MOVE CC-ACCT-ID TO WS-CARD-RID-ACCT-ID  -- identifier MOVE; needs PIC-aware type coercion
        if (java.util.Objects.equals(this.wsRespCd, this.dfhresp(normal))) {
            // TODO: translate body for: WS-RESP-CD EQUAL TO DFHRESP(NORMAL)
        }
        // MOVE CDEMO-CUST-ID TO WS-CARD-RID-CUST-ID  -- identifier MOVE; needs PIC-aware type coercion
        if (java.util.Objects.equals(this.wsRespCd, this.dfhresp(normal))) {
            // TODO: translate body for: WS-RESP-CD EQUAL TO DFHRESP(NORMAL)
        }
        // COBOL [PERFORM]: PERFORM 9700-CHECK-CHANGE-IN-REC THRU 9700-CHECK-CHANGE-IN-REC-EXIT
        if (true /* TODO translate: DATA-WAS-CHANGED-BEFORE-UPDATE */) {
            // TODO: translate body for: DATA-WAS-CHANGED-BEFORE-UPDATE
        }
        // INITIALIZE acctUpdateRecord: reset to PIC defaults
        this.acctUpdateRecord = null;  // TODO: set to type-appropriate zero/spaces
        // MOVE ACUP-NEW-ACCT-ID TO ACCT-UPDATE-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-ACTIVE-STATUS TO ACCT-UPDATE-ACTIVE-STATUS  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CURR-BAL-N TO ACCT-UPDATE-CURR-BAL  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CREDIT-LIMIT-N TO ACCT-UPDATE-CREDIT-LIMIT  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CASH-CREDIT-LIMIT-N TO ACCT-UPDATE-CASH-CREDIT-LIMIT  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CURR-CYC-CREDIT-N TO ACCT-UPDATE-CURR-CYC-CREDIT  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CURR-CYC-DEBIT-N TO ACCT-UPDATE-CURR-CYC-DEBIT  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [STRING]: STRING ACUP-NEW-OPEN-YEAR '-' ACUP-NEW-OPEN-MON '-' ACUP-NEW-OPEN-DAY DELIMITED BY SIZE INTO ACCT-UPDATE-OPEN-DATE
        // COBOL [STRING]: STRING ACUP-NEW-EXP-YEAR '-' ACUP-NEW-EXP-MON '-' ACUP-NEW-EXP-DAY DELIMITED BY SIZE INTO ACCT-UPDATE-EXPIRAION-DATE
        // MOVE ACCT-REISSUE-DATE TO ACCT-UPDATE-REISSUE-DATE  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [STRING]: STRING ACUP-NEW-REISSUE-YEAR '-' ACUP-NEW-REISSUE-MON '-' ACUP-NEW-REISSUE-DAY DELIMITED BY SIZE INTO ACCT-UPDATE-REISSUE-DATE
        // MOVE ACUP-NEW-GROUP-ID TO ACCT-UPDATE-GROUP-ID  -- identifier MOVE; needs PIC-aware type coercion
        // INITIALIZE custUpdateRecord: reset to PIC defaults
        this.custUpdateRecord = null;  // TODO: set to type-appropriate zero/spaces
        // MOVE ACUP-NEW-CUST-ID TO CUST-UPDATE-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-FIRST-NAME TO CUST-UPDATE-FIRST-NAME  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-MIDDLE-NAME TO CUST-UPDATE-MIDDLE-NAME  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-LAST-NAME TO CUST-UPDATE-LAST-NAME  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-ADDR-LINE-1 TO CUST-UPDATE-ADDR-LINE-1  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-ADDR-LINE-2 TO CUST-UPDATE-ADDR-LINE-2  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-ADDR-LINE-3 TO CUST-UPDATE-ADDR-LINE-3  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-ADDR-STATE-CD TO CUST-UPDATE-ADDR-STATE-CD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-ADDR-COUNTRY-CD TO CUST-UPDATE-ADDR-COUNTRY-CD  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-ADDR-ZIP TO CUST-UPDATE-ADDR-ZIP  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [STRING]: STRING '(', ACUP-NEW-CUST-PHONE-NUM-1A, ')', ACUP-NEW-CUST-PHONE-NUM-1B, '-', ACUP-NEW-CUST-PHONE-NUM-1C DELIMITED BY SIZE INTO CUST-UPDATE-PHONE-NUM-1
        // COBOL [STRING]: STRING '(', ACUP-NEW-CUST-PHONE-NUM-2A, ')', ACUP-NEW-CUST-PHONE-NUM-2B, '-', ACUP-NEW-CUST-PHONE-NUM-2C DELIMITED BY SIZE INTO CUST-UPDATE-PHONE-NUM-2
        // MOVE ACUP-NEW-CUST-SSN TO CUST-UPDATE-SSN  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-GOVT-ISSUED-ID TO CUST-UPDATE-GOVT-ISSUED-ID  -- identifier MOVE; needs PIC-aware type coercion
        // COBOL [STRING]: STRING ACUP-NEW-CUST-DOB-YEAR '-' ACUP-NEW-CUST-DOB-MON '-' ACUP-NEW-CUST-DOB-DAY DELIMITED BY SIZE INTO CUST-UPDATE-DOB-YYYY-MM-DD
        // MOVE ACUP-NEW-CUST-EFT-ACCOUNT-ID TO CUST-UPDATE-EFT-ACCOUNT-ID  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-PRI-HOLDER-IND TO CUST-UPDATE-PRI-CARD-IND  -- identifier MOVE; needs PIC-aware type coercion
        // MOVE ACUP-NEW-CUST-FICO-SCORE TO CUST-UPDATE-FICO-CREDIT-SCORE  -- identifier MOVE; needs PIC-aware type coercion
        if (java.util.Objects.equals(this.wsRespCd, this.dfhresp(normal))) {
            // TODO: translate body for: WS-RESP-CD EQUAL TO DFHRESP(NORMAL)
        }
        if (java.util.Objects.equals(this.wsRespCd, this.dfhresp(normal))) {
            // TODO: translate body for: WS-RESP-CD EQUAL TO DFHRESP(NORMAL)
        }
    }

    /** 9600-WRITE-PROCESSING-EXIT  (uuid:40399dac-778b-7e75-65e9-dfeb328e7779, source lines 7630-7632). */
    public void p9600WriteProcessingExit() {
        // COBOL [EXIT]: EXIT
    }

    /** 9700-CHECK-CHANGE-IN-REC  (uuid:4b9f8cf8-bd40-8892-a417-4c50dc64ccf7, source lines 7634-7717). */
    public void p9700CheckChangeInRec() {
        if (java.util.Objects.equals(this.acctActiveStatus, this.acupOldActiveStatus)) {
            // TODO: translate body for: ACCT-ACTIVE-STATUS EQUAL ACUP-OLD-ACTIVE-STATUS *> Current Balance AND ACCT-CURR-BAL EQUAL ACUP-OLD-CURR-BAL-N *> Credit Limit AND ACCT-CREDIT-LIMIT EQUAL ACUP-OLD-CREDIT-LIMIT-N *> Cash Limit AND ACCT-CASH-CREDIT-LIMIT EQUAL ACUP-OLD-CASH-CREDIT-LIMIT-N *> Current Cycle Credit AND ACCT-CURR-CYC-CREDIT EQUAL ACUP-OLD-CURR-CYC-CREDIT-N *> Current Cycle Debit AND ACCT-CURR-CYC-DEBIT EQUAL ACUP-OLD-CURR-CYC-DEBIT-N *> Open date AND ACCT-OPEN-DATE(1:4) EQUAL ACUP-OLD-OPEN-YEAR AND ACCT-OPEN-DATE(6:2) EQUAL ACUP-OLD-OPEN-MON AND ACCT-OPEN-DATE(9:2) EQUAL ACUP-OLD-OPEN-DAY *> Expiry date AND ACCT-EXPIRAION-DATE(1:4)EQUAL ACUP-OLD-EXP-YEAR AND ACCT-EXPIRAION-DATE(6:2)EQUAL ACUP-OLD-EXP-MON AND ACCT-EXPIRAION-DATE(9:2)EQUAL ACUP-OLD-EXP-DAY *> Reissue date AND ACCT-REISSUE-DATE(1:4) EQUAL ACUP-OLD-REISSUE-YEAR AND ACCT-REISSUE-DATE(6:2) EQUAL ACUP-OLD-REISSUE-MON AND ACCT-REISSUE-DATE(9:2) EQUAL ACUP-OLD-REISSUE-DAY *> Account Group AND FUNCTION LOWER-CASE (ACCT-GROUP-ID) EQUAL FUNCTION LOWER-CASE (ACUP-OLD-GROUP-ID)
        }
        if ((true /* TODO translate: FUNCTION UPPER-CASE (CUST-FIRST-NAME ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-FIRST-NAME ) */) && (true /* TODO translate: FUNCTION UPPER-CASE (CUST-MIDDLE-NAME ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-MIDDLE-NAME) */) && (true /* TODO translate: FUNCTION UPPER-CASE (CUST-LAST-NAME ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-LAST-NAME ) */) && (true /* TODO translate: FUNCTION UPPER-CASE (CUST-ADDR-LINE-1 ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-ADDR-LINE-1) */) && (true /* TODO translate: FUNCTION UPPER-CASE (CUST-ADDR-LINE-2 ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-ADDR-LINE-2) */) && (true /* TODO translate: FUNCTION UPPER-CASE (CUST-ADDR-LINE-3 ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-ADDR-LINE-3) */) && (true /* TODO translate: FUNCTION UPPER-CASE (CUST-ADDR-STATE-CD ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-ADDR-STATE-CD) */) && (true /* TODO translate: FUNCTION UPPER-CASE (CUST-ADDR-COUNTRY-CD ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-ADDR-COUNTRY-CD ) */) && (java.util.Objects.equals(this.custAddrZip, this.acupOldCustAddrZip)) && (java.util.Objects.equals(this.custPhoneNum1, this.acupOldCustPhoneNum1)) && (java.util.Objects.equals(this.custPhoneNum2, this.acupOldCustPhoneNum2)) && (java.util.Objects.equals(this.custSsn, this.acupOldCustSsn)) && (true /* TODO translate: FUNCTION UPPER-CASE (CUST-GOVT-ISSUED-ID ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-GOVT-ISSUED-ID ) */) && (true /* TODO translate: CUST-DOB-YYYY-MM-DD (1:4) EQUAL ACUP-OLD-CUST-DOB-YYYY-MM-DD (1:4) */) && (true /* TODO translate: CUST-DOB-YYYY-MM-DD (6:2) EQUAL ACUP-OLD-CUST-DOB-YYYY-MM-DD (5:2) */) && (true /* TODO translate: CUST-DOB-YYYY-MM-DD (9:2) EQUAL ACUP-OLD-CUST-DOB-YYYY-MM-DD (7:2) */) && (java.util.Objects.equals(this.custEftAccountId, this.acupOldCustEftAccountId)) && (java.util.Objects.equals(this.custPriCardHolderInd, this.acupOldCustPriHolderInd)) && (java.util.Objects.equals(this.custFicoCreditScore, this.acupOldCustFicoScore))) {
            // TODO: translate body for: FUNCTION UPPER-CASE (CUST-FIRST-NAME ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-FIRST-NAME ) AND FUNCTION UPPER-CASE (CUST-MIDDLE-NAME ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-MIDDLE-NAME) AND FUNCTION UPPER-CASE (CUST-LAST-NAME ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-LAST-NAME ) AND FUNCTION UPPER-CASE (CUST-ADDR-LINE-1 ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-ADDR-LINE-1) AND FUNCTION UPPER-CASE (CUST-ADDR-LINE-2 ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-ADDR-LINE-2) AND FUNCTION UPPER-CASE (CUST-ADDR-LINE-3 ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-ADDR-LINE-3) AND FUNCTION UPPER-CASE (CUST-ADDR-STATE-CD ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-ADDR-STATE-CD) AND FUNCTION UPPER-CASE (CUST-ADDR-COUNTRY-CD ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-ADDR-COUNTRY-CD ) AND CUST-ADDR-ZIP EQUAL ACUP-OLD-CUST-ADDR-ZIP AND CUST-PHONE-NUM-1 EQUAL ACUP-OLD-CUST-PHONE-NUM-1 AND CUST-PHONE-NUM-2 EQUAL ACUP-OLD-CUST-PHONE-NUM-2 AND CUST-SSN EQUAL ACUP-OLD-CUST-SSN AND FUNCTION UPPER-CASE (CUST-GOVT-ISSUED-ID ) EQUAL FUNCTION UPPER-CASE (ACUP-OLD-CUST-GOVT-ISSUED-ID ) AND CUST-DOB-YYYY-MM-DD (1:4) EQUAL ACUP-OLD-CUST-DOB-YYYY-MM-DD (1:4) AND CUST-DOB-YYYY-MM-DD (6:2) EQUAL ACUP-OLD-CUST-DOB-YYYY-MM-DD (5:2) AND CUST-DOB-YYYY-MM-DD (9:2) EQUAL ACUP-OLD-CUST-DOB-YYYY-MM-DD (7:2) AND CUST-EFT-ACCOUNT-ID EQUAL ACUP-OLD-CUST-EFT-ACCOUNT-ID AND CUST-PRI-CARD-HOLDER-IND EQUAL ACUP-OLD-CUST-PRI-HOLDER-IND AND CUST-FICO-CREDIT-SCORE EQUAL ACUP-OLD-CUST-FICO-SCORE
        }
    }

    /** 9700-CHECK-CHANGE-IN-REC-EXIT  (uuid:c565319a-39b5-5754-56ba-d507b40b1485, source lines 7718-7720). */
    public void p9700CheckChangeInRecExit() {
        // COBOL [EXIT]: EXIT
    }

    /** YYYY-STORE-PFKEY  (uuid:f311b335-237c-f4b6-6984-75648ed97466, source lines 7740-7802). */
    public void yyyyStorePfkey() {
        // EVALUATE TRUE
        // (translated branches appear below as separate IF/SET/MOVE statements)
        if (true /* multi-branch */) { /* WHEN branches follow */ }
    }

    /** YYYY-STORE-PFKEY-EXIT  (uuid:74d5a87e-6531-df20-0437-01bdbfcd1212, source lines 7803-7805). */
    public void yyyyStorePfkeyExit() {
        // COBOL [EXIT]: EXIT
    }

    /** ABEND-ROUTINE  (uuid:d8f0e798-b0a9-2741-d7b7-4419e57e96a5, source lines 7812-7834). */
    public void abendRoutine() {
        if (java.util.Objects.equals(this.abendMsg, "\u0000")) {
            // TODO: translate body for: ABEND-MSG EQUAL LOW-VALUES
        }
        // MOVE LIT-THISPGM TO ABEND-CULPRIT  -- identifier MOVE; needs PIC-aware type coercion
    }

    /** ABEND-ROUTINE-EXIT  (uuid:6c583fba-8001-e2d7-1d56-6ec120a36769, source lines 7835-7837). */
    public void abendRoutineExit() {
        // COBOL [EXIT]: EXIT
    }

    /** EDIT-DATE-CCYYMMDD  (uuid:b1cb9935-ba76-b74c-0b6c-15d17c317cd0, source lines 7858-7860). */
    public void editDateCcyymmdd() {
        // SET WS-EDIT-DATE-IS-INVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** EDIT-YEAR-CCYY  (uuid:91e9230f-87d8-8c80-d604-83a7eb581c88, source lines 7865-7927). */
    public void editYearCcyy() {
        // SET FLG-YEAR-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.wsEditDateCcyy, "\u0000")) {
            // TODO: translate body for: WS-EDIT-DATE-CCYY EQUAL LOW-VALUES OR WS-EDIT-DATE-CCYY EQUAL SPACES
        }
        if (!this.wsEditDateCcyy.toString().matches("-?\\d+(\\.\\d+)?")) {
            // TODO: translate body for: WS-EDIT-DATE-CCYY IS NOT NUMERIC
        }
        if ((true /* TODO translate: THIS-CENTURY */) || (true /* TODO translate: LAST-CENTURY */)) {
            // TODO: translate body for: THIS-CENTURY OR LAST-CENTURY
        }
        // SET FLG-YEAR-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** EDIT-YEAR-CCYY-EXIT  (uuid:f12a5dce-448e-d9ed-1413-c405da600cd2, source lines 7928-7930). */
    public void editYearCcyyExit() {
        // COBOL [EXIT]: EXIT
    }

    /** EDIT-MONTH  (uuid:a89c0803-0b56-278f-fefa-9c622b6ce8bf, source lines 7931-7984). */
    public void editMonth() {
        // SET FLG-MONTH-NOT-OK TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.wsEditDateMm, "\u0000")) {
            // TODO: translate body for: WS-EDIT-DATE-MM EQUAL LOW-VALUES OR WS-EDIT-DATE-MM EQUAL SPACES
        }
        if (true /* TODO translate: WS-VALID-MONTH */) {
            // TODO: translate body for: WS-VALID-MONTH
        }
        if (true /* TODO translate: FUNCTION TEST-NUMVAL (WS-EDIT-DATE-MM) = 0 */) {
            // TODO: translate body for: FUNCTION TEST-NUMVAL (WS-EDIT-DATE-MM) = 0
        }
        // SET FLG-MONTH-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** EDIT-MONTH-EXIT  (uuid:c21e6374-3a79-8f1a-477e-7c54c0aeb37e, source lines 7985-7987). */
    public void editMonthExit() {
        // COBOL [EXIT]: EXIT
    }

    /** EDIT-DAY  (uuid:246597e7-d516-95ed-7911-0dc55220829a, source lines 7990-8044). */
    public void editDay() {
        // SET FLG-DAY-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
        if (java.util.Objects.equals(this.wsEditDateDd, "\u0000")) {
            // TODO: translate body for: WS-EDIT-DATE-DD EQUAL LOW-VALUES OR WS-EDIT-DATE-DD EQUAL SPACES
        }
        if (true /* TODO translate: FUNCTION TEST-NUMVAL (WS-EDIT-DATE-DD) = 0 */) {
            // TODO: translate body for: FUNCTION TEST-NUMVAL (WS-EDIT-DATE-DD) = 0
        }
        if (true /* TODO translate: WS-VALID-DAY */) {
            // TODO: translate body for: WS-VALID-DAY
        }
        // SET FLG-DAY-ISVALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** EDIT-DAY-EXIT  (uuid:e51f9174-e520-514f-3b37-82fadb05d15b, source lines 8045-8047). */
    public void editDayExit() {
        // COBOL [EXIT]: EXIT
    }

    /** EDIT-DAY-MONTH-YEAR  (uuid:37949f6e-37dc-4c00-45b0-24d02b284384, source lines 8049-8119). */
    public void editDayMonthYear() {
        if ((true /* TODO translate: NOT WS-31-DAY-MONTH */) && (true /* TODO translate: WS-DAY-31 */)) {
            // TODO: translate body for: NOT WS-31-DAY-MONTH AND WS-DAY-31
        }
        if ((true /* TODO translate: WS-FEBRUARY */) && (true /* TODO translate: WS-DAY-30 */)) {
            // TODO: translate body for: WS-FEBRUARY AND WS-DAY-30
        }
        if ((true /* TODO translate: WS-FEBRUARY */) && (true /* TODO translate: WS-DAY-29 */)) {
            // TODO: translate body for: WS-FEBRUARY AND WS-DAY-29
        }
        if (true /* TODO translate: WS-EDIT-DATE-IS-VALID */) {
            // TODO: translate body for: WS-EDIT-DATE-IS-VALID
        }
    }

    /** EDIT-DAY-MONTH-YEAR-EXIT  (uuid:dd087efc-b2cc-00ba-eff6-5d5c52edf3e7, source lines 8120-8122). */
    public void editDayMonthYearExit() {
        // COBOL [EXIT]: EXIT
    }

    /** EDIT-DATE-LE  (uuid:6c3e2c69-4736-2d0e-b05e-c77da795b17a, source lines 8124-8161). */
    public void editDateLe() {
        // INITIALIZE wsDateValidationResult: reset to PIC defaults
        this.wsDateValidationResult = null;  // TODO: set to type-appropriate zero/spaces
        this.wsDateFormat = "YYYYMMDD";
        // CALL CSUTLDTC() — see external program CSUTLDTC
        if (java.util.Objects.equals(this.wsSeverityN, 0)) {
            // TODO: translate body for: WS-SEVERITY-N = 0
        }
        if (true /* TODO translate: NOT INPUT-ERROR */) {
            // TODO: translate body for: NOT INPUT-ERROR
        }
    }

    /** EDIT-DATE-LE-EXIT  (uuid:d80a244c-92b4-0e91-1edc-25d037ab46cb, source lines 8163-8168). */
    public void editDateLeExit() {
        // COBOL [EXIT]: EXIT
        // SET WS-EDIT-DATE-IS-VALID TO TRUE  // 88-level condition: assign the parent field its TRUE/FALSE literal
    }

    /** EDIT-DATE-CCYYMMDD-EXIT  (uuid:ebc8756c-8d0c-a8bc-dc12-e73262ed30ce, source lines 8169-8171). */
    public void editDateCcyymmddExit() {
        // COBOL [EXIT]: EXIT
    }

    /** EDIT-DATE-OF-BIRTH  (uuid:67162e0d-2906-99ad-2bd1-22839dd45e7c, source lines 8181-8209). */
    public void editDateOfBirth() {
        // MOVE FUNCTION TO WS-CURRENT-DATE-YYYYMMDD  -- identifier MOVE; needs PIC-aware type coercion
        // COMPUTE (needs PIC-aware expression translation): COMPUTE WS-EDIT-DATE-BINARY = FUNCTION INTEGER-OF-DATE (WS-EDIT-DATE-CCYYMMDD-N);
        // COMPUTE (needs PIC-aware expression translation): COMPUTE WS-CURRENT-DATE-BINARY = FUNCTION INTEGER-OF-DATE (WS-CURRENT-DATE-YYYYMMDD-N);
        if (true /* TODO translate: WS-CURRENT-DATE-BINARY > WS-EDIT-DATE-BINARY *> */) {
            // TODO: translate body for: WS-CURRENT-DATE-BINARY > WS-EDIT-DATE-BINARY *>
        }
    }

    /** EDIT-DATE-OF-BIRTH-EXIT  (uuid:d60f323d-97a2-57f2-6816-4045f812abb7, source lines 8210-8212). */
    public void editDateOfBirthExit() {
        // COBOL [EXIT]: EXIT
    }

    public static void main(String[] args) {
        new Coactupc().mainPara();
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
