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
@RpcEntity(name="Oactsql", language=Languages.DB2)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "DEMO001.OACTSQL", displayName = "Execute", alias = "execute" )            })
public class Oactsql implements org.openlegacy.core.rpc.RpcEntity {

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 11, direction = Direction.INPUT_OUTPUT, originalName = "ACCOUNT_ID")
    private String accountId;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 16, direction = Direction.INPUT_OUTPUT, originalName = "CUSTOMER_ID")
    private String customerId;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 16, direction = Direction.INPUT_OUTPUT, originalName = "CUSTOMER_NAME")
    private String customerName;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 32, direction = Direction.INPUT_OUTPUT, originalName = "IBAN")
    private String iban;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 4, direction = Direction.INPUT_OUTPUT, originalName = "BNK_ID")
    private String bnkId;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "4"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 4, direction = Direction.INPUT_OUTPUT, originalName = "BRNCH_ID")
    @RpcNumericField(decimalPlaces = 0)
    private Integer brnchId;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 2, direction = Direction.INPUT_OUTPUT, originalName = "CNTRY_CD")
    private String cntryCd;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 1, direction = Direction.INPUT_OUTPUT, originalName = "TYPCD")
    private String typcd;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 3, direction = Direction.INPUT_OUTPUT, originalName = "SUB_TYPCD")
    private String subTypcd;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 12, direction = Direction.INPUT_OUTPUT, originalName = "TYPE_NAME")
    private String typeName;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 40, direction = Direction.INPUT_OUTPUT, originalName = "TYPE_DESCRIPTION")
    private String typeDescription;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "3"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 14, direction = Direction.INPUT_OUTPUT, originalName = "BALANCE")
    @RpcNumericField(decimalPlaces = 0)
    private BigDecimal balance;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 3, direction = Direction.INPUT_OUTPUT, originalName = "CURRENCY")
    private String currency;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 8, direction = Direction.INPUT_OUTPUT, originalName = "CRT_DT")
    private String crtDt;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 8, direction = Direction.INPUT_OUTPUT, originalName = "UPDT_DT")
    private String updtDt;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 1, direction = Direction.INPUT_OUTPUT, originalName = "LOCKED")
    private String locked;

    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return OactsqlEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return OactsqlEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return OactsqlEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return OactsqlEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        OactsqlEntityHelper.populateFromJson(jsonObject, this);
    }

}

