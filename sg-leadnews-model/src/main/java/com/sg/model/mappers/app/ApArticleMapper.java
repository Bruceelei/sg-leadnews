package com.sg.model.mappers.app;

import com.sg.model.article.dtos.ArticleHomeDto;
import com.sg.model.article.pojos.ApArticle;
import com.sg.model.user.pojos.ApUserArticleList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApArticleMapper {
    List<ApArticle> loadArticleListByLocation(@Param("dto") ArticleHomeDto dto, @Param("type") Short type);

    List<ApArticle> loadArticleListByIdList(List<ApUserArticleList> list);
}
