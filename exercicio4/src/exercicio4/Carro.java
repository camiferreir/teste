package exercicio4;

public class Carro extends Veiculo {

    // Construtor que chama o construtor da classe base Veiculo
    public Carro(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    // Método para exibir a velocidade máxima
    public void exibirVelocidadeMaxima() {
        int velocidadeMaxima = 110;
        System.out.println("A velocidade máxima do carro é: " + velocidadeMaxima + " km/h");
    }
}
