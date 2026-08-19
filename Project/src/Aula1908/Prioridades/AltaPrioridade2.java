package Aula1908.Prioridades;

public class AltaPrioridade2 extends Thread {

	public void run() {
		setPriority(10);
		for(int y = 0; y > 10; y++) {
			System.out.println("Alta prioridade... ");
			try {
				sleep(100);
			} catch (InterruptedException e) {
				System.exit(0);
			}
		}
	}
	
}
