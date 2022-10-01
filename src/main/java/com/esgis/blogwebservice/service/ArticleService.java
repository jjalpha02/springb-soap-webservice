package com.esgis.blogwebservice.service;

import com.esgis.blogwebservice.dao.ArticleDao;
import com.esgis.blogwebservice.entity.Article;

public interface ArticleService {

    Article getArticleById(int id);
}
