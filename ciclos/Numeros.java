package ciclos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        // Hacer suma de numeros enteros mientras
        // sea cero, e imprimir la suma.
        Scanner sc = new Scanner(System.in);
        int numero, suma = 0, total = 0; // acumulador, contadores

        System.out.print("Numero: ");
        numero = sc.nextInt();
        while (numero != 0) {
            suma += numero;
            total++;
            System.out.print("Numero: ");
            numero = sc.nextInt();

        }
        System.out.println("Suma: " + suma);
        if (total > 0) {
            // utilizando el metodo printf("Formateo", objeto)
            // String.format("Formateo", objeto)
            // DecimalFormat --> numeros
            DecimalFormat df = new DecimalFormat("#,###.00");
            System.out.printf("Promedio: %,.2f\n", suma / (double) total); // total = 7.0
            System.out.println(String.format("Promedio: %,.2f", suma / (double) total)); // total = 7.0
            System.out.println("Promedio: " + df.format(suma / (double) total)); // total = 7.0
        } else {
            System.out.println("No hubo numeros");
        }
        sc.close();
    }
}
