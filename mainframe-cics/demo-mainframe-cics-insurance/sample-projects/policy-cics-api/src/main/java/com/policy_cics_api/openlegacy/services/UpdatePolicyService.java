package com.policy_cics_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.policy_cics_sdk.openlegacy.Upolcs2;
import com.policy_cics_sdk.openlegacy.Upolcs2InPolicy;
import com.policy_cics_sdk.openlegacy.Upolcs2InPut;
import com.policy_cics_sdk.openlegacy.Upolcs2OutPolicy;
import com.policy_cics_sdk.openlegacy.Upolcs2OutPut;
import com.policy_cics_sdk.openlegacy.Upolcs2Upolcs2Input;
import com.policy_cics_sdk.openlegacy.Upolcs2Upolcs2Output;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface UpdatePolicyService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "UpdatePolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface UpdatePolicyService {

    public UpdatePolicyOut getUpdatePolicy(UpdatePolicyIn updatePolicyIn) throws Exception;

    @Getter
    @Setter
    public static class UpdatePolicyIn {
        
        Upolcs2Upolcs2Input upolcs2Input;

    }
    
    @Schema(name = "UpdatePolicyOut", description = "")
    @Getter
    @Setter
    public static class UpdatePolicyOut {
        
        @Schema(description = "Upolcs2Upolcs2Output")
        Upolcs2Upolcs2Output upolcs2Output;
    }
}
