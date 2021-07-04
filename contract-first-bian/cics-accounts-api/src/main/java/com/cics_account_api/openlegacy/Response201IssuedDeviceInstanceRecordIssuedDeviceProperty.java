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
@Schema(name = "Response201IssuedDeviceInstanceRecordIssuedDeviceProperty")
public class Response201IssuedDeviceInstanceRecordIssuedDeviceProperty {

    @Valid
    @JsonProperty("issuedDevicePropertyType")
    @Schema(name = "issuedDevicePropertyType")
    private Response201IssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType issuedDevicePropertyType;

    @JsonProperty("issuedDeviceStatus")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The tracked status of the device/inventory item (e.g. active, suspended, cancelled)\n", name = "issuedDeviceStatus")
    private String issuedDeviceStatus;
}

