package breakAndContinue;

public class ContinueApp {

    public static void main(String[] args) {


        for(int contador = 1; contador <= 1000; contador++){

            if (contador % 7 != 0){
                continue;
            } else{
                System.out.println("Contador: " + contador);
            }
        }


    }
}
