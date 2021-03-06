package com.policy_as400_cobol_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.policy_as400_cobol_sdk.openlegacy.POL2GET;
import com.policy_as400_cobol_sdk.openlegacy.POL2GETPol2getInput;
import com.policy_as400_cobol_sdk.openlegacy.POL2GETPol2getOutput;
import com.policy_as400_cobol_sdk.openlegacy.POL2GETPolicyRecOut;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface GetPolicyService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "GetPolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface GetPolicyService {

    public GetPolicyOut getGetPolicy(GetPolicyIn getPolicyIn) throws Exception;

    @Getter
    @Setter
    public static class GetPolicyIn {
        
        POL2GETPol2getInput pol2getInput;

    }
    
    @Schema(name = "GetPolicyOut", description = "")
    @Getter
    @Setter
    public static class GetPolicyOut {
        
        @Schema(description = "POL2GETPol2get Output")
        POL2GETPol2getOutput pol2getOutput;
    }
}
