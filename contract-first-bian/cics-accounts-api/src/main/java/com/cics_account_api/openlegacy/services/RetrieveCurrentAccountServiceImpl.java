package com.cics_account_api.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.cics_account_api.openlegacy.Response200;
import java.lang.String;
import org.openlegacy.core.annotations.services.*;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import org.openlegacy.impl.services.ws.ServiceBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationContext;
import org.openlegacy.utils.ActionUtil;
import com.cics_account_api.openlegacy.Response200CurrentAccount;
import com.cics_account_api.openlegacy.Response200CurrentAccountFulfillmentArrangementInstanceAnalysisCurrentAccountFulfillmentArrangementInstanceAnalysisReport;
import com.cics_account_api.openlegacy.Response200CurrentAccountFulfillmentArrangementInstanceReportRecordCurrentAccountFulfillmentArrangementInstanceReport;
import com.cics_account_api.openlegacy.Response200CurrentAccountFulfillmentArrangementRetrieveActionTaskRecord;
import com.cics_accounts_sdk.openlegacy.Gactcs9;
import org.openlegacy.core.rpc.RpcSession;
import org.openlegacy.core.rpc.actions.RpcActions;

/**
 *  A service implementation which invokes OpenLegacy API, and returns a service output.
 *  The code below should be customize to perform a working scenario which goes through the relevant screens.
 *  The interface RetrieveCurrentAccountService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "RetrieveCurrentAccount")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class RetrieveCurrentAccountServiceImpl implements RetrieveCurrentAccountService {

    @Autowired
    private ServiceBinder serviceBinder;

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    @ServiceMethod(name = "retrieveCurrentAccount", entities = { @EntityMapping(alias = "response200CurrentAccount", entity = com.cics_account_api.openlegacy.Response200CurrentAccount.class), @EntityMapping(alias = "gactcs9", entity = com.cics_accounts_sdk.openlegacy.Gactcs9.class) })
    @LogServiceUsage
    @BindInputs(endpoints = { @BindTo(endpoint = "gactcs9.inPut.actiAccountId", expression = "crReferenceId") })
    @BindOutputs(endpoints = { @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.currentAccountNumber", expression = "gactcs9.accountOut.accountDetails2.actoAccountId"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.accountCurrency", expression = "gactcs9.accountOut.accountDetails2.actoCurrency"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.customerReference", expression = "gactcs9.accountOut.accountDetails2.actoCustomerName"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.accountType", expression = "gactcs9.accountOut.accountDetails2.actoTypeDescription"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.bankBranchLocationReference", expression = "gactcs9.accountOut.accountDetails2.actoBrnchId", convertValue = "integer-to-string"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.associations.associationReference", expression = "$NONE"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.associations.associationType", expression = "$NONE"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.associations.associationObligationEntitlement", expression = "$NONE"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.positionLimits.positionLimitSettings", expression = "$NA"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.positionLimits.positionLimitType", expression = "$NA"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.positionLimits.positionLimitValue", expression = "$NA"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.dateType.date", expression = "gactcs9.accountOut.accountDetails2.actoUpdtDt"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.linkedAccounts.accountDetails", expression = "$NONE"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.linkedAccounts.linkType", expression = "$NONE"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceReportRecord.currentAccountFulfillmentArrangementInstanceReportType", expression = "$BALANCE"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceReportRecord.currentAccountFulfillmentArrangementInstanceReportData", expression = "gactcs9.accountOut.accountDetails2.actoBalance"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceAnalysis.currentAccountFulfillmentArrangementInstanceAnalysisReportType", expression = "$string"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.taxReference", expression = "$709480"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.restrictionOptionDefinition", expression = "$NA"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.entitlementOptionDefinition", expression = "$NA"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.restrictionOptionSetting", expression = "$NA"), @BindFrom(endpoint = "response200CurrentAccount.currentAccountFulfillmentArrangementRetrieveActionTaskReference", expression = "$Balance BIAN Demo"), @BindFrom(endpoint = "response200CurrentAccount.currentAccountFulfillmentArrangementRetrieveActionResponse", expression = "$Balance BIAN Demo"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.entitlementOptionSetting", expression = "$NA"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceRecord.productInstanceReference", expression = "$NA"), @BindFrom(endpoint = "response200CurrentAccount.response200CurrentAccountFulfillmentArrangementInstanceAnalysis.currentAccountFulfillmentArrangementInstanceAnalysisData", expression = "$NA") })
    public RetrieveCurrentAccountOut retrieveCurrentAccount(RetrieveCurrentAccountIn retrieveCurrentAccountIn) throws Exception {
        RetrieveCurrentAccountOut retrieveCurrentAccountOut = new RetrieveCurrentAccountOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession cicsAccountsSdkSession = applicationContext.getBean("cicsAccountsSdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;
        try {
            /* autogenerated - execution block start */
            ;
            // response200CurrentAccount
            Response200CurrentAccount response200CurrentAccount = serviceBinder.bindInputs(this, "retrieveCurrentAccount", "response200CurrentAccount", new Response200CurrentAccount(), retrieveCurrentAccountIn);
            // gactcs9
            Gactcs9 gactcs9 = serviceBinder.bindInputs(this, "retrieveCurrentAccount", "gactcs9", new Gactcs9(), retrieveCurrentAccountIn);
            gactcs9 = cicsAccountsSdkSession.doAction(ActionUtil.getRpcAction(Gactcs9.class), gactcs9);
            /* autogenerated - execution block end */
            ;
            /* autogenerated - output block start */
            ;
            serviceBinder.bindOutput(this, "retrieveCurrentAccount", retrieveCurrentAccountOut, new String[] { "retrieveCurrentAccountIn", "response200CurrentAccount", "gactcs9" }, retrieveCurrentAccountIn, response200CurrentAccount, gactcs9);
            /* autogenerated - output block end */
            ;
            return retrieveCurrentAccountOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            cicsAccountsSdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }
}
