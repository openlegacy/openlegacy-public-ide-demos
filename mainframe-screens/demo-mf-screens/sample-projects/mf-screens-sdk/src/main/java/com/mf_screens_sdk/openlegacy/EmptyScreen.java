package com.mf_screens_sdk.openlegacy;

import org.openlegacy.core.annotations.screen.Identifier;
import org.openlegacy.core.annotations.screen.ScreenEntity;
import org.openlegacy.core.annotations.screen.ScreenField;
import org.openlegacy.core.annotations.screen.ScreenIdentifiers;
import org.openlegacy.core.annotations.screen.ScreenNavigation;
import org.openlegacy.core.terminal.actions.TerminalActions.ESCAPE;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ScreenEntity(rows = 24, columns = 80)
@ScreenIdentifiers(identifiers = { 
		@Identifier(row = 3, column = 1, value = "                                                                                ")
		, @Identifier(row = 5, column = 1, value = "                                                                                ")
		, @Identifier(row = 7, column = 1, value = "                                                                                ")
                })
@ScreenNavigation(terminalAction = ESCAPE.class, accessedFrom = CICS.class)
public class EmptyScreen implements org.openlegacy.core.terminal.ScreenEntity {
    @ScreenField(row = 1, column = 1, endColumn = 80, editable = true, displayName = "New Field2")
	private String newField2;
    private String focusField;
}
