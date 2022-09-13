package exercicio1;

public abstract class HelpDesk {
    protected Suporte suporte;

    public void ComecarAtendimento(){
        suporte.Atender();
    }
}
