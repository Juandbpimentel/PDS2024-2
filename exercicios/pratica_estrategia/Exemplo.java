import java.util.ArrayList;

public class Exemplo {
    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();
        exemplo.executarExemplo();
    }

    public void executarExemplo(){
        Produto produto1 = new Produto("Produto 1", 10, 2, 1);
        Produto produto2 = new Produto("Produto 2", 20, 3, 2);
        Produto produto3 = new Produto("Produto 3", 30, 4, 3);

        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        Pedido pedido = new Pedido(produtos,new FretePorPeso());
        System.out.println("Frete por peso: " + pedido.calcularFrete());

        pedido.setFrete(new FretePorItem());
        System.out.println("Frete por item: " + pedido.calcularFrete());

        pedido.setFrete(new FreteFixo());
        System.out.println("Frete fixo: " + pedido.calcularFrete());
    }
}
