package com.lgmn.basicservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.basicservices.basic.dto.LgmnPeccancyQueryDto;
import com.lgmn.basicservices.basic.entity.LgmnPeccancyQueryEntity;
import com.lgmn.basicservices.basic.repository.LgmnPeccancyQueryRepository;
import com.lgmn.basicservices.basic.service.LgmnPeccancyQueryService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnPeccancyQueryServiceImpl extends LgmnAbstractService<LgmnPeccancyQueryEntity, LgmnPeccancyQueryDto, Integer, LgmnPeccancyQueryRepository> implements LgmnPeccancyQueryService {

    @Autowired
    private LgmnPeccancyQueryRepository lgmnPeccancyQueryRepository;

    public LgmnPeccancyQueryServiceImpl(LgmnPeccancyQueryRepository repository) {
        super(repository);
    }
}