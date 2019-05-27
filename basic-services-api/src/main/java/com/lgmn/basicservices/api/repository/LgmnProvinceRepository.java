package com.lgmn.basicservices.api.repository;

import com.lgmn.basicservices.api.dto.LgmnProvinceDto;
import com.lgmn.basicservices.api.entity.LgmnProvinceEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnProvinceRepository extends LgmnRepository<LgmnProvinceEntity, LgmnProvinceDto, Integer> {
}