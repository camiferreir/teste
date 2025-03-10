package desafio.completo;

public class DesafioCompleto {

    public static void main(String[] args) {
     Circulo c = new Circulo("Vermelho");
        String cor = "vermelho";
        System.out.println("Cor: " + cor);
        c.definirDimensoes(5);
        System.out.println("Área do círculo: " + c.calcularArea());

        Retangulo r = new Retangulo("ermelho");
        System.out.println("Cor: " + cor);
        r.definirDimensoes(4, 6);
        System.out.println("Área do retângulo: " + r.calcularArea());
    }
}

