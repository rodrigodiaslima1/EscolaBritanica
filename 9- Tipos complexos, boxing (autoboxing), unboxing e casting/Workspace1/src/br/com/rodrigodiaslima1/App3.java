package br.com.rodrigodiaslima1;

import org.w3c.dom.ls.LSOutput;

public class App3 {

    static int number1 = 11;
    static int number2 = 21;

    public static String getStatmentNumber(int number){
        String result;
        switch (number){
            case 11:
                result =  "You are 11";
                break;
            case 21:
                result =  "You are 21";
                break;
            case 31:
                result = "You are 31";
                break;
            default:
                result = "Default value";

        }
        return result;
    }

    public static void main(String[] args){

        int number1 = 51;

        System.out.println(App3.getStatmentNumber(number1));
        System.out.println(App3.getStatmentNumber(number2));

    }

}
