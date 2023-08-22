import java.util.*;

public class Principal {
    public static final Scanner Iniciar = new Scanner(System.in);
    public static final Cofrinho Cofre = new Cofrinho();

    public static void main(String[] args) {
        System.out.println("Menu Principal do Cofre:");
        menu();
    }

    private static void menu() {
        int escolha;
        do {
            System.out.println("Escolha uma ação:");
            System.out.println("1 - Adicionar uma moeda.");
            System.out.println("2 - Remover uma moeda.");
            System.out.println("3 - Mostrar todas as suas moedas.");
            System.out.println("4 - Somar quanto dinheiro você tem.");
            escolha = Iniciar.nextInt();

            if (escolha == 1) {                             // Enquanto o valor do input for diferfente de 5 o programa continuará rodando.
                MenuMoedas.exibir();
            } else if (escolha == 2) {
                RemoverMoeda.exibir();
            } else if (escolha == 3) {
                ListarMoedas.exibir();
            } else if (escolha == 4) {
                CalcularValorTotal.exibir();
            } else {
                System.out.println("Opção inválida!");
            }
        } while (escolha != 5);
    }
}