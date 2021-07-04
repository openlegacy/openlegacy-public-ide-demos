        IDENTIFICATION DIVISION.
        PROGRAM-ID. OPNACT31.
        DATA DIVISION.
        LINKAGE SECTION.
		01 DFHCOMMAREA.
         03 CRT-ACCOUNT-IN.
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
           05 ACTI-BRNCH-ID                    PIC S9(6).
           05 ACTI-INITIAL-DEPOSIT             PIC S9(11)V9(3) COMP-3
                                               VALUE 0.
           05 ACTI-CURRENCY                    PIC X(3).
         03 ACCOUNT-OUT.
           05 ACCOUNT-DETAILS.
             07 ACTO-IBAN                      PIC X(32).
             07 ACTO-ACCOUNT-ID                PIC X(11).
             07 ACTO-CNTRY-CD                  PIC X(2).
             07 ACTO-BNK-ID                    PIC X(4).
             07 ACTO-BRNCH-ID                  PIC S9(6).
             07 ACTO-CUSTOMER-ID               PIC X(16).
             07 ACTO-CUSTOMER-NAME             PIC X(16).
             07 ACTO-TYPCD                     PIC X.
             07 ACTO-TYPE-NAME                 PIC X(12).
             07 ACTO-SUB-TYPCD                 PIC X(3).
             07 ACTO-TYPE-DESCRIPTION          PIC X(40).
             07 ACTO-BALANCE                   PIC S9(11)V9(3) COMP-3.
             07 ACTO-CURRENCY                  PIC X(3).
             07 ACTO-CRT-DT                    PIC X(8).
             07 ACTO-UPDT-DT                   PIC X(8).
             07 ACTO-LOCKED                    PIC X.
               88 ACTO-LOCKED-YES              VALUE 'Y'.
               88 ACTO-LOCKED-NO               VALUE 'N'.
           05 RTCD                             PIC S9.
             88 RTCD-OK                        VALUE 0.
             88 RTCD-CSTMR-ID                  VALUE 1.
             88 RTCD-CSTMR-NAME                VALUE 2.
             88 RTCD-ACT-SUB-TYP               VALUE 3.
             88 RTCD-ACT-TYP                   VALUE 4.
             88 RTCD-CNTRY-CD                  VALUE 5.
             88 RTCD-BNK-ID                    VALUE 6.
             88 RTCD-BRNCH-ID                  VALUE 7.
           05 RT-MSG                           PIC X(60).