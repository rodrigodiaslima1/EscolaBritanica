package exercise;

public class LegalPerson extends Person {

    private String Owner;
    private String businessObject;
    private int numberOfEmployees;

    @Override
    public String toString(){
        String fantasyName = getName();
        String businessOwner = getOwner();
        String object = getBusinessObject();
        float personEquity = getEquityValue();

        return "Fantasy Name: " + fantasyName + "\n" +
                "Birth Day: " + businessOwner + "\n" +
                "Business Field: " + object + "\n" +
                "Equity: " + personEquity + "\n" +
                "Num. of Employees: " + getNumberOfEmployees();
    }

    // Getters and Setters
    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public String getBusinessObject() {
        return businessObject;
    }

    public void setBusinessObject(String businessObject) {
        this.businessObject = businessObject;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
