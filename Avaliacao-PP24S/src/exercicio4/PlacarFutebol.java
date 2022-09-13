package exercicio4;

public final class PlacarFutebol implements Placar {
    // Tipo de placar compativel com o aceitado pela interface Placar


//    private static PlacarMatheus instancia;
//    Não será mais singleton

    // Não será mais singleton
//    public static PlacarMatheus getInstance(String placar) {
//        if (instancia == null) {
//            instancia = new PlacarMatheus(placar);
//        }
//        return instancia;
//    }

    // Substituido pelo método getPlacar
//    public String SituacaoAtual(){
//        return this.placar + "\n - Matheus Martarello\n";
//    }


    public PlacarFutebol() {
    }

    @Override
    public String getPlacar() {
        return "Time 1: 2 gols\n" +
                "Time 2: 3 gols";
    }
}
