package model1;

public class App {

    public static void main(String[] args){

        Hired hired = new Hired();
        Employee commissioned = new Comissioned();
        Employee hourly = new Hourly();

        System.out.println("=== Hired ===");
        hired.getSalary();

        System.out.println("=== Commissioned ===");


        System.out.println("=== Hourly ===");


        System.out.println("=== Tests ===");
        boolean test = hired instanceof Hired;
        System.out.println(test);

        boolean ternaryTest = Boolean.parseBoolean(hired instanceof Hired ? "Yes, it is": "No, it isn't");

        String ternaryTest2 = hired instanceof Hired? "Yes, it is": "No, it is not";

        System.out.println("===========================");
        System.out.println(ternaryTest);

    }

}
