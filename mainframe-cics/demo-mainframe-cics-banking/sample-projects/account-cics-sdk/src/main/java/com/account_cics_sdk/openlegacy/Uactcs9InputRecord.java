package com.account_cics_sdk.openlegacy;

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
public class Uactcs9InputRecord {

    @RpcField(length = 11, originalName = "ACTI-ACCOUNT-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiAccountId;

    @RpcField(length = 16, originalName = "ACTI-CUSTOMER-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiCustomerId;

    @RpcField(length = 16, originalName = "ACTI-CUSTOMER-NAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiCustomerName;

    @RpcField(length = 32, originalName = "ACTI-IBAN", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiIban;

    @RpcField(length = 2, originalName = "ACTI-CNTRY-CD", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiCntryCd;

    @RpcField(length = 4, originalName = "ACTI-BNK-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiBnkId;

    @RpcField(length = 4, originalName = "ACTI-BRNCH-ID", legacyType = MainFrameLegacyTypes.BinaryBigEndian.class)
    @RpcNumericField(minimumValue = -999999999, maximumValue = 999999999, decimalPlaces = 0)
    private Integer actiBrnchId;

    @RpcField(length = 1, originalName = "ACTI-TYPCD", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiTypcd;

    @RpcField(length = 12, originalName = "ACTI-TYPE-NAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiTypeName;

    @RpcField(length = 3, originalName = "ACTI-SUB-TYPCD", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiSubTypcd;

    @RpcField(length = 40, originalName = "ACTI-TYPE-DESCRIPTION", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiTypeDescription;

    @RpcField(length = 8, originalName = "ACTI-BALANCE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999999999.999D, maximumValue = 99999999999.999D, decimalPlaces = 3)
    private Double actiBalance;

    @RpcField(length = 3, originalName = "ACTI-CURRENCY", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiCurrency;

    @RpcField(length = 8, originalName = "ACTI-CRT-DT", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiCrtDt;

    @RpcField(length = 8, originalName = "ACTI-UPDT-DT", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiUpdtDt;

    @RpcField(length = 1, originalName = "ACTI-LOCKED", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiLocked;
}

