public class Main {
    public static void main(String[] args) {
        Onibus onibus = new Onibus();
        Prefeitura prefeitura = new Prefeitura();
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        onibus.adicionarObservador(prefeitura);
        onibus.adicionarObservador(aluno1);
        onibus.adicionarObservador(aluno2);

        System.out.println("Rota 1");
        onibus.setEstado(OnibusEstado.SAIU_RODOVIARIA);
        System.out.println("\n\n");
        onibus.setEstado(OnibusEstado.CHEGOU_UFC);
        System.out.println("\n\n");
        onibus.setEstado(OnibusEstado.SAIU_UFC);
        System.out.println("\n\n");
        onibus.setEstado(OnibusEstado.CHEGOU_RODOVIARIA);
        System.out.println("\n\n");
        System.out.println("Rota 2");
        onibus.setEstado(OnibusEstado.SAIU_RODOVIARIA);
        System.out.println("\n\n");
        onibus.setEstado(OnibusEstado.CHEGOU_UFC);
        System.out.println("\n\n");
        onibus.setEstado(OnibusEstado.SAIU_UFC);
        System.out.println("\n\n");
        onibus.setEstado(OnibusEstado.CHEGOU_RODOVIARIA);
        System.out.println("\n\n");
        System.out.println("Rota 3");
        onibus.removerObservador(aluno1);
        onibus.setEstado(OnibusEstado.SAIU_RODOVIARIA);
        System.out.println("\n\n");
        onibus.setEstado(OnibusEstado.CHEGOU_UFC);
        System.out.println("\n\n");
        onibus.setEstado(OnibusEstado.SAIU_UFC);
        System.out.println("\n\n");
        onibus.setEstado(OnibusEstado.CHEGOU_RODOVIARIA);
    }
}
