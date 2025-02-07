public abstract class Ingrediente implements ISanduiche{
    private ISanduiche sanduiche;
    protected String descricao;
    protected double preco;

    public Ingrediente(ISanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }

    public String getDescricao(){
        return this.sanduiche.getDescricao() + ", " + this.descricao;
    }

    public double getPreco(){
        return this.sanduiche.getPreco() + this.preco;
    }
}
