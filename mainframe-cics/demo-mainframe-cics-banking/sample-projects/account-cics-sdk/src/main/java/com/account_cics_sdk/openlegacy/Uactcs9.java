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
@RpcEntity(name="Uactcs9", language=Languages.COBOL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "UACTCS9", displayName = "Execute", alias = "execute" )            })
public class Uactcs9 implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(originalName = "DFHCOMMAREA", displayName = "Dfhcommarea")
    private Uactcs9Dfhcommarea dfhcommarea;






    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return Uactcs9EntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return Uactcs9EntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return Uactcs9EntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return Uactcs9EntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        Uactcs9EntityHelper.populateFromJson(jsonObject, this);
    }

}

