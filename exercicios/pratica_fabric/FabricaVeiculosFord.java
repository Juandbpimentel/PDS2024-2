public class FabricaVeiculosFord implements IFabricaDeVeiculos {
    public FabricaVeiculosFord() {
    }

    public IVeiculo criarVeiculo(TipoVeiculo tipoVeiculo) {
        return switch (tipoVeiculo) {
            case CARRO -> new CarroFord();
            case MOTO -> new MotoFord();
            case CAMINHAO -> new CaminhaoFord();
            case ONIBUS -> new OnibusFord();
            default -> null;
        };
    }
}
