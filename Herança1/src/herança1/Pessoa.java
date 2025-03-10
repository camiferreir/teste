package herança1;

public class Pessoa {
    protected String nome;
    private final int idade;
    String matricula;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.matricula= matricula;
    }
    
    
    public int getIdade() {
        return idade;
    }
    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matricula: " + matricula);
    }
}