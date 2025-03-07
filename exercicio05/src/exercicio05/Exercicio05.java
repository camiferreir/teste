package exercicio05;

public class Exercicio05 {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Cami", 2500.00);

        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário: R$" + funcionario1.getSalario());
    }
}
