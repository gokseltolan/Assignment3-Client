package introsde.assignment.soap;

import java.util.List;

import introsde.assignment.soap.ws.LifeStatus;
import introsde.assignment.soap.ws.Person.CurrentHealth;
import introsde.assignment.soap.ws.*;

import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import javax.xml.ws.Holder;

public class PeopleClient{
	private static PrintWriter logWriter;

    public static void main(String[] args) throws Exception {
        PeopleService service = new PeopleService();
        People people = service.getPeopleImplPort();
        logWriter = new PrintWriter("logfile.txt", "UTF-8");
		logWriter.println("  ");
        logWriter.println(" WSDL LOCATION: https://cryptic-citadel-81782.herokuapp.com/ws/people?wsdl ");
        logWriter.println("  ");
        
        // Method #1 Print all the people 
        logWriter.println("  ");
        logWriter.println("METHOD #1: PRINTING ALL THE PEOPLE ");
        List<Person> personList = people.getPeopleList();
        for (Person per : personList) {
        	printPersonDetails(per);
        	List<LifeStatus> tmpList = per.getCurrentHealth().getMeasure();
        	for (int i=0; i<tmpList.size(); i++) {
        		LifeStatus ls1 = tmpList.get(i);
        		printLifeStatus(ls1,per);
        		}
        }
        logWriter.println("  ");
        logWriter.println("Total People number: "+personList.size());
        //end of Method #1 Print all the people 
     
        
       // Method #2 Print First People
        logWriter.println("  ");
        logWriter.println("METHOD #2: PRINTING 1st PEOPLE ");
        Person per = people.readPerson(1);
        printPersonDetails(per);
      	List<LifeStatus> tmpList = per.getCurrentHealth().getMeasure();
      	for (int i=0; i<tmpList.size(); i++) {
      		LifeStatus ls2 = tmpList.get(i);
      		printLifeStatus(ls2,per);
      	}
      	// End Of Method #2 Print 1st People
        
        // Method #3 Update Second People
        logWriter.println("  ");
        logWriter.println("METHOD #3: UPDATE 2nd PEOPLE's username with (username + random number)");
        logWriter.println("-----Person 2 Before Updating-----");
        Person per2 = people.getPeopleList().get(1);
        printPersonDetails(per2);
        Random rand = new Random();
        per2.setUsername(per2.getUsername()+rand.nextInt(100));
        Holder<Person> pers = new Holder<Person>(per2);
        people.updatePerson(pers);
		  Person pernew = people.readPerson(per2.getIdPerson());
        logWriter.println("-----Person 2 After Updating-----");
        printPersonDetails(pernew);
        // End of Method #3 Update Second People
        
        // Method #4 Create New People
        logWriter.println("  ");
        logWriter.println("METHOD #4: CREATE new PEOPLE with lifestatus");
        Person per3= new Person();
        per3.setBirthdate("1992");
        per3.setEmail("yahoo");
        per3.setLastname("alex");
        per3.setName("bred");
        per3.setUsername("puppy");
        logWriter.println("NEW PEOPLE CREATED");
        LifeStatus lf4 = new LifeStatus();
        lf4.setMeasureName("height");
        lf4.setMeasureType("double");
        lf4.setTime("0011");
        lf4.setValue("168.0");
        CurrentHealth value = new CurrentHealth();
		per3.setCurrentHealth(value);
       	per3.getCurrentHealth().getMeasure().add(lf4);
		Holder<Person> pers3 = new Holder<Person>(per3);
		people.createPerson(pers3);   
		per3= people.getPeopleList().get(people.getPeopleList().size()-1);
        logWriter.println("Current Life CREATED");
        printPersonDetails(per3);
        lf4=per3.getCurrentHealth().getMeasure().get(per3.getCurrentHealth().getMeasure().size()-1);
        printLifeStatus(lf4, per3);
        // End Of Method #4 Create New People
        
            
	    // Method #5 Delete People
	    logWriter.println("  ");
        logWriter.println("METHOD #5: Delete the Last People");
        logWriter.println("  ");
        Person per5 = people.getPeopleList().get(people.getPeopleList().size()-1);
        Holder<Integer> perid = new Holder<Integer>(per5.getIdPerson()); 
        logWriter.println("Total People number before delete: "+people.getPeopleList().size());
        people.deletePerson(perid);
        logWriter.println("Total People number after delete: "+people.getPeopleList().size());
        logWriter.println("  ");
        logWriter.println("  ");
        // End Of Method #5 Delete the last People
        
        // Method #6 Read HealthMeasure Histroy of the 1st person according to id and measure type
	       logWriter.println("  ");
           logWriter.println("METHOD #6: Read HealthMeasureHistory of 1st person (just - height)");
           logWriter.println("  ");
           int id = people.getPeopleList().get(0).getIdPerson();
           List<HealthMeasureHistory> hlist = people.readPersonHistory(id, "height");
           for(int i=0; i<hlist.size(); i++){
        	   printMeasureHistory(hlist.get(i));
           }
   	    logWriter.println("  ");
        // End of Method #6 Read HealthMeasure Histroy of the 1st person according to id and measure type
        
        // Method #7 List Measure Types
   	    logWriter.println("   ");
        logWriter.println("METHOD #7: List Measure Types");
        logWriter.println("   ");
        List<MeasureTypes> measurelist = people.getMeasureList();
        for(int i=0; i<measurelist.size(); i++)
        {
        	logWriter.println(measurelist.get(i).getMeasureTypes());
        }
        logWriter.println("   ");
        // End of Method #7 List Measure Types
        
        // Method #8 readPersonMeasure(Long id, String measureType, Long mid) 
        logWriter.println("   ");
          logWriter.println("METHOD #8: Read HealthMeasureHistory of 1st person (measureid = 4)");
          logWriter.println("   ");
	      int id8 = people.getPeopleList().get(0).getIdPerson();
	      HealthMeasureHistory hmh = people.readPersonMeasure(id8, "height", 4);
	      printMeasureHistory(hmh);
        // End of Method #8 readPersonMeasure(Long id, String measureType, Long mid) 
        
        
        
        // Method #9 savePersonMeasure(Long id, Measure m)
        logWriter.println("METHOD #9 Save Person Measure for 5th person and update HealthMeasureHistroy");
        Person per9 = people.readPerson(5);
        List<LifeStatus> ls9 = per9.getCurrentHealth().getMeasure();
        HealthMeasureHistory measure = new HealthMeasureHistory();
        LifeStatus life8 = new LifeStatus();
        logWriter.println("Before saving");
        LifeStatus life9 = new LifeStatus();
        for(int i = 0; i<ls9.size(); i++){
			if (ls9.get(i).getMeasureName().equals( "height"))
			{
				life8 = ls9.get(i);
				printLifeStatus(life8,per9);
				life9.setMeasureName(life8.getMeasureName());
				life9.setMeasureType(life8.getMeasureType());
				life9.setTime(life8.getTime());
				life9.setValue(life8.getValue());
				people.deleteLifeStatus(ls9.get(i).getIdMeasure());
				//ls.remove(i);
				measure.setMeasureName("height");
				measure.setMeasureType("double");
				measure.setTimestamp("0015");
				measure.setValue("185.9");
				Holder<Integer> lsid9 = new Holder<Integer>(5);
				people.createLifeStatus(lsid9, life9);
				//ls9.add(life9);
			}   
        }
        life9.setTime("0015");
		life9.setValue("185.9");
    	logWriter.println("After saving");
        people.savePersonMeasure(5, measure);
        logWriter.println(per9.getName()+"'s new height value is 185.9");
        printLifeStatus(life9,per9);
        // End of Method #9 
        
        
        // Method #10 updatePersonMeasure(Long id, Measure m)
        logWriter.println("   ");
        logWriter.println("Method #10 Updating person's measure measureid=253 personid=217");
        logWriter.println("   ");
        Person per10 = people.readPerson(217);
        logWriter.println("Before update");
        List<LifeStatus> old = per10.getCurrentHealth().getMeasure();
        printLifeStatus(old.get(0),per10);
        LifeStatus lf10 = new LifeStatus();
        lf10.setIdMeasure(253);
        lf10.setMeasureName("height");
        lf10.setValue("177");
        lf10.setTime("1007");
        lf10.setMeasureType("double");
        people.updatePersonHealthProfile(217, lf10);
        logWriter.println("After update");
        old.remove(0);
        old.add(lf10);
        printLifeStatus(old.get(0),per10);
        // End of Method #10 updatePersonMeasure(Long id, Measure m)
        
        logWriter.close();
        
    		}//end of main
    
