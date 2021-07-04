package com.policy_db2_api.openlegacy.services.controllers;

import com.policy_db2_api.openlegacy.services.OpenPolicyService;
import com.policy_db2_api.openlegacy.services.OpenPolicyService.*;

import com.policy_db2_sdk.openlegacy.Opolsql;
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
@RequestMapping(path = "/api/openpolicy", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "OpenPolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class OpenPolicyController {

    @Autowired
    private OpenPolicyService openPolicyService;

    @PostMapping
    @Operation(summary = "OpenPolicy GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = OpenPolicyOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public OpenPolicyOut getOpenPolicy(@RequestBody OpenPolicyIn openPolicyIn) throws Exception {
        return openPolicyService.getOpenPolicy(openPolicyIn);
    }
}
