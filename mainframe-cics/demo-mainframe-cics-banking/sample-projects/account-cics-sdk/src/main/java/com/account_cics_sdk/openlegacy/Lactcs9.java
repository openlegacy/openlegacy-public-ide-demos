package com.account_cics_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.Action;
import org.openlegacy.core.annotations.rpc.*;
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@RpcEntity(name="Lactcs9", language=Languages.COBOL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "LACTCS9", displayName = "Execute", alias = "execute" )            })
public class Lactcs9 implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(direction = Direction.INPUT, originalName = "lactcs9Input")
    private Lactcs9Lactcs9Input lactcs9Input;

    @RpcField(direction = Direction.OUTPUT, originalName = "lactcs9Output")
    private Lactcs9Lactcs9Output lactcs9Output;






    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return Lactcs9EntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return Lactcs9EntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return Lactcs9EntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return Lactcs9EntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        Lactcs9EntityHelper.populateFromJson(jsonObject, this);
    }

}

