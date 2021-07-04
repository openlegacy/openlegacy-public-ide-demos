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
@Schema(name = "Response201ServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement")
public class Response201ServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement {

    @JsonProperty("serviceDomainServiceAgreementReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Reference to the offered service agreement\n", example = "791202", name = "serviceDomainServiceAgreementReference")
    private String serviceDomainServiceAgreementReference;

    @JsonProperty("serviceDomainServiceUserReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Reference to the user covered by the contract\n", example = "767210", name = "serviceDomainServiceUserReference")
    private String serviceDomainServiceUserReference;

    @JsonProperty("serviceDomainServiceAgreementTermsandConditions")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Terms and conditions covering the service agreement\n", name = "serviceDomainServiceAgreementTermsandConditions")
    private String serviceDomainServiceAgreementTermsandConditions;
}

