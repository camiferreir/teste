package exercicio03;

public class Produto {

    private final String nome;
    private final double preco;
    private int quantidade;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void aumentarQuantidade(int quantidadeAdicional) {
        if (quantidadeAdicional > 0) {
            quantidade += quantidadeAdicional;
        } else {
            System.out.println("Quantidade adicional deve ser maior que zero.");
        }
    }

    public void diminuirQuantidade(int quantidadeReduzida) {
        if (quantidadeReduzida > 0 && quantidadeReduzida <= quantidade) {
            quantidade -= quantidadeReduzida;
        } else {
            System.out.println("Quantidade a diminuir inválida.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

}
