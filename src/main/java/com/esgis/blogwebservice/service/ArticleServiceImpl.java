package com.esgis.blogwebservice.service;

import com.esgis.blogwebservice.dao.ArticleDao;
import com.esgis.blogwebservice.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleDao articleDao;

    @Override
    public Article getArticleById(int id) {
        return articleDao.getById(id);
    }
}
