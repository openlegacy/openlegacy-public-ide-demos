package com.mf_screens_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.mf_screens_sdk.openlegacy.config.MfScreensSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {MfScreensSdkConfiguration.class})
public class MfScreensSdkAutoConfiguration {
}
