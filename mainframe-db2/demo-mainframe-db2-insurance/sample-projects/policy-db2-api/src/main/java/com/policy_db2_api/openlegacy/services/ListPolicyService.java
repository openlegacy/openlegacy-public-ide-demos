package com.policy_db2_api.openlegacy.services;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.policy_db2_sdk.openlegacy.Lpolsql;
import com.policy_db2_sdk.openlegacy.Lpolsql.ResultSet;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface ListPolicyService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "ListPolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface ListPolicyService {

    public ListPolicyOut getListPolicy() throws Exception;

    
    @Schema(name = "ListPolicyOut", description = "")
    @Getter
    @Setter
    public static class ListPolicyOut {
        
        @Schema(description = "Result Set")
        List<ResultSet> resultSet;
    }
}
