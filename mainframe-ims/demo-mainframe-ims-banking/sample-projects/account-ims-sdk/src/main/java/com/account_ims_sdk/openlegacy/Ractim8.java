package com.account_ims_sdk.openlegacy;

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
@RpcEntity(name="Ractim8", language=Languages.COBOL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "RACTIM8", displayName = "Execute", alias = "execute" )            })
public class Ractim8 implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(direction = Direction.INPUT, originalName = "ractim8Input")
    private Ractim8Ractim8Input ractim8Input;

    @RpcField(direction = Direction.OUTPUT, originalName = "ractim8Output")
    private Ractim8Ractim8Output ractim8Output;





    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return Ractim8EntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return Ractim8EntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return Ractim8EntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return Ractim8EntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        Ractim8EntityHelper.populateFromJson(jsonObject, this);
    }

}

