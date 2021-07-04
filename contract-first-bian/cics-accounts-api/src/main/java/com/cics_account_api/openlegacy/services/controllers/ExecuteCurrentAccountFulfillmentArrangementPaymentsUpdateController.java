package com.cics_account_api.openlegacy.services.controllers;

import com.cics_account_api.openlegacy.services.ExecuteCurrentAccountFulfillmentArrangementPaymentsUpdateService;
import com.cics_account_api.openlegacy.services.ExecuteCurrentAccountFulfillmentArrangementPaymentsUpdateService.*;

import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import com.cics_account_api.openlegacy.Body;
import com.cics_account_api.openlegacy.Response200;
import java.lang.String;

@RestController
@RequestMapping(path = "/api/sd-current-account/current-accountv2/current-account")
@Tag(name = "execute")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class ExecuteCurrentAccountFulfillmentArrangementPaymentsUpdateController {

    @Autowired
    private ExecuteCurrentAccountFulfillmentArrangementPaymentsUpdateService executeCurrentAccountFulfillmentArrangementPaymentsUpdateService;
    
    @PutMapping(path = "/{sd-reference-id}/current-account-fulfillment-arrangement/{cr-reference-id}/payments/{bq-reference-id}/execution", consumes = {"*/*"}, produces = {"application/json"})
    @Operation(summary = "Invoke an automated execute action against the Payments instance", description =  "Trigger a payment for a repeating payment set up", tags = { "execute" }, operationId = "executeCurrentAccountFulfillmentArrangementPaymentsUpdate", 
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successful execution of Payments Instance Record", content = @Content(schema = @Schema(implementation = Response200.class)))
    })
    public Response200 executeCurrentAccountFulfillmentArrangementPaymentsUpdate(@PathVariable(name = "sd-reference-id") @NotNull @Parameter(name = "sd-reference-id", description = "Current Account Servicing Session Reference", required = true) String sdReferenceId,
            @PathVariable(name = "cr-reference-id") @NotNull @Parameter(name = "cr-reference-id", description = "Current Account Fulfillment Arrangement Instance Reference", required = true) String crReferenceId,
            @PathVariable(name = "bq-reference-id") @NotNull @Parameter(name = "bq-reference-id", description = "Payments Instance Reference", required = true) String bqReferenceId,
            @Valid @RequestBody() @Parameter(name = "body", description = "Payments request payload", required = true) Body body) throws Exception {
        ExecuteCurrentAccountFulfillmentArrangementPaymentsUpdateIn executeCurrentAccountFulfillmentArrangementPaymentsUpdateIn = new ExecuteCurrentAccountFulfillmentArrangementPaymentsUpdateIn();
        executeCurrentAccountFulfillmentArrangementPaymentsUpdateIn.setSdReferenceId(sdReferenceId);
        executeCurrentAccountFulfillmentArrangementPaymentsUpdateIn.setCrReferenceId(crReferenceId);
        executeCurrentAccountFulfillmentArrangementPaymentsUpdateIn.setBqReferenceId(bqReferenceId);
        executeCurrentAccountFulfillmentArrangementPaymentsUpdateIn.setBody(body);
        ExecuteCurrentAccountFulfillmentArrangementPaymentsUpdateOut executeCurrentAccountFulfillmentArrangementPaymentsUpdateOut = executeCurrentAccountFulfillmentArrangementPaymentsUpdateService.executeCurrentAccountFulfillmentArrangementPaymentsUpdate(executeCurrentAccountFulfillmentArrangementPaymentsUpdateIn);
        return executeCurrentAccountFulfillmentArrangementPaymentsUpdateOut.getResponse200();
    }
}
