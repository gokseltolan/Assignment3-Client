
package introsde.assignment.soap.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.assignment.soap.ws package. 
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

    private final static QName _UpdatePersonHealthProfileResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "updatePersonHealthProfileResponse");
    private final static QName _GetMeasureListResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "getMeasureListResponse");
    private final static QName _GetMeasureList_QNAME = new QName("http://ws.soap.assignment.introsde/", "getMeasureList");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "deletePersonResponse");
    private final static QName _GetHistoryList_QNAME = new QName("http://ws.soap.assignment.introsde/", "getHistoryList");
    private final static QName _GetHistoryListResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "getHistoryListResponse");
    private final static QName _CreatePerson_QNAME = new QName("http://ws.soap.assignment.introsde/", "createPerson");
    private final static QName _SavePersonMeasure_QNAME = new QName("http://ws.soap.assignment.introsde/", "savePersonMeasure");
    private final static QName _SavePersonMeasureResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "savePersonMeasureResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://ws.soap.assignment.introsde/", "deletePerson");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "createPersonResponse");
    private final static QName _GetPeopleList_QNAME = new QName("http://ws.soap.assignment.introsde/", "getPeopleList");
    private final static QName _DeleteLifeStatus_QNAME = new QName("http://ws.soap.assignment.introsde/", "deleteLifeStatus");
    private final static QName _ReadPersonMeasureResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "readPersonMeasureResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://ws.soap.assignment.introsde/", "updatePerson");
    private final static QName _UpdatePersonHealthProfile_QNAME = new QName("http://ws.soap.assignment.introsde/", "updatePersonHealthProfile");
    private final static QName _DeleteLifeStatusResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "deleteLifeStatusResponse");
    private final static QName _ReadPersonMeasure_QNAME = new QName("http://ws.soap.assignment.introsde/", "readPersonMeasure");
    private final static QName _CreateLifeStatus_QNAME = new QName("http://ws.soap.assignment.introsde/", "createLifeStatus");
    private final static QName _ReadPerson_QNAME = new QName("http://ws.soap.assignment.introsde/", "readPerson");
    private final static QName _GetPeopleListResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "getPeopleListResponse");
    private final static QName _ReadPersonHistory_QNAME = new QName("http://ws.soap.assignment.introsde/", "readPersonHistory");
    private final static QName _CreateLifeStatusResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "createLifeStatusResponse");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "readPersonResponse");
    private final static QName _ReadPersonHistoryResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "readPersonHistoryResponse");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "updatePersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.assignment.soap.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link GetMeasureListResponse }
     * 
     */
    public GetMeasureListResponse createGetMeasureListResponse() {
        return new GetMeasureListResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonHealthProfileResponse }
     * 
     */
    public UpdatePersonHealthProfileResponse createUpdatePersonHealthProfileResponse() {
        return new UpdatePersonHealthProfileResponse();
    }

    /**
     * Create an instance of {@link GetHistoryList }
     * 
     */
    public GetHistoryList createGetHistoryList() {
        return new GetHistoryList();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link GetMeasureList }
     * 
     */
    public GetMeasureList createGetMeasureList() {
        return new GetMeasureList();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link SavePersonMeasure }
     * 
     */
    public SavePersonMeasure createSavePersonMeasure() {
        return new SavePersonMeasure();
    }

    /**
     * Create an instance of {@link SavePersonMeasureResponse }
     * 
     */
    public SavePersonMeasureResponse createSavePersonMeasureResponse() {
        return new SavePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link GetHistoryListResponse }
     * 
     */
    public GetHistoryListResponse createGetHistoryListResponse() {
        return new GetHistoryListResponse();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link ReadPersonHistoryResponse }
     * 
     */
    public ReadPersonHistoryResponse createReadPersonHistoryResponse() {
        return new ReadPersonHistoryResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonHistory }
     * 
     */
    public ReadPersonHistory createReadPersonHistory() {
        return new ReadPersonHistory();
    }

    /**
     * Create an instance of {@link CreateLifeStatusResponse }
     * 
     */
    public CreateLifeStatusResponse createCreateLifeStatusResponse() {
        return new CreateLifeStatusResponse();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link GetPeopleListResponse }
     * 
     */
    public GetPeopleListResponse createGetPeopleListResponse() {
        return new GetPeopleListResponse();
    }

    /**
     * Create an instance of {@link CreateLifeStatus }
     * 
     */
    public CreateLifeStatus createCreateLifeStatus() {
        return new CreateLifeStatus();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link UpdatePersonHealthProfile }
     * 
     */
    public UpdatePersonHealthProfile createUpdatePersonHealthProfile() {
        return new UpdatePersonHealthProfile();
    }

    /**
     * Create an instance of {@link DeleteLifeStatusResponse }
     * 
     */
    public DeleteLifeStatusResponse createDeleteLifeStatusResponse() {
        return new DeleteLifeStatusResponse();
    }

    /**
     * Create an instance of {@link ReadPersonMeasure }
     * 
     */
    public ReadPersonMeasure createReadPersonMeasure() {
        return new ReadPersonMeasure();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureResponse }
     * 
     */
    public ReadPersonMeasureResponse createReadPersonMeasureResponse() {
        return new ReadPersonMeasureResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link GetPeopleList }
     * 
     */
    public GetPeopleList createGetPeopleList() {
        return new GetPeopleList();
    }

    /**
     * Create an instance of {@link DeleteLifeStatus }
     * 
     */
    public DeleteLifeStatus createDeleteLifeStatus() {
        return new DeleteLifeStatus();
    }

    /**
     * Create an instance of {@link LifeStatus }
     * 
     */
    public LifeStatus createLifeStatus() {
        return new LifeStatus();
    }

    /**
     * Create an instance of {@link HealthMeasureHistory }
     * 
     */
    public HealthMeasureHistory createHealthMeasureHistory() {
        return new HealthMeasureHistory();
    }

    /**
     * Create an instance of {@link MeasureTypes }
     * 
     */
    public MeasureTypes createMeasureTypes() {
        return new MeasureTypes();
    }

    /**
     * Create an instance of {@link Person.CurrentHealth }
     * 
     */
    public Person.CurrentHealth createPersonCurrentHealth() {
        return new Person.CurrentHealth();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonHealthProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "updatePersonHealthProfileResponse")
    public JAXBElement<UpdatePersonHealthProfileResponse> createUpdatePersonHealthProfileResponse(UpdatePersonHealthProfileResponse value) {
        return new JAXBElement<UpdatePersonHealthProfileResponse>(_UpdatePersonHealthProfileResponse_QNAME, UpdatePersonHealthProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "getMeasureListResponse")
    public JAXBElement<GetMeasureListResponse> createGetMeasureListResponse(GetMeasureListResponse value) {
        return new JAXBElement<GetMeasureListResponse>(_GetMeasureListResponse_QNAME, GetMeasureListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "getMeasureList")
    public JAXBElement<GetMeasureList> createGetMeasureList(GetMeasureList value) {
        return new JAXBElement<GetMeasureList>(_GetMeasureList_QNAME, GetMeasureList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoryList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "getHistoryList")
    public JAXBElement<GetHistoryList> createGetHistoryList(GetHistoryList value) {
        return new JAXBElement<GetHistoryList>(_GetHistoryList_QNAME, GetHistoryList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoryListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "getHistoryListResponse")
    public JAXBElement<GetHistoryListResponse> createGetHistoryListResponse(GetHistoryListResponse value) {
        return new JAXBElement<GetHistoryListResponse>(_GetHistoryListResponse_QNAME, GetHistoryListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "savePersonMeasure")
    public JAXBElement<SavePersonMeasure> createSavePersonMeasure(SavePersonMeasure value) {
        return new JAXBElement<SavePersonMeasure>(_SavePersonMeasure_QNAME, SavePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "savePersonMeasureResponse")
    public JAXBElement<SavePersonMeasureResponse> createSavePersonMeasureResponse(SavePersonMeasureResponse value) {
        return new JAXBElement<SavePersonMeasureResponse>(_SavePersonMeasureResponse_QNAME, SavePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "getPeopleList")
    public JAXBElement<GetPeopleList> createGetPeopleList(GetPeopleList value) {
        return new JAXBElement<GetPeopleList>(_GetPeopleList_QNAME, GetPeopleList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLifeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "deleteLifeStatus")
    public JAXBElement<DeleteLifeStatus> createDeleteLifeStatus(DeleteLifeStatus value) {
        return new JAXBElement<DeleteLifeStatus>(_DeleteLifeStatus_QNAME, DeleteLifeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readPersonMeasureResponse")
    public JAXBElement<ReadPersonMeasureResponse> createReadPersonMeasureResponse(ReadPersonMeasureResponse value) {
        return new JAXBElement<ReadPersonMeasureResponse>(_ReadPersonMeasureResponse_QNAME, ReadPersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonHealthProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "updatePersonHealthProfile")
    public JAXBElement<UpdatePersonHealthProfile> createUpdatePersonHealthProfile(UpdatePersonHealthProfile value) {
        return new JAXBElement<UpdatePersonHealthProfile>(_UpdatePersonHealthProfile_QNAME, UpdatePersonHealthProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLifeStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "deleteLifeStatusResponse")
    public JAXBElement<DeleteLifeStatusResponse> createDeleteLifeStatusResponse(DeleteLifeStatusResponse value) {
        return new JAXBElement<DeleteLifeStatusResponse>(_DeleteLifeStatusResponse_QNAME, DeleteLifeStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readPersonMeasure")
    public JAXBElement<ReadPersonMeasure> createReadPersonMeasure(ReadPersonMeasure value) {
        return new JAXBElement<ReadPersonMeasure>(_ReadPersonMeasure_QNAME, ReadPersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateLifeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "createLifeStatus")
    public JAXBElement<CreateLifeStatus> createCreateLifeStatus(CreateLifeStatus value) {
        return new JAXBElement<CreateLifeStatus>(_CreateLifeStatus_QNAME, CreateLifeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "getPeopleListResponse")
    public JAXBElement<GetPeopleListResponse> createGetPeopleListResponse(GetPeopleListResponse value) {
        return new JAXBElement<GetPeopleListResponse>(_GetPeopleListResponse_QNAME, GetPeopleListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readPersonHistory")
    public JAXBElement<ReadPersonHistory> createReadPersonHistory(ReadPersonHistory value) {
        return new JAXBElement<ReadPersonHistory>(_ReadPersonHistory_QNAME, ReadPersonHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateLifeStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "createLifeStatusResponse")
    public JAXBElement<CreateLifeStatusResponse> createCreateLifeStatusResponse(CreateLifeStatusResponse value) {
        return new JAXBElement<CreateLifeStatusResponse>(_CreateLifeStatusResponse_QNAME, CreateLifeStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readPersonHistoryResponse")
    public JAXBElement<ReadPersonHistoryResponse> createReadPersonHistoryResponse(ReadPersonHistoryResponse value) {
        return new JAXBElement<ReadPersonHistoryResponse>(_ReadPersonHistoryResponse_QNAME, ReadPersonHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

}
