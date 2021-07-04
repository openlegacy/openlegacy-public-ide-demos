package com.account_oracle_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import java.sql.Timestamp;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.Action;
import org.openlegacy.core.annotations.rpc.*;
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;
import org.openlegacy.core.db.DBConst;
import org.openlegacy.core.storedproc.RefCursorDescriptor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@RpcEntity(name="GetAllCustomerBankAccounts", language=Languages.PLSQL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "OPENLEGACY_TEAM.BANK_ACCOUNTS_PACKAGE.GET_ALL_CUSTOMER_BANK_ACCOUNTS", displayName = "Execute", alias = "execute" )            })
public class GetAllCustomerBankAccounts implements org.openlegacy.core.rpc.RpcEntity {

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE_NAME, value = "OPENLEGACY_TEAM.BANK_ACCOUNT_OBJ_LIST"),
            @Attribute(key = DBConst.TYPE, value = "2003"),
            @Attribute(key = DBConst.USE_TYPE_NAME, value = "true"),
            @Attribute(key = DBConst.REGISTER_OUTPUT_PARAMETER, value = "true")
    })
    @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "BANK_ACCOUNT_OBJ_LIST")
    @RpcList(count = 0)
    private List<BankAccountObj> bankAccountObjList;

    @Getter
    @Setter
    @RpcPart
    public static class BankAccountObj {

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "12")
        })
        @RpcField(length = 12, direction = Direction.INPUT_OUTPUT, originalName = "ACCOUNT_ID")
        private String accountId;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "12")
        })
        @RpcField(length = 16, direction = Direction.INPUT_OUTPUT, originalName = "CUSTOMER_ID")
        private String customerId;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "12")
        })
        @RpcField(length = 255, direction = Direction.INPUT_OUTPUT, originalName = "CUSTOMER_NAME")
        private String customerName;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "12")
        })
        @RpcField(length = 32, direction = Direction.INPUT_OUTPUT, originalName = "IBAN")
        private String iban;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "12")
        })
        @RpcField(length = 3, direction = Direction.INPUT_OUTPUT, originalName = "COUNTRY_CODE")
        private String countryCode;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "12")
        })
        @RpcField(length = 4, direction = Direction.INPUT_OUTPUT, originalName = "BANK_ID")
        private String bankId;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "12")
        })
        @RpcField(length = 9, direction = Direction.INPUT_OUTPUT, originalName = "BRNCH_ID")
        private String brnchId;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1")
        })
        @RpcField(length = 1, direction = Direction.INPUT_OUTPUT, originalName = "TYPCD")
        private String typcd;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "12")
        })
        @RpcField(length = 20, direction = Direction.INPUT_OUTPUT, originalName = "TYPE_NAME")
        private String typeName;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "12")
        })
        @RpcField(length = 3, direction = Direction.INPUT_OUTPUT, originalName = "SUB_TYPCD")
        private String subTypcd;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "12")
        })
        @RpcField(length = 40, direction = Direction.INPUT_OUTPUT, originalName = "TYPE_DESCRIPTION")
        private String typeDescription;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "3")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "BALANCE")
        @RpcNumericField()
        private BigDecimal balance;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "12")
        })
        @RpcField(length = 3, direction = Direction.INPUT_OUTPUT, originalName = "CURRENCY")
        private String currency;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "93")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "CREATED_DATE")
        @RpcDateField(pattern="yyyy-MM-dd hh:mm:ss")
        private Timestamp createdDate;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "93")
        })
        @RpcField(direction = Direction.INPUT_OUTPUT, originalName = "LAST_UPDATE")
        @RpcDateField(pattern="yyyy-MM-dd hh:mm:ss")
        private Timestamp lastUpdate;

        @FieldAttributes(attributes = {
                @Attribute(key = DBConst.TYPE, value = "1")
        })
        @RpcField(length = 1, direction = Direction.INPUT_OUTPUT, originalName = "LOCKED")
        private String locked;
    }

    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return GetAllCustomerBankAccountsEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return GetAllCustomerBankAccountsEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return GetAllCustomerBankAccountsEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return GetAllCustomerBankAccountsEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        GetAllCustomerBankAccountsEntityHelper.populateFromJson(jsonObject, this);
    }

}

