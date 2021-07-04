package com.mainframe_ctg_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.mainframe_ctg_sdk.openlegacy.config.MainframeCtgSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {MainframeCtgSdkConfiguration.class})
public class MainframeCtgSdkAutoConfiguration {
}
