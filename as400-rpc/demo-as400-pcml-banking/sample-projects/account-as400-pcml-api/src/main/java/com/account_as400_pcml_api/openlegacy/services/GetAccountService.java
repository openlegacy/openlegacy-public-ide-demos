package com.account_as400_pcml_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.account_as400_pcml_sdk.openlegacy.Gactcs6X;
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
        
        String input;
        
        String account;
        
        String custid;
        
        String custname;
        
        String iban;
        
        String bankid;
        
        Integer brnchid;
        
        String cntrycd;
        
        String typcd;
        
        String subtypcd;
        
        String typename;
        
        String typedesc;
        
        Double balance;
        
        String currency;
        
        Integer crtdt;
        
        Integer updtdt;
        
        String locked;

    }
    
    @Schema(name = "GetAccountOut", description = "")
    @Getter
    @Setter
    public static class GetAccountOut {
        
        @Schema(description = "Input")
        String input;
        
        @Schema(description = "Account")
        String account;
        
        @Schema(description = "Custid")
        String custid;
        
        @Schema(description = "Custname")
        String custname;
        
        @Schema(description = "Iban")
        String iban;
        
        @Schema(description = "Bankid")
        String bankid;
        
        @Schema(description = "Brnchid")
        Integer brnchid;
        
        @Schema(description = "Cntrycd")
        String cntrycd;
        
        @Schema(description = "Typcd")
        String typcd;
        
        @Schema(description = "Subtypcd")
        String subtypcd;
        
        @Schema(description = "Typename")
        String typename;
        
        @Schema(description = "Typedesc")
        String typedesc;
        
        @Schema(description = "Balance")
        Double balance;
        
        @Schema(description = "Currency")
        String currency;
        
        @Schema(description = "Crtdt")
        Integer crtdt;
        
        @Schema(description = "Updtdt")
        Integer updtdt;
        
        @Schema(description = "Locked")
        String locked;
    }
}
