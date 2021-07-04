package com.cics_account_api.openlegacy.services.controllers;

import com.cics_account_api.openlegacy.services.RetrieveCurrentAccountReferenceIdsService;
import com.cics_account_api.openlegacy.services.RetrieveCurrentAccountReferenceIdsService.*;
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
import java.lang.String;
import java.util.List;

@RestController
@RequestMapping(path = "/api/sd-current-account/current-accountv2/current-account")
@Tag(name = "retrieve")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class RetrieveCurrentAccountReferenceIdsController {

    @Autowired
    private RetrieveCurrentAccountReferenceIdsService retrieveCurrentAccountReferenceIdsService;

    @GetMapping(path = "/{sd-reference-id}/current-account-fulfillment-arrangement/{crReferenceId}", produces = { "application/json" })
    @Operation(summary = "Retrieve CR Ids", tags = { "retrieve" }, operationId = "RetrieveCurrentAccountReferenceIds", security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") }, responses = { @ApiResponse(content = @Content(array = @ArraySchema(schema = @Schema(implementation = String.class)))) })
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successful", content = @Content(array = @ArraySchema(schema = @Schema(implementation = String.class)))) })
    public List<String> retrieveCurrentAccountReferenceIds(@RequestParam(required = false, value = "collectionFilter") @Parameter(description = "Filter to refine the result set. ex- CurrentAccount Instance Status='active'") String collectionFilter, @PathVariable(value = "crReferenceId") @Parameter(description = "Current Account Fulfillment Arrangement Instance Reference") String crReferenceId) throws Exception {
        RetrieveCurrentAccountReferenceIdsIn retrieveCurrentAccountReferenceIdsIn = new RetrieveCurrentAccountReferenceIdsIn();
        retrieveCurrentAccountReferenceIdsIn.setCollectionFilter(collectionFilter);
        retrieveCurrentAccountReferenceIdsIn.setCrReferenceId(crReferenceId);
        RetrieveCurrentAccountReferenceIdsOut retrieveCurrentAccountReferenceIdsOut = retrieveCurrentAccountReferenceIdsService.retrieveCurrentAccountReferenceIds(retrieveCurrentAccountReferenceIdsIn);
        return retrieveCurrentAccountReferenceIdsOut.getResponse200();
    }
}
