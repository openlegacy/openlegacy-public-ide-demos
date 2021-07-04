package com.account_ims_sdk.openlegacy;

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
public class Oactim8AccountDetails {

    @RpcField(length = 11, direction = Direction.OUTPUT, originalName = "ACTO-ACCOUNT-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoAccountId;

    @RpcField(length = 16, direction = Direction.OUTPUT, originalName = "ACTO-CUSTOMER-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoCustomerId;

    @RpcField(length = 16, direction = Direction.OUTPUT, originalName = "ACTO-CUSTOMER-NAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoCustomerName;

    @RpcField(length = 32, direction = Direction.OUTPUT, originalName = "ACTO-IBAN", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoIban;

    @RpcField(length = 2, direction = Direction.OUTPUT, originalName = "ACTO-CNTRY-CD", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoCntryCd;

    @RpcField(length = 4, direction = Direction.OUTPUT, originalName = "ACTO-BNK-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoBnkId;

    @RpcField(length = 4, direction = Direction.OUTPUT, originalName = "ACTO-BRNCH-ID", legacyType = MainFrameLegacyTypes.BinaryBigEndian.class)
    @RpcNumericField(minimumValue = -999999999, maximumValue = 999999999, decimalPlaces = 0)
    private Integer actoBrnchId;

    @RpcField(length = 1, direction = Direction.OUTPUT, originalName = "ACTO-TYPCD", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoTypcd;

    @RpcField(length = 12, direction = Direction.OUTPUT, originalName = "ACTO-TYPE-NAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoTypeName;

    @RpcField(length = 3, direction = Direction.OUTPUT, originalName = "ACTO-SUB-TYPCD", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoSubTypcd;

    @RpcField(length = 40, direction = Direction.OUTPUT, originalName = "ACTO-TYPE-DESCRIPTION", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoTypeDescription;

    @RpcField(length = 8, direction = Direction.OUTPUT, originalName = "ACTO-BALANCE", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999999999.999D, maximumValue = 99999999999.999D, decimalPlaces = 3)
    private Double actoBalance;

    @RpcField(length = 3, direction = Direction.OUTPUT, originalName = "ACTO-CURRENCY", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoCurrency;

    @RpcField(length = 8, direction = Direction.OUTPUT, originalName = "ACTO-CRT-DT", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoCrtDt;

    @RpcField(length = 8, direction = Direction.OUTPUT, originalName = "ACTO-UPDT-DT", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoUpdtDt;

    @RpcField(length = 1, direction = Direction.OUTPUT, originalName = "ACTO-LOCKED", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoLocked;
}

