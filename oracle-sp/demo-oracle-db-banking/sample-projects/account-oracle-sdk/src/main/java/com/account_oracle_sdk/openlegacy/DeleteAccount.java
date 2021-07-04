package com.account_oracle_sdk.openlegacy;

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
@RpcEntity(name="DeleteAccount", language=Languages.PLSQL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "OPENLEGACY_TEAM.BANK_ACCOUNTS_PACKAGE.DELETE_ACCOUNT", displayName = "Execute", alias = "execute" )            })
public class DeleteAccount implements org.openlegacy.core.rpc.RpcEntity {

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "12")
    })
    @RpcField(direction = Direction.INPUT, originalName = "P_ACCOUNT_ID")
    private String paccountId;

    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return DeleteAccountEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return DeleteAccountEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return DeleteAccountEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return DeleteAccountEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        DeleteAccountEntityHelper.populateFromJson(jsonObject, this);
    }

}

