package com.account_oracle_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.account_oracle_sdk.openlegacy.config.AccountOracleSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {AccountOracleSdkConfiguration.class})
public class AccountOracleSdkAutoConfiguration {
}
