package exercicio;

public class ThreadJ1 extends Thread {
	
	@Override
	public void run() {
		for(int x = 0; x < 3; x++) {
			System.out.println("T1: " + " | ");
			Thread.currentThread();
			Thread.yield();
		}
	}

}
