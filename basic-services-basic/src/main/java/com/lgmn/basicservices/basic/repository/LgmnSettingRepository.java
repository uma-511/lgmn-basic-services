package com.lgmn.basicservices.basic.repository;

import com.lgmn.basicservices.basic.dto.LgmnSettingDto;
import com.lgmn.basicservices.basic.entity.LgmnSettingEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnSettingRepository extends LgmnRepository<LgmnSettingEntity, LgmnSettingDto, Integer> {
}