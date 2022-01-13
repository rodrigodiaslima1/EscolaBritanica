package breakAndContinue;

import java.util.Scanner;

public class WhileApp {

    public static void main(String[] args){

        Scanner userScan = new Scanner(System.in);
        System.out.print("Would you like to generate a number's multiplication table? ");
        String answer = userScan.next();


        while(answer.equalsIgnoreCase("yes")){
            System.out.print("Type a number: ");
            int number = userScan.nextInt();
            for(int num = 1; num < 11; num++){
                System.out.println(number + " X " + num + " = " + (num * number));
            }

            System.out.println("Would you like to keep the program running? ");
            answer = userScan.next();

        }

        System.out.println("\nGoodBye ...");


    }
}
