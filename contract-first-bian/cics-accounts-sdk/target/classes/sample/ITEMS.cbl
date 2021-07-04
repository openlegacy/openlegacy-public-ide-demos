        IDENTIFICATION DIVISION.
        PROGRAM-ID. ITEMS.
        DATA DIVISION.
        LINKAGE SECTION.
        01 DFHCOMMAREA.
           03 INNER-RECORD      OCCURS 5 TIMES.
              05  ITEM-NUMBER            PIC S9(4) COMP.
              05  ITEM-NAME              PIC X(16).
              05  DESCRIPTION       PIC X(28).
        PROCEDURE DIVISION.
            MOVE 1000 TO ITEM-NUMBER(1)
            MOVE 'Kid Guitar     ' TO ITEM-NAME(1)
            MOVE 'Kids Guitar - Musical Toys ' TO DESCRIPTION(1).
            MOVE 1001 TO ITEM-NUMBER(2)
            MOVE 'Ball Pool      ' TO ITEM-NAME(2)
            MOVE 'Ball Pool - Novelty Toys   ' TO DESCRIPTION(2).
            MOVE 1002 TO ITEM-NUMBER(3)
            MOVE 'Water Ball     ' TO ITEM-NAME(3)
            MOVE 'Water Ball - Balls         ' TO DESCRIPTION(3).
            MOVE 1003 TO ITEM-NUMBER(4)
            MOVE 'Frisbee        ' TO ITEM-NAME(4)
            MOVE 'Dog Frisbee - Pet Toys     ' TO DESCRIPTION(4).
            MOVE 1004 TO ITEM-NUMBER(5)
            MOVE 'Pig Bank       ' TO ITEM-NAME(5)
            MOVE 'Pig Saving Bank - Ceramics ' TO DESCRIPTION(5).
            EXEC CICS RETURN END-EXEC
            .
