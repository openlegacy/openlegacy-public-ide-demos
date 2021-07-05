package com.cics_account_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.cics_account_api.openlegacy.Body;
import com.cics_account_api.openlegacy.Response200;
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
 *  The interface RequestCurrentAccountFulfillmentArrangementIssuedDeviceUpdateService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "RequestCurrentAccountFulfillmentArrangementIssuedDeviceUpdate")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class RequestCurrentAccountFulfillmentArrangementIssuedDeviceUpdateServiceImpl implements RequestCurrentAccountFulfillmentArrangementIssuedDeviceUpdateService {


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "requestCurrentAccountFulfillmentArrangementIssuedDeviceUpdate")
    @LogServiceUsage
    @BindInputs(endpoints = {})
    @BindOutputs(endpoints = {})
    public RequestCurrentAccountFulfillmentArrangementIssuedDeviceUpdateOut requestCurrentAccountFulfillmentArrangementIssuedDeviceUpdate(RequestCurrentAccountFulfillmentArrangementIssuedDeviceUpdateIn requestCurrentAccountFulfillmentArrangementIssuedDeviceUpdateIn) throws Exception {
        RequestCurrentAccountFulfillmentArrangementIssuedDeviceUpdateOut requestCurrentAccountFulfillmentArrangementIssuedDeviceUpdateOut = new RequestCurrentAccountFulfillmentArrangementIssuedDeviceUpdateOut();
        /* autogenerated - sessions block start*/
        ;
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            requestCurrentAccountFulfillmentArrangementIssuedDeviceUpdateOut = serviceBinder.bindOutput(this, "requestCurrentAccountFulfillmentArrangementIssuedDeviceUpdate", requestCurrentAccountFulfillmentArrangementIssuedDeviceUpdateOut, new String[]{"requestCurrentAccountFulfillmentArrangementIssuedDeviceUpdateIn"}, requestCurrentAccountFulfillmentArrangementIssuedDeviceUpdateIn);
            /* autogenerated - output block end */;

            return requestCurrentAccountFulfillmentArrangementIssuedDeviceUpdateOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            /* autogenerated - disconnect block end */
            ;
        }
    }

}