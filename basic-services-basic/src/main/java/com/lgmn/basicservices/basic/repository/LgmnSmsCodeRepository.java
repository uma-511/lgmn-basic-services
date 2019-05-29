package com.lgmn.basicservices.api.repository;

import java.util.Date;
import com.lgmn.basicservices.api.dto.LgmnSmsCodeDto;
import com.lgmn.basicservices.api.entity.LgmnSmsCodeEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnSmsCodeRepository extends LgmnRepository<LgmnSmsCodeEntity, LgmnSmsCodeDto, Integer> {
}