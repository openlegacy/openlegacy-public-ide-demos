package com.microsoft_sqlserver_sp_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.microsoft_sqlserver_sp_sdk.openlegacy.config.MicrosoftSqlserverSpSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {MicrosoftSqlserverSpSdkConfiguration.class})
public class MicrosoftSqlserverSpSdkAutoConfiguration {
}
