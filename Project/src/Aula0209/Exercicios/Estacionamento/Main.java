package Aula0209.Exercicios.Estacionamento;

public class Main {

    public static void main(String[] args) {
    	
        System.out.println("=== INICIANDO SIMULAÇÃO (VERSÃO SYNCHRONIZED) ===\n");
        
        Cancela cancela = new Cancela();
        int totalVeiculos = 10;
        Thread[] threads = new Thread[totalVeiculos];

        //criar os veiculos (threads)
        for (int i = 1; i <= totalVeiculos; i++) {
            Veiculo v = new Veiculo(i);
            threads[i - 1] = new Thread(new TarefaVeiculo(v, cancela), "Veiculo-" + i);
            threads[i - 1].start();
        }

        //aguardar todos os veiculos terminarem com sleep
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        //relatório final
        System.out.println("\n--- RESULTADO FINAL (SYNCHRONIZED) ---");
        System.out.println("Ordem de saída: " + cancela.getOrdemSaida());
        System.out.println("Total arrecadado: R$ " + String.format("%.2f", cancela.getTotalArrecadado()));
        
        /* 
         * EXPLICAÇÃO SOBRE A VARIAÇÃO DA ORDEM:
         * 
         * A ordem de atendimento varia entre as execuções porque o escalonador de threads 
         * do SO decide qual thread acordará primeiro ao tentar adquirir o bloqueio (monitor). 
         * 
         * Mesmo que o tempo de permanência seja aleatório, vários 
         * veículos podem acordar e chegar à fila em momentos muito próximos. 
         * 
         * O Java não garante uma ordem específica (FIFO) para threads esperando por um 
         * monitor synchronize. A ordem depende da implementação da JVM e do escalonamento do SO no momento exato da execução.
         */
    }
}