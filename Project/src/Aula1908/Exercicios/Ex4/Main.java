package Aula1908.Exercicios.Ex4;

public class Main {

	public static void main(String[] args) {
		
		ContadorAlta alta = new ContadorAlta();
		ContadorBaixa baixa = new ContadorBaixa();
		
		System.out.println("Inciando Threads...");
		
		baixa.start();
		alta.start();
		
		try {
			alta.join();
			baixa.join();
		
		} catch (InterruptedException e) {
			System.exit(0);
		}
		
		System.out.println("Main finalizado.");

	}

}
