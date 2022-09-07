package com.as400_5250_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.as400_5250_sdk.openlegacy.DisplayJobRunAttributes;
import org.openlegacy.core.terminal.TerminalSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface DisplayJobAttributesService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "DisplayJobAttributes")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface DisplayJobAttributesService {

    public DisplayJobAttributesOut getDisplayJobAttributes() throws Exception;

    
    @Schema(name = "DisplayJobAttributesOut", description = "")
    @Getter
    @Setter
    public static class DisplayJobAttributesOut {
        
        @Schema(description = "Display Job Run Attributes")
        DisplayJobRunAttributes displayJobRunAttributes;
    }
}
