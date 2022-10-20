package exercicio;

import java.sql.Array;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

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
        People.addPerson("Allison", "Female");
        People.addPerson("George", "Male");
        People.addPerson("Robin", "Female");
        People.addPerson("John", "Male");
        People.addPerson("Anastasia", "Female");

        return people;
    }

    public static String[] femaleOnly(){
        var peopleMap = People.fullList();
        var peopleStream = peopleMap.entrySet().stream();
        var a = peopleStream.filter(p -> p.getValue().equals("Female")).toArray();

        int index = 0;
        String[] peopleArray = new String[a.length];
        for(Object gender: a){
            String genderString = gender.toString();
            peopleArray[index++] = genderString;
        }

        return peopleArray;
    }

}
