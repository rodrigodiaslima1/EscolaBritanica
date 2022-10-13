package exercicio;

import java.util.Map;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args){

        Map<String, String> peopleMapList = People.fullList();

        System.out.println("===> All entries: ");
        var peopleStream = peopleMapList.entrySet().stream();
        peopleStream.forEach(person -> System.out.printf("Name: %s | Gender: %s\n", person.getKey(), person.getValue()));

        System.out.println("\n===> Female only: ");
        var femalePeople = peopleMapList.entrySet().stream();
        femalePeople.filter(person -> person.getValue().equals("Female")).forEach(femalePerson ->{
            System.out.printf("Name: %s | Gender: %s\n", femalePerson.getKey(), femalePerson.getValue());
        });


        /*
            TEST:
            a.forEach(b -> {
            System.out.println(b.getKey());
            System.out.println(b.getValue());
            });
        */

    }

}
