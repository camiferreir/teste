package override3;


public class Override3 {

    
    public static void main(String[] args) {
       Animal[] animais = {new Cachorro(), new Gato()};
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
