package com.policy_db2_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.policy_db2_sdk.openlegacy.Rpolsql;
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
        
        Rpolsql rpolsql;

    }
    
    @Schema(name = "ResetAccountOut", description = "")
    @Getter
    @Setter
    public static class ResetAccountOut {
        
        @Schema(description = "Rpolsql")
        Rpolsql rpolsql;
    }
}
