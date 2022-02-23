package model1;

public class Hourly extends Employee {

    double hourPrice;
    double workedHours;

    public double getHourPrice(){
        return hourPrice;
    }

    public double getWorkedHours(){
        return workedHours;
    }

    public void setHourPrice(double hourPrice){
        this.hourPrice = hourPrice;
    }

    public void setWorkedHours(double workedHours){
        this.workedHours = workedHours;
    }

    public double salary(){
        return hourPrice * workedHours;
    }

}
