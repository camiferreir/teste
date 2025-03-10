package desafio.completo;

    abstract class Forma {
    protected String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    public abstract double calcularArea();
}

