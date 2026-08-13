package exercicio1208.Ex8;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int X = entrada.nextInt();

        GeradorPlacas threadGeradora = new GeradorPlacas(X);
        threadGeradora.start();

        entrada.close();
    }
}