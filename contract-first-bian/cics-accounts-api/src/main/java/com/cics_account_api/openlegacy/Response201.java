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
@Schema(name = "Response201")
public class Response201 {

    @JsonProperty("currentAccountFulfillmentArrangementInstanceReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Reference to the Current Account Fulfillment Arrangement instance\n", example = "CAFAIR796897", name = "currentAccountFulfillmentArrangementInstanceReference")
    private String currentAccountFulfillmentArrangementInstanceReference;

    @JsonProperty("currentAccountFulfillmentArrangementInitiateActionReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Reference to an Initiate service call\n", example = "CAFAIAR775759", name = "currentAccountFulfillmentArrangementInitiateActionReference")
    private String currentAccountFulfillmentArrangementInitiateActionReference;

    @Valid
    @JsonProperty("currentAccountFulfillmentArrangementInitiateActionRecord")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary\n general-info: The Initiate service call input and output record\n", name = "currentAccountFulfillmentArrangementInitiateActionRecord")
    private Response201CurrentAccountFulfillmentArrangementInitiateActionRecord currentAccountFulfillmentArrangementInitiateActionRecord;

    @JsonProperty("currentAccountFulfillmentArrangementInstanceStatus")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The status of the Current Account Fulfillment Arrangement instance (e.g. initialised, pending, active)\n", name = "currentAccountFulfillmentArrangementInstanceStatus")
    private String currentAccountFulfillmentArrangementInstanceStatus;

    @Valid
    @JsonProperty("currentAccountFulfillmentArrangementInstanceRecord")
    @Schema(name = "currentAccountFulfillmentArrangementInstanceRecord")
    private Response201CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord;
}

