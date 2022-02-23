import interfaces.AutomaticCar;
import interfaces.IPen;
import interfaces.RedBrush;
import interfaces.ICar;

public class App {

    public static void main(String[] args) {

        System.out.println("=== Automatic Car ===");
        ICar automaticCar = new AutomaticCar();

        System.out.println(automaticCar.drive());
        System.out.println(automaticCar.stop());

        System.out.println("\n=== Manual Car ===");
        ICar manualCar = new ManualCar();

        System.out.println(manualCar.drive());
        System.out.println(manualCar.gearUp());
        System.out.println(manualCar.gearDown());
        System.out.println(manualCar.stop());


        System.out.println("\n=== Anonymous Car ===");

        ICar anonymousCar = new ICar() {
            @Override
            public String drive() {
                return "Drive this anonymous Car ...";
            }

            @Override
            public String stop() {
                return "Stop this anonymous Car ...";
            }
        };

/*        new ICar(){

            @Override
            public String drive() {
                return null;
            }

            @Override
            public String stop() {
                return null;
            }
        };*/

        System.out.println(anonymousCar.drive());
        System.out.println(anonymousCar.stop());
        System.out.println(anonymousCar.gearDown());
        System.out.println(anonymousCar.gearUp());

    }



}
