import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {
    ArrayList<Ladrao> ladroes = new ArrayList<Ladrao>();
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.iniciarJogo();
    }

    public void iniciarJogo(){
        MaeDragoa maeDragoa = new MaeDragoa();
        Scanner scanner = new Scanner(System.in);
        String entrada = "";
        while(!entrada.equals("continuar")){
            System.out.print("Digite seu nome de jogador ou digite continuar para encerrar a coleta: ");
            entrada = scanner.nextLine();
            if(!entrada.equalsIgnoreCase("continuar")){
                Ladrao ladrao = new Ladrao(entrada);
                maeDragoa.adicionarObservador(ladrao);
                ladroes.add(ladrao);
            }
        }
        System.out.println("\n\n\n\n\n\n\nJogadores coletados, vamos começar o jogo!");
        while(maeDragoa.getDormindo()){
            for (Ladrao ladrao : ladroes) {
                System.out.print(ladrao.getNome()+", digite o número de ovos que deseja roubar: ");
                int ovos = scanner.nextInt();
                ladrao.roubarOvos(ovos, maeDragoa);
                System.out.println("\n\n");
                if (!maeDragoa.getDormindo()) {
                    break;
                }
            }

        }
        System.out.println("A mãe dragoa acordou! O jogo acabou!");
        scanner.close();
    }

    public void exemploObserver(){
        MaeDragoa maeDragoa = new MaeDragoa();
        Ladrao ladrao1 = new Ladrao("Ladrao 1");
        Ladrao ladrao2 = new Ladrao("Ladrao 2");
        maeDragoa.adicionarObservador(ladrao1);
        maeDragoa.adicionarObservador(ladrao2);
        ladrao1.roubarOvos(50, maeDragoa);
        ladrao2.roubarOvos(50, maeDragoa);
    }
}
