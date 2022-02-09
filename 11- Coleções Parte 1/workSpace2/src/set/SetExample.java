package set;

import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class SetExample {

    public static void main(String[] args){
        hashSetExample();
    }

    private static void hashSetExample(){

        Set<Integer> lotteryNumbers = new HashSet<>();

        lotteryNumbers.add(23);
        lotteryNumbers.add(134);
        lotteryNumbers.add(5);
        lotteryNumbers.add(89);

        System.out.println(lotteryNumbers);

    }

    private static void orderedSetListExample(){
        System.out.println("=== Set Ordered List Example ===");
        Set<Integer> lotteryNumbers = new HashSet<>();

        lotteryNumbers.add(23);
        lotteryNumbers.add(134);
        lotteryNumbers.add(5);
        lotteryNumbers.add(89);

        
    }

}
