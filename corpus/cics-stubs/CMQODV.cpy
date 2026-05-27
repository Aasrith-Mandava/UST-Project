      ******************************************************************
      * Stub for MQ OBJECT DESCRIPTOR copybook (CMQODV).
      ******************************************************************
       01  MQOD.
           05  MQOD-STRUCID          PIC X(4).
           05  MQOD-VERSION          PIC S9(9) COMP.
           05  MQOD-OBJECTTYPE       PIC S9(9) COMP.
           05  MQOD-OBJECTNAME       PIC X(48).
           05  MQOD-OBJECTQMGRNAME   PIC X(48).
           05  MQOD-DYNAMICQNAME     PIC X(48).
           05  MQOD-ALTERNATEUSERID  PIC X(12).
