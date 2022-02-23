package exercise;

import java.util.ArrayList;
import java.util.List;


/**
 * This class provides the two types of list.
 * naturalPersonList and legalPersonList
 *
 * @author rodrigodiaslima1
 */
public class PeopleDataBase {

    private static List<NaturalPerson> naturalPersonList = new ArrayList<>();
    private static List<LegalPerson> legalPersonList = new ArrayList<>();

    public static void addNaturalPerson(NaturalPerson naturalPerson){
        naturalPersonList.add(naturalPerson);
    }

    public static void addLegalPerson(LegalPerson legalPerson){
        legalPersonList.add(legalPerson);
    }

    public static void showContent(String typeOfList){
        if(typeOfList.equalsIgnoreCase("natural")){
            System.out.println("=== Natural Person List ===\n");
            for(NaturalPerson person: naturalPersonList){
                System.out.println(person);
                System.out.println();
            }
        } else if(typeOfList.equalsIgnoreCase("legal")){
            System.out.println("=== Legal Person List ===\n");
            for(LegalPerson person: legalPersonList){
                System.out.println(person);
                System.out.println();
            }
        } else{
            System.out.println("Illegal argument ...");
        }
    }

}
