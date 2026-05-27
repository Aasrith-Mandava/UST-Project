# CardDemo - Generated Java repository

Forward-engineered from the AWS CardDemo COBOL corpus by the UST CodeCrafter pipeline.

**Chain:** parsed COBOL artifacts (SQLite) → LLM-authored grounded spec → typed Java source.

| Programs emitted | Skipped/errored | Total source lines |
|---|---|---|
| 31 | 0 | 33,872 |

## Emitted programs

| Program | File | Lines |
|---|---|---|
| `CBACT01C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cbact01c.java` | 639 |
| `CBACT02C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cbact02c.java` | 225 |
| `CBACT03C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cbact03c.java` | 212 |
| `CBACT04C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cbact04c.java` | 636 |
| `CBCUS01C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cbcus01c.java` | 202 |
| `CBEXPORT` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cbexport.java` | 635 |
| `CBIMPORT` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cbimport.java` | 563 |
| `CBSTM03A` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cbstm03a.java` | 860 |
| `CBSTM03B` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cbstm03b.java` | 180 |
| `CBTRN01C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cbtrn01c.java` | 578 |
| `CBTRN02C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cbtrn02c.java` | 732 |
| `CBTRN03C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cbtrn03c.java` | 627 |
| `COACTUPC` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Coactupc.java` | 4,584 |
| `COACTVWC` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Coactvwc.java` | 2,106 |
| `COADM01C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Coadm01c.java` | 1,121 |
| `COBIL00C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cobil00c.java` | 1,003 |
| `COBSWAIT` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cobswait.java` | 47 |
| `COCRDLIC` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cocrdlic.java` | 2,354 |
| `COCRDSLC` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cocrdslc.java` | 1,447 |
| `COCRDUPC` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cocrdupc.java` | 1,815 |
| `COMEN01C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Comen01c.java` | 1,119 |
| `CORPT00C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Corpt00c.java` | 1,189 |
| `COSGN00C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cosgn00c.java` | 830 |
| `COTRN00C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cotrn00c.java` | 2,285 |
| `COTRN01C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cotrn01c.java` | 1,183 |
| `COTRN02C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cotrn02c.java` | 1,595 |
| `COUSR00C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cousr00c.java` | 2,270 |
| `COUSR01C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cousr01c.java` | 876 |
| `COUSR02C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cousr02c.java` | 921 |
| `COUSR03C` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Cousr03c.java` | 893 |
| `CSUTLDTC` | `/Users/aasrithmandava/Desktop/UST Project/demo/java-repo/src/main/java/com/carddemo/generated/Csutldtc.java` | 145 |

## Building

```bash
mvn compile
```

Generated source compiles standalone. Method bodies that need PIC-aware 
numeric semantics (ADD/SUBTRACT/MULTIPLY/COMPUTE) are preserved as COBOL 
comments — translate those once you've decided on the Java numeric strategy.
