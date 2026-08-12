package exercicio;

public class MainImprimir {

	public static void main(String[] args) {
		new Thread(new Imprimir("A")).start();
		new Thread(new Imprimir("B")).start();
	}
	
}
