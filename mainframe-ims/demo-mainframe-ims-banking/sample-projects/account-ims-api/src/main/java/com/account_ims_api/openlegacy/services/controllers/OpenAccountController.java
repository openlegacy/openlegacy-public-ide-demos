package com.account_ims_api.openlegacy.services.controllers;

import com.account_ims_api.openlegacy.services.OpenAccountService;
import com.account_ims_api.openlegacy.services.OpenAccountService.*;

import com.account_ims_sdk.openlegacy.Oactim8;
import com.account_ims_sdk.openlegacy.Oactim8AccountDetails;
import com.account_ims_sdk.openlegacy.Oactim8Oactim8Input;
import com.account_ims_sdk.openlegacy.Oactim8Oactim8Output;
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
@RequestMapping(path = "/api/openaccount", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "OpenAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class OpenAccountController {

    @Autowired
    private OpenAccountService openAccountService;

    @PostMapping
    @Operation(summary = "OpenAccount GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = OpenAccountOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public OpenAccountOut getOpenAccount(@RequestBody OpenAccountIn openAccountIn) throws Exception {
        return openAccountService.getOpenAccount(openAccountIn);
    }
}
