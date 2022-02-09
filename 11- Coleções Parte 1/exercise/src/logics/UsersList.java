package logics;

import java.util.ArrayList;
import java.util.List;

public class UsersList {
    static List<String[]> maleArray = new ArrayList<>();
    static List<String[]> femaleArray = new ArrayList<>();

    /**
     * This method adds the array[] containing the user
     * information (name and gender) to the maleArray
     * @param userInput
     */
    public void addToMaleGenderArray(String[] userInput){
        maleArray.add(userInput);
    }

    /**
     * This method adds the array[] containing the user
     * information (name and gender) to the maleArray
     * @param userInput
     */
    public void addToFemaleGenderArray(String[] userInput){
        femaleArray.add(userInput);
    }

    /**
     * This method presents the maleArray records
     */
    public void verifyMaleArray(){
        System.out.println("\n=== Verifying MaleArray Content ===");
        for(String[] element: maleArray){
            System.out.println("Name: " + element[0] + " | Gender: " + element[1]);
        }
        System.out.println();
    }

    /**
     * This method presents the femaleArray records
     */
    public void verifyFemaleArray(){
        System.out.println("\n=== Verifying FemaleArray Content ===");
        for(String[] element: femaleArray){
            System.out.println("Name: " + element[0] + " | Gender: " + element[1]);
        }
        System.out.println();
    }

}

