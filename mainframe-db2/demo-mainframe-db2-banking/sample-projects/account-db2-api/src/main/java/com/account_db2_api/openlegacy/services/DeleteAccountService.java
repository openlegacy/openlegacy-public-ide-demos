package com.account_db2_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.account_db2_sdk.openlegacy.Dactsql;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface DeleteAccountService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "DeleteAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface DeleteAccountService {

    public DeleteAccountOut getDeleteAccount(DeleteAccountIn deleteAccountIn) throws Exception;

    @Getter
    @Setter
    public static class DeleteAccountIn {
        
        String accountId;

    }
    
    @Schema(name = "DeleteAccountOut", description = "")
    @Getter
    @Setter
    public static class DeleteAccountOut {
        
        @Schema(description = "Dactsql")
        Dactsql dactsql;
    }
}
