package com.example.easypay.framework;

import com.example.easypay.core.client.PayClientFactory;
import com.example.easypay.core.client.impl.PayClientFactoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PayAutoConfig {

    @Bean
    public PayClientFactory PayClientFactory(){
        return new PayClientFactoryImpl();
    }
}
