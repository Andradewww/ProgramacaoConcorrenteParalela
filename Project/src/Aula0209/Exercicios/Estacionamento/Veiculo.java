package Aula0209.Exercicios.Estacionamento;
import java.util.concurrent.ThreadLocalRandom;

public class Veiculo {
	
    private final int id;
    private final long tempoPermanenciaMs;
    private final double valorPagamento;

    public Veiculo(int id) {
        this.id = id;
        //tempo aleatório entre 1 e 5 segundos
        this.tempoPermanenciaMs = ThreadLocalRandom.current().nextLong(1000, 5001);
        //valor calculado: R$ 0,01 por milissegundo (2000ms = R$ 20,00)
        this.valorPagamento = this.tempoPermanenciaMs * 0.01;
    }

    public int getId() { return id; }
    public long getTempoPermanenciaMs() { return tempoPermanenciaMs; }
    public double getValorPagamento() { return valorPagamento; }
}