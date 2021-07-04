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
@RpcEntity(name="Lpolsql", language=Languages.DB2)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "DEMO001.LPOLSQL", displayName = "Execute", alias = "execute" )            })
public class Lpolsql implements org.openlegacy.core.rpc.RpcEntity {

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
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_POLICY_NUM")
        private String acctPolicyNum;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_CUST_NAME")
        private String acctCustName;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_CUST_ADDR")
        private String acctCustAddr;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_CUST_CITY")
        private String acctCustCity;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_CUST_STATE")
        private String acctCustState;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_CUST_ZIP")
        private String acctCustZip;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_CUST_PHONE")
        private String acctCustPhone;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_BIRTH_DATE")
        private String acctBirthDate;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_CREATE_DATE")
        private String acctCreateDate;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_END_DATE")
        private String acctEndDate;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_POLICY_TYPE")
        private String acctPolicyType;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "3"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_MONTHLY_PYMT")
        @RpcNumericField(decimalPlaces = 0)
        private BigDecimal acctMonthlyPymt;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "3"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_QUARTERLY_PYMT")
        @RpcNumericField(decimalPlaces = 0)
        private BigDecimal acctQuarterlyPymt;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "3"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_YEARLY_PYMT")
        @RpcNumericField(decimalPlaces = 0)
        private BigDecimal acctYearlyPymt;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1"),
                @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "ACCT_ISACTIVE")
        private String acctIsactive;
    }

    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return LpolsqlEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return LpolsqlEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return LpolsqlEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return LpolsqlEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        LpolsqlEntityHelper.populateFromJson(jsonObject, this);
    }

}

