package com.policy_as400_cobol_sdk.openlegacy;

import io.vertx.core.json.JsonObject;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;

final class POL2ADDEntityHelper {
    public static final RpcEntityDefinition entityDefinition;

    public static final RpcEntityDefinition inputEntityDefinition;

    public static final RpcEntityDefinition outputEntityDefinition;

    static {
        entityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "5c18495d-b5de-4a17-b50a-e1cdb28dae3f",
                "POL2ADD",
                "com.policy_as400_cobol_sdk.openlegacy.POL2ADD",
                "Pol2add",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("pol2addInput", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "pol2addInput",
                "com.policy_as400_cobol_sdk.openlegacy.POL2ADDPol2addInput",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                165,
                false,
                new java.util.HashMap<String, String>() {{}},
                "pol2addInput",
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
                put("pol2addOutput", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "pol2addOutput",
                "com.policy_as400_cobol_sdk.openlegacy.POL2ADDPol2addOutput",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                247,
                false,
                new java.util.HashMap<String, String>() {{}},
                "pol2addOutput",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("policyRecOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "policyRecOut",
                "com.policy_as400_cobol_sdk.openlegacy.POL2ADDPolicyRecOut",
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
                "/QSYS.LIB/POLICY.LIB/POL2ADD.pgm",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        inputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "5c18495d-b5de-4a17-b50a-e1cdb28dae3f",
                "POL2ADD",
                "com.policy_as400_cobol_sdk.openlegacy.POL2ADD",
                "Pol2add",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("pol2addInput", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "pol2addInput",
                "com.policy_as400_cobol_sdk.openlegacy.POL2ADDPol2addInput",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                165,
                false,
                new java.util.HashMap<String, String>() {{}},
                "pol2addInput",
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
                "/QSYS.LIB/POLICY.LIB/POL2ADD.pgm",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        outputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "5c18495d-b5de-4a17-b50a-e1cdb28dae3f",
                "POL2ADD",
                "com.policy_as400_cobol_sdk.openlegacy.POL2ADD",
                "Pol2add",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("pol2addOutput", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "pol2addOutput",
                "com.policy_as400_cobol_sdk.openlegacy.POL2ADDPol2addOutput",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                247,
                false,
                new java.util.HashMap<String, String>() {{}},
                "pol2addOutput",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("policyRecOut", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "policyRecOut",
                "com.policy_as400_cobol_sdk.openlegacy.POL2ADDPolicyRecOut",
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
                "/QSYS.LIB/POLICY.LIB/POL2ADD.pgm",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
    }

    private static POL2ADDPol2addInput fromPOL2ADDPol2addInputJsonObject(JsonObject jsonObject,
            POL2ADDPol2addInput pol2addInput) {
        pol2addInput.setPolicyNumIn(jsonObject.getString("policyNumIn"));
        pol2addInput.setCustNameIn(jsonObject.getString("custNameIn"));
        pol2addInput.setCustAddrIn(jsonObject.getString("custAddrIn"));
        pol2addInput.setCustCityIn(jsonObject.getString("custCityIn"));
        pol2addInput.setCustStateIn(jsonObject.getString("custStateIn"));
        pol2addInput.setCustZipIn(jsonObject.getString("custZipIn"));
        pol2addInput.setCustPhoneIn(jsonObject.getString("custPhoneIn"));
        pol2addInput.setBirthDateIn(jsonObject.getString("birthDateIn"));
        pol2addInput.setCreateDateIn(jsonObject.getString("createDateIn"));
        pol2addInput.setEndDateIn(jsonObject.getString("endDateIn"));
        pol2addInput.setPolicyTypeIn(jsonObject.getString("policyTypeIn"));
        pol2addInput.setMonthlyPymtIn(jsonObject.getDouble("monthlyPymtIn"));
        pol2addInput.setQuarteryPymtIn(jsonObject.getDouble("quarteryPymtIn"));
        pol2addInput.setYearlyPymtIn(jsonObject.getDouble("yearlyPymtIn"));
        pol2addInput.setIsActiveIn(jsonObject.getString("isActiveIn"));
        return pol2addInput;
    }

    private static POL2ADDPolicyRecOut fromPOL2ADDPolicyRecOutJsonObject(JsonObject jsonObject,
            POL2ADDPolicyRecOut policyRecOut) {
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

    private static POL2ADDPol2addOutput fromPOL2ADDPol2addOutputJsonObject(JsonObject jsonObject,
            POL2ADDPol2addOutput pol2addOutput) {
        JsonObject policyRecOutObject = jsonObject.getJsonObject("policyRecOut");
        if (policyRecOutObject != null) {
            pol2addOutput.setPolicyRecOut(fromPOL2ADDPolicyRecOutJsonObject(policyRecOutObject, new POL2ADDPolicyRecOut()));
        }
        pol2addOutput.setSuccess(jsonObject.getString("success"));
        pol2addOutput.setResultSqlcodeSign(jsonObject.getString("resultSqlcodeSign"));
        pol2addOutput.setResultSqlcode(jsonObject.getString("resultSqlcode"));
        pol2addOutput.setResultSqlstate(jsonObject.getString("resultSqlstate"));
        pol2addOutput.setResultSqlerrmc(jsonObject.getString("resultSqlerrmc"));
        return pol2addOutput;
    }

    public static void populateFromJson(@NotNull JsonObject jsonObject, @NotNull POL2ADD entity) {
        Objects.requireNonNull(entity, "provided entity should not be null");
        if (jsonObject != null) {
            JsonObject pol2addInputObject = jsonObject.getJsonObject("pol2addInput");
            if (pol2addInputObject != null) {
                entity.setPol2addInput(fromPOL2ADDPol2addInputJsonObject(pol2addInputObject, new POL2ADDPol2addInput()));
            }
            JsonObject pol2addOutputObject = jsonObject.getJsonObject("pol2addOutput");
            if (pol2addOutputObject != null) {
                entity.setPol2addOutput(fromPOL2ADDPol2addOutputJsonObject(pol2addOutputObject, new POL2ADDPol2addOutput()));
            }
        }
    }

    private static JsonObject initPOL2ADDPol2addInput(POL2ADDPol2addInput object) {
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

    private static JsonObject initPOL2ADDPolicyRecOut(POL2ADDPolicyRecOut object) {
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

    private static JsonObject initPOL2ADDPol2addOutput(POL2ADDPol2addOutput object) {
        JsonObject jsonObject = new JsonObject();
        POL2ADDPolicyRecOut policyRecOut = object.getPolicyRecOut();
        if (policyRecOut != null) {
            jsonObject.put("policyRecOut", initPOL2ADDPolicyRecOut(policyRecOut));
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

    public static JsonObject toJson(POL2ADD entity) {
        JsonObject jsonObject = new JsonObject();
        if (entity != null) {
            POL2ADDPol2addInput pol2addInput = entity.getPol2addInput();
            if (pol2addInput != null) {
                jsonObject.put("pol2addInput", initPOL2ADDPol2addInput(pol2addInput));
            } else {
                jsonObject.put("pol2addInput", (Object) null);
            }
            POL2ADDPol2addOutput pol2addOutput = entity.getPol2addOutput();
            if (pol2addOutput != null) {
                jsonObject.put("pol2addOutput", initPOL2ADDPol2addOutput(pol2addOutput));
            } else {
                jsonObject.put("pol2addOutput", (Object) null);
            }
        }
        return jsonObject;
    }
}
