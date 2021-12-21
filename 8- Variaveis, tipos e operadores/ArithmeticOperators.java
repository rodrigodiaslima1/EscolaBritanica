package operadoresAritimeticos;

/**
 * @author rodrigodiaslima1
 */
public class ArithmeticOperators {
    public static void main(String[] args){

        incrementDecrementOperators();
        relationalOperations();
        // We can call Static method using the class name
        // or directly.
        ArithmeticOperators.logicOperators();

    }

    public static void logicOperators(){

        System.out.println("========================");
        System.out.println("=== Logic Operators ===");
        System.out.println("========================");
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        boolean isBetween10 = num1 > 1 && num1 <= 10;
        boolean isLessThan15 = num2 < 15;
        boolean isEqual30 = num3 == 30;

        System.out.println("\tIs num1 between 1 and 10?");
        System.out.println(isBetween10);

        System.out.println("\tIs num1 between 1 and 10 AND num2 less than 15?");
        System.out.println(isLessThan15 && isBetween10);

        System.out.println("\tIs num2 greater than 20 OR num3 equals 30?");
        System.out.println(isLessThan15 || isEqual30);


        System.out.println();
        System.out.println();
    }

    public static void relationalOperations(){

        System.out.println("========================");
        System.out.println("=== RELATIONAL OPERATIONS ===");
        System.out.println("========================");

        int num1 = 10;
        int num2 = 20;

        System.out.println("\tIsGreater");
        boolean isGreater = num1 > num2;
        System.out.println(isGreater);

        System.out.println("\tIsSame: ");
        boolean isSame = num1 == num2;
        System.out.println(isSame);



        System.out.println();
        System.out.println();
    }

    public static void incrementDecrementOperators(){

        System.out.println("=====================================");
        System.out.println("=== INCREMENT DECREMENT OPERATORS ===");;
        System.out.println("=====================================");

        System.out.println("\tUsing postFix increment: ");
        int num1 = 10;
        System.out.println("Original value: " + num1);
        System.out.println(num1++);
        System.out.println(num1);
        System.out.println("\tUsing preFixed increment: ");
        int num2 = 20;
        System.out.println("Original value: " + num2);
        System.out.println(++num2);
        System.out.println(num2);

        System.out.println();
        System.out.println();
    }

}
