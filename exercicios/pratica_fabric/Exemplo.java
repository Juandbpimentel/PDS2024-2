import java.util.ArrayList;

public class Exemplo {
    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();
        exemplo.executarExemplo();
    }

    public void executarExemplo(){
        ArrayList<IVeiculo> veiculos = new ArrayList<IVeiculo>();
        IFabricaDeVeiculos fabrica = new FabricaVeiculosFord();
        veiculos.add(fabrica.criarVeiculo(TipoVeiculo.CARRO));
        veiculos.add(fabrica.criarVeiculo(TipoVeiculo.MOTO));
        veiculos.add(fabrica.criarVeiculo(TipoVeiculo.CAMINHAO));
        veiculos.add(fabrica.criarVeiculo(TipoVeiculo.ONIBUS));

        fabrica = new FabricaVeiculosVW();
        veiculos.add(fabrica.criarVeiculo(TipoVeiculo.CARRO));
        veiculos.add(fabrica.criarVeiculo(TipoVeiculo.MOTO));
        veiculos.add(fabrica.criarVeiculo(TipoVeiculo.CAMINHAO));
        veiculos.add(fabrica.criarVeiculo(TipoVeiculo.ONIBUS));

        veiculos.forEach(veiculo -> {
            System.out.println(veiculo.toString());
        });
    }
}
