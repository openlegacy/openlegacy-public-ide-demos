package com.account_cics_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.account_cics_sdk.openlegacy.Uactcs9;
import com.account_cics_sdk.openlegacy.Uactcs9Dfhcommarea;
import com.account_cics_sdk.openlegacy.Uactcs9InputRecord;
import com.account_cics_sdk.openlegacy.Uactcs9OutputRecord;
import com.account_cics_sdk.openlegacy.Uactcs9UpdateIn;
import com.account_cics_sdk.openlegacy.Uactcs9UpdateOut;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface UpdateAccountService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "UpdateAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface UpdateAccountService {

    public UpdateAccountOut getUpdateAccount(UpdateAccountIn updateAccountIn) throws Exception;

    @Getter
    @Setter
    public static class UpdateAccountIn {
        
        Uactcs9 uactcs9;

    }
    
    @Schema(name = "UpdateAccountOut", description = "")
    @Getter
    @Setter
    public static class UpdateAccountOut {
        
        @Schema(description = "Uactcs9")
        Uactcs9 uactcs9;
    }
}
