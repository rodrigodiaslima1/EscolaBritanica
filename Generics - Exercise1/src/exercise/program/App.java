package exercise.program;

import exercise.program.abstractFactory.ferrariFactory.CaliforniaFactory;
import exercise.program.abstractFactory.ferrariFactory.IFerrariFactory;
import exercise.program.abstractFactory.ferrariFactory.SpiderFactory;
import exercise.program.abstractFactory.lamborghiniFactory.AventadorFactory;
import exercise.program.abstractFactory.lamborghiniFactory.ILamborghiniFactory;
import exercise.program.abstractFactory.lamborghiniFactory.TestarossaFactory;
import exercise.program.products.ferrariCars.FerrariCars;
import exercise.program.products.lamborghiniCars.LamborghiniCars;
import exercise.program.list.CarsList;

public class App {

    public static void main(String[] args){

        // Factories:
        IFerrariFactory californiaFactory = new CaliforniaFactory();
        IFerrariFactory spiderFactory = new SpiderFactory();
        ILamborghiniFactory aventadorFactory = new AventadorFactory();
        ILamborghiniFactory testarossaFactory = new TestarossaFactory();

        // Cars:
        FerrariCars california = californiaFactory.buildCalifornia();
        FerrariCars spider = spiderFactory.buildSpider();
        LamborghiniCars aventador = aventadorFactory.buildAventador();
        LamborghiniCars testarossa = testarossaFactory.buildTestarossa();

        // Calling Cars:
        System.out.println(california);
        System.out.println(spider);
        System.out.println(aventador);
        System.out.println(testarossa);

        // CarsList:
        CarsList<FerrariCars> ferrariList = new CarsList<FerrariCars>();
        CarsList<LamborghiniCars> lamborghiniList = new CarsList<LamborghiniCars>();

        // add car:
        ferrariList.addCar(california);
        ferrariList.addCar(spider);
        lamborghiniList.addCar(aventador);
        lamborghiniList.addCar(testarossa);

        // retrieve car:
        System.out.println("\n");
        System.out.println("===> All Ferraris: ");
        ferrariList.allCars();

        System.out.println("\n===> All Lamborghinis: ");
        lamborghiniList.allCars();


        /*
        * ferrariList won't accept a Lamborghini car
        * as lamborghiniList won't get a Ferrari car
        *
        * error:
        * ferrariList.addCar(aventador);
        * lamborghiniList.addCar(california);
        * */


    }

}
