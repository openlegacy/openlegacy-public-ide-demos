package com.microsoft_sqlserver_sp_sdk.openlegacy;


import java.sql.Date;
import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.annotations.common.Attribute;
import org.openlegacy.core.annotations.common.FieldAttributes;
import org.openlegacy.core.annotations.rpc.Action;
import org.openlegacy.core.annotations.rpc.ActionProperty;
import org.openlegacy.core.annotations.rpc.Direction;
import org.openlegacy.core.annotations.rpc.Languages;
import org.openlegacy.core.annotations.rpc.RpcActions;
import org.openlegacy.core.annotations.rpc.RpcDateField;
import org.openlegacy.core.annotations.rpc.RpcEntity;
import org.openlegacy.core.annotations.rpc.RpcField;
import org.openlegacy.core.annotations.rpc.RpcList;
import org.openlegacy.core.annotations.rpc.RpcNumericField;
import org.openlegacy.core.annotations.rpc.RpcPart;
import org.openlegacy.core.db.DBConst;
import org.openlegacy.core.model.entity.RpcEntityDefinition;
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;

import io.vertx.core.json.JsonObject;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@RpcEntity(name="ProcGetAllExpiredCreditcards", language=Languages.TSQL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "master.dbo.proc_get_all_expired_creditcards", displayName = "Execute", alias = "execute", actionProperties = {
                @ActionProperty(name = "db_callable_type", value = "P" )
     }
 )            })
public class ProcGetAllExpiredCreditcards implements org.openlegacy.core.rpc.RpcEntity {

    @FieldAttributes(attributes = {
            @Attribute(key = DBConst.TYPE, value = "2002"),
            @Attribute(key = DBConst.RESULT_SET, value = "db.resultSet")
    })
    @RpcField(direction = Direction.OUTPUT, originalName = "ResultSet")
    @RpcList(count = 0)
    private List<ResultSet> resultSet;

    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return ProcGetAllExpiredCreditcardsEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return ProcGetAllExpiredCreditcardsEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return ProcGetAllExpiredCreditcardsEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return ProcGetAllExpiredCreditcardsEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        ProcGetAllExpiredCreditcardsEntityHelper.populateFromJson(jsonObject, this);
    }

	@Getter
	@Setter
	@RpcPart
	public static class ResultSet {
		@FieldAttributes(attributes = { @Attribute(key = DBConst.TYPE, value = "4") })
		@RpcField(length = 4, direction = Direction.OUTPUT, originalName = "id")
		@RpcNumericField()
		private Integer id;
		@FieldAttributes(attributes = { @Attribute(key = DBConst.TYPE, value = "12") })
		@RpcField(length = 50, direction = Direction.OUTPUT, originalName = "first_name")
		private String firstName;
		@FieldAttributes(attributes = { @Attribute(key = DBConst.TYPE, value = "12") })
		@RpcField(length = 50, direction = Direction.OUTPUT, originalName = "last_name")
		private String lastName;
		@FieldAttributes(attributes = { @Attribute(key = DBConst.TYPE, value = "12") })
		@RpcField(length = 50, direction = Direction.OUTPUT, originalName = "gender")
		private String gender;
		@FieldAttributes(attributes = { @Attribute(key = DBConst.TYPE, value = "12") })
		@RpcField(length = 50, direction = Direction.OUTPUT, originalName = "email")
		private String email;
		@FieldAttributes(attributes = { @Attribute(key = DBConst.TYPE, value = "12") })
		@RpcField(length = 50, direction = Direction.OUTPUT, originalName = "countryCode")
		private String countryCode;
		@FieldAttributes(attributes = { @Attribute(key = DBConst.TYPE, value = "12") })
		@RpcField(length = 50, direction = Direction.OUTPUT, originalName = "country")
		private String country;
		@FieldAttributes(attributes = { @Attribute(key = DBConst.TYPE, value = "12") })
		@RpcField(length = 50, direction = Direction.OUTPUT, originalName = "address")
		private String address;
		@FieldAttributes(attributes = { @Attribute(key = DBConst.TYPE, value = "12") })
		@RpcField(length = 50, direction = Direction.OUTPUT, originalName = "creditCardNumber")
		private String creditCardNumber;
		@FieldAttributes(attributes = { @Attribute(key = DBConst.TYPE, value = "12") })
		@RpcField(length = 50, direction = Direction.OUTPUT, originalName = "creditCardType")
		private String creditCardType;
		@FieldAttributes(attributes = { @Attribute(key = DBConst.TYPE, value = "12") })
		@RpcField(length = 50, direction = Direction.OUTPUT, originalName = "currency")
		private String currency;
		@FieldAttributes(attributes = { @Attribute(key = DBConst.TYPE, value = "12") })
		@RpcField(length = 10, direction = Direction.OUTPUT, originalName = "balance")
		private String balance;
		@FieldAttributes(attributes = { @Attribute(key = DBConst.TYPE, value = "93") })
		@RpcField(length = 3, direction = Direction.OUTPUT, originalName = "expiryDate")
		@RpcDateField(pattern = "yyyy-MM-dd HH:mm:ss")
		private Date expiryDate;
	}

}

