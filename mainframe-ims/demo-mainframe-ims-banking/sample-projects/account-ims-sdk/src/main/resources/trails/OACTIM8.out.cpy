      *****************************************************************
      * OACTIM8.cpy - OPEN ACCOUNT - IMS & DB2 with COMP-3
      *****************************************************************
           02 ACCOUNT-OUT.
            05 CONV-TRAN                       PIC X(8).
            05 ACCOUNT-DETAILS.
              07 ACTO-ACCOUNT-ID                PIC X(11).
              07 ACTO-CUSTOMER-ID               PIC X(16).
              07 ACTO-CUSTOMER-NAME             PIC X(16).
              07 ACTO-IBAN                      PIC X(32).
              07 ACTO-CNTRY-CD                  PIC X(2).
              07 ACTO-BNK-ID                    PIC X(4).
              07 ACTO-BRNCH-ID                  PIC S9(9) COMP.
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
