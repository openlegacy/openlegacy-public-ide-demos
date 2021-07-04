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

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface RetrieveCurrentAccountBehaviorQualifierReferenceIdsService can be customized to enabling passing parameters to the service.
 */

@Service(name = "RetrieveCurrentAccountBehaviorQualifierReferenceIds")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface RetrieveCurrentAccountBehaviorQualifierReferenceIdsService {

    public RetrieveCurrentAccountBehaviorQualifierReferenceIdsOut retrieveCurrentAccountBehaviorQualifierReferenceIds(RetrieveCurrentAccountBehaviorQualifierReferenceIdsIn retrieveCurrentAccountBehaviorQualifierReferenceIdsIn) throws Exception;

    @Getter
    @Setter
    public static class RetrieveCurrentAccountBehaviorQualifierReferenceIdsIn {

        @ServiceField(location = RestLocation.PATH, description = "Current Account Servicing Session Reference")
        @NotNull
        String sdReferenceId;

        @ServiceField(location = RestLocation.PATH, description = "Current Account Fulfillment Arrangement Instance Reference")
        @NotNull
        String crReferenceId;

        @ServiceField(location = RestLocation.PATH, description = "Behavior Qualifier Name. ex- IssuedDevice")
        @NotNull
        String behaviorQualifier;

        @ServiceField(location = RestLocation.QUERY, description = "Filter to refine the result set. ex- IssuedDevice Instance Status = 'pending'", optional = true)
        String collectionFilter;
    }

    @Schema(name = "RetrieveCurrentAccountBehaviorQualifierReferenceIdsOut", description = "")
    @Getter
    @Setter
    public static class RetrieveCurrentAccountBehaviorQualifierReferenceIdsOut {

        @Schema(description = "response200")
        @ServiceField(restOutput = true, description = "Successful")
        List<String> response200;
    }

}
