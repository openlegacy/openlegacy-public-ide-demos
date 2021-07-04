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
public class Gactcs9Gactcs9Input {

    @RpcField(length = 11, direction = Direction.INPUT, originalName = "ACTI-ACCOUNT-ID", legacyType = MainFrameLegacyTypes.Char.class)
    private String actiAccountId;

    @Hidden
    @RpcField(length = 237, direction = Direction.INPUT, originalName = "filler_715024084409867", legacyType = MainFrameLegacyTypes.Char.class)
    private String filler715024084409867;
}

