package banco;

import java.util.HashSet;
import java.util.Set;

public class Banco {

    private int codigo;
    private String nome;
    private Set<ContaCorrente> listaContaCorrente;
    private Set<Poupanca> listaContaPoupanca;

    Banco(){
        this.listaContaCorrente = new HashSet<>();
        this.listaContaPoupanca = new HashSet<>();
    }

    public void add(ContaCorrente conta){
        this.listaContaCorrente.add(conta);
    }

    public void add(Poupanca conta){
        this.listaContaPoupanca.add(conta);
    }

    public void iniciaBanco(){

    }

    public ContaCorrente abreConta(){
        return new ContaCorrente();
    }

    public Poupanca abrePoupanca(){
        return new Poupanca();
    }

    public void falencia(){

    }

    // Getters and Setters


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
