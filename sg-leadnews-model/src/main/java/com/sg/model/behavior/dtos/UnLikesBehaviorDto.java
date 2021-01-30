package com.sg.model.behavior.dtos;

import com.sg.model.annotation.IdEncrypt;
import lombok.Data;

@Data
public class UnLikesBehaviorDto {
    // 设备ID
    @IdEncrypt
    Integer equipmentId;
    // 文章ID
    @IdEncrypt
    Integer articleId;

    /**
     * 不喜欢操作方式
     * 0 不喜欢
     * 1 取消不喜欢
     */
    Short type;

}
