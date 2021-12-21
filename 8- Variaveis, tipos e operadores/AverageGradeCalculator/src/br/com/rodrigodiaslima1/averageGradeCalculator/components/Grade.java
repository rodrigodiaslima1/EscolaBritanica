package br.com.rodrigodiaslima1.averageGradeCalculator.components;

import java.util.Scanner;

/**
 * This Class contains the inputGrade() method
 * Therefore from her is possible to get the grades
 * provided by the user
 *
 * @author rodrigodiaslima
 */
public class Grade {

    Scanner userInput = new Scanner(System.in);

    public double inputGrade(){
        System.out.print("Insert your grade: ");
        double grade = userInput.nextDouble();
        return grade;
    }

}
