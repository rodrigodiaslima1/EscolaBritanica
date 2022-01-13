package Components;

import java.util.Scanner;

public class Grade {

    Scanner userInput = new Scanner(System.in);

    public double inputGrade(){
        System.out.print("Insert your grade: ");
        double grade = userInput.nextDouble();
        return grade;
    }

}
