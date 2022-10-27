package exercicio;

import java.util.Map;
import java.util.stream.Stream;
import java.util.List;

public class App {

    public static void main(String[] args){

        Map<String, String> peopleMapList = People.fullList();

        System.out.println("===> All entries: ");
        // Here I used var type. However, if I change to Stream type, the .getKey() and .getValue() methods won't work.
        // So, from where do those methods come from?
        var peopleStream = peopleMapList.entrySet().stream();
        peopleStream.forEach(person -> System.out.printf("Name: %s | Gender: %s\n", person.getKey(), person.getValue()));

        System.out.println("\n===> Female only: ");
        var femalePeople = peopleMapList.entrySet().stream();
        femalePeople.filter(person -> person.getValue().equals("Female")).forEach(femalePerson ->{
            System.out.printf("Name: %s | Gender: %s\n", femalePerson.getKey(), femalePerson.getValue());
        });

        System.out.println("\n===> Testing the femaleOnly() method:");
        Object[] femaleArray = People.femaleOnly();

        for(Object female: femaleArray){
            System.out.println(female);
        }

        System.out.println(femaleArray[0]);

        /*
            TEST:
            a.forEach(b -> {
            System.out.println(b.getKey());
            System.out.println(b.getValue());
            });
        */

    }

}
