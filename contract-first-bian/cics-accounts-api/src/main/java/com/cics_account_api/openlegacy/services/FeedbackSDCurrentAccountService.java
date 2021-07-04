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

import com.cics_account_api.openlegacy.Body;
import com.cics_account_api.openlegacy.Response200;
import java.lang.String;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface FeedbackSDCurrentAccountService can be customized to enabling passing parameters to the service.
 */

@Service(name = "FeedbackSDCurrentAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface FeedbackSDCurrentAccountService {

    public FeedbackSDCurrentAccountOut feedbackSDCurrentAccount(FeedbackSDCurrentAccountIn feedbackSDCurrentAccountIn) throws Exception;

    @Getter
    @Setter
    public static class FeedbackSDCurrentAccountIn {

        @ServiceField(location = RestLocation.PATH, description = "SDCurrentAccount Servicing Session Reference")
        @NotNull
        String sdReferenceId;

        @ServiceField(location = RestLocation.BODY, description = "SDCurrentAccount Feedback Request Payload")
        @Valid
        Body body;
    }

    @Schema(name = "FeedbackSDCurrentAccountOut", description = "")
    @Getter
    @Setter
    public static class FeedbackSDCurrentAccountOut {

        @Schema(description = "response200")
        @ServiceField(restOutput = true, description = "Successful Service Feedback")
        Response200 response200;
    }

}
