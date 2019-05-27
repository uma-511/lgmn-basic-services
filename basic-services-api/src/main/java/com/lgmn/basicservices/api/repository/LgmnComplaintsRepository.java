package com.lgmn.basicservices.api.repository;

import java.util.Date;
import com.lgmn.basicservices.api.dto.LgmnComplaintsDto;
import com.lgmn.basicservices.api.entity.LgmnComplaintsEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnComplaintsRepository extends LgmnRepository<LgmnComplaintsEntity, LgmnComplaintsDto, Integer> {
}