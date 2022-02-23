package banco;

public class Poupanca extends Conta {

    private Banco banco;

    public void setBanco(Banco banco){
        this.banco = banco;
    }

    public void deposita(float valor){
        saldo =+ valor;
    }

    public void saque(float valor){
        if(saldo >= valor){
            System.out.println("Sacando ...");
            this.saldo -= valor;
        } else{
            System.out.println("Transação não aceita ...");
        }
    }

}
