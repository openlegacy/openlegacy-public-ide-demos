package com.policy_cics_sdk.openlegacy;

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
@RpcEntity(name="Opolcs2", language=Languages.COBOL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "OPOLCS2", displayName = "Execute", alias = "execute" )            })
public class Opolcs2 implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(direction = Direction.INPUT, originalName = "opolcs2Input")
    private Opolcs2Opolcs2Input opolcs2Input;

    @RpcField(direction = Direction.OUTPUT, originalName = "opolcs2Output")
    private Opolcs2Opolcs2Output opolcs2Output;





    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return Opolcs2EntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return Opolcs2EntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return Opolcs2EntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return Opolcs2EntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        Opolcs2EntityHelper.populateFromJson(jsonObject, this);
    }

}

