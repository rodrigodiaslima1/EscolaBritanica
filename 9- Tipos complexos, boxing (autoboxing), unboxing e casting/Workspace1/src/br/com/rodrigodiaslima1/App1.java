package br.com.rodrigodiaslima1;

public class App1 {

    public static void main(String[] args){

        // WRAPPER
        Integer number1 = 2;
        Integer number2 = 2;

        int number3 = 3;
        int number4 = 4;

        System.out.println(number1.compareTo(number2));
        System.out.println(number1.compareTo(number3));

        // BOXING (AUTOBOXING)
        // CONVERTING THE PRIMITIVE TYPE TO A REFERENCE
        // OF WRAPPER TYPE
        Integer boxingInteger = 1;
        Long boxingLong = 12345123123123L;
        Float boxingFloat = 1.0f;
        Double boxingDouble = 1.0;
        Boolean boxingBoolean = true;
        Character boxingCharacter = 'c';

        /*

        UNBOXING (DEPRECATED)
        int unboxingInteger = new Integer(1);
        long unboxingLong = new Long(123456);
        float unboxingFloat = new Float(1.0);
        double unboxingDouble = new Double(1.0);
        boolean unboxingBoolean = new Boolean(true);
        char unboxingCharacter = new Character('a');

        * Use the following way to unbox in exchange to
        the former way

        * */

        int id = Integer.valueOf(3);
        long cpf = Long.valueOf(123456);

        // CASTING

        /*
        * Casting is a resource that allow us to change a type's value
        * to another value. We have implicit casting and explicit one.
        *
        * Casting primitives
        *
        * bits: (64)         (32)         (16)      (8)      (1)
        * long, double > float, int > short, char > byte > boolean;
        *
        * * */

        // 64 bits
        long longBox1 = 12345;
        double doubleBox1 = 1.0;
        long longBox2;
        double doubleBox2;
        // 32 bits
        int intBox1 = 10;
        float floatBox1 = 1.0f;
        int intBox2;
        float floatBox2;
        // 16 bits
        short shortBox1 = 3;
        char charBox1 = 'a';
        short shortBox2;
        char charBox2;
        // 8 bits
        byte byteBox1 = 1;
        byte byteBox2;
        // 1 bit
        boolean booBox1 = true;
        boolean booBox2;

        byteBox1 = (byte)shortBox1;
        


//        Integer key = 101;
//        Float keyFloat = (Float)key;







    }

}
