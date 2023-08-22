public class CalcularValorTotal {
    public static void exibir() {
        double total = 0;           // Variável onde será armazenada o valor total do dinheiro no cofre.

        ListarMoedas.exibir();

        for (Moeda moeda : Principal.Cofre.moedas()) {      // Após certificados que todos os valores estão em real eles serão somados aqui.
            total += moeda.valorEmReais();
        }

        System.out.println("Total no cofre é de R$" + total + " .");
    }
}
