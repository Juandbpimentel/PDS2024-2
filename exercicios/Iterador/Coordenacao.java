public class Coordenacao implements Agregador<Professor> {
    Professor[] professores = new Professor[10];
    IFabricaIteradores<Professor> fabricaIteradores;

    public Coordenacao() {
        this.fabricaIteradores = new FabricaIteradoresProfessor();
    }

    public void addProfessor(Professor professor) {
        for (int i = 0; i < professores.length; i++) {
            if (professores[i] == null) {
                professores[i] = professor;
                break;
            }
        }
    }

    public Iterador<Professor> criarIterador(TiposIteradores tipo) {
        return fabricaIteradores.criarIterador(tipo, professores);
    }
}
