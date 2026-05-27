      ******************************************************************
      * Stub for MQ GET MESSAGE OPTIONS copybook (CMQGMOV).
      ******************************************************************
       01  MQGMO.
           05  MQGMO-STRUCID         PIC X(4).
           05  MQGMO-VERSION         PIC S9(9) COMP.
           05  MQGMO-OPTIONS         PIC S9(9) COMP.
           05  MQGMO-WAITINTERVAL    PIC S9(9) COMP.
           05  MQGMO-MSGSEQNUMBER    PIC S9(9) COMP.
           05  MQGMO-OFFSET          PIC S9(9) COMP.
           05  MQGMO-MATCHOPTIONS    PIC S9(9) COMP.
           05  MQGMO-GROUPSTATUS     PIC X(1).
           05  MQGMO-SEGMENTSTATUS   PIC X(1).
           05  MQGMO-SEGMENTATION    PIC X(1).
           05  MQGMO-RESERVED1       PIC X(1).
