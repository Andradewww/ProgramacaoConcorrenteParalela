package exercicio1208.Ex8;
import java.util.Random;

public class GeradorPlacas extends Thread {

    private int quantidade;
    private Random gerador;

    public GeradorPlacas(int quantidade) {
        //se o valor recebido for negativo, considera 0
        this.quantidade = Math.max(quantidade, 0);
        this.gerador = new Random();
    }

    private char gerarLetra() {
        //A - Z
        return (char) ('A' + gerador.nextInt(26));
    }

    private int gerarNumero() {
        //0 a 9
        return gerador.nextInt(10);
    }

    @Override
    public void run() {
        System.out.println("Placas no padrão Mercosul:");

        for (int i = 0; i < quantidade; i++) {
            StringBuilder placa = new StringBuilder();

            placa.append(gerarLetra());
            placa.append(gerarLetra());
            placa.append(gerarLetra());
            placa.append(gerarNumero());
            placa.append(gerarLetra());
            placa.append(gerarNumero());
            placa.append(gerarNumero());

            System.out.println("Placa " + (i + 1) + ": " + placa);
        }
    }
}