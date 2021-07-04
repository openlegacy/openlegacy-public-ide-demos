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
@Schema(name = "BodyAccountSweepInstanceRecord")
public class BodyAccountSweepInstanceRecord {

    @JsonProperty("accountSweepType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The type of sweep (e.g. periodic, threshold)\n", name = "accountSweepType")
    private String accountSweepType;

    @JsonProperty("accountSweepDefinition")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Definition of the type of sweep\n", name = "accountSweepDefinition")
    private String accountSweepDefinition;

    @JsonProperty("accountSweepApplicationSchedule")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Sweep processing guidelines and scheduling rules\n", name = "accountSweepApplicationSchedule")
    private String accountSweepApplicationSchedule;

    @Valid
    @JsonProperty("accountSweepConfiguration")
    @Schema(name = "accountSweepConfiguration")
    private BodyAccountSweepInstanceRecordAccountSweepConfiguration accountSweepConfiguration;

    @Valid
    @JsonProperty("sweepApplicationRecord")
    @Schema(name = "sweepApplicationRecord")
    private BodyAccountSweepInstanceRecordSweepApplicationRecord sweepApplicationRecord;
}

