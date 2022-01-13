package Components;

public class InternalLogic {

    private double theSum = 0.0;
    private double theAverage = 0.0;
    private String status;
    public double sumUpGrades(GradeBook book){
        for(double grade: book.openGradeBook()){
            theSum += grade;
        }
        return theSum;
    }

    public double averageValue(GradeBook book, double sum){
        int size = book.sizeOfGradeBook();
        this.theAverage = sum/size;
        return theAverage;
    }

    public double getTheSum(){return this.theSum; }

    public double getTheAverage(){ return this.theAverage; }

    public String defineStatus(double averageGrade){

        if(averageGrade >= 7){
            status = "Approved";
        } else if(averageGrade < 7 && averageGrade >= 5){
            status = "recovery time";
        } else if(averageGrade < 5 && averageGrade >= 0){
            status = "reproved";
        }

        return status;

    }

}
