package com.sg.model.admin.dtos;

import lombok.Data;

/**
 * 封装查询的字段
 *
 * @author: bruceelee
 * @createDate: 2021/1/30 11:20 下午
 */
@Data
public class CommonWhereDto {
    private String filed;
    private String type = "eq";
    private String value;
}
