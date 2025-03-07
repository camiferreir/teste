
package exercicio004;


public class Exercicio004 {

    public static void main(String[] args) {
        Conta conta = new Conta("Camille",2500.0);
        System.out.println("Saldo inicial de " + conta.titular + ": R$ " + conta.getSaldo());
        conta.depositar(600.0);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
        conta.sacar(200.0);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
        conta.sacar(2500.0);
        conta.sacar(120.0);
    }
}

  
