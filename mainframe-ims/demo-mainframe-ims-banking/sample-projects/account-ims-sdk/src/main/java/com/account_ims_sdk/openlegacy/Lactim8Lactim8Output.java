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
public class Lactim8Lactim8Output {

    @RpcField(length = 8, direction = Direction.OUTPUT, originalName = "CONV-TRAN", legacyType = MainFrameLegacyTypes.Char.class)
    private String convTran;

    @RpcField(length = 60, direction = Direction.OUTPUT, originalName = "RT-MSG", legacyType = MainFrameLegacyTypes.Char.class)
    private String rtMsg;

    @RpcField(direction = Direction.OUTPUT, originalName = "ACCOUNT-ARRAY", displayName = "ACCOUNTARRAY")
    @RpcList(count = 10)
    private List<Lactim8AccountArray> accountArray;
}

