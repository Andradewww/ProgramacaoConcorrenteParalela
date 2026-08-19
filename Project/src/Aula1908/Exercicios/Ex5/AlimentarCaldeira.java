package Aula1908.Exercicios.Ex5;

public class AlimentarCaldeira extends Thread {

    private Caldeira caldeira;

    public AlimentarCaldeira(Caldeira caldeira) {
        this.caldeira = caldeira;
    }

    public void run() {

        setPriority(1);

        for (int x = 0; x < 10; x++) {

            if (!caldeira.estaLigada()) {
                break;
            }

            caldeira.alimentar();

            try {

                sleep(500);

            } catch (InterruptedException e) {
                System.exit(0);
            }
        }
    }
}