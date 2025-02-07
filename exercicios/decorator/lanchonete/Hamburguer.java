public class Hamburguer extends Ingrediente{
    public Hamburguer(ISanduiche sanduiche){
        super(sanduiche);
        this.descricao = "Hamburguer";
        this.preco = 3.0;
    }
}