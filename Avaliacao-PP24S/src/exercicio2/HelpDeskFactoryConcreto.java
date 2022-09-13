package exercicio2;

public class HelpDeskFactoryConcreto extends HelpDeskFactory{
    @Override
    protected HelpDesk createHelpDesk(String atendimento) {
        return switch (atendimento){
            case "Remoto" -> new AtendimentoCritico();
            case "Presencial" -> new AtendimentoModerado();
            case "Faq" -> new AtendimentoRápido();
            default -> null;
        };
    }
}
