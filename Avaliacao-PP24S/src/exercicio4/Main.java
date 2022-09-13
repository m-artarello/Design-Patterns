package exercicio4;

public class Main {

    public static void main(String[] args) {
        Placar placarFutebol = new PlacarFutebol();
        Placar placarVolei = new PlacarAdapter(new PlacarVolei());

        System.out.println("Placar futebol:");
        System.out.println(placarFutebol.getPlacar());

        System.out.println("\nPlacar vôlei:");
        System.out.println(placarVolei.getPlacar());

    }
}
