package com.mainframe_ctg_sdk.openlegacy;

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
@RpcEntity(name="Opnact31", language=Languages.COBOL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "OPNACT31", displayName = "Execute", alias = "execute", actionProperties = {
                @ActionProperty(name = "ipicServer", value = "IPCSSL" ),
                    @ActionProperty(name = "transactionId", value = "" )
     }
 )            })
public class Opnact31 implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(originalName = "DFHCOMMAREA", displayName = "Dfhcommarea")
    private Opnact31Dfhcommarea dfhcommarea;





    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return Opnact31EntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return Opnact31EntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return Opnact31EntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return Opnact31EntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        Opnact31EntityHelper.populateFromJson(jsonObject, this);
    }

}

