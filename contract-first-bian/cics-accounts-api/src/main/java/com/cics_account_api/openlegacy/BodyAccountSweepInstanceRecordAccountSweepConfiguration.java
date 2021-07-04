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
@Schema(name = "BodyAccountSweepInstanceRecordAccountSweepConfiguration")
public class BodyAccountSweepInstanceRecordAccountSweepConfiguration {

    @JsonProperty("targetAccount")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The facility that the sweep is made to/from\n", name = "targetAccount")
    private String targetAccount;

    @JsonProperty("sweepMandate")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime\n general-info: Confirmation that the sweep processing is sanctioned as necessary\n", example = "09-22-2018", name = "sweepMandate")
    private String sweepMandate;

    @JsonProperty("sweepProcessingSchedule")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Timing and or triggers for initiating sweep transaction\n", name = "sweepProcessingSchedule")
    private String sweepProcessingSchedule;
}

