import interfaces.ICar;

public class ManualCar implements ICar {
    @Override
    public String drive() {
        return "Driving ...";
    }

    @Override
    public String stop() {
        return "Stopping ...";
    }

    public String gearUp(){
        return "Shifting gear up ...";
    }

    public String gearDown(){
        return "Shifting gear down ...";
    }

}
