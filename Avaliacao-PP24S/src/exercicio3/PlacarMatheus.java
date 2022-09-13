package exercicio3;

import javax.swing.text.PlainView;

public final class PlacarMatheus {
    private static PlacarMatheus instancia;
    private String placar;

    public PlacarMatheus(String placar) {
        this.placar = placar;
    }

    public static PlacarMatheus getInstance(String placar) {
        if (instancia == null) {
            instancia = new PlacarMatheus(placar);
        }
        return instancia;
    }

    public void setPlacar(String placar) {
        this.placar = placar;
    }

    public String SituacaoAtual(){
        return this.placar + "\n - Matheus Martarello\n";
    }

}
