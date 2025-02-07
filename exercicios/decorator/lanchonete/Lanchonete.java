import java.util.ArrayList;
import java.util.Scanner;

public class Lanchonete {

    ArrayList<ISanduiche> pedidos = new ArrayList<>();

    public static void main(String[] args){
        Lanchonete lanchonete = new Lanchonete();
        lanchonete.atenderCliente();
    }

    public void atenderCliente(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            mostrarMenuInicial();
            int opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    ISanduiche novoSanduiche = montarSanduiche();
                    if(novoSanduiche != null){
                        pedidos.add(novoSanduiche);
                    }
                    break;
                case 2:
                    System.out.println("Pedidos anteriores:");
                    for(ISanduiche sanduiche : pedidos){
                        System.out.println(sanduiche.getDescricao());
                    }
                    break;
                case 3:
                    System.out.println("Obrigado por nos visitar!");
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public void mostrarMenuInicial(){
        System.out.println("Bem vindo a lanchonete!");
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Montar sanduíche");
        System.out.println("2 - Visualizar seus pedidos anteriores");
        System.out.println("3 - Sair");
    }

    public ISanduiche montarSanduiche() {
        ISanduiche sanduiche = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Monte seu sanduíche!");
        System.out.println("Escolha o pão:");
        System.out.println("1 - Pão Árabe");
        System.out.println("2 - Pão Australiano");
        System.out.println("3 - Pão de Francês");
        System.out.println("4 - Cancelar");
        int opcao = scanner.nextInt();
        sanduiche = switch (opcao) {
            case 1 -> new PaoArabe();
            case 2 -> new PaoAustraliano();
            case 3 -> new PaoFrances();
            default -> null;
        };
        if(sanduiche == null){
            return null;
        }
        System.out.println("Escolha os ingredientes:");
        while(true){
            System.out.println("1 - Presunto");
            System.out.println("2 - Queijo");
            System.out.println("3 - Ovo");
            System.out.println("4 - Alface");
            System.out.println("5 - Tomate");
            System.out.println("6 - Maionese");
            System.out.println("7 - Finalizar");
            int opcaoIngrediente = scanner.nextInt();
            sanduiche = switch (opcaoIngrediente) {
                case 1 -> new Presunto(sanduiche);
                case 2 -> new Queijo(sanduiche);
                case 3 -> new Ovo(sanduiche);
                case 6 -> new MaioneseTemperada(sanduiche);
                case 7 -> {
                    yield sanduiche;
                }
                default -> sanduiche;
            };
            if (opcaoIngrediente == 7){
                break;
            }
        }
        System.out.println("Sanduíche montado e pronto para comer, veja seu sanduiche!");
        System.out.println(sanduiche.getDescricao());
        return sanduiche;
    }
}
