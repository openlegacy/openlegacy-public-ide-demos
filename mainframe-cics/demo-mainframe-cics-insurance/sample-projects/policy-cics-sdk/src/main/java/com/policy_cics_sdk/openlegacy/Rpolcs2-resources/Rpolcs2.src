      *****************************************************************
      * RPOLCS2.cpy - RESET POLICIES FOR CICS AND DB2
      *               DELETE CURRENT POLICIES, AND ADD NEW ONES
      *****************************************************************
          03  OUT-PUT.
           04 RT-MSG                             PIC X(60).                     
          03 IN-PUT.
           04 POLICY-ARRAY                OCCURS 10 TIMES.
            05 POLICY-DETAILS.
             07 ACTI-POLICY-NUM                  PIC X(11).
             07 ACTI-CUST-NAME                   PIC X(16).
             07 ACTI-CUST-ADDR                   PIC X(16).
             07 ACTI-CUST-CITY                   PIC X(16).
             07 ACTI-CUST-STATE                  PIC X(2).
             07 ACTI-CUST-ZIP                    PIC X(5).
             07 ACTI-CUST-PHONE                  PIC X(16).
             07 ACTI-BIRTH-DATE                  PIC X(8).
             07 ACTI-CREATE-DATE                 PIC X(8).
             07 ACTI-END-DATE                    PIC X(8).
             07 ACTI-POLICY-TYPE                 PIC X(16).
             07 ACTI-MONTHLY_PYMT                PIC S9(11)V9(3) COMP-3.
             07 ACTI-QUARTERY-PYMT               PIC S9(11)V9(3) COMP-3.
             07 ACTI-YEARLY-PYMT                 PIC S9(11)V9(3) COMP-3.
             07 ACTI-ISACTIVE                    PIC X(1).