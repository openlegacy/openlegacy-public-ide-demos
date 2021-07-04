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
@RpcEntity(name="Gactcs9", language=Languages.COBOL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "GACTCS9", displayName = "Execute", alias = "execute" )            })
public class Gactcs9 implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(direction = Direction.INPUT, originalName = "gactcs9Input")
    private Gactcs9Gactcs9Input gactcs9Input;

    @RpcField(direction = Direction.OUTPUT, originalName = "gactcs9Output")
    private Gactcs9Gactcs9Output gactcs9Output;






    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return Gactcs9EntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return Gactcs9EntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return Gactcs9EntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return Gactcs9EntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        Gactcs9EntityHelper.populateFromJson(jsonObject, this);
    }

}

