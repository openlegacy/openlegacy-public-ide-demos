CBL NODYNAM,OBJECT,APOST,NOSEQ
      **************************************************************
      * UACTCS9 - UPDATE ACCOUNT FOR CICS AND DB2.
      **************************************************************	
        IDENTIFICATION DIVISION.
        PROGRAM-ID. UACTCS9.
        DATA DIVISION.
      **************************************************************
        WORKING-STORAGE SECTION.
      **************************************************************
            EXEC SQL
              INCLUDE SQLCA
            END-EXEC.
      **************************************************************
       01  DCLACCOUNT.
           10 ACCT_ACCOUNT_ID      PIC X(11).
           10 ACCT_CUSTOMER_ID     PIC X(16).
           10 ACCT_CUSTOMER_NAME   PIC X(16).
           10 ACCT_IBAN            PIC X(32).
           10 ACCT_BNK_ID          PIC X(4).
           10 ACCT_BRNCH_ID        PIC S9(9) COMP.
           10 ACCT_CNTRY_CD        PIC X(2).
           10 ACCT_TYPCD           PIC X(1).
           10 ACCT_SUB_TYPCD       PIC X(3).
           10 ACCT_TYPE_NAME       PIC X(12).
           10 ACCT_TYPE_DESCRIPTION  PIC X(40).
           10 ACCT_BALANCE         PIC S9(11)V9(3) USAGE COMP-3.
           10 ACCT_CURRENCY        PIC X(3).
           10 ACCT_CRT_DT          PIC X(8).
           10 ACCT_UPDT_DT         PIC X(8).
           10 ACCT_LOCKED          PIC X(1).
      **************************************************************
        01 ACTW-ACCOUNT-ID          PIC X(11).
        01 TXT-SQLCODE              PIC X(12) VALUE SPACES.
        01 TXT-SQLSTATE             PIC X(12) VALUE SPACES.
        01 TXT-SQLERRMC             PIC X(70) VALUE SPACES.
      **************************************************************
        LINKAGE SECTION.
      **************************************************************
        01 DFHCOMMAREA.
         02 UPDATE-IN.
          03 INPUT-RECORD.
            05 ACTI-ACCOUNT-ID                PIC X(11).
            05 ACTI-CUSTOMER-ID               PIC X(16).
            05 ACTI-CUSTOMER-NAME             PIC X(16).
            05 ACTI-IBAN                      PIC X(32).
            05 ACTI-CNTRY-CD                  PIC X(2).
            05 ACTI-BNK-ID                    PIC X(4).
            05 ACTI-BRNCH-ID                  PIC S9(9) COMP.
            05 ACTI-TYPCD                     PIC X.
            05 ACTI-TYPE-NAME                 PIC X(12).
            05 ACTI-SUB-TYPCD                 PIC X(3).
            05 ACTI-TYPE-DESCRIPTION          PIC X(40).
            05 ACTI-BALANCE                   PIC S9(11)V9(3) COMP-3.
            05 ACTI-CURRENCY                  PIC X(3).
            05 ACTI-CRT-DT                    PIC X(8).
            05 ACTI-UPDT-DT                   PIC X(8).
            05 ACTI-LOCKED                    PIC X.
         02  UPDATE-OUT.
          03 OUTPUT-RECORD.
              07 ACTO-ACCOUNT-ID              PIC X(11).
              07 ACTO-CUSTOMER-ID             PIC X(16).
              07 ACTO-CUSTOMER-NAME           PIC X(16).
              07 ACTO-IBAN                    PIC X(32).
              07 ACTO-CNTRY-CD                PIC X(2).
              07 ACTO-BNK-ID                  PIC X(4).
              07 ACTO-BRNCH-ID                PIC S9(9) COMP.
              07 ACTO-TYPCD                   PIC X.
              07 ACTO-TYPE-NAME               PIC X(12).
              07 ACTO-SUB-TYPCD               PIC X(3).
              07 ACTO-TYPE-DESCRIPTION        PIC X(40).
              07 ACTO-BALANCE                 PIC S9(11)V9(3) COMP-3.
              07 ACTO-CURRENCY                PIC X(3).
              07 ACTO-CRT-DT                  PIC X(8).
              07 ACTO-UPDT-DT                 PIC X(8).
              07 ACTO-LOCKED                  PIC X.
                88 ACTO-LOCKED-YES            VALUE 'Y'.
                88 ACTO-LOCKED-NO             VALUE 'N'.
          03 RT-MSG                           PIC X(60).
      **************************************************************
      * PROCEDURE DIVISION.
      **************************************************************
       PROCEDURE DIVISION.
       MAIN-RTN. 
           PERFORM GET-INPUT THRU GET-INPUT-END
           PERFORM DO-UPDATE THRU DO-UPDATE-END
           GOBACK.
      **************************************************************
       GET-INPUT.  
            MOVE ACTI-ACCOUNT-ID   TO ACTW-ACCOUNT-ID.
            DISPLAY 'ACCOUNT-ID = ' ACTW-ACCOUNT-ID.
       GET-INPUT-END.            
           EXIT. 
      **************************************************************
       DO-UPDATE.
            EXEC SQL
                  UPDATE OLS0002.ACCOUNT2 
                   SET ACCT_CUSTOMER_ID       =:ACTI-CUSTOMER-ID, 
                       ACCT_CUSTOMER_NAME     =:ACTI-CUSTOMER-NAME, 
                       ACCT_IBAN              =:ACTI-IBAN,
                       ACCT_BNK_ID            =:ACTI-BNK-ID, 
                       ACCT_BRNCH_ID          =:ACTI-BRNCH-ID, 
                       ACCT_CNTRY_CD          =:ACTI-CNTRY-CD, 			 
                       ACCT_TYPCD             =:ACTI-TYPCD,
                       ACCT_SUB_TYPCD         =:ACTI-SUB-TYPCD, 
                       ACCT_TYPE_NAME         =:ACTI-TYPE-NAME,
                       ACCT_TYPE_DESCRIPTION  =:ACTI-TYPE-DESCRIPTION,
                       ACCT_BALANCE           =:ACTI-BALANCE, 
                       ACCT_CURRENCY          =:ACTI-CURRENCY,
                       ACCT_CRT_DT            =:ACTI-CRT-DT, 
                       ACCT_UPDT_DT           =:ACTI-UPDT-DT, 
                       ACCT_LOCKED            =:ACTI-LOCKED
                  WHERE 
                     ACCT_ACCOUNT_ID = :ACTI-ACCOUNT-ID
            END-EXEC.
            MOVE INPUT-RECORD TO OUTPUT-RECORD
            PERFORM DO-POSTSQL THRU DO-POSTSQL-END.
       DO-UPDATE-END.
           EXIT. 
      **************************************************************
       DO-POSTSQL.
            IF SQLCODE = 0
               MOVE 'SUCCESSFUL UPDATE' TO RT-MSG
            ELSE
               MOVE 'NOT SUCCESSFUL UPDATE' TO RT-MSG
               DISPLAY 'UPDATE NOT SUCCESSFUL.'
      *
               MOVE SQLCODE TO TXT-SQLCODE
               MOVE SQLSTATE TO TXT-SQLSTATE
               MOVE SQLERRMC TO TXT-SQLERRMC
               DISPLAY 'SQLCODE:  ' TXT-SQLCODE
               DISPLAY 'SQLSTATE: ' TXT-SQLSTATE
               DISPLAY 'SQLERRMC: ' TXT-SQLERRMC
            END-IF.
       DO-POSTSQL-END.
           EXIT.
      **************************************************************	

