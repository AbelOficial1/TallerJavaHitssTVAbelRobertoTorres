package mamiferos;

public class Main {
        public static void main(String[] args) {
                Mamifero[] mamiferos = new Mamifero[6];

                mamiferos[0] = new Leon("Sabana Africana", 1.2f, 2.5f, 190f, "Panthera leo",
                                10f, 80, 15, 114.0f);

                mamiferos[1] = new Tigre("Selva India", 1.1f, 2.8f, 220f, "Panthera tigris",
                                12f, 65, "Bengala");

                mamiferos[2] = new Guepardo("África", 0.9f, 1.5f, 72f, "Acinonyx jubatus",
                                7f, 110);

                mamiferos[3] = new Lobo("Bosques de América", 0.8f, 1.3f, 50f, "Canis lupus",
                                "Gris", 4.5f, 8, "Mexicano");

                mamiferos[4] = new Perro("Sabana Africana", 0.75f, 1.1f, 30f, "Lycaon pictus",
                                "Moteado", 3.5f, 317);

                mamiferos[5] = new Leon("Sabana Africana", 1.3f, 2.6f, 200f, "Panthera leo",
                                11f, 82, 12, 116.5f);

                for (Mamifero animal : mamiferos) {
                        System.out.println("---- " + animal.getNombreCientifico() + " ----");
                        System.out.println(animal.comer());
                        System.out.println(animal.dormir());
                        System.out.println(animal.correr());
                        System.out.println(animal.comunicarse());
                        System.out.println();
                }
        }
}