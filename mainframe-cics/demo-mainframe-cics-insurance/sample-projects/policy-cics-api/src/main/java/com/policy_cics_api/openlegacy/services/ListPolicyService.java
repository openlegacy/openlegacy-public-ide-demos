package com.policy_cics_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.policy_cics_sdk.openlegacy.Lpolcs2;
import com.policy_cics_sdk.openlegacy.Lpolcs2InPut;
import com.policy_cics_sdk.openlegacy.Lpolcs2Lpolcs2Input;
import com.policy_cics_sdk.openlegacy.Lpolcs2Lpolcs2Output;
import com.policy_cics_sdk.openlegacy.Lpolcs2OutPut;
import com.policy_cics_sdk.openlegacy.Lpolcs2PolicyArray;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface ListPolicyService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "ListPolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface ListPolicyService {

    public ListPolicyOut getListPolicy(ListPolicyIn listPolicyIn) throws Exception;

    @Getter
    @Setter
    public static class ListPolicyIn {
        
        Lpolcs2Lpolcs2Input lpolcs2Input;

    }
    
    @Schema(name = "ListPolicyOut", description = "")
    @Getter
    @Setter
    public static class ListPolicyOut {
        
        @Schema(description = "Lpolcs2Lpolcs2Output")
        Lpolcs2Lpolcs2Output lpolcs2Output;
    }
}
