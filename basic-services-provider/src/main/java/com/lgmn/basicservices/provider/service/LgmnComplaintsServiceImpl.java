package com.lgmn.basicservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.basicservices.basic.dto.LgmnComplaintsDto;
import com.lgmn.basicservices.basic.entity.LgmnComplaintsEntity;
import com.lgmn.basicservices.basic.repository.LgmnComplaintsRepository;
import com.lgmn.basicservices.basic.service.LgmnComplaintsService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnComplaintsServiceImpl extends LgmnAbstractService<LgmnComplaintsEntity, LgmnComplaintsDto, Integer, LgmnComplaintsRepository> implements LgmnComplaintsService {

    @Autowired
    private LgmnComplaintsRepository lgmnComplaintsRepository;

    public LgmnComplaintsServiceImpl(LgmnComplaintsRepository repository) {
        super(repository);
    }
}