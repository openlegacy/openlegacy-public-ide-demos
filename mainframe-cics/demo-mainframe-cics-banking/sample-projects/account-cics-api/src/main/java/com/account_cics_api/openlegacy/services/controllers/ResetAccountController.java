package com.account_cics_api.openlegacy.services.controllers;

import com.account_cics_api.openlegacy.services.ResetAccountService;
import com.account_cics_api.openlegacy.services.ResetAccountService.*;

import com.account_cics_sdk.openlegacy.Ractcs9;
import com.account_cics_sdk.openlegacy.Ractcs9AccountArray;
import com.account_cics_sdk.openlegacy.Ractcs9ActiDetails;
import com.account_cics_sdk.openlegacy.Ractcs9Dfhcommarea;
import com.account_cics_sdk.openlegacy.Ractcs9InPut;
import com.account_cics_sdk.openlegacy.Ractcs9OutPut;
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
@RequestMapping(path = "/api/resetaccount", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "ResetAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class ResetAccountController {

    @Autowired
    private ResetAccountService resetAccountService;

    @PostMapping
    @Operation(summary = "ResetAccount GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ResetAccountOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public ResetAccountOut getResetAccount(@RequestBody ResetAccountIn resetAccountIn) throws Exception {
        return resetAccountService.getResetAccount(resetAccountIn);
    }
}
