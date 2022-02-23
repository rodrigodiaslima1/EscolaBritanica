package banco;

public class ContaCorrente extends Conta {

    private float chequeEspecial;
    private Banco banco;

    public void deposita(float valor){
        saldo =+ valor;
    }

    @Override
    public void saque(float valor){
        if((saldo + chequeEspecial) >= valor){
            System.out.println("Sacando ...");
            this.saldo -= valor;
        } else{
            System.out.println("Transação não aceita ...");
        }
    }

    public void extrato(){
        System.out.println("Extrato: ");
        System.out.println("Saldo em conta corrente: " + getSaldo());
        System.out.println("Limite cheque especial: " + getChequeEspecial());
        System.out.println("Saldo total: " + (saldo + chequeEspecial));
    }

    // Getters and Setters

    public void setBanco(Banco banco){
        this.banco = banco;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
