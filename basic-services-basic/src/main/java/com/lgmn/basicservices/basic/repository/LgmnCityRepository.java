package com.lgmn.basicservices.basic.repository;

import com.lgmn.basicservices.basic.dto.LgmnCityDto;
import com.lgmn.basicservices.basic.entity.LgmnCityEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnCityRepository extends LgmnRepository<LgmnCityEntity, LgmnCityDto, Integer> {
}