package exercicio1208.Ex9;

public class GeradorPares extends Thread {

    private int quantidade;

    public GeradorPares(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void run() {
        System.out.println("Thread de números pares. Quantidade: " + quantidade);

        for (int i = 0; i < quantidade; i++) {
            int numero = (i + 1) * 2;

            System.out.println("Número par: " + numero);

            //passa a vez para outra Thread
            Thread.yield();
        }

        System.out.println("Thread de números pares finalizada.");
    }
}