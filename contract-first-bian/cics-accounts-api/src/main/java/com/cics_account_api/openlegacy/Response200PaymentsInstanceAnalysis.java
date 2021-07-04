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
@Schema(name = "Response200PaymentsInstanceAnalysis")
public class Response200PaymentsInstanceAnalysis {

    @Valid
    @JsonProperty("paymentsInstanceAnalysisRecord")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary\n general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected\n", name = "paymentsInstanceAnalysisRecord")
    private Response200PaymentsInstanceAnalysisPaymentsInstanceAnalysisRecord paymentsInstanceAnalysisRecord;

    @JsonProperty("paymentsInstanceAnalysisReportType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code\n general-info: The type of external performance analysis report available\n", name = "paymentsInstanceAnalysisReportType")
    private String paymentsInstanceAnalysisReportType;

    @JsonProperty("paymentsInstanceAnalysisParameters")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The selection parameters for the analysis (e.g. period, algorithm type)\n", name = "paymentsInstanceAnalysisParameters")
    private String paymentsInstanceAnalysisParameters;

    @Valid
    @JsonProperty("paymentsInstanceAnalysisReport")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary\n general-info: The external analysis report in any suitable form including selection filters where appropriate\n", name = "paymentsInstanceAnalysisReport")
    private Response200PaymentsInstanceAnalysisPaymentsInstanceAnalysisReport paymentsInstanceAnalysisReport;
}

