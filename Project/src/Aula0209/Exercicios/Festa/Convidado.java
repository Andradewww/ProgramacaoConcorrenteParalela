package Aula0209.Exercicios.Festa;

import java.util.Random;

public class Convidado extends Thread {
	
	private String nome;
	private boolean jaFoiBanheiro;
	private Banheiro banheiro;
	
	public Convidado(String nome, Banheiro banheiro) {
		this.nome = nome;
		this.banheiro = banheiro;
		this.jaFoiBanheiro = false;
	}
	
	@Override
	public void run() {
		
		Random random = new Random();
		
		System.out.println(nome + " está na festa...");
		
		try {
			//tempo até precisar usar o banheiro
			Thread.sleep(random.nextInt(3000) + 2000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return;
		}
		
		banheiro.usarBanheiro(this);
		
		jaFoiBanheiro = true;
	}
	
	public String getNome() {
		return nome;
	}
	
	 public boolean isJaFoiBanheiro() {
    	return jaFoiBanheiro;
	 }
}
