public class Perro extends Animal {
    public Perro(String name, int age, String color){
        super(name, age, color);
    }



    @Override
    public void hacerSonido() {
        System.out.println("Ladrando...");
    }




}
