package javaapplication2;

/**
 *
 * @author rodri
 */
public class Client {
    
    private String name;
    private long cpf;
    private int phone;
    
    public Client(String name, long cpf){
        this.name = name;
        this.cpf = cpf;
    }
    
    public Client(String name, long cpf, int phone){
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
    }

    
    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    
}
