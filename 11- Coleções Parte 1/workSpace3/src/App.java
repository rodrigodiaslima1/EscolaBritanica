import java.util.*;
import java.util.Queue;

public class App {

    public static void main(String[] args){
        QueueBranch.basicPriorityQueueExample();
        QueueBranch.basicArrayDequeExample();
    }

    public static class ListBranch{
        // ArrayList
        public static void arrayListBasicExample(){
            System.out.println("=== ArrayList Example ===");
            List<String> list = new ArrayList<>();

            list.add("Rodrigo Dias Lima");
            list.add("Elza Aparecida Dias");
            list.add("Natalia schekota");

            for(String name: list){
                System.out.println(name);
            }
            System.out.println();

        }

        public static void numberArrayList(){
            System.out.println("== Number ArrayList ==");
            List<Integer> numbers = new ArrayList<>();

            numbers.add(1);
            numbers.add(2);
            numbers.add(99);

            for(int number: numbers){
                System.out.println(number);
            }
            System.out.println();
        }

        public static void sortedArrayList(){
            System.out.println("== Sorted ArrayList ==");
            List<String> names = new ArrayList<>();

            names.add("Wesley");
            names.add("Altair");
            names.add("Bruna");

            Collections.sort(names);
            for(String name: names){
                System.out.println(name);
            }

            System.out.println();

        }

        public static void specificTypeArrayList(){

            Student studentA = new Student("Rodrigo");
            //Student studentB = new Student(21);
            Student studentC = new Student("George", 31);
            //Student studentD = new Student();

            System.out.println("== Setting a specific to an ArrayList ==");
            List<Student> studentsList = new ArrayList<>();

            studentsList.add(studentA);
            //studentsList.add(studentB);
            studentsList.add(studentC);
            //studentsList.add(studentD);

            studentsList.forEach(System.out::println);

            System.out.println();

        }

        public static void sortedSpecificTypeArrayList(){

            Student studentA = new Student("Rodrigo");
            //Student studentB = new Student(21);
            Student studentC = new Student("George", 31);
            //Student studentD = new Student();

            System.out.println("== Setting a specific to an ArrayList (Sorted) ==");
            List<Student> studentsList = new ArrayList<>();

            studentsList.add(studentA);
            //studentsList.add(studentB);
            studentsList.add(studentC);
            //studentsList.add(studentD);

            Collections.sort(studentsList);

            studentsList.forEach(System.out::println);

            System.out.println();

        }

        public static void usingComparator(){

            Student studentA = new Student("Rodrigo", 56);
            Student studentB = new Student("Elza", 32);
            CompareStudentAge ageComparator = new CompareStudentAge();

            List<Student> studentsList = new ArrayList<>();

            studentsList.add(studentA);
            studentsList.add(studentB);

            Collections.sort(studentsList, ageComparator);
            System.out.println("Ordered List by student's age: ");

            studentsList.forEach(System.out::println);

            System.out.println();
        }

        // LinkedList
        public static void linkedListBasicExample(){

            System.out.println("=== LinkedList Example 1 ===");
            List<String> names = new LinkedList<>();

            names.add("Rodrigo");
            names.add("João");
            names.add("Anastasia");

            System.out.println("= First set of names =");
            for(String name: names){
                System.out.println(name);
            }

            System.out.println();
            names.remove(2);

            System.out.println("= Second set of names =");
            for(String name: names){
                System.out.println(name);
            }
            System.out.println();
        }

        public static void arrayListTimeToAdd(){

            final int MAX = 50000;
            long startTime = System.currentTimeMillis();

            List<Integer> list = new ArrayList<>();
            for(int i=0; i<MAX; i++){
                list.add(i);
            }

/*            for(int i=0; i<MAX; i++){
                list.contains(i);
            }*/

            long endTime = System.currentTimeMillis();
            System.out.println("ArrayList adding total time: " + (endTime - startTime));
            System.out.println();
        }

        public static void linkedListTimeToAdd(){

            final int MAX = 50000;
            long startTime = System.currentTimeMillis();

            List<Integer> list = new LinkedList<>();
            for(int i=0; i<MAX; i++){
                list.add(i);
            }

/*            for(int i=0; i<MAX; i++){
                list.contains(i);
            }*/

            long endTime = System.currentTimeMillis();
            System.out.println("LinkedList adding total time: " + (endTime - startTime));
            System.out.println();
        }

        public static void arrayListTimeToConsulting(){

            List<Integer> list = new ArrayList<>();
            final int MAX = 50000;

            for(int i=0; i<MAX; i++){
                list.add(i);
            }

            long startTime = System.currentTimeMillis();

            for(int i=0; i<MAX; i++){
                list.contains(i);
            }

            long endTime = System.currentTimeMillis();

            System.out.println("ArrayList time to Consult: " + (endTime - startTime));
            System.out.println();
        }

        public static void linkedListTimeToConsulting(){

            List<Integer> list = new LinkedList<>();
            final int MAX = 50000;

            for(int i=0; i<MAX; i++){
                list.add(i);
            }

            long startTime = System.currentTimeMillis();

            for(int i=0; i<MAX; i++){
                list.contains(i);
            }

            long endTime = System.currentTimeMillis();

            System.out.println("LinkedList time to consult: " + (endTime - startTime));
            System.out.println();

        }

        public static void arrayListTimeToRemove(){

            final int MAX = 20000;

            List<Integer> list = new ArrayList<>();
            for(int i=0; i < MAX; i++){
                list.add(i);
            }

            long startTime = System.currentTimeMillis();

            for(int i= MAX-1; i>0; i--){
                list.remove(i);
            }

            long endTime = System.currentTimeMillis();

            System.out.println("Total time to remove from Array: " + (endTime - startTime));
            System.out.println();
        }

        public static void linkedListTimeToRemove(){

            final int MAX = 20000;
            List<Integer> list = new LinkedList();

            for(int i =0; i > MAX; i++){
                list.add(i);
            }

            long startTime = System.currentTimeMillis();

            for(int i = MAX-1; i>0; i--){
                list.remove(i);
            }

            long endTime = System.currentTimeMillis();

            System.out.println("Linked List time to Remove: " + (endTime - startTime));;
            System.out.println();
        }
    }


    public static class QueueBranch{


        public static void basicPriorityQueueExample(){

            System.out.println("=== PriorityQueue Basic Example ===");
            Queue<String> names = new PriorityQueue<>();

            names.add("rodrigo");
            names.add("elza");
            names.add("veronica");

            while(names.size() != 0){
                System.out.println(names.remove());
            }
            System.out.println();
        }

        public static void basicArrayDequeExample(){
            System.out.println("=== ArrayDeque Basic Example ===");
            Deque<String> names = new ArrayDeque<>();

            names.add("Rodrigo");
            names.add("Elza");
            names.add("Veronica");

            for(String name: names){
                System.out.println(name);
            }
            System.out.println();
        }

    }

    public static class SetBranch{

    }

    public static class MapBranch{

    }

    public static class SortedMapBranch{

    }

}
