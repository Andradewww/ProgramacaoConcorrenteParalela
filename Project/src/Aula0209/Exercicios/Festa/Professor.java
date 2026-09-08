/*package Aula0209.Exercicios.Festa;

import java.util.concurrent.locks.Lock;

public class Professor {
	
	private Lock lock = new ReentrantLock();
	
	public void fazNumero1() {
		
		String nome = Thread.currentThread().getName();
		lock.lock();
		 System.out.println(nome + " entrando no banheiro");
		 System.out.println(nome + " iniciando atividade rapida");
		 
		 try {
			 Thread.sleep(3000);
		 } catch(InterruptedException e) {
			 e.printStackTrace();
		 }
		 
		 System.out.println(nome + " terminou atividade rapida");
		 System.out.println(nome + " dando descarga");
		 System.out.println(nome + " lavou a mão");
		 System.out.println(nome + " saiu do banheiro");
		lock.unlock();
	}
	
	public void fazNumero2() {
			
		String nome = Thread.currentThread().getName();
		lock.lock();
		 System.out.println(nome + " entrando no banheiro");
		 System.out.println(nome + " iniciando atividade demorada");
		 
		 try {
			 Thread.sleep(6000);
		 } catch(InterruptedException e) {
			 e.printStackTrace();
		 }
		 
		 System.out.println(nome + " terminou atividade demorada");
		 System.out.println(nome + " dando descarga");
		 System.out.println(nome + " lavou a mão");
		 System.out.println(nome + " saiu do banheiro");
		lock.unlock();
	}
	
}*/
