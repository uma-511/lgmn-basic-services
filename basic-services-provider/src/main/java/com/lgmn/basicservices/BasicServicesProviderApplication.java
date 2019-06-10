package com.lgmn.basicservices;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@NacosPropertySource(dataId = "basic-servicesProvider", autoRefreshed = true)
@EnableJpaAuditing
public class BasicServicesProviderApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(BasicServicesProviderApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
