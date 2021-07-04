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
@Schema(name = "Body")
public class Body {

    @JsonProperty("currentAccountServicingSessionReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Reference to the active servicing session\n", example = "CASSR739654", name = "currentAccountServicingSessionReference")
    private String currentAccountServicingSessionReference;

    @Valid
    @JsonProperty("currentAccountFulfillmentArrangementInitiateActionRecord")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary\n general-info: The Initiate service call input and output record\n", name = "currentAccountFulfillmentArrangementInitiateActionRecord")
    private BodyCurrentAccountFulfillmentArrangementInitiateActionRecord currentAccountFulfillmentArrangementInitiateActionRecord;

    @JsonProperty("currentAccountFulfillmentArrangementInstanceStatus")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The status of the Current Account Fulfillment Arrangement instance (e.g. initialised, pending, active)\n", name = "currentAccountFulfillmentArrangementInstanceStatus")
    private String currentAccountFulfillmentArrangementInstanceStatus;

    @Valid
    @JsonProperty("currentAccountFulfillmentArrangementInstanceRecord")
    @Schema(name = "currentAccountFulfillmentArrangementInstanceRecord")
    private BodyCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord;
}

