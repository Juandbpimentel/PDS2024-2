public interface IVeiculo {
    int getNumeroDeRodas();
    String getTipoVeiculo();
    String getMarca();

    @Override
    String toString();
}
