package com.cics_account_api.openlegacy.services.controllers;

import com.cics_account_api.openlegacy.services.ExchangeCurrentAccountFulfillmentArrangementAccountLienUpdateService;
import com.cics_account_api.openlegacy.services.ExchangeCurrentAccountFulfillmentArrangementAccountLienUpdateService.*;
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
@Tag(name = "exchange")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class ExchangeCurrentAccountFulfillmentArrangementAccountLienUpdateController {

    @Autowired
    private ExchangeCurrentAccountFulfillmentArrangementAccountLienUpdateService exchangeCurrentAccountFulfillmentArrangementAccountLienUpdateService;

    @PutMapping(path = "/{sd-reference-id}/current-account-fulfillment-arrangement/{cr-reference-id}/accountlien/{bq-reference-id}/exchange", consumes = { "*/*" }, produces = { "application/json" })
    @Operation(summary = "Handle an external exchange (e.g. accept, reject, verify)", description = "Exchange (i.e. confirm, reject) details of an account lien", tags = { "exchange" }, operationId = "exchangeCurrentAccountFulfillmentArrangementAccountLienUpdate", security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") }, responses = { @ApiResponse(content = @Content(schema = @Schema(implementation = Response200.class))) })
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successful exchange of AccountLien Instance Record", content = @Content(schema = @Schema(implementation = Response200.class))) })
    public Response200 exchangeCurrentAccountFulfillmentArrangementAccountLienUpdate(@RequestBody() @Parameter(description = "AccountLien request payload") Body body) throws Exception {
        ExchangeCurrentAccountFulfillmentArrangementAccountLienUpdateIn exchangeCurrentAccountFulfillmentArrangementAccountLienUpdateIn = new ExchangeCurrentAccountFulfillmentArrangementAccountLienUpdateIn();
        exchangeCurrentAccountFulfillmentArrangementAccountLienUpdateIn.setBody(body);
        ExchangeCurrentAccountFulfillmentArrangementAccountLienUpdateOut exchangeCurrentAccountFulfillmentArrangementAccountLienUpdateOut = exchangeCurrentAccountFulfillmentArrangementAccountLienUpdateService.exchangeCurrentAccountFulfillmentArrangementAccountLienUpdate(exchangeCurrentAccountFulfillmentArrangementAccountLienUpdateIn);
        return exchangeCurrentAccountFulfillmentArrangementAccountLienUpdateOut.getResponse200();
    }
}
