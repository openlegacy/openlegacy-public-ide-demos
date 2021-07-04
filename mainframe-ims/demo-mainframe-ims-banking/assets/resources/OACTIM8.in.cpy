      *****************************************************************
      * OACTIM8.cpy - OPEN ACCOUNT - IMS & DB2 with COMP-3
      *****************************************************************
           02 CRT-ACCOUNT-IN.
             05 ACTI-ACCOUNT-ID                  PIC X(11).
             05 ACTI-CUSTOMER-ID                 PIC X(16).
             05 ACTI-CUSTOMER-NAME               PIC X(16).
             05 ACTI-TYPCD                       PIC X.
               88 ACTI-TYPCD-BUSINESS            VALUE 'B'.
               88 ACTI-TYPCD-PERSONAL            VALUE 'P'.
             05 ACTI-SUB-TYPCD                   PIC X(3).
               88 BASIC-CHECKING-ACT             VALUE 'BC'.
               88 SAVINGS-ACT                    VALUE 'S'.
               88 INTEREST-BEARING-CHECKING-ACT  VALUE 'IBC'.
               88 MONEY-MARKET-ACT               VALUE 'MM'.
               88 IRA-ACT                        VALUE 'IRA'.
               88 BROKERAGE-ACT                  VALUE 'B'.
             05 ACTI-CNTRY-CD                    PIC X(2).
             05 ACTI-BNK-ID                      PIC X(4).
             05 ACTI-BRNCH-ID                    PIC S9(9) COMP.
             05 ACTI-INITIAL-DEPOSIT             PIC S9(11)V9(3) COMP-3.
             05 ACTI-CURRENCY                    PIC X(3).
