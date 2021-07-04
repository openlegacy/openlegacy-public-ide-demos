package com.policy_cics_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.policy_cics_sdk.openlegacy.config.PolicyCicsSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {PolicyCicsSdkConfiguration.class})
public class PolicyCicsSdkAutoConfiguration {
}
