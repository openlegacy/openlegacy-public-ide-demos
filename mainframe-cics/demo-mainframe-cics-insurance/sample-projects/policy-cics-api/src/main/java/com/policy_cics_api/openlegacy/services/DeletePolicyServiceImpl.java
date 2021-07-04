package com.policy_cics_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.policy_cics_sdk.openlegacy.Dpolcs2;
import com.policy_cics_sdk.openlegacy.Dpolcs2Dpolcs2Input;
import com.policy_cics_sdk.openlegacy.Dpolcs2Dpolcs2Output;
import com.policy_cics_sdk.openlegacy.Dpolcs2InPut;
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
 *  Can be tested by invoking the test DeletePolicyServiceTest.
 *  The interface DeletePolicyService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "DeletePolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class DeletePolicyServiceImpl implements DeletePolicyService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getDeletePolicy", entities = {
            @EntityMapping(alias="dpolcs2", entity=com.policy_cics_sdk.openlegacy.Dpolcs2.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "dpolcs2.dpolcs2Input", expression = "dpolcs2Input")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "dpolcs2Output", expression = "dpolcs2.dpolcs2Output")})
    public DeletePolicyOut getDeletePolicy(DeletePolicyIn deletePolicyIn) throws Exception {
        DeletePolicyOut deletePolicyOut = new DeletePolicyOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession policyCicsSdkSession = applicationContext.getBean("policyCicsSdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Dpolcs2 dpolcs2 = serviceBinder.bindInputs(this, "getDeletePolicy", "dpolcs2", new Dpolcs2(), deletePolicyIn);
            dpolcs2 = policyCicsSdkSession.doAction(ActionUtil.getRpcAction(Dpolcs2.class), dpolcs2);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            deletePolicyOut = serviceBinder.bindOutput(this, "getDeletePolicy", deletePolicyOut, new String[]{"deletePolicyIn", "dpolcs2"}, deletePolicyIn, dpolcs2);
            /* autogenerated - output block end */;

            return deletePolicyOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            policyCicsSdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}
