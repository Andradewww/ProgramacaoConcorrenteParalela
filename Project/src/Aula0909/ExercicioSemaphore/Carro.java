package Aula0909.ExercicioSemaphore;

public class Carro extends Thread {
	private int numeroCarro;
	private Estacionamento estacionamento;

	public Carro(int numeroCarro, Estacionamento estacionamento) {
		this.numeroCarro = numeroCarro;
		this.estacionamento = estacionamento;
	}

	@Override
	public void run() {
		try {
			int intervaloChegada = (int) (Math.random() * 3000);
			Thread.sleep(intervaloChegada);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		estacionamento.entrar(numeroCarro);
	}

	public int getNumeroCarro() {
		return numeroCarro;
	}
}