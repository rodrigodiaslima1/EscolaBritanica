package exercise.program.abstractFactory.ferrariFactory;

import exercise.program.products.ferrariCars.California;
import exercise.program.products.ferrariCars.Spider;

public class SpiderFactory implements IFerrariFactory {

    @Override
    public Spider buildSpider() {
        return new Spider();
    }

    @Override
    public California buildCalifornia() {
        return null;
    }

}
