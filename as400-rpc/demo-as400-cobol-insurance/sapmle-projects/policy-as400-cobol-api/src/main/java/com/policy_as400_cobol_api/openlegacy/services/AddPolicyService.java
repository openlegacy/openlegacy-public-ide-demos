package com.policy_as400_cobol_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.policy_as400_cobol_sdk.openlegacy.POL2ADD;
import com.policy_as400_cobol_sdk.openlegacy.POL2ADDPol2addInput;
import com.policy_as400_cobol_sdk.openlegacy.POL2ADDPol2addOutput;
import com.policy_as400_cobol_sdk.openlegacy.POL2ADDPolicyRecOut;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface AddPolicyService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "AddPolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface AddPolicyService {

    public AddPolicyOut getAddPolicy(AddPolicyIn addPolicyIn) throws Exception;

    @Getter
    @Setter
    public static class AddPolicyIn {
        
        POL2ADDPol2addInput pol2addInput;

    }
    
    @Schema(name = "AddPolicyOut", description = "")
    @Getter
    @Setter
    public static class AddPolicyOut {
        
        @Schema(description = "POL2ADDPol2add Output")
        POL2ADDPol2addOutput pol2addOutput;
    }
}
