package com.lgmn.basicservices.basic.repository;

import com.lgmn.basicservices.basic.dto.LgmnProvinceDto;
import com.lgmn.basicservices.basic.entity.LgmnProvinceEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnProvinceRepository extends LgmnRepository<LgmnProvinceEntity, LgmnProvinceDto, Integer> {
}