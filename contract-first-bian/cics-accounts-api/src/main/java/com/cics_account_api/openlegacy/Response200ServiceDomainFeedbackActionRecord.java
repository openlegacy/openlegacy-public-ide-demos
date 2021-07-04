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
@Schema(name = "Response200ServiceDomainFeedbackActionRecord")
public class Response200ServiceDomainFeedbackActionRecord {

    @JsonProperty("feedbackRecordDateTime")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime\n general-info: The date/time the feedback submitted for consideration\n", example = "09-22-2018", name = "feedbackRecordDateTime")
    private String feedbackRecordDateTime;

    @JsonProperty("feedbackRecordStatus")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The status of processing the feedback e.g. received, considered, responded to\n", name = "feedbackRecordStatus")
    private String feedbackRecordStatus;

    @JsonProperty("employeeBusinessUnitReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Reference to business unit/employee responsible for handling feedback\n", example = "769031", name = "employeeBusinessUnitReference")
    private String employeeBusinessUnitReference;
}

