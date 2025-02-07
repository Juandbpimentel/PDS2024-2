public class CaminhaoVW implements IVeiculo{
    private String tipoVeiculo;
    private String marca;
    private int numRodas;

    public CaminhaoVW() {
        this.tipoVeiculo = "Caminhão";
        this.marca = "Volkswagen";
        this.numRodas = 6;
    }

    public int getNumeroDeRodas() {
        return numRodas;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "%s %s com %d rodas".formatted(marca, tipoVeiculo, numRodas);
    }
}
