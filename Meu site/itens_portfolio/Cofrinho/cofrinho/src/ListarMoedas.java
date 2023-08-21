public class ListarMoedas {
    public static void exibir() {
        int posicao = 1;

        System.out.println();
        System.out.println("Suas moedas:");
        System.out.println("Total de " + Principal.Cofre.moedas().size() + " moeda(s) no cofrinho.");

        for (Moeda moeda : Principal.Cofre.moedas()) {                                  // Enquanto o loop continuar novos valores poderão ser adicionados.
            System.out.println("[" + posicao++ + "] " + moeda.SIMBOLO + moeda.VALOR);
        }
    }
}
