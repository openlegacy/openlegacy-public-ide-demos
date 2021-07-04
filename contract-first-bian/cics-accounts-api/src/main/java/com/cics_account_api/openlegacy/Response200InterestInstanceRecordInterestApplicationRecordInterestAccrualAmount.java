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
@Schema(name = "Response200InterestInstanceRecordInterestApplicationRecordInterestAccrualAmount")
public class Response200InterestInstanceRecordInterestApplicationRecordInterestAccrualAmount {

    @JsonProperty("interestAccrualType")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_E5P_-cTGEeChad0JzLk7QA_348288418\n bian-reference: InterestTransaction.AccuredInterestType\n general-info: The interest type being tracked\n", name = "interestAccrualType")
    private String interestAccrualType;

    @JsonProperty("interestAccrualCharge")
    @Schema(description = "`status: Not Mapped`\n core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount\n general-info: The accrued amount of applied interest\n", example = "USD 250", name = "interestAccrualCharge")
    private String interestAccrualCharge;
}

