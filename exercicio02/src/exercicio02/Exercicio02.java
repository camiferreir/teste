package exercicio02;

public class Exercicio02 {

    public static void main(String[] args) {
        Livro meuLivro = new Livro("Verity", "Colleen Hoover", 2020, "Suspense");
        meuLivro.exibirInformacoes();
        if (meuLivro.pertenceAoGenero("Suspense")) {
            System.out.println("O livro pertence ao gênero Suspense.");
        } else {
            System.out.println("O livro não pertence ao gênero Suspense.");
        }
    }
}


