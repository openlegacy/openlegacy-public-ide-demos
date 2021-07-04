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
@Schema(name = "Response201CurrentAccountFulfillmentArrangementInstanceRecordAssociations")
public class Response201CurrentAccountFulfillmentArrangementInstanceRecordAssociations {

    @JsonProperty("associationType")
    @Schema(description = "general-info: The type of association (e.g. guarantor, co-signer)\n", name = "associationType")
    private String associationType;

    @JsonProperty("associationObligationEntitlement")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Description of the role, obligations or entitlements of the associated party\n", name = "associationObligationEntitlement")
    private String associationObligationEntitlement;

    @JsonProperty("associationReference")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E10RccTGEeChad0JzLk7QA_1392095805\n bian-reference: CurrentAccountAgreement (as Agreement).AgreementInvolvement\n general-info: Reference to the associated party\n", example = "754623", name = "associationReference")
    private String associationReference;
}