    public static void printLifeStatus(LifeStatus ls, Person per) {
    	logWriter.println("----"+per.getName()+"'s Current Lifestatus: ");
       	logWriter.println("	Measure id: " + ls.getIdMeasure());
    		logWriter.println("	Measure name: " + ls.getMeasureName());
    		logWriter.println("	Measure type: " + ls.getMeasureType());
    		logWriter.println("	Value: " + ls.getValue());
    		logWriter.println("	Date: " + ls.getTime());
    		logWriter.println("   ");
    }

    public static void printPersonDetails(Person per) {
    	logWriter.println("  ");
    	logWriter.println("  ");
    	logWriter.println("Person id: " + per.getIdPerson());
    	logWriter.println("Person's name: " + per.getName());
    	logWriter.println("Person's lastname: " + per.getLastname());
    	logWriter.println("Person's birthdate: " + per.getBirthdate());
    	logWriter.println("Person's e-mail: " + per.getEmail());
    	logWriter.println("Person's username: " + per.getUsername());
    	logWriter.println("   ");
    }
    
    public static void printMeasureHistory(HealthMeasureHistory hm) {
    	logWriter.println("   ");
    	logWriter.println("Id of Measure History " + hm.getIdMeasureHistory());
    	logWriter.println("Measure name: " + hm.getMeasureName());
    	logWriter.println("Measure name: " + hm.getMeasureType());
    	logWriter.println("Timestamp of the measure: " + hm.getTimestamp());
    	logWriter.println("Measure's value: " + hm.getValue());
    	logWriter.println("   ");
        
    }
}
