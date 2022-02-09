package list;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class PerformanceTestList {

    public static void main(String[] args){
        PerformanceTestList.arrayListAddTest();
        System.out.println();
        PerformanceTestList.linkedListAddTest();
    }

    private static void arrayListAddTest(){
        final int MAX = 20000;
        long beginTime = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < MAX; i++){
            list.add(i);
        }

//        for(int i = 0; i < MAX; i++){
//            list.contains(i);
//        }

        long finalTime = System.currentTimeMillis();
        System.out.println("Total ArrayList Add Time: " + (finalTime - beginTime));

    }

    private static void linkedListAddTest(){
        final int MAX = 20000;
        long beginTime = System.currentTimeMillis();
        List<Integer> list = new LinkedList<>();

        for(int i = 0; i < MAX; i++){
            list.add(i);
        }

//        for(int i = 0; i < MAX; i++){
//            list.contains(i);
//        }

        long finalTime = System.currentTimeMillis();
        System.out.println("Total LinkeList Add Time: " + (finalTime - beginTime));
    }

}
