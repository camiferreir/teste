package combinacao4;

public class Veiculo {

    protected int velocidadeMaxima;

    public Veiculo(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void descrever() {
        System.out.println("Velocidade máxima: " + velocidadeMaxima + " km/h");
    }

    public void descrever(String descricao) {
        System.out.println(descricao + " - Velocidade máxima: " + velocidadeMaxima + " km/h");
    }
}
