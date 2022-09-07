package com.as400_5250_sdk.openlegacy;

import lombok.Getter;
import lombok.Setter;
import org.openlegacy.core.annotations.screen.*;
import org.openlegacy.core.terminal.actions.TerminalActions;
import org.openlegacy.core.model.entity.EntityType;
import org.openlegacy.core.model.field.ScreenFieldType;
import org.openlegacy.core.terminal.actions.TerminalAction.AdditionalKey;
import org.openlegacy.core.model.entity.EntityType;
import org.openlegacy.core.model.field.ScreenFieldType.MenuEntity;
import org.openlegacy.core.terminal.actions.TerminalActions.F12;
import com.as400_5250_sdk.openlegacy.UserTasks;

@Getter
@Setter
@ScreenEntity(rows = 24, columns = 80, screenType = EntityType.Menu)
@ScreenIdentifiers(identifiers = { 
                @Identifier(row = 1, column = 34, value = "Work with Job"), 
                @Identifier(row = 5, column = 2, value = "Select one of the following:"), 
                @Identifier(row = 19, column = 68, value = "     More...") 
                })
@ScreenActions(actions = {
                @Action(action = TerminalActions.F3.class, displayName = "Exit", alias = "exit"), 
                @Action(action = TerminalActions.F4.class, displayName = "Prompt", alias = "prompt"), 
                @Action(action = TerminalActions.F9.class, displayName = "Retrieve", alias = "retrieve"), 
                @Action(action = TerminalActions.F12.class, displayName = "Cancel", alias = "cancel") 
                })
@ScreenNavigation(accessedFrom = UserTasks.class, assignedFields = {
		@AssignedField(field = "menuSelection", value = "1") }, exitAction = F12.class)
public class WorkWithJob implements org.openlegacy.core.terminal.ScreenEntity {

    @ScreenField(row = 3, column = 9, endColumn= 18, labelColumn= 2, displayName = "Job")
    private String job;

    @ScreenField(row = 3, column = 32, endColumn= 41, labelColumn= 24, displayName = "User")
    private String user;

    @ScreenField(row = 3, column = 57, endColumn= 62, labelColumn= 47, displayName = "Number")
    private Integer number;

    @ScreenField(row = 21, column = 7, endColumn= 79, editable= true, fieldType=ScreenFieldType.MenuEntity.class, displayName = "Menu Selection")
    private String menuSelection;
    
    private String focusField;
}
