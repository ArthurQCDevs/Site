public class RemoverMoeda {
    public static void exibir() {
        int opcao = 0;

        ListarMoedas.exibir();

        System.out.print("Digite a posição da moeda que deseja retirar do cofrinho:");

        opcao = Principal.Iniciar.nextInt();

        if (opcao == 0) {
            return;
        }

        try {
            Principal.Cofre.removerNaPosicao(opcao - 1);            // Caso o usuário coloque uma posição inexistente ele será alertado pelo sistema. 
        } catch (IndexOutOfBoundsException ex) {
            System.out.println();
            System.out.println("A posição digitada não existe.");
        }

        ListarMoedas.exibir();
    }
}
