package Aula1908.Exercicios.Ex5;

public class LimparCaldeira extends Thread {

    private Caldeira caldeira;

    public LimparCaldeira(Caldeira caldeira) {
        this.caldeira = caldeira;
    }

    public void run() {

        setPriority(1);

        caldeira.limpar();
    }
}