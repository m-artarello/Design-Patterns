package exercicio2;

public class SuporteRemoto implements Suporte {

    @Override
    public void Atender() {
        System.out.println("Serviço de atendimento ao cliente operado remotamente por atendente de suporte "
                + "disponível no momento do chamado.\n");
    }
}
