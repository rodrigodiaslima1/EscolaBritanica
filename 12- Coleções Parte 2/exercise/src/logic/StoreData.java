package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


/**
 * This class receives an array of Strings and store
 * its values inside a ArrayList<>. Here we also sort
 * the elements, and return an ArrayList with ordered
 * elements.
 */
public class StoreData {

    static List<String> boxOfWords = new ArrayList<>();

    public static List<String> convertToArrayList(String[] splittedData){
        for(String data: splittedData){
            boxOfWords.add(data);
        }
        Collections.sort(boxOfWords);
        System.out.println();

        return boxOfWords;
    }

    public static void showData(List<String> dataList){
        System.out.println("\n=== Check for Data inside your List ===");
        for(String element: dataList){
            System.out.println(element);
        }
        System.out.println();
    }

}
