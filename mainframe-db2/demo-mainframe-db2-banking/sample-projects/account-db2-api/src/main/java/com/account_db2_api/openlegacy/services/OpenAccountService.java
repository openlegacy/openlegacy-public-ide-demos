package com.account_db2_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.account_db2_sdk.openlegacy.Oactsql;
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
        
        String accountId;
        
        String customerId;
        
        String customerName;
        
        String iban;
        
        String bnkId;
        
        Integer brnchId;
        
        String cntryCd;
        
        String typcd;
        
        String subTypcd;
        
        String typeName;
        
        String typeDescription;
        
        BigDecimal balance;
        
        String currency;
        
        String crtDt;
        
        String updtDt;
        
        String locked;

    }
    
    @Schema(name = "OpenAccountOut", description = "")
    @Getter
    @Setter
    public static class OpenAccountOut {
        
        @Schema(description = "Account Id")
        String accountId;
        
        @Schema(description = "Customer Id")
        String customerId;
        
        @Schema(description = "Customer Name")
        String customerName;
        
        @Schema(description = "Iban")
        String iban;
        
        @Schema(description = "Bnk Id")
        String bnkId;
        
        @Schema(description = "Brnch Id")
        Integer brnchId;
        
        @Schema(description = "Cntry Cd")
        String cntryCd;
        
        @Schema(description = "Typcd")
        String typcd;
        
        @Schema(description = "Sub Typcd")
        String subTypcd;
        
        @Schema(description = "Type Name")
        String typeName;
        
        @Schema(description = "Type Description")
        String typeDescription;
        
        @Schema(description = "Balance")
        BigDecimal balance;
        
        @Schema(description = "Currency")
        String currency;
        
        @Schema(description = "Crt Dt")
        String crtDt;
        
        @Schema(description = "Updt Dt")
        String updtDt;
        
        @Schema(description = "Locked")
        String locked;
    }
}
