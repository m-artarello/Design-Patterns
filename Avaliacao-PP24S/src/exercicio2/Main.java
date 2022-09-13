package exercicio2;

public class Main {

    public static void main(String[] args) {
        HelpDeskFactory fabrica = new HelpDeskFactoryConcreto();

        System.out.println("Iniciando atendimento remoto: ");
        HelpDesk critico = fabrica.createHelpDesk("Remoto");
        //        HelpDesk critico = new AtendimentoCritico(); -- Não precisa mais ser instanciado diretamente
        critico.ComecarAtendimento();

        System.out.println("-/-/-/-/-/--/-/-/-/-/-\n");

        System.out.println("Iniciando atendimento presencial: ");
        HelpDesk moderado = fabrica.createHelpDesk("Presencial");
        //        HelpDesk moderado = new AtendimentoModerado(); -- Não precisa mais ser instanciado diretamente
        moderado.ComecarAtendimento();

        System.out.println("-/-/-/-/-/--/-/-/-/-/-\n");

        System.out.println("Iniciando atendimento via FAQ: ");
        HelpDesk rapido = fabrica.createHelpDesk("Faq");
        //        HelpDesk rapido = new AtendimentoRápido(); -- Não precisa mais ser instanciado diretamente
        rapido.ComecarAtendimento();
    }
}
