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
@Schema(name = "Response200DepositsAndWithdrawalsInstanceRecord")
public class Response200DepositsAndWithdrawalsInstanceRecord {

    @JsonProperty("depositType")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5_m2sTGEeChad0JzLk7QA_-2008690148/elements/_E6IwwMTGEeChad0JzLk7QA_1495654231\n bian-reference: DepositServicet.DepositType\n general-info: The type of deposit transaction that can be applied to the account (e.g. customer deposit, internal credit)\n", name = "depositType")
    private String depositType;

    @JsonProperty("withdrawalType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The type of withdrawal transaction that can be applied to the account (e.g. customer withdrawal, internal service charge, disbursement)\n", name = "withdrawalType")
    private String withdrawalType;

    @JsonProperty("accountLimitBreachResponse")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The handling options if a withdrawal results in a breach of an account limit\n", name = "accountLimitBreachResponse")
    private String accountLimitBreachResponse;

    @Valid
    @JsonProperty("depositTransaction")
    @Schema(name = "depositTransaction")
    private Response200DepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction;

    @Valid
    @JsonProperty("withdrawalTransaction")
    @Schema(name = "withdrawalTransaction")
    private Response200DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction;
}

