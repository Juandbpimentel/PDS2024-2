public class FretePorItem implements IFrete{
    public double calcularFrete(Pedido pedido) {
        return pedido.contaTotalProdutos() * 5;
    }

}
