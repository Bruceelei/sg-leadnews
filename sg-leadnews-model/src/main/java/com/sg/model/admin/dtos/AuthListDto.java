package com.sg.model.admin.dtos;

import lombok.Data;

/**
 * 认证列表
 *
 * @author: bruceelee
 * @createDate: 2021/1/30 11:12 下午
 */
@Data
public class AuthListDto {
    private Integer size;
    private Integer page;
    //private Map<String, Object> params;
    private Short status;
}
