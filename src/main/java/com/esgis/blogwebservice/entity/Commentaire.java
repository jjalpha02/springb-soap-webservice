package com.esgis.blogwebservice.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String  libelle;
    private String contenu;
    private Date datePublication;
    private String auteur;
    @ManyToOne(fetch = FetchType.EAGER)
    //@JoinColumn(name = "id")
    Article article;

    public Commentaire() {
    }

    public Commentaire(int id, String libelle,  Article article) {
        this.id = id;
        this.libelle = libelle;

        this.article = article;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
