package exercicio1208.Ex10;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //lista de pacientes
        List<String> pacientes = new ArrayList<>();
        pacientes.add("Paciente 1");
        pacientes.add("Paciente 2");
        pacientes.add("Paciente 3");
        pacientes.add("Paciente 4");
        pacientes.add("Paciente 5");
        pacientes.add("Paciente 6");
        pacientes.add("Paciente 7");
        pacientes.add("Paciente 8");

        //divide os pacientes entre os médicos
        int meio = pacientes.size() / 2;

        List<String> pacientesMedico1 = new ArrayList<>(pacientes.subList(0, meio));
        List<String> pacientesMedico2 = new ArrayList<>(pacientes.subList(meio, pacientes.size()));

        //cria os dois médicos
        Medico medico1 = new Medico("Médico 1", pacientesMedico1);
        Medico medico2 = new Medico("Médico 2", pacientesMedico2);

        medico1.start();
        medico2.start();

        try {
            medico1.join();
            medico2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todos os atendimentos do pronto socorro foram finalizados.");
    }
}