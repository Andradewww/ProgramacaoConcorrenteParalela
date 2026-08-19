package Aula1908.Exercicios.Ex5;

public class MainCaldeira {

    public static void main(String args[]) {

        Caldeira caldeira = new Caldeira();

        LigarCaldeira ligar =
            new LigarCaldeira(caldeira);

        AlimentarCaldeira alimentar =
            new AlimentarCaldeira(caldeira);

        DesligarCaldeira desligar =
            new DesligarCaldeira(caldeira);

        LimparCaldeira limpar =
            new LimparCaldeira(caldeira);

        System.out.println(
            "Iniciando sistema da caldeira...");

        //liga a caldeira
        ligar.start();

        try {
            ligar.join();
        } catch (InterruptedException e) {
            System.exit(0);
        }

        //alimenta a caldeira
        alimentar.start();

        try {
            alimentar.join();
        } catch (InterruptedException e) {
            System.exit(0);
        }

        //verifica a temperatura
        if (caldeira.getTemperatura() > 1600) {

            desligar.start();

        } else {

            System.out.println(
                "Temperatura dentro do limite.");

            desligar.start();
        }

        try {
            desligar.join();
        } catch (InterruptedException e) {
            System.exit(0);
        }

        //limpa somente depois de desligar
        limpar.start();

        try {
            limpar.join();
        } catch (InterruptedException e) {
            System.exit(0);
        }

        System.out.println(
            "Sistema da caldeira finalizado.");
    }
}