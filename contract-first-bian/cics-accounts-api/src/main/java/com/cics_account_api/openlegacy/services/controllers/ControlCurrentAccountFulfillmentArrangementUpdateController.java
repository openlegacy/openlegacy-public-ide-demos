package com.cics_account_api.openlegacy.services.controllers;

import com.cics_account_api.openlegacy.services.ControlCurrentAccountFulfillmentArrangementUpdateService;
import com.cics_account_api.openlegacy.services.ControlCurrentAccountFulfillmentArrangementUpdateService.*;
import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import com.cics_account_api.openlegacy.Body;
import com.cics_account_api.openlegacy.Response200;
import java.lang.String;

@RestController
@RequestMapping(path = "/api/sd-current-account/current-accountv2/current-account")
@Tag(name = "control")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class ControlCurrentAccountFulfillmentArrangementUpdateController {

    @Autowired
    private ControlCurrentAccountFulfillmentArrangementUpdateService controlCurrentAccountFulfillmentArrangementUpdateService;

    @PutMapping(path = "/{sd-reference-id}/current-account-fulfillment-arrangement/{cr-reference-id}/control", consumes = { "*/*" }, produces = { "application/json" })
    @Operation(summary = "Request specific processing (e.g. suspend, skip, terminate)", description = "Control the processing of an active current account (change processing status)", tags = { "control" }, operationId = "controlCurrentAccountFulfillmentArrangementUpdate", security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") }, responses = { @ApiResponse(content = @Content(schema = @Schema(implementation = Response200.class))) })
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successful control of Current Account Fulfillment Arrangement Instance", content = @Content(schema = @Schema(implementation = Response200.class))) })
    public Response200 controlCurrentAccountFulfillmentArrangementUpdate(@RequestBody() @Parameter(description = "Current Account Fulfillment Arrangement Request Payload") Body body) throws Exception {
        ControlCurrentAccountFulfillmentArrangementUpdateIn controlCurrentAccountFulfillmentArrangementUpdateIn = new ControlCurrentAccountFulfillmentArrangementUpdateIn();
        controlCurrentAccountFulfillmentArrangementUpdateIn.setBody(body);
        ControlCurrentAccountFulfillmentArrangementUpdateOut controlCurrentAccountFulfillmentArrangementUpdateOut = controlCurrentAccountFulfillmentArrangementUpdateService.controlCurrentAccountFulfillmentArrangementUpdate(controlCurrentAccountFulfillmentArrangementUpdateIn);
        return controlCurrentAccountFulfillmentArrangementUpdateOut.getResponse200();
    }
}
