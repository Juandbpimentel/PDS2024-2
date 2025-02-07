public class OnibusVW implements IVeiculo {
    private String tipoVeiculo;
    private String marca;
    private int numRodas;

    public OnibusVW() {
        this.tipoVeiculo = "Ônibus";
        this.marca = "Volkswagen";
        this.numRodas = 6;
    }

    @Override
    public int getNumeroDeRodas() {
        return numRodas;
    }

    @Override
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "%s %s com %d rodas".formatted(marca, tipoVeiculo, numRodas);
    }
}
