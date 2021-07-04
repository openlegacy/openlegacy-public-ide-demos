package com.account_cics_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.account_cics_sdk.openlegacy.Lactcs9;
import com.account_cics_sdk.openlegacy.Lactcs9AccountArray;
import com.account_cics_sdk.openlegacy.Lactcs9ActoDetails;
import com.account_cics_sdk.openlegacy.Lactcs9Lactcs9Input;
import com.account_cics_sdk.openlegacy.Lactcs9Lactcs9Output;
import com.account_cics_sdk.openlegacy.Lactcs9OutPut;
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
        
        @Schema(description = "Lactcs9Lactcs9Output")
        Lactcs9Lactcs9Output lactcs9Output;
    }
}
