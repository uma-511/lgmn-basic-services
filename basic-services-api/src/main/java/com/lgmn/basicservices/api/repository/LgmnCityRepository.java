package com.lgmn.basicservices.api.repository;

import com.lgmn.basicservices.api.dto.LgmnCityDto;
import com.lgmn.basicservices.api.entity.LgmnCityEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnCityRepository extends LgmnRepository<LgmnCityEntity, LgmnCityDto, Integer> {
}