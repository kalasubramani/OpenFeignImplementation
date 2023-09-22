package com.example.openfeignimplementation.config;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.openfeignimplementation")
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class ProjectConfig {
  
}
