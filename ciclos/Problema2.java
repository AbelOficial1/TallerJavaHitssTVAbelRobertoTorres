package ciclos;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero de enteros a evaluar (minimo 10): ");
        int cantidad = entrada.nextInt();

        if (cantidad < 10) {
            System.out.print("Debe ingresar al menos 10 numeros");
            System.exit(-1);
        }

        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int numero = entrada.nextInt();

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El numero menor es: " + menor);

        if (menor < 10) {
            System.out.println("El numero menor es menos que 10!");
        } else {
            System.out.println("El numero menor es igual o mayor que 10!");
        }
    }
}
