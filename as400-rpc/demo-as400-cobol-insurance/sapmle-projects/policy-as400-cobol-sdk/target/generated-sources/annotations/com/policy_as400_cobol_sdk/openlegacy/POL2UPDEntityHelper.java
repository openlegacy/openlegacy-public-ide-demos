package com.policy_as400_cobol_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;

final class POL2UPDEntityHelper {
    public static final RpcEntityDefinition entityDefinition;

    public static final RpcEntityDefinition inputEntityDefinition;

    public static final RpcEntityDefinition outputEntityDefinition;

    static {
        entityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "0ceb4055-bc11-4d12-86ba-e97ca553a878",
                "POL2UPD",
                "com.policy_as400_cobol_sdk.openlegacy.POL2UPD",
                "Pol2upd",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("pol2updInput", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "pol2updInput",
                "com.policy_as400_cobol_sdk.openlegacy.POL2UPDPol2updInput",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                165,
                false,
                new java.util.HashMap<String, String>() {{}},
                "pol2updInput",
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
                put("custNameIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custNameIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-NAME-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custAddrIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custAddrIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-ADDR-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custCityIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custCityIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-CITY-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custStateIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custStateIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                2,
                false,
                "CUST-STATE-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custZipIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custZipIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                5,
                false,
                "CUST-ZIP-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custPhoneIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custPhoneIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-PHONE-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("birthDateIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "birthDateIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "BIRTH-DATE-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("createDateIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "createDateIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "CREATE-DATE-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("endDateIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "endDateIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "END-DATE-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("policyTypeIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "policyTypeIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "POLICY-TYPE-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("monthlyPymtIn", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "monthlyPymtIn",
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
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                "MONTHLY-PYMT-IN",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("quarteryPymtIn", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "quarteryPymtIn",
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
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                "QUARTERY-PYMT-IN",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("yearlyPymtIn", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "yearlyPymtIn",
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
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                "YEARLY-PYMT-IN",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("isActiveIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "isActiveIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "IS-ACTIVE-IN",
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
                put("pol2updOutput", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "pol2updOutput",
                "com.policy_as400_cobol_sdk.openlegacy.POL2UPDPol2updOutput",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                247,
                false,
                new java.util.HashMap<String, String>() {{}},
                "pol2updOutput",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("policyRecOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "policyRecOut",
                "com.policy_as400_cobol_sdk.openlegacy.POL2UPDPolicyRecOut",
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
                "/QSYS.LIB/POLICY.LIB/POL2UPD.pgm",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        inputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "0ceb4055-bc11-4d12-86ba-e97ca553a878",
                "POL2UPD",
                "com.policy_as400_cobol_sdk.openlegacy.POL2UPD",
                "Pol2upd",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("pol2updInput", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "pol2updInput",
                "com.policy_as400_cobol_sdk.openlegacy.POL2UPDPol2updInput",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                165,
                false,
                new java.util.HashMap<String, String>() {{}},
                "pol2updInput",
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
                put("custNameIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custNameIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-NAME-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custAddrIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custAddrIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-ADDR-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custCityIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custCityIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-CITY-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custStateIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custStateIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                2,
                false,
                "CUST-STATE-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custZipIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custZipIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                5,
                false,
                "CUST-ZIP-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("custPhoneIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "custPhoneIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "CUST-PHONE-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("birthDateIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "birthDateIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "BIRTH-DATE-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("createDateIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "createDateIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "CREATE-DATE-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("endDateIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "endDateIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                8,
                false,
                "END-DATE-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("policyTypeIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "policyTypeIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                16,
                false,
                "POLICY-TYPE-IN",
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                null,
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Char",
                new java.util.HashMap<String, String>() {{}},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("monthlyPymtIn", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "monthlyPymtIn",
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
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                "MONTHLY-PYMT-IN",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("quarteryPymtIn", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "quarteryPymtIn",
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
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                "QUARTERY-PYMT-IN",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("yearlyPymtIn", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "yearlyPymtIn",
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
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                "YEARLY-PYMT-IN",
                "org.openlegacy.core.model.legacy.type.Jt400LegacyTypes.Zoned",
                new java.util.HashMap<String, String>() {{}},
                null,
                3,
                0
                ));
                put("isActiveIn", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "isActiveIn",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                1,
                false,
                "IS-ACTIVE-IN",
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
                "/QSYS.LIB/POLICY.LIB/POL2UPD.pgm",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        outputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "0ceb4055-bc11-4d12-86ba-e97ca553a878",
                "POL2UPD",
                "com.policy_as400_cobol_sdk.openlegacy.POL2UPD",
                "Pol2upd",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("pol2updOutput", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "pol2updOutput",
                "com.policy_as400_cobol_sdk.openlegacy.POL2UPDPol2updOutput",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                247,
                false,
                new java.util.HashMap<String, String>() {{}},
                "pol2updOutput",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("policyRecOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "policyRecOut",
                "com.policy_as400_cobol_sdk.openlegacy.POL2UPDPolicyRecOut",
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
                "/QSYS.LIB/POLICY.LIB/POL2UPD.pgm",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
    }

    private static POL2UPDPol2updInput fromPOL2UPDPol2updInputJsonObject(JsonObject jsonObject,
            POL2UPDPol2updInput pol2updInput) {
        pol2updInput.setPolicyNumIn(jsonObject.getString("policyNumIn"));
        pol2updInput.setCustNameIn(jsonObject.getString("custNameIn"));
        pol2updInput.setCustAddrIn(jsonObject.getString("custAddrIn"));
        pol2updInput.setCustCityIn(jsonObject.getString("custCityIn"));
        pol2updInput.setCustStateIn(jsonObject.getString("custStateIn"));
        pol2updInput.setCustZipIn(jsonObject.getString("custZipIn"));
        pol2updInput.setCustPhoneIn(jsonObject.getString("custPhoneIn"));
        pol2updInput.setBirthDateIn(jsonObject.getString("birthDateIn"));
        pol2updInput.setCreateDateIn(jsonObject.getString("createDateIn"));
        pol2updInput.setEndDateIn(jsonObject.getString("endDateIn"));
        pol2updInput.setPolicyTypeIn(jsonObject.getString("policyTypeIn"));
        pol2updInput.setMonthlyPymtIn(jsonObject.getDouble("monthlyPymtIn"));
        pol2updInput.setQuarteryPymtIn(jsonObject.getDouble("quarteryPymtIn"));
        pol2updInput.setYearlyPymtIn(jsonObject.getDouble("yearlyPymtIn"));
        pol2updInput.setIsActiveIn(jsonObject.getString("isActiveIn"));
        return pol2updInput;
    }

    private static POL2UPDPolicyRecOut fromPOL2UPDPolicyRecOutJsonObject(JsonObject jsonObject,
            POL2UPDPolicyRecOut policyRecOut) {
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

    private static POL2UPDPol2updOutput fromPOL2UPDPol2updOutputJsonObject(JsonObject jsonObject,
            POL2UPDPol2updOutput pol2updOutput) {
        JsonObject policyRecOutObject = jsonObject.getJsonObject("policyRecOut");
        if (policyRecOutObject != null) {
            pol2updOutput.setPolicyRecOut(fromPOL2UPDPolicyRecOutJsonObject(policyRecOutObject, new POL2UPDPolicyRecOut()));
        }
        pol2updOutput.setSuccess(jsonObject.getString("success"));
        pol2updOutput.setResultSqlcodeSign(jsonObject.getString("resultSqlcodeSign"));
        pol2updOutput.setResultSqlcode(jsonObject.getString("resultSqlcode"));
        pol2updOutput.setResultSqlstate(jsonObject.getString("resultSqlstate"));
        pol2updOutput.setResultSqlerrmc(jsonObject.getString("resultSqlerrmc"));
        return pol2updOutput;
    }

    public static void populateFromJson(@NotNull JsonObject jsonObject, @NotNull POL2UPD entity) {
        Objects.requireNonNull(entity, "provided entity should not be null");
        if (jsonObject != null) {
            JsonObject pol2updInputObject = jsonObject.getJsonObject("pol2updInput");
            if (pol2updInputObject != null) {
                entity.setPol2updInput(fromPOL2UPDPol2updInputJsonObject(pol2updInputObject, new POL2UPDPol2updInput()));
            }
            JsonObject pol2updOutputObject = jsonObject.getJsonObject("pol2updOutput");
            if (pol2updOutputObject != null) {
                entity.setPol2updOutput(fromPOL2UPDPol2updOutputJsonObject(pol2updOutputObject, new POL2UPDPol2updOutput()));
            }
        }
    }

    private static JsonObject initPOL2UPDPol2updInput(POL2UPDPol2updInput object) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("policyNumIn", object.getPolicyNumIn());
        jsonObject.put("custNameIn", object.getCustNameIn());
        jsonObject.put("custAddrIn", object.getCustAddrIn());
        jsonObject.put("custCityIn", object.getCustCityIn());
        jsonObject.put("custStateIn", object.getCustStateIn());
        jsonObject.put("custZipIn", object.getCustZipIn());
        jsonObject.put("custPhoneIn", object.getCustPhoneIn());
        jsonObject.put("birthDateIn", object.getBirthDateIn());
        jsonObject.put("createDateIn", object.getCreateDateIn());
        jsonObject.put("endDateIn", object.getEndDateIn());
        jsonObject.put("policyTypeIn", object.getPolicyTypeIn());
        jsonObject.put("monthlyPymtIn", object.getMonthlyPymtIn());
        jsonObject.put("quarteryPymtIn", object.getQuarteryPymtIn());
        jsonObject.put("yearlyPymtIn", object.getYearlyPymtIn());
        jsonObject.put("isActiveIn", object.getIsActiveIn());
        return jsonObject;
    }

    private static JsonObject initPOL2UPDPolicyRecOut(POL2UPDPolicyRecOut object) {
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

    private static JsonObject initPOL2UPDPol2updOutput(POL2UPDPol2updOutput object) {
        JsonObject jsonObject = new JsonObject();
        POL2UPDPolicyRecOut policyRecOut = object.getPolicyRecOut();
        if (policyRecOut != null) {
            jsonObject.put("policyRecOut", initPOL2UPDPolicyRecOut(policyRecOut));
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

    public static JsonObject toJson(POL2UPD entity) {
        JsonObject jsonObject = new JsonObject();
        if (entity != null) {
            POL2UPDPol2updInput pol2updInput = entity.getPol2updInput();
            if (pol2updInput != null) {
                jsonObject.put("pol2updInput", initPOL2UPDPol2updInput(pol2updInput));
            } else {
                jsonObject.put("pol2updInput", (Object) null);
            }
            POL2UPDPol2updOutput pol2updOutput = entity.getPol2updOutput();
            if (pol2updOutput != null) {
                jsonObject.put("pol2updOutput", initPOL2UPDPol2updOutput(pol2updOutput));
            } else {
                jsonObject.put("pol2updOutput", (Object) null);
            }
        }
        return jsonObject;
    }
}
