package exercicio005;

public class Exercicio005 {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345", "João da Silva");
        conta.exibirInformacoes();
        conta.depositar(500.00);
        conta.sacar(200.00);
        conta.sacar(1000.00);
        conta.exibirInformacoes();
    }

}
