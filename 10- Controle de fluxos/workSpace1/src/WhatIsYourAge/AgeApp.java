package WhatIsYourAge;

public class AgeApp {

    public static void main(String[] args){

        InternalLogic iL = new InternalLogic();

        int myAge = iL.getAge();
        iL.checkAge(myAge);

    }

}
