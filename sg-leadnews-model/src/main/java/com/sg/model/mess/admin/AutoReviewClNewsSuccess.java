package com.sg.model.mess.admin;


import com.sg.model.article.pojos.ApArticleConfig;
import com.sg.model.article.pojos.ApArticleContent;
import com.sg.model.article.pojos.ApAuthor;
import lombok.Data;

@Data
public class AutoReviewClNewsSuccess {
    private ApArticleConfig apArticleConfig;
    private ApArticleContent apArticleContent;
    private ApAuthor apAuthor;

}
