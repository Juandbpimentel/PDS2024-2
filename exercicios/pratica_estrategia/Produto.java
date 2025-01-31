public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private double peso;

    public Produto(String nome, double preco, int quantidade, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPeso() {
        return peso;
    }
}
