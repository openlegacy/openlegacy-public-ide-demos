CBL NODYNAM,OBJECT,APOST,NOSEQ
      **************************************************************
      * DACTCS9 - DELETE ACCOUNT FOR CICS AND DB2.
      **************************************************************
        IDENTIFICATION DIVISION.
        PROGRAM-ID. DACTCS9.
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
        01 BAD-SQL-MESSAGE.         
          03 BAD-SQL-MSG-1          PIC X(40).
          03 BAD-SQL-MSG-2          PIC X(10).
          03 BAD-SQL-MSG-3          PIC X(10).
      **************************************************************
        01 CT-FUNC           PIC X(18) VALUE 'CREATE THREAD     '.
        01 ID-FUNC           PIC X(18) VALUE 'IDENTIFY          '.
        01 SO-FUNC           PIC X(18) VALUE 'SIGNON            '.
        01 CONNECT-FUNC      PIC X(18) VALUE 'CONNECT           '.
        01 PLAN              PIC X(8)  VALUE 'PACTCS9 '.
        01 COLLID            PIC X(18) VALUE SPACES.
        01 REUSE             PIC X(8)  VALUE 'INITIAL'.
        01 RETCODE           PIC S9(8) COMP VALUE 0.
        01 REASCODE          PIC S9(8) COMP VALUE 0.
        01 PKLSTPTR          PIC X(4)  VALUE SPACES.
      *
        01 DB2SSNM           PIC X(4)  VALUE SPACES.
        01 RIBPTR            PIC X(4)  VALUE SPACES.
        01 EIBPTR            PIC X(4)  VALUE SPACES.
        01 TERMECB           PIC X(4)  VALUE SPACES.
        01 STARTECB          PIC X(4)  VALUE SPACES.
        01 GRPOVER           PIC X(8)  VALUE SPACES.
        01 DECPPTR           PIC X(4)  VALUE SPACES.
      *
        01 CORR-ID           PIC X(12)  VALUE SPACES.
        01 ACC-TOKEN         PIC X(22)  VALUE SPACES.
        01 ACC-INT           PIC X(6)   VALUE SPACES.
        01 USER              PIC X(16)  VALUE 'OLS0002'.
        01 APPL              PIC X(32)  VALUE 'DACTCS9'.
        01 WS                PIC X(18)  VALUE SPACES.
      *
        01 DUMMY-VAR         PIC S9(2)  COMP.
      **************************************************************
        LINKAGE SECTION.
      **************************************************************
        01 IN-PUT.
            05 ACTI-ACCOUNT-ID                  PIC X(11).
        01 ACCOUNT-OUT.
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
            05 RT-MSG                          PIC X(60).
      **************************************************************
       PROCEDURE DIVISION.
       MAIN-RTN. 
           PERFORM GET-INPUT THRU GET-INPUT-END
           PERFORM TEST-SQL THRU TEST-SQL-END
           IF SQLCODE NOT EQUAL TO 0 AND SQLCODE NOT EQUAL TO 100
              PERFORM DB2-IDENTIFY THRU DB2-IDENTIFY-END
              PERFORM DO-SIGNON THRU DO-SIGNON-END
              PERFORM CREATE-THREAD THRU CREATE-THREAD-END
           END-IF
           PERFORM DO-SQL THRU DO-SQL-END
           GOBACK.
      **************************************************************
       GET-INPUT.  
            MOVE ACTI-ACCOUNT-ID   TO ACTW-ACCOUNT-ID.
            DISPLAY 'ACCOUNT-ID = ' ACTW-ACCOUNT-ID.
       GET-INPUT-END.            
           EXIT. 
      **************************************************************	
       DB2-IDENTIFY.
           MOVE 'DBBG' TO DB2SSNM.
           CALL 'DSNCLI' USING
                 ID-FUNC DB2SSNM RIBPTR EIBPTR TERMECB STARTECB
                 RETCODE REASCODE GRPOVER DECPPTR.
           DISPLAY 'DB2-IDENTIFY RC: ' RETCODE.
           DISPLAY 'DB2-REASON CODE: ' REASCODE.
       DB2-IDENTIFY-END.
           EXIT.
      **************************************************************	
       DO-SIGNON.
           CALL 'DSNCLI' USING
             SO-FUNC CORR-ID ACC-TOKEN ACC-INT
             RETCODE REASCODE USER APPL.
           DISPLAY 'DO-SIGNON RETURN CODE: ' RETCODE.
           DISPLAY 'DO-SIGNON REASON CODE: ' REASCODE.
       DO-SIGNON-END.
           EXIT.
      **************************************************************	
       CREATE-THREAD.
           CALL 'DSNCLI' USING
                 CT-FUNC PLAN COLLID REUSE RETCODE REASCODE PKLSTPTR.
           DISPLAY 'CREATE-THREAD RETURN CODE: ' RETCODE.
           DISPLAY 'CREATE-THREAD REASON CODE: ' REASCODE.
       CREATE-THREAD-END.
           EXIT.
      **************************************************************
       DO-SQL.
            MOVE LOW-VALUES TO ACCOUNT-OUT
            SET RTCD-OK TO TRUE.
            DISPLAY  'ACTW-ACCOUNT-ID FOR DELETE: ' ACTW-ACCOUNT-ID
            EXEC SQL
                 DELETE FROM OLS0002.ACCOUNT2 WHERE      
                   ACCT_ACCOUNT_ID = :ACTW-ACCOUNT-ID
              END-EXEC.
              PERFORM DO-POSTSQL THRU DO-POSTSQL-END.
       DO-SQL-END.
           EXIT. 
      **************************************************************	
       DO-POSTSQL.
            MOVE SQLCODE TO TXT-SQLCODE
            MOVE SQLSTATE TO TXT-SQLSTATE
            MOVE SQLERRMC TO TXT-SQLERRMC
            DISPLAY 'SQLCODE:  ' TXT-SQLCODE
            DISPLAY 'SQLSTATE: ' TXT-SQLSTATE
            DISPLAY 'SQLERRMC: ' TXT-SQLERRMC

            IF SQLCODE = 0
               MOVE 'SUCCESSFUL DELETE' TO RT-MSG
            ELSE
               MOVE 'NOT SUCCESSFUL DELETE' TO RT-MSG
               DISPLAY 'DELETE NOT SUCCESSFUL.'
            END-IF.
       DO-POSTSQL-END.
           EXIT.
      **************************************************************
      * DUMMY SELECT TO TEST CONNECTION TO DB2
      **************************************************************
       TEST-SQL.
            EXEC SQL  
              SELECT 1 INTO :DUMMY-VAR FROM SYSIBM.SYSDUMMY1 WHERE 0=1 
            END-EXEC
            IF SQLCODE = 0 OR SQLCODE = 100
                DISPLAY 'TEST-SQL FOR DELETE SUCCESSFUL'
            ELSE 
                MOVE SQLCODE TO TXT-SQLCODE
                MOVE SQLSTATE TO TXT-SQLSTATE
                MOVE SQLERRMC TO TXT-SQLERRMC
                DISPLAY 'TST-SQL FOR DELETE NOT SCSFL: ' TXT-SQLCODE
                DISPLAY 'SQLSTATE: ' TXT-SQLSTATE
                DISPLAY 'SQLERRMC: ' TXT-SQLERRMC
            END-IF.
       TEST-SQL-END.            
           EXIT. 
      **************************************************************