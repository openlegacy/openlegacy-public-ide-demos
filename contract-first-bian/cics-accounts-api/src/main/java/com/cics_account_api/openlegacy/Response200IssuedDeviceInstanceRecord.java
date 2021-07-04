package com.cics_account_api.openlegacy;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import org.openlegacy.core.annotations.BusinessEntity;
import lombok.Getter;
import lombok.Setter;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonProperty;

@BusinessEntity
@Getter
@Setter
@Schema(name = "Response200IssuedDeviceInstanceRecord")
public class Response200IssuedDeviceInstanceRecord {

    @JsonProperty("issuedDeviceType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The type of issued device/inventory (e.g. checkbook, pay-in slip)\n", name = "issuedDeviceType")
    private String issuedDeviceType;

    @JsonProperty("issuedDeviceDescription")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Definition of the inventory item, including processing and handling guidelines and rules\n", name = "issuedDeviceDescription")
    private String issuedDeviceDescription;

    @JsonProperty("issuedDeviceOptionDefinition")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Definition of the processing option and impact (e.g. lost check handling)\n", name = "issuedDeviceOptionDefinition")
    private String issuedDeviceOptionDefinition;

    @JsonProperty("issuedDeviceOptionSetting")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The processing option setting \n", name = "issuedDeviceOptionSetting")
    private String issuedDeviceOptionSetting;

    @Valid
    @JsonProperty("issuedDeviceProperty")
    @Schema(name = "issuedDeviceProperty")
    private Response200IssuedDeviceInstanceRecordIssuedDeviceProperty issuedDeviceProperty;
}

