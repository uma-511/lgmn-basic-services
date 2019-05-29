package com.lgmn.basicservices.basic.repository;

import com.lgmn.basicservices.basic.dto.LgmnSmsCodeDto;
import com.lgmn.basicservices.basic.entity.LgmnSmsCodeEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnSmsCodeEntityRepository extends LgmnRepository<LgmnSmsCodeEntity, LgmnSmsCodeDto, Integer> {
}