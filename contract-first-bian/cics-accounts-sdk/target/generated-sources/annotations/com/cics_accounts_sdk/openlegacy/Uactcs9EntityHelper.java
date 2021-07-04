package com.cics_accounts_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;

final class Uactcs9EntityHelper {
    public static final RpcEntityDefinition entityDefinition;

    public static final RpcEntityDefinition inputEntityDefinition;

    public static final RpcEntityDefinition outputEntityDefinition;

    static {
        entityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "f10694e4-e0a2-4d60-91db-644c5179e923",
                "Uactcs9",
                "com.cics_accounts_sdk.openlegacy.Uactcs9",
                "Uactcs9",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("dfhcommarea", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "dfhcommarea",
                "com.cics_accounts_sdk.openlegacy.Uactcs9Dfhcommarea",
                "Dfhcommarea",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                398,
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
                put("updateIn", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "updateIn",
                "com.cics_accounts_sdk.openlegacy.Uactcs9UpdateIn",
                "UPDATEIN",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "UPDATE-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("inputRecord", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "inputRecord",
                "com.cics_accounts_sdk.openlegacy.Uactcs9InputRecord",
                "INPUTRECORD",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "INPUT-RECORD",
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
                put("actiIban", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiIban",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                32,
                false,
                "ACTI-IBAN",
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
                put("actiTypeName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiTypeName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                12,
                false,
                "ACTI-TYPE-NAME",
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
                put("actiTypeDescription", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiTypeDescription",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                40,
                false,
                "ACTI-TYPE-DESCRIPTION",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiBalance", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "actiBalance",
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
                "ACTI-BALANCE",
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
                put("actiCrtDt", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiCrtDt",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "ACTI-CRT-DT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiUpdtDt", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiUpdtDt",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "ACTI-UPDT-DT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiLocked", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiLocked",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "ACTI-LOCKED",
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
                put("updateOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "updateOut",
                "com.cics_accounts_sdk.openlegacy.Uactcs9UpdateOut",
                "UPDATEOUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                229,
                false,
                new java.util.HashMap<String, String>() {{}},
                "UPDATE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("outputRecord", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "outputRecord",
                "com.cics_accounts_sdk.openlegacy.Uactcs9OutputRecord",
                "OUTPUTRECORD",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "OUTPUT-RECORD",
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
                "UACTCS9",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        inputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "f10694e4-e0a2-4d60-91db-644c5179e923",
                "Uactcs9",
                "com.cics_accounts_sdk.openlegacy.Uactcs9",
                "Uactcs9",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("dfhcommarea", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "dfhcommarea",
                "com.cics_accounts_sdk.openlegacy.Uactcs9Dfhcommarea",
                "Dfhcommarea",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                398,
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
                put("updateIn", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "updateIn",
                "com.cics_accounts_sdk.openlegacy.Uactcs9UpdateIn",
                "UPDATEIN",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "UPDATE-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("inputRecord", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "inputRecord",
                "com.cics_accounts_sdk.openlegacy.Uactcs9InputRecord",
                "INPUTRECORD",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "INPUT-RECORD",
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
                put("actiIban", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiIban",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                32,
                false,
                "ACTI-IBAN",
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
                put("actiTypeName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiTypeName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                12,
                false,
                "ACTI-TYPE-NAME",
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
                put("actiTypeDescription", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiTypeDescription",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                40,
                false,
                "ACTI-TYPE-DESCRIPTION",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiBalance", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "actiBalance",
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
                "ACTI-BALANCE",
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
                put("actiCrtDt", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiCrtDt",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "ACTI-CRT-DT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiUpdtDt", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiUpdtDt",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "ACTI-UPDT-DT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiLocked", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiLocked",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "ACTI-LOCKED",
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
                put("updateOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "updateOut",
                "com.cics_accounts_sdk.openlegacy.Uactcs9UpdateOut",
                "UPDATEOUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                229,
                false,
                new java.util.HashMap<String, String>() {{}},
                "UPDATE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("outputRecord", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "outputRecord",
                "com.cics_accounts_sdk.openlegacy.Uactcs9OutputRecord",
                "OUTPUTRECORD",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "OUTPUT-RECORD",
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
                "UACTCS9",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        outputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "f10694e4-e0a2-4d60-91db-644c5179e923",
                "Uactcs9",
                "com.cics_accounts_sdk.openlegacy.Uactcs9",
                "Uactcs9",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("dfhcommarea", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "dfhcommarea",
                "com.cics_accounts_sdk.openlegacy.Uactcs9Dfhcommarea",
                "Dfhcommarea",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                398,
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
                put("updateIn", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "updateIn",
                "com.cics_accounts_sdk.openlegacy.Uactcs9UpdateIn",
                "UPDATEIN",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "UPDATE-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("inputRecord", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "inputRecord",
                "com.cics_accounts_sdk.openlegacy.Uactcs9InputRecord",
                "INPUTRECORD",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "INPUT-RECORD",
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
                put("actiIban", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiIban",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                32,
                false,
                "ACTI-IBAN",
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
                put("actiTypeName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiTypeName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                12,
                false,
                "ACTI-TYPE-NAME",
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
                put("actiTypeDescription", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiTypeDescription",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                40,
                false,
                "ACTI-TYPE-DESCRIPTION",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiBalance", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "actiBalance",
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
                "ACTI-BALANCE",
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
                put("actiCrtDt", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiCrtDt",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "ACTI-CRT-DT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiUpdtDt", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiUpdtDt",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "ACTI-UPDT-DT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.MainFrameLegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("actiLocked", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "actiLocked",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "ACTI-LOCKED",
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
                put("updateOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "updateOut",
                "com.cics_accounts_sdk.openlegacy.Uactcs9UpdateOut",
                "UPDATEOUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                229,
                false,
                new java.util.HashMap<String, String>() {{}},
                "UPDATE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("outputRecord", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "outputRecord",
                "com.cics_accounts_sdk.openlegacy.Uactcs9OutputRecord",
                "OUTPUTRECORD",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "OUTPUT-RECORD",
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
                "UACTCS9",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
    }

    private static Uactcs9InputRecord fromUactcs9InputRecordJsonObject(JsonObject jsonObject,
            Uactcs9InputRecord inputRecord) {
        inputRecord.setActiAccountId(jsonObject.getString("actiAccountId"));
        inputRecord.setActiCustomerId(jsonObject.getString("actiCustomerId"));
        inputRecord.setActiCustomerName(jsonObject.getString("actiCustomerName"));
        inputRecord.setActiIban(jsonObject.getString("actiIban"));
        inputRecord.setActiCntryCd(jsonObject.getString("actiCntryCd"));
        inputRecord.setActiBnkId(jsonObject.getString("actiBnkId"));
        inputRecord.setActiBrnchId(jsonObject.getInteger("actiBrnchId"));
        inputRecord.setActiTypcd(jsonObject.getString("actiTypcd"));
        inputRecord.setActiTypeName(jsonObject.getString("actiTypeName"));
        inputRecord.setActiSubTypcd(jsonObject.getString("actiSubTypcd"));
        inputRecord.setActiTypeDescription(jsonObject.getString("actiTypeDescription"));
        inputRecord.setActiBalance(jsonObject.getDouble("actiBalance"));
        inputRecord.setActiCurrency(jsonObject.getString("actiCurrency"));
        inputRecord.setActiCrtDt(jsonObject.getString("actiCrtDt"));
        inputRecord.setActiUpdtDt(jsonObject.getString("actiUpdtDt"));
        inputRecord.setActiLocked(jsonObject.getString("actiLocked"));
        return inputRecord;
    }

    private static Uactcs9UpdateIn fromUactcs9UpdateInJsonObject(JsonObject jsonObject,
            Uactcs9UpdateIn updateIn) {
        JsonObject inputRecordObject = jsonObject.getJsonObject("inputRecord");
        if (inputRecordObject != null) {
            updateIn.setInputRecord(fromUactcs9InputRecordJsonObject(inputRecordObject, new Uactcs9InputRecord()));
        }
        return updateIn;
    }

    private static Uactcs9OutputRecord fromUactcs9OutputRecordJsonObject(JsonObject jsonObject,
            Uactcs9OutputRecord outputRecord) {
        outputRecord.setActoAccountId(jsonObject.getString("actoAccountId"));
        outputRecord.setActoCustomerId(jsonObject.getString("actoCustomerId"));
        outputRecord.setActoCustomerName(jsonObject.getString("actoCustomerName"));
        outputRecord.setActoIban(jsonObject.getString("actoIban"));
        outputRecord.setActoCntryCd(jsonObject.getString("actoCntryCd"));
        outputRecord.setActoBnkId(jsonObject.getString("actoBnkId"));
        outputRecord.setActoBrnchId(jsonObject.getInteger("actoBrnchId"));
        outputRecord.setActoTypcd(jsonObject.getString("actoTypcd"));
        outputRecord.setActoTypeName(jsonObject.getString("actoTypeName"));
        outputRecord.setActoSubTypcd(jsonObject.getString("actoSubTypcd"));
        outputRecord.setActoTypeDescription(jsonObject.getString("actoTypeDescription"));
        outputRecord.setActoBalance(jsonObject.getDouble("actoBalance"));
        outputRecord.setActoCurrency(jsonObject.getString("actoCurrency"));
        outputRecord.setActoCrtDt(jsonObject.getString("actoCrtDt"));
        outputRecord.setActoUpdtDt(jsonObject.getString("actoUpdtDt"));
        outputRecord.setActoLocked(jsonObject.getString("actoLocked"));
        return outputRecord;
    }

    private static Uactcs9UpdateOut fromUactcs9UpdateOutJsonObject(JsonObject jsonObject,
            Uactcs9UpdateOut updateOut) {
        JsonObject outputRecordObject = jsonObject.getJsonObject("outputRecord");
        if (outputRecordObject != null) {
            updateOut.setOutputRecord(fromUactcs9OutputRecordJsonObject(outputRecordObject, new Uactcs9OutputRecord()));
        }
        updateOut.setRtMsg(jsonObject.getString("rtMsg"));
        return updateOut;
    }

    private static Uactcs9Dfhcommarea fromUactcs9DfhcommareaJsonObject(JsonObject jsonObject,
            Uactcs9Dfhcommarea dfhcommarea) {
        JsonObject updateInObject = jsonObject.getJsonObject("updateIn");
        if (updateInObject != null) {
            dfhcommarea.setUpdateIn(fromUactcs9UpdateInJsonObject(updateInObject, new Uactcs9UpdateIn()));
        }
        JsonObject updateOutObject = jsonObject.getJsonObject("updateOut");
        if (updateOutObject != null) {
            dfhcommarea.setUpdateOut(fromUactcs9UpdateOutJsonObject(updateOutObject, new Uactcs9UpdateOut()));
        }
        return dfhcommarea;
    }

    public static void populateFromJson(@NotNull JsonObject jsonObject, @NotNull Uactcs9 entity) {
        Objects.requireNonNull(entity, "provided entity should not be null");
        if (jsonObject != null) {
            JsonObject dfhcommareaObject = jsonObject.getJsonObject("dfhcommarea");
            if (dfhcommareaObject != null) {
                entity.setDfhcommarea(fromUactcs9DfhcommareaJsonObject(dfhcommareaObject, new Uactcs9Dfhcommarea()));
            }
        }
    }

    private static JsonObject initUactcs9InputRecord(Uactcs9InputRecord object) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("actiAccountId", object.getActiAccountId());
        jsonObject.put("actiCustomerId", object.getActiCustomerId());
        jsonObject.put("actiCustomerName", object.getActiCustomerName());
        jsonObject.put("actiIban", object.getActiIban());
        jsonObject.put("actiCntryCd", object.getActiCntryCd());
        jsonObject.put("actiBnkId", object.getActiBnkId());
        jsonObject.put("actiBrnchId", object.getActiBrnchId());
        jsonObject.put("actiTypcd", object.getActiTypcd());
        jsonObject.put("actiTypeName", object.getActiTypeName());
        jsonObject.put("actiSubTypcd", object.getActiSubTypcd());
        jsonObject.put("actiTypeDescription", object.getActiTypeDescription());
        jsonObject.put("actiBalance", object.getActiBalance());
        jsonObject.put("actiCurrency", object.getActiCurrency());
        jsonObject.put("actiCrtDt", object.getActiCrtDt());
        jsonObject.put("actiUpdtDt", object.getActiUpdtDt());
        jsonObject.put("actiLocked", object.getActiLocked());
        return jsonObject;
    }

    private static JsonObject initUactcs9UpdateIn(Uactcs9UpdateIn object) {
        JsonObject jsonObject = new JsonObject();
        Uactcs9InputRecord inputRecord = object.getInputRecord();
        if (inputRecord != null) {
            jsonObject.put("inputRecord", initUactcs9InputRecord(inputRecord));
        } else {
            jsonObject.put("inputRecord", (Object) null);
        }
        return jsonObject;
    }

    private static JsonObject initUactcs9OutputRecord(Uactcs9OutputRecord object) {
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

    private static JsonObject initUactcs9UpdateOut(Uactcs9UpdateOut object) {
        JsonObject jsonObject = new JsonObject();
        Uactcs9OutputRecord outputRecord = object.getOutputRecord();
        if (outputRecord != null) {
            jsonObject.put("outputRecord", initUactcs9OutputRecord(outputRecord));
        } else {
            jsonObject.put("outputRecord", (Object) null);
        }
        jsonObject.put("rtMsg", object.getRtMsg());
        return jsonObject;
    }

    private static JsonObject initUactcs9Dfhcommarea(Uactcs9Dfhcommarea object) {
        JsonObject jsonObject = new JsonObject();
        Uactcs9UpdateIn updateIn = object.getUpdateIn();
        if (updateIn != null) {
            jsonObject.put("updateIn", initUactcs9UpdateIn(updateIn));
        } else {
            jsonObject.put("updateIn", (Object) null);
        }
        Uactcs9UpdateOut updateOut = object.getUpdateOut();
        if (updateOut != null) {
            jsonObject.put("updateOut", initUactcs9UpdateOut(updateOut));
        } else {
            jsonObject.put("updateOut", (Object) null);
        }
        return jsonObject;
    }

    public static JsonObject toJson(Uactcs9 entity) {
        JsonObject jsonObject = new JsonObject();
        if (entity != null) {
            Uactcs9Dfhcommarea dfhcommarea = entity.getDfhcommarea();
            if (dfhcommarea != null) {
                jsonObject.put("dfhcommarea", initUactcs9Dfhcommarea(dfhcommarea));
            } else {
                jsonObject.put("dfhcommarea", (Object) null);
            }
        }
        return jsonObject;
    }
}
