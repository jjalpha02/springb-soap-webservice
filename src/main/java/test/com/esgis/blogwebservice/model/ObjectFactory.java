//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2022.05.31 à 09:15:23 PM GMT 
//


package test.com.esgis.blogwebservice.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the test.com.esgis.blogwebservice.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: test.com.esgis.blogwebservice.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Article }
     * 
     */
    public Article createArticle() {
        return new Article();
    }

    /**
     * Create an instance of {@link GetArticleResponse }
     * 
     */
    public GetArticleResponse createGetArticleResponse() {
        return new GetArticleResponse();
    }

    /**
     * Create an instance of {@link GetArticleRequest }
     * 
     */
    public GetArticleRequest createGetArticleRequest() {
        return new GetArticleRequest();
    }

    /**
     * Create an instance of {@link Commentaire }
     * 
     */
    public Commentaire createCommentaire() {
        return new Commentaire();
    }

    /**
     * Create an instance of {@link Article.Commentaires }
     * 
     */
    public Article.Commentaires createArticleCommentaires() {
        return new Article.Commentaires();
    }

}
