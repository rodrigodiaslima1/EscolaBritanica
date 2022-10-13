package aula3;

import java.util.stream.Stream;
import java.util.Comparator;
import java.util.List;
import aula2.Person;

public class App {

    public static void main(String[] args){

        List<Person> personList = Person.createPeople();

        System.out.println("===> Ascending Order: ");

        System.out.println("=> Name: ");
        Stream<Person> nameAscendingOrder = personList.stream()
                .filter(person -> person.getNationality().equals("Brazilian"))
                .sorted(Comparator.comparing(person -> person.getNationality()));

        nameAscendingOrder.forEach(person -> System.out.println(person.getName()));

        System.out.println("\n=> Age: ");
        Stream<Person> ageAscendingOrder = personList.stream()
                        .sorted(Comparator.comparing(Person::getAge));

        ageAscendingOrder.forEach(person -> System.out.println(person.getName()));

        //============================================================================

        System.out.println("\n===> Descending Order: ");
        Stream<Person> ageDescendingOrder = personList.stream()
                .filter(person -> person.getNationality().equals("Brazilian"))
                .sorted((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()));

        ageDescendingOrder.forEach(person -> System.out.println(person.getName()));
        // Stream has already been operatred and closed
        //ageDescendingOrder.forEach(person -> System.out.println(person.getAge()));

        /*Stream nameDescendingOrder = personList.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getName(), p1.getName());*/

    }

}
