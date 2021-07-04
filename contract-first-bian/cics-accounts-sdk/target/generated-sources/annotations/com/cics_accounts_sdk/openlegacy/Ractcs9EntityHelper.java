package com.cics_accounts_sdk.openlegacy;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;

final class Ractcs9EntityHelper {
    public static final RpcEntityDefinition entityDefinition;

    public static final RpcEntityDefinition inputEntityDefinition;

    public static final RpcEntityDefinition outputEntityDefinition;

    static {
        entityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "e6bb5b2d-6b85-47c0-9347-f20ac9731baa",
                "Ractcs9",
                "com.cics_accounts_sdk.openlegacy.Ractcs9",
                "Ractcs9",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("dfhcommarea", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "dfhcommarea",
                "com.cics_accounts_sdk.openlegacy.Ractcs9Dfhcommarea",
                "Dfhcommarea",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                60,
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
                "com.cics_accounts_sdk.openlegacy.Ractcs9InPut",
                "INPUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                0,
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
                put("accountArray", new org.openlegacy.core.model.field.RpcCollectionFieldDefinition(
                "accountArray",
                "java.util.List",
                new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "accountArray",
                "com.cics_accounts_sdk.openlegacy.Ractcs9AccountArray",
                "ACCOUNTARRAY",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                68,
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
                put("actiDetails", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "actiDetails",
                "com.cics_accounts_sdk.openlegacy.Ractcs9ActiDetails",
                "ACTIDETAILS",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                68,
                false,
                new java.util.HashMap<String, String>() {{}},
                "ACTI-DETAILS",
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
                null,
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
                put("outPut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "outPut",
                "com.cics_accounts_sdk.openlegacy.Ractcs9OutPut",
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
                "RACTCS9",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        inputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "e6bb5b2d-6b85-47c0-9347-f20ac9731baa",
                "Ractcs9",
                "com.cics_accounts_sdk.openlegacy.Ractcs9",
                "Ractcs9",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("dfhcommarea", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "dfhcommarea",
                "com.cics_accounts_sdk.openlegacy.Ractcs9Dfhcommarea",
                "Dfhcommarea",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                60,
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
                "com.cics_accounts_sdk.openlegacy.Ractcs9InPut",
                "INPUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                0,
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
                put("accountArray", new org.openlegacy.core.model.field.RpcCollectionFieldDefinition(
                "accountArray",
                "java.util.List",
                new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "accountArray",
                "com.cics_accounts_sdk.openlegacy.Ractcs9AccountArray",
                "ACCOUNTARRAY",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                68,
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
                put("actiDetails", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "actiDetails",
                "com.cics_accounts_sdk.openlegacy.Ractcs9ActiDetails",
                "ACTIDETAILS",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                68,
                false,
                new java.util.HashMap<String, String>() {{}},
                "ACTI-DETAILS",
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
                null,
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
                put("outPut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "outPut",
                "com.cics_accounts_sdk.openlegacy.Ractcs9OutPut",
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
                "RACTCS9",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        outputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "e6bb5b2d-6b85-47c0-9347-f20ac9731baa",
                "Ractcs9",
                "com.cics_accounts_sdk.openlegacy.Ractcs9",
                "Ractcs9",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("dfhcommarea", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "dfhcommarea",
                "com.cics_accounts_sdk.openlegacy.Ractcs9Dfhcommarea",
                "Dfhcommarea",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                60,
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
                "com.cics_accounts_sdk.openlegacy.Ractcs9InPut",
                "INPUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                0,
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
                put("accountArray", new org.openlegacy.core.model.field.RpcCollectionFieldDefinition(
                "accountArray",
                "java.util.List",
                new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "accountArray",
                "com.cics_accounts_sdk.openlegacy.Ractcs9AccountArray",
                "ACCOUNTARRAY",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                68,
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
                put("actiDetails", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "actiDetails",
                "com.cics_accounts_sdk.openlegacy.Ractcs9ActiDetails",
                "ACTIDETAILS",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                68,
                false,
                new java.util.HashMap<String, String>() {{}},
                "ACTI-DETAILS",
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
                null,
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
                put("outPut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "outPut",
                "com.cics_accounts_sdk.openlegacy.Ractcs9OutPut",
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
                "RACTCS9",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
    }

    private static Ractcs9ActiDetails fromRactcs9ActiDetailsJsonObject(JsonObject jsonObject,
            Ractcs9ActiDetails actiDetails) {
        actiDetails.setActiAccountId(jsonObject.getString("actiAccountId"));
        actiDetails.setActiCustomerId(jsonObject.getString("actiCustomerId"));
        actiDetails.setActiCustomerName(jsonObject.getString("actiCustomerName"));
        actiDetails.setActiTypcd(jsonObject.getString("actiTypcd"));
        actiDetails.setActiSubTypcd(jsonObject.getString("actiSubTypcd"));
        actiDetails.setActiCntryCd(jsonObject.getString("actiCntryCd"));
        actiDetails.setActiBnkId(jsonObject.getString("actiBnkId"));
        actiDetails.setActiBrnchId(jsonObject.getInteger("actiBrnchId"));
        actiDetails.setActiInitialDeposit(jsonObject.getDouble("actiInitialDeposit"));
        actiDetails.setActiCurrency(jsonObject.getString("actiCurrency"));
        return actiDetails;
    }

    private static Ractcs9AccountArray fromRactcs9AccountArrayJsonObject(JsonObject jsonObject,
            Ractcs9AccountArray accountArray) {
        JsonObject actiDetailsObject = jsonObject.getJsonObject("actiDetails");
        if (actiDetailsObject != null) {
            accountArray.setActiDetails(fromRactcs9ActiDetailsJsonObject(actiDetailsObject, new Ractcs9ActiDetails()));
        }
        return accountArray;
    }

    private static List<Ractcs9AccountArray> fromjutilListccopenlegacyRactcs9AccountArrayJsonArray(
            JsonArray array) {
        List<Ractcs9AccountArray> list = new ArrayList<>(array.size());
        for(int i = 0; i < array.size(); i++) {
            JsonObject objectElement = array.getJsonObject(i);
            if (objectElement != null) {
                list.add((Ractcs9AccountArray) fromRactcs9AccountArrayJsonObject(objectElement, new Ractcs9AccountArray()));
            }
        }
        return list;
    }

    private static Ractcs9InPut fromRactcs9InPutJsonObject(JsonObject jsonObject,
            Ractcs9InPut inPut) {
        JsonArray accountArrayArray = jsonObject.getJsonArray("accountArray");
        if (accountArrayArray != null) {
            inPut.setAccountArray(fromjutilListccopenlegacyRactcs9AccountArrayJsonArray(accountArrayArray));
        } else {
            inPut.setAccountArray(new ArrayList<>());
        }
        return inPut;
    }

    private static Ractcs9OutPut fromRactcs9OutPutJsonObject(JsonObject jsonObject,
            Ractcs9OutPut outPut) {
        outPut.setRtMsg(jsonObject.getString("rtMsg"));
        return outPut;
    }

    private static Ractcs9Dfhcommarea fromRactcs9DfhcommareaJsonObject(JsonObject jsonObject,
            Ractcs9Dfhcommarea dfhcommarea) {
        JsonObject inPutObject = jsonObject.getJsonObject("inPut");
        if (inPutObject != null) {
            dfhcommarea.setInPut(fromRactcs9InPutJsonObject(inPutObject, new Ractcs9InPut()));
        }
        JsonObject outPutObject = jsonObject.getJsonObject("outPut");
        if (outPutObject != null) {
            dfhcommarea.setOutPut(fromRactcs9OutPutJsonObject(outPutObject, new Ractcs9OutPut()));
        }
        return dfhcommarea;
    }

    public static void populateFromJson(@NotNull JsonObject jsonObject, @NotNull Ractcs9 entity) {
        Objects.requireNonNull(entity, "provided entity should not be null");
        if (jsonObject != null) {
            JsonObject dfhcommareaObject = jsonObject.getJsonObject("dfhcommarea");
            if (dfhcommareaObject != null) {
                entity.setDfhcommarea(fromRactcs9DfhcommareaJsonObject(dfhcommareaObject, new Ractcs9Dfhcommarea()));
            }
        }
    }

    private static JsonObject initRactcs9ActiDetails(Ractcs9ActiDetails object) {
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

    private static JsonObject initRactcs9AccountArray(Ractcs9AccountArray object) {
        JsonObject jsonObject = new JsonObject();
        Ractcs9ActiDetails actiDetails = object.getActiDetails();
        if (actiDetails != null) {
            jsonObject.put("actiDetails", initRactcs9ActiDetails(actiDetails));
        } else {
            jsonObject.put("actiDetails", (Object) null);
        }
        return jsonObject;
    }

    private static JsonArray initRactcs9AccountArrayArray(List<Ractcs9AccountArray> list) {
        JsonArray jsonArray = new JsonArray();
        if (list != null) {
            for (Ractcs9AccountArray element : list) {
                jsonArray.add(initRactcs9AccountArray(element));
            }
        }
        return jsonArray;
    }

    private static JsonObject initRactcs9InPut(Ractcs9InPut object) {
        JsonObject jsonObject = new JsonObject();
        List<Ractcs9AccountArray> accountArray = object.getAccountArray();
        if (accountArray != null) {
            jsonObject.put("accountArray", initRactcs9AccountArrayArray(accountArray));
        } else {
            jsonObject.put("accountArray", (Object) null);
        }
        return jsonObject;
    }

    private static JsonObject initRactcs9OutPut(Ractcs9OutPut object) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("rtMsg", object.getRtMsg());
        return jsonObject;
    }

    private static JsonObject initRactcs9Dfhcommarea(Ractcs9Dfhcommarea object) {
        JsonObject jsonObject = new JsonObject();
        Ractcs9InPut inPut = object.getInPut();
        if (inPut != null) {
            jsonObject.put("inPut", initRactcs9InPut(inPut));
        } else {
            jsonObject.put("inPut", (Object) null);
        }
        Ractcs9OutPut outPut = object.getOutPut();
        if (outPut != null) {
            jsonObject.put("outPut", initRactcs9OutPut(outPut));
        } else {
            jsonObject.put("outPut", (Object) null);
        }
        return jsonObject;
    }

    public static JsonObject toJson(Ractcs9 entity) {
        JsonObject jsonObject = new JsonObject();
        if (entity != null) {
            Ractcs9Dfhcommarea dfhcommarea = entity.getDfhcommarea();
            if (dfhcommarea != null) {
                jsonObject.put("dfhcommarea", initRactcs9Dfhcommarea(dfhcommarea));
            } else {
                jsonObject.put("dfhcommarea", (Object) null);
            }
        }
        return jsonObject;
    }
}
