package exercicio2;

import java.util.List;

public class App {

    public static void main(String[] args){

        List<Person> femaleList = People.femaleList();
        femaleList.forEach(female -> System.out.println(female.getGender()));

    }

}
