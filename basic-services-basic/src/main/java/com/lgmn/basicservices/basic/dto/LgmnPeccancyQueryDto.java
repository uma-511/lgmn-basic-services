package com.lgmn.basicservices.basic.dto;

import java.util.Date;
import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class LgmnPeccancyQueryDto extends LgmnDto {
    @Condition
    private Integer id;
    //用户id
    @Condition
    private String uid;
    //查询日期
    @Condition
    private Date queryDate;

}