package set;

import List.Student;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetExamples {

    public static void main(String[] args){

        simpleListExample();
        orderedSimpleListExample();
        newExample();
        objectsExample();

    }

    public static void simpleListExample(){
        System.out.println("=== Simple List example ===");
        Set<String> simpleList = new HashSet<>();

        simpleList.add("Rodrigo");
        simpleList.add("Elza");
        simpleList.add("Eleonor");
        simpleList.add("Rodrigo");

        System.out.println(simpleList);
        System.out.println();
    }

    public static void orderedSimpleListExample(){
        System.out.println("=== Ordered Simple List Example ===");
        Set<String> orderedSimpleList = new HashSet<String>();

        orderedSimpleList.add("Rodrigo");
        orderedSimpleList.add("Elza");
        orderedSimpleList.add("Eleonor");

        //Collections.sort(orderedSimpleList);

        System.out.println(orderedSimpleList);
        System.out.println();
    }

    private static void newExample(){
        System.out.println("=== New Example ===");
        Set<Integer> integers = new HashSet<>();

        integers.add(3);
        integers.add(2);
        integers.add(1);
        integers.add(1);

        System.out.println(integers);
        System.out.println();
    }

    private static void objectsExample(){
        System.out.println("=== Objects Example ===");
        Set<Student> studentsList = new HashSet<>();

        Student a = new Student("George", "Best");
        Student b = new Student("Lionel", "Messi");
        Student c = new Student("Cristiano", "Ronaldo");
        Student d = new Student("Lionel", "Messi");
        Student f = new Student("Robert", "Green");
        Student g = new Student("Lionel", "Messi");

        // IT'S ORDERING BY THE VARIABLE LETTERS
        studentsList.add(c);
        studentsList.add(a);
        studentsList.add(b);
        studentsList.add(d);

        System.out.println(studentsList);
        System.out.println();

        // CONSULTING
        System.out.println(studentsList.contains(a));
        System.out.println(studentsList.contains(f));
        System.out.println(studentsList.contains(g));

        // REMOVING
        studentsList.remove(c);

        System.out.println(studentsList);
        System.out.println();

        for(Student student: studentsList){
            System.out.println(student);
        }
    }

}
