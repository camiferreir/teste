package exercicio06;

public class Exercicio06 {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("admin", "1234");

        boolean autenticado = usuario.autenticar("admin", "1234");
        System.out.println("Autenticação bem-sucedida: " + autenticado);

        autenticado = usuario.autenticar("admin", "abcd");
        System.out.println("Autenticação bem-sucedida: " + autenticado);
    }
}
