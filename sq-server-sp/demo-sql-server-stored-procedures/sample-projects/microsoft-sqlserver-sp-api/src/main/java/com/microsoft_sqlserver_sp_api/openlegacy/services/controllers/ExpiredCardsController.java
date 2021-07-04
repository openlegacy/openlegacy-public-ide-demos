package com.microsoft_sqlserver_sp_api.openlegacy.services.controllers;

import com.microsoft_sqlserver_sp_api.openlegacy.services.ExpiredCardsService;
import com.microsoft_sqlserver_sp_api.openlegacy.services.ExpiredCardsService.*;

import com.microsoft_sqlserver_sp_sdk.openlegacy.ProcGetAllExpiredCreditcards;
import com.microsoft_sqlserver_sp_sdk.openlegacy.ProcGetAllExpiredCreditcards.ResultSet;
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
@RequestMapping(path = "/api/expiredcards", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "ExpiredCards")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class ExpiredCardsController {

    @Autowired
    private ExpiredCardsService expiredCardsService;

    @GetMapping
    @Operation(summary = "ExpiredCards GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExpiredCardsOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public ExpiredCardsOut getExpiredCards() throws Exception {
        return expiredCardsService.getExpiredCards();
    }
}
