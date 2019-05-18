package com.lgmn.basicservices.provider.config;

import com.lgmn.common.repository.impl.LgmnRepositoryImpl;
import io.seata.spring.annotation.GlobalTransactionScanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {
        "com.lgmn.common.repository",//固定必填
        "com.lgmn.basicservices.api.repository"//指向模块的api.repository包
},
        repositoryBaseClass = LgmnRepositoryImpl.class //自定义实现代替默认jpa实现
)
public class ApplicationConfig {
    /**
     * init global transaction scanner
     *
     * @Return: GlobalTransactionScanner
     */
    @Bean
    public GlobalTransactionScanner globalTransactionScanner(){
        return new GlobalTransactionScanner("basic-services-provider", "my_test_tx_group");
    }
}