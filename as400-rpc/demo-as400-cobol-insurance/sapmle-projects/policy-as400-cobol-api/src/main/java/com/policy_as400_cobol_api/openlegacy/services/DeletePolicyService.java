package com.policy_as400_cobol_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.policy_as400_cobol_sdk.openlegacy.POL2DEL;
import com.policy_as400_cobol_sdk.openlegacy.POL2DELPol2delInput;
import com.policy_as400_cobol_sdk.openlegacy.POL2DELPol2delOutput;
import com.policy_as400_cobol_sdk.openlegacy.POL2DELPolicyRecOut;
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
        
        POL2DELPol2delInput pol2delInput;

    }
    
    @Schema(name = "DeletePolicyOut", description = "")
    @Getter
    @Setter
    public static class DeletePolicyOut {
        
        @Schema(description = "POL2DELPol2del Output")
        POL2DELPol2delOutput pol2delOutput;
    }
}
