package exercise.program.products.ferrariCars;

public abstract class FerrariCars {

    private final String BRAND = "Ferrari";
    private String model;



    public String getBrand(){
        return BRAND;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String toString(){
        return String.format("===> FERRARI\n" +
                "Brand: %s\nModel: %s\n", getBrand(), getModel());
    }

}
