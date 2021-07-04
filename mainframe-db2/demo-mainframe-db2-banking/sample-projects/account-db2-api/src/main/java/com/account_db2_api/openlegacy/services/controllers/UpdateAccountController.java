package com.account_db2_api.openlegacy.services.controllers;

import com.account_db2_api.openlegacy.services.UpdateAccountService;
import com.account_db2_api.openlegacy.services.UpdateAccountService.*;

import com.account_db2_sdk.openlegacy.Uactsql;
import java.math.BigDecimal;
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
@RequestMapping(path = "/api/updateaccount", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "UpdateAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class UpdateAccountController {

    @Autowired
    private UpdateAccountService updateAccountService;

    @PostMapping
    @Operation(summary = "UpdateAccount GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = UpdateAccountOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public UpdateAccountOut getUpdateAccount(@RequestBody UpdateAccountIn updateAccountIn) throws Exception {
        return updateAccountService.getUpdateAccount(updateAccountIn);
    }
}
