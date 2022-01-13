package WhatIsYourAge;

import java.util.Scanner;

public class InternalLogic {

    public int getAge(){
        Scanner userScan = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = userScan.nextInt();

        return age;
    }

    public void checkAge(int age){

        if(age < 18){
            System.out.println("You are still a baby!");
        } else if(age >= 18 && age < 30){
            System.out.println("You are discoverying life ...");
        } else if(age >= 30 && age < 40){
            System.out.println("You are in the perfect moment to know your path ...");
        } else{
            System.out.println("Enjoy life ...");
        }

    }

}
