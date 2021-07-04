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
@Schema(name = "Response201CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits")
public class Response201CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits {

    @JsonProperty("positionLimitType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The type of position maintained for the account (e.g. transaction credit/debit, netting, position)\n", name = "positionLimitType")
    private String positionLimitType;

    @JsonProperty("positionLimitSettings")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The position definition, associated limit settings and rules\n", name = "positionLimitSettings")
    private String positionLimitSettings;

    @JsonProperty("positionLimitValue")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The current calculated position\n", name = "positionLimitValue")
    private String positionLimitValue;
}

