package Aula0209.Exercicios.Estacionamento;
import java.util.ArrayList;
import java.util.List;

public class Cancela {
	
    private double totalArrecadado = 0.0;
    private final List<Integer> ordemSaida = new ArrayList<>();

    
    public synchronized void processarSaida(Veiculo veiculo) {
        System.out.println("  -> Veículo " + veiculo.getId() + " entrou na cancela.");
        System.out.println("  -> Veículo " + veiculo.getId() + " efetuou o pagamento de R$ " + String.format("%.2f", veiculo.getValorPagamento()));
        
        totalArrecadado += veiculo.getValorPagamento();
        ordemSaida.add(veiculo.getId());
        
        System.out.println("  -> Veículo " + veiculo.getId() + " saiu da cancela.");
        
         
         //O bloco/método synchronized libera o monitor (lock) automaticamente ao 
         //final da execução, MESMO que uma exceção não verificada (RuntimeException) ocorra no meio do processo.
         
    }

    public double getTotalArrecadado() { return totalArrecadado; }
    public List<Integer> getOrdemSaida() { return ordemSaida; }
}