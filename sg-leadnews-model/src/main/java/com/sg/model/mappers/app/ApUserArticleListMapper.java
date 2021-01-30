package com.sg.model.mappers.app;

import com.sg.model.article.dtos.ArticleHomeDto;
import com.sg.model.user.pojos.ApUser;
import com.sg.model.user.pojos.ApUserArticleList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApUserArticleListMapper {
    List<ApUserArticleList> loadArticleIdListByUser(@Param("user") ApUser user,@Param("dto") ArticleHomeDto dto,@Param("type") Short type);
}
