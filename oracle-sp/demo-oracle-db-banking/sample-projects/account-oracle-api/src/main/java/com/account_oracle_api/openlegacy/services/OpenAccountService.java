package com.account_oracle_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.account_oracle_sdk.openlegacy.OpenAccount;
import com.account_oracle_sdk.openlegacy.OpenAccount.BankAccountObj;
import java.math.BigDecimal;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface OpenAccountService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "OpenAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface OpenAccountService {

    public OpenAccountOut getOpenAccount(OpenAccountIn openAccountIn) throws Exception;

    @Getter
    @Setter
    public static class OpenAccountIn {
        
        String paccountId;
        
        String pcustomerId;
        
        String pcustomerName;
        
        String piban;
        
        String pcountryCode;
        
        String pbankId;
        
        String pbrnchId;
        
        String ptypcd;
        
        String ptypeName;
        
        String psubTypcd;
        
        String ptypeDescription;
        
        BigDecimal pbalance;
        
        String pcurrency;
        
        String plocked;

    }
    
    @Schema(name = "OpenAccountOut", description = "")
    @Getter
    @Setter
    public static class OpenAccountOut {
        
        @Schema(description = "Bank Account Obj")
        BankAccountObj bankAccountObj;
    }
}
