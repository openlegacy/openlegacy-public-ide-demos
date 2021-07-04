      IDENTIFICATION DIVISION.
      PROGRAM-ID./QSYS.LIB/POLICY.LIB/POL2LST.PGM.
      DATA DIVISION.                                                                                                                 
      LINKAGE SECTION.               
       01  POLICY-OUT.
           05  POLICY-REC-OUT OCCURS 10 TIMES.
               10  POLICY-NUM-OUT           PIC X(11).
               10  CUST-NAME-OUT            PIC X(16).
               10  CUST-ADDR-OUT            PIC X(16).
               10  CUST-CITY-OUT            PIC X(16).
               10  CUST-STATE-OUT           PIC X(2).
               10  CUST-ZIP-OUT             PIC X(5).
               10  CUST-PHONE-OUT           PIC X(16).
               10  BIRTH-DATE-OUT           PIC X(8).
               10  CREATE-DATE-OUT          PIC X(8).
               10  END-DATE-OUT             PIC X(8).
               10  POLICY-TYPE-OUT          PIC X(16).
               10  MONTHLY-PYMT-OUT         PIC 9(11)V9(3).
               10  QUARTERY-PYMT-OUT        PIC 9(11)V9(3).
               10  YEARLY-PYMT-OUT          PIC 9(11)V9(3).
               10  IS-ACTIVE-OUT            PIC X(1).
           05  SUCCESS                      PIC X.
           05  OPERATION                    PIC XX.
           05  REC-COUNT                    PIC 99.
           05  RESULT-SQLCODE-SIGN          PIC X(1).
           05  RESULT-SQLCODE               PIC X(5).
           05  RESULT-SQLSTATE              PIC X(5).
           05  RESULT-SQLERRMC              PIC X(70).
