package com.cics_account_api.openlegacy.services.controllers;

import com.cics_account_api.openlegacy.services.ActivateSDCurrentAccountService;
import com.cics_account_api.openlegacy.services.ActivateSDCurrentAccountService.*;
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

@RestController
@RequestMapping(path = "/api/sd-current-account/current-accountv2/current-account/activation")
@Tag(name = "activate")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class ActivateSDCurrentAccountController {

    @Autowired
    private ActivateSDCurrentAccountService activateSDCurrentAccountService;

    @PostMapping(consumes = { "*/*" }, produces = { "application/json" })
    @Operation(summary = "Activate  a SDCurrentAccount servicing session", description = "Activate  a  SDCurrentAccount servicing session", tags = { "activate" }, operationId = "activateSDCurrentAccount", security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    @ApiResponses(value = { @ApiResponse(responseCode = "201", description = "Successful Service Activation", content = @Content(schema = @Schema(implementation = Response201.class))) })
    public Response201 activateSDCurrentAccount(@Valid @RequestBody() @Parameter(name = "body", description = "SDCurrentAccount Request Payload", required = true) Body body) throws Exception {
        ActivateSDCurrentAccountIn activateSDCurrentAccountIn = new ActivateSDCurrentAccountIn();
        activateSDCurrentAccountIn.setBody(body);
        ActivateSDCurrentAccountOut activateSDCurrentAccountOut = activateSDCurrentAccountService.activateSDCurrentAccount(activateSDCurrentAccountIn);
        return activateSDCurrentAccountOut.getResponse201();
    }
}
