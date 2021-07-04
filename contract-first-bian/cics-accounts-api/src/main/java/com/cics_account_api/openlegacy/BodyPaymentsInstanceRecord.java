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
@Schema(name = "BodyPaymentsInstanceRecord")
public class BodyPaymentsInstanceRecord {

    @JsonProperty("paymentType")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FColc8TGEeChad0JzLk7QA_1437769975\n bian-reference: PaymentService.PaymentType\n general-info: The type of payment transaction (e.g. customer payment, standing order, direct debit, bill pay)\n", name = "paymentType")
    private String paymentType;

    @JsonProperty("paymentProcessingOptionDefinition")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Definition of the processing option and impact (e.g. frequency and cumulative amount constraints)\n", name = "paymentProcessingOptionDefinition")
    private String paymentProcessingOptionDefinition;

    @JsonProperty("paymentProcessingOptionSetting")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The option setting\n", name = "paymentProcessingOptionSetting")
    private String paymentProcessingOptionSetting;

    @Valid
    @JsonProperty("paymentConfiguration")
    @Schema(name = "paymentConfiguration")
    private BodyPaymentsInstanceRecordPaymentConfiguration paymentConfiguration;

    @Valid
    @JsonProperty("paymentTransaction")
    @Schema(name = "paymentTransaction")
    private BodyPaymentsInstanceRecordPaymentTransaction paymentTransaction;
}

