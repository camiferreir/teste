package combinacao4;

class Moto extends Veiculo {

    private final int cilindradas;

    public Moto(int velocidadeMaxima, int cilindradas) {
        super(velocidadeMaxima);
        this.cilindradas = cilindradas;
    }

    @Override
    public void descrever() {
        System.out.println("Moto com " + cilindradas + "cc e velocidade máxima de " + velocidadeMaxima + " km/h");
    }
}
