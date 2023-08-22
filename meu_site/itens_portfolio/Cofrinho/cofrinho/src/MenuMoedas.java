public class MenuMoedas {
    public static void exibir() {
        System.out.println("Escolha a moeda que quer adcionar:");
        System.out.println("1 - (R$) Real.");
        System.out.println("2 - (€) Euro.");
        System.out.println("3 - ($) Dólar.");
        switch (Principal.Iniciar.nextInt()) {
            case 1:
                adicionarDolar();
                break;
            case 2:
                adicionarEuro();
                break;
            case 3:
                adicionarReal();
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    private static void adicionarMoeda(int[] valoresPossiveis, String nome, String simbolo) {
        String valores = "";
        int valor;

        for (int valorPossivel : valoresPossiveis) {
            valores += simbolo + valorPossivel + " ";
        }
        System.out.println("Valores acessíveis para " + nome);
        System.out.println(valores);
        System.out.println();
        System.out.print("Digite o valor a ser adicionado: ");

        valor = Principal.Iniciar.nextInt();
        if (valor == 0) {
            return;
        }

        try {
            switch (nome) {
                case Dolar.NOME:
                    Principal.Cofre.adicionar(new Dolar(valor));
                    break;

                case Euro.NOME:
                    Principal.Cofre.adicionar(new Euro(valor));
                    break;

                case Real.NOME:
                    Principal.Cofre.adicionar(new Real(valor));
                    break;
            }
            System.out.println("Você colocou " + simbolo + valor + " centavo(s) no cofrinho.");
        } catch (MoedaInvalida ex) {
            System.out.println("Moeda Inválida.");
        }
    }

    private static void adicionarDolar() {
        adicionarMoeda(Dolar.VALORES_POSSIVEIS, Dolar.NOME, Dolar.SIMBOLO);
    }

    private static void adicionarEuro() {
        adicionarMoeda(Euro.VALORES_POSSIVEIS, Euro.NOME, Euro.SIMBOLO);
    }

    private static void adicionarReal() {
        adicionarMoeda(Real.VALORES_POSSIVEIS, Real.NOME, Real.SIMBOLO);
    }
}