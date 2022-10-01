package com.esgis.blogwebservice.dao;

import com.esgis.blogwebservice.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleDao extends JpaRepository<Article, Integer> {
}
