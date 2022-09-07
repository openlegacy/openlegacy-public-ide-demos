package com.mf_screens_sdk.openlegacy;

import org.openlegacy.core.annotations.screen.AssignedField;
import org.openlegacy.core.annotations.screen.Identifier;
import org.openlegacy.core.annotations.screen.ScreenEntity;
import org.openlegacy.core.annotations.screen.ScreenIdentifiers;
import org.openlegacy.core.annotations.screen.ScreenNavigation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ScreenEntity(rows = 24, columns = 80)
@ScreenIdentifiers(identifiers = { 
		@Identifier(row = 1, column = 2, value = "WELCOME TO CICS")
		, @Identifier(row = 7, column = 57, value = "(R)")
                })
@ScreenNavigation(accessedFrom = Welcome.class, assignedFields = {
		@AssignedField(field = "commandLine1", value = "cics") })
public class CICS implements org.openlegacy.core.terminal.ScreenEntity {
    
    private String focusField;
}
