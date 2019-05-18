package com.lgmn.basicservices.api.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import com.lgmn.common.enums.ConditionExcept;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class LgmnSmsCodeDto extends LgmnDto {

    @Condition(except = ConditionExcept.IN)
    private List<Integer> id;

    @Condition
    private String phone;

    @Condition(field = "sendTime", isMax = true, except = ConditionExcept.BETWEEN_AND)
    private Timestamp endSendTime;

    @Condition(field = "sendTime", isMin = true, except = ConditionExcept.BETWEEN_AND)
    private Timestamp beginSendTime;

}
