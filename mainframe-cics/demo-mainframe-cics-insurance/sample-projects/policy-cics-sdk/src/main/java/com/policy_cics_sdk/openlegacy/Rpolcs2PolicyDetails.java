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
public class Rpolcs2PolicyDetails {

    @RpcField(length = 11, originalName = "ACTI-POLICY-NUM", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiPolicyNum;

    @RpcField(length = 16, originalName = "ACTI-CUST-NAME", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiCustName;

    @RpcField(length = 16, originalName = "ACTI-CUST-ADDR", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiCustAddr;

    @RpcField(length = 16, originalName = "ACTI-CUST-CITY", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiCustCity;

    @RpcField(length = 2, originalName = "ACTI-CUST-STATE", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiCustState;

    @RpcField(length = 5, originalName = "ACTI-CUST-ZIP", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiCustZip;

    @RpcField(length = 16, originalName = "ACTI-CUST-PHONE", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiCustPhone;

    @RpcField(length = 8, originalName = "ACTI-BIRTH-DATE", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiBirthDate;

    @RpcField(length = 8, originalName = "ACTI-CREATE-DATE", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiCreateDate;

    @RpcField(length = 8, originalName = "ACTI-END-DATE", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiEndDate;

    @RpcField(length = 16, originalName = "ACTI-POLICY-TYPE", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiPolicyType;

    @RpcField(length = 8, originalName = "ACTI-MONTHLY_PYMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999999999.999D, maximumValue = 99999999999.999D, decimalPlaces = 3)
    private Double actiMonthlyPymt;

    @RpcField(length = 8, originalName = "ACTI-QUARTERY-PYMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999999999.999D, maximumValue = 99999999999.999D, decimalPlaces = 3)
    private Double actiQuarteryPymt;

    @RpcField(length = 8, originalName = "ACTI-YEARLY-PYMT", legacyType = MainFrameLegacyTypes.PackedDecimal.class)
    @RpcNumericField(minimumValue = -99999999999.999D, maximumValue = 99999999999.999D, decimalPlaces = 3)
    private Double actiYearlyPymt;

    @RpcField(length = 1, originalName = "ACTI-ISACTIVE", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiIsactive;
}

