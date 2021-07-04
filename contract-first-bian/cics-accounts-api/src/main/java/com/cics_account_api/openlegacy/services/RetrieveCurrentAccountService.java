package com.cics_account_api.openlegacy.services;

import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.RestLocation;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.services.ServiceField;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import com.cics_account_api.openlegacy.Response200;
import java.lang.String;
import com.cics_account_api.openlegacy.Response200CurrentAccount;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code.
 *  The interface RetrieveCurrentAccountService can be customized to enabling passing parameters to the service.
 */
@Service(name = "RetrieveCurrentAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface RetrieveCurrentAccountService {

    public RetrieveCurrentAccountOut retrieveCurrentAccount(RetrieveCurrentAccountIn retrieveCurrentAccountIn) throws Exception;

    @Getter
    @Setter
    public static class RetrieveCurrentAccountIn {

        @ServiceField(location = RestLocation.QUERY, description = "Query params from schema '#/definitions/CRCurrentAccountFulfillmentArrangementRetrieveInputModel'", optional = true)
        String queryparams;

        @ServiceField(location = RestLocation.PATH, description = "Current Account Servicing Session Reference")
        @JsonIgnore
        @Schema(description = "Current Account Servicing Session Reference")
        private String sdReferenceId;

        @ServiceField(location = RestLocation.PATH)
        @JsonIgnore
        private String crReferenceId;
    }

    @Schema(name = "RetrieveCurrentAccountOut", description = "")
    @Getter
    @Setter
    public static class RetrieveCurrentAccountOut {

        @Schema(description = "response200")
        @ServiceField(restOutput = true, description = "Successfully Retrieved Current Account Fulfillment Arrangement Instance")
        Response200CurrentAccount response200CurrentAccount;
    }
}
