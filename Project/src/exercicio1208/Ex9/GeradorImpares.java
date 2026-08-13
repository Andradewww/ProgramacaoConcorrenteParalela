package exercicio1208.Ex9;

public class GeradorImpares extends Thread {

    private int quantidade;

    public GeradorImpares(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void run() {
        System.out.println("Thread de números ímpares. Quantidade: " + quantidade);

        for (int i = 0; i < quantidade; i++) {
            int numero = (i * 2) + 1;

            System.out.println("Número ímpar: " + numero);

            //passa a vez para outra Thread
            Thread.yield();
        }

        System.out.println("Thread de números ímpares finalizada.");
    }
}