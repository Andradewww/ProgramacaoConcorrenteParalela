package Aula0209.Exercicios.Estacionamento;

public class TarefaVeiculoLock implements Runnable {
    
    private final Veiculo veiculo;
    private final CancelaLock cancela;

    public TarefaVeiculoLock(Veiculo veiculo, CancelaLock cancela) {
        this.veiculo = veiculo;
        this.cancela = cancela;
    }

    @Override
    public void run() {
        try {
            //simula o tempo que o veículo ficou estacionado antes de sair
            Thread.sleep(veiculo.getTempoPermanenciaMs());
            
            //chegar na fila acontece fora da região crítica
            System.out.println("Veículo " + veiculo.getId() + " chegou à fila da cancela.");

            //entra na região crítica protegida pelo Lock
            cancela.processarSaida(veiculo);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Veículo " + veiculo.getId() + " foi interrompido.");
        }
    }
}