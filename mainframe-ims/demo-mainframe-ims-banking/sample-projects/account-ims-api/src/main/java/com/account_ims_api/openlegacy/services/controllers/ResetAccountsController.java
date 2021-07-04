package com.account_ims_api.openlegacy.services.controllers;

import com.account_ims_api.openlegacy.services.ResetAccountsService;
import com.account_ims_api.openlegacy.services.ResetAccountsService.*;

import com.account_ims_sdk.openlegacy.Ractim8;
import com.account_ims_sdk.openlegacy.Ractim8AccountArray;
import com.account_ims_sdk.openlegacy.Ractim8ActiDetails;
import com.account_ims_sdk.openlegacy.Ractim8Ractim8Input;
import com.account_ims_sdk.openlegacy.Ractim8Ractim8Output;
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
@RequestMapping(path = "/api/resetaccounts", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "ResetAccounts")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class ResetAccountsController {

    @Autowired
    private ResetAccountsService resetAccountsService;

    @PostMapping
    @Operation(summary = "ResetAccounts GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ResetAccountsOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public ResetAccountsOut getResetAccounts(@RequestBody ResetAccountsIn resetAccountsIn) throws Exception {
        return resetAccountsService.getResetAccounts(resetAccountsIn);
    }
}
