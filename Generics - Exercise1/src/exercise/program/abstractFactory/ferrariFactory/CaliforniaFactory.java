package exercise.program.abstractFactory.ferrariFactory;

import exercise.program.products.ferrariCars.California;
import exercise.program.products.ferrariCars.Spider;

public class CaliforniaFactory implements IFerrariFactory {
    @Override
    public California buildCalifornia() {
        return new California();
    }

    @Override
    public Spider buildSpider() {
        return null;
    }
}
