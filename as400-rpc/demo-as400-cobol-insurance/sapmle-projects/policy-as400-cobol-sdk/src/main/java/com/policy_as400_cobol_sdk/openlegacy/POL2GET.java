package com.policy_as400_cobol_sdk.openlegacy;

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
@RpcEntity(name="POL2GET", language=Languages.COBOL)
@RpcActions(actions = {
		@Action(action = EXECUTE.class, displayName = "Execute", alias = "execute", path = "/QSYS.LIB/POLICY.LIB/POL2GET.pgm") })
public class POL2GET implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(direction = Direction.INPUT, originalName = "pol2getInput")
    private POL2GETPol2getInput pol2getInput;

    @RpcField(direction = Direction.OUTPUT, originalName = "pol2getOutput")
    private POL2GETPol2getOutput pol2getOutput;




    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return POL2GETEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return POL2GETEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return POL2GETEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return POL2GETEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        POL2GETEntityHelper.populateFromJson(jsonObject, this);
    }

}

