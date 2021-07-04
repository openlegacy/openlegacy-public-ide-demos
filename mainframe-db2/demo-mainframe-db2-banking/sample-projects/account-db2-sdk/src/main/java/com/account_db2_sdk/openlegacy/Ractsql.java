package com.account_db2_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.Action;
import org.openlegacy.core.annotations.rpc.*;
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;
import org.openlegacy.core.db.DBConst;
import org.openlegacy.core.storedproc.RefCursorDescriptor;
import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@RpcEntity(name="Ractsql", language=Languages.DB2)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "DEMO001.RACTSQL", displayName = "Execute", alias = "execute" )            })
public class Ractsql implements org.openlegacy.core.rpc.RpcEntity {

    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return RactsqlEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return RactsqlEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return RactsqlEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return RactsqlEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        RactsqlEntityHelper.populateFromJson(jsonObject, this);
    }

}

