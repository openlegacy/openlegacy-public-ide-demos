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
@Schema(name = "Response200InterestInstanceRecord")
public class Response200InterestInstanceRecord {

    @JsonProperty("interestRateType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The type of rate calculation that can be applied\n", name = "interestRateType")
    private String interestRateType;

    @JsonProperty("interestRateApplicationSchedule")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The processing schedule for applying interest rates to the account\n", name = "interestRateApplicationSchedule")
    private String interestRateApplicationSchedule;

    @Valid
    @JsonProperty("interestRateConfiguration")
    @Schema(name = "interestRateConfiguration")
    private Response200InterestInstanceRecordInterestRateConfiguration interestRateConfiguration;

    @Valid
    @JsonProperty("interestApplicationRecord")
    @Schema(name = "interestApplicationRecord")
    private Response200InterestInstanceRecordInterestApplicationRecord interestApplicationRecord;
}

