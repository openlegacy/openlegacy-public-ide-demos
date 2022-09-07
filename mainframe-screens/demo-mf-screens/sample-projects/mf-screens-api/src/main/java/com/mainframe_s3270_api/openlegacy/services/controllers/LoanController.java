package com.mainframe_s3270_api.openlegacy.services.controllers;

import com.mainframe_s3270_api.openlegacy.services.LoanService;
import com.mainframe_s3270_api.openlegacy.services.LoanService.*;

import com.mf_screens_sdk.openlegacy.Loaninq1;
import com.mf_screens_sdk.openlegacy.Loaninq2;
import org.openlegacy.core.terminal.TerminalSession;

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
@RequestMapping(path = "/api/loan", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Loan")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping
    @Operation(summary = "Loan GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = LoanOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public LoanOut getLoan(@RequestBody LoanIn loanIn) throws Exception {
        return loanService.getLoan(loanIn);
    }
}
