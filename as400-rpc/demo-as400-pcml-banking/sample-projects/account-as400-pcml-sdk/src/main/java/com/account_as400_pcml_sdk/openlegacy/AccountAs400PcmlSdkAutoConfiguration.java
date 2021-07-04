package com.account_as400_pcml_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.account_as400_pcml_sdk.openlegacy.config.AccountAs400PcmlSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {AccountAs400PcmlSdkConfiguration.class})
public class AccountAs400PcmlSdkAutoConfiguration {
}
