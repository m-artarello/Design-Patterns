package exercicio4;

public class PlacarAdapter implements Placar{
    // Funciona como um adaptador para que o placar de volei seja compativel com a interface Placar
    private final PlacarVolei placar;

    public PlacarAdapter(PlacarVolei placar) {
        this.placar = placar;
    }

    @Override
    public String getPlacar() {
        return placar.getPlacarVolei();
    }
}
