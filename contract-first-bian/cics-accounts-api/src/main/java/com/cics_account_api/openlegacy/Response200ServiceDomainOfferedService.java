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
@Schema(name = "Response200ServiceDomainOfferedService")
public class Response200ServiceDomainOfferedService {

    @JsonProperty("serviceDomainServiceReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Reference to a service offered by the service center\n", example = "776158", name = "serviceDomainServiceReference")
    private String serviceDomainServiceReference;

    @Valid
    @JsonProperty("serviceDomainServiceRecord")
    @Schema(name = "serviceDomainServiceRecord")
    private Response200ServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceRecord;
}

