package com.lgmn.basicservices.provider.service;

import java.util.Date;
import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.basicservices.api.dto.LgmnPeccancyQueryDto;
import com.lgmn.basicservices.api.entity.LgmnPeccancyQueryEntity;
import com.lgmn.basicservices.api.repository.LgmnPeccancyQueryRepository;
import com.lgmn.basicservices.api.service.LgmnPeccancyQueryService;
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