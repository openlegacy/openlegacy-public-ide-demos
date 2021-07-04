package com.account_ims_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.account_ims_sdk.openlegacy.Gactim8;
import com.account_ims_sdk.openlegacy.Gactim8AccountOut;
import com.account_ims_sdk.openlegacy.Gactim8Gactim8Input;
import com.account_ims_sdk.openlegacy.Gactim8Gactim8Output;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface GetAccountService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "GetAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface GetAccountService {

    public GetAccountOut getGetAccount(GetAccountIn getAccountIn) throws Exception;

    @Getter
    @Setter
    public static class GetAccountIn {
        
        Gactim8Gactim8Input gactim8Input;

    }
    
    @Schema(name = "GetAccountOut", description = "")
    @Getter
    @Setter
    public static class GetAccountOut {
        
        @Schema(description = "Gactim8Gactim8Output")
        Gactim8Gactim8Output gactim8Output;
    }
}
