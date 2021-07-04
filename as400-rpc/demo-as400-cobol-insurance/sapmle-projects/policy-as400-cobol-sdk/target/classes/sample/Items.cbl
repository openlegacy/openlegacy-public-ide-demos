      IDENTIFICATION DIVISION.
      PROGRAM-ID. ITEMS.
      DATA DIVISION.                                                                                                                 
      LINKAGE SECTION.                                                         
      01 TOP-LEVEL.                                                                 
         03 INNER-RECORD      OCCURS 5 TIMES.                                         
            05  ITEM-NUMBER               PIC 9(4).                                    
            05  ITEM-NAME              PIC X(16).                                   
            05  DESCRIPTION       PIC X(28).                                   
      PROCEDURE DIVISION USING TOP-LEVEL.                                           
      BEGIN.                                                                   
          MOVE 1000 TO NUM(1)                                                  
          MOVE 'Kid Guitar     ' TO NAME(1)                                    
          MOVE 'Kids Guitar - Musical Toys ' TO DESCRIPTION(1).                
          MOVE 1001 TO NUM(2)                                                  
          MOVE 'Ball Pool      ' TO NAME(2)                                    
          MOVE 'Ball Pool - Novelty Toys   ' TO DESCRIPTION(2).                
          MOVE 1002 TO NUM(3)                                                  
          MOVE 'Water Ball     ' TO NAME(3)                                    
          MOVE 'Water Ball - Balls         ' TO DESCRIPTION(3).                
          MOVE 1003 TO NUM(4)                                                  
          MOVE 'Frisbee        ' TO NAME(4)                                    
          MOVE 'Dog Frisbee - Pet Toys     ' TO DESCRIPTION(4).                
          MOVE 1004 TO NUM(5)                                                  
          MOVE 'Pig Bank       ' TO NAME(5)                                    
          MOVE 'Pig Saving Bank - Ceramics ' TO DESCRIPTION(5).                
      HALT.                                                                    
