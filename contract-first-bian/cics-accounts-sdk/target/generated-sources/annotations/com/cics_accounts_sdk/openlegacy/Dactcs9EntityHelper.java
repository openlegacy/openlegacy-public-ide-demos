package com.cics_accounts_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;

final class Dactcs9EntityHelper {
    public static final RpcEntityDefinition entityDefinition;

    public static final RpcEntityDefinition inputEntityDefinition;

    public static final RpcEntityDefinition outputEntityDefinition;

    static {
        entityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "0070410f-28a0-4d63-9859-eda4ee9d17e0",
                "Dactcs9",
                "com.cics_accounts_sdk.openlegacy.Dactcs9",
                "Dactcs9",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("inPut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "inPut",
                "com.cics_accounts_sdk.openlegacy.Dactcs9InPut",
                "INPUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                11,
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
                }}
                ));
                put("accountOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "accountOut",
                "com.cics_accounts_sdk.openlegacy.Dactcs9AccountOut",
                "ACCOUNTOUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                229,
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
                put("accountDetails2", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "accountDetails2",
                "com.cics_accounts_sdk.openlegacy.Dactcs9AccountDetails2",
                "ACCOUNTDETAILS2",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "ACCOUNT-DETAILS2",
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
                }},
                null,
                new java.util.HashMap<String, String>() {{}},
                java.util.Arrays.asList(new org.openlegacy.core.model.entity.RpcActionDefinition[]{
                new org.openlegacy.core.model.entity.RpcActionDefinition(
                new org.openlegacy.core.rpc.actions.RpcActions.EXECUTE(),
                "execute",
                "Execute",
                "DACTCS9",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        inputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "0070410f-28a0-4d63-9859-eda4ee9d17e0",
                "Dactcs9",
                "com.cics_accounts_sdk.openlegacy.Dactcs9",
                "Dactcs9",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("inPut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "inPut",
                "com.cics_accounts_sdk.openlegacy.Dactcs9InPut",
                "INPUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                11,
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
                }}
                ));
                put("accountOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "accountOut",
                "com.cics_accounts_sdk.openlegacy.Dactcs9AccountOut",
                "ACCOUNTOUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                229,
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
                put("accountDetails2", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "accountDetails2",
                "com.cics_accounts_sdk.openlegacy.Dactcs9AccountDetails2",
                "ACCOUNTDETAILS2",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "ACCOUNT-DETAILS2",
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
                }},
                null,
                new java.util.HashMap<String, String>() {{}},
                java.util.Arrays.asList(new org.openlegacy.core.model.entity.RpcActionDefinition[]{
                new org.openlegacy.core.model.entity.RpcActionDefinition(
                new org.openlegacy.core.rpc.actions.RpcActions.EXECUTE(),
                "execute",
                "Execute",
                "DACTCS9",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        outputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "0070410f-28a0-4d63-9859-eda4ee9d17e0",
                "Dactcs9",
                "com.cics_accounts_sdk.openlegacy.Dactcs9",
                "Dactcs9",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("inPut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "inPut",
                "com.cics_accounts_sdk.openlegacy.Dactcs9InPut",
                "INPUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                11,
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
                }}
                ));
                put("accountOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "accountOut",
                "com.cics_accounts_sdk.openlegacy.Dactcs9AccountOut",
                "ACCOUNTOUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                229,
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
                put("accountDetails2", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "accountDetails2",
                "com.cics_accounts_sdk.openlegacy.Dactcs9AccountDetails2",
                "ACCOUNTDETAILS2",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                169,
                false,
                new java.util.HashMap<String, String>() {{}},
                "ACCOUNT-DETAILS2",
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
                }},
                null,
                new java.util.HashMap<String, String>() {{}},
                java.util.Arrays.asList(new org.openlegacy.core.model.entity.RpcActionDefinition[]{
                new org.openlegacy.core.model.entity.RpcActionDefinition(
                new org.openlegacy.core.rpc.actions.RpcActions.EXECUTE(),
                "execute",
                "Execute",
                "DACTCS9",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
    }

    private static Dactcs9InPut fromDactcs9InPutJsonObject(JsonObject jsonObject,
            Dactcs9InPut inPut) {
        inPut.setActiAccountId(jsonObject.getString("actiAccountId"));
        return inPut;
    }

    private static Dactcs9AccountDetails2 fromDactcs9AccountDetails2JsonObject(
            JsonObject jsonObject, Dactcs9AccountDetails2 accountDetails2) {
        accountDetails2.setActoAccountId(jsonObject.getString("actoAccountId"));
        accountDetails2.setActoCustomerId(jsonObject.getString("actoCustomerId"));
        accountDetails2.setActoCustomerName(jsonObject.getString("actoCustomerName"));
        accountDetails2.setActoIban(jsonObject.getString("actoIban"));
        accountDetails2.setActoCntryCd(jsonObject.getString("actoCntryCd"));
        accountDetails2.setActoBnkId(jsonObject.getString("actoBnkId"));
        accountDetails2.setActoBrnchId(jsonObject.getInteger("actoBrnchId"));
        accountDetails2.setActoTypcd(jsonObject.getString("actoTypcd"));
        accountDetails2.setActoTypeName(jsonObject.getString("actoTypeName"));
        accountDetails2.setActoSubTypcd(jsonObject.getString("actoSubTypcd"));
        accountDetails2.setActoTypeDescription(jsonObject.getString("actoTypeDescription"));
        accountDetails2.setActoBalance(jsonObject.getDouble("actoBalance"));
        accountDetails2.setActoCurrency(jsonObject.getString("actoCurrency"));
        accountDetails2.setActoCrtDt(jsonObject.getString("actoCrtDt"));
        accountDetails2.setActoUpdtDt(jsonObject.getString("actoUpdtDt"));
        accountDetails2.setActoLocked(jsonObject.getString("actoLocked"));
        return accountDetails2;
    }

    private static Dactcs9AccountOut fromDactcs9AccountOutJsonObject(JsonObject jsonObject,
            Dactcs9AccountOut accountOut) {
        JsonObject accountDetails2Object = jsonObject.getJsonObject("accountDetails2");
        if (accountDetails2Object != null) {
            accountOut.setAccountDetails2(fromDactcs9AccountDetails2JsonObject(accountDetails2Object, new Dactcs9AccountDetails2()));
        }
        accountOut.setRtMsg(jsonObject.getString("rtMsg"));
        return accountOut;
    }

    public static void populateFromJson(@NotNull JsonObject jsonObject, @NotNull Dactcs9 entity) {
        Objects.requireNonNull(entity, "provided entity should not be null");
        if (jsonObject != null) {
            JsonObject inPutObject = jsonObject.getJsonObject("inPut");
            if (inPutObject != null) {
                entity.setInPut(fromDactcs9InPutJsonObject(inPutObject, new Dactcs9InPut()));
            }
            JsonObject accountOutObject = jsonObject.getJsonObject("accountOut");
            if (accountOutObject != null) {
                entity.setAccountOut(fromDactcs9AccountOutJsonObject(accountOutObject, new Dactcs9AccountOut()));
            }
        }
    }

    private static JsonObject initDactcs9InPut(Dactcs9InPut object) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("actiAccountId", object.getActiAccountId());
        return jsonObject;
    }

    private static JsonObject initDactcs9AccountDetails2(Dactcs9AccountDetails2 object) {
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

    private static JsonObject initDactcs9AccountOut(Dactcs9AccountOut object) {
        JsonObject jsonObject = new JsonObject();
        Dactcs9AccountDetails2 accountDetails2 = object.getAccountDetails2();
        if (accountDetails2 != null) {
            jsonObject.put("accountDetails2", initDactcs9AccountDetails2(accountDetails2));
        } else {
            jsonObject.put("accountDetails2", (Object) null);
        }
        jsonObject.put("rtMsg", object.getRtMsg());
        return jsonObject;
    }

    public static JsonObject toJson(Dactcs9 entity) {
        JsonObject jsonObject = new JsonObject();
        if (entity != null) {
            Dactcs9InPut inPut = entity.getInPut();
            if (inPut != null) {
                jsonObject.put("inPut", initDactcs9InPut(inPut));
            } else {
                jsonObject.put("inPut", (Object) null);
            }
            Dactcs9AccountOut accountOut = entity.getAccountOut();
            if (accountOut != null) {
                jsonObject.put("accountOut", initDactcs9AccountOut(accountOut));
            } else {
                jsonObject.put("accountOut", (Object) null);
            }
        }
        return jsonObject;
    }
}
