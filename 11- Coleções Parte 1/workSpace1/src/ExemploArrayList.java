
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args){
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exampleOrderedNumberList();
        listOfStudents();
    }

    private static void exemploListaSimples(){

        System.out.println("=== Exemplo Lista Simples ===");
        List<String> lista = new ArrayList<>();

        lista.add("Rodrigo Dias Lima");
        lista.add("Elza Aparecida Dias");
        lista.add("Bianca Belentani");

        System.out.println(lista);
        System.out.println("");

    }

    private static void exemploListaSimplesOrdemAscendente(){

        System.out.println("=== Exemplo Lista Simples Ordem Ascendente ===");
        List<String> nameList = new ArrayList<String>();

        nameList.add("Rodrigo Dias Lima");
        nameList.add("Elza Aparecida Dias");
        nameList.add("Bianca Belentani");

        Collections.sort(nameList);

        System.out.println(nameList);
        System.out.println("");

    }

    private static void exampleOrderedNumberList(){

        System.out.println("=== Number Ordered List Example ===");
        List<Integer> numberList = new ArrayList<>();
        List<Character> charList = new ArrayList<>();

        numberList.add(1);
        numberList.add(453);
        numberList.add(9);

        charList.add('x');
        charList.add('y');
        charList.add('z');

        Collections.sort(numberList);

        System.out.println(numberList);
        System.out.println("");

        System.out.println("=== Character List ===");
        System.out.println(charList);

    }

        private static void listOfStudents(){

            List<Student> studentList = new ArrayList<>();

            Student s1 = new Student("Joe", 1989);
            Student s2 = new Student("Pope", 1945);
            Student s3 = new Student("Mary", 1964);

            studentList.add(s1);
            studentList.add(s2);
            studentList.add(s3);

            System.out.println("=== Student List : Year ===");
            Collections.sort(studentList, Student::compareToYear);
            System.out.println(studentList);

            System.out.println("=== Student List : Name ===");
            Collections.sort(studentList, Student::compareToName);
            System.out.println(studentList);

            studentList.remove(0);

            System.out.println("=== Student List : Name ===");
            Collections.sort(studentList, Student::compareToName);
            System.out.println(studentList);

            boolean result1 = studentList.contains("Mary");
            System.out.println(result1);


        }



}
