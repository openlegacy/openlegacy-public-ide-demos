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
@Schema(name = "Response201CurrentAccountFulfillmentArrangementInstanceRecord")
public class Response201CurrentAccountFulfillmentArrangementInstanceRecord {

    @JsonProperty("productInstanceReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Reference to the current account product instance\n", example = "720007", name = "productInstanceReference")
    private String productInstanceReference;

    @JsonProperty("currentAccountNumber")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E1rHhcTGEeChad0JzLk7QA_-755813725\n bian-reference: CurrentAccount (as Account).AccountIdentification\n general-info: The associated account number in any suitable format (e.g. IBAN)\n", name = "currentAccountNumber")
    private String currentAccountNumber;

    @JsonProperty("accountCurrency")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_-69C4IDWEeKn8fN1QdMTXQ_-145666344\n bian-reference: CurrentAccount (as Account).AccountBaseCurrency\n general-info: The primary account currency\n", example = "USD", name = "accountCurrency")
    private String accountCurrency;

    @JsonProperty("entitlementOptionDefinition")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The definition of an applicable entitlement option\n", name = "entitlementOptionDefinition")
    private String entitlementOptionDefinition;

    @JsonProperty("entitlementOptionSetting")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The setting for the entitlement option\n", name = "entitlementOptionSetting")
    private String entitlementOptionSetting;

    @JsonProperty("restrictionOptionDefinition")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The definition of an applicable restriction option\n", name = "restrictionOptionDefinition")
    private String restrictionOptionDefinition;

    @JsonProperty("restrictionOptionSetting")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The setting for the restriction option\n", name = "restrictionOptionSetting")
    private String restrictionOptionSetting;

    @Valid
    @JsonProperty("positionLimits")
    @Schema(name = "positionLimits")
    private Response201CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits;

    @Valid
    @JsonProperty("dateType")
    @Schema(name = "dateType")
    private Response201CurrentAccountFulfillmentArrangementInstanceRecordDateType dateType;
}

