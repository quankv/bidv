//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.08 at 05:36:10 PM ICT 
//


package bidv.soa.ach247.inquiry;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Inquiry247 package. 
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

    private final static QName _BusinessDomain_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "BusinessDomain");
    private final static QName _AdditionalInformation_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "AdditionalInformation");
    private final static QName _ObjectId_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "ObjectId");
    private final static QName _NameValuePairs_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "NameValuePairs");
    private final static QName _UserPassword_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "UserPassword");
    private final static QName _BaseServiceEnvelopeRequest_QNAME = new QName("http://www.bidv.com/common/envelope/serviceenvelope/1.0", "BaseServiceEnvelopeRequest");
    private final static QName _TransactionId_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "TransactionId");
    private final static QName _Common_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "Common");
    private final static QName _UserId_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "UserId");
    private final static QName _UserRole_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "UserRole");
    private final static QName _ResponseStatus_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "ResponseStatus");
    private final static QName _SourceAppID_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "SourceAppID");
    private final static QName _Header_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "Header");
    private final static QName _ServiceVersion_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "ServiceVersion");
    private final static QName _BodyReqACHInquiry_QNAME = new QName("http://www.bidv.com/entity/vn/apps/ach/inquiry/1.0", "BodyReqACHInquiry");
    private final static QName _ConversationId_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "ConversationId");
    private final static QName _TargetAppID_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "TargetAppID");
    private final static QName _BaseServiceEnvelopeResponse_QNAME = new QName("http://www.bidv.com/common/envelope/serviceenvelope/1.0", "BaseServiceEnvelopeResponse");
    private final static QName _BodyResACHInquiry_QNAME = new QName("http://www.bidv.com/entity/vn/apps/ach/inquiry/1.0", "BodyResACHInquiry");
    private final static QName _ResponseStatusErrorInfo_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "ResponseStatusErrorInfo");
    private final static QName _ObjectTimestamp_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "ObjectTimestamp");
    private final static QName _ACHInquiryRes_QNAME = new QName("http://www.bidv.com/entity/vn/apps/ach/inquiry/1.0", "ACHInquiryRes");
    private final static QName _ACHInquiryReq_QNAME = new QName("http://www.bidv.com/entity/vn/apps/ach/inquiry/1.0", "ACHInquiryReq");
    private final static QName _MessageTimestamp_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "MessageTimestamp");
    private final static QName _MessageType_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "MessageType");
    private final static QName _Client_QNAME = new QName("http://www.bidv.com/common/envelope/commonheader/1.0", "Client");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Inquiry247
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BodyResACHInquiryType }
     * 
     */
    public BodyResACHInquiryType createBodyResACHInquiryType() {
        return new BodyResACHInquiryType();
    }

    /**
     * Create an instance of {@link ACHInquiryResType }
     * 
     */
    public ACHInquiryResType createACHInquiryResType() {
        return new ACHInquiryResType();
    }

    /**
     * Create an instance of {@link ACHInquiryReqType }
     * 
     */
    public ACHInquiryReqType createACHInquiryReqType() {
        return new ACHInquiryReqType();
    }

    /**
     * Create an instance of {@link BodyReqACHInquiryType }
     * 
     */
    public BodyReqACHInquiryType createBodyReqACHInquiryType() {
        return new BodyReqACHInquiryType();
    }

    /**
     * Create an instance of {@link BaseServiceEnvelopeRequestType }
     * 
     */
    public BaseServiceEnvelopeRequestType createBaseServiceEnvelopeRequestType() {
        return new BaseServiceEnvelopeRequestType();
    }

    /**
     * Create an instance of {@link BaseServiceEnvelopeResponseType }
     * 
     */
    public BaseServiceEnvelopeResponseType createBaseServiceEnvelopeResponseType() {
        return new BaseServiceEnvelopeResponseType();
    }

    /**
     * Create an instance of {@link AdditionalInformationType }
     * 
     */
    public AdditionalInformationType createAdditionalInformationType() {
        return new AdditionalInformationType();
    }

    /**
     * Create an instance of {@link NameValuePairsType }
     * 
     */
    public NameValuePairsType createNameValuePairsType() {
        return new NameValuePairsType();
    }

    /**
     * Create an instance of {@link TargetAppIDs }
     * 
     */
    public TargetAppIDs createTargetAppIDs() {
        return new TargetAppIDs();
    }

    /**
     * Create an instance of {@link CommonType }
     * 
     */
    public CommonType createCommonType() {
        return new CommonType();
    }

    /**
     * Create an instance of {@link UserDetail }
     * 
     */
    public UserDetail createUserDetail() {
        return new UserDetail();
    }

    /**
     * Create an instance of {@link ResponseStatusErroInfoType }
     * 
     */
    public ResponseStatusErroInfoType createResponseStatusErroInfoType() {
        return new ResponseStatusErroInfoType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link ResponseStatusType }
     * 
     */
    public ResponseStatusType createResponseStatusType() {
        return new ResponseStatusType();
    }

    /**
     * Create an instance of {@link ClientType }
     * 
     */
    public ClientType createClientType() {
        return new ClientType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "BusinessDomain")
    public JAXBElement<String> createBusinessDomain(String value) {
        return new JAXBElement<String>(_BusinessDomain_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "AdditionalInformation")
    public JAXBElement<AdditionalInformationType> createAdditionalInformation(AdditionalInformationType value) {
        return new JAXBElement<AdditionalInformationType>(_AdditionalInformation_QNAME, AdditionalInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "ObjectId")
    public JAXBElement<String> createObjectId(String value) {
        return new JAXBElement<String>(_ObjectId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameValuePairsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "NameValuePairs")
    public JAXBElement<NameValuePairsType> createNameValuePairs(NameValuePairsType value) {
        return new JAXBElement<NameValuePairsType>(_NameValuePairs_QNAME, NameValuePairsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "UserPassword")
    public JAXBElement<byte[]> createUserPassword(byte[] value) {
        return new JAXBElement<byte[]>(_UserPassword_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseServiceEnvelopeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/serviceenvelope/1.0", name = "BaseServiceEnvelopeRequest")
    public JAXBElement<BaseServiceEnvelopeRequestType> createBaseServiceEnvelopeRequest(BaseServiceEnvelopeRequestType value) {
        return new JAXBElement<BaseServiceEnvelopeRequestType>(_BaseServiceEnvelopeRequest_QNAME, BaseServiceEnvelopeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "TransactionId")
    public JAXBElement<String> createTransactionId(String value) {
        return new JAXBElement<String>(_TransactionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "Common")
    public JAXBElement<CommonType> createCommon(CommonType value) {
        return new JAXBElement<CommonType>(_Common_QNAME, CommonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "UserId")
    public JAXBElement<String> createUserId(String value) {
        return new JAXBElement<String>(_UserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "UserRole")
    public JAXBElement<String> createUserRole(String value) {
        return new JAXBElement<String>(_UserRole_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "ResponseStatus")
    public JAXBElement<ResponseStatusType> createResponseStatus(ResponseStatusType value) {
        return new JAXBElement<ResponseStatusType>(_ResponseStatus_QNAME, ResponseStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "SourceAppID")
    public JAXBElement<String> createSourceAppID(String value) {
        return new JAXBElement<String>(_SourceAppID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "Header")
    public JAXBElement<HeaderType> createHeader(HeaderType value) {
        return new JAXBElement<HeaderType>(_Header_QNAME, HeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "ServiceVersion")
    public JAXBElement<String> createServiceVersion(String value) {
        return new JAXBElement<String>(_ServiceVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BodyReqACHInquiryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/entity/vn/apps/ach/inquiry/1.0", name = "BodyReqACHInquiry")
    public JAXBElement<BodyReqACHInquiryType> createBodyReqACHInquiry(BodyReqACHInquiryType value) {
        return new JAXBElement<BodyReqACHInquiryType>(_BodyReqACHInquiry_QNAME, BodyReqACHInquiryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "ConversationId")
    public JAXBElement<String> createConversationId(String value) {
        return new JAXBElement<String>(_ConversationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "TargetAppID")
    public JAXBElement<String> createTargetAppID(String value) {
        return new JAXBElement<String>(_TargetAppID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseServiceEnvelopeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/serviceenvelope/1.0", name = "BaseServiceEnvelopeResponse")
    public JAXBElement<BaseServiceEnvelopeResponseType> createBaseServiceEnvelopeResponse(BaseServiceEnvelopeResponseType value) {
        return new JAXBElement<BaseServiceEnvelopeResponseType>(_BaseServiceEnvelopeResponse_QNAME, BaseServiceEnvelopeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BodyResACHInquiryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/entity/vn/apps/ach/inquiry/1.0", name = "BodyResACHInquiry")
    public JAXBElement<BodyResACHInquiryType> createBodyResACHInquiry(BodyResACHInquiryType value) {
        return new JAXBElement<BodyResACHInquiryType>(_BodyResACHInquiry_QNAME, BodyResACHInquiryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStatusErroInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "ResponseStatusErrorInfo")
    public JAXBElement<ResponseStatusErroInfoType> createResponseStatusErrorInfo(ResponseStatusErroInfoType value) {
        return new JAXBElement<ResponseStatusErroInfoType>(_ResponseStatusErrorInfo_QNAME, ResponseStatusErroInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "ObjectTimestamp")
    public JAXBElement<XMLGregorianCalendar> createObjectTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ObjectTimestamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHInquiryResType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/entity/vn/apps/ach/inquiry/1.0", name = "ACHInquiryRes")
    public JAXBElement<ACHInquiryResType> createACHInquiryRes(ACHInquiryResType value) {
        return new JAXBElement<ACHInquiryResType>(_ACHInquiryRes_QNAME, ACHInquiryResType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHInquiryReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/entity/vn/apps/ach/inquiry/1.0", name = "ACHInquiryReq")
    public JAXBElement<ACHInquiryReqType> createACHInquiryReq(ACHInquiryReqType value) {
        return new JAXBElement<ACHInquiryReqType>(_ACHInquiryReq_QNAME, ACHInquiryReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "MessageTimestamp")
    public JAXBElement<XMLGregorianCalendar> createMessageTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MessageTimestamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "MessageType")
    public JAXBElement<String> createMessageType(String value) {
        return new JAXBElement<String>(_MessageType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", name = "Client")
    public JAXBElement<ClientType> createClient(ClientType value) {
        return new JAXBElement<ClientType>(_Client_QNAME, ClientType.class, null, value);
    }

}
