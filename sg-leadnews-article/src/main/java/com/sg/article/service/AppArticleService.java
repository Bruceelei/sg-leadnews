package com.sg.article.service;

import com.sg.model.article.dtos.ArticleHomeDto;
import com.sg.model.common.dtos.ResponseResult;

public interface AppArticleService {
    /**
     * type  1 加载更多  2 加载更新
     * @param dto
     * @param type
     * @return
     */
    ResponseResult load(ArticleHomeDto dto, Short type);
}
