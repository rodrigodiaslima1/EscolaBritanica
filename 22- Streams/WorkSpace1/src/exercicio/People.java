package exercicio;

import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;

public class People {

    static Map<String, String> people = new HashMap<>();

    public static Stream peopleStream(){
        return people.entrySet().stream();
    }

    public static void addPerson(String name, String gender){
        people.put(name, gender);
    }

    public static Map<String, String> fullList(){
        People.addPerson("Rodrigo", "Male");
        People.addPerson("Elza", "Female");
        People.addPerson("Bianca", "Female");
        People.addPerson("George", "Male");
        People.addPerson("Robin", "Female");
        People.addPerson("John", "Male");
        People.addPerson("Anastasia", "Female");

        return people;
    }

}
