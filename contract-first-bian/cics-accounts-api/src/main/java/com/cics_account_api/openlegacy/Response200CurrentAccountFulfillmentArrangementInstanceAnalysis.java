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
import com.fasterxml.jackson.annotation.JsonValue;

@BusinessEntity
@Getter
@Setter
@Schema(name = "Response200CurrentAccountFulfillmentArrangementInstanceAnalysis")
public class Response200CurrentAccountFulfillmentArrangementInstanceAnalysis {

    @JsonProperty("currentAccountFulfillmentArrangementInstanceAnalysisData")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected\n", name = "currentAccountFulfillmentArrangementInstanceAnalysisData")
    private String currentAccountFulfillmentArrangementInstanceAnalysisData;

    @JsonProperty("currentAccountFulfillmentArrangementInstanceAnalysisReportType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code\n general-info: The type of external performance analysis report available\n", name = "currentAccountFulfillmentArrangementInstanceAnalysisReportType")
    private String currentAccountFulfillmentArrangementInstanceAnalysisReportType;

    @Valid
    @JsonProperty("currentAccountFulfillmentArrangementInstanceAnalysisReport")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary\n general-info: The external analysis report in any suitable form including selection filters where appropriate\n", name = "currentAccountFulfillmentArrangementInstanceAnalysisReport")
    private Response200CurrentAccountFulfillmentArrangementInstanceAnalysisCurrentAccountFulfillmentArrangementInstanceAnalysisReport currentAccountFulfillmentArrangementInstanceAnalysisReport;
}

