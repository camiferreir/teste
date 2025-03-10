package desafio.completo;

class Retangulo extends Forma {

    private double largura;
    private double altura;

    public Retangulo(String cor) {
        super(cor);
    }

    public void definirDimensoes(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
