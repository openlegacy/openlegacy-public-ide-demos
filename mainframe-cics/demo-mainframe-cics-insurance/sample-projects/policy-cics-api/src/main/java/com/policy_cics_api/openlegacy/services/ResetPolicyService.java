package com.policy_cics_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.policy_cics_sdk.openlegacy.Rpolcs2;
import com.policy_cics_sdk.openlegacy.Rpolcs2InPut;
import com.policy_cics_sdk.openlegacy.Rpolcs2OutPut;
import com.policy_cics_sdk.openlegacy.Rpolcs2PolicyArray;
import com.policy_cics_sdk.openlegacy.Rpolcs2PolicyDetails;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface ResetPolicyService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "ResetPolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface ResetPolicyService {

    public ResetPolicyOut getResetPolicy(ResetPolicyIn resetPolicyIn) throws Exception;

    @Getter
    @Setter
    public static class ResetPolicyIn {
        
        Rpolcs2 rpolcs2;

    }
    
    @Schema(name = "ResetPolicyOut", description = "")
    @Getter
    @Setter
    public static class ResetPolicyOut {
        
        @Schema(description = "Rpolcs2")
        Rpolcs2 rpolcs2;
    }
}
