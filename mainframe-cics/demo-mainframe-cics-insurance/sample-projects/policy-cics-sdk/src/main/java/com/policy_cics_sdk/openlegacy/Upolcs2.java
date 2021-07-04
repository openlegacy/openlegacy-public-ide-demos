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
@RpcEntity(name="Upolcs2", language=Languages.COBOL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "UPOLCS2", displayName = "Execute", alias = "execute" )            })
public class Upolcs2 implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(direction = Direction.INPUT, originalName = "upolcs2Input")
    private Upolcs2Upolcs2Input upolcs2Input;

    @RpcField(direction = Direction.OUTPUT, originalName = "upolcs2Output")
    private Upolcs2Upolcs2Output upolcs2Output;







    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return Upolcs2EntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return Upolcs2EntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return Upolcs2EntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return Upolcs2EntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        Upolcs2EntityHelper.populateFromJson(jsonObject, this);
    }

}

