package com.mainframe_mq_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.mainframe_mq_sdk.openlegacy.config.MainframeMqSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {MainframeMqSdkConfiguration.class})
public class MainframeMqSdkAutoConfiguration {
}
