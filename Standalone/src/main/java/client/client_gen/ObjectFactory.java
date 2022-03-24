
package client_gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client_gen package. 
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

    private final static QName _GetGodsByIdResponse_QNAME = new QName("http://server/", "getGodsByIdResponse");
    private final static QName _GetAllGods_QNAME = new QName("http://server/", "getAllGods");
    private final static QName _GetGodsByGodOfResponse_QNAME = new QName("http://server/", "getGodsByGodOfResponse");
    private final static QName _GetAllGodsResponse_QNAME = new QName("http://server/", "getAllGodsResponse");
    private final static QName _GetGodsByGodOf_QNAME = new QName("http://server/", "getGodsByGodOf");
    private final static QName _GetGodsByNameAndCulture_QNAME = new QName("http://server/", "getGodsByNameAndCulture");
    private final static QName _GetGodsById_QNAME = new QName("http://server/", "getGodsById");
    private final static QName _GetGodsByCulture_QNAME = new QName("http://server/", "getGodsByCulture");
    private final static QName _GetGodsByCultureAndGodOf_QNAME = new QName("http://server/", "getGodsByCultureAndGodOf");
    private final static QName _GetGodsByCultureAndGodOfResponse_QNAME = new QName("http://server/", "getGodsByCultureAndGodOfResponse");
    private final static QName _GetGodByName_QNAME = new QName("http://server/", "getGodByName");
    private final static QName _GetGodsByCultureResponse_QNAME = new QName("http://server/", "getGodsByCultureResponse");
    private final static QName _GetGodsByNameAndCultureResponse_QNAME = new QName("http://server/", "getGodsByNameAndCultureResponse");
    private final static QName _GetGodByNameResponse_QNAME = new QName("http://server/", "getGodByNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client_gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetGodsById }
     * 
     */
    public GetGodsById createGetGodsById() {
        return new GetGodsById();
    }

    /**
     * Create an instance of {@link GetGodsByGodOfResponse }
     * 
     */
    public GetGodsByGodOfResponse createGetGodsByGodOfResponse() {
        return new GetGodsByGodOfResponse();
    }

    /**
     * Create an instance of {@link GetAllGodsResponse }
     * 
     */
    public GetAllGodsResponse createGetAllGodsResponse() {
        return new GetAllGodsResponse();
    }

    /**
     * Create an instance of {@link GetGodsByGodOf }
     * 
     */
    public GetGodsByGodOf createGetGodsByGodOf() {
        return new GetGodsByGodOf();
    }

    /**
     * Create an instance of {@link GetGodsByNameAndCulture }
     * 
     */
    public GetGodsByNameAndCulture createGetGodsByNameAndCulture() {
        return new GetGodsByNameAndCulture();
    }

    /**
     * Create an instance of {@link GetAllGods }
     * 
     */
    public GetAllGods createGetAllGods() {
        return new GetAllGods();
    }

    /**
     * Create an instance of {@link GetGodsByIdResponse }
     * 
     */
    public GetGodsByIdResponse createGetGodsByIdResponse() {
        return new GetGodsByIdResponse();
    }

    /**
     * Create an instance of {@link GetGodByNameResponse }
     * 
     */
    public GetGodByNameResponse createGetGodByNameResponse() {
        return new GetGodByNameResponse();
    }

    /**
     * Create an instance of {@link GetGodsByCultureResponse }
     * 
     */
    public GetGodsByCultureResponse createGetGodsByCultureResponse() {
        return new GetGodsByCultureResponse();
    }

    /**
     * Create an instance of {@link GetGodsByNameAndCultureResponse }
     * 
     */
    public GetGodsByNameAndCultureResponse createGetGodsByNameAndCultureResponse() {
        return new GetGodsByNameAndCultureResponse();
    }

    /**
     * Create an instance of {@link GetGodsByCultureAndGodOf }
     * 
     */
    public GetGodsByCultureAndGodOf createGetGodsByCultureAndGodOf() {
        return new GetGodsByCultureAndGodOf();
    }

    /**
     * Create an instance of {@link GetGodsByCultureAndGodOfResponse }
     * 
     */
    public GetGodsByCultureAndGodOfResponse createGetGodsByCultureAndGodOfResponse() {
        return new GetGodsByCultureAndGodOfResponse();
    }

    /**
     * Create an instance of {@link GetGodByName }
     * 
     */
    public GetGodByName createGetGodByName() {
        return new GetGodByName();
    }

    /**
     * Create an instance of {@link GetGodsByCulture }
     * 
     */
    public GetGodsByCulture createGetGodsByCulture() {
        return new GetGodsByCulture();
    }

    /**
     * Create an instance of {@link God }
     * 
     */
    public God createGod() {
        return new God();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGodsByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getGodsByIdResponse")
    public JAXBElement<GetGodsByIdResponse> createGetGodsByIdResponse(GetGodsByIdResponse value) {
        return new JAXBElement<GetGodsByIdResponse>(_GetGodsByIdResponse_QNAME, GetGodsByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllGods }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getAllGods")
    public JAXBElement<GetAllGods> createGetAllGods(GetAllGods value) {
        return new JAXBElement<GetAllGods>(_GetAllGods_QNAME, GetAllGods.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGodsByGodOfResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getGodsByGodOfResponse")
    public JAXBElement<GetGodsByGodOfResponse> createGetGodsByGodOfResponse(GetGodsByGodOfResponse value) {
        return new JAXBElement<GetGodsByGodOfResponse>(_GetGodsByGodOfResponse_QNAME, GetGodsByGodOfResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllGodsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getAllGodsResponse")
    public JAXBElement<GetAllGodsResponse> createGetAllGodsResponse(GetAllGodsResponse value) {
        return new JAXBElement<GetAllGodsResponse>(_GetAllGodsResponse_QNAME, GetAllGodsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGodsByGodOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getGodsByGodOf")
    public JAXBElement<GetGodsByGodOf> createGetGodsByGodOf(GetGodsByGodOf value) {
        return new JAXBElement<GetGodsByGodOf>(_GetGodsByGodOf_QNAME, GetGodsByGodOf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGodsByNameAndCulture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getGodsByNameAndCulture")
    public JAXBElement<GetGodsByNameAndCulture> createGetGodsByNameAndCulture(GetGodsByNameAndCulture value) {
        return new JAXBElement<GetGodsByNameAndCulture>(_GetGodsByNameAndCulture_QNAME, GetGodsByNameAndCulture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGodsById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getGodsById")
    public JAXBElement<GetGodsById> createGetGodsById(GetGodsById value) {
        return new JAXBElement<GetGodsById>(_GetGodsById_QNAME, GetGodsById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGodsByCulture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getGodsByCulture")
    public JAXBElement<GetGodsByCulture> createGetGodsByCulture(GetGodsByCulture value) {
        return new JAXBElement<GetGodsByCulture>(_GetGodsByCulture_QNAME, GetGodsByCulture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGodsByCultureAndGodOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getGodsByCultureAndGodOf")
    public JAXBElement<GetGodsByCultureAndGodOf> createGetGodsByCultureAndGodOf(GetGodsByCultureAndGodOf value) {
        return new JAXBElement<GetGodsByCultureAndGodOf>(_GetGodsByCultureAndGodOf_QNAME, GetGodsByCultureAndGodOf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGodsByCultureAndGodOfResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getGodsByCultureAndGodOfResponse")
    public JAXBElement<GetGodsByCultureAndGodOfResponse> createGetGodsByCultureAndGodOfResponse(GetGodsByCultureAndGodOfResponse value) {
        return new JAXBElement<GetGodsByCultureAndGodOfResponse>(_GetGodsByCultureAndGodOfResponse_QNAME, GetGodsByCultureAndGodOfResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGodByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getGodByName")
    public JAXBElement<GetGodByName> createGetGodByName(GetGodByName value) {
        return new JAXBElement<GetGodByName>(_GetGodByName_QNAME, GetGodByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGodsByCultureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getGodsByCultureResponse")
    public JAXBElement<GetGodsByCultureResponse> createGetGodsByCultureResponse(GetGodsByCultureResponse value) {
        return new JAXBElement<GetGodsByCultureResponse>(_GetGodsByCultureResponse_QNAME, GetGodsByCultureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGodsByNameAndCultureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getGodsByNameAndCultureResponse")
    public JAXBElement<GetGodsByNameAndCultureResponse> createGetGodsByNameAndCultureResponse(GetGodsByNameAndCultureResponse value) {
        return new JAXBElement<GetGodsByNameAndCultureResponse>(_GetGodsByNameAndCultureResponse_QNAME, GetGodsByNameAndCultureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGodByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getGodByNameResponse")
    public JAXBElement<GetGodByNameResponse> createGetGodByNameResponse(GetGodByNameResponse value) {
        return new JAXBElement<GetGodByNameResponse>(_GetGodByNameResponse_QNAME, GetGodByNameResponse.class, null, value);
    }

}
