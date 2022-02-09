package list;

import com.sun.security.jgss.GSSUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Linked List: Each node has a reference to the next one
 *              1- Inclusions and Exclusions are fast
 *              2- Search is slow
 *
 */

public class LinkedListExamples {

    public static void main(String[] args){
        simpleListExample();
        orderedSimpleListExample();
    }

    private static void simpleListExample(){
        System.out.println("=== Simple List Example ===");
        List<String> auctionList = new LinkedList<>();

        auctionList.add("move1");
        auctionList.add("move2");
        auctionList.add("move4");
        auctionList.add("move3");

        System.out.println(auctionList);

        System.out.println("=== Verifying an specified value ===");
        System.out.println("Is move3 in auctionList?");
        boolean check = auctionList.contains("move3");
        System.out.println(check);

        System.out.println();
    }

    private static void orderedSimpleListExample(){
        System.out.println("=== Ordered Simple List Example ===");
        List<Double> temperatureList = new LinkedList<>();

        temperatureList.add(0.45);
        temperatureList.add(0.78);
        temperatureList.add(0.12);
        temperatureList.add(0.99);

        Collections.sort(temperatureList);
        System.out.println(temperatureList);
        System.out.println();


    }

}
