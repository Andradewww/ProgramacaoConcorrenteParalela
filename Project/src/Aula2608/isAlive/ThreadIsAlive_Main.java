package Aula2608.isAlive;

public class ThreadIsAlive_Main extends Thread {

	public static void main(String[] args) {
		ThreadIsAlive ta = new ThreadIsAlive();
		ta.start();
		while(ta.isAlive()) {
			System.out.println("Thread Ativa");
			try {
				Thread.sleep(100);
				
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread Inativa.");
	}
	
}
