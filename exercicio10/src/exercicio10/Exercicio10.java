package exercicio10;

public class Exercicio10 {

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Nissan", "kicks", 2020);

        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());

        meuCarro.setAno(1800);
        System.out.println("Ano após tentativa de alteração inválida: " + meuCarro.getAno());
    }
}
