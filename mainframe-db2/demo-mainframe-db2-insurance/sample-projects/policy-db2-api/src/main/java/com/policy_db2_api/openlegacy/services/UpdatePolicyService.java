package com.policy_db2_api.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.policy_db2_sdk.openlegacy.Upolsql;
import java.math.BigDecimal;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface UpdatePolicyService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "UpdatePolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface UpdatePolicyService {

    public UpdatePolicyOut getUpdatePolicy(UpdatePolicyIn updatePolicyIn) throws Exception;

    @Getter
    @Setter
    public static class UpdatePolicyIn {
        
        String policyNum;
        
        String custName;
        
        String custAddr;
        
        String custCity;
        
        String custState;
        
        String custZip;
        
        String custPhone;
        
        String birthDate;
        
        String createDate;
        
        String endDate;
        
        String policyType;
        
        BigDecimal monthlyPymt;
        
        BigDecimal quarterlyPymt;
        
        BigDecimal yearlyPymt;
        
        String isactive;

    }
    
    @Schema(name = "UpdatePolicyOut", description = "")
    @Getter
    @Setter
    public static class UpdatePolicyOut {
        
        @Schema(description = "Policy Num")
        String policyNum;
        
        @Schema(description = "Cust Name")
        String custName;
        
        @Schema(description = "Cust Addr")
        String custAddr;
        
        @Schema(description = "Cust City")
        String custCity;
        
        @Schema(description = "Cust State")
        String custState;
        
        @Schema(description = "Cust Zip")
        String custZip;
        
        @Schema(description = "Cust Phone")
        String custPhone;
        
        @Schema(description = "Birth Date")
        String birthDate;
        
        @Schema(description = "Create Date")
        String createDate;
        
        @Schema(description = "End Date")
        String endDate;
        
        @Schema(description = "Policy Type")
        String policyType;
        
        @Schema(description = "Monthly Pymt")
        BigDecimal monthlyPymt;
        
        @Schema(description = "Quarterly Pymt")
        BigDecimal quarterlyPymt;
        
        @Schema(description = "Yearly Pymt")
        BigDecimal yearlyPymt;
        
        @Schema(description = "Isactive")
        String isactive;
    }
}
