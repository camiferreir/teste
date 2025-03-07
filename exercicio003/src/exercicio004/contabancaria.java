
package exercicio004;

public class contabancaria {
    public void depositar(double valor) {
        double saldo = 0;
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
        }
    }
}

   
