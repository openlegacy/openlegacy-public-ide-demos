package com.mainframe_mq_sdk.openlegacy;

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
import org.openlegacy.core.annotations.rpc.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RpcPart
public class Opnact4AccountDetails {

    @RpcField(length = 32, originalName = "ACTO-IBAN", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoIban;

    @RpcField(length = 11, originalName = "ACTO-ACCOUNT-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoAccountId;

    @RpcField(length = 2, originalName = "ACTO-CNTRY-CD", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoCntryCd;

    @RpcField(length = 4, originalName = "ACTO-BNK-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoBnkId;

    @RpcField(length = 6, originalName = "ACTO-BRANCH-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoBranchId;

    @RpcField(length = 16, originalName = "ACTO-CUSTOMER-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoCustomerId;

    @RpcField(length = 16, originalName = "ACTO-CUSTOMER-NAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoCustomerName;

    @RpcField(length = 1, originalName = "ACTO-TYPCD", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoTypcd;

    @RpcField(length = 12, originalName = "ACTO-TYPE-NAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoTypeName;

    @RpcField(length = 3, originalName = "ACTO-SUB-TYPCD", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoSubTypcd;

    @RpcField(length = 40, originalName = "ACTO-TYPE-DESCRIPTION", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoTypeDescription;

    @RpcField(length = 7, originalName = "ACTO-BALANCE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999999999.99D, maximumValue = 99999999999.99D, decimalPlaces = 2)
    private Double actoBalance;

    @RpcField(length = 3, originalName = "ACTO-CURRENCY", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoCurrency;

    @RpcField(length = 8, originalName = "ACTO-CRT-DT", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoCrtDt;

    @RpcField(length = 8, originalName = "ACTO-UPDT-DT", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoUpdtDt;

    @RpcField(length = 1, originalName = "ACTO-LOCKED", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoLocked;
}

