public abstract class Sanduiche implements ISanduiche{
    private String descricao;
    private double preco;

    public Sanduiche(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public double getPreco(){
        return this.preco;
    }
}
