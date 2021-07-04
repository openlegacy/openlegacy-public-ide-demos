      *****************************************************************
      * RACTIM8.cpy - RESET ACCOUNT - IMS & DB2
      *****************************************************************
           02 IN-PUT.
            04 ACCOUNT-ARRAY                OCCURS 10 TIMES.
             06 ACTI-DETAILS.
              07 ACTI-ACCOUNT-ID                PIC X(11).
              07 ACTI-CUSTOMER-ID               PIC X(16).
              07 ACTI-CUSTOMER-NAME             PIC X(16).
              07 ACTI-TYPCD                     PIC X.
              07 ACTI-SUB-TYPCD                 PIC X(3).
              07 ACTI-CNTRY-CD                  PIC X(2).
              07 ACTI-BNK-ID                    PIC X(4).
              07 ACTI-BRNCH-ID                  PIC S9(9) COMP.
              07 ACTI-INITIAL-DEPOSIT           PIC S9(11)V9(3) COMP-3.
              07 ACTI-CURRENCY                  PIC X(3).