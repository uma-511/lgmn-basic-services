package com.lgmn.basicservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class LgmnAreaDto extends LgmnDto {
    	@Condition
    private Integer id;
    	@Condition
    private Integer pid;
    	@Condition
    private String name;

}