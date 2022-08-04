package exercise.program.products.lamborghiniCars;

public abstract class LamborghiniCars {

    private final String BRAND = "Lamborghini";
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
        return String.format("===> LAMBORGHINI\n" +
                "Brand: %s\nModel: %s\n", getBrand(), getModel());
    }

}
