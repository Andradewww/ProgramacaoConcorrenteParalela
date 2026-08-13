package exercicio1208.Ex11;

public class Main {

    public static void main(String[] args) {

        System.out.println("Foi iniciada a construção do Carro");

        PecaCarro chassi = new PecaCarro("Chassi", 2000);
        PecaCarro motor = new PecaCarro("Motor", 3000);
        PecaCarro rodas = new PecaCarro("Rodas", 1500);
        PecaCarro carroceria = new PecaCarro("Carroceria", 2500);
        PecaCarro pintura = new PecaCarro("Pintura", 1800);

        chassi.start();
        motor.start();
        rodas.start();
        carroceria.start();
        pintura.start();

        try {
            chassi.join();
            motor.join();
            rodas.join();
            carroceria.join();
            pintura.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nA construção do carro foi finalizada!");
    }
}