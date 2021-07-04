package com.cics_accounts_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import org.openlegacy.core.annotations.common.*;
import org.openlegacy.core.model.field.RpcFieldType.*;
import org.openlegacy.core.annotations.rpc.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RpcPart
public class Lactcs9Dfhcommarea {

    @RpcField(originalName = "IN-PUT", displayName = "INPUT")
    private Lactcs9InPut inPut;

    @RpcField(originalName = "OUT-PUT", displayName = "OUTPUT")
    private Lactcs9OutPut outPut;
}

