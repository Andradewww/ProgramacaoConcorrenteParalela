package Aula2608.isAlive;

public class ThreadIsAlive extends Thread {

	public void run() {
		for(int y = 0; y < 10; y++) {
			System.out.println(y);
		try {
			sleep(1000);
		} catch(InterruptedException e) {
			System.exit(0);
		}
	}
}
	
}
