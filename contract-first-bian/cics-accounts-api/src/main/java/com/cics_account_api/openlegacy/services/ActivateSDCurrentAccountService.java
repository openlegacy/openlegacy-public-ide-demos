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
import com.cics_account_api.openlegacy.Response201;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code.
 *  The interface ActivateSDCurrentAccountService can be customized to enabling passing parameters to the service.
 */
@Service(name = "ActivateSDCurrentAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface ActivateSDCurrentAccountService {

    public ActivateSDCurrentAccountOut activateSDCurrentAccount(ActivateSDCurrentAccountIn activateSDCurrentAccountIn) throws Exception;

    @Getter
    @Setter
    public static class ActivateSDCurrentAccountIn {

        @ServiceField(location = RestLocation.BODY, description = "SDCurrentAccount Request Payload")
        @Valid
        Body body;
    }

    @Schema(name = "ActivateSDCurrentAccountOut", description = "")
    @Getter
    @Setter
    public static class ActivateSDCurrentAccountOut {

        @Schema(description = "response201")
        @ServiceField(restOutput = true, description = "Successful Service Activation")
        Response201 response201;
    }
}
