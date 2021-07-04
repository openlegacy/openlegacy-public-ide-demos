package com.account_ims_api.openlegacy.services.controllers;

import com.account_ims_api.openlegacy.services.GetAllAccountsService;
import com.account_ims_api.openlegacy.services.GetAllAccountsService.*;

import com.account_ims_sdk.openlegacy.Lactim8;
import com.account_ims_sdk.openlegacy.Lactim8AccountArray;
import com.account_ims_sdk.openlegacy.Lactim8ActoDetails;
import com.account_ims_sdk.openlegacy.Lactim8Lactim8Input;
import com.account_ims_sdk.openlegacy.Lactim8Lactim8Output;
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
@RequestMapping(path = "/api/getallaccounts", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "GetAllAccounts")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class GetAllAccountsController {

    @Autowired
    private GetAllAccountsService getAllAccountsService;

    @PostMapping
    @Operation(summary = "GetAllAccounts GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = GetAllAccountsOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public GetAllAccountsOut getGetAllAccounts(@RequestBody GetAllAccountsIn getAllAccountsIn) throws Exception {
        return getAllAccountsService.getGetAllAccounts(getAllAccountsIn);
    }
}
