package set;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {

    public static void main(String[] args){

        treeExample();

    }

    private static void treeExample(){
        System.out.println("=== Tree Set Example ===");
        Set<String> cities = new TreeSet<>();

        cities.add("Saint Petersburg");
        cities.add("São Paulo");
        cities.add("Berlin");
        cities.add("Berlin");

        System.out.println(cities);
        System.out.println();
    }

}
