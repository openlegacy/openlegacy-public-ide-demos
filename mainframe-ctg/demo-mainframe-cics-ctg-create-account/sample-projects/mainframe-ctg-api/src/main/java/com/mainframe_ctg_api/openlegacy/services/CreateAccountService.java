package com.mainframe_ctg_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.mainframe_ctg_sdk.openlegacy.Opnact31;
import com.mainframe_ctg_sdk.openlegacy.Opnact31AccountDetails;
import com.mainframe_ctg_sdk.openlegacy.Opnact31AccountOut;
import com.mainframe_ctg_sdk.openlegacy.Opnact31CrtAccountIn;
import com.mainframe_ctg_sdk.openlegacy.Opnact31Dfhcommarea;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface CreateAccountService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "CreateAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface CreateAccountService {

    public CreateAccountOut getCreateAccount(CreateAccountIn createAccountIn) throws Exception;

    @Getter
    @Setter
    public static class CreateAccountIn {
        
        Opnact31Dfhcommarea dfhcommarea;

    }
    
    @Schema(name = "CreateAccountOut", description = "")
    @Getter
    @Setter
    public static class CreateAccountOut {
        
        @Schema(description = "Opnact31Dfhcommarea")
        Opnact31Dfhcommarea dfhcommarea;
    }
}
