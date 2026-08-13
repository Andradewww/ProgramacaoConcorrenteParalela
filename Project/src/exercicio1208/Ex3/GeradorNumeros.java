package exercicio1208.Ex3;

public class GeradorNumeros extends Thread {

    private int x; //quantidade
    private int a; //inicio
    private int b; //fim

    public GeradorNumeros(int x, int a, int b) {
        this.x = x;
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println("--- " + x + " números gerados entre " + a + " e " + b + ":");

        for (int i = 0; i < x; i++) {
            int numero = a + (int)(Math.random() * (b - a + 1));
            System.out.println("Número " + (i + 1) + ": " + numero);
        }
    }
}