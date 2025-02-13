public class Aluno implements IObservador {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void atualizar(OnibusEstado estado) {
        String textoEstado = switch (estado) {
            case CHEGOU_UFC -> "chegou na UFC.";
            case SAIU_UFC -> "saiu da UFC.";
            case CHEGOU_RODOVIARIA -> "chegou na rodoviária.";
            case SAIU_RODOVIARIA -> "saiu da rodoviaria.";
        };
        System.out.println("Aluno " + this.nome + " foi notificado que o ônibus " + textoEstado);
    }
}
