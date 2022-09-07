package com.mf_screens_sdk.openlegacy;

import org.openlegacy.core.annotations.screen.Identifier;
import org.openlegacy.core.annotations.screen.ScreenEntity;
import org.openlegacy.core.annotations.screen.ScreenField;
import org.openlegacy.core.annotations.screen.ScreenIdentifiers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ScreenEntity(rows = 24, columns = 80)
@ScreenIdentifiers(identifiers = { 
		@Identifier(row = 5, column = 1, value = "              ===       ==WELCOME==TO  THE====== =======                        ")
		, @Identifier(row = 6, column = 1, value = "              ===   IBM Innovation Center - Dallas== ===                        ")
                })
public class Welcome implements org.openlegacy.core.terminal.ScreenEntity {
    @ScreenField(row = 24, column = 2, endColumn = 49, editable = true, displayName = "Command Line 1")
	private String commandLine1;
    
    private String focusField;
}
