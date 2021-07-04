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
 *  The interface ExecuteCurrentAccountFulfillmentArrangementAccountSweepUpdateService can be customized to enabling passing parameters to the service.
 */

@Service(name = "ExecuteCurrentAccountFulfillmentArrangementAccountSweepUpdate")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface ExecuteCurrentAccountFulfillmentArrangementAccountSweepUpdateService {

    public ExecuteCurrentAccountFulfillmentArrangementAccountSweepUpdateOut executeCurrentAccountFulfillmentArrangementAccountSweepUpdate(ExecuteCurrentAccountFulfillmentArrangementAccountSweepUpdateIn executeCurrentAccountFulfillmentArrangementAccountSweepUpdateIn) throws Exception;

    @Getter
    @Setter
    public static class ExecuteCurrentAccountFulfillmentArrangementAccountSweepUpdateIn {

        @ServiceField(location = RestLocation.PATH, description = "Current Account Servicing Session Reference")
        @NotNull
        String sdReferenceId;

        @ServiceField(location = RestLocation.PATH, description = "Current Account Fulfillment Arrangement Instance Reference")
        @NotNull
        String crReferenceId;

        @ServiceField(location = RestLocation.PATH, description = "AccountSweep Instance Reference")
        @NotNull
        String bqReferenceId;

        @ServiceField(location = RestLocation.BODY, description = "AccountSweep request payload")
        @Valid
        Body body;
    }

    @Schema(name = "ExecuteCurrentAccountFulfillmentArrangementAccountSweepUpdateOut", description = "")
    @Getter
    @Setter
    public static class ExecuteCurrentAccountFulfillmentArrangementAccountSweepUpdateOut {

        @Schema(description = "response200")
        @ServiceField(restOutput = true, description = "Successful execution of AccountSweep Instance Record")
        Response200 response200;
    }

}
