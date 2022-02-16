package map;

import java.util.*;

public class App {

    public static void main(String[] args){
        //Examples.hashMapExample();
        //Examples.treeMapExample();
    }

    public static class Examples{

        public static void hashMapExample(){

            System.out.println("=== HashMap Simple Example ===");
            Map<Integer, String> mapList = new HashMap<>();

            mapList.put(1, "Rodrigo Dias Lima");
            mapList.put(2, "Elza Aparecida Dias");
            mapList.put(3, "Bianca Belentani");

            for(String value: mapList.values()){
                System.out.println(value);
            }

            System.out.println();

            for(Integer value: mapList.keySet()){
                System.out.println(value);
            }

        }

        public static void treeMapExample(){

            System.out.println("=== TreeMap Simple Example ===");
            Map<Integer, String> list = new TreeMap<>();

            list.put(1, "Rodrigo Dias Lima");
            list.put(2, "Elza Aparecida Dias");

            System.out.println("= General keys and values =");

            list.entrySet().stream().forEach(System.out::println);

            System.out.println();

            System.out.println("= For Each Stream 1 =");
            list.keySet().stream().forEach(x -> {
                System.out.println(x);
            });

            System.out.println();

            System.out.println("= For Each Stream 1 =");
            list.values().stream().forEach(x -> {
                System.out.println(x);
            });

            System.out.println();

            System.out.println("= Using this EntrySet =");
            System.out.println("= For Each Stream 2 =");
            list.entrySet().stream().forEach(x -> {
                System.out.println(x);
            });

            System.out.println();

            System.out.println("= New For Each =");
            list.values().stream().forEach(System.out::println);

            System.out.println("= New For Each =");
            list.keySet().stream().forEach(System.out::println);

            System.out.println();

            System.out.println("= Using .get() =");

            String name0 = list.get(0);
            String name1 = list.get(1);
            String name2 = list.get(2);

            System.out.println(name0);
            System.out.println(name1);
            System.out.println(name2);

        }

        public static void classRoom(){

            Map<Integer, List<Student>> myClassRoom = new HashMap<>();

            List<Student> studentList = new ArrayList<>(10);


        }

        public static class ClassRoom{

            Map<Integer, List<Student>> classRoom = new HashMap<>();

            private static List<Student> createClass(String name, int count){
                List<Student> student = new ArrayList<>();
                for(int i = 0; i < count; i++){
                    Student student = new Student("Name: ", )
                }
            }

        }

    }

}
