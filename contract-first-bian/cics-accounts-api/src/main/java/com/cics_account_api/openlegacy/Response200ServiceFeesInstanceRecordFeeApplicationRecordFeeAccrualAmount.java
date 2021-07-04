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
@Schema(name = "Response200ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount")
public class Response200ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount {

    @JsonProperty("accrualFeeType")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816\n bian-reference: FeeTransaction.AccuredFeeType\n general-info: The fee or penalty type being tracked\n", name = "accrualFeeType")
    private String accrualFeeType;

    @JsonProperty("accrualFeeCharge")
    @Schema(description = "`status: Registered`\n iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_FMBK98TGEeChad0JzLk7QA_-1487452687\n bian-reference: FeeTransaction.AccuredFeeAmount\n general-info: The accrued amount of fees and penalties\n", example = "USD 250", name = "accrualFeeCharge")
    private String accrualFeeCharge;
}

