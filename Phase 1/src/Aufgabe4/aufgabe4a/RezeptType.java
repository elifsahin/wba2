//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.10 at 03:34:06 PM MESZ 
//


package org.example.aufgabe4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for rezept_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rezept_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.example.org/Aufgabe3d}rezept-id"/>
 *         &lt;element ref="{http://www.example.org/Aufgabe3d}title"/>
 *         &lt;element ref="{http://www.example.org/Aufgabe3d}autor"/>
 *         &lt;element ref="{http://www.example.org/Aufgabe3d}date"/>
 *         &lt;element ref="{http://www.example.org/Aufgabe3d}picture" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.example.org/Aufgabe3d}ingrediens"/>
 *         &lt;element ref="{http://www.example.org/Aufgabe3d}preparation"/>
 *         &lt;element ref="{http://www.example.org/Aufgabe3d}comment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rezept_type", propOrder = {
    "rezeptId",
    "title",
    "autor",
    "date",
    "picture",
    "ingrediens",
    "preparation",
    "comment"
})
public class RezeptType {

    @XmlElement(name = "rezept-id")
    protected int rezeptId;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String autor;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected List<PictureType> picture;
    @XmlElement(required = true)
    protected IngrediensType ingrediens;
    @XmlElement(required = true)
    protected PreparationType preparation;
    protected List<CommentType> comment;

    /**
     * Gets the value of the rezeptId property.
     * 
     */
    public int getRezeptId() {
        return rezeptId;
    }

    /**
     * Sets the value of the rezeptId property.
     * 
     */
    public void setRezeptId(int value) {
        this.rezeptId = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the autor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Sets the value of the autor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutor(String value) {
        this.autor = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the picture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the picture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPicture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PictureType }
     * 
     * 
     */
    public List<PictureType> getPicture() {
        if (picture == null) {
            picture = new ArrayList<PictureType>();
        }
        return this.picture;
    }

    /**
     * Gets the value of the ingrediens property.
     * 
     * @return
     *     possible object is
     *     {@link IngrediensType }
     *     
     */
    public IngrediensType getIngrediens() {
        return ingrediens;
    }

    /**
     * Sets the value of the ingrediens property.
     * 
     * @param value
     *     allowed object is
     *     {@link IngrediensType }
     *     
     */
    public void setIngrediens(IngrediensType value) {
        this.ingrediens = value;
    }

    /**
     * Gets the value of the preparation property.
     * 
     * @return
     *     possible object is
     *     {@link PreparationType }
     *     
     */
    public PreparationType getPreparation() {
        return preparation;
    }

    /**
     * Sets the value of the preparation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreparationType }
     *     
     */
    public void setPreparation(PreparationType value) {
        this.preparation = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getComment() {
        if (comment == null) {
            comment = new ArrayList<CommentType>();
        }
        return this.comment;
    }

}
