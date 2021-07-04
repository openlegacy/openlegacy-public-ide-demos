package com.policy_cics_sdk.openlegacy;

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
public class Opolcs2OutPut {

    @RpcField(length = 11, direction = Direction.OUTPUT, originalName = "ACTO-POLICY-NUM", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoPolicyNum;

    @RpcField(length = 16, direction = Direction.OUTPUT, originalName = "ACTO-CUST-NAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoCustName;

    @RpcField(length = 16, direction = Direction.OUTPUT, originalName = "ACTO-CUST-ADDR", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoCustAddr;

    @RpcField(length = 16, direction = Direction.OUTPUT, originalName = "ACTO-CUST-CITY", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoCustCity;

    @RpcField(length = 2, direction = Direction.OUTPUT, originalName = "ACTO-CUST-STATE", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoCustState;

    @RpcField(length = 5, direction = Direction.OUTPUT, originalName = "ACTO-CUST-ZIP", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoCustZip;

    @RpcField(length = 16, direction = Direction.OUTPUT, originalName = "ACTO-CUST-PHONE", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoCustPhone;

    @RpcField(length = 8, direction = Direction.OUTPUT, originalName = "ACTO-BIRTH-DATE", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoBirthDate;

    @RpcField(length = 8, direction = Direction.OUTPUT, originalName = "ACTO-CREATE-DATE", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoCreateDate;

    @RpcField(length = 8, direction = Direction.OUTPUT, originalName = "ACTO-END-DATE", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoEndDate;

    @RpcField(length = 16, direction = Direction.OUTPUT, originalName = "ACTO-POLICY-TYPE", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoPolicyType;

    @RpcField(length = 8, direction = Direction.OUTPUT, originalName = "ACTO-MONTHLY_PYMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999999999.999D, maximumValue = 99999999999.999D, decimalPlaces = 3)
    private Double actoMonthlyPymt;

    @RpcField(length = 8, direction = Direction.OUTPUT, originalName = "ACTO-QUARTERY-PYMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999999999.999D, maximumValue = 99999999999.999D, decimalPlaces = 3)
    private Double actoQuarteryPymt;

    @RpcField(length = 8, direction = Direction.OUTPUT, originalName = "ACTO-YEARLY-PYMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999999999.999D, maximumValue = 99999999999.999D, decimalPlaces = 3)
    private Double actoYearlyPymt;

    @RpcField(length = 1, direction = Direction.OUTPUT, originalName = "ACTO-ISACTIVE", legacyType = MainFrameLegacyTypes.Char.class)
    private String actoIsactive;

    @RpcField(length = 60, direction = Direction.OUTPUT, originalName = "RT-MSG", legacyType = MainFrameLegacyTypes.Char.class)
    private String rtMsg;
}

