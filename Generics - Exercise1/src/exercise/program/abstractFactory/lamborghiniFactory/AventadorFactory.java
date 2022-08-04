package exercise.program.abstractFactory.lamborghiniFactory;

import exercise.program.products.lamborghiniCars.Aventador;
import exercise.program.products.lamborghiniCars.Testarossa;

public class AventadorFactory implements ILamborghiniFactory {
    @Override
    public Aventador buildAventador() {
        return new Aventador();
    }

    @Override
    public Testarossa buildTestarossa() {
        return null;
    }
}
