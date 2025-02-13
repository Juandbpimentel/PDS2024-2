public class Prefeitura implements IObservador {
    private int numeroViagens = 0;
    public void atualizar(OnibusEstado estado) {
        switch(estado) {
            case CHEGOU_UFC:
                numeroViagens++;
                System.out.println("Prefeitura: Onibus chegou na UFC. total de viagens: " + numeroViagens);
                break;
            case CHEGOU_RODOVIARIA:
                numeroViagens++;
                System.out.println("Prefeitura: Onibus chegou na rodoviaria. total de viagens: " + numeroViagens);
                break;
        }
    }
}
