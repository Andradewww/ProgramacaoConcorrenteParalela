package Aula0209.Exercicios.Festa;

public class Festa {
	
	public static void main(String[] args) {
		
		Banheiro banheiro = new Banheiro();
		
		Convidado convidado1 = new Convidado("João", banheiro);
		Convidado convidado2 = new Convidado("Maria", banheiro);
		Convidado convidado3 = new Convidado("Francisco", banheiro);
		Convidado convidado4 = new Convidado("Chico Bento", banheiro);
		Convidado convidado5 = new Convidado("Mauricio de souza", banheiro);
		
		convidado1.start();
		convidado2.start();
		convidado3.start();
		convidado4.start();
		convidado5.start();
		
		try {
			convidado1.join();
			convidado2.join();
			convidado3.join();
			convidado4.join();
			convidado5.join();
		} catch (InterruptedException e){
			Thread.currentThread().interrupt();
		}
		
		System.out.println("Todos os Convidados já foram ao banheiro.");
		System.out.println("Festa encerrada!");
	}

	
	//Na atividade para proxima aula utilizar o Lock
}
