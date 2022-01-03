package br.com.rodrigodiaslima1;
import java.util.Scanner;
public class App4 {

    public String getAge(int number){

        String result;

        switch (number){
            case 18:
                result = "You are 18";
                break;
            default:
                result = "Default Value";
                break;
        }
        return result;
    }


    public static void main(String[] args){


        App4 app4 = new App4();
        Scanner ageScan = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = ageScan.nextInt();


        System.out.println(app4.getAge(age));

        }

}


