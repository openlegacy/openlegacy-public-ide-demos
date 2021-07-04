package com.account_cics_api.openlegacy.services.controllers;

import com.account_cics_api.openlegacy.services.DeleteAccountService;
import com.account_cics_api.openlegacy.services.DeleteAccountService.*;

import com.account_cics_sdk.openlegacy.Dactcs9;
import com.account_cics_sdk.openlegacy.Dactcs9AccountDetails;
import com.account_cics_sdk.openlegacy.Dactcs9Dactcs9Input;
import com.account_cics_sdk.openlegacy.Dactcs9Dactcs9Output;
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
@RequestMapping(path = "/api/deleteaccount", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "DeleteAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class DeleteAccountController {

    @Autowired
    private DeleteAccountService deleteAccountService;

    @PostMapping
    @Operation(summary = "DeleteAccount GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = DeleteAccountOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public DeleteAccountOut getDeleteAccount(@RequestBody DeleteAccountIn deleteAccountIn) throws Exception {
        return deleteAccountService.getDeleteAccount(deleteAccountIn);
    }
}
