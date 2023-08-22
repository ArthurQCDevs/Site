public class Dolar extends Moeda {
    public static final String NOME = "Dólar";
    public static final String SIMBOLO = "$";

    public static final int[] VALORES_POSSIVEIS = { 1, 5, 10, 25, 50 };

    Dolar(int valor) throws MoedaInvalida {
        super(NOME, SIMBOLO, valor, VALORES_POSSIVEIS);
    }

    public double valorEmReais() {
        return VALOR * 0.053;
    }
}