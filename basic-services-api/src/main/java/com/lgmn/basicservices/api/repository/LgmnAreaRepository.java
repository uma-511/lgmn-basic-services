package com.lgmn.basicservices.api.repository;

import com.lgmn.basicservices.api.dto.LgmnAreaDto;
import com.lgmn.basicservices.api.entity.LgmnAreaEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnAreaRepository extends LgmnRepository<LgmnAreaEntity, LgmnAreaDto, Integer> {
}