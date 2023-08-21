public class Real extends Moeda {
    public static final String NOME = "Real";
    public static final String SIMBOLO = "R$";
    public static final int[] VALORES_POSSIVEIS = { 5, 10, 25, 50 };

    Real(int valor) throws MoedaInvalida {
        super(NOME, SIMBOLO, valor, VALORES_POSSIVEIS);
    }

    public double valorEmReais() {
        return VALOR * 0.01;
    }
}
