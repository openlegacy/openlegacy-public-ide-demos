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
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code.
 *  The interface RetrieveSDCurrentAccountService can be customized to enabling passing parameters to the service.
 */
@Service(name = "RetrieveSDCurrentAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface RetrieveSDCurrentAccountService {

    public RetrieveSDCurrentAccountOut retrieveSDCurrentAccount(RetrieveSDCurrentAccountIn retrieveSDCurrentAccountIn) throws Exception;

    @Getter
    @Setter
    public static class RetrieveSDCurrentAccountIn {

        @ServiceField(location = RestLocation.QUERY, description = "Query params from schema '#/definitions/SDCurrentAccountRetrieveInputModel'", optional = true)
        String queryparams;

        @ServiceField(location = RestLocation.QUERY)
        @JsonIgnore
        private String crReferenceId;

        @ServiceField(location = RestLocation.PATH, defaultValue = "12345")
        @JsonIgnore
        @Schema(defaultValue = "12345")
        private String sdReferenceId = "12345";
    }

    @Schema(name = "RetrieveSDCurrentAccountOut", description = "")
    @Getter
    @Setter
    public static class RetrieveSDCurrentAccountOut {

        @Schema(description = "response200")
        @ServiceField(restOutput = true, description = "Successful Service Retrieve")
        Response200 response200;
    }
}
