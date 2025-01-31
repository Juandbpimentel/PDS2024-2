public class FretePorPeso implements IFrete{
    public double calcularFrete(Pedido pedido) {
        return pedido.calcularPesoTotal() * 1.5;
    }
}
