package com.mainframe_ctg_api.openlegacy.services.controllers;

import com.mainframe_ctg_api.openlegacy.services.CreateAccountService;
import com.mainframe_ctg_api.openlegacy.services.CreateAccountService.*;

import com.mainframe_ctg_sdk.openlegacy.Opnact31;
import com.mainframe_ctg_sdk.openlegacy.Opnact31AccountDetails;
import com.mainframe_ctg_sdk.openlegacy.Opnact31AccountOut;
import com.mainframe_ctg_sdk.openlegacy.Opnact31CrtAccountIn;
import com.mainframe_ctg_sdk.openlegacy.Opnact31Dfhcommarea;
import org.openlegacy.core.rpc.RpcSession;

import org.openlegacy.core.annotations.OpenlegacyDesigntime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping(path = "/api/createaccount", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "CreateAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class CreateAccountController {

    @Autowired
    private CreateAccountService createAccountService;

    @PostMapping
    @Operation(summary = "CreateAccount GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = CreateAccountOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public CreateAccountOut getCreateAccount(@RequestBody CreateAccountIn createAccountIn) throws Exception {
        return createAccountService.getCreateAccount(createAccountIn);
    }
}
