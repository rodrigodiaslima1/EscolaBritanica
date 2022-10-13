package aula6;

import aula2.Person;
import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args){

        List people = Person.createPeople();

        Stream peopleStream = people.stream();

/*        Optional optional = peopleStream.
                min(Comparator.comparing(Person::getAge)).
                ifPresentOrElse(System.out::println, new Runnable(){
                    @Override
                    public void run() {

                    }
                });*/

    }

}
