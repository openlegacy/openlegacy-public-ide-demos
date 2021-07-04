package com.policy_cics_api.openlegacy.services.controllers;

import com.policy_cics_api.openlegacy.services.ResetPolicyService;
import com.policy_cics_api.openlegacy.services.ResetPolicyService.*;

import com.policy_cics_sdk.openlegacy.Rpolcs2;
import com.policy_cics_sdk.openlegacy.Rpolcs2InPut;
import com.policy_cics_sdk.openlegacy.Rpolcs2OutPut;
import com.policy_cics_sdk.openlegacy.Rpolcs2PolicyArray;
import com.policy_cics_sdk.openlegacy.Rpolcs2PolicyDetails;
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
@RequestMapping(path = "/api/resetpolicy", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "ResetPolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class ResetPolicyController {

    @Autowired
    private ResetPolicyService resetPolicyService;

    @PostMapping
    @Operation(summary = "ResetPolicy GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ResetPolicyOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public ResetPolicyOut getResetPolicy(@RequestBody ResetPolicyIn resetPolicyIn) throws Exception {
        return resetPolicyService.getResetPolicy(resetPolicyIn);
    }
}
