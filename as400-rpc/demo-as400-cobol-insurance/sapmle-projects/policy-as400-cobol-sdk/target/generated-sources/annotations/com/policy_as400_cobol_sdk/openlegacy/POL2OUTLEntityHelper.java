package com.policy_as400_cobol_sdk.openlegacy;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;

final class POL2OUTLEntityHelper {
    public static final RpcEntityDefinition entityDefinition;

    public static final RpcEntityDefinition inputEntityDefinition;

    public static final RpcEntityDefinition outputEntityDefinition;

    static {
        entityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "dc51ba10-6d3a-4f2b-be34-e263663b6069",
                "POL2OUTL",
                "com.policy_as400_cobol_sdk.openlegacy.POL2OUTL",
                "Pol2outl",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("policyOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "policyOut",
                "com.policy_as400_cobol_sdk.openlegacy.PgmPolicyOut",
                "POLICYOUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                86,
                false,
                new java.util.HashMap<String, String>() {{}},
                "POLICY-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("policyRecOut", new org.openlegacy.core.model.field.RpcCollectionFieldDefinition(
                "policyRecOut",
                "java.util.List",
                new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "policyRecOut",
                "com.policy_as400_cobol_sdk.openlegacy.PgmPolicyRecOut",
                "POLICYRECOUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                165,
                false,
                new java.util.HashMap<String, String>() {{}},
                "POLICY-REC-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("policyNumOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "policyNumOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                11,
                false,
                "POLICY-NUM-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custNameOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custNameOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-NAME-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custAddrOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custAddrOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-ADDR-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custCityOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custCityOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-CITY-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custStateOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custStateOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                2,
                false,
                "CUST-STATE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custZipOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custZipOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                5,
                false,
                "CUST-ZIP-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custPhoneOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custPhoneOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-PHONE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("birthDateOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "birthDateOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "BIRTH-DATE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("createDateOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "createDateOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "CREATE-DATE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("endDateOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "endDateOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "END-DATE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("policyTypeOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "policyTypeOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "POLICY-TYPE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("monthlyPymtOut", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "monthlyPymtOut",
                "java.lang.Double",
                0.0,
                9.9999999999999E10,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                14,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "MONTHLY-PYMT-OUT",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("quarteryPymtOut", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "quarteryPymtOut",
                "java.lang.Double",
                0.0,
                9.9999999999999E10,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                14,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "QUARTERY-PYMT-OUT",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("yearlyPymtOut", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "yearlyPymtOut",
                "java.lang.Double",
                0.0,
                9.9999999999999E10,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                14,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "YEARLY-PYMT-OUT",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("isActiveOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "isActiveOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "IS-ACTIVE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ),
                "POLICY-REC-OUT",
                "POLICYRECOUT",
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
                put("success", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "success",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "SUCCESS",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("operation", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "operation",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                2,
                false,
                "OPERATION",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("recCount", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "recCount",
                "java.lang.Integer",
                0.0,
                99.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                2,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "REC-COUNT",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("resultSqlcodeSign", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "resultSqlcodeSign",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "RESULT-SQLCODE-SIGN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("resultSqlcode", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "resultSqlcode",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                5,
                false,
                "RESULT-SQLCODE",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("resultSqlstate", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "resultSqlstate",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                5,
                false,
                "RESULT-SQLSTATE",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("resultSqlerrmc", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "resultSqlerrmc",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                70,
                false,
                "RESULT-SQLERRMC",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
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
                "/QSYS.LIB/POLICY.LIB/POL2LST.pgm",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        inputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "dc51ba10-6d3a-4f2b-be34-e263663b6069",
                "POL2OUTL",
                "com.policy_as400_cobol_sdk.openlegacy.POL2OUTL",
                "Pol2outl",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("policyOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "policyOut",
                "com.policy_as400_cobol_sdk.openlegacy.PgmPolicyOut",
                "POLICYOUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                86,
                false,
                new java.util.HashMap<String, String>() {{}},
                "POLICY-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("policyRecOut", new org.openlegacy.core.model.field.RpcCollectionFieldDefinition(
                "policyRecOut",
                "java.util.List",
                new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "policyRecOut",
                "com.policy_as400_cobol_sdk.openlegacy.PgmPolicyRecOut",
                "POLICYRECOUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                165,
                false,
                new java.util.HashMap<String, String>() {{}},
                "POLICY-REC-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("policyNumOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "policyNumOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                11,
                false,
                "POLICY-NUM-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custNameOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custNameOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-NAME-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custAddrOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custAddrOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-ADDR-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custCityOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custCityOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-CITY-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custStateOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custStateOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                2,
                false,
                "CUST-STATE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custZipOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custZipOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                5,
                false,
                "CUST-ZIP-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custPhoneOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custPhoneOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-PHONE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("birthDateOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "birthDateOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "BIRTH-DATE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("createDateOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "createDateOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "CREATE-DATE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("endDateOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "endDateOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "END-DATE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("policyTypeOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "policyTypeOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "POLICY-TYPE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("monthlyPymtOut", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "monthlyPymtOut",
                "java.lang.Double",
                0.0,
                9.9999999999999E10,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                14,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "MONTHLY-PYMT-OUT",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("quarteryPymtOut", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "quarteryPymtOut",
                "java.lang.Double",
                0.0,
                9.9999999999999E10,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                14,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "QUARTERY-PYMT-OUT",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("yearlyPymtOut", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "yearlyPymtOut",
                "java.lang.Double",
                0.0,
                9.9999999999999E10,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                14,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "YEARLY-PYMT-OUT",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("isActiveOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "isActiveOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "IS-ACTIVE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ),
                "POLICY-REC-OUT",
                "POLICYRECOUT",
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
                put("success", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "success",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "SUCCESS",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("operation", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "operation",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                2,
                false,
                "OPERATION",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("recCount", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "recCount",
                "java.lang.Integer",
                0.0,
                99.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                2,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "REC-COUNT",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("resultSqlcodeSign", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "resultSqlcodeSign",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "RESULT-SQLCODE-SIGN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("resultSqlcode", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "resultSqlcode",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                5,
                false,
                "RESULT-SQLCODE",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("resultSqlstate", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "resultSqlstate",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                5,
                false,
                "RESULT-SQLSTATE",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("resultSqlerrmc", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "resultSqlerrmc",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                70,
                false,
                "RESULT-SQLERRMC",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
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
                "/QSYS.LIB/POLICY.LIB/POL2LST.pgm",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        outputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "dc51ba10-6d3a-4f2b-be34-e263663b6069",
                "POL2OUTL",
                "com.policy_as400_cobol_sdk.openlegacy.POL2OUTL",
                "Pol2outl",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("policyOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "policyOut",
                "com.policy_as400_cobol_sdk.openlegacy.PgmPolicyOut",
                "POLICYOUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                86,
                false,
                new java.util.HashMap<String, String>() {{}},
                "POLICY-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("policyRecOut", new org.openlegacy.core.model.field.RpcCollectionFieldDefinition(
                "policyRecOut",
                "java.util.List",
                new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "policyRecOut",
                "com.policy_as400_cobol_sdk.openlegacy.PgmPolicyRecOut",
                "POLICYRECOUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                165,
                false,
                new java.util.HashMap<String, String>() {{}},
                "POLICY-REC-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("policyNumOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "policyNumOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                11,
                false,
                "POLICY-NUM-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custNameOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custNameOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-NAME-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custAddrOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custAddrOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-ADDR-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custCityOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custCityOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-CITY-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custStateOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custStateOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                2,
                false,
                "CUST-STATE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custZipOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custZipOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                5,
                false,
                "CUST-ZIP-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custPhoneOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custPhoneOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-PHONE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("birthDateOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "birthDateOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "BIRTH-DATE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("createDateOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "createDateOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "CREATE-DATE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("endDateOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "endDateOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "END-DATE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("policyTypeOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "policyTypeOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "POLICY-TYPE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("monthlyPymtOut", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "monthlyPymtOut",
                "java.lang.Double",
                0.0,
                9.9999999999999E10,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                14,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "MONTHLY-PYMT-OUT",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("quarteryPymtOut", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "quarteryPymtOut",
                "java.lang.Double",
                0.0,
                9.9999999999999E10,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                14,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "QUARTERY-PYMT-OUT",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("yearlyPymtOut", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "yearlyPymtOut",
                "java.lang.Double",
                0.0,
                9.9999999999999E10,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                14,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "YEARLY-PYMT-OUT",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("isActiveOut", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "isActiveOut",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "IS-ACTIVE-OUT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ),
                "POLICY-REC-OUT",
                "POLICYRECOUT",
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
                put("success", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "success",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "SUCCESS",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("operation", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "operation",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                2,
                false,
                "OPERATION",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("recCount", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "recCount",
                "java.lang.Integer",
                0.0,
                99.0,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                2,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                "REC-COUNT",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                0,
                0
                ));
                put("resultSqlcodeSign", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "resultSqlcodeSign",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "RESULT-SQLCODE-SIGN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("resultSqlcode", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "resultSqlcode",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                5,
                false,
                "RESULT-SQLCODE",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("resultSqlstate", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "resultSqlstate",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                5,
                false,
                "RESULT-SQLSTATE",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("resultSqlerrmc", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "resultSqlerrmc",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                70,
                false,
                "RESULT-SQLERRMC",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
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
                "/QSYS.LIB/POLICY.LIB/POL2LST.pgm",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
    }

    private static PgmPolicyRecOut fromPgmPolicyRecOutJsonObject(JsonObject jsonObject,
            PgmPolicyRecOut policyRecOut) {
        policyRecOut.setPolicyNumOut(jsonObject.getString("policyNumOut"));
        policyRecOut.setCustNameOut(jsonObject.getString("custNameOut"));
        policyRecOut.setCustAddrOut(jsonObject.getString("custAddrOut"));
        policyRecOut.setCustCityOut(jsonObject.getString("custCityOut"));
        policyRecOut.setCustStateOut(jsonObject.getString("custStateOut"));
        policyRecOut.setCustZipOut(jsonObject.getString("custZipOut"));
        policyRecOut.setCustPhoneOut(jsonObject.getString("custPhoneOut"));
        policyRecOut.setBirthDateOut(jsonObject.getString("birthDateOut"));
        policyRecOut.setCreateDateOut(jsonObject.getString("createDateOut"));
        policyRecOut.setEndDateOut(jsonObject.getString("endDateOut"));
        policyRecOut.setPolicyTypeOut(jsonObject.getString("policyTypeOut"));
        policyRecOut.setMonthlyPymtOut(jsonObject.getDouble("monthlyPymtOut"));
        policyRecOut.setQuarteryPymtOut(jsonObject.getDouble("quarteryPymtOut"));
        policyRecOut.setYearlyPymtOut(jsonObject.getDouble("yearlyPymtOut"));
        policyRecOut.setIsActiveOut(jsonObject.getString("isActiveOut"));
        return policyRecOut;
    }

    private static List<PgmPolicyRecOut> fromjutilListcpopenlegacyPgmPolicyRecOutJsonArray(
            JsonArray array) {
        List<PgmPolicyRecOut> list = new ArrayList<>(array.size());
        for(int i = 0; i < array.size(); i++) {
            JsonObject objectElement = array.getJsonObject(i);
            if (objectElement != null) {
                list.add((PgmPolicyRecOut) fromPgmPolicyRecOutJsonObject(objectElement, new PgmPolicyRecOut()));
            }
        }
        return list;
    }

    private static PgmPolicyOut fromPgmPolicyOutJsonObject(JsonObject jsonObject,
            PgmPolicyOut policyOut) {
        JsonArray policyRecOutArray = jsonObject.getJsonArray("policyRecOut");
        if (policyRecOutArray != null) {
            policyOut.setPolicyRecOut(fromjutilListcpopenlegacyPgmPolicyRecOutJsonArray(policyRecOutArray));
        } else {
            policyOut.setPolicyRecOut(new ArrayList<>());
        }
        policyOut.setSuccess(jsonObject.getString("success"));
        policyOut.setOperation(jsonObject.getString("operation"));
        policyOut.setRecCount(jsonObject.getInteger("recCount"));
        policyOut.setResultSqlcodeSign(jsonObject.getString("resultSqlcodeSign"));
        policyOut.setResultSqlcode(jsonObject.getString("resultSqlcode"));
        policyOut.setResultSqlstate(jsonObject.getString("resultSqlstate"));
        policyOut.setResultSqlerrmc(jsonObject.getString("resultSqlerrmc"));
        return policyOut;
    }

    public static void populateFromJson(@NotNull JsonObject jsonObject, @NotNull POL2OUTL entity) {
        Objects.requireNonNull(entity, "provided entity should not be null");
        if (jsonObject != null) {
            JsonObject policyOutObject = jsonObject.getJsonObject("policyOut");
            if (policyOutObject != null) {
                entity.setPolicyOut(fromPgmPolicyOutJsonObject(policyOutObject, new PgmPolicyOut()));
            }
        }
    }

    private static JsonObject initPgmPolicyRecOut(PgmPolicyRecOut object) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("policyNumOut", object.getPolicyNumOut());
        jsonObject.put("custNameOut", object.getCustNameOut());
        jsonObject.put("custAddrOut", object.getCustAddrOut());
        jsonObject.put("custCityOut", object.getCustCityOut());
        jsonObject.put("custStateOut", object.getCustStateOut());
        jsonObject.put("custZipOut", object.getCustZipOut());
        jsonObject.put("custPhoneOut", object.getCustPhoneOut());
        jsonObject.put("birthDateOut", object.getBirthDateOut());
        jsonObject.put("createDateOut", object.getCreateDateOut());
        jsonObject.put("endDateOut", object.getEndDateOut());
        jsonObject.put("policyTypeOut", object.getPolicyTypeOut());
        jsonObject.put("monthlyPymtOut", object.getMonthlyPymtOut());
        jsonObject.put("quarteryPymtOut", object.getQuarteryPymtOut());
        jsonObject.put("yearlyPymtOut", object.getYearlyPymtOut());
        jsonObject.put("isActiveOut", object.getIsActiveOut());
        return jsonObject;
    }

    private static JsonArray initPgmPolicyRecOutArray(List<PgmPolicyRecOut> list) {
        JsonArray jsonArray = new JsonArray();
        if (list != null) {
            for (PgmPolicyRecOut element : list) {
                jsonArray.add(initPgmPolicyRecOut(element));
            }
        }
        return jsonArray;
    }

    private static JsonObject initPgmPolicyOut(PgmPolicyOut object) {
        JsonObject jsonObject = new JsonObject();
        List<PgmPolicyRecOut> policyRecOut = object.getPolicyRecOut();
        if (policyRecOut != null) {
            jsonObject.put("policyRecOut", initPgmPolicyRecOutArray(policyRecOut));
        } else {
            jsonObject.put("policyRecOut", (Object) null);
        }
        jsonObject.put("success", object.getSuccess());
        jsonObject.put("operation", object.getOperation());
        jsonObject.put("recCount", object.getRecCount());
        jsonObject.put("resultSqlcodeSign", object.getResultSqlcodeSign());
        jsonObject.put("resultSqlcode", object.getResultSqlcode());
        jsonObject.put("resultSqlstate", object.getResultSqlstate());
        jsonObject.put("resultSqlerrmc", object.getResultSqlerrmc());
        return jsonObject;
    }

    public static JsonObject toJson(POL2OUTL entity) {
        JsonObject jsonObject = new JsonObject();
        if (entity != null) {
            PgmPolicyOut policyOut = entity.getPolicyOut();
            if (policyOut != null) {
                jsonObject.put("policyOut", initPgmPolicyOut(policyOut));
            } else {
                jsonObject.put("policyOut", (Object) null);
            }
        }
        return jsonObject;
    }
}
