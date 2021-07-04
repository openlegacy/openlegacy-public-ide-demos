package com.account_as400_pcml_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.account_as400_pcml_sdk.openlegacy.Uactcs6X;
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
        
        String dsAccount;
        
        String dsCustid;
        
        String dsCustname;
        
        String dsIban;
        
        String dsBankid;
        
        String dsBranchid;
        
        String dsCntrycd;
        
        String dsTypcd;
        
        String dsSubtypcd;
        
        String dsTypename;
        
        String dsTypedesc;
        
        String dsBalance;
        
        String dsCurrency;
        
        String dsCrtdt;
        
        String dsUpdtdt;
        
        String dsLocked;
        
        String output;

    }
    
    @Schema(name = "UpdateAccountOut", description = "")
    @Getter
    @Setter
    public static class UpdateAccountOut {
        
        @Schema(description = "Ds Account")
        String dsAccount;
        
        @Schema(description = "Ds Custid")
        String dsCustid;
        
        @Schema(description = "Ds Custname")
        String dsCustname;
        
        @Schema(description = "Ds Iban")
        String dsIban;
        
        @Schema(description = "Ds Bankid")
        String dsBankid;
        
        @Schema(description = "Ds Branchid")
        String dsBranchid;
        
        @Schema(description = "Ds Cntrycd")
        String dsCntrycd;
        
        @Schema(description = "Ds Typcd")
        String dsTypcd;
        
        @Schema(description = "Ds Subtypcd")
        String dsSubtypcd;
        
        @Schema(description = "Ds Typename")
        String dsTypename;
        
        @Schema(description = "Ds Typedesc")
        String dsTypedesc;
        
        @Schema(description = "Ds Balance")
        String dsBalance;
        
        @Schema(description = "Ds Currency")
        String dsCurrency;
        
        @Schema(description = "Ds Crtdt")
        String dsCrtdt;
        
        @Schema(description = "Ds Updtdt")
        String dsUpdtdt;
        
        @Schema(description = "Ds Locked")
        String dsLocked;
        
        @Schema(description = "Output")
        String output;
    }
}
