package arreglos;

import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[10];
        int[] conteo = new int[10];

        System.out.println("Ingrese 10 numeros enteros en el rango de 1 a 9:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int num = sc.nextInt();

            if (num < 1 || num > 9) {
                System.out.println("El numero debe estar entre 1 y 9.");
                System.exit(-1);
            }

            arreglo[i] = num;
            conteo[num]++;
        }

        int maxOcurrencias = 0;
        int numeroMasRepetido = -1;

        for (int i = 1; i <= 9; i++) {
            if (conteo[i] > maxOcurrencias) {
                maxOcurrencias = conteo[i];
                numeroMasRepetido = i;
            }
        }

        System.out.println("1. La mayor ocurrencia es: " + maxOcurrencias);
        System.out.println("2. El elemento que mas se repite es: " + numeroMasRepetido);

    }
}