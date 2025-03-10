package sobrecarga2;

public class Sobrecarga2 {

    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Multiplicação de dois inteiros: " + calc.multiplicar(2, 3));
        System.out.println("Multiplicação de três inteiros: " + calc.multiplicar(2, 3, 4));
        System.out.println("Multiplicação de dois doubles: " + calc.multiplicar(2.5, 3.5));
    }
}
