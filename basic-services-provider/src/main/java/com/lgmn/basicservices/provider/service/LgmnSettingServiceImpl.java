package com.lgmn.basicservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.basicservices.basic.dto.LgmnSettingDto;
import com.lgmn.basicservices.basic.entity.LgmnSettingEntity;
import com.lgmn.basicservices.basic.repository.LgmnSettingRepository;
import com.lgmn.basicservices.basic.service.LgmnSettingService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnSettingServiceImpl extends LgmnAbstractService<LgmnSettingEntity, LgmnSettingDto, Integer, LgmnSettingRepository> implements LgmnSettingService {

    @Autowired
    private LgmnSettingRepository lgmnSettingRepository;

    public LgmnSettingServiceImpl(LgmnSettingRepository repository) {
        super(repository);
    }
}