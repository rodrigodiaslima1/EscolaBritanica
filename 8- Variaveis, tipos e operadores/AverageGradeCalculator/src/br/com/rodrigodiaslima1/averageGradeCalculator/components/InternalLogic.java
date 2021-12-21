package br.com.rodrigodiaslima1.averageGradeCalculator.components;


/**
 * InternalLogic Class is responsible to execute all
 * arithmetic calculations to our application.
 *
 * @author rodrigodiaslima1
 */
public class InternalLogic {

    private double theSum = 0.0;
    private double theAverage = 0.0;
    /*
    * theSum = (g1 + g2 + g3 + g4)
    * */

    public double sumUpGrades(GradeBook book){
        for(double grade: book.openGradebook()){
            theSum += grade;
        }
        return theSum;
    }

    public double calculateAverageValue(GradeBook book, double sum){
        int size = book.sizeOfGradebook();
        return sum / size;
    }

    public double averageCalculator(GradeBook gradeBook){
        return 0.0;
    }

    public double getTheSum(){
        return this.theSum;
    }

    public double getTheAverage(){
        return this.theAverage;
    }

}
