package com.policy_as400_cobol_api.openlegacy.services.controllers;

import com.policy_as400_cobol_api.openlegacy.services.DeletePolicyService;
import com.policy_as400_cobol_api.openlegacy.services.DeletePolicyService.*;

import com.policy_as400_cobol_sdk.openlegacy.POL2DEL;
import com.policy_as400_cobol_sdk.openlegacy.POL2DELPol2delInput;
import com.policy_as400_cobol_sdk.openlegacy.POL2DELPol2delOutput;
import com.policy_as400_cobol_sdk.openlegacy.POL2DELPolicyRecOut;
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
@RequestMapping(path = "/api/deletepolicy", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "DeletePolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class DeletePolicyController {

    @Autowired
    private DeletePolicyService deletePolicyService;

    @PostMapping
    @Operation(summary = "DeletePolicy GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = DeletePolicyOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public DeletePolicyOut getDeletePolicy(@RequestBody DeletePolicyIn deletePolicyIn) throws Exception {
        return deletePolicyService.getDeletePolicy(deletePolicyIn);
    }
}
