        IDENTIFICATION DIVISION.                                           
        PROGRAM-ID. ITEMDE.
        DATA DIVISION.
        LINKAGE SECTION.
        01 DFHCOMMAREA.
           03 ITEM-NUM        PIC S9(8) COMP.
           03 ITEM-RECORD.
             05 ITEM-NAME     PIC X(16).
             05 DESCRIPTION   PIC X(28).
             05 WEIGHT        PIC S9(4) COMP.
           03 SHIPPING.
             05 SHIPPING-METHOD        PIC X(10).
             05 DAYS          PIC S9(4) COMP.
        PROCEDURE DIVISION.
            MOVE 'AIR MAIL  ' TO SHIPPING-METHOD.
            MOVE 2 TO DAYS.
            EVALUATE ITEM-NUM
              WHEN  1000
                 MOVE 'Kid Guitar     ' TO ITEM-NAME
                 MOVE 'Kids Guitar - Musical Toys   ' TO DESCRIPTION
                 MOVE 200 TO WEIGHT
              WHEN 1001
                   MOVE 'Ball Pool      ' TO ITEM-NAME
                   MOVE 'Ball Pool - Novelty Toys   ' TO DESCRIPTION
                   MOVE 100 TO WEIGHT
              WHEN 1002
                   MOVE 'Water Ball     ' TO ITEM-NAME
                   MOVE 'Water Ball - Balls         ' TO DESCRIPTION
                   MOVE 1000 TO WEIGHT
               WHEN 1003
                   MOVE 'Frisbee        ' TO ITEM-NAME
                   MOVE  'Dog Frisbee - Pet Toys     ' TO DESCRIPTION
                   MOVE 5000 TO WEIGHT
              WHEN 1004
                   MOVE 'Pig Bank       ' TO ITEM-NAME
                   MOVE 'Pig Saving Bank - Ceramics ' TO DESCRIPTION
                   MOVE 5000 TO WEIGHT
              WHEN OTHER
                 MOVE 0 TO WEIGHT
                 MOVE 'ERROR          ' TO ITEM-NAME
                 MOVE 'OBJECT NOT FOUND          ' TO DESCRIPTION
            END-EVALUATE.
            EXEC CICS RETURN END-EXEC
            .
