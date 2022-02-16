
public class App {

    public static void main(String[] args){

        declareArray();

    }

    private static void declareArray(){

        System.out.println("=== Declaring Arrays ===");

        int[] array1 = new int[3];
        int[] array2;
        array2 = new int[10];

        // DECLARING MULTIPLE ARRAYS IN A SINGLE LINE
        int[] array3 = new int[3], array4 = new int[4];

        // DECLARING AN ARRAY AND INITIALIZING ITS VALUES
        int[] array5 = {0, 11, 22, 33};

        // INITIALIZE VALUES IN THE array1
        array1[0] = 121;
        array1[1] = 131;
        array1[2] = 141;

        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);

        System.out.println();
        System.out.println(array1.length);
        System.out.println();

        for(int i: array1){
            System.out.println(i);
        }







    }

}
