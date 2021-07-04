package com.account_cics_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.account_cics_sdk.openlegacy.config.AccountCicsSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {AccountCicsSdkConfiguration.class})
public class AccountCicsSdkAutoConfiguration {
}
