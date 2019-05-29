package com.lgmn.basicservices.basic.repository;

import com.lgmn.basicservices.basic.dto.LgmnComplaintsDto;
import com.lgmn.basicservices.basic.entity.LgmnComplaintsEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnComplaintsRepository extends LgmnRepository<LgmnComplaintsEntity, LgmnComplaintsDto, Integer> {
}