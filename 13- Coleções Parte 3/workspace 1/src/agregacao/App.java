package agregacao;

public class App {

    public static void main(String[] args){

        Produto televisao = criarProduto(1, 1600, "televisao");
        Produto celular = criarProduto(2, 500, "celular");
        Vendedor vendedor1 = criarVendedor("rodrigo", 20000);
        Comprador comprador1 = criarComprador("Bill", 3475);
        Venda venda1 = criarVenda(comprador1, vendedor1, televisao);
        venda1 = null;

        System.out.println(venda1);
        System.out.println(celular.getNome());
        venda1.concretizarVenda();

        System.out.println();

    }

    private static Venda criarVenda(Comprador comprador, Vendedor vendedor, Produto produto) {
        return new Venda(comprador, vendedor, produto);
    }

    private static Comprador criarComprador(String nome, double verba){
        return new Comprador(nome, verba);
    }

    private static Produto criarProduto(long codigo, double preco, String nome){

        Produto produto = new Produto();

        produto.setCodigo(codigo);
        produto.setPreco(preco);
        produto.setNome(nome);

        return produto;
    }

    private static Vendedor criarVendedor(String nome, double valorComissao){

        Vendedor vendedor = new Vendedor();

        vendedor.setNome(nome);
        vendedor.setComissao(valorComissao);

        return vendedor;
    }

}
