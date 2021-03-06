
package introsde.assignment.soap.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "People", targetNamespace = "http://ws.soap.assignment.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface People {


    /**
     * 
     * @param personId
     * @param measureType
     * @return
     *     returns java.util.List<introsde.assignment.soap.ws.HealthMeasureHistory>
     */
    @WebMethod
    @WebResult(name = "healthMeasure", targetNamespace = "")
    @RequestWrapper(localName = "readPersonHistory", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadPersonHistory")
    @ResponseWrapper(localName = "readPersonHistoryResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadPersonHistoryResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/readPersonHistoryRequest", output = "http://ws.soap.assignment.introsde/People/readPersonHistoryResponse")
    public List<HealthMeasureHistory> readPersonHistory(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType);

    /**
     * 
     * @param measureId
     * @param personId
     * @param measureType
     * @return
     *     returns introsde.assignment.soap.ws.HealthMeasureHistory
     */
    @WebMethod
    @WebResult(name = "healthMeasure", targetNamespace = "")
    @RequestWrapper(localName = "readPersonMeasure", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadPersonMeasure")
    @ResponseWrapper(localName = "readPersonMeasureResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadPersonMeasureResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/readPersonMeasureRequest", output = "http://ws.soap.assignment.introsde/People/readPersonMeasureResponse")
    public HealthMeasureHistory readPersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType,
        @WebParam(name = "measureId", targetNamespace = "")
        int measureId);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.assignment.soap.ws.HealthMeasureHistory>
     */
    @WebMethod
    @WebResult(name = "healthMeasureHistory", targetNamespace = "")
    @RequestWrapper(localName = "getHistoryList", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.GetHistoryList")
    @ResponseWrapper(localName = "getHistoryListResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.GetHistoryListResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/getHistoryListRequest", output = "http://ws.soap.assignment.introsde/People/getHistoryListResponse")
    public List<HealthMeasureHistory> getHistoryList();

    /**
     * 
     * @param person
     */
    @WebMethod
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.UpdatePersonResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/updatePersonRequest", output = "http://ws.soap.assignment.introsde/People/updatePersonResponse")
    public void updatePerson(
        @WebParam(name = "person", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Person> person);

    /**
     * 
     * @param personId
     * @return
     *     returns introsde.assignment.soap.ws.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadPersonResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/readPersonRequest", output = "http://ws.soap.assignment.introsde/People/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param lifeStatus
     * @param personId
     */
    @WebMethod
    @RequestWrapper(localName = "createLifeStatus", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.CreateLifeStatus")
    @ResponseWrapper(localName = "createLifeStatusResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.CreateLifeStatusResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/createLifeStatusRequest", output = "http://ws.soap.assignment.introsde/People/createLifeStatusResponse")
    public void createLifeStatus(
        @WebParam(name = "personId", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Integer> personId,
        @WebParam(name = "lifeStatus", targetNamespace = "")
        LifeStatus lifeStatus);

    /**
     * 
     * @param lsId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "personId", targetNamespace = "")
    @RequestWrapper(localName = "deleteLifeStatus", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.DeleteLifeStatus")
    @ResponseWrapper(localName = "deleteLifeStatusResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.DeleteLifeStatusResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/deleteLifeStatusRequest", output = "http://ws.soap.assignment.introsde/People/deleteLifeStatusResponse")
    public int deleteLifeStatus(
        @WebParam(name = "lsId", targetNamespace = "")
        int lsId);

    /**
     * 
     * @param measure
     * @param personId
     * @return
     *     returns introsde.assignment.soap.ws.HealthMeasureHistory
     */
    @WebMethod
    @WebResult(name = "healthMeasure", targetNamespace = "")
    @RequestWrapper(localName = "savePersonMeasure", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.SavePersonMeasure")
    @ResponseWrapper(localName = "savePersonMeasureResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.SavePersonMeasureResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/savePersonMeasureRequest", output = "http://ws.soap.assignment.introsde/People/savePersonMeasureResponse")
    public HealthMeasureHistory savePersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measure", targetNamespace = "")
        HealthMeasureHistory measure);

    /**
     * 
     * @param personId
     */
    @WebMethod
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.DeletePersonResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/deletePersonRequest", output = "http://ws.soap.assignment.introsde/People/deletePersonResponse")
    public void deletePerson(
        @WebParam(name = "personId", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Integer> personId);

    /**
     * 
     * @param personId
     * @param healthProfile
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "hpId", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonHealthProfile", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.UpdatePersonHealthProfile")
    @ResponseWrapper(localName = "updatePersonHealthProfileResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.UpdatePersonHealthProfileResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/updatePersonHealthProfileRequest", output = "http://ws.soap.assignment.introsde/People/updatePersonHealthProfileResponse")
    public int updatePersonHealthProfile(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "healthProfile", targetNamespace = "")
        LifeStatus healthProfile);

    /**
     * 
     * @param person
     */
    @WebMethod
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.CreatePersonResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/createPersonRequest", output = "http://ws.soap.assignment.introsde/People/createPersonResponse")
    public void createPerson(
        @WebParam(name = "person", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Person> person);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.assignment.soap.ws.MeasureTypes>
     */
    @WebMethod
    @WebResult(name = "measureTypes", targetNamespace = "")
    @RequestWrapper(localName = "getMeasureList", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.GetMeasureList")
    @ResponseWrapper(localName = "getMeasureListResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.GetMeasureListResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/getMeasureListRequest", output = "http://ws.soap.assignment.introsde/People/getMeasureListResponse")
    public List<MeasureTypes> getMeasureList();

    /**
     * 
     * @return
     *     returns java.util.List<introsde.assignment.soap.ws.Person>
     */
    @WebMethod
    @WebResult(name = "people", targetNamespace = "")
    @RequestWrapper(localName = "getPeopleList", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.GetPeopleList")
    @ResponseWrapper(localName = "getPeopleListResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.GetPeopleListResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/getPeopleListRequest", output = "http://ws.soap.assignment.introsde/People/getPeopleListResponse")
    public List<Person> getPeopleList();

}
