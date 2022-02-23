package exercise;

public class NaturalPerson extends Person {

    private String surname;
    private String livingAddress;
    private String birthDay;

    //@Override
    public String toString(){
        String fullName = getName() + " " + getSurname();
        String address = getLivingAddress();
        String bDay = getBirthDay();
        long personId = getId();
        float personEquity = getEquityValue();
        return "Name: " + fullName + "\n" +
                "Birth Day: " + bDay + "\n" +
                "Id: " + personId + "\n" +
                "Address: " + address + "\n" +
                "Equity: " + "£" + personEquity;
    }

    // Getters and Setters
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLivingAddress() {
        return livingAddress;
    }

    public void setLivingAddress(String livingAddress) {
        this.livingAddress = livingAddress;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}
