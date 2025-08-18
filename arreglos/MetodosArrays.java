package arreglos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MetodosArrays {
    public static void main(String[] args) {
        final int N = 10;
        int[] edades = { 34, 32, 16, 65, 45, 31, 25, 20, 10, 50 };
        int[] precios = new int[N];
        int valores;

        for (int edad : edades) {
            System.out.println("edad: " + edad);
        }

        // Convertit un array a String
        System.out.println(Arrays.toString(edades));

        // Busqueda binaria en forma desordenada
        System.out.println("Indice: " + Arrays.binarySearch(edades, 34));

        // ordenamiento de un array
        Arrays.sort(edades);
        System.out.println(Arrays.toString(edades));

        // Busqueda binaria en forma ordenada
        System.out.println("Indice: " + Arrays.binarySearch(edades, 34));

        // Rellenar con un mismos valor el arreglo
        System.out.println("Antes de usar fill");
        for (int precio : precios) {
            System.out.println(precio);
        }
        System.out.println("Despues de usar fill");
        Arrays.fill(precios, 10);
        for (int precio : precios) {

            System.out.println(precio);
        }

        Arrays.fill(precios, 0, 5, 5);
        System.out.println("Fill con rango");
        for (int precio : precios) {
            System.out.println(precio);
        }
    }
}
