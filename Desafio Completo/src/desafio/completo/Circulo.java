package desafio.completo;

class Circulo extends Forma {

    private double raio;

    public Circulo(String cor) {
        super(cor);
    }

    public void definirDimensoes(int raio) {
        this.raio = raio;
    }

    public void definirDimensoes(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
