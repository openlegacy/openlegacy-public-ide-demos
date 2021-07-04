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
public class Opnact4CrtAccountIn {

    @RpcField(length = 16, originalName = "ACTI-CUSTOMER-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiCustomerId;

    @RpcField(length = 16, originalName = "ACTI-CUSTOMER-NAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiCustomerName;

    @RpcField(length = 1, originalName = "ACTI-TYPCD", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiTypcd;

    @RpcField(length = 3, originalName = "ACTI-SUB-TYPCD", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiSubTypcd;

    @RpcField(length = 2, originalName = "ACTI-CNTRY-CD", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiCntryCd;

    @RpcField(length = 4, originalName = "ACTI-BNK-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiBnkId;

    @RpcField(length = 6, originalName = "ACTI-BRANCH-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiBranchId;

    @RpcField(length = 7, originalName = "ACTI-INITIAL-DEPOSIT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999999999.99D, maximumValue = 99999999999.99D, decimalPlaces = 2)
    private Double actiInitialDeposit;

    @RpcField(length = 3, originalName = "ACTI-CURRENCY", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiCurrency;
}

