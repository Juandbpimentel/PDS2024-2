public class FabricaVeiculosVW implements IFabricaDeVeiculos {
    public FabricaVeiculosVW() {
    }

    public IVeiculo criarVeiculo(TipoVeiculo tipoVeiculo) {
        return switch (tipoVeiculo) {
            case CARRO -> new CarroVW();
            case MOTO -> new MotoVW();
            case CAMINHAO -> new CaminhaoVW();
            case ONIBUS -> new OnibusVW();
            default -> null;
        };
    }
}
