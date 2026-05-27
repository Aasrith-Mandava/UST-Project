# Demo: COTRN02C/VALIDATE-INPUT-DATA-FIELDS

Mode: `live:gemini/gemini-2.5-flash`  
Grounding: 45/45 UUIDs resolved (100.0%)

## LLM output

```json
{
  "paragraph_name": "VALIDATE-INPUT-DATA-FIELDS",
  "paragraph_uuid": "612c6cbc-566b-7c23-63df-8007cdea6c89",
  "program_name": "COTRN02C",
  "summary": "This paragraph validates various transaction input fields for presence, data type, and format. It checks for empty or low-value inputs, numeric formats for specific fields, and correct date formats. If any validation fails, an error flag is set, a message is prepared, and a screen refresh is triggered. The paragraph also normalizes the transaction amount and performs date validity checks via an external utility.",
  "inputs": [
    {
      "data_item": "ERR-FLG-ON",
      "uuid": "2b32e5ba-beed-6d6a-590c-b7207d902b5a",
      "read_at_lines": [794]
    },
    {
      "data_item": "TTYPCDI",
      "uuid": "2ffe00a6-b0d1-a9ec-b221-2a7ff26677e0",
      "read_at_lines": [809, 880]
    },
    {
      "data_item": "TCATCDI",
      "uuid": "1a4ea8ba-32da-16ec-12ca-807239de91c6",
      "read_at_lines": [813, 884]
    },
    {
      "data_item": "TRNSRCI",
      "uuid": "26bd6650-f490-4431-6025-c67a58c06082",
      "read_at_lines": [817]
    },
    {
      "data_item": "TDESCI",
      "uuid": "0f1d29e9-e19b-ed28-2755-b77f21338159",
      "read_at_lines": [821]
    },
    {
      "data_item": "TRNAMTI",
      "uuid": "609a5d4d-ee48-180a-072d-3e7744b68139",
      "read_at_lines": [825, 897, 940]
    },
    {
      "data_item": "TORIGDTI",
      "uuid": "f041eb8e-2972-0d0e-dd7b-7f68d02fd776",
      "read_at_lines": [829, 911, 946]
    },
    {
      "data_item": "TPROCDTI",
      "uuid": "de2409ff-c013-9944-0fe1-1acd56936065",
      "read_at_lines": [833, 926, 966]
    },
    {
      "data_item": "MIDI",
      "uuid": "ef894cdc-f825-ba90-cb5b-b5a2e3c279bf",
      "read_at_lines": [837, 987]
    },
    {
      "data_item": "MNAMEI",
      "uuid": "4ef9041d-055d-090b-608d-df65792b3f2f",
      "read_at_lines": [841]
    },
    {
      "data_item": "MCITYI",
      "uuid": "161e5313-6e74-3495-69e8-a3f420b745b9",
      "read_at_lines": [845]
    },
    {
      "data_item": "MZIPI",
      "uuid": "7b476afb-ec87-b47c-abcc-f9cffc0f09b4",
      "read_at_lines": [849]
    },
    {
      "data_item": "WS-DATE-FORMAT",
      "uuid": "0b08f8b0-a93f-3c1f-7864-0ae371a4d423",
      "read_at_lines": [947, 967]
    },
    {
      "data_item": "CSUTLDTC-RESULT-SEV-CD",
      "uuid": "1ac6eb8a-6a84-b099-ec55-7bbcefc9303f",
      "read_at_lines": [954, 974]
    },
    {
      "data_item": "CSUTLDTC-RESULT-MSG-NUM",
      "uuid": "b8458220-2665-d51c-a9ee-d6a61b474b78",
      "read_at_lines": [957, 977]
    }
  ],
  "outputs": [
    {
      "data_item": "TTYPCDI",
      "uuid": "2ffe00a6-b0d1-a9ec-b221-2a7ff26677e0",
      "written_at_lines": [795]
    },
    {
      "data_item": "TCATCDI",
      "uuid": "1a4ea8ba-32da-16ec-12ca-807239de91c6",
      "written_at_lines": [796]
    },
    {
      "data_item": "TRNSRCI",
      "uuid": "26bd6650-f490-4431-6025-c67a58c06082",
      "written_at_lines": [797]
    },
    {
      "data_item": "TRNAMTI",
      "uuid": "609a5d4d-ee48-180a-072d-3e7744b68139",
      "written_at_lines": [798, 943]
    },
    {
      "data_item": "TDESCI",
      "uuid": "0f1d29e9-e19b-ed28-2755-b77f21338159",
      "written_at_lines": [799]
    },
    {
      "data_item": "TORIGDTI",
      "uuid": "f041eb8e-2972-0d0e-dd7b-7f68d02fd776",
      "written_at_lines": [800]
    },
    {
      "data_item": "TPROCDTI",
      "uuid": "de2409ff-c013-9944-0fe1-1acd56936065",
      "written_at_lines": [801]
    },
    {
      "data_item": "MIDI",
      "uuid": "ef894cdc-f825-ba90-cb5b-b5a2e3c279bf",
      "written_at_lines": [802]
    },
    {
      "data_item": "MNAMEI",
      "uuid": "4ef9041d-055d-090b-608d-df65792b3f2f",
      "written_at_lines": [803]
    },
    {
      "data_item": "MCITYI",
      "uuid": "161e5313-6e74-3495-69e8-a3f420b745b9",
      "written_at_lines": [804]
    },
    {
      "data_item": "MZIPI",
      "uuid": "7b476afb-ec87-b47c-abcc-f9cffc0f09b4",
      "written_at_lines": [805]
    },
    {
      "data_item": "WS-ERR-FLG",
      "uuid": "29db2adb-951e-6e9d-23f1-23cf70e2a7dc",
      "written_at_lines": [810, 814, 818, 822, 826, 830, 834, 838, 842, 846, 850, 881, 885, 902, 916, 931, 959, 979, 988]
    },
    {
      "data_item": "WS-MESSAGE",
      "uuid": "10746ed2-f825-cdec-8796-3d89034da278",
      "written_at_lines": [811, 815, 819, 823, 827, 831, 835, 839, 843, 847, 851, 882, 886, 903, 917, 932, 958, 978, 989]
    },
    {
      "data_item": "TTYPCDL",
      "uuid": "ebbbec85-b9f8-e954-de22-e844021717fa",
      "written_at_lines": [812, 883]
    },
    {
      "data_item": "TCATCDL",
      "uuid": "11944869-473a-0b83-2cf1-7bb3033328ff",
      "written_at_lines": [816, 887]
    },
    {
      "data_item": "TRNSRCL",
      "uuid": "93aa3fc5-b182-32e9-401b-f4ee863dd2fb",
      "written_at_lines": [820]
    },
    {
      "data_item": "TDESCL",
      "uuid": "caccb773-5b54-ded5-75f8-d2d4b7ba2ba3",
      "written_at_lines": [824]
    },
    {
      "data_item": "TRNAMTL",
      "uuid": "9f2a77b1-0e28-683a-8b08-3ca1db7f2aa4",
      "written_at_lines": [828, 904]
    },
    {
      "data_item": "TORIGDTL",
      "uuid": "8491b688-aafb-6d20-f1b3-6de1713b700e",
      "written_at_lines": [832, 918, 960]
    },
    {
      "data_item": "TPROCDTL",
      "uuid": "281b992c-2c93-c963-61f3-1b3db0fef18b",
      "written_at_lines": [836, 933, 980]
    },
    {
      "data_item": "MIDL",
      "uuid": "58e97624-8ffc-7418-60df-493c76334b15",
      "written_at_lines": [840, 991]
    },
    {
      "data_item": "MNAMEL",
      "uuid": "c29c2442-d915-f7a2-883c-5719eb2ac047",
      "written_at_lines": [844]
    },
    {
      "data_item": "MCITYL",
      "uuid": "97271276-ce38-b4f8-6a5c-cf2e1449808b",
      "written_at_lines": [848]
    },
    {
      "data_item": "MZIPL",
      "uuid": "c4a810ac-0e6a-7923-0a06-9b3cebd828ef",
      "written_at_lines": [852]
    },
    {
      "data_item": "WS-TRAN-AMT-N",
      "uuid": "97f493ee-8a25-fab0-ee60-1ebe20d47fb0",
      "written_at_lines": [940]
    },
    {
      "data_item": "WS-TRAN-AMT-E",
      "uuid": "d8b00726-cb6d-1ec2-7695-4b4f91fe2108",
      "written_at_lines": [942]
    },
    {
      "data_item": "CSUTLDTC-DATE",
      "uuid": "e2ec0d89-2362-34e3-24dd-44296524e6c3",
      "written_at_lines": [946, 966]
    },
    {
      "data_item": "CSUTLDTC-DATE-FORMAT",
      "uuid": "1cc92672-67eb-4625-ac66-9903587f72b6",
      "written_at_lines": [947, 967]
    },
    {
      "data_item": "CSUTLDTC-RESULT",
      "uuid": "718d5470-0ebc-171c-a51b-f166fa54824a",
      "written_at_lines": [948, 968]
    }
  ],
  "business_rules": [
    {
      "kind": "IF",
      "statement_uuid": "cd17c8ea-8cad-263e-e1d2-82373024d6f8",
      "predicate": "Error flag is already set",
      "branches": [
        {
          "when": "ERR-FLG-ON is true",
          "then": "Clear all input fields (Type Code, Category Code, Source, Amount, Description, Origin Date, Process Date, Merchant ID, Name, City, Zip) in COTRN2AI"
        }
      ]
    },
    {
      "kind": "EVALUATE",
      "statement_uuid": "2fbb1553-fd84-3dec-e23f-17620ef36fb1",
      "predicate": "Check if required input fields are empty or low-values",
      "branches": [
        {
          "when": "Type CD (TTYPCDI) is empty",
          "then": "Set error flag, message 'Type CD can NOT be empty...', and cursor position; perform screen refresh"
        },
        {
          "when": "Category CD (TCATCDI) is empty",
          "then": "Set error flag, message 'Category CD can NOT be empty...', and cursor position; perform screen refresh"
        },
        {
          "when": "Source (TRNSRCI) is empty",
          "then": "Set error flag, message 'Source can NOT be empty...', and cursor position; perform screen refresh"
        },
        {
          "when": "Description (TDESCI) is empty",
          "then": "Set error flag, message 'Description can NOT be empty...', and cursor position; perform screen refresh"
        },
        {
          "when": "Amount (TRNAMTI) is empty",
          "then": "Set error flag, message 'Amount can NOT be empty...', and cursor position; perform screen refresh"
        },
        {
          "when": "Origin Date (TORIGDTI) is empty",
          "then": "Set error flag, message 'Orig Date can NOT be empty...', and cursor position; perform screen refresh"
        },
        {
          "when": "Process Date (TPROCDTI) is empty",
          "then": "Set error flag, message 'Proc Date can NOT be empty...', and cursor position; perform screen refresh"
        },
        {
          "when": "Merchant ID (MIDI) is empty",
          "then": "Set error flag, message 'Merchant ID can NOT be empty...', and cursor position; perform screen refresh"
        },
        {
          "when": "Merchant Name (MNAMEI) is empty",
          "then": "Set error flag, message 'Merchant Name can NOT be empty...', and cursor position; perform screen refresh"
        },
        {
          "when": "Merchant City (MCITYI) is empty",
          "then": "Set error flag, message 'Merchant City can NOT be empty...', and cursor position; perform screen refresh"
        },
        {
          "when": "Merchant Zip (MZIPI) is empty",
          "then": "Set error flag, message 'Merchant Zip can NOT be empty...', and cursor position; perform screen refresh"
        },
        {
          "when": "OTHER",
          "then": "Continue to next validation checks"
        }
      ]
    },
    {
      "kind": "EVALUATE",
      "statement_uuid": "2703ce24-81ea-e4da-c5b2-7e45f97a8a02",
      "predicate": "Check if Type CD or Category CD are non-numeric",
      "branches": [
        {
          "when": "Type CD (TTYPCDI) is not numeric",
          "then": "Set error flag, message 'Type CD must be Numeric...', and cursor position; perform screen refresh"
        },
        {
          "when": "Category CD (TCATCDI) is not numeric",
          "then": "Set error flag, message 'Category CD must be Numeric...', and cursor position; perform screen refresh"
        },
        {
          "when": "OTHER",
          "then": "Continue to next validation checks"
        }
      ]
    },
    {
      "kind": "EVALUATE",
      "statement_uuid": "c3e4f4af-0bc0-0a45-7ac8-c97f021a5bab",
      "predicate": "Check if Amount (TRNAMTI) is in the format -99999999.99",
      "branches": [
        {
          "when": "Amount's first character is not '-' or '+' OR characters 2-9 are not numeric OR 10th character is not '.' OR characters 11-12 are not numeric",
          "then": "Set error flag, message 'Amount should be in format -99999999.99', and cursor position; perform screen refresh"
        },
        {
          "when": "OTHER",
          "then": "Continue to next validation checks"
        }
      ]
    },
    {
      "kind": "EVALUATE",
      "statement_uuid": "8b969036-9806-8ea5-578e-bdf898933332",
      "predicate": "Check if Origin Date (TORIGDTI) is in the format YYYY-MM-DD",
      "branches": [
        {
          "when": "Origin Date's year part (1:4) is not numeric OR first separator (5:1) is not '-' OR month part (6:2) is not numeric OR second separator (8:1) is not '-' OR day part (9:2) is not numeric",
          "then": "Set error flag, message 'Orig Date should be in format YYYY-MM-DD', and cursor position; perform screen refresh"
        },
        {
          "when": "OTHER",
          "then": "Continue to next validation checks"
        }
      ]
    },
    {
      "kind": "EVALUATE",
      "statement_uuid": "4c625c9d-c5ff-a11f-6e75-7df2b3b398dc",
      "predicate": "Check if Process Date (TPROCDTI) is in the format YYYY-MM-DD",
      "branches": [
        {
          "when": "Process Date's year part (1:4) is not numeric OR first separator (5:1) is not '-' OR month part (6:2) is not numeric OR second separator (8:1) is not '-' OR day part (9:2) is not numeric",
          "then": "Set error flag, message 'Proc Date should be in format YYYY-MM-DD', and cursor position; perform screen refresh"
        },
        {
          "when": "OTHER",
          "then": "Continue to next validation checks"
        }
      ]
    },
    {
      "kind": "IF",
      "statement_uuid": "0a1ce2fb-06bd-e632-1b88-d33e8210ab32",
      "predicate": "Origin Date validity check using external utility CSUTLDTC",
      "branches": [
        {
          "when": "CSUTLDTC-RESULT-SEV-CD is '0000' (success)",
          "then": "Continue (Origin Date is valid)"
        },
        {
          "when": "CSUTLDTC-RESULT-MSG-NUM is not '2513'",
          "then": "Set error flag, message 'Orig Date - Not a valid date...', and cursor position; perform screen refresh"
        }
      ]
    },
    {
      "kind": "IF",
      "statement_uuid": "05f70a5f-25d8-e288-3055-1b636971bf30",
      "predicate": "Process Date validity check using external utility CSUTLDTC",
      "branches": [
        {
          "when": "CSUTLDTC-RESULT-SEV-CD is '0000' (success)",
          "then": "Continue (Process Date is valid)"
        },
        {
          "when": "CSUTLDTC-RESULT-MSG-NUM is not '2513'",
          "then": "Set error flag, message 'Proc Date - Not a valid date...', and cursor position; perform screen refresh"
        }
      ]
    },
    {
      "kind": "IF",
      "statement_uuid": "e7048679-f78c-f1c0-631f-41ea3d5566b6",
      "predicate": "Merchant ID (MIDI) is not numeric",
      "branches": [
        {
          "when": "MIDI is not numeric",
          "then": "Set error flag, message 'Merchant ID must be Numeric...', and cursor position; perform screen refresh"
        }
      ]
    }
  ],
  "side_effects": [
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 812
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 816
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 820
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 824
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 828
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 832
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 836
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 840
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 844
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 848
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 852
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 883
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 887
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 905
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 919
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 934
    },
    {
      "kind": "CALL",
      "target": "CSUTLDTC",
      "line": 950,
      "site_uuid": "76b4a0a4-7b76-5545-b8b3-f94b893c788a"
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 961
    },
    {
      "kind": "CALL",
      "target": "CSUTLDTC",
      "line": 970,
      "site_uuid": "c77fcc42-1be5-9966-f3ed-aa68a32c1cd5"
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 981
    },
    {
      "kind": "PERFORM",
      "target": "SEND-TRNADD-SCREEN",
      "line": 992
    }
  ],
  "java_implementation": {
    "method_signature": "public void validateInputDataFields()",
    "pseudocode": [
      "If the global error flag is already active, clear all transaction input fields.",
      "Validate if Type Code, Category Code, Source, Description, Amount, Origin Date, Process Date, Merchant ID, Name, City, or Zip are empty.",
      "If any of these fields are empty, set the global error flag, compose an error message, indicate the cursor position, and refresh the screen.",
      "Verify that Type Code and Category Code contain only numeric characters.",
      "Validate the Amount field against the format '-99999999.99' for numeric content and decimal separator placement.",
      "Convert the Amount field from its display format to a numeric value, then reformat it back to its display representation.",
      "Perform a structural validation of the Origin Date and Process Date fields to ensure they conform to 'YYYY-MM-DD' format.",
      "Call an external utility 'CSUTLDTC' to perform a logical validation of the Origin Date and Process Date.",
      "If any date validation (structural or logical) fails (excluding message '2513' from CSUTLDTC), set the global error flag, prepare an error message, and refresh the screen.",
      "Finally, confirm that the Merchant ID contains only numeric characters. If not, set the global error flag, prepare an error message, and refresh the screen."
    ],
    "key_decisions": [
      "COBOL's 'IS NUMERIC' check is context-sensitive and applies to the entire field; substring checks are used for partial numeric validation.",
      "The 'NUMVAL-C' function is used to convert the transaction amount string to a numeric value, implicitly handling potential sign and decimal point.",
      "Date validation involves both literal string pattern matching (e.g., checking hyphens, numeric parts) and an external utility call for semantic date validity.",
      "The external date utility 'CSUTLDTC' distinguishes between a general error ('0000' severity code) and a specific informational message ('2513') which is explicitly ignored for error flagging.",
      "Error handling uses a global error flag (`WS-ERR-FLG`), an error message (`WS-MESSAGE`), and a cursor position indicator (`*L` fields set to -1) which are immediately communicated to the user by performing `SEND-TRNADD-SCREEN`."
    ]
  }
}
```