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
@RpcEntity(name="Dactim8", language=Languages.COBOL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "DACTIM8", displayName = "Execute", alias = "execute" )            })
public class Dactim8 implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(direction = Direction.INPUT, originalName = "dactim8Input")
    private Dactim8Dactim8Input dactim8Input;

    @RpcField(direction = Direction.OUTPUT, originalName = "dactim8Output")
    private Dactim8Dactim8Output dactim8Output;




    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return Dactim8EntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return Dactim8EntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return Dactim8EntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return Dactim8EntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        Dactim8EntityHelper.populateFromJson(jsonObject, this);
    }

}

