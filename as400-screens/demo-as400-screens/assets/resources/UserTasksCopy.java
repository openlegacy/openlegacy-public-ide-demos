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

@Getter
@Setter
@ScreenEntity(rows = 24, columns = 80, screenType = EntityType.Menu)
@ScreenIdentifiers(identifiers = { 
                @Identifier(row = 1, column = 36, value = "User Tasks"), 
                @Identifier(row = 19, column = 2, value = "Selection or command") 
                })
@ScreenActions(actions = {
                @Action(action = TerminalActions.F3.class, displayName = "Exit", alias = "exit"), 
                @Action(action = TerminalActions.F4.class, displayName = "Prompt", alias = "prompt"), 
                @Action(action = TerminalActions.F9.class, displayName = "Retrieve", alias = "retrieve"), 
                @Action(action = TerminalActions.F12.class, displayName = "Cancel", alias = "cancel"), 
                @Action(action = TerminalActions.F1.class, additionalKey= AdditionalKey.SHIFT, displayName = "Information Assistant", alias = "informationAssistant"), 
                @Action(action = TerminalActions.F4.class, additionalKey= AdditionalKey.SHIFT, displayName = "System Main menu", alias = "systemMainMenu") 
                })
@ScreenNavigation(accessedFrom = IbmIMainMenu.class 
                    , assignedFields = { 
                    @AssignedField(field = "menuSelection", value = "1")
                     }                      
                    )
public class UserTasks implements org.openlegacy.core.terminal.ScreenEntity {

    @ScreenField(row = 20, column = 7, endColumn= 79, editable= true, fieldType=ScreenFieldType.MenuEntity.class, displayName = "Menu Selection")
    private String menuSelection;
    
    private String focusField;
}
