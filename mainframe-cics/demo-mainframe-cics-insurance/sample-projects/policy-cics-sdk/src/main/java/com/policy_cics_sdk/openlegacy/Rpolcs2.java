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
@RpcEntity(name="Rpolcs2", language=Languages.COBOL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "RPOLCS2", displayName = "Execute", alias = "execute" )            })
public class Rpolcs2 implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(originalName = "OUT-PUT", displayName = "OUTPUT")
    private Rpolcs2OutPut outPut;

    @RpcField(originalName = "IN-PUT", displayName = "INPUT")
    private Rpolcs2InPut inPut;





    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return Rpolcs2EntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return Rpolcs2EntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return Rpolcs2EntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return Rpolcs2EntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        Rpolcs2EntityHelper.populateFromJson(jsonObject, this);
    }

}

