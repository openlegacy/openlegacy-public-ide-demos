package com.cics_account_api.openlegacy.services;

import java.util.List;
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
import java.lang.String;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code.
 *  The interface RetrieveCurrentAccountReferenceIdsService can be customized to enabling passing parameters to the service.
 */
@Service(name = "RetrieveCurrentAccountReferenceIds")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface RetrieveCurrentAccountReferenceIdsService {

    public RetrieveCurrentAccountReferenceIdsOut retrieveCurrentAccountReferenceIds(RetrieveCurrentAccountReferenceIdsIn retrieveCurrentAccountReferenceIdsIn) throws Exception;

    @Getter
    @Setter
    public static class RetrieveCurrentAccountReferenceIdsIn {

        @ServiceField(location = RestLocation.QUERY, description = "Filter to refine the result set. ex- CurrentAccount Instance Status='active'", optional = true)
        String collectionFilter;

        @ServiceField(location = RestLocation.PATH, description = "Current Account Fulfillment Arrangement Instance Reference")
        @JsonIgnore
        @Schema(description = "Current Account Fulfillment Arrangement Instance Reference")
        private String crReferenceId;
    }

    @Schema(name = "RetrieveCurrentAccountReferenceIdsOut", description = "")
    @Getter
    @Setter
    public static class RetrieveCurrentAccountReferenceIdsOut {

        @Schema(description = "response200")
        @ServiceField(restOutput = true, description = "Successful")
        List<String> response200;
    }
}
