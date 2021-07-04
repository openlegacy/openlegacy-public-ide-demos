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
@Schema(name = "Response200PaymentsInstanceRecordPaymentConfiguration")
public class Response200PaymentsInstanceRecordPaymentConfiguration {

    @JsonProperty("paymentSchedule")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E7CIosTGEeChad0JzLk7QA_1664636213/elements/_E7CIpMTGEeChad0JzLk7QA_-1145087031\n bian-reference: StandingOrderArrangement.StandingOrderSchedule\n general-info: Processing schedule for repeating payments for standing orders (e.g. start date, end, period, number/cycles). Note this triggers an internal execution call as necessary\n", name = "paymentSchedule")
    private String paymentSchedule;

    @Valid
    @JsonProperty("directDebitMandateReference")
    @Schema(name = "directDebitMandateReference")
    private Response200PaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference directDebitMandateReference;

    @Valid
    @JsonProperty("billPayMandateReference")
    @Schema(name = "billPayMandateReference")
    private Response200PaymentsInstanceRecordPaymentConfigurationBillPayMandateReference billPayMandateReference;
}

