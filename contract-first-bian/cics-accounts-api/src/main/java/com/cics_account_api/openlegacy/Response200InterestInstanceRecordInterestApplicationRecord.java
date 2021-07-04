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
@Schema(name = "Response200InterestInstanceRecordInterestApplicationRecord")
public class Response200InterestInstanceRecordInterestApplicationRecord {

    @Valid
    @JsonProperty("interestTransaction")
    @Schema(name = "interestTransaction")
    private Response200InterestInstanceRecordInterestApplicationRecordInterestTransaction interestTransaction;

    @Valid
    @JsonProperty("interestAccrualAmount")
    @Schema(name = "interestAccrualAmount")
    private Response200InterestInstanceRecordInterestApplicationRecordInterestAccrualAmount interestAccrualAmount;
}

