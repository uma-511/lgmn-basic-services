package com.lgmn.basicservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.basicservices.api.dto.LgmnCityDto;
import com.lgmn.basicservices.api.entity.LgmnCityEntity;
import com.lgmn.basicservices.api.repository.LgmnCityRepository;
import com.lgmn.basicservices.api.service.LgmnCityService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnCityServiceImpl extends LgmnAbstractService<LgmnCityEntity, LgmnCityDto, Integer, LgmnCityRepository> implements LgmnCityService {

    @Autowired
    private LgmnCityRepository lgmnCityRepository;

    public LgmnCityServiceImpl(LgmnCityRepository repository) {
        super(repository);
    }
}