package com.policy_as400_cobol_api.openlegacy.services.controllers;

import com.policy_as400_cobol_api.openlegacy.services.AddPolicyService;
import com.policy_as400_cobol_api.openlegacy.services.AddPolicyService.*;

import com.policy_as400_cobol_sdk.openlegacy.POL2ADD;
import com.policy_as400_cobol_sdk.openlegacy.POL2ADDPol2addInput;
import com.policy_as400_cobol_sdk.openlegacy.POL2ADDPol2addOutput;
import com.policy_as400_cobol_sdk.openlegacy.POL2ADDPolicyRecOut;
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
@RequestMapping(path = "/api/addpolicy", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "AddPolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class AddPolicyController {

    @Autowired
    private AddPolicyService addPolicyService;

    @PostMapping
    @Operation(summary = "AddPolicy GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = AddPolicyOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public AddPolicyOut getAddPolicy(@RequestBody AddPolicyIn addPolicyIn) throws Exception {
        return addPolicyService.getAddPolicy(addPolicyIn);
    }
}
