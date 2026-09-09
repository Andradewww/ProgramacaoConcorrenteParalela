package Aula0209.Exercicios.Estacionamento;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CancelaLock {
    
    private double totalArrecadado = 0.0;
    private final List<Integer> ordemSaida = new ArrayList<>();
    
    //declaração Lock
    private final Lock lock = new ReentrantLock();

    public void processarSaida(Veiculo veiculo) {
        //adquire bloqueio explicitamente
        lock.lock();
        
        try {
            
            System.out.println("  -> Veículo " + veiculo.getId() + " entrou na cancela.");
            System.out.println("  -> Veículo " + veiculo.getId() + " efetuou o pagamento de R$ " + String.format("%.2f", veiculo.getValorPagamento()));
            
            totalArrecadado += veiculo.getValorPagamento();
            ordemSaida.add(veiculo.getId());
            
            System.out.println("  -> Veículo " + veiculo.getId() + " saiu da cancela.");
            
        } finally {
            /* 
             * garantir a liberação do bloqueio mesmo quando ocorrer uma exceção.
             * 
             * diferente do 'synchronized', o Lock NÃO libera automaticamente. 
             * 
             * O bloco 'finally' garante que o lock.unlock() será executado MESMO que uma 
             * exceção ocorra dentro do bloco 'try', evitando que o sistema trave eternamente (deadlock).
             */
        	
            lock.unlock();
        }
    }

    public double getTotalArrecadado() { return totalArrecadado; }
    public List<Integer> getOrdemSaida() { return ordemSaida; }
}