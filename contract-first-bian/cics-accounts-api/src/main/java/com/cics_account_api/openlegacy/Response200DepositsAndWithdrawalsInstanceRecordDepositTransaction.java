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
@Schema(name = "Response200DepositsAndWithdrawalsInstanceRecordDepositTransaction")
public class Response200DepositsAndWithdrawalsInstanceRecordDepositTransaction {

    @JsonProperty("depositTransactionSourceReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Identifies the source of the deposit\n", example = "752074", name = "depositTransactionSourceReference")
    private String depositTransactionSourceReference;

    @JsonProperty("depositTransactionDepositType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The type of deposit made with the transaction\n", name = "depositTransactionDepositType")
    private String depositTransactionDepositType;

    @JsonProperty("depositTransactionDescription")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Any necessary details describing the purpose or reference properties of the deposit\n", name = "depositTransactionDescription")
    private String depositTransactionDescription;

    @JsonProperty("depositTransactionAmount")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount\n general-info: The deposited amount\n", example = "USD 250", name = "depositTransactionAmount")
    private String depositTransactionAmount;

    @JsonProperty("depositTransactionDate")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime\n general-info: The date and time the deposit was initiated\n", example = "09-22-2018", name = "depositTransactionDate")
    private String depositTransactionDate;
}

