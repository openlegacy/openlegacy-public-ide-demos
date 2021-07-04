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
@Schema(name = "BodyServiceDomainServiceConfigurationRecord")
public class BodyServiceDomainServiceConfigurationRecord {

    @JsonProperty("serviceDomainServiceConfigurationSettingReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Refers to the service configuration parameter for the service\n", example = "710630", name = "serviceDomainServiceConfigurationSettingReference")
    private String serviceDomainServiceConfigurationSettingReference;

    @JsonProperty("serviceDomainServiceConfigurationSettingType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The type of service configuration parameter\n", name = "serviceDomainServiceConfigurationSettingType")
    private String serviceDomainServiceConfigurationSettingType;

    @Valid
    @JsonProperty("serviceDomainServiceConfigurationSetup")
    @Schema(name = "serviceDomainServiceConfigurationSetup")
    private BodyServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup;

    @Valid
    @JsonProperty("serviceDomainServiceSubscription")
    @Schema(name = "serviceDomainServiceSubscription")
    private BodyServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscription;

    @Valid
    @JsonProperty("serviceDomainServiceAgreement")
    @Schema(name = "serviceDomainServiceAgreement")
    private BodyServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreement;
}

