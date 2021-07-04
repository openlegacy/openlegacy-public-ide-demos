package com.cics_account_api.openlegacy.services.controllers;

import com.cics_account_api.openlegacy.services.RetrieveSDCurrentAccountService;
import com.cics_account_api.openlegacy.services.RetrieveSDCurrentAccountService.*;
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

@RestController
@RequestMapping(path = "/api/sd-current-account/current-accountv2/current-account")
@Tag(name = "retrieve")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class RetrieveSDCurrentAccountController {

    @Autowired
    private RetrieveSDCurrentAccountService retrieveSDCurrentAccountService;

    @GetMapping(path = "/{sd-reference-id}/{sdReferenceId}", produces = { "application/json" })
    @Operation(summary = "Analytical views maintained by the SDCurrentAccount service center for management reporting and analysis purposes", description = "Analytical views maintained by the SDCurrentAccount service center for management reporting and analysis purposes", tags = { "retrieve" }, operationId = "retrieveSDCurrentAccount", security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") }, responses = { @ApiResponse(content = @Content(schema = @Schema(implementation = Response200.class))) })
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successful Service Retrieve", content = @Content(schema = @Schema(implementation = Response200.class))) })
    public Response200 retrieveSDCurrentAccount(@RequestParam(required = false, value = "queryparams") @Parameter(description = "Query params from schema '#/definitions/SDCurrentAccountRetrieveInputModel'") String queryparams, @RequestParam(value = "crReferenceId") String crReferenceId, @PathVariable(value = "sdReferenceId") @Parameter(schema = @Schema(defaultValue = "12345")) String sdReferenceId) throws Exception {
        RetrieveSDCurrentAccountIn retrieveSDCurrentAccountIn = new RetrieveSDCurrentAccountIn();
        retrieveSDCurrentAccountIn.setQueryparams(queryparams);
        retrieveSDCurrentAccountIn.setCrReferenceId(crReferenceId);
        retrieveSDCurrentAccountIn.setSdReferenceId(sdReferenceId);
        RetrieveSDCurrentAccountOut retrieveSDCurrentAccountOut = retrieveSDCurrentAccountService.retrieveSDCurrentAccount(retrieveSDCurrentAccountIn);
        return retrieveSDCurrentAccountOut.getResponse200();
    }
}
