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
@Schema(name = "Response200ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis")
public class Response200ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis {

    @JsonProperty("activityAnalysisReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Reference to the internal activity analysis view maintained by the service center\n", example = "730230", name = "activityAnalysisReference")
    private String activityAnalysisReference;

    @JsonProperty("activityAnalysisResult")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The results of the activity analysis that can be on-going, periodic and actual and projected\n", name = "activityAnalysisResult")
    private String activityAnalysisResult;

    @JsonProperty("activityAnalysisReportType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code\n general-info: The type of activity analysis report available\n", name = "activityAnalysisReportType")
    private String activityAnalysisReportType;

    @Valid
    @JsonProperty("activityAnalysisReport")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary\n general-info: The activity analysis report in any suitable form including selection filters where appropriate\n", name = "activityAnalysisReport")
    private Response200ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysisActivityAnalysisReport activityAnalysisReport;
}

