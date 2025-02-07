public class MotoFord implements IVeiculo{
    private String tipoVeiculo;
    private String marca;
    private int numRodas;

    public MotoFord() {
        this.tipoVeiculo = "Moto";
        this.marca = "Ford";
        this.numRodas = 2;
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
