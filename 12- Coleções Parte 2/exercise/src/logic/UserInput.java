package logic;

import java.util.Scanner;


/**
 * This class asks for user input a row of strings
 * separated by commas, and return a String called
 * stringRow. This String must be used in the class
 * Slicer as a parameter to its unique method.
 */
public class UserInput {

    private static Scanner userScan = new Scanner(System.in);

    public static String getARowOfPeople(){
        System.out.print("Enter a row of Strings separated by commas (ex> blue, red, gray ...): ");
        String stringRow = userScan.nextLine();

        return stringRow;
    }

}
