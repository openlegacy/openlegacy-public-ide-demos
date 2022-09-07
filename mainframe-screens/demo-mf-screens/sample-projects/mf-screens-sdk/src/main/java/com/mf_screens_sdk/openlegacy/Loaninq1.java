package com.mf_screens_sdk.openlegacy;

import org.openlegacy.core.annotations.screen.AssignedField;
import org.openlegacy.core.annotations.screen.Identifier;
import org.openlegacy.core.annotations.screen.ScreenEntity;
import org.openlegacy.core.annotations.screen.ScreenField;
import org.openlegacy.core.annotations.screen.ScreenIdentifiers;
import org.openlegacy.core.annotations.screen.ScreenNavigation;
import org.openlegacy.core.terminal.actions.TerminalActions.F12;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ScreenEntity(rows = 24, columns = 80)
@ScreenIdentifiers(identifiers = { 
                @Identifier(row = 1, column = 2, value = "LOANINQ1                        "), 
                @Identifier(row = 5, column = 2, value = "Loan number. . . . . . :"), 
                @Identifier(row = 7, column = 2, value = "Customer Number. . . . :") 
                })
@ScreenNavigation(exitAction = F12.class, accessedFrom = EmptyScreen.class, assignedFields = {
		@AssignedField(field = "newField2", value = "inq1") })
public class Loaninq1 implements org.openlegacy.core.terminal.ScreenEntity {

    @ScreenField(row = 5, column = 27, endColumn= 36, labelColumn= 2, editable= true, displayName = "Loan number")
    private String loanNumber;

    @ScreenField(row = 7, column = 27, endColumn= 36, labelColumn= 2, editable= true, displayName = "Customer Number")
    private String customerNumber;

    @ScreenField(row = 9, column = 27, endColumn= 36, labelColumn= 2, editable= true, displayName = "Loan Date")
    private String loanDate;

    private Loaninq2 loaninq2;
    
    private String focusField;
}
