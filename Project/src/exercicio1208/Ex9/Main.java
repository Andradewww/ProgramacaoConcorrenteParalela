package exercicio1208.Ex9;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int quantidadePares;
        int quantidadeImpares;

        //sorteia quantidades diferentes para cada Thread
        do {
            quantidadePares = random.nextInt(10) + 1;
            quantidadeImpares = random.nextInt(10) + 1;
        } while (quantidadePares == quantidadeImpares);

        GeradorPares threadPares = new GeradorPares(quantidadePares);
        GeradorImpares threadImpares = new GeradorImpares(quantidadeImpares);

        threadPares.start();
        threadImpares.start();

        try {
            threadPares.join();
            threadImpares.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todas as Threads foram finalizadas.");
    }
}