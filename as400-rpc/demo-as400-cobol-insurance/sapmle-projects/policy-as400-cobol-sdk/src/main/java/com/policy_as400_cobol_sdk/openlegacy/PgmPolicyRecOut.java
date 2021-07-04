package com.policy_as400_cobol_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import org.openlegacy.core.model.legacy.type.Jt400LegacyTypes;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RpcPart
public class PgmPolicyRecOut {

    @RpcField(length = 11, originalName = "POLICY-NUM-OUT", legacyType = Jt400LegacyTypes.Char.class)
    private String policyNumOut;

    @RpcField(length = 16, originalName = "CUST-NAME-OUT", legacyType = Jt400LegacyTypes.Char.class)
    private String custNameOut;

    @RpcField(length = 16, originalName = "CUST-ADDR-OUT", legacyType = Jt400LegacyTypes.Char.class)
    private String custAddrOut;

    @RpcField(length = 16, originalName = "CUST-CITY-OUT", legacyType = Jt400LegacyTypes.Char.class)
    private String custCityOut;

    @RpcField(length = 2, originalName = "CUST-STATE-OUT", legacyType = Jt400LegacyTypes.Char.class)
    private String custStateOut;

    @RpcField(length = 5, originalName = "CUST-ZIP-OUT", legacyType = Jt400LegacyTypes.Char.class)
    private String custZipOut;

    @RpcField(length = 16, originalName = "CUST-PHONE-OUT", legacyType = Jt400LegacyTypes.Char.class)
    private String custPhoneOut;

    @RpcField(length = 8, originalName = "BIRTH-DATE-OUT", legacyType = Jt400LegacyTypes.Char.class)
    private String birthDateOut;

    @RpcField(length = 8, originalName = "CREATE-DATE-OUT", legacyType = Jt400LegacyTypes.Char.class)
    private String createDateOut;

    @RpcField(length = 8, originalName = "END-DATE-OUT", legacyType = Jt400LegacyTypes.Char.class)
    private String endDateOut;

    @RpcField(length = 16, originalName = "POLICY-TYPE-OUT", legacyType = Jt400LegacyTypes.Char.class)
    private String policyTypeOut;

    @RpcField(length = 14, originalName = "MONTHLY-PYMT-OUT", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0D, maximumValue = 99999999999.999D, decimalPlaces = 3)
    private Double monthlyPymtOut;

    @RpcField(length = 14, originalName = "QUARTERY-PYMT-OUT", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0D, maximumValue = 99999999999.999D, decimalPlaces = 3)
    private Double quarteryPymtOut;

    @RpcField(length = 14, originalName = "YEARLY-PYMT-OUT", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0D, maximumValue = 99999999999.999D, decimalPlaces = 3)
    private Double yearlyPymtOut;

    @RpcField(length = 1, originalName = "IS-ACTIVE-OUT", legacyType = Jt400LegacyTypes.Char.class)
    private String isActiveOut;
}

