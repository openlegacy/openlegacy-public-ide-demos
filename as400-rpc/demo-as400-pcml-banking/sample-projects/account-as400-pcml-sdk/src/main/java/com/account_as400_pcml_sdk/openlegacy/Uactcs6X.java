package com.account_as400_pcml_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import org.openlegacy.core.model.legacy.type.Jt400LegacyTypes;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.Action;
import org.openlegacy.core.annotations.rpc.*;
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@RpcEntity(name="Uactcs6X", language=Languages.PCML)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "/QSYS.LIB/RMR2L1.lib/UACTCS6X.PGM", displayName = "Execute", alias = "execute" )            })
public class Uactcs6X implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(length = 11, direction = Direction.INPUT_OUTPUT, originalName = "DS_ACCOUNT", legacyType = Jt400LegacyTypes.Char.class)
    private String dsAccount;

    @RpcField(length = 16, direction = Direction.INPUT_OUTPUT, originalName = "DS_CUSTID", legacyType = Jt400LegacyTypes.Char.class)
    private String dsCustid;

    @RpcField(length = 16, direction = Direction.INPUT_OUTPUT, originalName = "DS_CUSTNAME", legacyType = Jt400LegacyTypes.Char.class)
    private String dsCustname;

    @RpcField(length = 32, direction = Direction.INPUT_OUTPUT, originalName = "DS_IBAN", legacyType = Jt400LegacyTypes.Char.class)
    private String dsIban;

    @RpcField(length = 4, direction = Direction.INPUT_OUTPUT, originalName = "DS_BANKID", legacyType = Jt400LegacyTypes.Char.class)
    private String dsBankid;

    @RpcField(length = 9, direction = Direction.INPUT_OUTPUT, originalName = "DS_BRANCHID", legacyType = Jt400LegacyTypes.Char.class)
    private String dsBranchid;

    @RpcField(length = 2, direction = Direction.INPUT_OUTPUT, originalName = "DS_CNTRYCD", legacyType = Jt400LegacyTypes.Char.class)
    private String dsCntrycd;

    @RpcField(length = 1, direction = Direction.INPUT_OUTPUT, originalName = "DS_TYPCD", legacyType = Jt400LegacyTypes.Char.class)
    private String dsTypcd;

    @RpcField(length = 3, direction = Direction.INPUT_OUTPUT, originalName = "DS_SUBTYPCD", legacyType = Jt400LegacyTypes.Char.class)
    private String dsSubtypcd;

    @RpcField(length = 12, direction = Direction.INPUT_OUTPUT, originalName = "DS_TYPENAME", legacyType = Jt400LegacyTypes.Char.class)
    private String dsTypename;

    @RpcField(length = 40, direction = Direction.INPUT_OUTPUT, originalName = "DS_TYPEDESC", legacyType = Jt400LegacyTypes.Char.class)
    private String dsTypedesc;

    @RpcField(length = 8, direction = Direction.INPUT_OUTPUT, originalName = "DS_BALANCE", legacyType = Jt400LegacyTypes.Char.class)
    private String dsBalance;

    @RpcField(length = 3, direction = Direction.INPUT_OUTPUT, originalName = "DS_CURRENCY", legacyType = Jt400LegacyTypes.Char.class)
    private String dsCurrency;

    @RpcField(length = 8, direction = Direction.INPUT_OUTPUT, originalName = "DS_CRTDT", legacyType = Jt400LegacyTypes.Char.class)
    private String dsCrtdt;

    @RpcField(length = 8, direction = Direction.INPUT_OUTPUT, originalName = "DS_UPDTDT", legacyType = Jt400LegacyTypes.Char.class)
    private String dsUpdtdt;

    @RpcField(length = 1, direction = Direction.INPUT_OUTPUT, originalName = "DS_LOCKED", legacyType = Jt400LegacyTypes.Char.class)
    private String dsLocked;

    @RpcField(length = 30, direction = Direction.INPUT_OUTPUT, originalName = "OUTPUT", legacyType = Jt400LegacyTypes.Char.class)
    private String output;

    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return Uactcs6XEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return Uactcs6XEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return Uactcs6XEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return Uactcs6XEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        Uactcs6XEntityHelper.populateFromJson(jsonObject, this);
    }

}

