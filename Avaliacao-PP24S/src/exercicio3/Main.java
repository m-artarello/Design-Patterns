package exercicio3;

public class Main {

    public static void main(String[] args) {

        System.out.println("Primeira instância: ");
        PlacarMatheus placarMatheus1 = PlacarMatheus.getInstance("0 - 0");
        System.out.println(placarMatheus1.SituacaoAtual());

        System.out.println("Segunda instância (Irá retornar o valor da primeira pois não foi instanciada de fato): ");
        PlacarMatheus placarMatheus2 = PlacarMatheus.getInstance("0 - 1");
        System.out.println(placarMatheus2.SituacaoAtual()); // Irá imprimir o valor da primeira instancia criada

        System.out.println("Alterando o placar através do segundo objeto criado e Imprimindo o novo placar através do primeiro objeto");
        placarMatheus2.setPlacar("1 - 1"); // Alterando o placar através do "segundo" objeto criado
        System.out.println(placarMatheus1.SituacaoAtual()); // Imprimindo o novo placar através do primeiro objeto;
    }
}
