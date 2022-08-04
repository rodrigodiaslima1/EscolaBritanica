package exercise.program.abstractFactory.lamborghiniFactory;

import exercise.program.products.lamborghiniCars.Aventador;
import exercise.program.products.lamborghiniCars.Testarossa;

public class TestarossaFactory implements ILamborghiniFactory {
    @Override
    public Aventador buildAventador() {
        return null;
    }

    @Override
    public Testarossa buildTestarossa() {
        return new Testarossa();
    }
}
