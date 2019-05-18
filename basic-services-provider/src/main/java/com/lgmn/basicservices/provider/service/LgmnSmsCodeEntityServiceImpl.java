package com.lgmn.basicservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.basicservices.api.dto.LgmnSmsCodeDto;
import com.lgmn.basicservices.api.entity.LgmnSmsCodeEntity;
import com.lgmn.basicservices.api.repository.LgmnSmsCodeEntityRepository;
import com.lgmn.basicservices.api.service.LgmnSmsCodeEntityService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnSmsCodeEntityServiceImpl extends LgmnAbstractService<LgmnSmsCodeEntity, LgmnSmsCodeDto,Integer, LgmnSmsCodeEntityRepository> implements LgmnSmsCodeEntityService {

    @Autowired
    private LgmnSmsCodeEntityRepository lgmnsmscodeentityRepository;

    public LgmnSmsCodeEntityServiceImpl(LgmnSmsCodeEntityRepository repository) {
        super(repository);
    }
}