package com.policy_db2_api.openlegacy.services.controllers;

import com.policy_db2_api.openlegacy.services.ListPolicyService;
import com.policy_db2_api.openlegacy.services.ListPolicyService.*;

import com.policy_db2_sdk.openlegacy.Lpolsql;
import com.policy_db2_sdk.openlegacy.Lpolsql.ResultSet;
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
@RequestMapping(path = "/api/listpolicy", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "ListPolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class ListPolicyController {

    @Autowired
    private ListPolicyService listPolicyService;

    @GetMapping
    @Operation(summary = "ListPolicy GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ListPolicyOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public ListPolicyOut getListPolicy() throws Exception {
        return listPolicyService.getListPolicy();
    }
}
