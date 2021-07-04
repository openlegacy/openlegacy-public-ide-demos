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
public class Opolcs2Opolcs2Input {

    @RpcField(direction = Direction.INPUT, originalName = "IN-PUT", displayName = "INPUT")
    private Opolcs2InPut inPut;

    @Hidden
    @RpcField(length = 231, direction = Direction.INPUT, originalName = "filler_4477313939875417", legacyType = MainFrameLegacyTypes.Char.class)
    private String filler4477313939875417;
}

