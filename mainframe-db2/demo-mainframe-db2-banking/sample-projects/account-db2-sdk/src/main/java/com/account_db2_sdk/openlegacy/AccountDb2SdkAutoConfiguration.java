package com.account_db2_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.account_db2_sdk.openlegacy.config.AccountDb2SdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {AccountDb2SdkConfiguration.class})
public class AccountDb2SdkAutoConfiguration {
}
