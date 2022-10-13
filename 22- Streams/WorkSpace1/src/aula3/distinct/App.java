package aula3.distinct;

import aula2.Person;
import java.util.List;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args){

        List<Person> personList = Person.createPeople();

        Stream distinctPerson = personList.stream().distinct();

        distinctPerson.forEach(person -> {
            Person p = (Person) person;
            System.out.println(p.getName());
        });

        System.out.println("\n");

        personList.stream().forEach(person -> System.out.println(person.getName()));

        // Aula 3 tempo 9min23 -> LIMIT

    }


}
