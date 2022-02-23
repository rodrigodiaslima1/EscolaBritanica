package agregacao;

public class Comprador {

    private Double verba;
    private String nome;

    Comprador(String nome, double verba){
        this.nome = nome;
        this.verba = verba;
    }

    public Double getVerba() {
        return verba;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVerba(Double verba) {
        this.verba = verba;
    }

    public void comprar(){
        System.out.println("Comprar");
    }

}
