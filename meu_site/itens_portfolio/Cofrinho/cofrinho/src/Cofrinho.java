import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> moedas = new ArrayList<Moeda>();

    public void adicionar(Moeda moeda) {
        moedas.add(moeda);
    }

    public ArrayList<Moeda> moedas() {
        return moedas;
    }

    public void removerNaPosicao(int posicao) {
        moedas.remove(posicao);
    }
}