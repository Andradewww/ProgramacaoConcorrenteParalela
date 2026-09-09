package Aula0909.ExercicioSemaphore;

public class Main {
	public static void main(String[] args) {
		
		Estacionamento estacionamento = new Estacionamento(5); //param quantidade de vagas

		System.out.println("Estacionamento Nardelli");

		for (int i = 1; i <= 15; i++) {
			final int numeroCarro = i;
			Carro carro = new Carro(numeroCarro, estacionamento);
			carro.start();
		}
	}
}