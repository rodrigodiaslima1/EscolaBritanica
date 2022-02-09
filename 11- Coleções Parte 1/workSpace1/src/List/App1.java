package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App1 {

    public static void main(String[] args){

        listExample();
        orderedListExample();

    }

    public static void listExample(){
        System.out.println("=== List Example ===");
        List<String> stringList = new ArrayList<>();

        stringList.add("Rodrigo");
        stringList.add("Elza");
        stringList.add("Bianca");

        System.out.println(stringList);
        System.out.println();
    }

    public static void orderedListExample(){
        System.out.println("=== Ordered List Example ===");
        List<Integer> numberList = new ArrayList<>();

        numberList.add(1);
        numberList.add(45);
        numberList.add(5343);
        numberList.add(0);

        System.out.println(numberList);

        Collections.sort(numberList);
        System.out.println(numberList);

        System.out.println();


    }

}
