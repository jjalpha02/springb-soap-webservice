package com.esgis.blogwebservice.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String titre;
    private String contenu;
    private String numeroPublication;
    private Date datePublication;
    private String auteur;
    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Commentaire> commentaires;

    public Article() {
    }

    public Article(int id, String titre, String contenu, String numeroPublication, Date datePublication, String auteur, List<Commentaire> commentaires) {
        this.id = id;
        this.titre = titre;
        this.contenu = contenu;
        this.numeroPublication = numeroPublication;
        this.datePublication = datePublication;
        this.auteur = auteur;
        this.commentaires = commentaires;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getNumeroPublication() {
        return numeroPublication;
    }

    public void setNumeroPublication(String numeroPublication) {
        this.numeroPublication = numeroPublication;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }
}
