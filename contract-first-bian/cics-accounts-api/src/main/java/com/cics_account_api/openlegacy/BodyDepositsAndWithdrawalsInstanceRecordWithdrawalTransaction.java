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
@Schema(name = "BodyDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction")
public class BodyDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction {

    @JsonProperty("withdrawalTransactionSourceReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Identifies the target for the withdrawal\n", example = "774711", name = "withdrawalTransactionSourceReference")
    private String withdrawalTransactionSourceReference;

    @JsonProperty("withdrawalTransactionWithdrawalType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The type of withdrawal made with the transaction\n", name = "withdrawalTransactionWithdrawalType")
    private String withdrawalTransactionWithdrawalType;

    @JsonProperty("withdrawalTransactionDescription")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Any necessary details describing the purpose or reference properties of the withdrawal\n", name = "withdrawalTransactionDescription")
    private String withdrawalTransactionDescription;

    @JsonProperty("withdrawalTransactionAmount")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount\n general-info: The withdrawn amount\n", example = "USD 250", name = "withdrawalTransactionAmount")
    private String withdrawalTransactionAmount;

    @JsonProperty("withdrawalTransactionDate")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime\n general-info: The date and time the withdrawal was initiated\n", example = "09-22-2018", name = "withdrawalTransactionDate")
    private String withdrawalTransactionDate;
}

