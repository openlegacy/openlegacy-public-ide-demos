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
@Schema(name = "BodyCurrentAccountFulfillmentArrangementInstanceRecord")
public class BodyCurrentAccountFulfillmentArrangementInstanceRecord {

    @JsonProperty("customerReference")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EysE9cTGEeChad0JzLk7QA_-200588046\n bian-reference: CurrentAccount (as Account).AccountInvolvement (as AccountOwner)\n general-info: Reference to the account primary party/owner\n", example = "791657", name = "customerReference")
    private String customerReference;

    @JsonProperty("bankBranchLocationReference")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_z2I6YGx5EeKmZJ0Ago--9g_239738909\n bian-reference: CurrentAccount (as Account).AccountInvolvement (as AccountServicer). PartyRole.Party.Location\n general-info: Bank branch associated with the account for booking purposes\n", example = "722875", name = "bankBranchLocationReference")
    private String bankBranchLocationReference;

    @JsonProperty("accountType")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_7CvjsPj5EeG2rK1g72xi7Q_-843966450\n bian-reference: CurrentAccount (as Account).AccountType\n general-info: The type of current account (e.g. checking, student, small business)\n", name = "accountType")
    private String accountType;

    @JsonProperty("accountCurrency")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_-69C4IDWEeKn8fN1QdMTXQ_-145666344\n bian-reference: CurrentAccount (as Account).AccountBaseCurrency\n general-info: The primary account currency\n", example = "USD", name = "accountCurrency")
    private String accountCurrency;

    @JsonProperty("taxReference")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E4gZEcTGEeChad0JzLk7QA_2010102987/elements/__-5BiGIiEeGD28DQaMef-g\n bian-reference: CurrentAccountAgreement (as Agreement). RuleSetAsRegulation\n general-info: Reference identifier linking the account to appropriate tax handling\n", example = "708210", name = "taxReference")
    private String taxReference;

    @JsonProperty("entitlementOptionSetting")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The setting for the entitlement option\n", name = "entitlementOptionSetting")
    private String entitlementOptionSetting;

    @JsonProperty("restrictionOptionSetting")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The setting for the restriction option\n", name = "restrictionOptionSetting")
    private String restrictionOptionSetting;

    @Valid
    @JsonProperty("associations")
    @Schema(name = "associations")
    private BodyCurrentAccountFulfillmentArrangementInstanceRecordAssociations associations;

    @Valid
    @JsonProperty("linkedAccounts")
    @Schema(name = "linkedAccounts")
    private BodyCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts;

    @Valid
    @JsonProperty("positionLimits")
    @Schema(name = "positionLimits")
    private BodyCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits;

    @Valid
    @JsonProperty("dateType")
    @Schema(name = "dateType")
    private BodyCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType;
}

