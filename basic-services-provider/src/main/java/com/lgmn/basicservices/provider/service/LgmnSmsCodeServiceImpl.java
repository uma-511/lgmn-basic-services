package com.lgmn.basicservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.basicservices.basic.dto.LgmnSmsCodeDto;
import com.lgmn.basicservices.basic.entity.LgmnSmsCodeEntity;
import com.lgmn.basicservices.basic.repository.LgmnSmsCodeRepository;
import com.lgmn.basicservices.basic.service.LgmnSmsCodeService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnSmsCodeServiceImpl extends LgmnAbstractService<LgmnSmsCodeEntity, LgmnSmsCodeDto, Integer, LgmnSmsCodeRepository> implements LgmnSmsCodeService {

    @Autowired
    private LgmnSmsCodeRepository lgmnSmsCodeRepository;

    public LgmnSmsCodeServiceImpl(LgmnSmsCodeRepository repository) {
        super(repository);
    }
}