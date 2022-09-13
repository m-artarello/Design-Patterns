package exercicio2;

public class SuportePresencial implements Suporte {


    @Override
    public void Atender() {
        System.out.println("Serviço de atendimento ao cliente realizado localmente mediante agendamento " +
                "prévio.\n");
    }
}
