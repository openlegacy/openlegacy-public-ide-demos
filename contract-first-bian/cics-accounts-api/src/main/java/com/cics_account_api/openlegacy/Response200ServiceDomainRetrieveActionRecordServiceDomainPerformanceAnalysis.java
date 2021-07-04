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
@Schema(name = "Response200ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis")
public class Response200ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis {

    @JsonProperty("performanceAnalysisReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Reference to the internal performance analysis view maintained by the service center\n", example = "761670", name = "performanceAnalysisReference")
    private String performanceAnalysisReference;

    @JsonProperty("performanceAnalysisResult")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The results of the performance analysis that can be on-going or periodic\n", name = "performanceAnalysisResult")
    private String performanceAnalysisResult;

    @JsonProperty("performanceAnalysisReportType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code\n general-info: The type of performance analysis report available\n", name = "performanceAnalysisReportType")
    private String performanceAnalysisReportType;

    @Valid
    @JsonProperty("performanceAnalysisReport")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary\n general-info: The performance analysis report in any suitable form including selection filters where appropriate\n", name = "performanceAnalysisReport")
    private Response200ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysisPerformanceAnalysisReport performanceAnalysisReport;
}

