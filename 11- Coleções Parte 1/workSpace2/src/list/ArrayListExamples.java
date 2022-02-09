package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author rodrigodiaslima1
 * Iterable <--- Collection <--- List; Queue; Set
 *
 * ArrayList: you can increase its size
 *            1- in a fast way you can search elements
 *            2- but it is  slow to insert on exclude elemennts
 *
 */

public class ArrayListExamples {

    public static void main(String[] args){

        simpleListExample();
        orderedSimpleListExample();
        objectList();

    }

    private static void simpleListExample(){
        System.out.println("=== Simple List Example ===");

        List<String> simpleList = new ArrayList<>();

        simpleList.add("Rodrigo");
        simpleList.add("Elza");
        simpleList.add("João");
        simpleList.add("Anastasia");

        System.out.println(simpleList);
        System.out.println(simpleList.getClass());
        System.out.println();

    }

    private static void orderedSimpleListExample(){
        System.out.println("=== Ordered Simple List Example ===");

        List<Integer> numberList = new ArrayList<>();

        numberList.add(21);
        numberList.add(89);
        numberList.add(12);

        System.out.println(numberList);
        System.out.println(numberList.getClass());
        System.out.println();

    }

    private static void objectList(){

        System.out.println("=== Object List Example ===");

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Natalia", "Law"));
        studentList.add(new Student("Rodrigo", "Java"));
        studentList.add(new Student("Elza", "History", 10, "Spirit Room"));

        Collections.sort(studentList);

        System.out.println(studentList);
        System.out.println(studentList.getClass());
        System.out.println();


        // ORDER BY GRADE - USING ANONYMOUS CLASS
        Comparable<Student> gradeOrder = new Comparable<Student>() {
            @Override
            public int compareTo(Student o) {
              return 0;
            }
        };

    }

}
