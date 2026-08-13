package exercicio1208.Ex3;

public class Main {

    public static void main(String[] args) {

        int X = 10; //quantidade
        int A = 1;  //inicio
        int B = 50; //fim

        GeradorNumeros threadGeradora = new GeradorNumeros(X, A, B);
        threadGeradora.start();
    }
}