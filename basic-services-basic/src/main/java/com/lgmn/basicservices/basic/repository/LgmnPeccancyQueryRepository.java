package com.lgmn.basicservices.basic.repository;

import com.lgmn.basicservices.basic.dto.LgmnPeccancyQueryDto;
import com.lgmn.basicservices.basic.entity.LgmnPeccancyQueryEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnPeccancyQueryRepository extends LgmnRepository<LgmnPeccancyQueryEntity, LgmnPeccancyQueryDto, Integer> {
}