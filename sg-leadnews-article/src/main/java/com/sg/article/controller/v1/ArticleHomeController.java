package com.sg.article.controller.v1;

import com.sg.article.apis.ArticleHomeControllerApi;
import com.sg.article.service.AppArticleService;
import com.sg.common.article.constans.ArticleConstans;
import com.sg.model.article.dtos.ArticleHomeDto;
import com.sg.model.common.dtos.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/article")
public class ArticleHomeController implements ArticleHomeControllerApi {

    @Autowired
    private AppArticleService appArticleService;

    @Override
    @GetMapping("/load")
    public ResponseResult load(ArticleHomeDto dto) {
        return appArticleService.load(dto, ArticleConstans.LOADTYPE_LOAD_MORE);
    }

    @Override
    @GetMapping("/loadmore")
    public ResponseResult loadMore(ArticleHomeDto dto) {
        return appArticleService.load(dto, ArticleConstans.LOADTYPE_LOAD_MORE);
    }

    @Override
    @GetMapping("/loadnew")
    public ResponseResult loadNew(ArticleHomeDto dto) {
        return appArticleService.load(dto, ArticleConstans.LOADTYPE_LOAD_NEW);
    }
}
