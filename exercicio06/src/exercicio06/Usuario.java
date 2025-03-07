package exercicio06;

public class Usuario {

    private final String login;
    private final String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean autenticar(String login, String senha) {

        return this.login.equals(login) && this.senha.equals(senha);
    }
}
