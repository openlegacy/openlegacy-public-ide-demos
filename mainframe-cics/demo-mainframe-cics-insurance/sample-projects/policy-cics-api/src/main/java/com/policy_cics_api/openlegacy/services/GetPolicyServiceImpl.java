package com.policy_cics_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.policy_cics_sdk.openlegacy.Gpolcs2;
import com.policy_cics_sdk.openlegacy.Gpolcs2Gpolcs2Input;
import com.policy_cics_sdk.openlegacy.Gpolcs2Gpolcs2Output;
import com.policy_cics_sdk.openlegacy.Gpolcs2InPut;
import com.policy_cics_sdk.openlegacy.Gpolcs2OutPut;
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
 *  Can be tested by invoking the test GetPolicyServiceTest.
 *  The interface GetPolicyService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "GetPolicy")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class GetPolicyServiceImpl implements GetPolicyService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getGetPolicy", entities = {
            @EntityMapping(alias="gpolcs2", entity=com.policy_cics_sdk.openlegacy.Gpolcs2.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "gpolcs2.gpolcs2Input", expression = "gpolcs2Input")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "gpolcs2Output", expression = "gpolcs2.gpolcs2Output")})
    public GetPolicyOut getGetPolicy(GetPolicyIn getPolicyIn) throws Exception {
        GetPolicyOut getPolicyOut = new GetPolicyOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession policyCicsSdkSession = applicationContext.getBean("policyCicsSdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Gpolcs2 gpolcs2 = serviceBinder.bindInputs(this, "getGetPolicy", "gpolcs2", new Gpolcs2(), getPolicyIn);
            gpolcs2 = policyCicsSdkSession.doAction(ActionUtil.getRpcAction(Gpolcs2.class), gpolcs2);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            getPolicyOut = serviceBinder.bindOutput(this, "getGetPolicy", getPolicyOut, new String[]{"getPolicyIn", "gpolcs2"}, getPolicyIn, gpolcs2);
            /* autogenerated - output block end */;

            return getPolicyOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            policyCicsSdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}