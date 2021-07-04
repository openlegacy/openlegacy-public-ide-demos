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
@RpcEntity(name="Gactcs6X", language=Languages.PCML)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "/QSYS.LIB/RMR2L1.lib/GACTCS6X.PGM", displayName = "Execute", alias = "execute" )            })
public class Gactcs6X implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(length = 11, direction = Direction.INPUT_OUTPUT, originalName = "INPUT", legacyType = Jt400LegacyTypes.Char.class)
    private String input;

    @RpcField(length = 11, direction = Direction.INPUT_OUTPUT, originalName = "ACCOUNT", legacyType = Jt400LegacyTypes.Char.class)
    private String account;

    @RpcField(length = 16, direction = Direction.INPUT_OUTPUT, originalName = "CUSTID", legacyType = Jt400LegacyTypes.Char.class)
    private String custid;

    @RpcField(length = 16, direction = Direction.INPUT_OUTPUT, originalName = "CUSTNAME", legacyType = Jt400LegacyTypes.Char.class)
    private String custname;

    @RpcField(length = 32, direction = Direction.INPUT_OUTPUT, originalName = "IBAN", legacyType = Jt400LegacyTypes.Char.class)
    private String iban;

    @RpcField(length = 4, direction = Direction.INPUT_OUTPUT, originalName = "BANKID", legacyType = Jt400LegacyTypes.Char.class)
    private String bankid;

    @RpcField(length = 9, direction = Direction.INPUT_OUTPUT, originalName = "BRNCHID", legacyType = Jt400LegacyTypes.Packed.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 999999999, decimalPlaces = 0)
    private Integer brnchid;

    @RpcField(length = 2, direction = Direction.INPUT_OUTPUT, originalName = "CNTRYCD", legacyType = Jt400LegacyTypes.Char.class)
    private String cntrycd;

    @RpcField(length = 1, direction = Direction.INPUT_OUTPUT, originalName = "TYPCD", legacyType = Jt400LegacyTypes.Char.class)
    private String typcd;

    @RpcField(length = 3, direction = Direction.INPUT_OUTPUT, originalName = "SUBTYPCD", legacyType = Jt400LegacyTypes.Char.class)
    private String subtypcd;

    @RpcField(length = 12, direction = Direction.INPUT_OUTPUT, originalName = "TYPENAME", legacyType = Jt400LegacyTypes.Char.class)
    private String typename;

    @RpcField(length = 40, direction = Direction.INPUT_OUTPUT, originalName = "TYPEDESC", legacyType = Jt400LegacyTypes.Char.class)
    private String typedesc;

    @RpcField(length = 14, direction = Direction.INPUT_OUTPUT, originalName = "BALANCE", legacyType = Jt400LegacyTypes.Packed.class)
    @RpcNumericField(minimumValue = 0D, maximumValue = 99999999999.999D, decimalPlaces = 3)
    private Double balance;

    @RpcField(length = 3, direction = Direction.INPUT_OUTPUT, originalName = "CURRENCY", legacyType = Jt400LegacyTypes.Char.class)
    private String currency;

    @RpcField(length = 8, direction = Direction.INPUT_OUTPUT, originalName = "CRTDT", legacyType = Jt400LegacyTypes.Packed.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 99999999, decimalPlaces = 0)
    private Integer crtdt;

    @RpcField(length = 8, direction = Direction.INPUT_OUTPUT, originalName = "UPDTDT", legacyType = Jt400LegacyTypes.Packed.class)
    @RpcNumericField(minimumValue = 0, maximumValue = 99999999, decimalPlaces = 0)
    private Integer updtdt;

    @RpcField(length = 1, direction = Direction.INPUT_OUTPUT, originalName = "LOCKED", legacyType = Jt400LegacyTypes.Char.class)
    private String locked;

    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return Gactcs6XEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return Gactcs6XEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return Gactcs6XEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return Gactcs6XEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        Gactcs6XEntityHelper.populateFromJson(jsonObject, this);
    }

}

