package banco;

public abstract class Conta {

    float saldo;

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
