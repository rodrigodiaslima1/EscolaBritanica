package banco;

public class App {

    public static void main(String[] args){

        Banco alphaBank = new Banco();
        alphaBank.setCodigo(10);
        alphaBank.setNome("AlphaBank");

        ContaCorrente cca1 = new ContaCorrente();
        cca1.setBanco(alphaBank);

        Poupanca cpa1 = new Poupanca();
        cpa1.setBanco(alphaBank);

    }

}
