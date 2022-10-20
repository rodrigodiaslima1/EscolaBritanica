package aula3.limit;

import aula2.Person;
import java.util.List;

public class App {

    public static void main(String[] args){

        List<Person> personList = Person.createPeople();

        personList.stream().filter(person -> person.getNationality().equals("Brazilian")).limit(2).forEach(person ->{
            System.out.println(person.getName());
        });

        System.out.println(personList.stream().filter(person -> person.getNationality().equals("Brazilian")).count());

    }

}
