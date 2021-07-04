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
public class Oactim8Oactim8Output {

    @RpcField(length = 8, direction = Direction.OUTPUT, originalName = "CONV-TRAN", legacyType = MainFrameLegacyTypes.Char.class)
    private String convTran;

    @RpcField(direction = Direction.OUTPUT, originalName = "ACCOUNT-DETAILS", displayName = "ACCOUNTDETAILS")
    private Oactim8AccountDetails accountDetails;

    @RpcField(length = 1, direction = Direction.OUTPUT, originalName = "RTCD", legacyType = MainFrameLegacyTypes.ZonedNumeric.class)
    @RpcNumericField(minimumValue = -9, maximumValue = 9, decimalPlaces = 0)
    private Integer rtcd;

    @RpcField(length = 60, direction = Direction.OUTPUT, originalName = "RT-MSG", legacyType = MainFrameLegacyTypes.Char.class)
    private String rtMsg;
}

