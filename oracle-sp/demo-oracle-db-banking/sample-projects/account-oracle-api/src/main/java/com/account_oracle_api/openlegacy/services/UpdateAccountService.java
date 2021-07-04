package com.account_oracle_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.account_oracle_sdk.openlegacy.UpdateAccount;
import com.account_oracle_sdk.openlegacy.UpdateAccount.BankAccountObj;
import java.math.BigDecimal;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface UpdateAccountService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "UpdateAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface UpdateAccountService {

    public UpdateAccountOut getUpdateAccount(UpdateAccountIn updateAccountIn) throws Exception;

    @Getter
    @Setter
    public static class UpdateAccountIn {
        
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
    
    @Schema(name = "UpdateAccountOut", description = "")
    @Getter
    @Setter
    public static class UpdateAccountOut {
        
        @Schema(description = "Bank Account Obj")
        BankAccountObj bankAccountObj;
    }
}
