package com.cics_accounts_sdk.openlegacy;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;

final class Lactcs9EntityHelper {
    public static final RpcEntityDefinition entityDefinition;

    public static final RpcEntityDefinition inputEntityDefinition;

    public static final RpcEntityDefinition outputEntityDefinition;

    static {
        entityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "e37ca40b-38cc-4f5c-87a0-04bfa9774e42",
                "Lactcs9",
                "com.cics_accounts_sdk.openlegacy.Lactcs9",
                "Lactcs9",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("dfhcommarea", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "dfhcommarea",
                "com.cics_accounts_sdk.openlegacy.Lactcs9Dfhcommarea",
                "Dfhcommarea",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                61,
                false,
                new java.util.HashMap<String, String>() {{}},
                "DFHCOMMAREA",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("inPut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "inPut",
                "com.cics_accounts_sdk.openlegacy.Lactcs9InPut",
                "INPUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                new java.util.HashMap<String, String>() {{}},
                "IN-PUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("onechar", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "onechar",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "ONECHAR",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "'A'",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ));
                put("outPut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "outPut",
                "com.cics_accounts_sdk.openlegacy.Lactcs9OutPut",
                "OUTPUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                60,
                false,
                new java.util.HashMap<String, String>() {{}},
                "OUT-PUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("rtMsg", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "rtMsg",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                60,
                false,
                "RT-MSG",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("accountArray", new org.openlegacy.core.model.field.RpcCollectionFieldDefinition(
                "accountArray",
                "java.util.List",
                new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "accountArray",
                "com.cics_accounts_sdk.openlegacy.Lactcs9AccountArray",
                "ACCOUNTARRAY",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "ACCOUNT-ARRAY",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("actoDetails", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "actoDetails",
                "com.cics_accounts_sdk.openlegacy.Lactcs9ActoDetails",
                "ACTODETAILS",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "ACTO-DETAILS",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("actoAccountId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoAccountId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                11,
                false,
                "ACTO-ACCOUNT-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoCustomerId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoCustomerId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "ACTO-CUSTOMER-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoCustomerName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoCustomerName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "ACTO-CUSTOMER-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoIban", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoIban",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                32,
                false,
                "ACTO-IBAN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoCntryCd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoCntryCd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                2,
                false,
                "ACTO-CNTRY-CD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoBnkId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoBnkId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                4,
                false,
                "ACTO-BNK-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoBrnchId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "actoBrnchId",
                "java.lang.Integer",
                -9.99999999E8,
                9.99999999E8,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                4,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "ACTO-BRNCH-ID",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.BinaryBigEndian",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("actoTypcd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoTypcd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "ACTO-TYPCD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoTypeName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoTypeName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                12,
                false,
                "ACTO-TYPE-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoSubTypcd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoSubTypcd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "ACTO-SUB-TYPCD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoTypeDescription", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoTypeDescription",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                40,
                false,
                "ACTO-TYPE-DESCRIPTION",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoBalance", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "actoBalance",
                "java.lang.Double",
                -9.9999999999999E10,
                9.9999999999999E10,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                8,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "ACTO-BALANCE",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.PackedDecimal",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("actoCurrency", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoCurrency",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "ACTO-CURRENCY",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoCrtDt", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoCrtDt",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "ACTO-CRT-DT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoUpdtDt", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoUpdtDt",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "ACTO-UPDT-DT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoLocked", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoLocked",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "ACTO-LOCKED",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ));
                }}
                ),
                "ACCOUNT-ARRAY",
                "ACCOUNTARRAY",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                false,
                0,
                false,
                new java.util.HashMap<String, String>() {{}},
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                10
                ));
                }}
                ));
                }}
                ));
                }},
                null,
                new java.util.HashMap<String, String>() {{}},
                java.util.Arrays.asList(new org.openlegacy.core.model.entity.RpcActionDefinition[]{
                new org.openlegacy.core.model.entity.RpcActionDefinition(
                new org.openlegacy.core.rpc.actions.RpcActions.EXECUTE(),
                "execute",
                "Execute",
                "LACTCS9",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        inputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "e37ca40b-38cc-4f5c-87a0-04bfa9774e42",
                "Lactcs9",
                "com.cics_accounts_sdk.openlegacy.Lactcs9",
                "Lactcs9",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("dfhcommarea", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "dfhcommarea",
                "com.cics_accounts_sdk.openlegacy.Lactcs9Dfhcommarea",
                "Dfhcommarea",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                61,
                false,
                new java.util.HashMap<String, String>() {{}},
                "DFHCOMMAREA",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("inPut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "inPut",
                "com.cics_accounts_sdk.openlegacy.Lactcs9InPut",
                "INPUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                new java.util.HashMap<String, String>() {{}},
                "IN-PUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("onechar", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "onechar",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "ONECHAR",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "'A'",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ));
                put("outPut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "outPut",
                "com.cics_accounts_sdk.openlegacy.Lactcs9OutPut",
                "OUTPUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                60,
                false,
                new java.util.HashMap<String, String>() {{}},
                "OUT-PUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("rtMsg", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "rtMsg",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                60,
                false,
                "RT-MSG",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("accountArray", new org.openlegacy.core.model.field.RpcCollectionFieldDefinition(
                "accountArray",
                "java.util.List",
                new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "accountArray",
                "com.cics_accounts_sdk.openlegacy.Lactcs9AccountArray",
                "ACCOUNTARRAY",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "ACCOUNT-ARRAY",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("actoDetails", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "actoDetails",
                "com.cics_accounts_sdk.openlegacy.Lactcs9ActoDetails",
                "ACTODETAILS",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "ACTO-DETAILS",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("actoAccountId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoAccountId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                11,
                false,
                "ACTO-ACCOUNT-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoCustomerId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoCustomerId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "ACTO-CUSTOMER-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoCustomerName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoCustomerName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "ACTO-CUSTOMER-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoIban", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoIban",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                32,
                false,
                "ACTO-IBAN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoCntryCd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoCntryCd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                2,
                false,
                "ACTO-CNTRY-CD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoBnkId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoBnkId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                4,
                false,
                "ACTO-BNK-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoBrnchId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "actoBrnchId",
                "java.lang.Integer",
                -9.99999999E8,
                9.99999999E8,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                4,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "ACTO-BRNCH-ID",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.BinaryBigEndian",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("actoTypcd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoTypcd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "ACTO-TYPCD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoTypeName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoTypeName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                12,
                false,
                "ACTO-TYPE-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoSubTypcd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoSubTypcd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "ACTO-SUB-TYPCD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoTypeDescription", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoTypeDescription",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                40,
                false,
                "ACTO-TYPE-DESCRIPTION",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoBalance", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "actoBalance",
                "java.lang.Double",
                -9.9999999999999E10,
                9.9999999999999E10,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                8,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "ACTO-BALANCE",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.PackedDecimal",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("actoCurrency", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoCurrency",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "ACTO-CURRENCY",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoCrtDt", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoCrtDt",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "ACTO-CRT-DT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoUpdtDt", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoUpdtDt",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "ACTO-UPDT-DT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoLocked", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoLocked",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "ACTO-LOCKED",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ));
                }}
                ),
                "ACCOUNT-ARRAY",
                "ACCOUNTARRAY",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                false,
                0,
                false,
                new java.util.HashMap<String, String>() {{}},
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                10
                ));
                }}
                ));
                }}
                ));
                }},
                null,
                new java.util.HashMap<String, String>() {{}},
                java.util.Arrays.asList(new org.openlegacy.core.model.entity.RpcActionDefinition[]{
                new org.openlegacy.core.model.entity.RpcActionDefinition(
                new org.openlegacy.core.rpc.actions.RpcActions.EXECUTE(),
                "execute",
                "Execute",
                "LACTCS9",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        outputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "e37ca40b-38cc-4f5c-87a0-04bfa9774e42",
                "Lactcs9",
                "com.cics_accounts_sdk.openlegacy.Lactcs9",
                "Lactcs9",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("dfhcommarea", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "dfhcommarea",
                "com.cics_accounts_sdk.openlegacy.Lactcs9Dfhcommarea",
                "Dfhcommarea",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                61,
                false,
                new java.util.HashMap<String, String>() {{}},
                "DFHCOMMAREA",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("inPut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "inPut",
                "com.cics_accounts_sdk.openlegacy.Lactcs9InPut",
                "INPUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                new java.util.HashMap<String, String>() {{}},
                "IN-PUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("onechar", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "onechar",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "ONECHAR",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "'A'",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ));
                put("outPut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "outPut",
                "com.cics_accounts_sdk.openlegacy.Lactcs9OutPut",
                "OUTPUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                60,
                false,
                new java.util.HashMap<String, String>() {{}},
                "OUT-PUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("rtMsg", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "rtMsg",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                60,
                false,
                "RT-MSG",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("accountArray", new org.openlegacy.core.model.field.RpcCollectionFieldDefinition(
                "accountArray",
                "java.util.List",
                new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "accountArray",
                "com.cics_accounts_sdk.openlegacy.Lactcs9AccountArray",
                "ACCOUNTARRAY",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "ACCOUNT-ARRAY",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("actoDetails", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "actoDetails",
                "com.cics_accounts_sdk.openlegacy.Lactcs9ActoDetails",
                "ACTODETAILS",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "ACTO-DETAILS",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("actoAccountId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoAccountId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                11,
                false,
                "ACTO-ACCOUNT-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoCustomerId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoCustomerId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "ACTO-CUSTOMER-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoCustomerName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoCustomerName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "ACTO-CUSTOMER-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoIban", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoIban",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                32,
                false,
                "ACTO-IBAN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoCntryCd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoCntryCd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                2,
                false,
                "ACTO-CNTRY-CD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoBnkId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoBnkId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                4,
                false,
                "ACTO-BNK-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoBrnchId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "actoBrnchId",
                "java.lang.Integer",
                -9.99999999E8,
                9.99999999E8,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                4,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "ACTO-BRNCH-ID",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.BinaryBigEndian",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("actoTypcd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoTypcd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "ACTO-TYPCD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoTypeName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoTypeName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                12,
                false,
                "ACTO-TYPE-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoSubTypcd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoSubTypcd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "ACTO-SUB-TYPCD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoTypeDescription", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoTypeDescription",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                40,
                false,
                "ACTO-TYPE-DESCRIPTION",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoBalance", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "actoBalance",
                "java.lang.Double",
                -9.9999999999999E10,
                9.9999999999999E10,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                8,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "ACTO-BALANCE",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.PackedDecimal",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("actoCurrency", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoCurrency",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "ACTO-CURRENCY",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoCrtDt", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoCrtDt",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "ACTO-CRT-DT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoUpdtDt", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoUpdtDt",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "ACTO-UPDT-DT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actoLocked", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actoLocked",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "ACTO-LOCKED",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ));
                }}
                ),
                "ACCOUNT-ARRAY",
                "ACCOUNTARRAY",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                false,
                0,
                false,
                new java.util.HashMap<String, String>() {{}},
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                10
                ));
                }}
                ));
                }}
                ));
                }},
                null,
                new java.util.HashMap<String, String>() {{}},
                java.util.Arrays.asList(new org.openlegacy.core.model.entity.RpcActionDefinition[]{
                new org.openlegacy.core.model.entity.RpcActionDefinition(
                new org.openlegacy.core.rpc.actions.RpcActions.EXECUTE(),
                "execute",
                "Execute",
                "LACTCS9",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
    }

    private static Lactcs9InPut fromLactcs9InPutJsonObject(JsonObject jsonObject,
            Lactcs9InPut inPut) {
        inPut.setOnechar(jsonObject.getString("onechar"));
        return inPut;
    }

    private static Lactcs9ActoDetails fromLactcs9ActoDetailsJsonObject(JsonObject jsonObject,
            Lactcs9ActoDetails actoDetails) {
        actoDetails.setActoAccountId(jsonObject.getString("actoAccountId"));
        actoDetails.setActoCustomerId(jsonObject.getString("actoCustomerId"));
        actoDetails.setActoCustomerName(jsonObject.getString("actoCustomerName"));
        actoDetails.setActoIban(jsonObject.getString("actoIban"));
        actoDetails.setActoCntryCd(jsonObject.getString("actoCntryCd"));
        actoDetails.setActoBnkId(jsonObject.getString("actoBnkId"));
        actoDetails.setActoBrnchId(jsonObject.getInteger("actoBrnchId"));
        actoDetails.setActoTypcd(jsonObject.getString("actoTypcd"));
        actoDetails.setActoTypeName(jsonObject.getString("actoTypeName"));
        actoDetails.setActoSubTypcd(jsonObject.getString("actoSubTypcd"));
        actoDetails.setActoTypeDescription(jsonObject.getString("actoTypeDescription"));
        actoDetails.setActoBalance(jsonObject.getDouble("actoBalance"));
        actoDetails.setActoCurrency(jsonObject.getString("actoCurrency"));
        actoDetails.setActoCrtDt(jsonObject.getString("actoCrtDt"));
        actoDetails.setActoUpdtDt(jsonObject.getString("actoUpdtDt"));
        actoDetails.setActoLocked(jsonObject.getString("actoLocked"));
        return actoDetails;
    }

    private static Lactcs9AccountArray fromLactcs9AccountArrayJsonObject(JsonObject jsonObject,
            Lactcs9AccountArray accountArray) {
        JsonObject actoDetailsObject = jsonObject.getJsonObject("actoDetails");
        if (actoDetailsObject != null) {
            accountArray.setActoDetails(fromLactcs9ActoDetailsJsonObject(actoDetailsObject, new Lactcs9ActoDetails()));
        }
        return accountArray;
    }

    private static List<Lactcs9AccountArray> fromjutilListccopenlegacyLactcs9AccountArrayJsonArray(
            JsonArray array) {
        List<Lactcs9AccountArray> list = new ArrayList<>(array.size());
        for(int i = 0; i < array.size(); i++) {
            JsonObject objectElement = array.getJsonObject(i);
            if (objectElement != null) {
                list.add((Lactcs9AccountArray) fromLactcs9AccountArrayJsonObject(objectElement, new Lactcs9AccountArray()));
            }
        }
        return list;
    }

    private static Lactcs9OutPut fromLactcs9OutPutJsonObject(JsonObject jsonObject,
            Lactcs9OutPut outPut) {
        outPut.setRtMsg(jsonObject.getString("rtMsg"));
        JsonArray accountArrayArray = jsonObject.getJsonArray("accountArray");
        if (accountArrayArray != null) {
            outPut.setAccountArray(fromjutilListccopenlegacyLactcs9AccountArrayJsonArray(accountArrayArray));
        } else {
            outPut.setAccountArray(new ArrayList<>());
        }
        return outPut;
    }

    private static Lactcs9Dfhcommarea fromLactcs9DfhcommareaJsonObject(JsonObject jsonObject,
            Lactcs9Dfhcommarea dfhcommarea) {
        JsonObject inPutObject = jsonObject.getJsonObject("inPut");
        if (inPutObject != null) {
            dfhcommarea.setInPut(fromLactcs9InPutJsonObject(inPutObject, new Lactcs9InPut()));
        }
        JsonObject outPutObject = jsonObject.getJsonObject("outPut");
        if (outPutObject != null) {
            dfhcommarea.setOutPut(fromLactcs9OutPutJsonObject(outPutObject, new Lactcs9OutPut()));
        }
        return dfhcommarea;
    }

    public static void populateFromJson(@NotNull JsonObject jsonObject, @NotNull Lactcs9 entity) {
        Objects.requireNonNull(entity, "provided entity should not be null");
        if (jsonObject != null) {
            JsonObject dfhcommareaObject = jsonObject.getJsonObject("dfhcommarea");
            if (dfhcommareaObject != null) {
                entity.setDfhcommarea(fromLactcs9DfhcommareaJsonObject(dfhcommareaObject, new Lactcs9Dfhcommarea()));
            }
        }
    }

    private static JsonObject initLactcs9InPut(Lactcs9InPut object) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("onechar", object.getOnechar());
        return jsonObject;
    }

    private static JsonObject initLactcs9ActoDetails(Lactcs9ActoDetails object) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("actoAccountId", object.getActoAccountId());
        jsonObject.put("actoCustomerId", object.getActoCustomerId());
        jsonObject.put("actoCustomerName", object.getActoCustomerName());
        jsonObject.put("actoIban", object.getActoIban());
        jsonObject.put("actoCntryCd", object.getActoCntryCd());
        jsonObject.put("actoBnkId", object.getActoBnkId());
        jsonObject.put("actoBrnchId", object.getActoBrnchId());
        jsonObject.put("actoTypcd", object.getActoTypcd());
        jsonObject.put("actoTypeName", object.getActoTypeName());
        jsonObject.put("actoSubTypcd", object.getActoSubTypcd());
        jsonObject.put("actoTypeDescription", object.getActoTypeDescription());
        jsonObject.put("actoBalance", object.getActoBalance());
        jsonObject.put("actoCurrency", object.getActoCurrency());
        jsonObject.put("actoCrtDt", object.getActoCrtDt());
        jsonObject.put("actoUpdtDt", object.getActoUpdtDt());
        jsonObject.put("actoLocked", object.getActoLocked());
        return jsonObject;
    }

    private static JsonObject initLactcs9AccountArray(Lactcs9AccountArray object) {
        JsonObject jsonObject = new JsonObject();
        Lactcs9ActoDetails actoDetails = object.getActoDetails();
        if (actoDetails != null) {
            jsonObject.put("actoDetails", initLactcs9ActoDetails(actoDetails));
        } else {
            jsonObject.put("actoDetails", (Object) null);
        }
        return jsonObject;
    }

    private static JsonArray initLactcs9AccountArrayArray(List<Lactcs9AccountArray> list) {
        JsonArray jsonArray = new JsonArray();
        if (list != null) {
            for (Lactcs9AccountArray element : list) {
                jsonArray.add(initLactcs9AccountArray(element));
            }
        }
        return jsonArray;
    }

    private static JsonObject initLactcs9OutPut(Lactcs9OutPut object) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("rtMsg", object.getRtMsg());
        List<Lactcs9AccountArray> accountArray = object.getAccountArray();
        if (accountArray != null) {
            jsonObject.put("accountArray", initLactcs9AccountArrayArray(accountArray));
        } else {
            jsonObject.put("accountArray", (Object) null);
        }
        return jsonObject;
    }

    private static JsonObject initLactcs9Dfhcommarea(Lactcs9Dfhcommarea object) {
        JsonObject jsonObject = new JsonObject();
        Lactcs9InPut inPut = object.getInPut();
        if (inPut != null) {
            jsonObject.put("inPut", initLactcs9InPut(inPut));
        } else {
            jsonObject.put("inPut", (Object) null);
        }
        Lactcs9OutPut outPut = object.getOutPut();
        if (outPut != null) {
            jsonObject.put("outPut", initLactcs9OutPut(outPut));
        } else {
            jsonObject.put("outPut", (Object) null);
        }
        return jsonObject;
    }

    public static JsonObject toJson(Lactcs9 entity) {
        JsonObject jsonObject = new JsonObject();
        if (entity != null) {
            Lactcs9Dfhcommarea dfhcommarea = entity.getDfhcommarea();
            if (dfhcommarea != null) {
                jsonObject.put("dfhcommarea", initLactcs9Dfhcommarea(dfhcommarea));
            } else {
                jsonObject.put("dfhcommarea", (Object) null);
            }
        }
        return jsonObject;
    }
}
