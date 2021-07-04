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
@Schema(name = "Response200PaymentsInstanceReport")
public class Response200PaymentsInstanceReport {

    @Valid
    @JsonProperty("paymentsInstanceReportRecord")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary\n general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected\n", name = "paymentsInstanceReportRecord")
    private Response200PaymentsInstanceReportPaymentsInstanceReportRecord paymentsInstanceReportRecord;

    @JsonProperty("paymentsInstanceReportType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code\n general-info: The type of external report available\n", name = "paymentsInstanceReportType")
    private String paymentsInstanceReportType;

    @JsonProperty("paymentsInstanceReportParameters")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The selection parameters for the report (e.g. period, content type)\n", name = "paymentsInstanceReportParameters")
    private String paymentsInstanceReportParameters;

    @Valid
    @JsonProperty("paymentsInstanceReport")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary\n general-info: The external report in any suitable form including selection filters where appropriate\n", name = "paymentsInstanceReport")
    private Response200PaymentsInstanceReportPaymentsInstanceReport paymentsInstanceReport;
}

