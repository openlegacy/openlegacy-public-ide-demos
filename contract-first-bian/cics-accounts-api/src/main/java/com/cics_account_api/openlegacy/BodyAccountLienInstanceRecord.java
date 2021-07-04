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
@Schema(name = "BodyAccountLienInstanceRecord")
public class BodyAccountLienInstanceRecord {

    @JsonProperty("lienType")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The type of lien (e.g. final, pending)\n", name = "lienType")
    private String lienType;

    @JsonProperty("lienProcessingOption")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text\n general-info: The processing option applied to the lien\n", name = "lienProcessingOption")
    private String lienProcessingOption;

    @Valid
    @JsonProperty("lienRecord")
    @Schema(name = "lienRecord")
    private BodyAccountLienInstanceRecordLienRecord lienRecord;
}

