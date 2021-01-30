package com.sg.article.test;

import com.sg.model.common.dtos.ResponseResult;
import com.sg.model.user.pojos.ApUser;
import com.sg.utils.threadlocal.AppThreadLocalUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 类
 *
 * @author: bruceelee
 * @createDate: 2021/1/30 11:53 下午
 */
@SpringBootTest(classes = com.sg.article.ArticleJarApplication.class)
@RunWith(SpringRunner.class)
public class ArticleTest {

    @Autowired
    private com.sg.article.service.AppArticleService appArticleService;

    @Test
    public void testArticle(){
        ApUser apUser = new ApUser();
        apUser.setId(2104l);
        AppThreadLocalUtils.setUser(apUser);
        ResponseResult result = appArticleService.load(null, com.sg.common.article.constans.ArticleConstans.LOADTYPE_LOAD_MORE);
        System.out.println(result.getData());
    }
}
