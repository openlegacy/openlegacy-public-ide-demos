package com.policy_db2_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.policy_db2_sdk.openlegacy.Gpolsql;
import com.policy_db2_sdk.openlegacy.Gpolsql.ResultSet;
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
        
        String policyNum;

    }
    
    @Schema(name = "GetPolicyOut", description = "")
    @Getter
    @Setter
    public static class GetPolicyOut {
        
        @Schema(description = "Result Set")
        ResultSet resultSet;
    }
}
