package com.policy_cics_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.policy_cics_sdk.openlegacy.Gpolcs2;
import com.policy_cics_sdk.openlegacy.Gpolcs2Gpolcs2Input;
import com.policy_cics_sdk.openlegacy.Gpolcs2Gpolcs2Output;
import com.policy_cics_sdk.openlegacy.Gpolcs2InPut;
import com.policy_cics_sdk.openlegacy.Gpolcs2OutPut;
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
        
        Gpolcs2Gpolcs2Input gpolcs2Input;

    }
    
    @Schema(name = "GetPolicyOut", description = "")
    @Getter
    @Setter
    public static class GetPolicyOut {
        
        @Schema(description = "Gpolcs2Gpolcs2Output")
        Gpolcs2Gpolcs2Output gpolcs2Output;
    }
}
