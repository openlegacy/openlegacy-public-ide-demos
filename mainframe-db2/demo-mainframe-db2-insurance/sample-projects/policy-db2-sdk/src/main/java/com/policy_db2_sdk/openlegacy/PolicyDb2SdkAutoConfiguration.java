package com.policy_db2_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.policy_db2_sdk.openlegacy.config.PolicyDb2SdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {PolicyDb2SdkConfiguration.class})
public class PolicyDb2SdkAutoConfiguration {
}
