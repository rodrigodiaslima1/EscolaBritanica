package breakAndContinue.switchCaseAndDefault;

import java.util.Scanner;

public class SwitchCaseDefault {

    public static void main(String[] args) {

        System.out.println("Type your grade: ");
        System.out.println("-- from 0 to 5 --");
        Scanner userScan = new Scanner(System.in);
        Integer grade = userScan.nextInt();

        switch(grade){
            case 0:
            case 1:
                System.out.println("This grade is bellow the expected ...");
                break;
            case 2:
            case 3:
                System.out.println("This grade is good, but not enough ...");
                break;
            case 4:
                System.out.println("You are on the way to fly ...");
                break;
            case 5:
                System.out.println("You rock!!");
                break;
            default:
                System.out.println("This is the default output ...");

        }

    }

}
