package combinacao4;

public class Combinacao4 {

    public static void main(String[] args) {
        Veiculo carro = new Veiculo(180);
        carro.descrever();
        carro.descrever("Carro esportivo");

        Moto moto = new Moto(220, 600);
        moto.descrever();
    }
}