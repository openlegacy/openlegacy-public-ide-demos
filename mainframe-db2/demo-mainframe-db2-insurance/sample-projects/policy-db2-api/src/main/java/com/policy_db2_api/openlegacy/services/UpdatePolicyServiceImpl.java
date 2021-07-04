package com.policy_db2_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.policy_db2_sdk.openlegacy.Upolsql;
import java.math.BigDecimal;
import org.openlegacy.core.rpc.RpcSession;
import org.openlegacy.core.rpc.actions.RpcActions;

import org.openlegacy.core.annotations.services.*;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import org.openlegacy.impl.services.ws.ServiceBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationContext;
import org.openlegacy.utils.ActionUtil;

/**
 *  A service implementation which invokes OpenLegacy API, and returns a service output.
 *  The code below should be customize to perform a working scenario which goes through the relevant screens.
 *  Can be tested by invoking the test UpdatePolicyServiceTest.
 *  The interface UpdatePolicyService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "UpdatePolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class UpdatePolicyServiceImpl implements UpdatePolicyService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getUpdatePolicy", entities = {
            @EntityMapping(alias="upolsql", entity=com.policy_db2_sdk.openlegacy.Upolsql.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "upolsql.policyNum", expression = "policyNum"),
            @BindTo(endpoint = "upolsql.custName", expression = "custName"),
            @BindTo(endpoint = "upolsql.custAddr", expression = "custAddr"),
            @BindTo(endpoint = "upolsql.custCity", expression = "custCity"),
            @BindTo(endpoint = "upolsql.custState", expression = "custState"),
            @BindTo(endpoint = "upolsql.custZip", expression = "custZip"),
            @BindTo(endpoint = "upolsql.custPhone", expression = "custPhone"),
            @BindTo(endpoint = "upolsql.birthDate", expression = "birthDate"),
            @BindTo(endpoint = "upolsql.createDate", expression = "createDate"),
            @BindTo(endpoint = "upolsql.endDate", expression = "endDate"),
            @BindTo(endpoint = "upolsql.policyType", expression = "policyType"),
            @BindTo(endpoint = "upolsql.monthlyPymt", expression = "monthlyPymt"),
            @BindTo(endpoint = "upolsql.quarterlyPymt", expression = "quarterlyPymt"),
            @BindTo(endpoint = "upolsql.yearlyPymt", expression = "yearlyPymt"),
            @BindTo(endpoint = "upolsql.isactive", expression = "isactive")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "policyNum", expression = "upolsql.policyNum"),
            @BindFrom(endpoint = "custName", expression = "upolsql.custName"),
            @BindFrom(endpoint = "custAddr", expression = "upolsql.custAddr"),
            @BindFrom(endpoint = "custCity", expression = "upolsql.custCity"),
            @BindFrom(endpoint = "custState", expression = "upolsql.custState"),
            @BindFrom(endpoint = "custZip", expression = "upolsql.custZip"),
            @BindFrom(endpoint = "custPhone", expression = "upolsql.custPhone"),
            @BindFrom(endpoint = "birthDate", expression = "upolsql.birthDate"),
            @BindFrom(endpoint = "createDate", expression = "upolsql.createDate"),
            @BindFrom(endpoint = "endDate", expression = "upolsql.endDate"),
            @BindFrom(endpoint = "policyType", expression = "upolsql.policyType"),
            @BindFrom(endpoint = "monthlyPymt", expression = "upolsql.monthlyPymt"),
            @BindFrom(endpoint = "quarterlyPymt", expression = "upolsql.quarterlyPymt"),
            @BindFrom(endpoint = "yearlyPymt", expression = "upolsql.yearlyPymt"),
            @BindFrom(endpoint = "isactive", expression = "upolsql.isactive")})
    public UpdatePolicyOut getUpdatePolicy(UpdatePolicyIn updatePolicyIn) throws Exception {
        UpdatePolicyOut updatePolicyOut = new UpdatePolicyOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession policyDb2SdkSession = applicationContext.getBean("policyDb2SdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Upolsql upolsql = serviceBinder.bindInputs(this, "getUpdatePolicy", "upolsql", new Upolsql(), updatePolicyIn);
            upolsql = policyDb2SdkSession.doAction(ActionUtil.getRpcAction(Upolsql.class), upolsql);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            updatePolicyOut = serviceBinder.bindOutput(this, "getUpdatePolicy", updatePolicyOut, new String[]{"updatePolicyIn", "upolsql"}, updatePolicyIn, upolsql);
            /* autogenerated - output block end */;

            return updatePolicyOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            policyDb2SdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}
