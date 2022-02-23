package interfaces;

public class AutomaticCar implements ICar {

    @Override
    public String drive() {
        return "Driving ...";
    }

    @Override
    public String stop() {
        return "Stopping ...";
    }
}
