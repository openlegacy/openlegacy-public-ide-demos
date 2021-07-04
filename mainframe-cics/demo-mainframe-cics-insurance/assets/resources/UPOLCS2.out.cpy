      *****************************************************************
      * UPOLCS2.cpy - UPDATE INSURANCE POLICY FOR CICS AND DB2
      *****************************************************************
           03 IN-PUT. 
            04 IN-POLICY.		   
             05 ACTI-POLICY-NUM                  PIC X(11).
             05 ACTI-CUST-NAME                   PIC X(16).
             05 ACTI-CUST-ADDR                   PIC X(16).
             05 ACTI-CUST-CITY                   PIC X(16).
             05 ACTI-CUST-STATE                  PIC X(2).
             05 ACTI-CUST-ZIP                    PIC X(5).
             05 ACTI-CUST-PHONE                  PIC X(16).
             05 ACTI-BIRTH-DATE                  PIC X(8).
             05 ACTI-CREATE-DATE                 PIC X(8).
             05 ACTI-END-DATE                    PIC X(8).
             05 ACTI-POLICY-TYPE                 PIC X(16).
             05 ACTI-MONTHLY_PYMT                PIC S9(11)V9(3) COMP-3.
             05 ACTI-QUARTERY-PYMT               PIC S9(11)V9(3) COMP-3.
             05 ACTI-YEARLY-PYMT                 PIC S9(11)V9(3) COMP-3.
             05 ACTI-ISACTIVE                    PIC X(1).
           03 OUT-PUT.
            04 OUT-POLICY.
             05 ACTO-POLICY-NUM                  PIC X(11).
             05 ACTO-CUST-NAME                   PIC X(16).
             05 ACTO-CUST-ADDR                   PIC X(16).
             05 ACTO-CUST-CITY                   PIC X(16).
             05 ACTO-CUST-STATE                  PIC X(2).
             05 ACTO-CUST-ZIP                    PIC X(5).
             05 ACTO-CUST-PHONE                  PIC X(16).
             05 ACTO-BIRTH-DATE                  PIC X(8).
             05 ACTO-CREATE-DATE                 PIC X(8).
             05 ACTO-END-DATE                    PIC X(8).
             05 ACTO-POLICY-TYPE                 PIC X(16).
             05 ACTO-MONTHLY_PYMT                PIC S9(11)V9(3) COMP-3.
             05 ACTO-QUARTERY-PYMT               PIC S9(11)V9(3) COMP-3.
             05 ACTO-YEARLY-PYMT                 PIC S9(11)V9(3) COMP-3.
             05 ACTO-ISACTIVE                    PIC X(1).
            04 RT-MSG                            PIC X(60).