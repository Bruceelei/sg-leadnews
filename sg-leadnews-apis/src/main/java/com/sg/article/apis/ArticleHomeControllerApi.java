package com.sg.article.apis;

import com.sg.model.article.dtos.ArticleHomeDto;
import com.sg.model.common.dtos.ResponseResult;

/**
 * 文章主页对外接口服务
 *
 * @author: bruceelee
 * @createDate: 2021/1/30  10:56 下午
 */
public interface ArticleHomeControllerApi {

    /**
     * 加载首页文章
     * @param dto
     * @return
     */
    public ResponseResult load(ArticleHomeDto dto);

    /**
     * 加载更多
     * @param dot
     * @return
     */
    public ResponseResult loadMore(ArticleHomeDto dot);

    /**
     * 加载最新的文章信息
     * @param dto
     * @return
     */
    public ResponseResult loadNew(ArticleHomeDto dto);
}
