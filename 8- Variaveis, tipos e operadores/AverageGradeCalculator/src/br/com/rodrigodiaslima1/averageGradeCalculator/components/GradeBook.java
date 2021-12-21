package br.com.rodrigodiaslima1.averageGradeCalculator.components;


/**
 * GradeBook Class provide us with the grades array.
 * All user's grades (from Grade.java) are going to
 * be stored here.
 *
 * @author rodrigodiaslima1
 */
public class GradeBook {

    private double[] grades = new double[4];
    public static int index = 0;

    public void insertOnGradebook(double grade){
        grades[index] = grade;
        index++;
    }

    public double[] openGradebook(){
        return grades;
    }

    public int sizeOfGradebook(){
        return grades.length;
    }

    public void checkGradebookValues(){
        for(double grade: grades){
            System.out.println(grade);
        }
    }



}
