package com.account_cics_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.account_cics_sdk.openlegacy.Ractcs9;
import com.account_cics_sdk.openlegacy.Ractcs9AccountArray;
import com.account_cics_sdk.openlegacy.Ractcs9ActiDetails;
import com.account_cics_sdk.openlegacy.Ractcs9Dfhcommarea;
import com.account_cics_sdk.openlegacy.Ractcs9InPut;
import com.account_cics_sdk.openlegacy.Ractcs9OutPut;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface ResetAccountService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "ResetAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface ResetAccountService {

    public ResetAccountOut getResetAccount(ResetAccountIn resetAccountIn) throws Exception;

    @Getter
    @Setter
    public static class ResetAccountIn {
        
        Ractcs9 ractcs9;

    }
    
    @Schema(name = "ResetAccountOut", description = "")
    @Getter
    @Setter
    public static class ResetAccountOut {
        
        @Schema(description = "Ractcs9")
        Ractcs9 ractcs9;
    }
}
