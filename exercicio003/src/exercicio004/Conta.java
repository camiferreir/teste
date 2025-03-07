package exercicio004;

public class Conta {

    private final double saldo;
    final String titular;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Saldo inicial não pode ser negativo. A conta foi criada com saldo");
        }
    }

    double getSaldo() {
        return this.saldo;

    }

    void depositar(double i) {

    }

    void sacar(double i) {
    }

}
