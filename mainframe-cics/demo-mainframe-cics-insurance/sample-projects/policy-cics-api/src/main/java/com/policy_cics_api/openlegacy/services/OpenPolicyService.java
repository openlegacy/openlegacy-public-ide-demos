package com.policy_cics_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.policy_cics_sdk.openlegacy.Opolcs2;
import com.policy_cics_sdk.openlegacy.Opolcs2InPut;
import com.policy_cics_sdk.openlegacy.Opolcs2Opolcs2Input;
import com.policy_cics_sdk.openlegacy.Opolcs2Opolcs2Output;
import com.policy_cics_sdk.openlegacy.Opolcs2OutPut;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface OpenPolicyService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "OpenPolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface OpenPolicyService {

    public OpenPolicyOut getOpenPolicy(OpenPolicyIn openPolicyIn) throws Exception;

    @Getter
    @Setter
    public static class OpenPolicyIn {
        
        Opolcs2Opolcs2Input opolcs2Input;

    }
    
    @Schema(name = "OpenPolicyOut", description = "")
    @Getter
    @Setter
    public static class OpenPolicyOut {
        
        @Schema(description = "Opolcs2Opolcs2Output")
        Opolcs2Opolcs2Output opolcs2Output;
    }
}
