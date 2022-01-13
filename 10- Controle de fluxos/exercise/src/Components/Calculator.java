package Components;

public class Calculator {

    private int numberOfGrades = 4;

    Grade grade = new Grade();
    GradeBook gradeBook = new GradeBook();
    InternalLogic innerLogic = new InternalLogic();

    public String run(){

        while (numberOfGrades != 0){
            double userGrade = grade.inputGrade();
            gradeBook.insertOnGradeBook(userGrade);
            numberOfGrades--;
        }

        double sum = innerLogic.sumUpGrades(gradeBook);
        double avg = innerLogic.averageValue(gradeBook, sum);
        String status = innerLogic.defineStatus(avg);


        System.out.println();
        return String.format("Average Grade: " + avg + "\nYou are: " + status);

    }

}
