package exercise;

public abstract class Person {

    private String name;
    private long id;
    private float equityValue;

    // toString Method
    public String toString(){
        return "Name: " + name;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getEquityValue() {
        return equityValue;
    }

    public void setEquityValue(float equityValue) {
        this.equityValue = equityValue;
    }
}
