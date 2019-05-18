package com.lgmn.basicservices;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@NacosPropertySource(dataId = "basic-servicesProvider", autoRefreshed = true)
public class BasicServicesProviderApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(BasicServicesProviderApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
