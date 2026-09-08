package Aula0209.Exercicios.Festa;

import java.util.Random;

public class Banheiro {

	public synchronized void usarBanheiro(Convidado convidado) {
		
		Random random = new Random();
		
		String nome = convidado.getNome();
		
		System.out.println(nome + " entrou no banheiro.");
		
		//atividade realizada gerada aleatoriamente
		int atividade = random.nextInt(2);
		
		if(atividade == 0) {
			
			System.out.println("Iniciando atividade rápida...");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				return;
			}
			
			System.out.println(nome + " terminando atividade rápida.");
		}
		else
		{
			System.out.println(nome + " iniciando atividade demorada...");
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return;
		}
		
		System.out.println(nome + " terminando atividade demorada.");
		}
	
		System.out.println(nome + " dando descarga.");
		System.out.println(nome + " lavando as mãos.");
		System.out.println(nome + " secando as mãos.");
		System.out.println(nome + " saiu do banheiro.");
		
		
	}
}
