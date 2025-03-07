package exercicio07;

public class Aluno {

    Aluno(int i) {
       
    }

    void exibirIdade() {
      
    }

    void definirIdade(int i) {
      
    }

    class Aluno extends Pessoa {

        public Aluno(int idade) {
            super(idade);
        }

       
        public void definirIdade(int idade) {
            this.idade = idade;
        }

        public void exibirIdade() {
            System.out.println("A idade do aluno é: " + idade + " anos.");
        }
    }
}
