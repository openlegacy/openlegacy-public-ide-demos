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
@Schema(name = "Response201CurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts")
public class Response201CurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts {

    @JsonProperty("linkType")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_7CvjsPj5EeG2rK1g72xi7Q_-843966450\n bian-reference: CurrentAccount (as Account).AccountType\n general-info: The type and purpose for the link\n", name = "linkType")
    private String linkType;

    @JsonProperty("accountDetails")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E10RcsTGEeChad0JzLk7QA_-1441245060\n bian-reference: CurrentAccount (as Account).AccountDescription\n general-info: Details of the linked account\n", name = "accountDetails")
    private String accountDetails;
}

