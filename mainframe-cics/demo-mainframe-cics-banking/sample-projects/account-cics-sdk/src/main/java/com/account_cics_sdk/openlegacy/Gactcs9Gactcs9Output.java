package com.account_cics_sdk.openlegacy;

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
public class Gactcs9Gactcs9Output {

    @RpcField(direction = Direction.OUTPUT, originalName = "IN-PUT", displayName = "INPUT")
    private Gactcs9InPut inPut;

    @RpcField(direction = Direction.OUTPUT, originalName = "ACCOUNT-OUT", displayName = "ACCOUNTOUT")
    private Gactcs9AccountOut accountOut;
}

