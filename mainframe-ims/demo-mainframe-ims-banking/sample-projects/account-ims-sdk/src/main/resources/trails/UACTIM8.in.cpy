      *****************************************************************
      * UACTIM8.cpy - UPDATE ACCOUNT - IMS & DB2 with COMP-3
      *****************************************************************
            02 IN-PUT.
              07 ACTI-ACCOUNT-ID                PIC X(11).
              07 ACTI-CUSTOMER-ID               PIC X(16).
              07 ACTI-CUSTOMER-NAME             PIC X(16).
              07 ACTI-IBAN                      PIC X(32).
              07 ACTI-CNTRY-CD                  PIC X(2).
              07 ACTI-BNK-ID                    PIC X(4).
              07 ACTI-BRNCH-ID                  PIC S9(9) COMP.
              07 ACTI-TYPCD                     PIC X.
              07 ACTI-TYPE-NAME                 PIC X(12).
              07 ACTI-SUB-TYPCD                 PIC X(3).
              07 ACTI-TYPE-DESCRIPTION          PIC X(40).
              07 ACTI-BALANCE                   PIC S9(11)V9(3) COMP-3.
              07 ACTI-CURRENCY                  PIC X(3).
              07 ACTI-CRT-DT                    PIC X(8).
              07 ACTI-UPDT-DT                   PIC X(8).
              07 ACTI-LOCKED                    PIC X.
