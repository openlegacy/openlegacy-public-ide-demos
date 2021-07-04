package com.account_db2_api.openlegacy.services.controllers;

import com.account_db2_api.openlegacy.services.ListAccountService;
import com.account_db2_api.openlegacy.services.ListAccountService.*;

import com.account_db2_sdk.openlegacy.Lactsql;
import com.account_db2_sdk.openlegacy.Lactsql.ResultSet;
import org.openlegacy.core.rpc.RpcSession;

import org.openlegacy.core.annotations.OpenlegacyDesigntime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping(path = "/api/listaccount", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "ListAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class ListAccountController {

    @Autowired
    private ListAccountService listAccountService;

    @GetMapping
    @Operation(summary = "ListAccount GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ListAccountOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public ListAccountOut getListAccount() throws Exception {
        return listAccountService.getListAccount();
    }
}
