package com.cics_accounts_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;

final class Oactcs9EntityHelper {
    public static final RpcEntityDefinition entityDefinition;

    public static final RpcEntityDefinition inputEntityDefinition;

    public static final RpcEntityDefinition outputEntityDefinition;

    static {
        entityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "233b7167-b799-4eec-b376-ebc9d04bee32",
                "Oactcs9",
                "com.cics_accounts_sdk.openlegacy.Oactcs9",
                "Oactcs9",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("dfhcommarea", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "dfhcommarea",
                "com.cics_accounts_sdk.openlegacy.Oactcs9Dfhcommarea",
                "Dfhcommarea",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                298,
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
                "com.cics_accounts_sdk.openlegacy.Oactcs9InPut",
                "INPUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                68,
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
                put("actiAccountId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiAccountId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                11,
                false,
                "ACTI-ACCOUNT-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiCustomerId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiCustomerId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "ACTI-CUSTOMER-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiCustomerName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiCustomerName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "ACTI-CUSTOMER-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiTypcd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiTypcd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "ACTI-TYPCD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiSubTypcd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiSubTypcd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "ACTI-SUB-TYPCD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiCntryCd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiCntryCd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                2,
                false,
                "ACTI-CNTRY-CD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiBnkId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiBnkId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                4,
                false,
                "ACTI-BNK-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiBrnchId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "actiBrnchId",
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
                "ACTI-BRNCH-ID",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.BinaryBigEndian",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("actiInitialDeposit", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "actiInitialDeposit",
                "java.lang.Double",
                -9.9999999999999E10,
                9.9999999999999E10,
                "",
                "0",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                8,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "ACTI-INITIAL-DEPOSIT",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.PackedDecimal",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("actiCurrency", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiCurrency",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "ACTI-CURRENCY",
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
                put("accountOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "accountOut",
                "com.cics_accounts_sdk.openlegacy.Oactcs9AccountOut",
                "ACCOUNTOUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                230,
                false,
                new java.util.HashMap<String, String>() {{}},
                "ACCOUNT-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("outRecord", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "outRecord",
                "com.cics_accounts_sdk.openlegacy.Oactcs9OutRecord",
                "OUTRECORD",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "OUT-RECORD",
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
                put("rtcd", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "rtcd",
                "java.lang.Integer",
                -9.0,
                9.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                1,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "RTCD",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.ZonedNumeric",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
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
                "OACTCS9",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        inputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "233b7167-b799-4eec-b376-ebc9d04bee32",
                "Oactcs9",
                "com.cics_accounts_sdk.openlegacy.Oactcs9",
                "Oactcs9",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("dfhcommarea", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "dfhcommarea",
                "com.cics_accounts_sdk.openlegacy.Oactcs9Dfhcommarea",
                "Dfhcommarea",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                298,
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
                "com.cics_accounts_sdk.openlegacy.Oactcs9InPut",
                "INPUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                68,
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
                put("actiAccountId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiAccountId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                11,
                false,
                "ACTI-ACCOUNT-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiCustomerId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiCustomerId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "ACTI-CUSTOMER-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiCustomerName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiCustomerName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "ACTI-CUSTOMER-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiTypcd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiTypcd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "ACTI-TYPCD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiSubTypcd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiSubTypcd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "ACTI-SUB-TYPCD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiCntryCd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiCntryCd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                2,
                false,
                "ACTI-CNTRY-CD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiBnkId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiBnkId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                4,
                false,
                "ACTI-BNK-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiBrnchId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "actiBrnchId",
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
                "ACTI-BRNCH-ID",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.BinaryBigEndian",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("actiInitialDeposit", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "actiInitialDeposit",
                "java.lang.Double",
                -9.9999999999999E10,
                9.9999999999999E10,
                "",
                "0",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                8,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "ACTI-INITIAL-DEPOSIT",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.PackedDecimal",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("actiCurrency", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiCurrency",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "ACTI-CURRENCY",
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
                put("accountOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "accountOut",
                "com.cics_accounts_sdk.openlegacy.Oactcs9AccountOut",
                "ACCOUNTOUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                230,
                false,
                new java.util.HashMap<String, String>() {{}},
                "ACCOUNT-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("outRecord", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "outRecord",
                "com.cics_accounts_sdk.openlegacy.Oactcs9OutRecord",
                "OUTRECORD",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "OUT-RECORD",
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
                put("rtcd", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "rtcd",
                "java.lang.Integer",
                -9.0,
                9.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                1,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "RTCD",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.ZonedNumeric",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
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
                "OACTCS9",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        outputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "233b7167-b799-4eec-b376-ebc9d04bee32",
                "Oactcs9",
                "com.cics_accounts_sdk.openlegacy.Oactcs9",
                "Oactcs9",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("dfhcommarea", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "dfhcommarea",
                "com.cics_accounts_sdk.openlegacy.Oactcs9Dfhcommarea",
                "Dfhcommarea",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                298,
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
                "com.cics_accounts_sdk.openlegacy.Oactcs9InPut",
                "INPUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                68,
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
                put("actiAccountId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiAccountId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                11,
                false,
                "ACTI-ACCOUNT-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiCustomerId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiCustomerId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "ACTI-CUSTOMER-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiCustomerName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiCustomerName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "ACTI-CUSTOMER-NAME",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiTypcd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiTypcd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "ACTI-TYPCD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiSubTypcd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiSubTypcd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "ACTI-SUB-TYPCD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiCntryCd", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiCntryCd",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                2,
                false,
                "ACTI-CNTRY-CD",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiBnkId", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiBnkId",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                4,
                false,
                "ACTI-BNK-ID",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiBrnchId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "actiBrnchId",
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
                "ACTI-BRNCH-ID",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.BinaryBigEndian",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("actiInitialDeposit", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "actiInitialDeposit",
                "java.lang.Double",
                -9.9999999999999E10,
                9.9999999999999E10,
                "",
                "0",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                8,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "ACTI-INITIAL-DEPOSIT",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.PackedDecimal",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("actiCurrency", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiCurrency",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                3,
                false,
                "ACTI-CURRENCY",
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
                put("accountOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "accountOut",
                "com.cics_accounts_sdk.openlegacy.Oactcs9AccountOut",
                "ACCOUNTOUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                230,
                false,
                new java.util.HashMap<String, String>() {{}},
                "ACCOUNT-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("outRecord", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "outRecord",
                "com.cics_accounts_sdk.openlegacy.Oactcs9OutRecord",
                "OUTRECORD",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "OUT-RECORD",
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
                put("rtcd", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "rtcd",
                "java.lang.Integer",
                -9.0,
                9.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                1,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "RTCD",
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.ZonedNumeric",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
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
                "OACTCS9",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
    }

    private static Oactcs9InPut fromOactcs9InPutJsonObject(JsonObject jsonObject,
            Oactcs9InPut inPut) {
        inPut.setActiAccountId(jsonObject.getString("actiAccountId"));
        inPut.setActiCustomerId(jsonObject.getString("actiCustomerId"));
        inPut.setActiCustomerName(jsonObject.getString("actiCustomerName"));
        inPut.setActiTypcd(jsonObject.getString("actiTypcd"));
        inPut.setActiSubTypcd(jsonObject.getString("actiSubTypcd"));
        inPut.setActiCntryCd(jsonObject.getString("actiCntryCd"));
        inPut.setActiBnkId(jsonObject.getString("actiBnkId"));
        inPut.setActiBrnchId(jsonObject.getInteger("actiBrnchId"));
        inPut.setActiInitialDeposit(jsonObject.getDouble("actiInitialDeposit"));
        inPut.setActiCurrency(jsonObject.getString("actiCurrency"));
        return inPut;
    }

    private static Oactcs9OutRecord fromOactcs9OutRecordJsonObject(JsonObject jsonObject,
            Oactcs9OutRecord outRecord) {
        outRecord.setActoAccountId(jsonObject.getString("actoAccountId"));
        outRecord.setActoCustomerId(jsonObject.getString("actoCustomerId"));
        outRecord.setActoCustomerName(jsonObject.getString("actoCustomerName"));
        outRecord.setActoIban(jsonObject.getString("actoIban"));
        outRecord.setActoCntryCd(jsonObject.getString("actoCntryCd"));
        outRecord.setActoBnkId(jsonObject.getString("actoBnkId"));
        outRecord.setActoBrnchId(jsonObject.getInteger("actoBrnchId"));
        outRecord.setActoTypcd(jsonObject.getString("actoTypcd"));
        outRecord.setActoTypeName(jsonObject.getString("actoTypeName"));
        outRecord.setActoSubTypcd(jsonObject.getString("actoSubTypcd"));
        outRecord.setActoTypeDescription(jsonObject.getString("actoTypeDescription"));
        outRecord.setActoBalance(jsonObject.getDouble("actoBalance"));
        outRecord.setActoCurrency(jsonObject.getString("actoCurrency"));
        outRecord.setActoCrtDt(jsonObject.getString("actoCrtDt"));
        outRecord.setActoUpdtDt(jsonObject.getString("actoUpdtDt"));
        outRecord.setActoLocked(jsonObject.getString("actoLocked"));
        return outRecord;
    }

    private static Oactcs9AccountOut fromOactcs9AccountOutJsonObject(JsonObject jsonObject,
            Oactcs9AccountOut accountOut) {
        JsonObject outRecordObject = jsonObject.getJsonObject("outRecord");
        if (outRecordObject != null) {
            accountOut.setOutRecord(fromOactcs9OutRecordJsonObject(outRecordObject, new Oactcs9OutRecord()));
        }
        accountOut.setRtcd(jsonObject.getInteger("rtcd"));
        accountOut.setRtMsg(jsonObject.getString("rtMsg"));
        return accountOut;
    }

    private static Oactcs9Dfhcommarea fromOactcs9DfhcommareaJsonObject(JsonObject jsonObject,
            Oactcs9Dfhcommarea dfhcommarea) {
        JsonObject inPutObject = jsonObject.getJsonObject("inPut");
        if (inPutObject != null) {
            dfhcommarea.setInPut(fromOactcs9InPutJsonObject(inPutObject, new Oactcs9InPut()));
        }
        JsonObject accountOutObject = jsonObject.getJsonObject("accountOut");
        if (accountOutObject != null) {
            dfhcommarea.setAccountOut(fromOactcs9AccountOutJsonObject(accountOutObject, new Oactcs9AccountOut()));
        }
        return dfhcommarea;
    }

    public static void populateFromJson(@NotNull JsonObject jsonObject, @NotNull Oactcs9 entity) {
        Objects.requireNonNull(entity, "provided entity should not be null");
        if (jsonObject != null) {
            JsonObject dfhcommareaObject = jsonObject.getJsonObject("dfhcommarea");
            if (dfhcommareaObject != null) {
                entity.setDfhcommarea(fromOactcs9DfhcommareaJsonObject(dfhcommareaObject, new Oactcs9Dfhcommarea()));
            }
        }
    }

    private static JsonObject initOactcs9InPut(Oactcs9InPut object) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("actiAccountId", object.getActiAccountId());
        jsonObject.put("actiCustomerId", object.getActiCustomerId());
        jsonObject.put("actiCustomerName", object.getActiCustomerName());
        jsonObject.put("actiTypcd", object.getActiTypcd());
        jsonObject.put("actiSubTypcd", object.getActiSubTypcd());
        jsonObject.put("actiCntryCd", object.getActiCntryCd());
        jsonObject.put("actiBnkId", object.getActiBnkId());
        jsonObject.put("actiBrnchId", object.getActiBrnchId());
        jsonObject.put("actiInitialDeposit", object.getActiInitialDeposit());
        jsonObject.put("actiCurrency", object.getActiCurrency());
        return jsonObject;
    }

    private static JsonObject initOactcs9OutRecord(Oactcs9OutRecord object) {
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

    private static JsonObject initOactcs9AccountOut(Oactcs9AccountOut object) {
        JsonObject jsonObject = new JsonObject();
        Oactcs9OutRecord outRecord = object.getOutRecord();
        if (outRecord != null) {
            jsonObject.put("outRecord", initOactcs9OutRecord(outRecord));
        } else {
            jsonObject.put("outRecord", (Object) null);
        }
        jsonObject.put("rtcd", object.getRtcd());
        jsonObject.put("rtMsg", object.getRtMsg());
        return jsonObject;
    }

    private static JsonObject initOactcs9Dfhcommarea(Oactcs9Dfhcommarea object) {
        JsonObject jsonObject = new JsonObject();
        Oactcs9InPut inPut = object.getInPut();
        if (inPut != null) {
            jsonObject.put("inPut", initOactcs9InPut(inPut));
        } else {
            jsonObject.put("inPut", (Object) null);
        }
        Oactcs9AccountOut accountOut = object.getAccountOut();
        if (accountOut != null) {
            jsonObject.put("accountOut", initOactcs9AccountOut(accountOut));
        } else {
            jsonObject.put("accountOut", (Object) null);
        }
        return jsonObject;
    }

    public static JsonObject toJson(Oactcs9 entity) {
        JsonObject jsonObject = new JsonObject();
        if (entity != null) {
            Oactcs9Dfhcommarea dfhcommarea = entity.getDfhcommarea();
            if (dfhcommarea != null) {
                jsonObject.put("dfhcommarea", initOactcs9Dfhcommarea(dfhcommarea));
            } else {
                jsonObject.put("dfhcommarea", (Object) null);
            }
        }
        return jsonObject;
    }
}
