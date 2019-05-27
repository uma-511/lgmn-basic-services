package com.lgmn.basicservices.api.repository;

import java.util.Date;
import com.lgmn.basicservices.api.dto.LgmnPeccancyQueryDto;
import com.lgmn.basicservices.api.entity.LgmnPeccancyQueryEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnPeccancyQueryRepository extends LgmnRepository<LgmnPeccancyQueryEntity, LgmnPeccancyQueryDto, Integer> {
}