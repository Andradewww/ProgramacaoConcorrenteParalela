package Aula0909.ExercicioSemaphore;
import java.util.concurrent.Semaphore;

public class Estacionamento {
	
	private final Semaphore semaforo;
	private final int vagasTotais;

	public Estacionamento(int vagasTotais) {
		this.vagasTotais = vagasTotais;
		this.semaforo = new Semaphore(vagasTotais);
	}

	public void entrar(int carro) {
	    try {
	    	
	        synchronized (this) {
	            System.out.println("\nCarro " + carro + " está tentando estacionar...");

	            while (semaforo.availablePermits() == 0) {
	                System.out.println("Carro " + carro + " está aguardando vaga... Vagas disponíveis: " + semaforo.availablePermits());
	                
	                Thread.sleep(1000);
	            }

	            System.out.println("Vagas disponíveis no momento da entrada: " + semaforo.availablePermits());
	        }

	        //adquire a vaga
	        semaforo.acquire();
	        System.out.println("\nCarro " + carro + " estacionou. Vagas disponíveis: " + semaforo.availablePermits());

	        int tempoPermanencia = (int) (Math.random() * 6000) + 2000;
	        Thread.sleep(tempoPermanencia);

	    } catch (InterruptedException e) {
	    	System.out.println("Carro " + carro + " foi interrompido antes de estacionar...");
	        Thread.currentThread().interrupt();
	    } finally {
	        System.out.println("\nCarro " + carro + " saindo..." + " Vagas disponíveis: " + semaforo.availablePermits());
	        semaforo.release();
	        System.out.println("Carro " + carro + " saiu. Vagas disponíveis: " + semaforo.availablePermits());
	    }
	}
}