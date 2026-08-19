package Aula1908.Exercicios.Ex5;

public class Caldeira {

    private boolean ligada = false;
    private int temperatura = 0;

    public synchronized void ligar() {

        ligada = true;

        System.out.println(
            "Caldeira ligada.");

    }

    public synchronized void alimentar() {

        if (ligada) {

            temperatura =
                (int)(Math.random() * 1801);

            System.out.println(
                "Temperatura: "
                + temperatura + " graus Celsius");
        }
    }

    public synchronized void desligar() {

        ligada = false;

        System.out.println(
            "Caldeira desligada.");
    }

    public synchronized void limpar() {

        if (!ligada) {

            System.out.println(
                "Limpando caldeira...");

        } else {

            System.out.println(
                "Não é possível limpar. "
                + "Caldeira ligada.");
        }
    }

    public synchronized int getTemperatura() {
        return temperatura;
    }

    public synchronized boolean estaLigada() {
        return ligada;
    }
}