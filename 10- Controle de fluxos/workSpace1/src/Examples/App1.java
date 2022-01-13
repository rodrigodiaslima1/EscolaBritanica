package Examples;

import java.util.stream.IntStream;

public class App1 {

    public static void main(String[] args){

        for(int contador=1; contador<=100;contador++){
            if(contador%5!=0){
                continue;
            }
            System.out.println("Contador: " + contador);
        }

        System.out.println();

        IntStream.range(1, 101).forEach(n -> {
            if(n % 5 == 0)
                System.out.println("Contador: " + n);

        });

    }
}
