package com.lgmn.basicservices.api.repository;

import com.lgmn.basicservices.api.dto.LgmnSettingDto;
import com.lgmn.basicservices.api.entity.LgmnSettingEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnSettingRepository extends LgmnRepository<LgmnSettingEntity, LgmnSettingDto, Integer> {
}