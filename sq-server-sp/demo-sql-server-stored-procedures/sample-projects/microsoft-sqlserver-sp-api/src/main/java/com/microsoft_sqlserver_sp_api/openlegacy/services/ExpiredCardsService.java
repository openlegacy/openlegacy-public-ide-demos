package com.microsoft_sqlserver_sp_api.openlegacy.services;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.microsoft_sqlserver_sp_sdk.openlegacy.ProcGetAllExpiredCreditcards;
import com.microsoft_sqlserver_sp_sdk.openlegacy.ProcGetAllExpiredCreditcards.ResultSet;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface ExpiredCardsService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "ExpiredCards")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface ExpiredCardsService {

    public ExpiredCardsOut getExpiredCards() throws Exception;

    
    @Schema(name = "ExpiredCardsOut", description = "")
    @Getter
    @Setter
    public static class ExpiredCardsOut {
        
        @Schema(description = "Result Set")
        List<ResultSet> resultSet;
    }
}
