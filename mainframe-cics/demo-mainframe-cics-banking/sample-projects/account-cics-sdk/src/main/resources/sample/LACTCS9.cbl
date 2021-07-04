CBL NODYNAM,OBJECT,APOST,NOSEQ
      **************************************************************
      * LACTCS9 - LIST ACCOUNTS FOR CICS AND DB2.
      **************************************************************
        IDENTIFICATION DIVISION.
        PROGRAM-ID. LACTCS9.
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
        01 ACCOUNT-WS.
          05 ACCOUNT-DETAILS.
            07 ACTW-ACCOUNT-ID      PIC X(11).
            07 ACTW-CUSTOMER-ID     PIC X(16).
            07 ACTW-CUSTOMER-NAME   PIC X(16).
            07 ACTW-IBAN            PIC X(32).
            07 ACTW-BNK-ID          PIC X(4).
            07 ACTW-BRNCH-ID        PIC S9(9) COMP.
            07 ACTW-CNTRY-CD        PIC X(2).
            07 ACTW-TYPCD           PIC X(1).
            07 ACTW-SUB-TYPCD       PIC X(3).
            07 ACTW-TYPE-NAME       PIC X(12).
            07 ACTW-TYPE-DESCRIPTION  PIC X(40).
            07 ACTW-BALANCE         PIC S9(11)V9(3) USAGE COMP-3.
            07 ACTW-CURRENCY        PIC X(3).
            07 ACTW-CRT-DT          PIC X(8).
            07 ACTW-UPDT-DT         PIC X(8).
            07 ACTW-LOCKED          PIC X(1).
      ****************************************************
        01 SPACE-COUNT              PIC S9.
        01 TXT-SQLCODE              PIC X(12) VALUE SPACES.
        01 TXT-SQLSTATE             PIC X(12) VALUE SPACES.
        01 TXT-SQLERRMC             PIC X(70) VALUE SPACES.
      **************************************************************
        01 EODATA            PIC X(1)   VALUE 'N'.
        01 NUMREC            PIC 9(2)   VALUE 10.
        01 COUNTER           PIC 9(2)   VALUE 0.
        01 NUMIDS            PIC 9(2)   VALUE 0.
        01 SQLCODE-NUM       PIC S9(4)  VALUE 0.
        01 SQLMODE           PIC X(8)   VALUE SPACES.
      **************************************************************
        LINKAGE SECTION.
      **************************************************************
        01 DFHCOMMAREA.
          03 IN-PUT.
            05 ONECHAR                    PIC X(1) VALUE 'A'.
          03 OUT-PUT.
           04 RT-MSG                       PIC X(60).
           04 ACCOUNT-ARRAY                OCCURS 10 TIMES.
            05 ACTO-DETAILS.
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
      **************************************************************
       PROCEDURE DIVISION.
       MAIN-RTN.
      *    NO INPUT TO GET
           PERFORM DO-DECLARE THRU DO-DECLARE-END
           PERFORM DO-OPENCURSOR THRU DO-OPENCURSOR-END
           PERFORM DO-GETALL THRU DO-GETALL-END
           PERFORM DO-CLOSECURSOR THRU DO-CLOSECURSOR-END
           GOBACK.
      **************************************************************
       DO-DECLARE.
            EXEC SQL
               DECLARE X CURSOR FOR 
                SELECT 
                  ACCT_ACCOUNT_ID,
                  ACCT_CUSTOMER_ID,
                  ACCT_CUSTOMER_NAME,
                  ACCT_IBAN,
                  ACCT_BNK_ID,
                  ACCT_BRNCH_ID,
                  ACCT_CNTRY_CD,
                  ACCT_TYPCD,
                  ACCT_SUB_TYPCD,
                  ACCT_TYPE_NAME,
                  ACCT_TYPE_DESCRIPTION,
                  ACCT_BALANCE,
                  ACCT_CURRENCY, 
                  ACCT_CRT_DT, 
                  ACCT_UPDT_DT,
                  ACCT_LOCKED 
                FROM OLS0002.ACCOUNT2
            END-EXEC
            MOVE 'DECLARE' TO SQLMODE
            PERFORM DO-POSTSQL THRU DO-POSTSQL-END.
       DO-DECLARE-END.
           EXIT. 
      **************************************************************
       DO-OPENCURSOR.
           EXEC SQL
              OPEN X
           END-EXEC.
           MOVE 'OPENCUR' TO SQLMODE              
           PERFORM DO-POSTSQL THRU DO-POSTSQL-END.
       DO-OPENCURSOR-END.
           EXIT.
      **************************************************************
       DO-GETALL.  
           MOVE 'N' TO EODATA
           MOVE 0 TO COUNTER
           PERFORM DO-FETCH THRU DO-FETCH-END 
              UNTIL COUNTER >= NUMREC OR EODATA = 'Y'
           IF EODATA = 'Y'
              SUBTRACT 1 FROM COUNTER
           END-IF
      *LAST FETCH WAS END OF DATA
           DISPLAY 'NUMBER OF FETCHES: ' COUNTER.
       DO-GETALL-END.            
           EXIT. 
      **************************************************************
      * DO ONE FETCH. 
      **************************************************************
       DO-FETCH.
           MOVE LOW-VALUES TO ACCOUNT-DETAILS
           ADD 1 TO COUNTER
           EXEC SQL
                FETCH X INTO  
                  :ACTW-ACCOUNT-ID,
                  :ACTW-CUSTOMER-ID,
                  :ACTW-CUSTOMER-NAME,
                  :ACTW-IBAN,
                  :ACTW-BNK-ID,
                  :ACTW-BRNCH-ID,
                  :ACTW-CNTRY-CD,
                  :ACTW-TYPCD,
                  :ACTW-SUB-TYPCD,
                  :ACTW-TYPE-NAME,
                  :ACTW-TYPE-DESCRIPTION,
                  :ACTW-BALANCE,
                  :ACTW-CURRENCY,
                  :ACTW-CRT-DT,
                  :ACTW-UPDT-DT,
                  :ACTW-LOCKED
           END-EXEC.
           MOVE ACCOUNT-DETAILS TO ACCOUNT-ARRAY(COUNTER)
           MOVE 'DO-FETCH' TO SQLMODE
           PERFORM DO-POSTSQL THRU DO-POSTSQL-END.
       DO-FETCH-END.
           EXIT.
      **************************************************************
       DO-CLOSECURSOR.
           EXEC SQL
              CLOSE X
           END-EXEC.
           MOVE 'CLOSECUR' TO SQLMODE
           PERFORM DO-POSTSQL THRU DO-POSTSQL-END.
       DO-CLOSECURSOR-END.
           EXIT.
      **************************************************************	
       DO-POSTSQL.
            IF SQLCODE = 0 
               DISPLAY 'CUSTOMER = ' ACTW-CUSTOMER-NAME
               MOVE 'SUCCESSFUL LIST' TO RT-MSG
               MOVE 'N' TO EODATA
            ELSE IF SQLCODE = 100
               MOVE 'Y' TO EODATA
            ELSE
               DISPLAY 'SQLMODE: ' SQLMODE
               MOVE 'NOT SUCCESSFUL LIST' TO RT-MSG
               MOVE 'Y' TO EODATA
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
