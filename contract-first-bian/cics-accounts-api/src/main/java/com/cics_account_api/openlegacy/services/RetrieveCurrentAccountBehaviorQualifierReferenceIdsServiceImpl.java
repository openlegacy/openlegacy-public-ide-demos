package com.cics_account_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import java.lang.String;

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
 *  The interface RetrieveCurrentAccountBehaviorQualifierReferenceIdsService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "RetrieveCurrentAccountBehaviorQualifierReferenceIds")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class RetrieveCurrentAccountBehaviorQualifierReferenceIdsServiceImpl implements RetrieveCurrentAccountBehaviorQualifierReferenceIdsService {


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "retrieveCurrentAccountBehaviorQualifierReferenceIds")
    @LogServiceUsage
    @BindInputs(endpoints = {})
    @BindOutputs(endpoints = {})
    public RetrieveCurrentAccountBehaviorQualifierReferenceIdsOut retrieveCurrentAccountBehaviorQualifierReferenceIds(RetrieveCurrentAccountBehaviorQualifierReferenceIdsIn retrieveCurrentAccountBehaviorQualifierReferenceIdsIn) throws Exception {
        RetrieveCurrentAccountBehaviorQualifierReferenceIdsOut retrieveCurrentAccountBehaviorQualifierReferenceIdsOut = new RetrieveCurrentAccountBehaviorQualifierReferenceIdsOut();
        /* autogenerated - sessions block start*/
        ;
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            retrieveCurrentAccountBehaviorQualifierReferenceIdsOut = serviceBinder.bindOutput(this, "retrieveCurrentAccountBehaviorQualifierReferenceIds", retrieveCurrentAccountBehaviorQualifierReferenceIdsOut, new String[]{"retrieveCurrentAccountBehaviorQualifierReferenceIdsIn"}, retrieveCurrentAccountBehaviorQualifierReferenceIdsIn);
            /* autogenerated - output block end */;

            return retrieveCurrentAccountBehaviorQualifierReferenceIdsOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            /* autogenerated - disconnect block end */
            ;
        }
    }

}
