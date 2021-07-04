package com.mainframe_ctg_sdk.openlegacy;

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
public class Opnact31AccountOut {

    @RpcField(originalName = "ACCOUNT-DETAILS", displayName = "ACCOUNTDETAILS")
    private Opnact31AccountDetails accountDetails;

    @RpcField(length = 1, originalName = "RTCD", legacyType = MainFrameLegacyTypes.ZonedNumeric.class)
    @RpcNumericField(minimumValue = -9, maximumValue = 9, decimalPlaces = 0)
    private Integer rtcd;

    @RpcField(length = 60, originalName = "RT-MSG", legacyType = MainFrameLegacyTypes.Char.class)
    private String rtMsg;
}

