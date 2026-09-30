public class Gato extends Animal {
    public Gato(String nombnre, int age, String color){
        super(nombnre, age, color);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Maullando...");
    }
}
