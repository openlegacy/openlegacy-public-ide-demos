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
@Schema(name = "Response200ServiceFeesInstanceRecordFeeApplicationRecord")
public class Response200ServiceFeesInstanceRecordFeeApplicationRecord {

    @Valid
    @JsonProperty("feeTransaction")
    @Schema(name = "feeTransaction")
    private Response200ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction feeTransaction;

    @Valid
    @JsonProperty("feeProjectionsandCommitments")
    @Schema(name = "feeProjectionsandCommitments")
    private Response200ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments feeProjectionsandCommitments;

    @Valid
    @JsonProperty("feeAccrualAmount")
    @Schema(name = "feeAccrualAmount")
    private Response200ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount feeAccrualAmount;
}

