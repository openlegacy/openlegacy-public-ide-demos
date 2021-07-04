package com.policy_db2_sdk.openlegacy;

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
@RpcEntity(name="Opolsql", language=Languages.DB2)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "DEMO001.OPOLSQL", displayName = "Execute", alias = "execute" )            })
public class Opolsql implements org.openlegacy.core.rpc.RpcEntity {

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 11, direction = Direction.INPUT_OUTPUT, originalName = "POLICY_NUM")
    private String policyNum;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 16, direction = Direction.INPUT_OUTPUT, originalName = "CUST_NAME")
    private String custName;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 16, direction = Direction.INPUT_OUTPUT, originalName = "CUST_ADDR")
    private String custAddr;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 16, direction = Direction.INPUT_OUTPUT, originalName = "CUST_CITY")
    private String custCity;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 2, direction = Direction.INPUT_OUTPUT, originalName = "CUST_STATE")
    private String custState;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 5, direction = Direction.INPUT_OUTPUT, originalName = "CUST_ZIP")
    private String custZip;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 16, direction = Direction.INPUT_OUTPUT, originalName = "CUST_PHONE")
    private String custPhone;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 8, direction = Direction.INPUT_OUTPUT, originalName = "BIRTH_DATE")
    private String birthDate;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 8, direction = Direction.INPUT_OUTPUT, originalName = "CREATE_DATE")
    private String createDate;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 8, direction = Direction.INPUT_OUTPUT, originalName = "END_DATE")
    private String endDate;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 16, direction = Direction.INPUT_OUTPUT, originalName = "POLICY_TYPE")
    private String policyType;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "3"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 14, direction = Direction.INPUT_OUTPUT, originalName = "MONTHLY_PYMT")
    @RpcNumericField(decimalPlaces = 0)
    private BigDecimal monthlyPymt;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "3"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 14, direction = Direction.INPUT_OUTPUT, originalName = "QUARTERLY_PYMT")
    @RpcNumericField(decimalPlaces = 0)
    private BigDecimal quarterlyPymt;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "3"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 14, direction = Direction.INPUT_OUTPUT, originalName = "YEARLY_PYMT")
    @RpcNumericField(decimalPlaces = 0)
    private BigDecimal yearlyPymt;

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "1"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(length = 1, direction = Direction.INPUT_OUTPUT, originalName = "ISACTIVE")
    private String isactive;

    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return OpolsqlEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return OpolsqlEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return OpolsqlEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return OpolsqlEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        OpolsqlEntityHelper.populateFromJson(jsonObject, this);
    }

}

