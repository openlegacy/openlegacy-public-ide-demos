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
@Schema(name = "Response200ServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis")
public class Response200ServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis {

    @JsonProperty("controlRecordPortfolioAnalysisReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Reference to the control record portfolio analysis view maintained by the service center\n", example = "739764", name = "controlRecordPortfolioAnalysisReference")
    private String controlRecordPortfolioAnalysisReference;

    @JsonProperty("controlRecordPortfolioAnalysisResult")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The results of the portfolio analysis that can be on-going, periodic and actual and projected (can be unstructured data)\n", name = "controlRecordPortfolioAnalysisResult")
    private String controlRecordPortfolioAnalysisResult;

    @JsonProperty("controlRecordPortfolioAnalysisReportType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code\n general-info: The type of external portfolio analysis report available\n", name = "controlRecordPortfolioAnalysisReportType")
    private String controlRecordPortfolioAnalysisReportType;

    @Valid
    @JsonProperty("controlRecordAnalysisReport")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary\n general-info: The external analysis report in any suitable form including selection filters where appropriate\n", name = "controlRecordAnalysisReport")
    private Response200ServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysisControlRecordAnalysisReport controlRecordAnalysisReport;
}

