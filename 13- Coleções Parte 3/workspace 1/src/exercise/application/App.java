package exercise.application;

import exercise.LegalPerson;
import exercise.NaturalPerson;
import exercise.PeopleDataBase;
import exercise.Person;
import jdk.swing.interop.SwingInterOpUtils;

public class App {

    public static void main(String[] args) {

        // CREATING PERSON
        Person naturalPersonCreated = PeopleCreation.createPerson("natural person");
        NaturalPerson george = (NaturalPerson) naturalPersonCreated;

        Person legalPersonCreated = PeopleCreation.createPerson("legal person");
        LegalPerson tvcCompany = (LegalPerson) legalPersonCreated;

            // cast made directly in this line ...
        NaturalPerson melanie = (NaturalPerson) PeopleCreation.createPerson("natural person");

        // SETTING DATA
            // natural person
        george.setName("George");
        george.setSurname("Andersen");
        george.setBirthDay("15/07/1965");
        george.setLivingAddress("Colby Street, 65");
        george.setId(46500784);
        george.setEquityValue(875000);
            // testing the toString()
            //System.out.println(george);
            //System.out.println();

        melanie.setName("Melanie");
        melanie.setSurname("MacDonald");
        melanie.setBirthDay("23/09/2005");
        melanie.setLivingAddress("Fifth Avenue, 09 - Nyc");
        melanie.setId(445673);
        melanie.setEquityValue(980470);
            // testing the toString()
            //System.out.println(melanie)
            //System.out.println();

            // legal person
        tvcCompany.setName("Tvc Computers");
        tvcCompany.setOwner("Rodrigo Dias Lima");
        tvcCompany.setId(8754619);
        tvcCompany.setBusinessObject("Software Development");
        tvcCompany.setEquityValue(65000);
        tvcCompany.setNumberOfEmployees(47);
            // testing the toString()
            //System.out.println(tvcCompany);


        // ADDING TO LIST
        PeopleDataBase.addNaturalPerson(george);
        PeopleDataBase.addLegalPerson(tvcCompany);
        PeopleDataBase.addNaturalPerson(melanie);


        // Showing List content
            // legal person list
        PeopleDataBase.showContent("legal");
        System.out.println();

            // natural person list
        PeopleDataBase.showContent("natural");
        System.out.println();


    }

    /**
     * This class has methods to create Natural and Legal person.
     * In order to practice, I decided to create an inner class
     * containing those methods.
     */
    class PeopleCreation{
        public static Person createPerson(String typeOfPerson){
            Person newPerson = null;

            if(typeOfPerson.equalsIgnoreCase("natural person")){
                newPerson = new NaturalPerson();
            } else if(typeOfPerson.equalsIgnoreCase("legal person")){
                newPerson = new LegalPerson();
            }
            return newPerson;
        }
        }

}


