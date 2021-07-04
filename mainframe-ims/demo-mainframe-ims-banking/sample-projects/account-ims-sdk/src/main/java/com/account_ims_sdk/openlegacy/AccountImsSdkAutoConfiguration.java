package com.account_ims_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.account_ims_sdk.openlegacy.config.AccountImsSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {AccountImsSdkConfiguration.class})
public class AccountImsSdkAutoConfiguration {
}
