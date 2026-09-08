package Aula0209.Exercicios.Estacionamento;

public class TarefaVeiculo implements Runnable {
	
    private final Veiculo veiculo;
    private final Cancela cancela;

    public TarefaVeiculo(Veiculo veiculo, Cancela cancela) {
        this.veiculo = veiculo;
        this.cancela = cancela;
    }

    @Override
    public void run() {
        try {
            //simula o tempo que o veículo ficou estacionado antes de sair
            Thread.sleep(veiculo.getTempoPermanenciaMs());
            
            //chegar na fila acontece fora da região crítica (simula a espera real no estacionamento)
            System.out.println("Veículo " + veiculo.getId() + " chegou à fila da cancela.");

            //entra na região crítica protegida
            cancela.processarSaida(veiculo);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Veículo " + veiculo.getId() + " foi interrompido.");
        }
    }
}