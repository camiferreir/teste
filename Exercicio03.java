package exercicio03;

public class Exercicio03 {

    public static void main(String[] args) {
        Produto produto = new Produto("Smartphone", 1500.00);
        produto.exibirInformacoes();
        produto.aumentarQuantidade(10);
        System.out.println("Após aumentar a quantidade:");
        produto.exibirInformacoes();

        produto.diminuirQuantidade(5);
        System.out.println("Após diminuir a quantidade:");
        produto.exibirInformacoes();
    }

}
