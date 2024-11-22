package ufc.quixada.es.pds.grasp.controlador;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;

@SuppressWarnings("serial")
public class PostarBlogJanela extends JFrame implements ActionListener {

	JButton publicar;
	JTextField titulo;
	JTextArea corpo;
	ControladorPosts controladorPosts;

	public PostarBlogJanela() {
		titulo = new JTextField("Digite o título...");
		this.add(titulo,BorderLayout.NORTH);
		
		corpo = new JTextArea("Corpo de texto do post...");
		this.add(corpo,BorderLayout.CENTER);
		
		publicar = new JButton("Publicar Post");
		publicar.addActionListener(this);
		this.add(publicar,BorderLayout.SOUTH);

		this.controladorPosts = new ControladorPosts();
	}

	public static void main(String[] args){
		PostarBlogJanela postarBlogJanela = new PostarBlogJanela();
		postarBlogJanela.mostrar();
	}

	private void mostrar() {
		this.setSize(400,400);
		this.setLocation(100, 100);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent publicarPost) {
		Post postCriado = controladorPosts.publicarPost(this.titulo.getText(),this.corpo.getText());
		final JDialog frame = new JDialog(this,"Post Criado com sucesso", true);
		final JLabel ltitulo = new JLabel("Titulo: "+postCriado.getTitulo()+" | Corpo de texto: "+postCriado.getCorpoTexto());
		frame.add(ltitulo);
		frame.setSize(500,200);
		frame.setLocation(100,100);
		frame.setVisible(true);
	}
}
