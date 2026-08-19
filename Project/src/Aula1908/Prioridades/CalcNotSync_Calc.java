package Aula1908.Prioridades;

public class CalcNotSync_Calc {
	
	private int soma;
	public synchronized int somaVet(int[] vet) {
		soma = 0;
		for(int x = 0; x < vet.length; x++) {
			soma += vet[x];
			System.out.println(Thread.currentThread().getName() + " - somando " + vet[x] + " - total = " + soma);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		return soma;
	}

}
