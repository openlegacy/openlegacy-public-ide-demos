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
public class POL2ADDPol2addInput {

    @RpcField(length = 11, direction = Direction.INPUT, originalName = "POLICY-NUM-IN", legacyType = Jt400LegacyTypes.Char.class)
    private String policyNumIn;

    @RpcField(length = 16, direction = Direction.INPUT, originalName = "CUST-NAME-IN", legacyType = Jt400LegacyTypes.Char.class)
    private String custNameIn;

    @RpcField(length = 16, direction = Direction.INPUT, originalName = "CUST-ADDR-IN", legacyType = Jt400LegacyTypes.Char.class)
    private String custAddrIn;

    @RpcField(length = 16, direction = Direction.INPUT, originalName = "CUST-CITY-IN", legacyType = Jt400LegacyTypes.Char.class)
    private String custCityIn;

    @RpcField(length = 2, direction = Direction.INPUT, originalName = "CUST-STATE-IN", legacyType = Jt400LegacyTypes.Char.class)
    private String custStateIn;

    @RpcField(length = 5, direction = Direction.INPUT, originalName = "CUST-ZIP-IN", legacyType = Jt400LegacyTypes.Char.class)
    private String custZipIn;

    @RpcField(length = 16, direction = Direction.INPUT, originalName = "CUST-PHONE-IN", legacyType = Jt400LegacyTypes.Char.class)
    private String custPhoneIn;

    @RpcField(length = 8, direction = Direction.INPUT, originalName = "BIRTH-DATE-IN", legacyType = Jt400LegacyTypes.Char.class)
    private String birthDateIn;

    @RpcField(length = 8, direction = Direction.INPUT, originalName = "CREATE-DATE-IN", legacyType = Jt400LegacyTypes.Char.class)
    private String createDateIn;

    @RpcField(length = 8, direction = Direction.INPUT, originalName = "END-DATE-IN", legacyType = Jt400LegacyTypes.Char.class)
    private String endDateIn;

    @RpcField(length = 16, direction = Direction.INPUT, originalName = "POLICY-TYPE-IN", legacyType = Jt400LegacyTypes.Char.class)
    private String policyTypeIn;

    @RpcField(length = 14, direction = Direction.INPUT, originalName = "MONTHLY-PYMT-IN", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0D, maximumValue = 99999999999.999D, decimalPlaces = 3)
    private Double monthlyPymtIn;

    @RpcField(length = 14, direction = Direction.INPUT, originalName = "QUARTERY-PYMT-IN", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0D, maximumValue = 99999999999.999D, decimalPlaces = 3)
    private Double quarteryPymtIn;

    @RpcField(length = 14, direction = Direction.INPUT, originalName = "YEARLY-PYMT-IN", legacyType = Jt400LegacyTypes.Zoned.class)
    @RpcNumericField(minimumValue = 0D, maximumValue = 99999999999.999D, decimalPlaces = 3)
    private Double yearlyPymtIn;

    @RpcField(length = 1, direction = Direction.INPUT, originalName = "IS-ACTIVE-IN", legacyType = Jt400LegacyTypes.Char.class)
    private String isActiveIn;
}

