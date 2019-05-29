package com.lgmn.basicservices.basic.repository;

import com.lgmn.basicservices.basic.dto.LgmnAreaDto;
import com.lgmn.basicservices.basic.entity.LgmnAreaEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnAreaRepository extends LgmnRepository<LgmnAreaEntity, LgmnAreaDto, Integer> {
}