package exercise.program.abstractFactory.ferrariFactory;

import exercise.program.products.ferrariCars.Spider;
import exercise.program.products.ferrariCars.California;

public interface IFerrariFactory {

    public California buildCalifornia();
    public Spider buildSpider();


}
