
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

    private final static QName _UpdateGodResponse_QNAME = new QName("http://server/", "updateGodResponse");
    private final static QName _DeleteGod_QNAME = new QName("http://server/", "deleteGod");
    private final static QName _CreateNewGodResponse_QNAME = new QName("http://server/", "createNewGodResponse");
    private final static QName _GetGodsByIdResponse_QNAME = new QName("http://server/", "getGodsByIdResponse");
    private final static QName _GetAllGods_QNAME = new QName("http://server/", "getAllGods");
    private final static QName _CreateNewGod_QNAME = new QName("http://server/", "createNewGod");
    private final static QName _GetGodsByGodOfResponse_QNAME = new QName("http://server/", "getGodsByGodOfResponse");
    private final static QName _GetAllGodsResponse_QNAME = new QName("http://server/", "getAllGodsResponse");
    private final static QName _GetGodsByGodOf_QNAME = new QName("http://server/", "getGodsByGodOf");
    private final static QName _GetGodsByNameAndCulture_QNAME = new QName("http://server/", "getGodsByNameAndCulture");
    private final static QName _MySQLException_QNAME = new QName("http://server/", "MySQLException");
    private final static QName _UpdateGod_QNAME = new QName("http://server/", "updateGod");
    private final static QName _GetGodsById_QNAME = new QName("http://server/", "getGodsById");
    private final static QName _GetImageResponse_QNAME = new QName("http://server/", "getImageResponse");
    private final static QName _GetGodsByCulture_QNAME = new QName("http://server/", "getGodsByCulture");
    private final static QName _GetGodsByCultureAndGodOf_QNAME = new QName("http://server/", "getGodsByCultureAndGodOf");
    private final static QName _GetGodsByCultureAndGodOfResponse_QNAME = new QName("http://server/", "getGodsByCultureAndGodOfResponse");
    private final static QName _GetGodByName_QNAME = new QName("http://server/", "getGodByName");
    private final static QName _GetImage_QNAME = new QName("http://server/", "getImage");
    private final static QName _GetGodsByCultureResponse_QNAME = new QName("http://server/", "getGodsByCultureResponse");
    private final static QName _GetGodsByNameAndCultureResponse_QNAME = new QName("http://server/", "getGodsByNameAndCultureResponse");
    private final static QName _EmptyArgException_QNAME = new QName("http://server/", "EmptyArgException");
    private final static QName _GetGodByNameResponse_QNAME = new QName("http://server/", "getGodByNameResponse");
    private final static QName _DeleteGodResponse_QNAME = new QName("http://server/", "deleteGodResponse");

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
     * Create an instance of {@link GetImageResponse }
     * 
     */
    public GetImageResponse createGetImageResponse() {
        return new GetImageResponse();
    }

    /**
     * Create an instance of {@link UpdateGod }
     * 
     */
    public UpdateGod createUpdateGod() {
        return new UpdateGod();
    }

    /**
     * Create an instance of {@link SqlFault }
     * 
     */
    public SqlFault createSqlFault() {
        return new SqlFault();
    }

    /**
     * Create an instance of {@link CreateNewGod }
     * 
     */
    public CreateNewGod createCreateNewGod() {
        return new CreateNewGod();
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
     * Create an instance of {@link CreateNewGodResponse }
     * 
     */
    public CreateNewGodResponse createCreateNewGodResponse() {
        return new CreateNewGodResponse();
    }

    /**
     * Create an instance of {@link GetGodsByIdResponse }
     * 
     */
    public GetGodsByIdResponse createGetGodsByIdResponse() {
        return new GetGodsByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateGodResponse }
     * 
     */
    public UpdateGodResponse createUpdateGodResponse() {
        return new UpdateGodResponse();
    }

    /**
     * Create an instance of {@link DeleteGod }
     * 
     */
    public DeleteGod createDeleteGod() {
        return new DeleteGod();
    }

    /**
     * Create an instance of {@link DeleteGodResponse }
     * 
     */
    public DeleteGodResponse createDeleteGodResponse() {
        return new DeleteGodResponse();
    }

    /**
     * Create an instance of {@link GetGodByNameResponse }
     * 
     */
    public GetGodByNameResponse createGetGodByNameResponse() {
        return new GetGodByNameResponse();
    }

    /**
     * Create an instance of {@link EmptyArgFault }
     * 
     */
    public EmptyArgFault createEmptyArgFault() {
        return new EmptyArgFault();
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
     * Create an instance of {@link GetImage }
     * 
     */
    public GetImage createGetImage() {
        return new GetImage();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "updateGodResponse")
    public JAXBElement<UpdateGodResponse> createUpdateGodResponse(UpdateGodResponse value) {
        return new JAXBElement<UpdateGodResponse>(_UpdateGodResponse_QNAME, UpdateGodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "deleteGod")
    public JAXBElement<DeleteGod> createDeleteGod(DeleteGod value) {
        return new JAXBElement<DeleteGod>(_DeleteGod_QNAME, DeleteGod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewGodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "createNewGodResponse")
    public JAXBElement<CreateNewGodResponse> createCreateNewGodResponse(CreateNewGodResponse value) {
        return new JAXBElement<CreateNewGodResponse>(_CreateNewGodResponse_QNAME, CreateNewGodResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewGod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "createNewGod")
    public JAXBElement<CreateNewGod> createCreateNewGod(CreateNewGod value) {
        return new JAXBElement<CreateNewGod>(_CreateNewGod_QNAME, CreateNewGod.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SqlFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "MySQLException")
    public JAXBElement<SqlFault> createMySQLException(SqlFault value) {
        return new JAXBElement<SqlFault>(_MySQLException_QNAME, SqlFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "updateGod")
    public JAXBElement<UpdateGod> createUpdateGod(UpdateGod value) {
        return new JAXBElement<UpdateGod>(_UpdateGod_QNAME, UpdateGod.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getImageResponse")
    public JAXBElement<GetImageResponse> createGetImageResponse(GetImageResponse value) {
        return new JAXBElement<GetImageResponse>(_GetImageResponse_QNAME, GetImageResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getImage")
    public JAXBElement<GetImage> createGetImage(GetImage value) {
        return new JAXBElement<GetImage>(_GetImage_QNAME, GetImage.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyArgFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "EmptyArgException")
    public JAXBElement<EmptyArgFault> createEmptyArgException(EmptyArgFault value) {
        return new JAXBElement<EmptyArgFault>(_EmptyArgException_QNAME, EmptyArgFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGodByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getGodByNameResponse")
    public JAXBElement<GetGodByNameResponse> createGetGodByNameResponse(GetGodByNameResponse value) {
        return new JAXBElement<GetGodByNameResponse>(_GetGodByNameResponse_QNAME, GetGodByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "deleteGodResponse")
    public JAXBElement<DeleteGodResponse> createDeleteGodResponse(DeleteGodResponse value) {
        return new JAXBElement<DeleteGodResponse>(_DeleteGodResponse_QNAME, DeleteGodResponse.class, null, value);
    }

}
