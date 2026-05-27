# Demo: COTRN02C

Mode: `live:gemini/gemini-2.5-flash`  
Grounding: 19/19 UUIDs resolved (100.0%)

## LLM output

{
  "program_name": "COTRN02C",
  "program_uuid": "5996533e-a70e-efb8-2f18-fc96b8ddd863",
  "overview": "This CICS COBOL program is responsible for adding new transactions. It manages user interaction through a screen, validates the input data, and processes business logic to persist transaction records. The program interacts with various data files and leverages utility programs to complete its functions.",
  "responsibilities": [
    "Handle CICS screen interactions for transaction entry, including displaying and receiving data.",
    "Perform validation of user-entered key fields and other transaction data.",
    "Manage file I/O operations for reading reference data and writing new transaction records.",
    "Integrate with external utility programs for data processing and validation.",
    "Provide functionality to copy existing transaction data or navigate between CICS screens."
  ],
  "external_dependencies": {
    "called_programs": [
      "CSUTLDTC",
      "CDEMO-TO-PROGRAM"
    ],
    "files": [
      "WS-CXACAIX-FILE",
      "WS-CCXREF-FILE",
      "WS-TRANSACT-FILE"
    ],
    "copybooks": [
      "COCOM01Y",
      "COTRN02",
      "COTTL01Y",
      "CSDAT01Y",
      "CSMSG01Y",
      "CVTRA05Y",
      "CVACT01Y",
      "CVACT03Y",
      "DFHAID",
      "DFHBMSCA"
    ]
  },
  "paragraphs": [
    {
      "name": "MAIN-PARA",
      "uuid": "068d4e59-7c59-a6be-fc81-694000f3bd99",
      "purpose": "Serves as the main control paragraph for the program, orchestrating the overall flow of transaction processing and screen management.",
      "java_method_hint": "This will likely map to the main controller or service method handling the transaction flow."
    },
    {
      "name": "PROCESS-ENTER-KEY",
      "uuid": "be666683-a70a-f987-1e7e-ed864e4e8cc6",
      "purpose": "Handles the logic executed when the user presses the ENTER key on the transaction screen, typically involving validation and subsequent processing.",
      "java_method_hint": "Implement as a method within a controller or service that responds to form submissions."
    },
    {
      "name": "VALIDATE-INPUT-KEY-FIELDS",
      "uuid": "a9b9d899-1f53-8ef0-4fd2-e05f1a9d78c6",
      "purpose": "Validates the primary key fields entered by the user on the transaction screen for correctness and completeness.",
      "java_method_hint": "Create a private validation method for key data fields."
    },
    {
      "name": "VALIDATE-INPUT-DATA-FIELDS",
      "uuid": "612c6cbc-566b-7c23-63df-8007cdea6c89",
      "purpose": "Validates all non-key data fields received from the transaction screen, possibly utilizing external routines for specific checks.",
      "java_method_hint": "Implement as a private validation method for the main transaction data, potentially calling helper utility methods."
    },
    {
      "name": "ADD-TRANSACTION",
      "uuid": "91e7f364-3cea-6918-440c-ecea6439a3ed",
      "purpose": "Manages the complete process of adding a new transaction, including retrieving previous transaction details and writing the new record.",
      "java_method_hint": "Map to a service method responsible for the end-to-end process of adding a transaction, including database interactions."
    },
    {
      "name": "COPY-LAST-TRAN-DATA",
      "uuid": "6e859392-9038-cac4-1e98-0cb00cb92b13",
      "purpose": "Retrieves and copies data from the most recently entered transaction, likely to pre-fill fields for a new entry.",
      "java_method_hint": "Implement as a method to fetch and map data from the last transaction for pre-population."
    },
    {
      "name": "RETURN-TO-PREV-SCREEN",
      "uuid": "2d8da8e4-f768-60d7-f38f-6e91aa822761",
      "purpose": "Handles the control transfer to a previous CICS screen or program, effectively exiting the current transaction entry flow.",
      "java_method_hint": "Map to a controller method that manages navigation or redirection to another UI component or service."
    },
    {
      "name": "SEND-TRNADD-SCREEN",
      "uuid": "e2114b3d-1cc3-b330-1879-52fa228241ae",
      "purpose": "Constructs and displays the 'Add Transaction' screen to the user, typically populating header information.",
      "java_method_hint": "Implement as a method responsible for rendering the transaction addition view, including populating initial data."
    },
    {
      "name": "RECEIVE-TRNADD-SCREEN",
      "uuid": "a32d7977-71af-3480-a6cb-a36795cf41ba",
      "purpose": "Receives and processes the input data submitted by the user from the 'Add Transaction' screen.",
      "java_method_hint": "Map to a method in a controller that handles incoming form data from the user interface."
    },
    {
      "name": "POPULATE-HEADER-INFO",
      "uuid": "09f42dbc-89d1-c461-2be2-686bd85f59e1",
      "purpose": "Gathers and formats necessary data to be displayed in the header section of the transaction screen.",
      "java_method_hint": "Implement as a helper method to prepare and return header data for the view model."
    },
    {
      "name": "READ-CXACAIX-FILE",
      "uuid": "73617466-e802-ed83-6a38-f02afbee2573",
      "purpose": "Reads a record from the `WS-CXACAIX-FILE`, which is likely a cross-reference or lookup file.",
      "java_method_hint": "Map to a data access object (DAO) method for reading from the CXACAIX entity."
    },
    {
      "name": "READ-CCXREF-FILE",
      "uuid": "593d6827-3164-01c6-83b8-48326ca3bd95",
      "purpose": "Reads a record from the `WS-CCXREF-FILE`, another potential cross-reference or lookup file.",
      "java_method_hint": "Map to a data access object (DAO) method for reading from the CCXREF entity."
    },
    {
      "name": "STARTBR-TRANSACT-FILE",
      "uuid": "1d0459d0-1dff-5cd8-4737-20b52161bb81",
      "purpose": "Initiates a browse operation on the `WS-TRANSACT-FILE`, typically to prepare for reading multiple records, often in reverse order.",
      "java_method_hint": "Map to a DAO method to initialize a cursor or query for browsing the TRANSACT-FILE."
    },
    {
      "name": "READPREV-TRANSACT-FILE",
      "uuid": "2016546a-7168-6bb2-41cb-ff8c5938fbfa",
      "purpose": "Reads the previous record in the `WS-TRANSACT-FILE` during an active browse operation.",
      "java_method_hint": "Map to a DAO method to fetch the previous record from the TRANSACT-FILE."
    },
    {
      "name": "ENDBR-TRANSACT-FILE",
      "uuid": "4c1f0ed7-a6b2-c677-ef80-c57694bcd257",
      "purpose": "Terminates an ongoing browse operation on the `WS-TRANSACT-FILE` and releases associated resources.",
      "java_method_hint": "Map to a DAO method to close the cursor or release resources used for browsing the TRANSACT-FILE."
    },
    {
      "name": "WRITE-TRANSACT-FILE",
      "uuid": "1cee63b5-7e52-6b17-cb05-15b6cff48658",
      "purpose": "Writes a new transaction record to the `WS-TRANSACT-FILE` after all necessary data is prepared.",
      "java_method_hint": "Map to a DAO method to persist a new transaction record to the database."
    },
    {
      "name": "CLEAR-CURRENT-SCREEN",
      "uuid": "55feb557-96e2-28fa-e4cc-9f850ca1f999",
      "purpose": "Clears the input fields on the current screen and prepares it for new data entry or display.",
      "java_method_hint": "Implement as a UI utility method for resetting form fields or preparing a new view."
    },
    {
      "name": "INITIALIZE-ALL-FIELDS",
      "uuid": "932bbd75-7b5b-bd45-2b4b-3d7b568801de",
      "purpose": "Sets all program working storage fields and screen display fields to their default or initial values.",
      "java_method_hint": "Map to a method for initializing a data model or a DTO to its default state."
    }
  ],
  "migration_risks": [
    "Re-engineering CICS BMS screen handling to a modern web-based UI framework (e.g., Spring MVC, React) will be complex.",
    "Conversion of COBOL `PERFORM` statements, especially nested or `PERFORM THRU`, to clear and maintainable Java method calls.",
    "Translating VSAM indexed file I/O operations (READ, WRITE, STARTBR, READPREV, ENDBR) to appropriate database persistence mechanisms in Java, including error handling.",
    "Dependencies on external COBOL programs (`CSUTLDTC`, `CDEMO-TO-PROGRAM`) necessitate migrating or providing equivalent Java implementations for those programs.",
    "Ensuring accurate data type conversion for all COBOL data items, particularly packed-decimal and binary fields, to their Java equivalents."
  ]
}