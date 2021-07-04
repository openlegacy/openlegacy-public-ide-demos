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
@Schema(name = "Response200ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines")
public class Response200ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines {

    @JsonProperty("serviceDomainServiceEligibility")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications\n", name = "serviceDomainServiceEligibility")
    private String serviceDomainServiceEligibility;

    @JsonProperty("serviceDomainServiceIntendedUses")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Guidelines covering allowed, intended use of the service\n", name = "serviceDomainServiceIntendedUses")
    private String serviceDomainServiceIntendedUses;

    @JsonProperty("serviceDomainServicePricingandTerms")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Terms, prices, penalties associated with use of the service\n", name = "serviceDomainServicePricingandTerms")
    private String serviceDomainServicePricingandTerms;
}

