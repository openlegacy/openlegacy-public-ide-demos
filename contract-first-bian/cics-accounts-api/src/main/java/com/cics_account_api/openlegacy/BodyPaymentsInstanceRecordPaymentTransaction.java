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
@Schema(name = "BodyPaymentsInstanceRecordPaymentTransaction")
public class BodyPaymentsInstanceRecordPaymentTransaction {

    @JsonProperty("paymentTransactionType")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FA2cwMTGEeChad0JzLk7QA_1385452657/elements/_q58kEK23EeKuGrOch6U_ZQ_-1354685933\n bian-reference: PaymentTransactionType\n general-info: The type of payment transaction (e.g. customer payment, standing order, direct debit, bill pay)\n", name = "paymentTransactionType")
    private String paymentTransactionType;

    @JsonProperty("paymentTransactionPayeeReference")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EteNycTGEeChad0JzLk7QA_-591715083\n bian-reference: PaymentTransactionInvolvementType (as Payee)\n general-info: Reference to the party to whom the payment is made\n", example = "713054", name = "paymentTransactionPayeeReference")
    private String paymentTransactionPayeeReference;

    @JsonProperty("paymentTransactionPayeeAccountReference")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_4a7goJo3EeOJb4DIsGFWTA\n bian-reference: PaymentTransaction.Account (as Payee Account)\n general-info: Reference to the account to which the payment is made\n", example = "736608", name = "paymentTransactionPayeeAccountReference")
    private String paymentTransactionPayeeAccountReference;

    @JsonProperty("paymentTransactionPayeeBankReference")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EteNyMTGEeChad0JzLk7QA_-246206935\n bian-reference: PaymentTransactionInvolvementType (as PayeeBank)\n general-info: Reference to the bank where the payee account is held\n", example = "775471", name = "paymentTransactionPayeeBankReference")
    private String paymentTransactionPayeeBankReference;

    @JsonProperty("paymentTransactionAmount")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_xIKY4Hm5EeKIubTif2R3gg_40795932\n bian-reference: PaymentTransactionPrincipleAmount\n general-info: The amount (and currency if applicable) of the payment\n", example = "USD 250", name = "paymentTransactionAmount")
    private String paymentTransactionAmount;

    @JsonProperty("paymentTransactionFeeType")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816\n bian-reference: FeeTransactionAppliedFeeType\n general-info: The fee type applied to the payment transaction\n", name = "paymentTransactionFeeType")
    private String paymentTransactionFeeType;

    @JsonProperty("paymentTransactionFeeCharge")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_FMBK98TGEeChad0JzLk7QA_-1487452687\n bian-reference: FeeTransactionAppliedFeeAmount\n general-info: The fee charge applied to the transaction\n", example = "USD 250", name = "paymentTransactionFeeCharge")
    private String paymentTransactionFeeCharge;

    @JsonProperty("paymentTransactionDate")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FDYMU8TGEeChad0JzLk7QA_1746210992\n bian-reference: PaymentTransactionValueDate\n general-info: The various key dates and times associated with the payment transaction\n", example = "09-22-2018", name = "paymentTransactionDate")
    private String paymentTransactionDate;

    @JsonProperty("paymentTransactionPaymentMechanism")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FAi6ycTGEeChad0JzLk7QA_1746210990\n bian-reference: PaymentTransactionUsedMechanism\n general-info: Requested payment mechanism (e.g. Wire, ACH)\n", name = "paymentTransactionPaymentMechanism")
    private String paymentTransactionPaymentMechanism;

    @JsonProperty("paymentTransactionPaymentPurpose")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Description of the purpose including any external reference to the transaction\n", name = "paymentTransactionPaymentPurpose")
    private String paymentTransactionPaymentPurpose;

    @JsonProperty("paymentTransactionBankBranchLocationReference")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_z2I6YGx5EeKmZJ0Ago--9g_239738909\n bian-reference: PaymentTransactionInvolvementAsPartyRole.Party.Location\n general-info: Reference to the location the payment transaction is initiated from \n", example = "731251", name = "paymentTransactionBankBranchLocationReference")
    private String paymentTransactionBankBranchLocationReference;
}

