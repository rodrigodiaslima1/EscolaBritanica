package agregacao;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Comprador comprador;
    private Vendedor vendedor;
    private Produto produto;
    private List<Produto> produtos;

    // Constructor
    public Venda(Comprador comprador, Vendedor vendedor, Produto produto){
        this.comprador = comprador;
        this.vendedor = vendedor;
        this.produto = produto;

        this.produtos = new ArrayList<>();

        add(produto);
    }

    // Getters and Setters
    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos(){
        return produtos;
    }

    // Other Methods
    public void add(Produto produto){
        this.produtos.add(produto);
    }

    public void concretizarVenda(){
        System.out.println("Comprador: " + this.comprador.getNome());
        System.out.println("Vendedor: " + this.vendedor.getNome());

        System.out.println();
        System.out.println("Produtos: ");
        for(Produto produto: produtos){
            System.out.println(produto.getNome());
        }
        System.out.println();
    }

    public void cancelarVenda(){

    }

    @Override
    public String toString(){
        return "Produto: " + this.produto.getNome();
    }

}
