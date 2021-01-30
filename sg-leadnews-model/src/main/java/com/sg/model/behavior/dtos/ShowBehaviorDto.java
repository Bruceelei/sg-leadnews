package com.sg.model.behavior.dtos;


import com.sg.model.annotation.IdEncrypt;
import com.sg.model.article.pojos.ApArticle;
import lombok.Data;

import java.util.List;

@Data
public class ShowBehaviorDto {

    // 设备ID
    @IdEncrypt
    Integer equipmentId;
    List<ApArticle> articleIds;

}
