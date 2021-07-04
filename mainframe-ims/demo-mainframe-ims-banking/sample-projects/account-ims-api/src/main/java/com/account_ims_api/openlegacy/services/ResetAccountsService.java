package com.account_ims_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.account_ims_sdk.openlegacy.Ractim8;
import com.account_ims_sdk.openlegacy.Ractim8AccountArray;
import com.account_ims_sdk.openlegacy.Ractim8ActiDetails;
import com.account_ims_sdk.openlegacy.Ractim8Ractim8Input;
import com.account_ims_sdk.openlegacy.Ractim8Ractim8Output;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface ResetAccountsService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "ResetAccounts")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface ResetAccountsService {

    public ResetAccountsOut getResetAccounts(ResetAccountsIn resetAccountsIn) throws Exception;

    @Getter
    @Setter
    public static class ResetAccountsIn {
        
        Ractim8Ractim8Input ractim8Input;

    }
    
    @Schema(name = "ResetAccountsOut", description = "")
    @Getter
    @Setter
    public static class ResetAccountsOut {
        
        @Schema(description = "Ractim8Ractim8Output")
        Ractim8Ractim8Output ractim8Output;
    }
}
