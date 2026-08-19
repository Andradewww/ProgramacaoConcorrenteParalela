package Aula1908.Exercicios.Ex5;

public class DesligarCaldeira extends Thread {

    private Caldeira caldeira;

    public DesligarCaldeira(Caldeira caldeira) {
        this.caldeira = caldeira;
    }

    public void run() {

        setPriority(10);

        if (caldeira.getTemperatura() > 1600) {

            System.out.println(
                "Temperatura acima do limite!");

            caldeira.desligar();
        }
    }
}