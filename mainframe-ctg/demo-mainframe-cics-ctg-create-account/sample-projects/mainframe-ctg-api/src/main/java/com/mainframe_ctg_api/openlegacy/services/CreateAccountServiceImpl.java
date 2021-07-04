package com.mainframe_ctg_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.mainframe_ctg_sdk.openlegacy.Opnact31;
import com.mainframe_ctg_sdk.openlegacy.Opnact31AccountDetails;
import com.mainframe_ctg_sdk.openlegacy.Opnact31AccountOut;
import com.mainframe_ctg_sdk.openlegacy.Opnact31CrtAccountIn;
import com.mainframe_ctg_sdk.openlegacy.Opnact31Dfhcommarea;
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
 *  Can be tested by invoking the test CreateAccountServiceTest.
 *  The interface CreateAccountService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "CreateAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class CreateAccountServiceImpl implements CreateAccountService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getCreateAccount", entities = {
            @EntityMapping(alias="opnact31", entity=com.mainframe_ctg_sdk.openlegacy.Opnact31.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "opnact31.dfhcommarea", expression = "dfhcommarea")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "dfhcommarea", expression = "opnact31.dfhcommarea")})
    public CreateAccountOut getCreateAccount(CreateAccountIn createAccountIn) throws Exception {
        CreateAccountOut createAccountOut = new CreateAccountOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession mainframeCtgSdkSession = applicationContext.getBean("mainframeCtgSdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Opnact31 opnact31 = serviceBinder.bindInputs(this, "getCreateAccount", "opnact31", new Opnact31(), createAccountIn);
            opnact31 = mainframeCtgSdkSession.doAction(ActionUtil.getRpcAction(Opnact31.class), opnact31);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            createAccountOut = serviceBinder.bindOutput(this, "getCreateAccount", createAccountOut, new String[]{"createAccountIn", "opnact31"}, createAccountIn, opnact31);
            /* autogenerated - output block end */;

            return createAccountOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            mainframeCtgSdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}
