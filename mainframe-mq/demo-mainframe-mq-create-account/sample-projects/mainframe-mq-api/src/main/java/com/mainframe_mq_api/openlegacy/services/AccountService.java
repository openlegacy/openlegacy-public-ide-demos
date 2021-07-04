package com.mainframe_mq_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.mainframe_mq_sdk.openlegacy.Opnact4;
import com.mainframe_mq_sdk.openlegacy.Opnact4AccountDetails;
import com.mainframe_mq_sdk.openlegacy.Opnact4AccountOut;
import com.mainframe_mq_sdk.openlegacy.Opnact4CrtAccountIn;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface AccountService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "Account")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface AccountService {

    public AccountOut getAccount(AccountIn accountIn) throws Exception;

    @Getter
    @Setter
    public static class AccountIn {
        
        Opnact4CrtAccountIn crtAccountIn;

    }
    
    @Schema(name = "AccountOut", description = "")
    @Getter
    @Setter
    public static class AccountOut {
        
        @Schema(description = "Opnact4Account Out")
        Opnact4AccountOut accountOut;
    }
}
