package com.sg.model.admin.dtos;

import com.sg.model.admin.enums.CommonTableEnum;
import lombok.Data;

import java.util.List;

/**
 *公共数据
 *
 * @author: bruceelee
 * @createDate: 2021/1/30 11:15 下午
 */
@Data
public class CommonDto {
    private Integer size;
    private Integer page;
    /**
     * 操作模式add添加， edit编辑
     */
    private String model;
    /**
     * 操作的对象
     */
    private CommonTableEnum name;
    /**
     * 查询的条件
     */
    private List<CommonWhereDto> where;
    /**
     * 修改的字段
     */
    private List<CommonWhereDto> sets;
}
