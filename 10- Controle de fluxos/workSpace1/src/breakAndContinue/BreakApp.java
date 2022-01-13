package breakAndContinue;

public class BreakApp {

    public static void main(String[] args){


        for(int contador = 1; contador <= 1000; contador++){
            System.out.println("Line number: " + contador);
            if (contador == 21){
                break;
            }
        }


    }
}
