
package mypackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClubName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClubWebsiteURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewsArticle">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ArticleURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NewsArticleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="PublishDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Taxonomies" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TeaserText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Subtitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ThumbnailImageURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BodyText">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="p" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="h6">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="em" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GalleryImageURLs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VideoURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OptaMatchId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder = {
    "clubName",
    "clubWebsiteURL",
    "newsArticle"
})
@XmlRootElement(name = "NewsArticleInformation")
public class NewsArticleInformation {

    @XmlElement(name = "ClubName", required = true)
    protected String clubName;
    @XmlElement(name = "ClubWebsiteURL", required = true)
    protected String clubWebsiteURL;
    @XmlElement(name = "NewsArticle", required = true)
    protected NewsArticleInformation.NewsArticle newsArticle;

    /**
     * Gets the value of the clubName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClubName() {
        return clubName;
    }

    /**
     * Sets the value of the clubName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClubName(String value) {
        this.clubName = value;
    }

    /**
     * Gets the value of the clubWebsiteURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClubWebsiteURL() {
        return clubWebsiteURL;
    }

    /**
     * Sets the value of the clubWebsiteURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClubWebsiteURL(String value) {
        this.clubWebsiteURL = value;
    }

    /**
     * Gets the value of the newsArticle property.
     * 
     * @return
     *     possible object is
     *     {@link NewsArticleInformation.NewsArticle }
     *     
     */
    public NewsArticleInformation.NewsArticle getNewsArticle() {
        return newsArticle;
    }

