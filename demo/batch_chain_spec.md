# Demo: POSTTRAN -> INTCALC -> CREASTMT

Mode: `live:gemini/gemini-2.5-flash`  
Grounding: 3/3 UUIDs resolved (100.0%)

## LLM output

{
  "chain": [
    "POSTTRAN",
    "INTCALC",
    "CREASTMT"
  ],
  "overview": "This batch chain processes daily financial transactions, calculates accrued interest, and generates customer statements. It updates core financial records, applies interest calculations to customer accounts, and then consolidates transaction and account data to produce final statements.",
  "jobs": [
    {
      "job_name": "POSTTRAN",
      "purpose": "Posts daily transactions from an input file to update account balances, transaction history, and category balances in VSAM files.",
      "programs": [
        {
          "name": "CBTRN02C",
          "uuid": "b173b980-6330-1619-d02d-443c046b3561",
          "step": "STEP15",
          "purpose": "Reads daily transaction data and updates various VSAM files, including account, transaction, and category balance files."
        }
      ],
      "consumes": [
        {
          "dd_name": "ACCTFILE",
          "dsn": "AWS.M2.CARDDEMO.ACCTDATA.VSAM.KSDS",
          "disp": "SHR"
        },
        {
          "dd_name": "DALYTRAN",
          "dsn": "AWS.M2.CARDDEMO.DALYTRAN.PS",
          "disp": "SHR"
        },
        {
          "dd_name": "TCATBALF",
          "dsn": "AWS.M2.CARDDEMO.TCATBALF.VSAM.KSDS",
          "disp": "SHR"
        },
        {
          "dd_name": "TRANFILE",
          "dsn": "AWS.M2.CARDDEMO.TRANSACT.VSAM.KSDS",
          "disp": "SHR"
        },
        {
          "dd_name": "XREFFILE",
          "dsn": "AWS.M2.CARDDEMO.CARDXREF.VSAM.KSDS",
          "disp": "SHR"
        }
      ],
      "produces": []
    },
    {
      "job_name": "INTCALC",
      "purpose": "Calculates and applies interest to customer accounts based on current balances and discount groups.",
      "programs": [
        {
          "name": "CBACT04C",
          "uuid": "5dd6a046-ba7e-34da-26b9-a46e3f32fcd2",
          "step": "STEP15",
          "purpose": "Processes account data to calculate and apply interest, updating account and category balance files."
        }
      ],
      "consumes": [
        {
          "dd_name": "ACCTFILE",
          "dsn": "AWS.M2.CARDDEMO.ACCTDATA.VSAM.KSDS",
          "disp": "SHR"
        },
        {
          "dd_name": "DISCGRP",
          "dsn": "AWS.M2.CARDDEMO.DISCGRP.VSAM.KSDS",
          "disp": "SHR"
        },
        {
          "dd_name": "TCATBALF",
          "dsn": "AWS.M2.CARDDEMO.TCATBALF.VSAM.KSDS",
          "disp": "SHR"
        },
        {
          "dd_name": "XREFFIL1",
          "dsn": "AWS.M2.CARDDEMO.CARDXREF.VSAM.AIX.PATH",
          "disp": "SHR"
        },
        {
          "dd_name": "XREFFILE",
          "dsn": "AWS.M2.CARDDEMO.CARDXREF.VSAM.KSDS",
          "disp": "SHR"
        }
      ],
      "produces": []
    },
    {
      "job_name": "CREASTMT",
      "purpose": "Prepares and generates customer statements by sorting transactions, converting them to VSAM, and compiling relevant account and customer information.",
      "programs": [
        {
          "name": "IDCAMS",
          "uuid": null,
          "step": "DELDEF01",
          "purpose": "Deletes and defines datasets using IDCAMS."
        },
        {
          "name": "SORT",
          "uuid": null,
          "step": "STEP010",
          "purpose": "Sorts transaction records for subsequent statement generation."
        },
        {
          "name": "IDCAMS",
          "uuid": null,
          "step": "STEP020",
          "purpose": "Converts sorted sequential transaction data into a VSAM KSDS file."
        },
        {
          "name": "IEFBR14",
          "uuid": null,
          "step": "STEP030",
          "purpose": "Manages dataset allocation or deallocation tasks."
        },
        {
          "name": "CBSTM03A",
          "uuid": "98cd097a-95da-4e06-1572-7613d3b00bde",
          "step": "STEP040",
          "purpose": "Generates customer statements by consolidating account, customer, and processed transaction data."
        }
      ],
      "consumes": [
        {
          "dd_name": "SORTIN",
          "dsn": "AWS.M2.CARDDEMO.TRANSACT.VSAM.KSDS",
          "disp": "SHR"
        },
        {
          "dd_name": "INFILE",
          "dsn": "AWS.M2.CARDDEMO.TRXFL.SEQ",
          "disp": "SHR"
        },
        {
          "dd_name": "ACCTFILE",
          "dsn": "AWS.M2.CARDDEMO.ACCTDATA.VSAM.KSDS",
          "disp": "SHR"
        },
        {
          "dd_name": "CUSTFILE",
          "dsn": "AWS.M2.CARDDEMO.CUSTDATA.VSAM.KSDS",
          "disp": "SHR"
        },
        {
          "dd_name": "TRNXFILE",
          "dsn": "AWS.M2.CARDDEMO.TRXFL.VSAM.KSDS",
          "disp": "SHR"
        },
        {
          "dd_name": "XREFFILE",
          "dsn": "AWS.M2.CARDDEMO.CARDXREF.VSAM.KSDS",
          "disp": "SHR"
        }
      ],
      "produces": [
        {
          "dd_name": "SORTOUT",
          "dsn": "AWS.M2.CARDDEMO.TRXFL.SEQ",
          "disp": "NEW,CATLG"
        },
        {
          "dd_name": "OUTFILE",
          "dsn": "AWS.M2.CARDDEMO.TRXFL.VSAM.KSDS",
          "disp": "NEW,CATLG"
        }
      ]
    }
  ],
  "dataset_handoffs": [
    {
      "from_job": "POSTTRAN",
      "from_dd": "TRANFILE",
      "to_job": "CREASTMT",
      "to_dd": "SORTIN",
      "dataset": "AWS.M2.CARDDEMO.TRANSACT.VSAM.KSDS"
    },
    {
      "from_job": "POSTTRAN",
      "from_dd": "ACCTFILE",
      "to_job": "INTCALC",
      "to_dd": "ACCTFILE",
      "dataset": "AWS.M2.CARDDEMO.ACCTDATA.VSAM.KSDS"
    },
    {
      "from_job": "INTCALC",
      "from_dd": "ACCTFILE",
      "to_job": "CREASTMT",
      "to_dd": "ACCTFILE",
      "dataset": "AWS.M2.CARDDEMO.ACCTDATA.VSAM.KSDS"
    },
    {
      "from_job": "POSTTRAN",
      "from_dd": "TCATBALF",
      "to_job": "INTCALC",
      "to_dd": "TCATBALF",
      "dataset": "AWS.M2.CARDDEMO.TCATBALF.VSAM.KSDS"
    }
  ],
  "migration_risks": [
    "Re-implementing COBOL programs with VSAM KSDS interactions in a new environment.",
    "Replacing IBM utility programs (IDCAMS, SORT, IEFBR14) with equivalent modern tools or custom Java code.",
    "Managing VSAM KSDS data structures, including alternate indexes (AIX PATH), and ensuring data integrity.",
    "Ensuring transactional consistency across multiple dataset updates."
  ],
  "spring_batch_hint": "The chain should be structured as a sequence of Spring Batch Jobs, each corresponding to a mainframe job. Each mainframe step involving a COBOL program that processes data should be a chunk-oriented step, utilizing appropriate ItemReaders for input and ItemWriters for updating VSAM files. Utility steps like IDCAMS, SORT, and IEFBR14 can be implemented as Tasklets, wrapping shell scripts or custom Java logic for file operations. Ensure proper transaction management and data integrity, especially for concurrent updates to shared VSAM resources, potentially using partitioning for large KSDS files."
}