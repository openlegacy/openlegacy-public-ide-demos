package com.policy_db2_api.openlegacy.services.controllers;

import com.policy_db2_api.openlegacy.services.UpdatePolicyService;
import com.policy_db2_api.openlegacy.services.UpdatePolicyService.*;

import com.policy_db2_sdk.openlegacy.Upolsql;
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
@RequestMapping(path = "/api/updatepolicy", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "UpdatePolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class UpdatePolicyController {

    @Autowired
    private UpdatePolicyService updatePolicyService;

    @PostMapping
    @Operation(summary = "UpdatePolicy GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = UpdatePolicyOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public UpdatePolicyOut getUpdatePolicy(@RequestBody UpdatePolicyIn updatePolicyIn) throws Exception {
        return updatePolicyService.getUpdatePolicy(updatePolicyIn);
    }
}
