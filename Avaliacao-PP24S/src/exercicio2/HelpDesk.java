package exercicio2;

public abstract class HelpDesk {
    protected Suporte suporte;

    public void ComecarAtendimento(){
        suporte.Atender();
    }
}
