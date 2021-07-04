package com.account_db2_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.account_db2_sdk.openlegacy.Gactsql;
import com.account_db2_sdk.openlegacy.Gactsql.ResultSet;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface GetAccountService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "GetAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface GetAccountService {

    public GetAccountOut getGetAccount(GetAccountIn getAccountIn) throws Exception;

    @Getter
    @Setter
    public static class GetAccountIn {
        
        String accountId;

    }
    
    @Schema(name = "GetAccountOut", description = "")
    @Getter
    @Setter
    public static class GetAccountOut {
        
        @Schema(description = "Result Set")
        ResultSet resultSet;
    }
}
