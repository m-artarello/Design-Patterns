package exercicio1;

public class Main {

    public static void main(String[] args) {

        System.out.println("Iniciando atendimento remoto: ");
        HelpDesk critico = new AtendimentoCritico();
        critico.ComecarAtendimento();

        System.out.println("-/-/-/-/-/--/-/-/-/-/-\n");

        System.out.println("Iniciando atendimento presencial: ");
        HelpDesk moderado = new AtendimentoModerado();
        moderado.ComecarAtendimento();

        System.out.println("-/-/-/-/-/--/-/-/-/-/-\n");

        System.out.println("Iniciando atendimento via FAQ: ");
        HelpDesk rapido = new AtendimentoRápido();
        rapido.ComecarAtendimento();
    }
}
