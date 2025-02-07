public class CarroFord implements IVeiculo{
    private String tipoVeiculo;
    private String marca;
    private int numRodas;

    public CarroFord() {
        this.tipoVeiculo = "Carro";
        this.marca = "Ford";
        this.numRodas = 4;
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
