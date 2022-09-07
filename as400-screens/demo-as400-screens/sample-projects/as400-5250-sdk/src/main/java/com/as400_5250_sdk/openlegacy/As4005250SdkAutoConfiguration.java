package com.as400_5250_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.as400_5250_sdk.openlegacy.config.As4005250SdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {As4005250SdkConfiguration.class})
public class As4005250SdkAutoConfiguration {
}
