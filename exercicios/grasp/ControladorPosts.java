package ufc.quixada.es.pds.grasp.controlador;

public class ControladorPosts {
    private final RepositorioPosts repositorioPosts;
    ControladorPosts(){
        this.repositorioPosts = new RepositorioPosts();
    }

    Post publicarPost(String titulo, String corpo){
        Post novoPost = repositorioPosts.adicionar(titulo,corpo);
        return novoPost;
    }

}
