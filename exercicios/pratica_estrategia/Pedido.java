import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private IFrete frete;

    public Pedido(ArrayList<Produto> produtos, IFrete frete) {
        this.produtos = produtos;
        this.frete = frete;
    }

    public Pedido(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public double calcularFrete() {
        return frete.calcularFrete(this);
    }

    public void setFrete(IFrete frete) {
        this.frete = frete;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularPesoTotal() {
        double pesoTotal = 0;
        for (Produto produto : produtos) {
            pesoTotal += produto.getPeso();
        }
        return pesoTotal;
    }

    public double contaTotalProdutos() {
        double totalProdutos = 0;
        for (Produto produto : produtos) {
            totalProdutos += produto.getQuantidade();
        }
        return totalProdutos;
    }
}
