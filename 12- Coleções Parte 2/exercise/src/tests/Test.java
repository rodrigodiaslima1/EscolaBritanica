package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        //String myWords = "rodrigo, dias, lima, is, a, winner";
        //SplitTest.testingSplit(myWords);

        Tests.testCollectionsSort();

    }

    static class Tests{

        public static void testingSplit(String seriesOfWords){

            String[] arrayOfWrods = seriesOfWords.split(",");

            for(String word: arrayOfWrods){
                System.out.println(word);
            }
            System.out.println();

            System.out.println("= Acessing a single value =");
            System.out.println(arrayOfWrods[2]);
        }

        public static void testCollectionsSort(){

            List<String> fruits = new ArrayList<>();

            fruits.add("melon");
            fruits.add("apple");
            fruits.add("banana");

            for(String fruit: fruits){
                System.out.println(fruit);
            }

            System.out.println();

            Collections.sort(fruits);

            System.out.println(fruits);


        }

    }

}
