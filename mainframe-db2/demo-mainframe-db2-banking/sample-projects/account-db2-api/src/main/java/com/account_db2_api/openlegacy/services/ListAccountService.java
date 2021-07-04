package com.account_db2_api.openlegacy.services;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.account_db2_sdk.openlegacy.Lactsql;
import com.account_db2_sdk.openlegacy.Lactsql.ResultSet;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface ListAccountService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "ListAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface ListAccountService {

    public ListAccountOut getListAccount() throws Exception;

    
    @Schema(name = "ListAccountOut", description = "")
    @Getter
    @Setter
    public static class ListAccountOut {
        
        @Schema(description = "Result Set")
        List<ResultSet> resultSet;
    }
}
