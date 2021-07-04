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
@Schema(name = "Response200ServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription")
public class Response200ServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription {

    @JsonProperty("serviceDomainServiceSubscriberReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Maintains reference to allowed users or subscribers to the service which can be any known party\n", example = "756221", name = "serviceDomainServiceSubscriberReference")
    private String serviceDomainServiceSubscriberReference;

    @JsonProperty("serviceDomainServiceSubscriberAccessProfile")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The allowed service access for a user or subscriber to the service which can be any known party\n", name = "serviceDomainServiceSubscriberAccessProfile")
    private String serviceDomainServiceSubscriberAccessProfile;
}

