package exercise.program.abstractFactory.lamborghiniFactory;

import exercise.program.products.lamborghiniCars.Aventador;
import exercise.program.products.lamborghiniCars.Testarossa;

public interface ILamborghiniFactory {

    public Aventador buildAventador();
    public Testarossa buildTestarossa();

}
