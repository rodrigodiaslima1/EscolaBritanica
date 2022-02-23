package model1;

public class Hired extends Employee {

    double salary;

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public double salary(){
        return salary;
    }

    public void myMethod(){
        System.out.println("Hello...");
    }

}
