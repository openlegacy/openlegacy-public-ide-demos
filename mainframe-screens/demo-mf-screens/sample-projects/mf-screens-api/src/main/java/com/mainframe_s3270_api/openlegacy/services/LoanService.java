package com.mainframe_s3270_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.mf_screens_sdk.openlegacy.Loaninq1;
import com.mf_screens_sdk.openlegacy.Loaninq2;
import org.openlegacy.core.terminal.TerminalSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface LoanService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "Loan")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface LoanService {

    public LoanOut getLoan(LoanIn loanIn) throws Exception;

    @Getter
    @Setter
    public static class LoanIn {
        
        String loanNumber;

    }
    
    @Schema(name = "LoanOut", description = "")
    @Getter
    @Setter
    public static class LoanOut {
        
        @Schema(description = "Loaninq2")
        Loaninq2 loaninq2;
    }
}
