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
@Schema(name = "Response200AccountLienInstanceRecordLienRecord")
public class Response200AccountLienInstanceRecordLienRecord {

    @JsonProperty("lienOriginator")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The party requesting the lien\n", name = "lienOriginator")
    private String lienOriginator;

    @JsonProperty("lienPurpose")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The purpose or associated facility linked to the lien\n", name = "lienPurpose")
    private String lienPurpose;

    @JsonProperty("lienAmount")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount\n general-info: The amount being blocked\n", example = "USD 250", name = "lienAmount")
    private String lienAmount;

    @JsonProperty("lienStartDate")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime\n general-info: The date the lien is enforced\n", example = "09-22-2018", name = "lienStartDate")
    private String lienStartDate;

    @JsonProperty("lienExpiryDate")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime\n general-info: The date the lien is removed\n", example = "09-22-2018", name = "lienExpiryDate")
    private String lienExpiryDate;

    @JsonProperty("lienStatus")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The status on the lien\n", name = "lienStatus")
    private String lienStatus;
}

