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
@Schema(name = "Response200ServiceDomainOfferedServiceServiceDomainServiceRecord")
public class Response200ServiceDomainOfferedServiceServiceDomainServiceRecord {

    @JsonProperty("serviceDomainServiceType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Refers to the different types of services offered\n", name = "serviceDomainServiceType")
    private String serviceDomainServiceType;

    @JsonProperty("serviceDomainServiceVersion")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The version details of the service when appropriate\n", name = "serviceDomainServiceVersion")
    private String serviceDomainServiceVersion;

    @JsonProperty("serviceDomainServiceDescription")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Description of the offered service \n", name = "serviceDomainServiceDescription")
    private String serviceDomainServiceDescription;

    @Valid
    @JsonProperty("serviceDomainServicePoliciesandGuidelines")
    @Schema(name = "serviceDomainServicePoliciesandGuidelines")
    private Response200ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServicePoliciesandGuidelines;

    @JsonProperty("serviceDomainServiceSchedule")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Schedule defining when the accessed service is available\n", name = "serviceDomainServiceSchedule")
    private String serviceDomainServiceSchedule;
}

