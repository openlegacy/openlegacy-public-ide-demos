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
@RpcEntity(name="Dactcs6X", language=Languages.PCML)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "/QSYS.LIB/RMR2L1.lib/DACTCS6X.PGM", displayName = "Execute", alias = "execute" )            })
public class Dactcs6X implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(length = 11, direction = Direction.INPUT_OUTPUT, originalName = "INPUT", legacyType = Jt400LegacyTypes.Char.class)
    private String input;

    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return Dactcs6XEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return Dactcs6XEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return Dactcs6XEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return Dactcs6XEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        Dactcs6XEntityHelper.populateFromJson(jsonObject, this);
    }

}

