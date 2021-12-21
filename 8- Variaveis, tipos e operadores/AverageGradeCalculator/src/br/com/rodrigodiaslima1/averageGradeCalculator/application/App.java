package br.com.rodrigodiaslima1.averageGradeCalculator.application;

import br.com.rodrigodiaslima1.averageGradeCalculator.components.Calculator;

public class App {

    public static void main(String[] args){

        Calculator calculator = new Calculator();

        System.out.println(calculator.run());

    }

}
