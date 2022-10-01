package com.esgis.blogwebservice.endPoints;

import com.esgis.blogwebservice.entity.Article;
import com.esgis.blogwebservice.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
//import test.com.esgis.blogwebservice.model.Article;
import test.com.esgis.blogwebservice.model.GetArticleRequest;
import test.com.esgis.blogwebservice.model.GetArticleResponse;

@Endpoint
public class ArticleEndPoint {

    @Autowired
    ArticleService articleService;

    public GetArticleResponse getArticle(@RequestPayload GetArticleRequest request){
        GetArticleResponse response = new GetArticleResponse();
        Article art = articleService.getArticleById(request.getId());
        test.com.esgis.blogwebservice.model.Article article = new test.com.esgis.blogwebservice.model.Article();
        article.setTitre(art.getTitre());
        //article.setCommentaires((Article.Commentaires) art.getCommentaires());
        article.setId(art.getId());
        article.setTitre(art.getTitre());
        System.out.println("aaa");
        response.setArticle(article);

        return response;
    }
}
