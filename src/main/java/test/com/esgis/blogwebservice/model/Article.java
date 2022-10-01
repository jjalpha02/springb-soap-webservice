//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2022.05.31 à 09:15:23 PM GMT 
//


package test.com.esgis.blogwebservice.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour article complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="article">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contenu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroPublication" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datePublication" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="auteur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commentaires">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="commentaire" type="{http://esgis.com.test/blogwebservice/model}Commentaire"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "article", propOrder = {
    "id",
    "titre",
    "contenu",
    "numeroPublication",
    "datePublication",
    "auteur",
    "commentaires"
})
public class Article {

    protected int id;
    @XmlElement(required = true)
    protected String titre;
    @XmlElement(required = true)
    protected String contenu;
    @XmlElement(required = true)
    protected String numeroPublication;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datePublication;
    @XmlElement(required = true)
    protected String auteur;
    @XmlElement(required = true)
    protected Article.Commentaires commentaires;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété titre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Définit la valeur de la propriété titre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitre(String value) {
        this.titre = value;
    }

    /**
     * Obtient la valeur de la propriété contenu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContenu() {
        return contenu;
    }

    /**
     * Définit la valeur de la propriété contenu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContenu(String value) {
        this.contenu = value;
    }

    /**
     * Obtient la valeur de la propriété numeroPublication.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPublication() {
        return numeroPublication;
    }

    /**
     * Définit la valeur de la propriété numeroPublication.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPublication(String value) {
        this.numeroPublication = value;
    }

    /**
     * Obtient la valeur de la propriété datePublication.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePublication() {
        return datePublication;
    }

    /**
     * Définit la valeur de la propriété datePublication.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePublication(XMLGregorianCalendar value) {
        this.datePublication = value;
    }

    /**
     * Obtient la valeur de la propriété auteur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * Définit la valeur de la propriété auteur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuteur(String value) {
        this.auteur = value;
    }

    /**
     * Obtient la valeur de la propriété commentaires.
     * 
     * @return
     *     possible object is
     *     {@link Article.Commentaires }
     *     
     */
    public Article.Commentaires getCommentaires() {
        return commentaires;
    }

    /**
     * Définit la valeur de la propriété commentaires.
     * 
     * @param value
     *     allowed object is
     *     {@link Article.Commentaires }
     *     
     */
    public void setCommentaires(Article.Commentaires value) {
        this.commentaires = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="commentaire" type="{http://esgis.com.test/blogwebservice/model}Commentaire"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "commentaire"
    })
    public static class Commentaires {

        protected List<Commentaire> commentaire;

        /**
         * Gets the value of the commentaire property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commentaire property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCommentaire().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Commentaire }
         * 
         * 
         */
        public List<Commentaire> getCommentaire() {
            if (commentaire == null) {
                commentaire = new ArrayList<Commentaire>();
            }
            return this.commentaire;
        }

    }

}
