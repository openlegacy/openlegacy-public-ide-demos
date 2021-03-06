package com.account_ims_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.account_ims_sdk.openlegacy.Lactim8;
import com.account_ims_sdk.openlegacy.Lactim8AccountArray;
import com.account_ims_sdk.openlegacy.Lactim8ActoDetails;
import com.account_ims_sdk.openlegacy.Lactim8Lactim8Input;
import com.account_ims_sdk.openlegacy.Lactim8Lactim8Output;
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
 *  The interface GetAllAccountsService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "GetAllAccounts")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class GetAllAccountsServiceImpl implements GetAllAccountsService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getGetAllAccounts", entities = {
            @EntityMapping(alias="lactim8", entity=com.account_ims_sdk.openlegacy.Lactim8.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "lactim8.lactim8Input", expression = "lactim8Input")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "lactim8Output", expression = "lactim8.lactim8Output")})
    public GetAllAccountsOut getGetAllAccounts(GetAllAccountsIn getAllAccountsIn) throws Exception {
        GetAllAccountsOut getAllAccountsOut = new GetAllAccountsOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession accountImsSdkSession = applicationContext.getBean("accountImsSdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Lactim8 lactim8 = serviceBinder.bindInputs(this, "getGetAllAccounts", "lactim8", new Lactim8(), getAllAccountsIn);
            lactim8 = accountImsSdkSession.doAction(ActionUtil.getRpcAction(Lactim8.class), lactim8);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            getAllAccountsOut = serviceBinder.bindOutput(this, "getGetAllAccounts", getAllAccountsOut, new String[]{"getAllAccountsIn", "lactim8"}, getAllAccountsIn, lactim8);
            /* autogenerated - output block end */;

            return getAllAccountsOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            accountImsSdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}
