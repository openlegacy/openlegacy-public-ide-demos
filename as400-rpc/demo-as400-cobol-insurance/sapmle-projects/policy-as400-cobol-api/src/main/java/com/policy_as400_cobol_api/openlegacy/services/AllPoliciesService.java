package com.policy_as400_cobol_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.policy_as400_cobol_sdk.openlegacy.POL2OUTL;
import com.policy_as400_cobol_sdk.openlegacy.PgmPolicyOut;
import com.policy_as400_cobol_sdk.openlegacy.PgmPolicyRecOut;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface AllPoliciesService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "AllPolicies")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface AllPoliciesService {

    public AllPoliciesOut getAllPolicies() throws Exception;

    
    @Schema(name = "AllPoliciesOut", description = "")
    @Getter
    @Setter
    public static class AllPoliciesOut {
        
        @Schema(description = "Pgm Policy Out")
        PgmPolicyOut policyOut;
    }
}
