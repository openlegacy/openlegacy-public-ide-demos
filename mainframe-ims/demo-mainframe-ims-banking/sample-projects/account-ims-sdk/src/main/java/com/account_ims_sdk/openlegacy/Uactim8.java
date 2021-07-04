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
@RpcEntity(name="Uactim8", language=Languages.COBOL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "UACTIM8", displayName = "Execute", alias = "execute" )            })
public class Uactim8 implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(direction = Direction.INPUT, originalName = "uactim8Input")
    private Uactim8Uactim8Input uactim8Input;

    @RpcField(direction = Direction.OUTPUT, originalName = "uactim8Output")
    private Uactim8Uactim8Output uactim8Output;



    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return Uactim8EntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return Uactim8EntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return Uactim8EntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return Uactim8EntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        Uactim8EntityHelper.populateFromJson(jsonObject, this);
    }

}

