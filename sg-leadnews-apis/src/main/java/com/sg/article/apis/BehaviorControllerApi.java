package com.sg.article.apis;

import com.sg.model.behavior.dtos.ShowBehaviorDto;
import com.sg.model.common.dtos.ResponseResult;

/**
 * 点击文章行为接口
 *
 * @author: bruceelee
 * @createDate: 2021/1/30  10:57 下午
 */
public interface BehaviorControllerApi {

    /**
     * 保存用户点击文章的行为
     * @param dto
     * @return
     */
    ResponseResult saveShowBehavior(ShowBehaviorDto dto);
}
