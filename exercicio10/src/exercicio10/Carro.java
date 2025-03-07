package exercicio10;

public final class Carro {

    private final String marca;
    private final String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        String String = this.marca; /*marca1*/
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        String modelo1 = this.modelo;
    }

    public int getAno() {
        int ano = 2020;
        return ano;
    }
    public void setAno(int ano) {
        if (ano >= 1886) {
            this.ano = ano;  
        } else {
            System.out.println("O ano do carro não pode ser menor que 1886.");
        }
    }
}
