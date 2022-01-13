package Components;

public class GradeBook {

    private double[] grades = new double[4];
    public static int index = 0;

    public void insertOnGradeBook(double grade){
        grades[index] = grade;
        index++;
    }

    public double[] openGradeBook(){
        return grades;
    }

    public int sizeOfGradeBook(){
        return grades.length;
    }

    public void checkGradeBookValues(){
        for(double grade: grades){
            System.out.println(grade);
        }
    }


}
