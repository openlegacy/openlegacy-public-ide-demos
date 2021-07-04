package com.cics_account_api.openlegacy.services.controllers;

import com.cics_account_api.openlegacy.services.ExecuteCurrentAccountFulfillmentArrangementAccountSweepUpdateService;
import com.cics_account_api.openlegacy.services.ExecuteCurrentAccountFulfillmentArrangementAccountSweepUpdateService.*;

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
public class ExecuteCurrentAccountFulfillmentArrangementAccountSweepUpdateController {

    @Autowired
    private ExecuteCurrentAccountFulfillmentArrangementAccountSweepUpdateService executeCurrentAccountFulfillmentArrangementAccountSweepUpdateService;
    
    @PutMapping(path = "/{sd-reference-id}/current-account-fulfillment-arrangement/{cr-reference-id}/accountsweep/{bq-reference-id}/execution", consumes = {"*/*"}, produces = {"application/json"})
    @Operation(summary = "Invoke an automated execute action against the AccountSweep instance", description =  "Trigger an account sweep transaction", tags = { "execute" }, operationId = "executeCurrentAccountFulfillmentArrangementAccountSweepUpdate", 
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successful execution of AccountSweep Instance Record", content = @Content(schema = @Schema(implementation = Response200.class)))
    })
    public Response200 executeCurrentAccountFulfillmentArrangementAccountSweepUpdate(@PathVariable(name = "sd-reference-id") @NotNull @Parameter(name = "sd-reference-id", description = "Current Account Servicing Session Reference", required = true) String sdReferenceId,
            @PathVariable(name = "cr-reference-id") @NotNull @Parameter(name = "cr-reference-id", description = "Current Account Fulfillment Arrangement Instance Reference", required = true) String crReferenceId,
            @PathVariable(name = "bq-reference-id") @NotNull @Parameter(name = "bq-reference-id", description = "AccountSweep Instance Reference", required = true) String bqReferenceId,
            @Valid @RequestBody() @Parameter(name = "body", description = "AccountSweep request payload", required = true) Body body) throws Exception {
        ExecuteCurrentAccountFulfillmentArrangementAccountSweepUpdateIn executeCurrentAccountFulfillmentArrangementAccountSweepUpdateIn = new ExecuteCurrentAccountFulfillmentArrangementAccountSweepUpdateIn();
        executeCurrentAccountFulfillmentArrangementAccountSweepUpdateIn.setSdReferenceId(sdReferenceId);
        executeCurrentAccountFulfillmentArrangementAccountSweepUpdateIn.setCrReferenceId(crReferenceId);
        executeCurrentAccountFulfillmentArrangementAccountSweepUpdateIn.setBqReferenceId(bqReferenceId);
        executeCurrentAccountFulfillmentArrangementAccountSweepUpdateIn.setBody(body);
        ExecuteCurrentAccountFulfillmentArrangementAccountSweepUpdateOut executeCurrentAccountFulfillmentArrangementAccountSweepUpdateOut = executeCurrentAccountFulfillmentArrangementAccountSweepUpdateService.executeCurrentAccountFulfillmentArrangementAccountSweepUpdate(executeCurrentAccountFulfillmentArrangementAccountSweepUpdateIn);
        return executeCurrentAccountFulfillmentArrangementAccountSweepUpdateOut.getResponse200();
    }
}
