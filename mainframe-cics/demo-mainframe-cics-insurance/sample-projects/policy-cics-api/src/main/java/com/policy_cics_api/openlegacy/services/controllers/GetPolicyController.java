package com.policy_cics_api.openlegacy.services.controllers;

import com.policy_cics_api.openlegacy.services.GetPolicyService;
import com.policy_cics_api.openlegacy.services.GetPolicyService.*;

import com.policy_cics_sdk.openlegacy.Gpolcs2;
import com.policy_cics_sdk.openlegacy.Gpolcs2Gpolcs2Input;
import com.policy_cics_sdk.openlegacy.Gpolcs2Gpolcs2Output;
import com.policy_cics_sdk.openlegacy.Gpolcs2InPut;
import com.policy_cics_sdk.openlegacy.Gpolcs2OutPut;
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
@RequestMapping(path = "/api/getpolicy", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "GetPolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class GetPolicyController {

    @Autowired
    private GetPolicyService getPolicyService;

    @PostMapping
    @Operation(summary = "GetPolicy GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = GetPolicyOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public GetPolicyOut getGetPolicy(@RequestBody GetPolicyIn getPolicyIn) throws Exception {
        return getPolicyService.getGetPolicy(getPolicyIn);
    }
}
