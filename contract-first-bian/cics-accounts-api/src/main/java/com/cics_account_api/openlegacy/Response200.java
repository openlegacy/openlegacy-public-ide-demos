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
@Schema(name = "Response200")
public class Response200 {

    @JsonProperty("accountLienExchangeActionTaskReference")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier\n general-info: Reference to a Account Lien instance exchange service call\n", example = "ALEATR720629", name = "accountLienExchangeActionTaskReference")
    private String accountLienExchangeActionTaskReference;

    @Valid
    @JsonProperty("accountLienExchangeActionTaskRecord")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary\n general-info: The exchange service call consolidated processing record\n", name = "accountLienExchangeActionTaskRecord")
    private Response200AccountLienExchangeActionTaskRecord accountLienExchangeActionTaskRecord;

    @JsonProperty("accountLienExchangeActionResponse")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: Details of the exchange action service response\n", name = "accountLienExchangeActionResponse")
    private String accountLienExchangeActionResponse;

    @JsonProperty("accountLienInstanceStatus")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The status of the Account Lien instance (e.g. accepted, rejected, verified)\n", name = "accountLienInstanceStatus")
    private String accountLienInstanceStatus;
}

