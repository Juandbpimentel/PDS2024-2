public class MotoVW implements IVeiculo {
    private String tipoVeiculo;
    private String marca;
    private int numRodas;

    public MotoVW() {
        this.tipoVeiculo = "Moto";
        this.marca = "Volkswagen";
        this.numRodas = 2;
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
