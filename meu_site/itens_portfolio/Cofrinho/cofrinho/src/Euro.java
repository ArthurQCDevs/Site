public class Euro extends Moeda {
    public static final String NOME = "Euro";
    public static final String SIMBOLO = "€";
    public static final int[] VALORES_POSSIVEIS = { 1, 2, 5, 10, 20, 50 };

    Euro(int valor) throws MoedaInvalida {
        super(NOME, SIMBOLO, valor, VALORES_POSSIVEIS);
    }

    public double valorEmReais() {
        return VALOR * 0.052;
    }
}
