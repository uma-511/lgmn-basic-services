package com.lgmn.basicservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.basicservices.basic.dto.LgmnAreaDto;
import com.lgmn.basicservices.basic.entity.LgmnAreaEntity;
import com.lgmn.basicservices.basic.repository.LgmnAreaRepository;
import com.lgmn.basicservices.basic.service.LgmnAreaService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnAreaServiceImpl extends LgmnAbstractService<LgmnAreaEntity, LgmnAreaDto, Integer, LgmnAreaRepository> implements LgmnAreaService {

    @Autowired
    private LgmnAreaRepository lgmnAreaRepository;

    public LgmnAreaServiceImpl(LgmnAreaRepository repository) {
        super(repository);
    }
}