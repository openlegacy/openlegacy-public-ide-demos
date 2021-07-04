package com.account_oracle_api.openlegacy.services.controllers;

import com.account_oracle_api.openlegacy.services.ResetAccountService;
import com.account_oracle_api.openlegacy.services.ResetAccountService.*;
import com.account_oracle_sdk.openlegacy.ResetCustomerBankAccounts;
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
import io.swagger.v3.oas.annotations.media.ArraySchema;

@RestController
@RequestMapping(path = "/api/resetaccount", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "ResetAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class ResetAccountController {

    @Autowired
    private ResetAccountService resetAccountService;

    @GetMapping
    @Operation(summary = "ReetAccount GET operation", responses = { @ApiResponse(content = @Content(schema = @Schema(implementation = ReetAccountOut.class))) }, security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public ReetAccountOut getReetAccount() throws Exception {
        ReetAccountOut reetAccountOut = resetAccountService.getReetAccount();
        return reetAccountOut;
    }
}
