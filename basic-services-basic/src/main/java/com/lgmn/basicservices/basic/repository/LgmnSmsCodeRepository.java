package com.lgmn.basicservices.basic.repository;

import java.util.Date;
import com.lgmn.basicservices.basic.dto.LgmnSmsCodeDto;
import com.lgmn.basicservices.basic.entity.LgmnSmsCodeEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnSmsCodeRepository extends LgmnRepository<LgmnSmsCodeEntity, LgmnSmsCodeDto, Integer> {
}