package com.mainframe_mq_sdk.openlegacy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import io.ol.provider.mq.util.DefaultMqHeaderUtils;
import io.ol.provider.mq.util.MqHeaderUtils;

@Configuration
public class MainframeMqSdkConfiguration {

    @Bean
    public MqHeaderUtils mainframeMqSdkHeaderUtil() {
        return new DefaultMqHeaderUtils();
    }

}
