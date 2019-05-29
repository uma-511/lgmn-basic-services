package com.lgmn.basicservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class LgmnSettingDto extends LgmnDto {
    	@Condition
    private Integer id;
    //设置编码	@Condition
    private String code;
    //设置名称	@Condition
    private String name;
    //设置值	@Condition
    private String value;
    //设置描述	@Condition
    private String description;

}