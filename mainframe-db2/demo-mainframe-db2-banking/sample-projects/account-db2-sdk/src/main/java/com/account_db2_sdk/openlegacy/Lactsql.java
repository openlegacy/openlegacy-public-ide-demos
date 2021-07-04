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
@RpcEntity(name="Lactsql", language=Languages.DB2)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "DEMO001.LACTSQL", displayName = "Execute", alias = "execute" )            })
public class Lactsql implements org.openlegacy.core.rpc.RpcEntity {

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.RESULT_SET, value = "db.resultSet")
    })
    @RpcField(direction = Direction.OUTPUT, originalName = "Result_Set")
    @RpcList(count = 0)
    private List<ResultSet> resultSet;

    @Getter
    @Setter
    @RpcPart
    public static class ResultSet {

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_ACCOUNT_ID")
        private String acctAccountId;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_CUSTOMER_ID")
        private String acctCustomerId;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_CUSTOMER_NAME")
        private String acctCustomerName;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_IBAN")
        private String acctIban;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_BNK_ID")
        private String acctBnkId;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "4"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_BRNCH_ID")
        @RpcNumericField(decimalPlaces = 0)
        private Integer acctBrnchId;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_CNTRY_CD")
        private String acctCntryCd;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_TYPCD")
        private String acctTypcd;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_SUB_TYPCD")
        private String acctSubTypcd;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_TYPE_NAME")
        private String acctTypeName;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_TYPE_DESCRIPTION")
        private String acctTypeDescription;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "3"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_BALANCE")
        @RpcNumericField(decimalPlaces = 0)
        private BigDecimal acctBalance;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_CURRENCY")
        private String acctCurrency;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_CRT_DT")
        private String acctCrtDt;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_UPDT_DT")
        private String acctUpdtDt;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_LOCKED")
        private String acctLocked;
    }

    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return LactsqlEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return LactsqlEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return LactsqlEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return LactsqlEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        LactsqlEntityHelper.populateFromJson(jsonObject, this);
    }

}

