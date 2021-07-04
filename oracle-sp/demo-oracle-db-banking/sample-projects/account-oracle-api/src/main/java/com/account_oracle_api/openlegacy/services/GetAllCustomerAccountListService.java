package com.account_oracle_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.account_oracle_sdk.openlegacy.GetAllCustomerBankAccounts;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface GetAllCustomerAccountListService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "GetAllCustomerAccountList")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface GetAllCustomerAccountListService {

    public GetAllCustomerAccountListOut getGetAllCustomerAccountList() throws Exception;

    
    @Schema(name = "GetAllCustomerAccountListOut", description = "")
    @Getter
    @Setter
    public static class GetAllCustomerAccountListOut {
        
        @Schema(description = "Get All Customer Bank Accounts")
        GetAllCustomerBankAccounts getAllCustomerBankAccounts;
    }
}
