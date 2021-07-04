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
import com.fasterxml.jackson.annotation.JsonValue;

@BusinessEntity
@Getter
@Setter
@Schema(name = "Response200CurrentAccount")
public class Response200CurrentAccount {

	@Valid
	@JsonProperty("currentAccountFulfillmentArrangementInstanceRecord")
	private Response200CurrentAccountFulfillmentArrangementInstanceRecord  response200CurrentAccountFulfillmentArrangementInstanceRecord;

	@Valid
	@JsonProperty ("currentAccountFulfillmentArrangementRetrieveActionTaskRecord")
	private Response200CurrentAccountFulfillmentArrangementRetrieveActionTaskRecord response200CurrentAccountFulfillmentArrangementRetrieveActionTaskRecord;
	
	@Valid
	@JsonProperty("currentAccountFulfillmentArrangementInstanceReportRecord")
	private Response200CurrentAccountFulfillmentArrangementInstanceReportRecord response200CurrentAccountFulfillmentArrangementInstanceReportRecord;
	@Valid
	@JsonProperty("currentAccountFulfillmentArrangementInstanceAnalysis")
	private Response200CurrentAccountFulfillmentArrangementInstanceAnalysis response200CurrentAccountFulfillmentArrangementInstanceAnalysis ;

	@JsonProperty("currentAccountFulfillmentArrangementRetrieveActionTaskReference")
	private String currentAccountFulfillmentArrangementRetrieveActionTaskReference;
	
	@JsonProperty("currentAccountFulfillmentArrangementRetrieveActionResponse")
	private String currentAccountFulfillmentArrangementRetrieveActionResponse;
}
