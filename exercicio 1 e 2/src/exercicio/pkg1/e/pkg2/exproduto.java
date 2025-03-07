
package exercicio.pkg1.e.pkg2;


public class exproduto {
    private double preco;

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Erro: O preco nao pode ser negativo!");
        } else {
            this.preco = preco;
        }
    }

}

