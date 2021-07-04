package com.policy_as400_cobol_api.openlegacy.services.controllers;

import com.policy_as400_cobol_api.openlegacy.services.AllPoliciesService;
import com.policy_as400_cobol_api.openlegacy.services.AllPoliciesService.*;

import com.policy_as400_cobol_sdk.openlegacy.POL2OUTL;
import com.policy_as400_cobol_sdk.openlegacy.PgmPolicyOut;
import com.policy_as400_cobol_sdk.openlegacy.PgmPolicyRecOut;
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
@RequestMapping(path = "/api/allpolicies", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "AllPolicies")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class AllPoliciesController {

    @Autowired
    private AllPoliciesService allPoliciesService;

    @GetMapping
    @Operation(summary = "AllPolicies GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = AllPoliciesOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public AllPoliciesOut getAllPolicies() throws Exception {
        return allPoliciesService.getAllPolicies();
    }
}
