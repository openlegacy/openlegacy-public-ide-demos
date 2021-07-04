package com.cics_accounts_sdk.openlegacy;

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
public class Uactcs9UpdateOut {

    @RpcField(originalName = "OUTPUT-RECORD", displayName = "OUTPUTRECORD")
    private Uactcs9OutputRecord outputRecord;

    @RpcField(length = 60, originalName = "RT-MSG", legacyType = MainFrameLegacyTypes.Char.class)
    private String rtMsg;
}

