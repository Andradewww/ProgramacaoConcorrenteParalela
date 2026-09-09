package Aula0209.Exercicios.Estacionamento;

public class MainLock {

    public static void main(String[] args) {
        System.out.println("=== INICIANDO SIMULAÇÃO (VERSÃO LOCK) ===\n");
        
        CancelaLock cancela = new CancelaLock();
        int totalVeiculos = 10;
        Thread[] threads = new Thread[totalVeiculos];

        //cria e inicia os veículos (threads)
        for (int i = 1; i <= totalVeiculos; i++) {
            Veiculo v = new Veiculo(i);
            threads[i - 1] = new Thread(new TarefaVeiculoLock(v, cancela), "Veiculo-" + i);
            threads[i - 1].start();
        }

        //aguarda todos os veículos terminarem com join()
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        //relatório
        System.out.println("\n--- RESULTADO FINAL (LOCK) ---");
        System.out.println("Ordem de saída: " + cancela.getOrdemSaida());
        System.out.println("Total arrecadado: R$ " + String.format("%.2f", cancela.getTotalArrecadado()));
        
        /* 
         * EXPLICAÇÃO SOBRE A VARIAÇÃO DA ORDEM:
         * 
         * A ordem de atendimento varia entre as execuções porque o escalonador de threads 
         * do SO decide qual thread acordará primeiro ao tentar adquirir o bloqueio. 
         * 
         * Mesmo que o tempo de permanência seja aleatório, vários veículos 
         * podem acordar e chegar à fila em momentos muito próximos.
         *  
         * O ReentrantLock padrão é "não justo" (non-fair), ou seja, o Java não garante 
         * uma ordem específica (FIFO) para threads em espera. A ordem depende da 
         * implementação da JVM e do escalonamento do SO no momento da execução.
         */
    }
}