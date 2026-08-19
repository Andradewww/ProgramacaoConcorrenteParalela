package Aula1908.Exercicios.Ex4;

import java.util.Random;

public class ContadorBaixa extends Thread {

    public void run() {

        setPriority(1);

        Random random = new Random();

        for (int x = 0; x < 10; x++) {

            System.out.println(
                "Baixa Prioridade - Contador: " + x);

            //pausa aleatória
            if (random.nextInt(4) == 0) {
                try {
                    System.out.println(
                        "Baixa Prioridade - Pausa");

                    sleep(500);

                } catch (InterruptedException e) {
                    System.exit(0);
                }
            }
        }
    }
}