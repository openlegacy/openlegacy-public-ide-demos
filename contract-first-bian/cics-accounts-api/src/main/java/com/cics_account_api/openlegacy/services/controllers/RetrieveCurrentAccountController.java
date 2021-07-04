package com.cics_account_api.openlegacy.services.controllers;

import com.cics_account_api.openlegacy.services.RetrieveCurrentAccountService;
import com.cics_account_api.openlegacy.services.RetrieveCurrentAccountService.*;
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
import org.springframework.web.bind.annotation.GetMapping;
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
import com.cics_account_api.openlegacy.Response200;
import java.lang.String;
import com.cics_account_api.openlegacy.Response200CurrentAccount;

@RestController
@RequestMapping(path = "/api/sd-current-account/current-accountv2/current-account")
@Tag(name = "retrieve")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class RetrieveCurrentAccountController {

    @Autowired
    private RetrieveCurrentAccountService retrieveCurrentAccountService;

    @GetMapping(path = "/{sd-reference-id}/current-account-fulfillment-arrangement/{cr-reference-id}/{sdReferenceId}/{crReferenceId}", produces = { "application/json" })
    @Operation(summary = "Invoke a reporting action to obtain a Current Account Fulfillment Arrangement instance related report", description = "Retrieve information about a current account - either standard canned reports or selected instance attribute values", tags = { "retrieve" }, operationId = "retrieveCurrentAccount", security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") }, responses = { @ApiResponse(content = @Content(schema = @Schema(implementation = Response200CurrentAccount.class))) })
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successfully Retrieved Current Account Fulfillment Arrangement Instance", content = @Content(schema = @Schema(implementation = Response200.class))) })
    public Response200CurrentAccount retrieveCurrentAccount(@RequestParam(required = false, value = "queryparams") @Parameter(description = "Query params from schema '#/definitions/CRCurrentAccountFulfillmentArrangementRetrieveInputModel'") String queryparams, @PathVariable(value = "sdReferenceId") @Parameter(description = "Current Account Servicing Session Reference") String sdReferenceId, @PathVariable(value = "crReferenceId") String crReferenceId) throws Exception {
        RetrieveCurrentAccountIn retrieveCurrentAccountIn = new RetrieveCurrentAccountIn();
        retrieveCurrentAccountIn.setQueryparams(queryparams);
        retrieveCurrentAccountIn.setSdReferenceId(sdReferenceId);
        retrieveCurrentAccountIn.setCrReferenceId(crReferenceId);
        RetrieveCurrentAccountOut retrieveCurrentAccountOut = retrieveCurrentAccountService.retrieveCurrentAccount(retrieveCurrentAccountIn);
        return retrieveCurrentAccountOut.getResponse200CurrentAccount();
    }
}
