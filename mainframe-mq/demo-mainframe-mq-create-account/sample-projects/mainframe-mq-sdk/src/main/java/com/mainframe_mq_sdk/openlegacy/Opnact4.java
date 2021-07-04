package com.mainframe_mq_sdk.openlegacy;

import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.annotations.rpc.Action;
import org.openlegacy.core.annotations.rpc.Direction;
import org.openlegacy.core.annotations.rpc.Languages;
import org.openlegacy.core.annotations.rpc.RpcActions;
import org.openlegacy.core.annotations.rpc.RpcEntity;
import org.openlegacy.core.annotations.rpc.RpcField;
import org.openlegacy.core.model.entity.RpcEntityDefinition;
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;

import io.vertx.core.json.JsonObject;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@RpcEntity(name="Opnact4", language=Languages.COBOL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "OPNACT4", displayName = "Execute", alias = "execute" )            })
public class Opnact4 implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(originalName = "CRT-ACCOUNT-IN", displayName = "CRTACCOUNTIN", direction = Direction.INPUT)
    private Opnact4CrtAccountIn crtAccountIn;

    @RpcField(originalName = "ACCOUNT-OUT", displayName = "ACCOUNTOUT")
    private Opnact4AccountOut accountOut;




    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return Opnact4EntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return Opnact4EntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return Opnact4EntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return Opnact4EntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        Opnact4EntityHelper.populateFromJson(jsonObject, this);
    }

}

