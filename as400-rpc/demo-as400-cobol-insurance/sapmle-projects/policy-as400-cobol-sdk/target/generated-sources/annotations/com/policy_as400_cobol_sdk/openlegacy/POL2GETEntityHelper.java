package com.policy_as400_cobol_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;

final class POL2GETEntityHelper {
    public static final RpcEntityDefinition entityDefinition;

    public static final RpcEntityDefinition inputEntityDefinition;

    public static final RpcEntityDefinition outputEntityDefinition;

    static {
        entityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "fa87e65d-a0b7-40fd-8fee-bee33aa6ec95",
                "POL2GET",
                "com.policy_as400_cobol_sdk.openlegacy.POL2GET",
                "Pol2get",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("pol2getInput", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "pol2getInput",
                "com.policy_as400_cobol_sdk.openlegacy.POL2GETPol2getInput",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                11,
                false,
                new java.util.HashMap<String, String>() {{}},
                "pol2getInput",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("policyNumIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "policyNumIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                11,
                false,
                "POLICY-NUM-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
                ));
                put("pol2getOutput", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "pol2getOutput",
                "com.policy_as400_cobol_sdk.openlegacy.POL2GETPol2getOutput",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                247,
                false,
                new java.util.HashMap<String, String>() {{}},
                "pol2getOutput",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("policyRecOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "policyRecOut",
                "com.policy_as400_cobol_sdk.openlegacy.POL2GETPolicyRecOut",
                "POLICYRECOUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                165,
                false,
                new java.util.HashMap<String, String>() {{}},
                "POLICY-REC-OUT",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                "/QSYS.LIB/POLICY.LIB/POL2GET.pgm",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        inputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "fa87e65d-a0b7-40fd-8fee-bee33aa6ec95",
                "POL2GET",
                "com.policy_as400_cobol_sdk.openlegacy.POL2GET",
                "Pol2get",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("pol2getInput", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "pol2getInput",
                "com.policy_as400_cobol_sdk.openlegacy.POL2GETPol2getInput",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                11,
                false,
                new java.util.HashMap<String, String>() {{}},
                "pol2getInput",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("policyNumIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "policyNumIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                11,
                false,
                "POLICY-NUM-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
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
                "/QSYS.LIB/POLICY.LIB/POL2GET.pgm",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        outputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "fa87e65d-a0b7-40fd-8fee-bee33aa6ec95",
                "POL2GET",
                "com.policy_as400_cobol_sdk.openlegacy.POL2GET",
                "Pol2get",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("pol2getOutput", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "pol2getOutput",
                "com.policy_as400_cobol_sdk.openlegacy.POL2GETPol2getOutput",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                247,
                false,
                new java.util.HashMap<String, String>() {{}},
                "pol2getOutput",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("policyRecOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "policyRecOut",
                "com.policy_as400_cobol_sdk.openlegacy.POL2GETPolicyRecOut",
                "POLICYRECOUT",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                165,
                false,
                new java.util.HashMap<String, String>() {{}},
                "POLICY-REC-OUT",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                }}
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
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
                "/QSYS.LIB/POLICY.LIB/POL2GET.pgm",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
    }

    private static POL2GETPol2getInput fromPOL2GETPol2getInputJsonObject(JsonObject jsonObject,
            POL2GETPol2getInput pol2getInput) {
        pol2getInput.setPolicyNumIn(jsonObject.getString("policyNumIn"));
        return pol2getInput;
    }

    private static POL2GETPolicyRecOut fromPOL2GETPolicyRecOutJsonObject(JsonObject jsonObject,
            POL2GETPolicyRecOut policyRecOut) {
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

    private static POL2GETPol2getOutput fromPOL2GETPol2getOutputJsonObject(JsonObject jsonObject,
            POL2GETPol2getOutput pol2getOutput) {
        JsonObject policyRecOutObject = jsonObject.getJsonObject("policyRecOut");
        if (policyRecOutObject != null) {
            pol2getOutput.setPolicyRecOut(fromPOL2GETPolicyRecOutJsonObject(policyRecOutObject, new POL2GETPolicyRecOut()));
        }
        pol2getOutput.setSuccess(jsonObject.getString("success"));
        pol2getOutput.setResultSqlcodeSign(jsonObject.getString("resultSqlcodeSign"));
        pol2getOutput.setResultSqlcode(jsonObject.getString("resultSqlcode"));
        pol2getOutput.setResultSqlstate(jsonObject.getString("resultSqlstate"));
        pol2getOutput.setResultSqlerrmc(jsonObject.getString("resultSqlerrmc"));
        return pol2getOutput;
    }

    public static void populateFromJson(@NotNull JsonObject jsonObject, @NotNull POL2GET entity) {
        Objects.requireNonNull(entity, "provided entity should not be null");
        if (jsonObject != null) {
            JsonObject pol2getInputObject = jsonObject.getJsonObject("pol2getInput");
            if (pol2getInputObject != null) {
                entity.setPol2getInput(fromPOL2GETPol2getInputJsonObject(pol2getInputObject, new POL2GETPol2getInput()));
            }
            JsonObject pol2getOutputObject = jsonObject.getJsonObject("pol2getOutput");
            if (pol2getOutputObject != null) {
                entity.setPol2getOutput(fromPOL2GETPol2getOutputJsonObject(pol2getOutputObject, new POL2GETPol2getOutput()));
            }
        }
    }

    private static JsonObject initPOL2GETPol2getInput(POL2GETPol2getInput object) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("policyNumIn", object.getPolicyNumIn());
        return jsonObject;
    }

    private static JsonObject initPOL2GETPolicyRecOut(POL2GETPolicyRecOut object) {
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

    private static JsonObject initPOL2GETPol2getOutput(POL2GETPol2getOutput object) {
        JsonObject jsonObject = new JsonObject();
        POL2GETPolicyRecOut policyRecOut = object.getPolicyRecOut();
        if (policyRecOut != null) {
            jsonObject.put("policyRecOut", initPOL2GETPolicyRecOut(policyRecOut));
        } else {
            jsonObject.put("policyRecOut", (Object) null);
        }
        jsonObject.put("success", object.getSuccess());
        jsonObject.put("resultSqlcodeSign", object.getResultSqlcodeSign());
        jsonObject.put("resultSqlcode", object.getResultSqlcode());
        jsonObject.put("resultSqlstate", object.getResultSqlstate());
        jsonObject.put("resultSqlerrmc", object.getResultSqlerrmc());
        return jsonObject;
    }

    public static JsonObject toJson(POL2GET entity) {
        JsonObject jsonObject = new JsonObject();
        if (entity != null) {
            POL2GETPol2getInput pol2getInput = entity.getPol2getInput();
            if (pol2getInput != null) {
                jsonObject.put("pol2getInput", initPOL2GETPol2getInput(pol2getInput));
            } else {
                jsonObject.put("pol2getInput", (Object) null);
            }
            POL2GETPol2getOutput pol2getOutput = entity.getPol2getOutput();
            if (pol2getOutput != null) {
                jsonObject.put("pol2getOutput", initPOL2GETPol2getOutput(pol2getOutput));
            } else {
                jsonObject.put("pol2getOutput", (Object) null);
            }
        }
        return jsonObject;
    }
}
