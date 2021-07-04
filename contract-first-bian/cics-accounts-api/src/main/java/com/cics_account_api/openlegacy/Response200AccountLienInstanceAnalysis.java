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
@Schema(name = "Response200AccountLienInstanceAnalysis")
public class Response200AccountLienInstanceAnalysis {

    @Valid
    @JsonProperty("accountLienInstanceAnalysisRecord")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary\n general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected\n", name = "accountLienInstanceAnalysisRecord")
    private Response200AccountLienInstanceAnalysisAccountLienInstanceAnalysisRecord accountLienInstanceAnalysisRecord;

    @JsonProperty("accountLienInstanceAnalysisReportType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code\n general-info: The type of external performance analysis report available\n", name = "accountLienInstanceAnalysisReportType")
    private String accountLienInstanceAnalysisReportType;

    @JsonProperty("accountLienInstanceAnalysisParameters")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The selection parameters for the analysis (e.g. period, algorithm type)\n", name = "accountLienInstanceAnalysisParameters")
    private String accountLienInstanceAnalysisParameters;

    @Valid
    @JsonProperty("accountLienInstanceAnalysisReport")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary\n general-info: The external analysis report in any suitable form including selection filters where appropriate\n", name = "accountLienInstanceAnalysisReport")
    private Response200AccountLienInstanceAnalysisAccountLienInstanceAnalysisReport accountLienInstanceAnalysisReport;
}

