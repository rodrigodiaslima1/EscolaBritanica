package br.com.rodrigodiaslima1;

import java.util.Scanner;

public class Converter {

    public int scanPrimitiveInt(){
        Scanner userScan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return userScan.nextInt();
    }

    public void giveWrapper(int number){

        Integer wrappedNumber = (Integer) number;
        System.out.println(wrappedNumber.getClass());
        System.out.println("Wrapped Number: " + wrappedNumber);

    }

}
