package com.account_db2_api.openlegacy.services.controllers;

import com.account_db2_api.openlegacy.services.GetAccountService;
import com.account_db2_api.openlegacy.services.GetAccountService.*;

import com.account_db2_sdk.openlegacy.Gactsql;
import com.account_db2_sdk.openlegacy.Gactsql.ResultSet;
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
@RequestMapping(path = "/api/getaccount", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "GetAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class GetAccountController {

    @Autowired
    private GetAccountService getAccountService;

    @PostMapping
    @Operation(summary = "GetAccount GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = GetAccountOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public GetAccountOut getGetAccount(@RequestBody GetAccountIn getAccountIn) throws Exception {
        return getAccountService.getGetAccount(getAccountIn);
    }
}
