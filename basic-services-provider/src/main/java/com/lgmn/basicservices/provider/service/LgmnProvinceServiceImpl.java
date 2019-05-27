package com.lgmn.basicservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.basicservices.api.dto.LgmnProvinceDto;
import com.lgmn.basicservices.api.entity.LgmnProvinceEntity;
import com.lgmn.basicservices.api.repository.LgmnProvinceRepository;
import com.lgmn.basicservices.api.service.LgmnProvinceService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnProvinceServiceImpl extends LgmnAbstractService<LgmnProvinceEntity, LgmnProvinceDto, Integer, LgmnProvinceRepository> implements LgmnProvinceService {

    @Autowired
    private LgmnProvinceRepository lgmnProvinceRepository;

    public LgmnProvinceServiceImpl(LgmnProvinceRepository repository) {
        super(repository);
    }
}