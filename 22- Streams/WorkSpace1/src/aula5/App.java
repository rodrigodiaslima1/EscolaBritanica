package aula5;

import aula2.Person;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args){

        List<Person> people = Person.createPeople();

        List<Person> personList = people
                .stream()
                .filter(p -> p.getName().startsWith("R"))
                .collect(Collectors.toList());

        personList.forEach(person -> {System.out.println(person.getName());});

        //===================

        List<Person> pList = Person.createPeople();
        Stream<Person>  pStream = pList.stream();
        List<Person> pListAgain = pStream.toList();
        Object[] pListObjectArray = pListAgain.stream().toArray();

        //====================

        var streamList= pList.stream();

        var a = streamList.collect(Collectors.toList());

    }

}
