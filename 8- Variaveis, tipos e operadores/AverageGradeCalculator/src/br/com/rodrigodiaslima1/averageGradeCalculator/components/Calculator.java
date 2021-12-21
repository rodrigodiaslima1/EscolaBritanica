package br.com.rodrigodiaslima1.averageGradeCalculator.components;

/**
 * The Calculator Class groups all logic spread
 * through classes (in the components package)
 * in a single one.
 *
 * @author rodrigodiaslima1
 */
public class Calculator {

    private int numberOfGrades = 4;

    Grade grade = new Grade();
    GradeBook gradebook = new GradeBook();
    InternalLogic calculator = new InternalLogic();

    public String run() {

        while (numberOfGrades != 0) {
            double userGrade = grade.inputGrade();
            gradebook.insertOnGradebook(userGrade);
            numberOfGrades--;
        }

        double sum = calculator.sumUpGrades(gradebook);
        double avg = calculator.calculateAverageValue(gradebook, sum);

        System.out.println();
        return String.format("Average Grade: " + avg);
    }

}
