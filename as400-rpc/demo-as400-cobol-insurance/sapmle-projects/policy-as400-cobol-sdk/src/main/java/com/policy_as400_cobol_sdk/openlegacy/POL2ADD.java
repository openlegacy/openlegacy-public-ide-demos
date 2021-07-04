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
import org.openlegacy.core.annotations.rpc.Action;
import org.openlegacy.core.annotations.rpc.*;
import org.openlegacy.core.rpc.actions.RpcActions.EXECUTE;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@RpcEntity(name="POL2ADD", language=Languages.COBOL)
@RpcActions(actions = {
        @Action(action = EXECUTE.class, path = "/QSYS.LIB/POLICY.LIB/POL2ADD.pgm", displayName = "Execute", alias = "execute" )            })
public class POL2ADD implements org.openlegacy.core.rpc.RpcEntity {

    @RpcField(direction = Direction.INPUT, originalName = "pol2addInput")
    private POL2ADDPol2addInput pol2addInput;

    @RpcField(direction = Direction.OUTPUT, originalName = "pol2addOutput")
    private POL2ADDPol2addOutput pol2addOutput;




    @NotNull
    @Override
    public RpcEntityDefinition entityDefinition() {
        return POL2ADDEntityHelper.entityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition inputEntityDefinition() {
        return POL2ADDEntityHelper.inputEntityDefinition;
    }

    @NotNull
    @Override
    public RpcEntityDefinition outputEntityDefinition() {
        return POL2ADDEntityHelper.outputEntityDefinition;
    }

    @NotNull
    @Override
    public JsonObject toJsonObject() {
        return POL2ADDEntityHelper.toJson(this);
    }

    @Override
    public void populateFromJson(@NotNull JsonObject jsonObject) {
        POL2ADDEntityHelper.populateFromJson(jsonObject, this);
    }

}

