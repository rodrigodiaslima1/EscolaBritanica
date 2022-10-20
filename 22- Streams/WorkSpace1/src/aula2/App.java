package aula2;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;



/**
 * Processing Streams: how to transform
 * and process them using:
 *      filter()
 *      map()
 *      sorted()
 *      limit()
 *      distinct()
 */
public class App {

    public static void main(String[] args){

        List<Person> peopleList = Person.createPeople();

        // The code bellow receives a predicated, which request a boolean condition
        Stream stream = peopleList.stream().filter(person -> {
           return person.getNationality().equals("English");

        });


        Stream stream2 = peopleList.stream()
                .filter(person -> person.getNationality().equals("Brazilian"))
                .map(Person::getAge);

        IntStream stream3 = peopleList.stream()
                        .filter(person -> person.getNationality().equals("Brasilian"))
                                .mapToInt(Person::getAge);


        stream.forEach(o -> {
            Person person = (Person) o;

            System.out.println(person.getName());
            System.out.println(person.getNationality());
            System.out.println();
        });

        //===============================================================================

        Predicate<Person> predicate1 = person -> person.getNationality().equals("Brazilian");
        Stream stream22= peopleList.stream().filter(predicate1);

        Predicate<Person> predicate2 = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getNationality().equals("Brazilian");
            }
        };


        // PARAMOS AOS 12 MINUTOS DO DA AULA 2: OPERAÇÕES INTERMEDIARIAS PARTE 1

    }

}
