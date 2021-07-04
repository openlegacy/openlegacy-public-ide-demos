package com.account_oracle_api.openlegacy.services.controllers;

import com.account_oracle_api.openlegacy.services.GetAllCustomerAccountListService;
import com.account_oracle_api.openlegacy.services.GetAllCustomerAccountListService.*;

import com.account_oracle_sdk.openlegacy.GetAllCustomerBankAccounts;
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
@RequestMapping(path = "/api/getallcustomeraccountlist", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "GetAllCustomerAccountList")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class GetAllCustomerAccountListController {

    @Autowired
    private GetAllCustomerAccountListService getAllCustomerAccountListService;

    @GetMapping
    @Operation(summary = "GetAllCustomerAccountList GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = GetAllCustomerAccountListOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public GetAllCustomerAccountListOut getGetAllCustomerAccountList() throws Exception {
        return getAllCustomerAccountListService.getGetAllCustomerAccountList();
    }
}
