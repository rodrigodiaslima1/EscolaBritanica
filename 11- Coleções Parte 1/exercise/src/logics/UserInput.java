package logics;

import java.util.Scanner;

public class UserInput {
    /**
     * This method is used to grab the user input
     * (name and gender) using the Scanner. After
     * that, the two data are store in a "normal"
     * array called userInfo. This array, according
     * to the gender defined, is going to be sent
     * as element in the correct ArrayList
     * (maleArray or FemaleArray).
     *
     * @return
     */
    public String[] userInputList(){
        Scanner nameScan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = nameScan.next();

        Scanner genderScan = new Scanner(System.in);
        System.out.print("What is your gender: ");
        String gender = genderScan.next();

        String[] userInfo = {name, gender};

        return userInfo;
    }

}
