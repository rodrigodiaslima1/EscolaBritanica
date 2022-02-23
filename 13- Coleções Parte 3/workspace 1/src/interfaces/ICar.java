package interfaces;

public interface ICar {

    public String drive();
    public String stop();

    public default String gearUp(){
        return "No gear lever available ...";
    }

    public default String gearDown(){
        return "No gear lever available ...";
    }

}
