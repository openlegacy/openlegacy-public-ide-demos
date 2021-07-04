package com.cics_accounts_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.cics_accounts_sdk.openlegacy.config.CicsAccountsSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {CicsAccountsSdkConfiguration.class})
public class CicsAccountsSdkAutoConfiguration {
}