    /**
     * Sets the value of the newsArticle property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewsArticleInformation.NewsArticle }
     *     
     */
    public void setNewsArticle(NewsArticleInformation.NewsArticle value) {
        this.newsArticle = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ArticleURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NewsArticleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="PublishDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Taxonomies" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TeaserText" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Subtitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ThumbnailImageURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="BodyText">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="p" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="h6">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="em" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GalleryImageURLs" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="VideoURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OptaMatchId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "articleURL",
        "newsArticleID",
        "publishDate",
        "taxonomies",
        "teaserText",
        "subtitle",
        "thumbnailImageURL",
        "title",
        "bodyText",
        "galleryImageURLs",
        "videoURL",
        "optaMatchId"
    })
    public static class NewsArticle {

        @XmlElement(name = "ArticleURL", required = true)
        protected String articleURL;
        @XmlElement(name = "NewsArticleID")
        protected int newsArticleID;
        @XmlElement(name = "PublishDate", required = true)
        protected String publishDate;
        @XmlElement(name = "Taxonomies", required = true)
        protected String taxonomies;
        @XmlElement(name = "TeaserText", required = true)
        protected String teaserText;
        @XmlElement(name = "Subtitle", required = true)
        protected String subtitle;
        @XmlElement(name = "ThumbnailImageURL", required = true)
        protected String thumbnailImageURL;
        @XmlElement(name = "Title", required = true)
        protected String title;
        @XmlElement(name = "BodyText", required = true)
        protected NewsArticleInformation.NewsArticle.BodyText bodyText;
        @XmlElement(name = "GalleryImageURLs", required = true)
        protected String galleryImageURLs;
        @XmlElement(name = "VideoURL", required = true)
        protected String videoURL;
        @XmlElement(name = "OptaMatchId", required = true)
        protected String optaMatchId;

        /**
         * Gets the value of the articleURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArticleURL() {
            return articleURL;
        }

        /**
         * Sets the value of the articleURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArticleURL(String value) {
            this.articleURL = value;
        }

        /**
         * Gets the value of the newsArticleID property.
         * 
         */
        public int getNewsArticleID() {
            return newsArticleID;
        }

        /**
         * Sets the value of the newsArticleID property.
         * 
         */
        public void setNewsArticleID(int value) {
            this.newsArticleID = value;
        }

        /**
         * Gets the value of the publishDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPublishDate() {
            return publishDate;
        }

        /**
         * Sets the value of the publishDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPublishDate(String value) {
            this.publishDate = value;
        }

        /**
         * Gets the value of the taxonomies property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxonomies() {
            return taxonomies;
        }

        /**
         * Sets the value of the taxonomies property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxonomies(String value) {
            this.taxonomies = value;
        }

        /**
         * Gets the value of the teaserText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeaserText() {
            return teaserText;
        }

        /**
         * Sets the value of the teaserText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeaserText(String value) {
            this.teaserText = value;
        }

        /**
         * Gets the value of the subtitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubtitle() {
            return subtitle;
        }

        /**
         * Sets the value of the subtitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubtitle(String value) {
            this.subtitle = value;
        }

        /**
         * Gets the value of the thumbnailImageURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getThumbnailImageURL() {
            return thumbnailImageURL;
        }

        /**
         * Sets the value of the thumbnailImageURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setThumbnailImageURL(String value) {
            this.thumbnailImageURL = value;
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
         * Gets the value of the bodyText property.
         * 
         * @return
         *     possible object is
         *     {@link NewsArticleInformation.NewsArticle.BodyText }
         *     
         */
        public NewsArticleInformation.NewsArticle.BodyText getBodyText() {
            return bodyText;
        }

        /**
         * Sets the value of the bodyText property.
         * 
         * @param value
         *     allowed object is
         *     {@link NewsArticleInformation.NewsArticle.BodyText }
         *     
         */
        public void setBodyText(NewsArticleInformation.NewsArticle.BodyText value) {
            this.bodyText = value;
        }

        /**
         * Gets the value of the galleryImageURLs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGalleryImageURLs() {
            return galleryImageURLs;
        }

        /**
         * Sets the value of the galleryImageURLs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGalleryImageURLs(String value) {
            this.galleryImageURLs = value;
        }

        /**
         * Gets the value of the videoURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVideoURL() {
            return videoURL;
        }

        /**
         * Sets the value of the videoURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVideoURL(String value) {
            this.videoURL = value;
        }

        /**
         * Gets the value of the optaMatchId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOptaMatchId() {
            return optaMatchId;
        }

        /**
         * Sets the value of the optaMatchId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOptaMatchId(String value) {
            this.optaMatchId = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="p" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="h6">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="em" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        @XmlType(name = "", propOrder = {
            "p",
            "h6"
        })
        public static class BodyText {

            protected List<NewsArticleInformation.NewsArticle.BodyText.P> p;
            @XmlElement(required = true)
            protected NewsArticleInformation.NewsArticle.BodyText.H6 h6;

            /**
             * Gets the value of the p property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the p property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getP().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link NewsArticleInformation.NewsArticle.BodyText.P }
             * 
             * 
             */
            public List<NewsArticleInformation.NewsArticle.BodyText.P> getP() {
                if (p == null) {
                    p = new ArrayList<NewsArticleInformation.NewsArticle.BodyText.P>();
                }
                return this.p;
            }

            /**
             * Gets the value of the h6 property.
             * 
             * @return
             *     possible object is
             *     {@link NewsArticleInformation.NewsArticle.BodyText.H6 }
             *     
             */
            public NewsArticleInformation.NewsArticle.BodyText.H6 getH6() {
                return h6;
            }

            /**
             * Sets the value of the h6 property.
             * 
             * @param value
             *     allowed object is
             *     {@link NewsArticleInformation.NewsArticle.BodyText.H6 }
             *     
             */
            public void setH6(NewsArticleInformation.NewsArticle.BodyText.H6 value) {
                this.h6 = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="em" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "em"
            })
            public static class H6 {

                @XmlElement(required = true)
                protected String em;

                /**
                 * Gets the value of the em property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEm() {
                    return em;
                }

                /**
                 * Sets the value of the em property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEm(String value) {
                    this.em = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
            @XmlType(name = "", propOrder = {
                "content"
            })
            public static class P {

                @XmlElementRef(name = "a", type = JAXBElement.class, required = false)
                @XmlMixed
                protected List<Serializable> content;

                /**
                 * Gets the value of the content property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the content property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContent().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link JAXBElement }{@code <}{@link NewsArticleInformation.NewsArticle.BodyText.P.A }{@code >}
                 * {@link String }
                 * 
                 * 
                 */
                public List<Serializable> getContent() {
                    if (content == null) {
                        content = new ArrayList<Serializable>();
                    }
                    return this.content;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class A {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "href")
                    protected String href;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the href property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHref() {
                        return href;
                    }

                    /**
                     * Sets the value of the href property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHref(String value) {
                        this.href = value;
                    }

                }

            }

        }

    }

}
