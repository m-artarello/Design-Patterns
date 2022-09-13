package exercicio2;

public abstract class HelpDeskFactory {

    protected abstract HelpDesk createHelpDesk(String atendimento);

    public HelpDesk iniciarAtendimentoHelpDesk(String atendimento) {
        HelpDesk helpDesk = createHelpDesk(atendimento);
        return helpDesk;
    }
}
