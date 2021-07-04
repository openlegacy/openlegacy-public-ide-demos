package com.policy_as400_cobol_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.policy_as400_cobol_sdk.openlegacy.POL2UPD;
import com.policy_as400_cobol_sdk.openlegacy.POL2UPDPol2updInput;
import com.policy_as400_cobol_sdk.openlegacy.POL2UPDPol2updOutput;
import com.policy_as400_cobol_sdk.openlegacy.POL2UPDPolicyRecOut;
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
        
        POL2UPDPol2updInput pol2updInput;

    }
    
    @Schema(name = "UpdatePolicyOut", description = "")
    @Getter
    @Setter
    public static class UpdatePolicyOut {
        
        @Schema(description = "POL2UPDPol2upd Output")
        POL2UPDPol2updOutput pol2updOutput;
    }
}
