package com.policy_cics_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.policy_cics_sdk.openlegacy.Dpolcs2;
import com.policy_cics_sdk.openlegacy.Dpolcs2Dpolcs2Input;
import com.policy_cics_sdk.openlegacy.Dpolcs2Dpolcs2Output;
import com.policy_cics_sdk.openlegacy.Dpolcs2InPut;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface DeletePolicyService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "DeletePolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface DeletePolicyService {

    public DeletePolicyOut getDeletePolicy(DeletePolicyIn deletePolicyIn) throws Exception;

    @Getter
    @Setter
    public static class DeletePolicyIn {
        
        Dpolcs2Dpolcs2Input dpolcs2Input;

    }
    
    @Schema(name = "DeletePolicyOut", description = "")
    @Getter
    @Setter
    public static class DeletePolicyOut {
        
        @Schema(description = "Dpolcs2Dpolcs2Output")
        Dpolcs2Dpolcs2Output dpolcs2Output;
    }
}
