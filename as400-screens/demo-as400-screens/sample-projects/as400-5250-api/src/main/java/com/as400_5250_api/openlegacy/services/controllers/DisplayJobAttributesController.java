package com.as400_5250_api.openlegacy.services.controllers;

import com.as400_5250_api.openlegacy.services.DisplayJobAttributesService;
import com.as400_5250_api.openlegacy.services.DisplayJobAttributesService.*;

import com.as400_5250_sdk.openlegacy.DisplayJobRunAttributes;
import org.openlegacy.core.terminal.TerminalSession;

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
@RequestMapping(path = "/api/displayjobattributes", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "DisplayJobAttributes")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class DisplayJobAttributesController {

    @Autowired
    private DisplayJobAttributesService displayJobAttributesService;

    @GetMapping
    @Operation(summary = "DisplayJobAttributes GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = DisplayJobAttributesOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public DisplayJobAttributesOut getDisplayJobAttributes() throws Exception {
        return displayJobAttributesService.getDisplayJobAttributes();
    }
}
