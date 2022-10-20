package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class People {

    public static List<Person> populate(){
        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("Rodrigo", "male"));
        peopleList.add(new Person("Elza", "female"));
        peopleList.add(new Person("Elizabeth", "female"));
        peopleList.add(new Person("George", "male"));
        peopleList.add(new Person("Anne", "female"));

        return peopleList;
    }

    public static List<Person> femaleList(){
        List<Person> generalList = populate();
        List<Person> femaleList = generalList.stream().
                filter(person -> person.getGender().equals("female")).toList();

        return femaleList;
    }

}
