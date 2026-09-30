public class Main {
    public static void main(String[] args) {



        Animal perro = new Perro("Firulais", 2, "caramelo");
        System.out.println(perro.getName());
        System.out.println(perro.getAge());
        System.out.println(perro.getColor());
        perro.hacerSonido();


        System.out.println();

        Gato gato = new Gato("Golum", 14, "naranja");
        System.out.println(gato.getName());
        System.out.println(gato.getAge());
        System.out.println(gato.getColor());
        gato.hacerSonido();




    }

}
