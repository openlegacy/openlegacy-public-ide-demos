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
@Schema(name = "Response200InterestInstanceRecordInterestApplicationRecordInterestTransaction")
public class Response200InterestInstanceRecordInterestApplicationRecordInterestTransaction {

    @JsonProperty("transactionDescription")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: General description of the interest transaction\n", name = "transactionDescription")
    private String transactionDescription;

    @JsonProperty("transactionRateType")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_2b6L4A4hEeO3g-FNSwkb-g_-1305263591\n bian-reference: InterestTransaction.AppliedInterestType\n general-info: Applicable rate type\n", name = "transactionRateType")
    private String transactionRateType;

    @JsonProperty("transactionInterestCharge")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_E5P_98TGEeChad0JzLk7QA_2006810136\n bian-reference: InterestTransaction.AppliedInterestAmount\n general-info: The derived interest amount to be applied\n", example = "USD 250", name = "transactionInterestCharge")
    private String transactionInterestCharge;
}

