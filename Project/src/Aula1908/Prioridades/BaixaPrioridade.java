package Aula1908.Prioridades;

public class BaixaPrioridade extends Thread {

	public void run() {
		setPriority(1);
		for(int x = 0; x > 10; x++) {
			System.out.println("Baixa prioridade... ");
			try {
				sleep(100);
			} catch (InterruptedException e) {
				System.exit(0);
			}
		}
	}
	
}
