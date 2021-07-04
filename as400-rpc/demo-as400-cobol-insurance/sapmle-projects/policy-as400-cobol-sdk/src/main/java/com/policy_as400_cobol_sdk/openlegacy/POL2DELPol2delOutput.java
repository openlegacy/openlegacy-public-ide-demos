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
public class POL2DELPol2delOutput {

    @RpcField(direction = Direction.OUTPUT, originalName = "POLICY-REC-OUT", displayName = "POLICYRECOUT")
    private POL2DELPolicyRecOut policyRecOut;

    @RpcField(length = 1, direction = Direction.OUTPUT, originalName = "SUCCESS", legacyType = Jt400LegacyTypes.Char.class)
    private String success;

    @RpcField(length = 1, direction = Direction.OUTPUT, originalName = "RESULT-SQLCODE-SIGN", legacyType = Jt400LegacyTypes.Char.class)
    private String resultSqlcodeSign;

    @RpcField(length = 5, direction = Direction.OUTPUT, originalName = "RESULT-SQLCODE", legacyType = Jt400LegacyTypes.Char.class)
    private String resultSqlcode;

    @RpcField(length = 5, direction = Direction.OUTPUT, originalName = "RESULT-SQLSTATE", legacyType = Jt400LegacyTypes.Char.class)
    private String resultSqlstate;

    @RpcField(length = 70, direction = Direction.OUTPUT, originalName = "RESULT-SQLERRMC", legacyType = Jt400LegacyTypes.Char.class)
    private String resultSqlerrmc;
}

