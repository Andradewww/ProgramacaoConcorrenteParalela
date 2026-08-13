package exercicio1208.Ex11;

public class PecaCarro extends Thread {

    private String nome;
    private int tempo;

    public PecaCarro(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        System.out.println("Construindo a peça: " + nome);

        try {
            //simula o tempo de construção da peça
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("A peça " + nome + " foi finalizada.");
    }
}