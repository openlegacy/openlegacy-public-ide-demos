package com.account_cics_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.account_cics_sdk.openlegacy.Oactcs9;
import com.account_cics_sdk.openlegacy.Oactcs9AccountOut;
import com.account_cics_sdk.openlegacy.Oactcs9Dfhcommarea;
import com.account_cics_sdk.openlegacy.Oactcs9InPut;
import com.account_cics_sdk.openlegacy.Oactcs9OutRecord;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface OpenAccountService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "OpenAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface OpenAccountService {

    public OpenAccountOut getOpenAccount(OpenAccountIn openAccountIn) throws Exception;

    @Getter
    @Setter
    public static class OpenAccountIn {
        
        Oactcs9 oactcs9;

    }
    
    @Schema(name = "OpenAccountOut", description = "")
    @Getter
    @Setter
    public static class OpenAccountOut {
        
        @Schema(description = "Oactcs9")
        Oactcs9 oactcs9;
    }
}
