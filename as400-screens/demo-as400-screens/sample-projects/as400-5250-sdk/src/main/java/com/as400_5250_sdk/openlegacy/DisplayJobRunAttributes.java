package com.as400_5250_sdk.openlegacy;

import org.openlegacy.core.annotations.screen.Action;
import org.openlegacy.core.annotations.screen.AssignedField;
import org.openlegacy.core.annotations.screen.Identifier;
import org.openlegacy.core.annotations.screen.ScreenActions;
import org.openlegacy.core.annotations.screen.ScreenEntity;
import org.openlegacy.core.annotations.screen.ScreenField;
import org.openlegacy.core.annotations.screen.ScreenIdentifiers;
import org.openlegacy.core.annotations.screen.ScreenNavigation;
import org.openlegacy.core.terminal.actions.TerminalAction.AdditionalKey;
import org.openlegacy.core.terminal.actions.TerminalActions;
import org.openlegacy.core.terminal.actions.TerminalActions.F12;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ScreenEntity(rows = 24, columns = 80)
@ScreenIdentifiers(identifiers = { 
                @Identifier(row = 1, column = 28, value = "Display Job Run Attributes              "), 
                @Identifier(row = 5, column = 2, value = "Run priority  . . . . . . . . . . . . . . . . . . :"), 
                @Identifier(row = 6, column = 2, value = "Time slice in milliseconds  . . . . . . . . . . . :") 
                })
@ScreenActions(actions = {
                @Action(action = TerminalActions.F3.class, displayName = "Exit", alias = "exit"), 
                @Action(action = TerminalActions.F5.class, displayName = "Refresh", alias = "refresh"), 
                @Action(action = TerminalActions.F9.class, displayName = "Change job", alias = "changeJob"), 
                @Action(action = TerminalActions.F12.class, displayName = "Cancel", alias = "cancel"), 
                @Action(action = TerminalActions.F4.class, additionalKey= AdditionalKey.SHIFT, displayName = "Job menu", alias = "jobMenu") 
                })
@ScreenNavigation(accessedFrom = WorkWithJob.class, assignedFields = {
		@AssignedField(field = "menuSelection", value = "3") }, exitAction = F12.class)
public class DisplayJobRunAttributes implements org.openlegacy.core.terminal.ScreenEntity {

    @ScreenField(row = 3, column = 9, endColumn= 18, labelColumn= 2, displayName = "Job")
    private String job;

    @ScreenField(row = 3, column = 32, endColumn= 41, labelColumn= 24, displayName = "User")
    private String user;

    @ScreenField(key = true, row = 3, column = 57, endColumn= 62, labelColumn= 47, displayName = "Number")
    private Integer number;

    @ScreenField(row = 10, column = 58, endColumn= 67, labelColumn= 4, displayName = "CPU time used")
    private Integer cpuTimeUsed;

    @ScreenField(row = 12, column = 58, endColumn= 67, labelColumn= 4, displayName = "Temporary storage used")
    private Integer temporaryStorageUsed;

    @ScreenField(row = 14, column = 58, endColumn= 67, labelColumn= 4, displayName = "Threads")
    private Integer threads;

    @ScreenField(row = 16, column = 56, endColumn= 65, labelColumn= 4, displayName = "Group")
    private String group;

    @ScreenField(row = 17, column = 56, endColumn= 65, labelColumn= 4, displayName = "Level")
    private String level;
    
    private String focusField;
}
