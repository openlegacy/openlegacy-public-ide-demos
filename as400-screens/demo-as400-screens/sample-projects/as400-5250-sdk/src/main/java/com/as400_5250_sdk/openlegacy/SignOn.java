package com.as400_5250_sdk.openlegacy;

import org.openlegacy.core.annotations.screen.Identifier;
import org.openlegacy.core.annotations.screen.ScreenEntity;
import org.openlegacy.core.annotations.screen.ScreenField;
import org.openlegacy.core.annotations.screen.ScreenIdentifiers;
import org.openlegacy.core.model.entity.EntityType;
import org.openlegacy.core.model.field.ScreenFieldType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ScreenEntity(rows = 24, columns = 80, screenType = EntityType.Login)
@ScreenIdentifiers(identifiers = { 
                @Identifier(row = 1, column = 36, value = "Sign On             "), 
                @Identifier(row = 4, column = 48, value = "Display . . . . . :"), 
                @Identifier(row = 6, column = 17, value = "User  . . . . . . . . . . . . . .") 
                })
public class SignOn implements org.openlegacy.core.terminal.ScreenEntity {

    @ScreenField(row = 2, column = 70, endColumn= 77, labelColumn= 48, displayName = "System")
    private String system;

    @ScreenField(row = 3, column = 70, endColumn= 79, labelColumn= 48, displayName = "Subsystem")
    private String subsystem;

    @ScreenField(row = 4, column = 70, endColumn= 79, labelColumn= 48, displayName = "Display")
    private String display;

    @ScreenField(row = 6, column = 53, endColumn= 62, labelColumn= 17, editable= true, fieldType=ScreenFieldType.UserField.class, displayName = "User")
    private String user;

    @ScreenField(row = 7, column = 53, endColumn= 62, labelColumn= 17, editable= true, fieldType=ScreenFieldType.PasswordField.class, displayName = "Password")
    private String password;

    @ScreenField(row = 8, column = 53, endColumn= 62, labelColumn= 17, editable= true, displayName = "Program/procedure")
    private String programprocedure;

    @ScreenField(row = 9, column = 53, endColumn= 62, labelColumn= 17, editable= true, displayName = "Menu")
    private String menu_;

    @ScreenField(row = 10, column = 53, endColumn= 62, labelColumn= 17, editable= true, displayName = "Current library")
    private String currentLibrary;

    @ScreenField(row = 24, column = 2, fieldType=ScreenFieldType.ErrorField.class)
    private String errorMessage;
    
    private String focusField;
}
