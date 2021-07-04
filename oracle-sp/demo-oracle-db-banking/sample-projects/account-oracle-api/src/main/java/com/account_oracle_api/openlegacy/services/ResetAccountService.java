package com.account_oracle_api.openlegacy.services;

import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;
import com.account_oracle_sdk.openlegacy.ResetCustomerBankAccounts;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code.
 *  The interface ReetAccountService can be customized to enabling passing parameters to the service.
 */
@Service(name = "ResetAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface ResetAccountService {

    public ReetAccountOut getReetAccount() throws Exception;

    @Schema(name = "ReetAccountOut", description = "")
    @Getter
    @Setter
    public static class ReetAccountOut {

        @Schema(description = "Reset Customer Bank Accounts")
        ResetCustomerBankAccounts resetCustomerBankAccounts;
    }
}
