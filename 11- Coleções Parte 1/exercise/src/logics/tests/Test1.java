package logics.tests;

import java.util.List;
import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args){

        String[] user = {"rodrigo", "male"};
        List<String[]> list = new ArrayList<>();

        list.add(user);

        for(String[] element: list){
            System.out.println("Name: " + element[0]);
            System.out.println("Gender: " + element[1]);
        }

    }

}
