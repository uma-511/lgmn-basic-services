package com.lgmn.basicservices.basic.dto;

import java.util.Date;
import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class LgmnComplaintsDto extends LgmnDto {
    	@Condition
    private Integer id;
    //内容	@Condition
    private String context;
    //投诉人	@Condition
    private String uid;
    //处理状态 0：未处理 1：已处理	@Condition
    private Integer status;
    //处理结果	@Condition
    private String result;
    //处理人	@Condition
    private String handler;
    //投诉时间	@Condition
    private Date createTime;
    //处理时间	@Condition
    private Date handleTime;

}