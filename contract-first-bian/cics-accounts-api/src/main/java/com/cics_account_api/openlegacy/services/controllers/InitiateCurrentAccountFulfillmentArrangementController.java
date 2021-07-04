package com.cics_account_api.openlegacy.services.controllers;

import com.cics_account_api.openlegacy.services.InitiateCurrentAccountFulfillmentArrangementService;
import com.cics_account_api.openlegacy.services.InitiateCurrentAccountFulfillmentArrangementService.*;

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
import org.springframework.web.bind.annotation.PostMapping;
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
import com.cics_account_api.openlegacy.Response201;
import java.lang.String;

@RestController
@RequestMapping(path = "/api/sd-current-account/current-accountv2/current-account")
@Tag(name = "initiate")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class InitiateCurrentAccountFulfillmentArrangementController {

    @Autowired
    private InitiateCurrentAccountFulfillmentArrangementService initiateCurrentAccountFulfillmentArrangementService;
    
    @PostMapping(path = "/{sd-reference-id}/current-account-fulfillment-arrangement/initiation", consumes = {"*/*"}, produces = {"application/json"})
    @Operation(summary = "Details of a new CurrentAccountFulfillmentArrangement instance", description =  "Initiate A new Current Account", tags = { "initiate" }, operationId = "initiateCurrentAccountFulfillmentArrangement", 
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Successful initiation of new CurrentAccountFulfillmentArrangement instance", content = @Content(schema = @Schema(implementation = Response201.class)))
    })
    public Response201 initiateCurrentAccountFulfillmentArrangement(@PathVariable(name = "sd-reference-id") @NotNull @Parameter(name = "sd-reference-id", description = "Current Account Servicing Session Reference", required = true) String sdReferenceId,
            @Valid @RequestBody() @Parameter(name = "body", description = "CurrentAccountFulfillmentArrangement Request Payload", required = true) Body body) throws Exception {
        InitiateCurrentAccountFulfillmentArrangementIn initiateCurrentAccountFulfillmentArrangementIn = new InitiateCurrentAccountFulfillmentArrangementIn();
        initiateCurrentAccountFulfillmentArrangementIn.setSdReferenceId(sdReferenceId);
        initiateCurrentAccountFulfillmentArrangementIn.setBody(body);
        InitiateCurrentAccountFulfillmentArrangementOut initiateCurrentAccountFulfillmentArrangementOut = initiateCurrentAccountFulfillmentArrangementService.initiateCurrentAccountFulfillmentArrangement(initiateCurrentAccountFulfillmentArrangementIn);
        return initiateCurrentAccountFulfillmentArrangementOut.getResponse201();
    }
}
