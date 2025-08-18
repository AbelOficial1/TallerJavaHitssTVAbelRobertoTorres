package arreglos;

import java.util.Scanner;

public class MostrarDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Ingresa 10 numeros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("========Resultado:=========");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[numeros.length - 1 - i]);
            System.out.println(numeros[i]);
        }
    }
}
