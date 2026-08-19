package Aula1908.Exercicios.Ex5;

public class LigarCaldeira extends Thread {

    private Caldeira caldeira;

    public LigarCaldeira(Caldeira caldeira) {
        this.caldeira = caldeira;
    }

    public void run() {

        setPriority(1);

        caldeira.ligar();
    }
}