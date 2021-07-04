package com.account_ims_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.account_ims_sdk.openlegacy.Lactim8;
import com.account_ims_sdk.openlegacy.Lactim8AccountArray;
import com.account_ims_sdk.openlegacy.Lactim8ActoDetails;
import com.account_ims_sdk.openlegacy.Lactim8Lactim8Input;
import com.account_ims_sdk.openlegacy.Lactim8Lactim8Output;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface GetAllAccountsService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "GetAllAccounts")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface GetAllAccountsService {

    public GetAllAccountsOut getGetAllAccounts(GetAllAccountsIn getAllAccountsIn) throws Exception;

    @Getter
    @Setter
    public static class GetAllAccountsIn {
        
        Lactim8Lactim8Input lactim8Input;

    }
    
    @Schema(name = "GetAllAccountsOut", description = "")
    @Getter
    @Setter
    public static class GetAllAccountsOut {
        
        @Schema(description = "Lactim8Lactim8Output")
        Lactim8Lactim8Output lactim8Output;
    }
}
