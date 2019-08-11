
package mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
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

    private final static QName _NewsArticleInformationNewsArticleBodyTextPA_QNAME = new QName("", "a");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NewsArticleInformation }
     * 
     */
    public NewsArticleInformation createNewsArticleInformation() {
        return new NewsArticleInformation();
    }

    /**
     * Create an instance of {@link NewsArticleInformation.NewsArticle }
     * 
     */
    public NewsArticleInformation.NewsArticle createNewsArticleInformationNewsArticle() {
        return new NewsArticleInformation.NewsArticle();
    }

    /**
     * Create an instance of {@link NewsArticleInformation.NewsArticle.BodyText }
     * 
     */
    public NewsArticleInformation.NewsArticle.BodyText createNewsArticleInformationNewsArticleBodyText() {
        return new NewsArticleInformation.NewsArticle.BodyText();
    }

    /**
     * Create an instance of {@link NewsArticleInformation.NewsArticle.BodyText.P }
     * 
     */
    public NewsArticleInformation.NewsArticle.BodyText.P createNewsArticleInformationNewsArticleBodyTextP() {
        return new NewsArticleInformation.NewsArticle.BodyText.P();
    }

    /**
     * Create an instance of {@link NewsArticleInformation.NewsArticle.BodyText.H6 }
     * 
     */
    public NewsArticleInformation.NewsArticle.BodyText.H6 createNewsArticleInformationNewsArticleBodyTextH6() {
        return new NewsArticleInformation.NewsArticle.BodyText.H6();
    }

    /**
     * Create an instance of {@link NewsArticleInformation.NewsArticle.BodyText.P.A }
     * 
     */
    public NewsArticleInformation.NewsArticle.BodyText.P.A createNewsArticleInformationNewsArticleBodyTextPA() {
        return new NewsArticleInformation.NewsArticle.BodyText.P.A();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewsArticleInformation.NewsArticle.BodyText.P.A }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "a", scope = NewsArticleInformation.NewsArticle.BodyText.P.class)
    public JAXBElement<NewsArticleInformation.NewsArticle.BodyText.P.A> createNewsArticleInformationNewsArticleBodyTextPA(NewsArticleInformation.NewsArticle.BodyText.P.A value) {
        return new JAXBElement<NewsArticleInformation.NewsArticle.BodyText.P.A>(_NewsArticleInformationNewsArticleBodyTextPA_QNAME, NewsArticleInformation.NewsArticle.BodyText.P.A.class, NewsArticleInformation.NewsArticle.BodyText.P.class, value);
    }

}
