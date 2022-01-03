package br.com.rodrigodiaslima1;

public class App {

    public static void main(String[] args){

        Converter converter = new Converter();
        int primitiveInt = converter.scanPrimitiveInt();
        converter.giveWrapper(primitiveInt);

    }

}
