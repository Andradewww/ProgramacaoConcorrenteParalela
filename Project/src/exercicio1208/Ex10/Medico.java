package exercicio1208.Ex10;
import java.util.List;
import java.util.Random;

public class Medico extends Thread {

    private String nome;
    private List<String> pacientes;
    private Random random;

    public Medico(String nome, List<String> pacientes) {
        this.nome = nome;
        this.pacientes = pacientes;
        this.random = new Random();
    }

    @Override
    public void run() {
        for (String paciente : pacientes) {

            //gera um tempo de atendimento randômico entre 1000 e 5000 milissegundos
            int tempoAtendimento = random.nextInt(4000) + 1000;

            System.out.println(nome + " iniciou o atendimento de " + paciente
                    + " (tempo: " + tempoAtendimento + " ms)");

            try {
                //simula o tempo de atendimento
                Thread.sleep(tempoAtendimento);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + " finalizou o atendimento de " + paciente);
        }
    }
}