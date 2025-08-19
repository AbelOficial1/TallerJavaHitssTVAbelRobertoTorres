package arreglos;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        // Clase Math
        // Numero aleatorios
        // double numero = Math.random() * 100; //numeros entre 0 - 9
        // double numero = (int) (Math.random() * 100);
        for (int i = 0; i < 10; i++) {
            int numero = (int) (Math.random() * 100) + 1;
            System.out.println(numero);
        }
        // Clase Random
        System.out.println("Numeros aleatorios con la clase random");
        Random aleatorio = new Random();
        for (int i = 0; i < 10; i++) {
            int num = aleatorio.nextInt(100) + 1;
            System.out.println(num);
        }
        // int num = aleatorio.nextInt();
        // System.out.println(num);
        double numDecimal = aleatorio.nextDouble();
        System.out.println(numDecimal);
        boolean booleano = aleatorio.nextBoolean();
        System.out.println(booleano);
    }
}
