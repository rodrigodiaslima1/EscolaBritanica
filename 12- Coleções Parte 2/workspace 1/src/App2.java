public class App2 {

    public static void main(String[] args){

        int[] numbers = {3, 5, 1, 2, 4, 6};
        int aux = 0;
        int i = 0;

/*        System.out.println("Not ordered numbers: ");
        for(i = 0; i < numbers.length; i++){
            System.out.println(" " + numbers[i]);
        }


        System.out.println();

        for(i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length - 1; j++){
                if(numbers[j] > numbers[j + 1]){
                    aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }
            }
        }


        System.out.println("Ordered Numbers");
        for(i = 0; i < 6; i++){
            System.out.println(" " + numbers[i]);
        }*/



        System.out.println("=== My Test ===");

        for(i = 0; i < numbers.length; i++){
            if(numbers[i] > numbers[i + 1]){
                aux = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = aux;
            }
        }

        for(int number = 0; number < numbers.length; number++){
            System.out.println(number);
        }

    }

}
