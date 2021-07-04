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
@Schema(name = "BodyServiceDomainFeedbackActionRecord")
public class BodyServiceDomainFeedbackActionRecord {

    @JsonProperty("serviceDomainServicingSessionReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Reference to the active servicing session\n", example = "796678", name = "serviceDomainServicingSessionReference")
    private String serviceDomainServicingSessionReference;

    @JsonProperty("controlRecordInstanceReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Reference to the control record instance if appropriate\n", example = "724385", name = "controlRecordInstanceReference")
    private String controlRecordInstanceReference;

    @JsonProperty("behaviorQualifierInstanceReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Reference to the behavior qualifier instance if appropriate\n", example = "789747", name = "behaviorQualifierInstanceReference")
    private String behaviorQualifierInstanceReference;

    @JsonProperty("feedbackRecordType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The layout/type of the feedback provided\n", name = "feedbackRecordType")
    private String feedbackRecordType;

    @Valid
    @JsonProperty("feedbackRecord")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary\n general-info: The content of the feedback in any suitable format and media\n", name = "feedbackRecord")
    private BodyServiceDomainFeedbackActionRecordFeedbackRecord feedbackRecord;
}

