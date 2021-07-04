package com.policy_as400_cobol_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.policy_as400_cobol_sdk.openlegacy.config.PolicyAs400CobolSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {PolicyAs400CobolSdkConfiguration.class})
public class PolicyAs400CobolSdkAutoConfiguration {
}
