CBL NODYNAM,OBJECT,APOST,NOSEQ
      **************************************************************
      * RACTCS9 - RESET ALL ACCOUNTS FOR CICS AND DB2.
      **************************************************************
        IDENTIFICATION DIVISION.
        PROGRAM-ID. RACTCS9.
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
        01 ACTW-WS.
           05 ACTW-DETAILS.
            07 ACTW-ACCOUNT-ID                PIC X(11).
            07 ACTW-CUSTOMER-ID               PIC X(16).
            07 ACTW-CUSTOMER-NAME             PIC X(16).
            07 ACTW-TYPCD                     PIC X.
            07 ACTW-SUB-TYPCD                 PIC X(3).
            07 ACTW-CNTRY-CD                  PIC X(2).
            07 ACTW-BNK-ID                    PIC X(4).
            07 ACTW-BRNCH-ID                  PIC S9(9) COMP.
            07 ACTW-INITIAL-DEPOSIT
                     PIC S9(11)V9(3) USAGE COMP-3.
            07 ACTW-CURRENCY                  PIC X(3).
      **************************************************************
        01 COUNTER                            PIC 9(2)   VALUE 0.
        01 NUMREC                             PIC 9(2)   VALUE 10.
        01 SPACE-COUNT                        PIC S9.
        01 TXT-SQLCODE                        PIC X(12) VALUE SPACES.
        01 TXT-SQLSTATE                       PIC X(12) VALUE SPACES.
        01 TXT-SQLERRMC                       PIC X(70) VALUE SPACES.
        01 SQLMODE-MSG.
          03 SQLMODE                          PIC X(8)  VALUE SPACES.
          03 SQLMODE-MSG-REST                 PIC X(20) VALUE SPACES.
        01 COUNT-MSG.
          03 COUNT-TXT                        PIC X(4)  VALUE SPACES.
          03 COUNT-MORE             PIC X(20) VALUE ' ACCOUNTS ADDED'.
        01 EODATA                             PIC X(1)  VALUE 'N'.
        01 IBAN-STRC.
          03 IBAN-CNTRY-CD                    PIC X(2).
          03 IBAN-CHECK-DIGITS                PIC S9(2).
          03 IBAN-BNK-ID                      PIC X(4).
          03 IBAN-BRNCH-ID                    PIC X(6).
          03 FILLER                           PIC X(7) VALUE SPACES.
        01 WS-CURRENT-DATE-DATA.
          03 WS-CURRENT-DATE.
            05 WS-CURRENT-YEAR                PIC 9(04).
            05 WS-CURRENT-MONTH               PIC 9(02).
            05 WS-CURRENT-DAY                 PIC 9(02).
          03 WS-CURRENT-TIME.
            05 WS-CURRENT-HOURS               PIC 9(02).
            05 WS-CURRENT-MINUTE              PIC 9(02).
            05 WS-CURRENT-SECOND              PIC 9(02).
            05 WS-CURRENT-MILLISECONDS        PIC 9(02).
      **************************************************************
      *  VALUES NOT PART OF INPUT, BUT PART OF OUTPUT.
      **************************************************************
        01 ACTW-BALANCE                PIC S9(11)V9(3) USAGE COMP-3.
        01 ACTW-IBAN                          PIC X(32).
        01 ACTW-TYPE-NAME                     PIC X(12).
        01 ACTW-TYPE-DESCRIPTION              PIC X(40).
        01 ACTW-CRT-DT                        PIC X(8).
        01 ACTW-UPDT-DT                       PIC X(8).
        01 ACTW-LOCKED                        PIC X.
      **************************************************************
        LINKAGE SECTION.
      **************************************************************
        01 DFHCOMMAREA.
          03 IN-PUT.
           04 ACCOUNT-ARRAY                OCCURS 10 TIMES.
            05 ACTI-DETAILS.
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
          03  OUT-PUT.
            05 RT-MSG                           PIC X(60).
      **************************************************************
      * PROCEDURE DIVISION.
      **************************************************************
       PROCEDURE DIVISION.
       MAIN-RTN. 
      * FIRST DELETE CURRENT ACCOUNTS
           PERFORM DO-DECLARE-GET THRU DO-DECLARE-GET-END
           PERFORM DO-OPENCURSOR THRU DO-OPENCURSOR-END
           PERFORM DO-GETALL THRU DO-GETALL-END
           PERFORM DO-FETCH-DELETE THRU DO-FETCH-DELETE-END
           PERFORM DO-CLOSECURSOR THRU DO-CLOSECURSOR-END
      * NOW ADD NEW ACCOUNTS
           MOVE 1 TO COUNTER
           PERFORM DO-NEW-REC THRU DO-NEW-REC-END 10 TIMES
           MOVE COUNTER TO COUNT-TXT
           MOVE COUNT-MSG TO RT-MSG
      * ADDED 1 IN ANTICIPATION, BUT RECORD NOT ADDED
           SUBTRACT 1 FROM COUNTER.
           DISPLAY COUNTER ' ACCOUNTS ADDED.'
           GOBACK.
      **************************************************************
       DO-NEW-REC.
           MOVE ACCOUNT-ARRAY(COUNTER) TO ACTW-DETAILS.
           IF ACTW-ACCOUNT-ID NOT EQUAL SPACES
              DISPLAY 'ADDING: ' ACTW-ACCOUNT-ID
              PERFORM ADD-ACCOUNT-FIELDS THRU ADD-ACCOUNT-FIELDS-END
              PERFORM DO-SQL-ADD THRU DO-SQL-ADD-END
              ADD 1 TO COUNTER
           END-IF.
       DO-NEW-REC-END.
            EXIT. 
      **************************************************************
       DO-DECLARE-GET.
            EXEC SQL
               DECLARE GETX CURSOR FOR 
                SELECT 
                  ACCT_ACCOUNT_ID
                FROM OLS0002.ACCOUNT2
            END-EXEC
            MOVE 'DECLARE' TO SQLMODE
            PERFORM DO-POSTSQL THRU DO-POSTSQL-END.
       DO-DECLARE-GET-END.
           EXIT. 
      **************************************************************
       DO-OPENCURSOR.
           EXEC SQL
              OPEN GETX
           END-EXEC.
           MOVE 'OPENCUR' TO SQLMODE              
           PERFORM DO-POSTSQL THRU DO-POSTSQL-END.
       DO-OPENCURSOR-END.
           EXIT.
      **************************************************************
       DO-GETALL.  
           MOVE 'N' TO EODATA
           MOVE 0 TO COUNTER
           PERFORM DO-FETCH-DELETE THRU DO-FETCH-DELETE-END 
              UNTIL COUNTER >= NUMREC OR EODATA = 'Y'
           IF EODATA = 'Y'
              SUBTRACT 1 FROM COUNTER
           END-IF
      *LAST FETCH WAS END OF DATA
           DISPLAY 'NUMBER OF FETCHES: ' COUNTER.
       DO-GETALL-END.            
           EXIT. 
      **************************************************************
      * FETCH A RECORD, AND THEN DELETE IT.  
      **************************************************************
       DO-FETCH-DELETE.
           MOVE 'DO-FETCH' TO SQLMODE
           EXEC SQL
                FETCH GETX INTO  
                  :ACTW-ACCOUNT-ID
           END-EXEC.
      *  SHAYNA
           DISPLAY 'FETCH ' ACTW-ACCOUNT-ID
           PERFORM DO-POSTSQL THRU DO-POSTSQL-END
      *
           MOVE 'DELETE' TO SQLMODE
           EXEC SQL
                DELETE FROM OLS0002.ACCOUNT2 WHERE      
                  ACCT_ACCOUNT_ID = :ACTW-ACCOUNT-ID
           END-EXEC.
           PERFORM DO-POSTSQL THRU DO-POSTSQL-END.
       DO-FETCH-DELETE-END.
           EXIT.
      **************************************************************
       DO-CLOSECURSOR.
           EXEC SQL
              CLOSE GETX
           END-EXEC.
           MOVE 'CLOSECUR' TO SQLMODE
           PERFORM DO-POSTSQL THRU DO-POSTSQL-END.
       DO-CLOSECURSOR-END.
           EXIT.
      **************************************************************	
       ADD-ACCOUNT-FIELDS.
            EVALUATE ACTW-SUB-TYPCD
              WHEN 'BC'
                 MOVE 'Basic Checking Account' TO ACTW-TYPE-DESCRIPTION
              WHEN 'S'
                 MOVE 'Savings Account' TO ACTW-TYPE-DESCRIPTION
              WHEN 'IBC'
                 MOVE 'Interest Bearing Checking'
                     TO ACTW-TYPE-DESCRIPTION
              WHEN 'MM'
                 MOVE 'Money Market Account'
                     TO ACTW-TYPE-DESCRIPTION
              WHEN 'IRA'
                 MOVE 'Investment Retirement Account'
                     TO ACTW-TYPE-DESCRIPTION
              WHEN 'B'
                 MOVE 'Brokerage Account' TO ACTW-TYPE-DESCRIPTION
            END-EVALUATE.

            EVALUATE ACTW-TYPCD
              WHEN 'B'
                 MOVE 'Business' TO ACTW-TYPE-NAME
              WHEN 'P'
                 MOVE 'Personal' TO ACTW-TYPE-NAME
            END-EVALUATE.

            MOVE ACTW-INITIAL-DEPOSIT TO ACTW-BALANCE.
			
            MOVE FUNCTION CURRENT-DATE to WS-CURRENT-DATE-DATA.
            MOVE WS-CURRENT-DATE TO ACTW-CRT-DT.
            MOVE WS-CURRENT-DATE TO ACTW-UPDT-DT.
            MOVE 'N' TO ACTW-LOCKED.

            MOVE ACTW-CNTRY-CD TO IBAN-CNTRY-CD
            MOVE 29 TO IBAN-CHECK-DIGITS
            MOVE ACTW-BNK-ID TO IBAN-BNK-ID
            MOVE ACTW-BRNCH-ID TO IBAN-BRNCH-ID
            MOVE IBAN-STRC TO ACTW-IBAN. 
       ADD-ACCOUNT-FIELDS-END.            
           EXIT. 
      **************************************************************
       DO-SQL-ADD.
            MOVE 'ADD' TO SQLMODE
            EXEC SQL
                  INSERT INTO OLS0002.ACCOUNT2 (
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
                     ACCT_LOCKED)
                  VALUES ( 
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
                     :ACTW-LOCKED)
            END-EXEC.
            PERFORM DO-POSTSQL THRU DO-POSTSQL-END.
       DO-SQL-ADD-END.
           EXIT. 
      **************************************************************	
       DO-POSTSQL.
            MOVE SQLCODE TO TXT-SQLCODE
            MOVE SQLSTATE TO TXT-SQLSTATE
            MOVE SQLERRMC TO TXT-SQLERRMC

            IF SQLCODE = 0 
               MOVE ' SUCCESSFUL: ' TO SQLMODE-MSG-REST
            ELSE IF SQLCODE = 100
               MOVE 'Y' TO EODATA
            ELSE
               MOVE ' NOT SUCCESSFUL: ' TO SQLMODE-MSG-REST
               DISPLAY SQLMODE-MSG

               DISPLAY 'SQLCODE:  ' TXT-SQLCODE
               DISPLAY 'SQLSTATE: ' TXT-SQLSTATE
               DISPLAY 'SQLERRMC: ' TXT-SQLERRMC
            END-IF.
            MOVE SQLMODE-MSG TO RT-MSG.
       DO-POSTSQL-END.
           EXIT.
      **************************************************************	

